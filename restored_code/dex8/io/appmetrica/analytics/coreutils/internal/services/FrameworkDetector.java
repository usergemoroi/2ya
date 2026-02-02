/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;

public class FrameworkDetector {
    private static final String a = new FrameworkDetector().detectFramework();

    @VisibleForTesting
    public FrameworkDetector() {
    }

    @NonNull
    public static String framework() {
        return a;
    }

    public static boolean isNative() {
        return "native".equals(a);
    }

    @NonNull
    @VisibleForTesting
    public String detectFramework() {
        String string2 = ReflectionUtils.detectClassExists("com.unity3d.player.UnityPlayer") ? "unity" : (ReflectionUtils.detectClassExists("mono.MonoPackageManager") ? "xamarin" : (ReflectionUtils.detectClassExists("org.apache.cordova.CordovaPlugin") ? "cordova" : (ReflectionUtils.detectClassExists("com.facebook.react.ReactRootView") ? "react" : (ReflectionUtils.detectClassExists("io.flutter.embedding.engine.FlutterEngine") ? "flutter" : "native"))));
        return string2;
    }
}

