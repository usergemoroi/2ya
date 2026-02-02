/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.p82
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.p82;
import java.util.NoSuchElementException;

final class hq0
extends p82<Object> {
    boolean b;
    final Object c;

    hq0(Object object) {
        this.c = object;
    }

    public final boolean hasNext() {
        return this.b ^ true;
    }

    public final Object next() {
        if (!this.b) {
            this.b = true;
            return this.c;
        }
        throw new NoSuchElementException();
    }
}

