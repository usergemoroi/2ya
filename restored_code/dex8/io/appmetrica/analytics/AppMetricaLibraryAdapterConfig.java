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

public class AppMetricaLibraryAdapterConfig {
    @Nullable
    public final Boolean advIdentifiersTracking;

    private AppMetricaLibraryAdapterConfig(Builder builder) {
        this.advIdentifiersTracking = builder.a;
    }

    /* synthetic */ AppMetricaLibraryAdapterConfig(Builder builder, int n10) {
        this(builder);
    }

    public static Builder newConfigBuilder() {
        return new Builder();
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AppMetricaLibraryAdapterConfig{advIdentifiersTracking=");
        stringBuilder.append(this.advIdentifiersTracking);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static class Builder {
        private Boolean a;

        @NonNull
        public AppMetricaLibraryAdapterConfig build() {
            return new AppMetricaLibraryAdapterConfig(this, 0);
        }

        @NonNull
        public Builder withAdvIdentifiersTracking(boolean bl2) {
            this.a = bl2;
            return this;
        }
    }
}

