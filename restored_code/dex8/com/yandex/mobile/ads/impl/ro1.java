/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.df0
 *  com.yandex.mobile.ads.impl.p82
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.df0;
import com.yandex.mobile.ads.impl.p82;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.zj0;
import javax.annotation.CheckForNull;

final class ro1<E>
extends zj0<E> {
    private static final Object[] i;
    static final ro1<Object> j;
    final transient Object[] d;
    private final transient int e;
    final transient Object[] f;
    private final transient int g;
    private final transient int h;

    static {
        Object[] objectArray = new Object[]{};
        j = new ro1(objectArray, 0, objectArray, 0, 0);
    }

    ro1(Object[] objectArray, int n10, Object[] objectArray2, int n13, int n14) {
        this.d = objectArray;
        this.e = n10;
        this.f = objectArray2;
        this.g = n13;
        this.h = n14;
    }

    final int a(int n10, Object[] objectArray) {
        System.arraycopy(this.d, 0, objectArray, n10, this.h);
        return n10 + this.h;
    }

    final Object[] c() {
        return this.d;
    }

    @Override
    public final boolean contains(@CheckForNull Object object) {
        Object[] objectArray = this.f;
        if (object != null && objectArray.length != 0) {
            int n10 = df0.a((int)object.hashCode());
            while (true) {
                Object object2;
                if ((object2 = objectArray[n10 &= this.g]) == null) {
                    return false;
                }
                if (object2.equals(object)) {
                    return true;
                }
                ++n10;
            }
        }
        return false;
    }

    final int d() {
        return this.h;
    }

    final int e() {
        return 0;
    }

    final boolean f() {
        return false;
    }

    @Override
    final xj0<E> g() {
        Object[] objectArray = this.d;
        return xj0.b(this.h, objectArray);
    }

    @Override
    public final int hashCode() {
        return this.e;
    }

    @Override
    public final p82<E> iterator() {
        return this.b().a(0);
    }

    @Override
    public final int size() {
        return this.h;
    }
}

