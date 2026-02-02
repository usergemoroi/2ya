/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ecommerce.ECommercePrice;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import io.appmetrica.analytics.impl.ro;
import java.math.BigDecimal;

public class ECommerceCartItem {
    private final ECommerceProduct a;
    private final BigDecimal b;
    private final ECommercePrice c;
    private ECommerceReferrer d;

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, double d14) {
        this(eCommerceProduct, eCommercePrice, new BigDecimal(ro.a(d14)));
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, long l10) {
        this(eCommerceProduct, eCommercePrice, ro.a(l10));
    }

    public ECommerceCartItem(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommercePrice eCommercePrice, @NonNull BigDecimal bigDecimal) {
        this.a = eCommerceProduct;
        this.b = bigDecimal;
        this.c = eCommercePrice;
    }

    @NonNull
    public ECommerceProduct getProduct() {
        return this.a;
    }

    @NonNull
    public BigDecimal getQuantity() {
        return this.b;
    }

    @Nullable
    public ECommerceReferrer getReferrer() {
        return this.d;
    }

    @NonNull
    public ECommercePrice getRevenue() {
        return this.c;
    }

    @NonNull
    public ECommerceCartItem setReferrer(@Nullable ECommerceReferrer eCommerceReferrer) {
        this.d = eCommerceReferrer;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ECommerceCartItem{product=");
        stringBuilder.append(this.a);
        stringBuilder.append(", quantity=");
        stringBuilder.append(this.b);
        stringBuilder.append(", revenue=");
        stringBuilder.append(this.c);
        stringBuilder.append(", referrer=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

