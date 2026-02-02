/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.intercom.android.sdk.api;

import android.content.Context;
import io.intercom.android.sdk.api.Platform;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0010\u0010\r\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\b\u0010\u000e\u001a\u00020\u000fH\u0002\u001a\b\u0010\u0010\u001a\u00020\u000fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2={"ANDROID_HEADER", "", "CORDOVA_HEADER", "CORDOVA_VERSION", "FLUTTER_HEADER", "NATIVE_SDK", "REACT_NATIVE_HEADER", "REACT_NATIVE_VERSION", "WRAPPER_PREFS", "getPlatform", "Lio/intercom/android/sdk/api/Platform;", "context", "Landroid/content/Context;", "getPlatformIdentifier", "isFlutterApp", "", "isReactNativeApp", "intercom-sdk-base_release"}, k=2, mv={1, 8, 0}, xi=48)
public final class PlatformIdentifierUtilKt {
    @NotNull
    public static final String ANDROID_HEADER = "intercom-android-sdk";
    @NotNull
    public static final String CORDOVA_HEADER = "intercom-sdk-cordova";
    @NotNull
    public static final String CORDOVA_VERSION = "cordova_version";
    @NotNull
    public static final String FLUTTER_HEADER = "intercom-sdk-flutter";
    @NotNull
    public static final String NATIVE_SDK = "intercom-sdk-native";
    @NotNull
    public static final String REACT_NATIVE_HEADER = "intercom-sdk-react-native";
    @NotNull
    public static final String REACT_NATIVE_VERSION = "react_native_version";
    @NotNull
    public static final String WRAPPER_PREFS = "intercomsdk_wrapper_prefs";

    private static final Platform getPlatform(Context object) {
        String string2 = object.getSharedPreferences(WRAPPER_PREFS, 0).getString(CORDOVA_VERSION, "");
        object = PlatformIdentifierUtilKt.isReactNativeApp() ? REACT_NATIVE_HEADER : "";
        String string3 = PlatformIdentifierUtilKt.isFlutterApp() ? FLUTTER_HEADER : "";
        object = !y.e(string2, "") ? Platform.Cordova : (!y.e(object, "") ? Platform.ReactNative : (!y.e(string3, "") ? Platform.Flutter : Platform.Native));
        return object;
    }

    @NotNull
    public static final String getPlatformIdentifier(@NotNull Context context) {
        y.j(context, "context");
        return PlatformIdentifierUtilKt.getPlatform(context).getIdentifier();
    }

    private static final boolean isFlutterApp() {
        boolean bl2;
        try {
            Class.forName("io.maido.intercom.IntercomFlutterPlugin");
            bl2 = true;
        }
        catch (Exception exception) {
            bl2 = false;
        }
        return bl2;
    }

    private static final boolean isReactNativeApp() {
        boolean bl2;
        try {
            Class.forName("com.intercom.reactnative.IntercomModule");
            bl2 = true;
        }
        catch (Exception exception) {
            bl2 = false;
        }
        return bl2;
    }
}

