/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.impl.Tf;
import java.util.List;
import java.util.Map;

public final class dg {
    public final String a;
    public final String b;
    public final List c;
    public final Map d;
    public final Tf e;
    public final Tf f;
    public final List g;

    public dg(ECommerceProduct eCommerceProduct) {
        String string2 = eCommerceProduct.getSku();
        String string3 = eCommerceProduct.getName();
        List<String> list = CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getCategoriesPath());
        Map<String, String> map2 = CollectionUtils.mapCopyOfNullableMap(eCommerceProduct.getPayload());
        Tf tf2 = eCommerceProduct.getActualPrice() == null ? null : new Tf(eCommerceProduct.getActualPrice());
        Tf tf3 = eCommerceProduct.getOriginalPrice() == null ? null : new Tf(eCommerceProduct.getOriginalPrice());
        this(string2, string3, list, map2, tf2, tf3, CollectionUtils.arrayListCopyOfNullableCollection(eCommerceProduct.getPromocodes()));
    }

    public dg(String string2, String string3, List list, Map map2, Tf tf2, Tf tf3, List list2) {
        this.a = string2;
        this.b = string3;
        this.c = list;
        this.d = map2;
        this.e = tf2;
        this.f = tf3;
        this.g = list2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ProductWrapper{sku='");
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

