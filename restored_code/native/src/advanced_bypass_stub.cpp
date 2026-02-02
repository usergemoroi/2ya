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

#define LOG_TAG "AdvancedBypass"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

// Stub SSL types (minimal definitions to compile)
typedef struct ssl_st SSL;

static char* g_target_package = nullptr;

typedef int (*connect_func_t)(int sockfd, const struct sockaddr* addr, socklen_t addrlen);
typedef ssize_t (*send_func_t)(int sockfd, const void* buf, size_t len, int flags);
typedef ssize_t (*recv_func_t)(int sockfd, void* buf, size_t len, int flags);

static connect_func_t original_connect = nullptr;
static send_func_t original_send = nullptr;
static recv_func_t original_recv = nullptr;

static int hooked_connect(int sockfd, const struct sockaddr* addr, socklen_t addrlen) {
    if (addr && addr->sa_family == AF_INET) {
        struct sockaddr_in* addr_in = (struct sockaddr_in*)addr;
        char ip[INET_ADDRSTRLEN];
        inet_ntop(AF_INET, &(addr_in->sin_addr), ip, INET_ADDRSTRLEN);
        
        LOGD("Network connect to: %s:%d", ip, ntohs(addr_in->sin_port));
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
            if (result > 100) {
                LOGD("Network recv: %zd bytes", result);
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
    LOGI("SSL hooking requested (stub implementation)");
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
    LOGI("Play Services hooking requested (stub implementation)");
}

JNIEXPORT void JNICALL Java_bin_mt_signature_bypass_HardwareAttestationBypass_hookKeystoreNative(
    JNIEnv* env,
    jclass clazz,
    jstring targetPackage)
{
    LOGI("Keystore hooking requested (stub implementation)");
}
