/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.location.Location
 *  android.webkit.WebView
 *  androidx.annotation.MainThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.DeferredDeeplinkListener;
import io.appmetrica.analytics.DeferredDeeplinkParametersListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.IReporter;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.H0;
import io.appmetrica.analytics.impl.r1;
import io.appmetrica.analytics.impl.s1;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class AppMetrica {
    public static void activate(@NonNull Context context, @NonNull AppMetricaConfig appMetricaConfig) {
        s1.a.a(context, appMetricaConfig);
    }

    public static void activateReporter(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        s1.a.a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        s1.a.a();
    }

    public static void enableActivityAutoTracking(@NonNull Application application) {
        s1.a.a(application);
    }

    @Nullable
    public static String getDeviceId(@NonNull Context context) {
        return s1.a.b();
    }

    public static int getLibraryApiLevel() {
        return 115;
    }

    @NonNull
    public static String getLibraryVersion() {
        return "7.12.0";
    }

    @NonNull
    public static AppMetricaPlugins getPluginExtension() {
        return H0.a;
    }

    @NonNull
    public static IReporter getReporter(@NonNull Context context, @NonNull String string2) {
        return s1.a.a(context, string2);
    }

    @Nullable
    public static String getUuid(@NonNull Context context) {
        return s1.a.a((Context)context).id;
    }

    @MainThread
    public static void initWebViewReporting(@NonNull WebView webView) {
        s1.a.a(webView);
    }

    public static void pauseSession(@Nullable Activity activity) {
        s1.a.a(activity);
    }

    public static void putAppEnvironmentValue(@NonNull String string2, @Nullable String string3) {
        s1.a.a(string2, string3);
    }

    public static void putErrorEnvironmentValue(@NonNull String string2, @Nullable String string3) {
        s1.a.b(string2, string3);
    }

    public static void registerAnrListener(@NonNull AnrListener anrListener) {
        s1.a.a(anrListener);
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        s1.a.a(adRevenue);
    }

    public static void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map2) {
        s1.a.a(map2);
    }

    public static void reportAppOpen(@NonNull Activity activity) {
        s1.a.b(activity);
    }

    public static void reportAppOpen(@NonNull Intent intent) {
        s1.a.a(intent);
    }

    public static void reportAppOpen(@NonNull String string2) {
        s1.a.a(string2);
    }

    public static void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        s1.a.a(eCommerceEvent);
    }

    public static void reportError(@NonNull String string2, @Nullable String string3) {
        s1.a.a(string2, string3, null);
    }

    public static void reportError(@NonNull String string2, @Nullable String string3, @Nullable Throwable throwable) {
        s1.a.a(string2, string3, throwable);
    }

    public static void reportError(@NonNull String string2, @Nullable Throwable throwable) {
        s1.a.a(string2, throwable);
    }

    public static void reportEvent(@NonNull String string2) {
        s1.a.b(string2);
    }

    public static void reportEvent(@NonNull String string2, @Nullable String string3) {
        s1.a.c(string2, string3);
    }

    public static void reportEvent(@NonNull String string2, @Nullable Map<String, Object> map2) {
        s1.a.a(string2, map2);
    }

    public static void reportExternalAdRevenue(Object ... objectArray) {
        s1.a.b(objectArray);
    }

    public static void reportExternalAttribution(@NonNull ExternalAttribution externalAttribution) {
        s1.a.a(externalAttribution);
    }

    public static void reportReferralUrl(@NonNull String string2) {
        s1.a.d(string2);
    }

    public static void reportRevenue(@NonNull Revenue revenue) {
        s1.a.a(revenue);
    }

    public static void reportUnhandledException(@NonNull Throwable throwable) {
        s1.a.a(throwable);
    }

    public static void reportUserProfile(@NonNull UserProfile userProfile) {
        s1.a.a(userProfile);
    }

    public static void requestDeferredDeeplink(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        s1.a.a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        s1.a.a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        r1 r14 = s1.a;
        List<String> list2 = list;
        if (list.isEmpty()) {
            list2 = Arrays.asList("appmetrica_uuid", "appmetrica_device_id", "appmetrica_device_id_hash");
        }
        r14.a(context, startupParamsCallback, list2);
    }

    public static void resumeSession(@Nullable Activity activity) {
        s1.a.c(activity);
    }

    public static void sendEventsBuffer() {
        s1.a.f();
    }

    public static void setAdvIdentifiersTracking(boolean bl2) {
        s1.a.a(bl2);
    }

    public static void setDataSendingEnabled(boolean bl2) {
        s1.a.b(bl2);
    }

    public static void setLocation(@Nullable Location location) {
        s1.a.a(location);
    }

    public static void setLocationTracking(boolean bl2) {
        s1.a.c(bl2);
    }

    public static void setUserProfileID(@Nullable String string2) {
        s1.a.e(string2);
    }
}

