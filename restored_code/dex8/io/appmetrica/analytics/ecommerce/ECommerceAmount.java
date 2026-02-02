/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.ro;
import java.math.BigDecimal;

public class ECommerceAmount {
    private final BigDecimal a;
    private final String b;

    public ECommerceAmount(double d14, @NonNull String string2) {
        this(new BigDecimal(ro.a(d14)), string2);
    }

    public ECommerceAmount(long l10, @NonNull String string2) {
        this(ro.a(l10), string2);
    }

    public ECommerceAmount(@NonNull BigDecimal bigDecimal, @NonNull String string2) {
        this.a = bigDecimal;
        this.b = string2;
    }

    @NonNull
    public BigDecimal getAmount() {
        return this.a;
    }

    @NonNull
    public String getUnit() {
        return this.b;
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ECommerceAmount{amount=");
        stringBuilder.append(this.a);
        stringBuilder.append(", unit='");
        stringBuilder.append(this.b);
        stringBuilder.append("'}");
        return stringBuilder.toString();
    }
}

