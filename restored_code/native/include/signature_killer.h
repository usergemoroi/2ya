#ifndef SIGNATURE_KILLER_H
#define SIGNATURE_KILLER_H

#include <jni.h>

#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT void JNICALL Java_bin_mt_signature_KillerApplication_hookApkPath(
    JNIEnv* env, 
    jclass clazz, 
    jstring packageName, 
    jstring apkPath
);

#ifdef __cplusplus
}
#endif

#endif // SIGNATURE_KILLER_H
