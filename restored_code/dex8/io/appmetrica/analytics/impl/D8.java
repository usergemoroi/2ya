/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.impl.Si;
import io.appmetrica.analytics.impl.hd;
import io.appmetrica.analytics.impl.k0;
import io.appmetrica.analytics.impl.ro;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class d8
implements hd {
    public Location a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public boolean g;
    public String h;
    @NonNull
    public List<String> i = new ArrayList<String>();
    public boolean j;
    public Si k;

    public final AppMetricaConfig a(AppMetricaConfig appMetricaConfig) {
        Map<String, Object> map2;
        Map<String, String> map3;
        LinkedHashMap linkedHashMap;
        Map<String, String> map4;
        LinkedHashMap object22;
        if (this.j) {
            return appMetricaConfig;
        }
        AppMetricaConfig.Builder builder = AppMetricaConfig.newConfigBuilder(appMetricaConfig.apiKey);
        builder.withDeviceType(appMetricaConfig.deviceType);
        builder.withPreloadInfo(appMetricaConfig.preloadInfo);
        builder.withLocation(appMetricaConfig.location);
        if (ro.a(appMetricaConfig.appVersion)) {
            builder.withAppVersion(appMetricaConfig.appVersion);
        }
        if (ro.a(appMetricaConfig.dispatchPeriodSeconds)) {
            builder.withDispatchPeriodSeconds(appMetricaConfig.dispatchPeriodSeconds);
        }
        if (ro.a(appMetricaConfig.appBuildNumber)) {
            builder.withAppBuildNumber(appMetricaConfig.appBuildNumber);
        }
        if (ro.a(appMetricaConfig.maxReportsCount)) {
            builder.withMaxReportsCount(appMetricaConfig.maxReportsCount);
        }
        if (ro.a(appMetricaConfig.logs) && appMetricaConfig.logs.booleanValue()) {
            builder.withLogs();
        }
        if (ro.a(appMetricaConfig.sessionTimeout)) {
            builder.withSessionTimeout(appMetricaConfig.sessionTimeout);
        }
        if (ro.a(appMetricaConfig.sessionsAutoTrackingEnabled)) {
            builder.withSessionsAutoTrackingEnabled(appMetricaConfig.sessionsAutoTrackingEnabled);
        }
        if (ro.a(appMetricaConfig.crashReporting)) {
            builder.withCrashReporting(appMetricaConfig.crashReporting);
        }
        if (ro.a(appMetricaConfig.nativeCrashReporting)) {
            builder.withNativeCrashReporting(appMetricaConfig.nativeCrashReporting);
        }
        if (ro.a(appMetricaConfig.locationTracking)) {
            builder.withLocationTracking(appMetricaConfig.locationTracking);
        }
        if (ro.a(appMetricaConfig.advIdentifiersTracking)) {
            builder.withAdvIdentifiersTracking(appMetricaConfig.advIdentifiersTracking);
        }
        if (ro.a(appMetricaConfig.firstActivationAsUpdate)) {
            builder.handleFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate);
        }
        if (ro.a(appMetricaConfig.dataSendingEnabled)) {
            builder.withDataSendingEnabled(appMetricaConfig.dataSendingEnabled);
        }
        if (ro.a(appMetricaConfig.anrMonitoring)) {
            builder.withAnrMonitoring(appMetricaConfig.anrMonitoring);
        }
        if (ro.a(appMetricaConfig.anrMonitoringTimeout)) {
            builder.withAnrMonitoringTimeout(appMetricaConfig.anrMonitoringTimeout);
        }
        if (ro.a(appMetricaConfig.maxReportsInDatabaseCount)) {
            builder.withMaxReportsInDatabaseCount(appMetricaConfig.maxReportsInDatabaseCount);
        }
        if (ro.a(appMetricaConfig.crashTransformer)) {
            builder.withCrashTransformer(appMetricaConfig.crashTransformer);
        }
        if (ro.a(appMetricaConfig.userProfileID)) {
            builder.withUserProfileID(appMetricaConfig.userProfileID);
        }
        if (ro.a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            builder.withRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled);
        }
        if (ro.a(appMetricaConfig.appOpenTrackingEnabled)) {
            builder.withAppOpenTrackingEnabled(appMetricaConfig.appOpenTrackingEnabled);
        }
        if (ro.a(appMetricaConfig.customHosts)) {
            builder.withCustomHosts(appMetricaConfig.customHosts);
        }
        if (!ro.a(object22 = this.e)) {
            for (Map.Entry entry : object22.entrySet()) {
                builder.withAppEnvironmentValue((String)entry.getKey(), (String)entry.getValue());
            }
        }
        if (!ro.a(map4 = appMetricaConfig.appEnvironment)) {
            for (Map.Entry<String, String> entry : map4.entrySet()) {
                builder.withAppEnvironmentValue(entry.getKey(), entry.getValue());
            }
        }
        if (!ro.a(linkedHashMap = this.f)) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                builder.withErrorEnvironmentValue((String)entry.getKey(), (String)entry.getValue());
            }
        }
        if (!ro.a(map3 = appMetricaConfig.errorEnvironment)) {
            for (Map.Entry<String, String> entry : map3.entrySet()) {
                builder.withErrorEnvironmentValue(entry.getKey(), entry.getValue());
            }
        }
        if (!ro.a(map2 = appMetricaConfig.additionalConfig)) {
            for (Map.Entry<String, Object> entry : map2.entrySet()) {
                builder.withAdditionalConfig(entry.getKey(), entry.getValue());
            }
        }
        Boolean bl2 = this.b;
        if (appMetricaConfig.locationTracking == null && ro.a(bl2)) {
            builder.withLocationTracking(bl2);
        }
        Location location = this.a;
        if (appMetricaConfig.location == null && ro.a(location)) {
            builder.withLocation(location);
        }
        Boolean bl3 = this.d;
        if (appMetricaConfig.dataSendingEnabled == null && ro.a(bl3)) {
            builder.withDataSendingEnabled(bl3);
        }
        if (!ro.a(appMetricaConfig.userProfileID) && ro.a(this.h)) {
            builder.withUserProfileID(this.h);
        }
        Boolean bl4 = this.c;
        if (appMetricaConfig.advIdentifiersTracking == null && ro.a(bl4)) {
            builder.withAdvIdentifiersTracking(bl4);
        }
        this.j = true;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e.clear();
        this.f.clear();
        this.g = false;
        this.h = null;
        return builder.build();
    }

    @Override
    public final void a(@Nullable Location location) {
        this.a = location;
    }

    public final void a(Si si3) {
        Boolean bl2 = this.b;
        if (bl2 != null || this.d != null || this.c != null) {
            si3.a(bl2, this.d, this.c);
        }
        this.k = si3;
    }

    @Override
    public final void a(@NonNull String string2) {
        this.i.add(string2);
    }

    @Override
    public final void a(String string2, String string3) {
        this.f.put(string2, string3);
    }

    @Override
    public final void a(boolean bl2) {
        Boolean bl3;
        this.b = bl3 = Boolean.valueOf(bl2);
        Si si3 = this.k;
        if (si3 != null) {
            si3.a(bl3, this.d, this.c);
        }
    }

    @Override
    public final void b(boolean bl2) {
        Boolean bl3;
        this.c = bl3 = Boolean.valueOf(bl2);
        Si si3 = this.k;
        if (si3 != null) {
            si3.a(this.b, this.d, bl3);
        }
    }

    @Override
    public final void clearAppEnvironment() {
        this.g = true;
        this.e.clear();
    }

    public final k0 j() {
        return new k0(this.i, this.g);
    }

    public final Location k() {
        return this.a;
    }

    public final Boolean l() {
        return this.c;
    }

    public final Boolean m() {
        return this.d;
    }

    public final Boolean n() {
        return this.b;
    }

    public final boolean o() {
        return this.g;
    }

    @Override
    public final void putAppEnvironmentValue(String string2, String string3) {
        this.e.put(string2, string3);
    }

    @Override
    public final void setDataSendingEnabled(boolean bl2) {
        Boolean bl3;
        this.d = bl3 = Boolean.valueOf(bl2);
        Si si3 = this.k;
        if (si3 != null) {
            si3.a(this.b, bl3, this.c);
        }
    }

    @Override
    public final void setUserProfileID(@Nullable String string2) {
        this.h = string2;
    }
}

