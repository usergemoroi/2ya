/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.l
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.l;
import java.io.Serializable;

final class wj0<K, V>
extends l<K, V>
implements Serializable {
    private static final long serialVersionUID = 0L;
    final K b;
    final V c;

    wj0(K k11, V v14) {
        this.b = k11;
        this.c = v14;
    }

    public final K getKey() {
        return this.b;
    }

    public final V getValue() {
        return this.c;
    }

    public final V setValue(V v14) {
        throw new UnsupportedOperationException();
    }
}

