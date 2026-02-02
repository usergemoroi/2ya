/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.ecommerce;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class ECommerceScreen {
    private String a;
    private List b;
    private String c;
    private Map d;

    @Nullable
    public List<String> getCategoriesPath() {
        return this.b;
    }

    @Nullable
    public String getName() {
        return this.a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.d;
    }

    @Nullable
    public String getSearchQuery() {
        return this.c;
    }

    public ECommerceScreen setCategoriesPath(@Nullable List<String> list) {
        this.b = list;
        return this;
    }

    public ECommerceScreen setName(@Nullable String string2) {
        this.a = string2;
        return this;
    }

    public ECommerceScreen setPayload(@Nullable Map<String, String> map2) {
        this.d = map2;
        return this;
    }

    public ECommerceScreen setSearchQuery(@Nullable String string2) {
        this.c = string2;
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ECommerceScreen{name='");
        stringBuilder.append(this.a);
        stringBuilder.append("', categoriesPath=");
        stringBuilder.append(this.b);
        stringBuilder.append(", searchQuery='");
        stringBuilder.append(this.c);
        stringBuilder.append("', payload=");
        stringBuilder.append(this.d);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

