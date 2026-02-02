/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.p82
 *  com.yandex.mobile.ads.impl.wj1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.hq0;
import com.yandex.mobile.ads.impl.p82;
import com.yandex.mobile.ads.impl.wj1;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.zj0;
import javax.annotation.CheckForNull;

final class gz1<E>
extends zj0<E> {
    final transient E d;

    gz1(E e11) {
        this.d = wj1.a(e11);
    }

    final int a(int n10, Object[] objectArray) {
        objectArray[n10] = this.d;
        return n10 + 1;
    }

    @Override
    public final xj0<E> b() {
        return xj0.a(this.d);
    }

    @Override
    public final boolean contains(@CheckForNull Object object) {
        return this.d.equals(object);
    }

    final boolean f() {
        return false;
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override
    public final p82<E> iterator() {
        return new hq0(this.d);
    }

    @Override
    public final int size() {
        return 1;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        stringBuilder.append(this.d.toString());
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

