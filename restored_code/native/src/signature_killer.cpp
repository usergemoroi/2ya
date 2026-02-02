#include "signature_killer.h"
#include "xhook.h"
#include <android/log.h>
#include <string.h>
#include <stdlib.h>
#include <fcntl.h>
#include <unistd.h>
#include <dlfcn.h>

#define LOG_TAG "SignatureKiller"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

static char* g_package_name = nullptr;
static char* g_real_apk_path = nullptr;

typedef int (*open_func_t)(const char* pathname, int flags, ...);
typedef int (*open64_func_t)(const char* pathname, int flags, ...);
typedef int (*openat_func_t)(int dirfd, const char* pathname, int flags, ...);
typedef int (*openat64_func_t)(int dirfd, const char* pathname, int flags, ...);

static open_func_t original_open = nullptr;
static open64_func_t original_open64 = nullptr;
static openat_func_t original_openat = nullptr;
static openat64_func_t original_openat64 = nullptr;

static bool is_target_apk_path(const char* path) {
    if (!path || !g_package_name) {
        return false;
    }
    
    if (strstr(path, ".apk") == nullptr) {
        return false;
    }
    
    if (strstr(path, g_package_name) != nullptr) {
        return true;
    }
    
    return false;
}

static int hooked_open(const char* pathname, int flags, ...) {
    mode_t mode = 0;
    if (flags & O_CREAT) {
        va_list args;
        va_start(args, flags);
        mode = va_arg(args, mode_t);
        va_end(args);
    }
    
    if (is_target_apk_path(pathname) && g_real_apk_path) {
        LOGI("Redirecting open() from %s to %s", pathname, g_real_apk_path);
        pathname = g_real_apk_path;
    }
    
    if (original_open) {
        if (flags & O_CREAT) {
            return original_open(pathname, flags, mode);
        } else {
            return original_open(pathname, flags);
        }
    }
    
    return -1;
}

static int hooked_open64(const char* pathname, int flags, ...) {
    mode_t mode = 0;
    if (flags & O_CREAT) {
        va_list args;
        va_start(args, flags);
        mode = va_arg(args, mode_t);
        va_end(args);
    }
    
    if (is_target_apk_path(pathname) && g_real_apk_path) {
        LOGI("Redirecting open64() from %s to %s", pathname, g_real_apk_path);
        pathname = g_real_apk_path;
    }
    
    if (original_open64) {
        if (flags & O_CREAT) {
            return original_open64(pathname, flags, mode);
        } else {
            return original_open64(pathname, flags);
        }
    }
    
    return -1;
}

static int hooked_openat(int dirfd, const char* pathname, int flags, ...) {
    mode_t mode = 0;
    if (flags & O_CREAT) {
        va_list args;
        va_start(args, flags);
        mode = va_arg(args, mode_t);
        va_end(args);
    }
    
    if (is_target_apk_path(pathname) && g_real_apk_path) {
        LOGI("Redirecting openat() from %s to %s", pathname, g_real_apk_path);
        pathname = g_real_apk_path;
    }
    
    if (original_openat) {
        if (flags & O_CREAT) {
            return original_openat(dirfd, pathname, flags, mode);
        } else {
            return original_openat(dirfd, pathname, flags);
        }
    }
    
    return -1;
}

static int hooked_openat64(int dirfd, const char* pathname, int flags, ...) {
    mode_t mode = 0;
    if (flags & O_CREAT) {
        va_list args;
        va_start(args, flags);
        mode = va_arg(args, mode_t);
        va_end(args);
    }
    
    if (is_target_apk_path(pathname) && g_real_apk_path) {
        LOGI("Redirecting openat64() from %s to %s", pathname, g_real_apk_path);
        pathname = g_real_apk_path;
    }
    
    if (original_openat64) {
        if (flags & O_CREAT) {
            return original_openat64(dirfd, pathname, flags, mode);
        } else {
            return original_openat64(dirfd, pathname, flags);
        }
    }
    
    return -1;
}

JNIEXPORT void JNICALL Java_bin_mt_signature_KillerApplication_hookApkPath(
    JNIEnv* env, 
    jclass clazz, 
    jstring packageName, 
    jstring apkPath) 
{
    if (!packageName || !apkPath) {
        LOGE("Invalid parameters: packageName or apkPath is null");
        return;
    }
    
    const char* pkg_name = env->GetStringUTFChars(packageName, nullptr);
    const char* apk_path = env->GetStringUTFChars(apkPath, nullptr);
    
    if (g_package_name) {
        free(g_package_name);
    }
    g_package_name = strdup(pkg_name);
    
    if (g_real_apk_path) {
        free(g_real_apk_path);
    }
    g_real_apk_path = strdup(apk_path);
    
    LOGI("Hooking APK path for package: %s", g_package_name);
    LOGI("Real APK path: %s", g_real_apk_path);
    
    xhook_register(".*\\.so$", "open", (void*)hooked_open, (void**)&original_open);
    xhook_register(".*\\.so$", "open64", (void*)hooked_open64, (void**)&original_open64);
    xhook_register(".*\\.so$", "openat", (void*)hooked_openat, (void**)&original_openat);
    xhook_register(".*\\.so$", "openat64", (void*)hooked_openat64, (void**)&original_openat64);
    
    int result = xhook_refresh(1);
    if (result == 0) {
        LOGI("Hook registered successfully");
    } else {
        LOGE("Failed to register hooks: %d", result);
    }
    
    env->ReleaseStringUTFChars(packageName, pkg_name);
    env->ReleaseStringUTFChars(apkPath, apk_path);
}
