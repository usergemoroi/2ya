#include "advanced_bypass.h"
#include "xhook.h"
#include <android/log.h>
#include <string.h>
#include <stdlib.h>
#include <dlfcn.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include <unistd.h>
#include <openssl/ssl.h>
#include <openssl/x509.h>

#define LOG_TAG "AdvancedBypass"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

static char* g_target_package = nullptr;

typedef int (*SSL_connect_func_t)(SSL* ssl);
typedef int (*SSL_read_func_t)(SSL* ssl, void* buf, int num);
typedef int (*SSL_write_func_t)(SSL* ssl, const void* buf, int num);
typedef int (*connect_func_t)(int sockfd, const struct sockaddr* addr, socklen_t addrlen);
typedef ssize_t (*send_func_t)(int sockfd, const void* buf, size_t len, int flags);
typedef ssize_t (*recv_func_t)(int sockfd, void* buf, size_t len, int flags);

static SSL_connect_func_t original_SSL_connect = nullptr;
static SSL_read_func_t original_SSL_read = nullptr;
static SSL_write_func_t original_SSL_write = nullptr;
static connect_func_t original_connect = nullptr;
static send_func_t original_send = nullptr;
static recv_func_t original_recv = nullptr;

static int hooked_SSL_connect(SSL* ssl) {
    LOGI("SSL_connect intercepted - bypassing certificate verification");
    
    if (ssl) {
        SSL_set_verify(ssl, SSL_VERIFY_NONE, nullptr);
    }
    
    if (original_SSL_connect) {
        return original_SSL_connect(ssl);
    }
    
    return -1;
}

static int hooked_SSL_read(SSL* ssl, void* buf, int num) {
    int result = -1;
    
    if (original_SSL_read) {
        result = original_SSL_read(ssl, buf, num);
        
        if (result > 0 && buf) {
            char* data = (char*)buf;
            LOGD("SSL_read intercepted: %d bytes", result);
            
            if (strstr(data, "signature_valid") || 
                strstr(data, "integrity_check") ||
                strstr(data, "tampered")) {
                LOGI("Detected verification response, patching...");
                
                char* ptr = strstr(data, "\"signature_valid\":false");
                if (ptr) {
                    memcpy(ptr + 18, "true ", 5);
                    LOGI("Patched signature_valid to true");
                }
                
                ptr = strstr(data, "\"integrity_check\":\"failed\"");
                if (ptr) {
                    memcpy(ptr + 19, "passed", 6);
                    LOGI("Patched integrity_check to passed");
                }
                
                ptr = strstr(data, "\"tampered\":true");
                if (ptr) {
                    memcpy(ptr + 12, "false", 5);
                    LOGI("Patched tampered to false");
                }
            }
        }
    }
    
    return result;
}

static int hooked_SSL_write(SSL* ssl, const void* buf, int num) {
    if (buf && num > 0) {
        const char* data = (const char*)buf;
        LOGD("SSL_write intercepted: %d bytes", num);
        
        if (strstr(data, "X-Play-Integrity") ||
            strstr(data, "X-SafetyNet") ||
            strstr(data, "X-Device-Attestation")) {
            LOGI("Detected integrity verification request");
        }
    }
    
    if (original_SSL_write) {
        return original_SSL_write(ssl, buf, num);
    }
    
    return -1;
}

static int hooked_connect(int sockfd, const struct sockaddr* addr, socklen_t addrlen) {
    if (addr && addr->sa_family == AF_INET) {
        struct sockaddr_in* addr_in = (struct sockaddr_in*)addr;
        char ip[INET_ADDRSTRLEN];
        inet_ntop(AF_INET, &(addr_in->sin_addr), ip, INET_ADDRSTRLEN);
        
        LOGD("Network connect to: %s:%d", ip, ntohs(addr_in->sin_port));
        
        if (strstr(ip, "googleapis.com") || 
            strstr(ip, "google.com") ||
            strstr(ip, "gstatic.com")) {
            LOGI("Detected Google service connection");
        }
    }
    
    if (original_connect) {
        return original_connect(sockfd, addr, addrlen);
    }
    
    return -1;
}

static ssize_t hooked_send(int sockfd, const void* buf, size_t len, int flags) {
    if (buf && len > 0) {
        const char* data = (const char*)buf;
        
        if (len > 100) {
            LOGD("Network send: %zu bytes", len);
        }
        
        if (strstr(data, "attest") || 
            strstr(data, "integrity") ||
            strstr(data, "safetynet")) {
            LOGI("Detected attestation/integrity check in outgoing data");
        }
    }
    
    if (original_send) {
        return original_send(sockfd, buf, len, flags);
    }
    
    return -1;
}

