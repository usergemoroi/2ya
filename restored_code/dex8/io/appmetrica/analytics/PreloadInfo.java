/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

public class PreloadInfo {
    private final String a;
    private final Map b;

    private PreloadInfo(Builder builder) {
        this.a = builder.a;
        this.b = CollectionUtils.unmodifiableMapCopy(builder.b);
    }

    /* synthetic */ PreloadInfo(Builder builder, int n10) {
        this(builder);
    }

    public static Builder newBuilder(String string2) {
        return new Builder(string2, 0);
    }

    public Map<String, String> getAdditionalParams() {
        return this.b;
    }

    public String getTrackingId() {
        return this.a;
    }

    public static class Builder {
        private final String a;
        private final HashMap b;

        private Builder(String string2) {
            this.a = string2;
            this.b = new HashMap();
        }

        /* synthetic */ Builder(String string2, int n10) {
            this(string2);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, 0);
        }

        public Builder setAdditionalParams(String string2, String string3) {
            if (string2 != null && string3 != null) {
                this.b.put(string2, string3);
            }
            return this;
        }
    }
}

