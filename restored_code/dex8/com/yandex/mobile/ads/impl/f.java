/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.wj1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.q82;
import com.yandex.mobile.ads.impl.wj1;
import java.util.NoSuchElementException;

abstract class f<E>
extends q82<E> {
    private final int b;
    private int c;

    protected f(int n10, int n12) {
        wj1.b((int)n12, (int)n10);
        this.b = n10;
        this.c = n12;
    }

    protected abstract E a(int var1);

    @Override
    public final boolean hasNext() {
        boolean bl2 = this.c < this.b;
        return bl2;
    }

    @Override
    public final boolean hasPrevious() {
        boolean bl2 = this.c > 0;
        return bl2;
    }

    @Override
    public final E next() {
        if (this.hasNext()) {
            int n10 = this.c;
            this.c = n10 + 1;
            return this.a(n10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int nextIndex() {
        return this.c;
    }

    @Override
    public final E previous() {
        if (this.hasPrevious()) {
            int n10;
            this.c = n10 = this.c - 1;
            return this.a(n10);
        }
        throw new NoSuchElementException();
    }

    @Override
    public final int previousIndex() {
        return this.c - 1;
    }
}

