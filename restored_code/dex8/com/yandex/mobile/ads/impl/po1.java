/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.wj1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.wj1;
import com.yandex.mobile.ads.impl.xj0;
import java.util.Objects;

final class po1<E>
extends xj0<E> {
    static final xj0<Object> g = new po1<Object>(0, new Object[0]);
    final transient Object[] e;
    private final transient int f;

    po1(int n10, Object[] objectArray) {
        this.e = objectArray;
        this.f = n10;
    }

    @Override
    final int a(int n10, Object[] objectArray) {
        System.arraycopy(this.e, 0, objectArray, n10, this.f);
        return n10 + this.f;
    }

    final Object[] c() {
        return this.e;
    }

    final int d() {
        return this.f;
    }

    final int e() {
        return 0;
    }

    final boolean f() {
        return false;
    }

    @Override
    public final E get(int n10) {
        wj1.a((int)n10, (int)this.f);
        Object object = this.e[n10];
        Objects.requireNonNull(object);
        return (E)object;
    }

    @Override
    public final int size() {
        return this.f;
    }
}

