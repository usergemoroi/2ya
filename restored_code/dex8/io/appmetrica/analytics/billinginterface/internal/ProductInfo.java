/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.billinginterface.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductType;

public class ProductInfo {
    public final boolean autoRenewing;
    public final int introductoryPriceCycles;
    public final long introductoryPriceMicros;
    @Nullable
    public final Period introductoryPricePeriod;
    @NonNull
    public final String priceCurrency;
    public final long priceMicros;
    @NonNull
    public final String purchaseOriginalJson;
    public final long purchaseTime;
    @NonNull
    public final String purchaseToken;
    public final int quantity;
    @NonNull
    public final String signature;
    @NonNull
    public final String sku;
    @Nullable
    public final Period subscriptionPeriod;
    @NonNull
    public final ProductType type;

    public ProductInfo(@NonNull ProductType productType, @NonNull String string2, int n10, long l10, @NonNull String string3, long l11, @Nullable Period period, int n13, @Nullable Period period2, @NonNull String string4, @NonNull String string5, long l13, boolean bl2, @NonNull String string6) {
        this.type = productType;
        this.sku = string2;
        this.quantity = n10;
        this.priceMicros = l10;
        this.priceCurrency = string3;
        this.introductoryPriceMicros = l11;
        this.introductoryPricePeriod = period;
        this.introductoryPriceCycles = n13;
        this.subscriptionPeriod = period2;
        this.signature = string4;
        this.purchaseToken = string5;
        this.purchaseTime = l13;
        this.autoRenewing = bl2;
        this.purchaseOriginalJson = string6;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (ProductInfo)object;
            if (this.quantity != ((ProductInfo)object).quantity) {
                return false;
            }
            if (this.priceMicros != ((ProductInfo)object).priceMicros) {
                return false;
            }
            if (this.introductoryPriceMicros != ((ProductInfo)object).introductoryPriceMicros) {
                return false;
            }
            if (this.introductoryPriceCycles != ((ProductInfo)object).introductoryPriceCycles) {
                return false;
            }
            if (this.purchaseTime != ((ProductInfo)object).purchaseTime) {
                return false;
            }
            if (this.autoRenewing != ((ProductInfo)object).autoRenewing) {
                return false;
            }
            if (this.type != ((ProductInfo)object).type) {
                return false;
            }
            if (!this.sku.equals(((ProductInfo)object).sku)) {
                return false;
            }
            if (!this.priceCurrency.equals(((ProductInfo)object).priceCurrency)) {
                return false;
            }
            Period period = this.introductoryPricePeriod;
            if (period != null ? !period.equals(((ProductInfo)object).introductoryPricePeriod) : ((ProductInfo)object).introductoryPricePeriod != null) {
                return false;
            }
            period = this.subscriptionPeriod;
            if (period != null ? !period.equals(((ProductInfo)object).subscriptionPeriod) : ((ProductInfo)object).subscriptionPeriod != null) {
                return false;
            }
            if (!this.signature.equals(((ProductInfo)object).signature)) {
                return false;
            }
            if (!this.purchaseToken.equals(((ProductInfo)object).purchaseToken)) {
                return false;
            }
            return this.purchaseOriginalJson.equals(((ProductInfo)object).purchaseOriginalJson);
        }
        return false;
    }

    public int hashCode() {
        int n10 = ((Object)((Object)this.type)).hashCode();
        int n13 = this.sku.hashCode();
        int n14 = this.quantity;
        long l10 = this.priceMicros;
        int n15 = (int)(l10 ^ l10 >>> 32);
        int n16 = this.priceCurrency.hashCode();
        l10 = this.introductoryPriceMicros;
        int n17 = (int)(l10 ^ l10 >>> 32);
        Period period = this.introductoryPricePeriod;
        int n18 = 0;
        int n19 = period != null ? period.hashCode() : 0;
        int n23 = this.introductoryPriceCycles;
        period = this.subscriptionPeriod;
        if (period != null) {
            n18 = period.hashCode();
        }
        int n24 = this.signature.hashCode();
        int n25 = this.purchaseToken.hashCode();
        l10 = this.purchaseTime;
        int n26 = (int)(l10 >>> 32 ^ l10);
        int n27 = this.autoRenewing;
        return this.purchaseOriginalJson.hashCode() + (((n25 + (n24 + (((((n16 + (((n13 + n10 * 31) * 31 + n14) * 31 + n15) * 31) * 31 + n17) * 31 + n19) * 31 + n23) * 31 + n18) * 31) * 31) * 31 + n26) * 31 + n27) * 31;
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ProductInfo{type=");
        stringBuilder.append((Object)this.type);
        stringBuilder.append(", sku='");
        stringBuilder.append(this.sku);
        stringBuilder.append("', quantity=");
        stringBuilder.append(this.quantity);
        stringBuilder.append(", priceMicros=");
        stringBuilder.append(this.priceMicros);
        stringBuilder.append(", priceCurrency='");
        stringBuilder.append(this.priceCurrency);
        stringBuilder.append("', introductoryPriceMicros=");
        stringBuilder.append(this.introductoryPriceMicros);
        stringBuilder.append(", introductoryPricePeriod=");
        stringBuilder.append(this.introductoryPricePeriod);
        stringBuilder.append(", introductoryPriceCycles=");
        stringBuilder.append(this.introductoryPriceCycles);
        stringBuilder.append(", subscriptionPeriod=");
        stringBuilder.append(this.subscriptionPeriod);
        stringBuilder.append(", signature='");
        stringBuilder.append(this.signature);
        stringBuilder.append("', purchaseToken='");
        stringBuilder.append(this.purchaseToken);
        stringBuilder.append("', purchaseTime=");
        stringBuilder.append(this.purchaseTime);
        stringBuilder.append(", autoRenewing=");
        stringBuilder.append(this.autoRenewing);
        stringBuilder.append(", purchaseOriginalJson='");
        stringBuilder.append(this.purchaseOriginalJson);
        stringBuilder.append("'}");
        return stringBuilder.toString();
    }
}

