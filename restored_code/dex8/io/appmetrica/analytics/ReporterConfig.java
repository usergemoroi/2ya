/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.Kn;
import io.appmetrica.analytics.impl.L5;
import io.appmetrica.analytics.impl.g0;
import java.util.HashMap;
import java.util.Map;

public class ReporterConfig {
    @NonNull
    public final Map<String, Object> additionalConfig;
    @NonNull
    public final String apiKey;
    public final Map<String, String> appEnvironment;
    @Nullable
    public final Boolean dataSendingEnabled;
    @Nullable
    public final Integer dispatchPeriodSeconds;
    @Nullable
    public final Boolean logs;
    @Nullable
    public final Integer maxReportsCount;
    @Nullable
    public final Integer maxReportsInDatabaseCount;
    @Nullable
    public final Integer sessionTimeout;
    @Nullable
    public final String userProfileID;

    private ReporterConfig(Builder builder) {
        this.apiKey = builder.b;
        this.sessionTimeout = builder.c;
        this.logs = builder.d;
        this.dataSendingEnabled = builder.e;
        this.maxReportsInDatabaseCount = builder.f;
        this.userProfileID = builder.g;
        this.dispatchPeriodSeconds = builder.h;
        this.maxReportsCount = builder.i;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.j);
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.k);
    }

    /* synthetic */ ReporterConfig(Builder builder, int n10) {
        this(builder);
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String string2) {
        return new Builder(string2, 0);
    }

    public static class Builder {
        private static final Kn l = new Kn(new g0());
        private final L5 a;
        private final String b;
        private Integer c;
        private Boolean d;
        private Boolean e;
        private Integer f;
        private String g;
        private Integer h;
        private Integer i;
        private final HashMap j = new HashMap();
        private final HashMap k = new HashMap();

        private Builder(String string2) {
            l.a(string2);
            this.a = new L5(string2);
            this.b = string2;
        }

        /* synthetic */ Builder(String string2, int n10) {
            this(string2);
        }

        @NonNull
        public ReporterConfig build() {
            return new ReporterConfig(this, 0);
        }

        @NonNull
        public Builder withAdditionalConfig(@NonNull String string2, @Nullable Object object) {
            this.k.put(string2, object);
            return this;
        }

        @NonNull
        public Builder withAppEnvironmentValue(String string2, String string3) {
            this.j.put(string2, string3);
            return this;
        }

        @NonNull
        public Builder withDataSendingEnabled(boolean bl2) {
            this.e = bl2;
            return this;
        }

        @NonNull
        public Builder withDispatchPeriodSeconds(int n10) {
            this.h = n10;
            return this;
        }

        @NonNull
        public Builder withLogs() {
            this.d = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsCount(int n10) {
            this.i = n10;
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int n10) {
            this.f = this.a.a(n10);
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int n10) {
            this.c = n10;
            return this;
        }

        @NonNull
        public Builder withUserProfileID(@Nullable String string2) {
            this.g = string2;
            return this;
        }
    }
}

