/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import java.util.Map;

public final class yj {
    public final String a;
    public final List b;
    public final String c;
    public final Map d;

    public yj(ECommerceScreen eCommerceScreen) {
        String string2 = eCommerceScreen.getName();
        List<String> list = CollectionUtils.arrayListCopyOfNullableCollection(eCommerceScreen.getCategoriesPath());
        this(string2, eCommerceScreen.getSearchQuery(), list, CollectionUtils.mapCopyOfNullableMap(eCommerceScreen.getPayload()));
    }

    public yj(String string2, String string3, List list, Map map2) {
        this.a = string2;
        this.b = list;
        this.c = string3;
        this.d = map2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ScreenWrapper{name='");
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

