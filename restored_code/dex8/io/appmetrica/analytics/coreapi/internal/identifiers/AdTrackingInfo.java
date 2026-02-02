/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.coreapi.internal.identifiers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AdTrackingInfo {
    @Nullable
    public final String advId;
    @Nullable
    public final Boolean limitedAdTracking;
    @NonNull
    public final Provider provider;

    public AdTrackingInfo(@NonNull Provider provider, @Nullable String string2, @Nullable Boolean bl2) {
        this.provider = provider;
        this.advId = string2;
        this.limitedAdTracking = bl2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdTrackingInfo{provider=");
        stringBuilder.append((Object)this.provider);
        stringBuilder.append(", advId='");
        stringBuilder.append(this.advId);
        stringBuilder.append("', limitedAdTracking=");
        stringBuilder.append(this.limitedAdTracking);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static final class Provider
    extends Enum<Provider> {
        public static final /* enum */ Provider GOOGLE;
        public static final /* enum */ Provider HMS;
        public static final /* enum */ Provider YANDEX;
        private static final Provider[] a;

        static {
            Provider provider;
            Provider provider2;
            Provider provider3;
            GOOGLE = provider3 = new Provider();
            HMS = provider2 = new Provider();
            YANDEX = provider = new Provider();
            a = new Provider[]{provider3, provider2, provider};
        }

        public static Provider valueOf(String string2) {
            return Enum.valueOf(Provider.class, string2);
        }

        public static Provider[] values() {
            return (Provider[])a.clone();
        }
    }
}

