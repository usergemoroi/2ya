/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.w31$c
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.w31;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

final class v31
extends w31.c<Object> {
    final Comparator a;

    v31(Comparator comparator) {
        this.a = comparator;
    }

    final <K, V> Map<K, Collection<V>> b() {
        return new TreeMap(this.a);
    }
}

