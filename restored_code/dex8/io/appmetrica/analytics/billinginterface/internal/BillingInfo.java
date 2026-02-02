/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.billinginterface.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.ProductType;

public class BillingInfo {
    @NonNull
    public final String productId;
    public final long purchaseTime;
    @NonNull
    public final String purchaseToken;
    public long sendTime;
    @NonNull
    public final ProductType type;

    public BillingInfo(@NonNull ProductType productType, @NonNull String string2, @NonNull String string3, long l10, long l11) {
        this.type = productType;
        this.productId = string2;
        this.purchaseToken = string3;
        this.purchaseTime = l10;
        this.sendTime = l11;
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("BillingInfo{type=");
        stringBuilder.append((Object)this.type);
        stringBuilder.append("productId='");
        stringBuilder.append(this.productId);
        stringBuilder.append("'purchaseToken='");
        stringBuilder.append(this.purchaseToken);
        stringBuilder.append("'purchaseTime=");
        stringBuilder.append(this.purchaseTime);
        stringBuilder.append("sendTime=");
        stringBuilder.append(this.sendTime);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

