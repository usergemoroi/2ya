/*
 * Decompiled with CFR 0.152.
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.g;
import com.yandex.mobile.ads.impl.xx1;
import java.util.Iterator;
import javax.annotation.CheckForNull;

final class wx1
extends g<Object> {
    final Iterator<Object> d;
    final xx1 e;

    wx1(xx1 xx12) {
        this.e = xx12;
        this.d = xx12.b.iterator();
    }

    @Override
    @CheckForNull
    protected final Object a() {
        while (this.d.hasNext()) {
            Object object = this.d.next();
            if (!this.e.c.contains(object)) continue;
            return object;
        }
        this.b();
        return null;
    }
}