static ssize_t hooked_recv(int sockfd, void* buf, size_t len, int flags) {
    ssize_t result = -1;
    
    if (original_recv) {
        result = original_recv(sockfd, buf, len, flags);
        
        if (result > 0 && buf) {
            char* data = (char*)buf;
            
            if (result > 100) {
                LOGD("Network recv: %zd bytes", result);
            }
            
            if (strstr(data, "ctsProfileMatch") ||
                strstr(data, "basicIntegrity") ||
                strstr(data, "evaluationType")) {
                LOGI("Detected SafetyNet response, may need patching");
                
                char* ptr = strstr(data, "\"ctsProfileMatch\":false");
                if (ptr) {
                    memcpy(ptr + 19, "true ", 5);
                    LOGI("Patched ctsProfileMatch to true");
                }
                
                ptr = strstr(data, "\"basicIntegrity\":false");
                if (ptr) {
                    memcpy(ptr + 18, "true ", 5);
                    LOGI("Patched basicIntegrity to true");
                }
            }
        }
    }
    
    return result;
}

JNIEXPORT void JNICALL Java_bin_mt_signature_bypass_CloudCertBypass_hookSSLNative(
    JNIEnv* env,
    jclass clazz,
    jstring targetPackage)
{
    if (!targetPackage) {
        LOGE("Invalid target package");
        return;
    }
    
    const char* pkg = env->GetStringUTFChars(targetPackage, nullptr);
    
    if (g_target_package) {
        free(g_target_package);
    }
    g_target_package = strdup(pkg);
    
    LOGI("Hooking SSL functions for package: %s", g_target_package);
    
    xhook_register(".*libssl\\.so$", "SSL_connect", (void*)hooked_SSL_connect, 
                   (void**)&original_SSL_connect);
    xhook_register(".*libssl\\.so$", "SSL_read", (void*)hooked_SSL_read, 
                   (void**)&original_SSL_read);
    xhook_register(".*libssl\\.so$", "SSL_write", (void*)hooked_SSL_write, 
                   (void**)&original_SSL_write);
    
    int result = xhook_refresh(1);
    if (result == 0) {
        LOGI("SSL hooks registered successfully");
    } else {
        LOGE("Failed to register SSL hooks: %d", result);
    }
    
    env->ReleaseStringUTFChars(targetPackage, pkg);
}

JNIEXPORT void JNICALL Java_bin_mt_signature_bypass_ServerVerificationBypass_hookNetworkNative(
    JNIEnv* env,
    jclass clazz,
    jstring targetPackage)
{
    if (!targetPackage) {
        LOGE("Invalid target package");
        return;
    }
    
    const char* pkg = env->GetStringUTFChars(targetPackage, nullptr);
    
    LOGI("Hooking network functions for package: %s", pkg);
    
    xhook_register(".*libc\\.so$", "connect", (void*)hooked_connect, 
                   (void**)&original_connect);
    xhook_register(".*libc\\.so$", "send", (void*)hooked_send, 
                   (void**)&original_send);
    xhook_register(".*libc\\.so$", "recv", (void*)hooked_recv, 
                   (void**)&original_recv);
    
    int result = xhook_refresh(1);
    if (result == 0) {
        LOGI("Network hooks registered successfully");
    } else {
        LOGE("Failed to register network hooks: %d", result);
    }
    
    env->ReleaseStringUTFChars(targetPackage, pkg);
}

JNIEXPORT void JNICALL Java_bin_mt_signature_bypass_PlayIntegrityBypass_hookPlayServicesNative(
    JNIEnv* env,
    jclass clazz,
    jstring targetPackage)
{
    if (!targetPackage) {
        LOGE("Invalid target package");
        return;
    }
    
    const char* pkg = env->GetStringUTFChars(targetPackage, nullptr);
    
    LOGI("Hooking Play Services for package: %s", pkg);
    
    xhook_register(".*libgmscore.*\\.so$", "SSL_connect", (void*)hooked_SSL_connect, 
                   (void**)&original_SSL_connect);
    xhook_register(".*libgmscore.*\\.so$", "send", (void*)hooked_send, 
                   (void**)&original_send);
    xhook_register(".*libgmscore.*\\.so$", "recv", (void*)hooked_recv, 
                   (void**)&original_recv);
    
    int result = xhook_refresh(1);
    if (result == 0) {
        LOGI("Play Services hooks registered successfully");
    } else {
        LOGE("Failed to register Play Services hooks: %d", result);
    }
    
    env->ReleaseStringUTFChars(targetPackage, pkg);
}

JNIEXPORT void JNICALL Java_bin_mt_signature_bypass_HardwareAttestationBypass_hookKeystoreNative(
    JNIEnv* env,
    jclass clazz,
    jstring targetPackage)
{
    if (!targetPackage) {
        LOGE("Invalid target package");
        return;
    }
    
    const char* pkg = env->GetStringUTFChars(targetPackage, nullptr);
    
    LOGI("Hooking Keystore for package: %s", pkg);
    
    xhook_register(".*libkeystore.*\\.so$", "SSL_connect", (void*)hooked_SSL_connect, 
                   (void**)&original_SSL_connect);
    
    int result = xhook_refresh(1);
    if (result == 0) {
        LOGI("Keystore hooks registered successfully");
    } else {
        LOGE("Failed to register Keystore hooks: %d", result);
    }
    
    env->ReleaseStringUTFChars(targetPackage, pkg);
}
