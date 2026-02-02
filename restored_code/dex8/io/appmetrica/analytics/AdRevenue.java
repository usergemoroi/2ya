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
import io.appmetrica.analytics.AdType;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.ro;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

public class AdRevenue {
    @Nullable
    public final String adNetwork;
    @Nullable
    public final String adPlacementId;
    @Nullable
    public final String adPlacementName;
    @NonNull
    public final BigDecimal adRevenue;
    @Nullable
    public final AdType adType;
    @Nullable
    public final String adUnitId;
    @Nullable
    public final String adUnitName;
    @NonNull
    public final Currency currency;
    @Nullable
    public final Map<String, String> payload;
    @Nullable
    public final String precision;

    private AdRevenue(BigDecimal object, Currency currency, AdType adType, String string2, String string3, String string4, String string5, String string6, String string7, Map map2) {
        this.adRevenue = object;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = string2;
        this.adUnitId = string3;
        this.adUnitName = string4;
        this.adPlacementId = string5;
        this.adPlacementName = string6;
        this.precision = string7;
        object = map2 == null ? null : CollectionUtils.unmodifiableMapCopy(map2);
        this.payload = object;
    }

    /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String string2, String string3, String string4, String string5, String string6, String string7, Map map2, int n10) {
        this(bigDecimal, currency, adType, string2, string3, string4, string5, string6, string7, map2);
    }

    public static Builder newBuilder(double d14, @NonNull Currency currency) {
        return new Builder(new BigDecimal(ro.a(d14)), currency, 0);
    }

    public static Builder newBuilder(long l10, @NonNull Currency currency) {
        return new Builder(ro.a(l10), currency, 0);
    }

    public static Builder newBuilder(@NonNull BigDecimal bigDecimal, @NonNull Currency currency) {
        return new Builder(bigDecimal, currency, 0);
    }

    public static class Builder {
        private final BigDecimal a;
        private final Currency b;
        private AdType c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private Map j;

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.a = bigDecimal;
            this.b = currency;
        }

        /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int n10) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, 0);
        }

        public Builder withAdNetwork(@Nullable String string2) {
            this.d = string2;
            return this;
        }

        public Builder withAdPlacementId(@Nullable String string2) {
            this.g = string2;
            return this;
        }

        public Builder withAdPlacementName(@Nullable String string2) {
            this.h = string2;
            return this;
        }

        public Builder withAdType(@Nullable AdType adType) {
            this.c = adType;
            return this;
        }

        public Builder withAdUnitId(@Nullable String string2) {
            this.e = string2;
            return this;
        }

        public Builder withAdUnitName(@Nullable String string2) {
            this.f = string2;
            return this;
        }

        public Builder withPayload(@Nullable Map<String, String> map2) {
            map2 = map2 == null ? null : CollectionUtils.copyOf(map2);
            this.j = map2;
            return this;
        }

        public Builder withPrecision(@Nullable String string2) {
            this.i = string2;
            return this;
        }
    }
}

