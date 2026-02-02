/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.w31$c
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ur0;
import com.yandex.mobile.ads.impl.w31;
import com.yandex.mobile.ads.impl.y31;

final class x31
extends w31.b<Object, Object> {
    final int a;
    final w31.c b;

    x31(w31.c c11) {
        this.b = c11;
        this.a = 2;
    }

    @Override
    public final <K, V> ur0<K, V> b() {
        return new y31(this.b.b(), new w31.a(this.a));
    }
}

