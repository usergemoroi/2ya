#ifndef ADVANCED_BYPASS_H
#define ADVANCED_BYPASS_H

#include <jni.h>

#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT void JNICALL Java_bin_mt_signature_bypass_CloudCertBypass_hookSSLNative(
    JNIEnv* env,
    jclass clazz,
    jstring targetPackage
);

JNIEXPORT void JNICALL Java_bin_mt_signature_bypass_ServerVerificationBypass_hookNetworkNative(
    JNIEnv* env,
    jclass clazz,
    jstring targetPackage
);

JNIEXPORT void JNICALL Java_bin_mt_signature_bypass_PlayIntegrityBypass_hookPlayServicesNative(
    JNIEnv* env,
    jclass clazz,
    jstring targetPackage
);

JNIEXPORT void JNICALL Java_bin_mt_signature_bypass_HardwareAttestationBypass_hookKeystoreNative(
    JNIEnv* env,
    jclass clazz,
    jstring targetPackage
);

#ifdef __cplusplus
}
#endif

#endif // ADVANCED_BYPASS_H
