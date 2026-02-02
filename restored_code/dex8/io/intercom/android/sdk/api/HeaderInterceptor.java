/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Base64
 */
package io.intercom.android.sdk.api;

import android.content.Context;
import android.util.Base64;
import io.intercom.android.sdk.api.UserLocaleUtilKt;
import io.intercom.android.sdk.identity.AppIdentity;
import io.intercom.android.sdk.utilities.commons.DeviceUtils;
import java.io.IOException;
import java.util.Random;
import okhttp3.b0;
import okhttp3.d0;
import okhttp3.w;

class HeaderInterceptor
implements w {
    private static final String ACCEPT_LANGUAGE = "Accept-Language";
    private static final String AUTHORIZATION = "Authorization";
    private static final String CONTENT_TYPE_KEY = "Content-Type";
    private static final String CONTENT_TYPE_VALUE = "application/json";
    private static final String HOST_APP_VERSION_KEY = "X-INTERCOM-HOST-APP-VERSION";
    private static final String IDEMPOTENCY_KEY = "Idempotency-Key";
    private static final String INTERCOM_AGENT = "X-INTERCOM-AGENT";
    private static final String INTERCOM_AGENT_WRAPPER = "X-INTERCOM-AGENT-WRAPPER";
    private static final String SUPPORTED_LANGUAGES_KEY = "X-INTERCOM-SUPPORTED-LANGUAGES";
    private static final String SUPPORTED_LANGUAGE_LIST = "ar,bg,bn,bs,ca,cs,da,de,de-form,el,es,et,fa-IR,fi,fr,hi,he,hr,hu,id,it,ja,ko,lt,lv,mn,ms,nb,nl,pl,pt-PT,pt-BR,ro,ru,sl,sr,sv,sw,th,tr,uk,vi,zh-Hant,zh-Hans";
    private final AppIdentity appIdentity;
    private final String appVersion;
    private final String cordovaVersion;
    private final String flutterVersion;
    private final Random random;
    private final String reactNativeVersion;
    private final String userLocale;
    private final String versionName;

    HeaderInterceptor(String string2, String string3, String string4, String string5, AppIdentity appIdentity, String string6, String string7, Random random) {
        this.cordovaVersion = string2;
        this.reactNativeVersion = string3;
        this.flutterVersion = string4;
        this.versionName = string5;
        this.appIdentity = appIdentity;
        this.userLocale = string6;
        this.appVersion = string7;
        this.random = random;
    }

    public static HeaderInterceptor create(Context context, AppIdentity appIdentity) {
        return new HeaderInterceptor(context.getSharedPreferences("intercomsdk_wrapper_prefs", 0).getString("cordova_version", ""), context.getSharedPreferences("intercomsdk_wrapper_prefs", 0).getString("react_native_version", ""), "", "15.6.3", appIdentity, UserLocaleUtilKt.getUserLocaleString(context), DeviceUtils.getAppVersion(context), new Random());
    }

    private String getBasicAuth() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.appIdentity.appId());
        stringBuilder.append(":");
        stringBuilder.append(this.appIdentity.apiKey());
        String string2 = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append("Basic ");
        stringBuilder.append(Base64.encodeToString((byte[])string2.getBytes(), (int)2));
        return stringBuilder.toString();
    }

    public static void setCordovaVersion(Context context, String string2) {
        context.getSharedPreferences("intercomsdk_wrapper_prefs", 0).edit().putString("cordova_version", string2).apply();
    }

    public static void setReactNativeVersion(Context context, String string2) {
        context.getSharedPreferences("intercomsdk_wrapper_prefs", 0).edit().putString("react_native_version", string2).apply();
    }

    @Override
    public d0 intercept(w.a a14) throws IOException {
        b0.a a15 = a14.request().i().e(CONTENT_TYPE_KEY, CONTENT_TYPE_VALUE).e(AUTHORIZATION, this.getBasicAuth()).e(IDEMPOTENCY_KEY, Long.toHexString(this.random.nextLong()));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("intercom-android-sdk/");
        stringBuilder.append(this.versionName);
        a15 = a15.e(INTERCOM_AGENT, stringBuilder.toString()).e(ACCEPT_LANGUAGE, this.userLocale).e(SUPPORTED_LANGUAGES_KEY, SUPPORTED_LANGUAGE_LIST).e(HOST_APP_VERSION_KEY, this.appVersion);
        if (!this.cordovaVersion.isEmpty()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("intercom-sdk-cordova/");
            stringBuilder.append(this.cordovaVersion);
            a15.e(INTERCOM_AGENT_WRAPPER, stringBuilder.toString());
        }
        if (!this.reactNativeVersion.isEmpty()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("intercom-sdk-react-native/");
            stringBuilder.append(this.reactNativeVersion);
            a15.e(INTERCOM_AGENT_WRAPPER, stringBuilder.toString());
        }
        if (!this.flutterVersion.isEmpty()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("intercom-sdk-flutter/");
            stringBuilder.append(this.flutterVersion);
            a15.e(INTERCOM_AGENT_WRAPPER, stringBuilder.toString());
        }
        return a14.proceed(a15.b());
    }
}

