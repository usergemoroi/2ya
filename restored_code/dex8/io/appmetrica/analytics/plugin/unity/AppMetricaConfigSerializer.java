/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.appmetrica.analytics.plugin.unity;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.plugin.unity.LocationSerializer;
import io.appmetrica.analytics.plugin.unity.PreloadInfoSerializer;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

final class AppMetricaConfigSerializer {
    private AppMetricaConfigSerializer() {
    }

    @NonNull
    public static AppMetricaConfig fromJsonString(@NonNull String string2) throws JSONException {
        String string3;
        Iterator iterator;
        JSONObject jSONObject;
        string2 = new JSONObject(string2);
        AppMetricaConfig.Builder builder = AppMetricaConfig.newConfigBuilder(string2.getString("ApiKey"));
        if (string2.has("AppBuildNumber")) {
            builder.withAppBuildNumber(string2.getInt("AppBuildNumber"));
        }
        if (string2.has("AppEnvironment")) {
            jSONObject = string2.getJSONObject("AppEnvironment");
            iterator = jSONObject.keys();
            while (iterator.hasNext()) {
                string3 = (String)iterator.next();
                builder.withAppEnvironmentValue(string3, jSONObject.getString(string3));
            }
        }
        if (string2.has("AppOpenTrackingEnabled")) {
            builder.withAppOpenTrackingEnabled(string2.getBoolean("AppOpenTrackingEnabled"));
        }
        if (string2.has("AppVersion")) {
            builder.withAppVersion(string2.getString("AppVersion"));
        }
        if (string2.has("CrashReporting")) {
            builder.withCrashReporting(string2.getBoolean("CrashReporting"));
        }
        if (string2.has("DataSendingEnabled")) {
            builder.withDataSendingEnabled(string2.getBoolean("DataSendingEnabled"));
        }
        if (string2.has("DeviceType")) {
            builder.withDeviceType(string2.getString("DeviceType"));
        }
        if (string2.has("DispatchPeriodSeconds")) {
            builder.withDispatchPeriodSeconds(string2.getInt("DispatchPeriodSeconds"));
        }
        if (string2.has("ErrorEnvironment")) {
            jSONObject = string2.getJSONObject("ErrorEnvironment");
            iterator = jSONObject.keys();
            while (iterator.hasNext()) {
                string3 = (String)iterator.next();
                builder.withErrorEnvironmentValue(string3, jSONObject.getString(string3));
            }
        }
        if (string2.has("FirstActivationAsUpdate")) {
            builder.handleFirstActivationAsUpdate(string2.getBoolean("FirstActivationAsUpdate"));
        }
        if (string2.has("Location")) {
            builder.withLocation(LocationSerializer.fromJsonString(string2.getString("Location")));
        }
        if (string2.has("LocationTracking")) {
            builder.withLocationTracking(string2.getBoolean("LocationTracking"));
        }
        if (string2.optBoolean("Logs", false)) {
            builder.withLogs();
        }
        if (string2.has("MaxReportsCount")) {
            builder.withMaxReportsCount(string2.getInt("MaxReportsCount"));
        }
        if (string2.has("MaxReportsInDatabaseCount")) {
            builder.withMaxReportsInDatabaseCount(string2.getInt("MaxReportsInDatabaseCount"));
        }
        if (string2.has("NativeCrashReporting")) {
            builder.withNativeCrashReporting(string2.getBoolean("NativeCrashReporting"));
        }
        if (string2.has("PreloadInfo")) {
            builder.withPreloadInfo(PreloadInfoSerializer.fromJsonString(string2.getString("PreloadInfo")));
        }
        if (string2.has("RevenueAutoTrackingEnabled")) {
            builder.withRevenueAutoTrackingEnabled(string2.getBoolean("RevenueAutoTrackingEnabled"));
        }
        if (string2.has("SessionTimeout")) {
            builder.withSessionTimeout(string2.getInt("SessionTimeout"));
        }
        if (string2.has("SessionsAutoTrackingEnabled")) {
            builder.withSessionsAutoTrackingEnabled(string2.getBoolean("SessionsAutoTrackingEnabled"));
        }
        if (string2.has("UserProfileID")) {
            builder.withUserProfileID(string2.getString("UserProfileID"));
        }
        return builder.build();
    }
}

