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
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import java.util.List;
import java.util.Map;

public class ECommerceOrder {
    private final String a;
    private final List b;
    private Map c;

    public ECommerceOrder(@NonNull String string2, @NonNull List<ECommerceCartItem> list) {
        this.a = string2;
        this.b = list;
    }

    @NonNull
    public List<ECommerceCartItem> getCartItems() {
        return this.b;
    }

    @NonNull
    public String getIdentifier() {
        return this.a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.c;
    }

    public ECommerceOrder setPayload(@Nullable Map<String, String> map2) {
        this.c = map2;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ECommerceOrder{identifier='");
        stringBuilder.append(this.a);
        stringBuilder.append("', cartItems=");
        stringBuilder.append(this.b);
        stringBuilder.append(", payload=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

