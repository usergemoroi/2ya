/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package io.appmetrica.analytics;

import android.location.Location;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ICrashTransformer;
import io.appmetrica.analytics.PredefinedDeviceTypes;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.Gb;
import io.appmetrica.analytics.impl.Kn;
import io.appmetrica.analytics.impl.L5;
import io.appmetrica.analytics.impl.c8;
import io.appmetrica.analytics.impl.f4;
import io.appmetrica.analytics.impl.g0;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class AppMetricaConfig {
    @NonNull
    public final Map<String, Object> additionalConfig;
    @Nullable
    public final Boolean advIdentifiersTracking;
    @Nullable
    public final Boolean anrMonitoring;
    @Nullable
    public final Integer anrMonitoringTimeout;
    @NonNull
    public final String apiKey;
    @Nullable
    public final Integer appBuildNumber;
    @Nullable
    public final Map<String, String> appEnvironment;
    @Nullable
    public final Boolean appOpenTrackingEnabled;
    @Nullable
    public final String appVersion;
    @Nullable
    public final Boolean crashReporting;
    @Nullable
    public final ICrashTransformer crashTransformer;
    @Nullable
    public final List<String> customHosts;
    @Nullable
    public final Boolean dataSendingEnabled;
    @Nullable
    public final String deviceType;
    @Nullable
    public final Integer dispatchPeriodSeconds;
    @Nullable
    public final Map<String, String> errorEnvironment;
    @Nullable
    public final Boolean firstActivationAsUpdate;
    @Nullable
    public final Location location;
    @Nullable
    public final Boolean locationTracking;
    @Nullable
    public final Boolean logs;
    @Nullable
    public final Integer maxReportsCount;
    @Nullable
    public final Integer maxReportsInDatabaseCount;
    @Nullable
    public final Boolean nativeCrashReporting;
    @Nullable
    public final PreloadInfo preloadInfo;
    @Nullable
    public final Boolean revenueAutoTrackingEnabled;
    @Nullable
    public final Integer sessionTimeout;
    @Nullable
    public final Boolean sessionsAutoTrackingEnabled;
    @Nullable
    public final String userProfileID;

    private AppMetricaConfig(Builder builder) {
        this.apiKey = builder.b;
        this.appVersion = builder.c;
        this.sessionTimeout = builder.d;
        this.crashReporting = builder.e;
        this.nativeCrashReporting = builder.f;
        this.location = builder.g;
        this.locationTracking = builder.h;
        this.advIdentifiersTracking = builder.i;
        this.logs = builder.j;
        this.preloadInfo = builder.k;
        this.firstActivationAsUpdate = builder.l;
        this.dataSendingEnabled = builder.m;
        this.maxReportsInDatabaseCount = builder.n;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.o);
        this.userProfileID = builder.p;
        this.revenueAutoTrackingEnabled = builder.q;
        this.sessionsAutoTrackingEnabled = builder.r;
        this.appOpenTrackingEnabled = builder.s;
        this.deviceType = builder.t;
        this.appBuildNumber = builder.u;
        this.dispatchPeriodSeconds = builder.v;
        this.maxReportsCount = builder.w;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.x);
        this.crashTransformer = builder.y;
        this.anrMonitoring = builder.z;
        this.anrMonitoringTimeout = builder.A;
        this.customHosts = builder.B;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.C);
    }

    /* synthetic */ AppMetricaConfig(Builder builder, int n10) {
        this(builder);
    }

    protected AppMetricaConfig(@NonNull AppMetricaConfig appMetricaConfig) {
        this.apiKey = appMetricaConfig.apiKey;
        this.appVersion = appMetricaConfig.appVersion;
        this.sessionTimeout = appMetricaConfig.sessionTimeout;
        this.crashReporting = appMetricaConfig.crashReporting;
        this.nativeCrashReporting = appMetricaConfig.nativeCrashReporting;
        this.location = appMetricaConfig.location;
        this.locationTracking = appMetricaConfig.locationTracking;
        this.advIdentifiersTracking = appMetricaConfig.advIdentifiersTracking;
        this.logs = appMetricaConfig.logs;
        this.preloadInfo = appMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = appMetricaConfig.firstActivationAsUpdate;
        this.dataSendingEnabled = appMetricaConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = appMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = appMetricaConfig.errorEnvironment;
        this.userProfileID = appMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = appMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = appMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = appMetricaConfig.appOpenTrackingEnabled;
        this.deviceType = appMetricaConfig.deviceType;
        this.appBuildNumber = appMetricaConfig.appBuildNumber;
        this.dispatchPeriodSeconds = appMetricaConfig.dispatchPeriodSeconds;
        this.maxReportsCount = appMetricaConfig.maxReportsCount;
        this.appEnvironment = appMetricaConfig.appEnvironment;
        this.crashTransformer = appMetricaConfig.crashTransformer;
        this.anrMonitoring = appMetricaConfig.anrMonitoring;
        this.anrMonitoringTimeout = appMetricaConfig.anrMonitoringTimeout;
        this.customHosts = appMetricaConfig.customHosts;
        this.additionalConfig = appMetricaConfig.additionalConfig;
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Nullable
    public static AppMetricaConfig fromJson(String var0) {
        block30: {
            new c8();
            if (TextUtils.isEmpty((CharSequence)var0)) break block30;
            var2_3 = new JSONObject((String)var0);
            var0 = AppMetricaConfig.newConfigBuilder(var2_3.getString("apikey"));
            if (var2_3.has("app_version")) {
                var0.withAppVersion(var2_3.optString("app_version"));
            }
            if (var2_3.has("session_timeout")) {
                var0.withSessionTimeout(var2_3.getInt("session_timeout"));
            }
            var0.withLocation(f4.a(var2_3.optString("location")));
            var0.withPreloadInfo(f4.b(var2_3.optString("preload_info")));
            if (var2_3.has("logs") && var2_3.optBoolean("logs")) {
                var0.withLogs();
            }
            if (var2_3.has("crash_enabled")) {
                var0.withCrashReporting(var2_3.optBoolean("crash_enabled"));
            }
            if (var2_3.has("crash_native_enabled")) {
                var0.withNativeCrashReporting(var2_3.optBoolean("crash_native_enabled"));
            }
            if (var2_3.has("location_enabled")) {
                var0.withLocationTracking(var2_3.optBoolean("location_enabled"));
            }
            if (var2_3.has("adv_identifiers_tracking")) {
                var0.withAdvIdentifiersTracking(var2_3.optBoolean("adv_identifiers_tracking", true));
            }
            if (var2_3.has("max_reports_in_db_count")) {
                var0.withMaxReportsInDatabaseCount(var2_3.optInt("max_reports_in_db_count"));
            }
            if (!var2_3.has("error_environment") || (var3_4 = Gb.c(var2_3.optString("error_environment"))) == null) ** GOTO lbl41
            for (Iterator<Map.Entry<K, V>> var3_4 : var3_4.entrySet()) {
                var0.withErrorEnvironmentValue((String)var3_4.getKey(), (String)var3_4.getValue());
            }
lbl41:

            if (var2_3.has("first_activation_as_update")) {
                var0.handleFirstActivationAsUpdate(var2_3.optBoolean("first_activation_as_update"));
            }
            if (var2_3.has("data_sending_enabled")) {
                var0.withDataSendingEnabled(var2_3.optBoolean("data_sending_enabled"));
            }
            if (!(var1_6 = var2_3.has("user_profile_id"))) ** GOTO lbl51
            var0.withUserProfileID(var2_3.optString("user_profile_id", null));
lbl51:

            if (var2_3.has("revenue_auto_tracking_enabled")) {
                var0.withRevenueAutoTrackingEnabled(var2_3.optBoolean("revenue_auto_tracking_enabled"));
            }
            if (var2_3.has("sessions_auto_tracking_enabled")) {
                var0.withSessionsAutoTrackingEnabled(var2_3.optBoolean("sessions_auto_tracking_enabled"));
            }
            if (var2_3.has("app_open_tracking_enabled")) {
                var0.withAppOpenTrackingEnabled(var2_3.optBoolean("app_open_tracking_enabled"));
            }
            if (var2_3.has("device_type")) {
                var0.withDeviceType(var2_3.optString("device_type"));
            }
            if (var2_3.has("app_build_number")) {
                var0.withAppBuildNumber(var2_3.optInt("app_build_number"));
            }
            if (var2_3.has("dispatch_period_seconds")) {
                var0.withDispatchPeriodSeconds(var2_3.optInt("dispatch_period_seconds"));
            }
            if (var2_3.has("max_reports_count")) {
                var0.withMaxReportsCount(var2_3.optInt("max_reports_count"));
            }
            if (!var2_3.has("app_environment") || (var3_4 = Gb.c(var2_3.optString("app_environment"))) == null) ** GOTO lbl78
            try {
                for (Object var4_5 : var3_4.entrySet()) {
                    var0.withAppEnvironmentValue((String)var4_5.getKey(), (String)var4_5.getValue());
                }
lbl78:

                if (var2_3.has("anr_monitoring")) {
                    var0.withAnrMonitoring(var2_3.optBoolean("anr_monitoring"));
                }
                if (var2_3.has("anr_monitoring_timeout")) {
                    var0.withAnrMonitoringTimeout(var2_3.optInt("anr_monitoring_timeout"));
                }
                if (var2_3.has("customHosts")) {
                    var0.withCustomHosts(Gb.a(var2_3.optJSONArray("customHosts")));
                }
                if (var2_3.has("additional_config")) {
                    var2_3.optJSONObject("additional_config");
                }
                var0 = var0.build();

            }
        // Removed invalid catch block
            }
        }
lbl93:

        while (true) {
            var0 = null;
lbl95:

            return var0;
        }
        // Removed invalid catch block
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String string2) {
        return new Builder(string2, 0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String toJson() {
        void var1_18;
        void var1_14;
        void var1_10;
        void var1_28;
        Object var2_30;
        JSONObject jSONObject;
        block14: {
            PreloadInfo preloadInfo;
            new c8();
            try {
                jSONObject = new JSONObject();
                jSONObject.put("apikey", (Object)this.apiKey);
                jSONObject.put("app_version", (Object)this.appVersion);
                jSONObject.put("session_timeout", (Object)this.sessionTimeout);
                jSONObject.put("location", (Object)f4.a(this.location));
                preloadInfo = this.preloadInfo;
                var2_30 = null;
                if (preloadInfo == null) break block14;
            }
            catch (Throwable throwable) {
                return var1_28;
            }
            try {
                void var1_6;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("trackid", (Object)preloadInfo.getTrackingId());
                Map<String, String> map2 = preloadInfo.getAdditionalParams();
                if (map2 == null) {
                    Object var1_4 = null;
                } else {
                    JSONObject jSONObject3 = new JSONObject(map2);
                }
                jSONObject2.put("params", (Object)var1_6);
                String string2 = jSONObject2.toString();
            }
            catch (Throwable throwable) {}
        }
        Object var1_9 = null;
        jSONObject.put("preload_info", (Object)var1_10);
        jSONObject.put("logs", (Object)this.logs);
        jSONObject.put("crash_enabled", (Object)this.crashReporting);
        jSONObject.put("crash_native_enabled", (Object)this.nativeCrashReporting);
        jSONObject.put("location_enabled", (Object)this.locationTracking);
        jSONObject.put("adv_identifiers_tracking", (Object)this.advIdentifiersTracking);
        jSONObject.put("max_reports_in_db_count", (Object)this.maxReportsInDatabaseCount);
        Map<String, String> map3 = this.errorEnvironment;
        if (map3 == null) {
            Object var1_12 = null;
        } else {
            JSONObject jSONObject4 = new JSONObject(map3);
        }
        jSONObject.put("error_environment", (Object)var1_14);
        jSONObject.put("first_activation_as_update", (Object)this.firstActivationAsUpdate);
        jSONObject.put("data_sending_enabled", (Object)this.dataSendingEnabled);
        jSONObject.put("user_profile_id", (Object)this.userProfileID);
        jSONObject.put("revenue_auto_tracking_enabled", (Object)this.revenueAutoTrackingEnabled);
        jSONObject.put("sessions_auto_tracking_enabled", (Object)this.sessionsAutoTrackingEnabled);
        jSONObject.put("app_open_tracking_enabled", (Object)this.appOpenTrackingEnabled);
        jSONObject.put("device_type", (Object)this.deviceType);
        jSONObject.put("app_build_number", (Object)this.appBuildNumber);
        jSONObject.put("dispatch_period_seconds", (Object)this.dispatchPeriodSeconds);
        jSONObject.put("max_reports_count", (Object)this.maxReportsCount);
        Map<String, String> map4 = this.appEnvironment;
        if (map4 == null) {
            Object var1_16 = null;
        } else {
            JSONObject jSONObject5 = new JSONObject(map4);
        }
        jSONObject.put("app_environment", (Object)var1_18);
        jSONObject.put("anr_monitoring", (Object)this.anrMonitoring);
        jSONObject.put("anr_monitoring_timeout", (Object)this.anrMonitoringTimeout);
        List<String> list = this.customHosts;
        if (list != null) {
            void var1_22;
            if (ro.a(list)) {
                Object var1_20 = var2_30;
            } else {
                JSONArray jSONArray = new JSONArray(list);
            }
            jSONObject.put("customHosts", (Object)var1_22);
        }
        JSONObject jSONObject6 = new JSONObject();
        jSONObject.put("additional_config", (Object)jSONObject6);
        String string3 = jSONObject.toString();
        return var1_28;
    }

    public static class Builder {
        private static final Kn D = new Kn(new g0());
        private Integer A;
        private List B;
        private final HashMap C;
        private final L5 a;
        private final String b;
        private String c;
        private Integer d;
        private Boolean e;
        private Boolean f;
        private Location g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private PreloadInfo k;
        private Boolean l;
        private Boolean m;
        private Integer n;
        private final LinkedHashMap o = new LinkedHashMap();
        private String p;
        private Boolean q;
        private Boolean r;
        private Boolean s;
        private String t;
        private Integer u;
        private Integer v;
        private Integer w;
        private final LinkedHashMap x = new LinkedHashMap();
        private ICrashTransformer y;
        private Boolean z;

        private Builder(String string2) {
            this.C = new HashMap();
            D.a(string2);
            this.a = new L5(string2);
            this.b = string2;
        }

        /* synthetic */ Builder(String string2, int n10) {
            this(string2);
        }

        @NonNull
        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        @NonNull
        public Builder handleFirstActivationAsUpdate(boolean bl2) {
            this.l = bl2;
            return this;
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String string2, @Nullable Object object) {
            this.C.put(string2, object);
            return this;
        }

        @NonNull
        public Builder withAdvIdentifiersTracking(boolean bl2) {
            this.i = bl2;
            return this;
        }

        @NonNull
        public Builder withAnrMonitoring(boolean bl2) {
            this.z = bl2;
            return this;
        }

        @NonNull
        public Builder withAnrMonitoringTimeout(int n10) {
            this.A = n10;
            return this;
        }

        @NonNull
        public Builder withAppBuildNumber(int n10) {
            if (n10 >= 0) {
                this.u = n10;
                return this;
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
        }

        @NonNull
        public Builder withAppEnvironmentValue(@NonNull String string2, @Nullable String string3) {
            this.x.put(string2, string3);
            return this;
        }

        @NonNull
        public Builder withAppOpenTrackingEnabled(boolean bl2) {
            this.s = bl2;
            return this;
        }

        @NonNull
        public Builder withAppVersion(@Nullable String string2) {
            this.c = string2;
            return this;
        }

        @NonNull
        public Builder withCrashReporting(boolean bl2) {
            this.e = bl2;
            return this;
        }

        @NonNull
        public Builder withCrashTransformer(@Nullable ICrashTransformer iCrashTransformer) {
            this.y = iCrashTransformer;
            return this;
        }

        @NonNull
        public Builder withCustomHosts(@NonNull List<String> list) {
            this.B = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean bl2) {
            this.m = bl2;
            return this;
        }

        @NonNull
        public Builder withDeviceType(@Nullable String string2) {
            this.t = string2;
            if (!PredefinedDeviceTypes.ALL_VALUES.contains(string2)) {
                PublicLogger.getAnonymousInstance().info("PredefinedDeviceTypes does not contain value for `deviceType = %s`. It may cause events to not appear in AppMetrica reports.", string2);
            }
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int n10) {
            this.v = n10;
            return this;
        }

        @NonNull
        public Builder withErrorEnvironmentValue(@NonNull String string2, @Nullable String string3) {
            ((AbstractMap)this.o).put(string2, string3);
            return this;
        }

        @NonNull
        public Builder withLocation(@Nullable Location location) {
            this.g = location;
            return this;
        }

        @NonNull
        public Builder withLocationTracking(boolean bl2) {
            this.h = bl2;
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.j = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int n10) {
            this.w = n10;
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int n10) {
            this.n = this.a.a(n10);
            return this;
        }

        @NonNull
        public Builder withNativeCrashReporting(boolean bl2) {
            this.f = bl2;
            return this;
        }

        @NonNull
        public Builder withPreloadInfo(@Nullable PreloadInfo preloadInfo) {
            this.k = preloadInfo;
            return this;
        }

        @NonNull
        public Builder withRevenueAutoTrackingEnabled(boolean bl2) {
            this.q = bl2;
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int n10) {
            this.d = n10;
            return this;
        }

        @NonNull
        public Builder withSessionsAutoTrackingEnabled(boolean bl2) {
            this.r = bl2;
            return this;
        }

        @NonNull
        public Builder withUserProfileID(@Nullable String string2) {
            this.p = string2;
            return this;
        }
    }
}

