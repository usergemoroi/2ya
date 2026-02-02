/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.j2objc.annotations.Weak
 *  com.yandex.mobile.ads.impl.wj1
 *  com.yandex.mobile.ads.impl.yx1$c
 */
package com.yandex.mobile.ads.impl;

import com.google.j2objc.annotations.Weak;
import com.yandex.mobile.ads.impl.wj1;
import com.yandex.mobile.ads.impl.yx1;
import java.util.Map;
import javax.annotation.CheckForNull;

class bu0<K, V>
extends yx1.c<K> {
    @Weak
    final Map<K, V> b;

    bu0(Map<K, V> map2) {
        this.b = (Map)wj1.a(map2);
    }

    public final boolean contains(@CheckForNull Object object) {
        return this.b.containsKey(object);
    }

    public final boolean isEmpty() {
        return this.b.isEmpty();
    }

    public final int size() {
        return this.b.size();
    }
}

