/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.xj1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.g;
import com.yandex.mobile.ads.impl.xj1;
import java.util.Iterator;
import javax.annotation.CheckForNull;

final class gq0
extends g<Object> {
    final Iterator d;
    final xj1 e;

    gq0(Iterator iterator, xj1 xj12) {
        this.d = iterator;
        this.e = xj12;
    }

    @Override
    @CheckForNull
    protected final Object a() {
        while (this.d.hasNext()) {
            Object e11 = this.d.next();
            if (!this.e.apply(e11)) continue;
            return e11;
        }
        this.b();
        return null;
    }
}

