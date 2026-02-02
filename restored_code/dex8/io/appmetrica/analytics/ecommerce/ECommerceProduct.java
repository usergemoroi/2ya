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
import java.util.List;
import java.util.Map;

public class ECommerceProduct {
    private final String a;
    private String b;
    private List c;
    private Map d;
    private ECommercePrice e;
    private ECommercePrice f;
    private List g;

    public ECommerceProduct(@NonNull String string2) {
        this.a = string2;
    }

    @Nullable
    public ECommercePrice getActualPrice() {
        return this.e;
    }

    @Nullable
    public List<String> getCategoriesPath() {
        return this.c;
    }

    @Nullable
    public String getName() {
        return this.b;
    }

    @Nullable
    public ECommercePrice getOriginalPrice() {
        return this.f;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.d;
    }

    @Nullable
    public List<String> getPromocodes() {
        return this.g;
    }

    @NonNull
    public String getSku() {
        return this.a;
    }

    @NonNull
    public ECommerceProduct setActualPrice(@Nullable ECommercePrice eCommercePrice) {
        this.e = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setCategoriesPath(@Nullable List<String> list) {
        this.c = list;
        return this;
    }

    @NonNull
    public ECommerceProduct setName(@Nullable String string2) {
        this.b = string2;
        return this;
    }

    @NonNull
    public ECommerceProduct setOriginalPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setPayload(@Nullable Map<String, String> map2) {
        this.d = map2;
        return this;
    }

    @NonNull
    public ECommerceProduct setPromocodes(@Nullable List<String> list) {
        this.g = list;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ECommerceProduct{sku='");
        stringBuilder.append(this.a);
        stringBuilder.append("', name='");
        stringBuilder.append(this.b);
        stringBuilder.append("', categoriesPath=");
        stringBuilder.append(this.c);
        stringBuilder.append(", payload=");
        stringBuilder.append(this.d);
        stringBuilder.append(", actualPrice=");
        stringBuilder.append(this.e);
        stringBuilder.append(", originalPrice=");
        stringBuilder.append(this.f);
        stringBuilder.append(", promocodes=");
        stringBuilder.append(this.g);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

