/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.q32
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.q32;
import com.yandex.mobile.ads.impl.wu;
import java.util.Collections;
import java.util.List;

final class p32
implements q32 {
    private final wu[] b;
    private final long[] c;

    public p32(wu[] wuArray, long[] lArray) {
        this.b = wuArray;
        this.c = lArray;
    }

    public final int a() {
        return this.c.length;
    }

    public final int a(long l10) {
        int n10 = m92.a((long[])this.c, (long)l10, (boolean)false);
        if (n10 >= this.c.length) {
            n10 = -1;
        }
        return n10;
    }

    public final long a(int n10) {
        if (n10 >= 0) {
            long[] lArray = this.c;
            if (n10 < lArray.length) {
                return lArray[n10];
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final List<wu> b(long l10) {
        wu wu3;
        int n10 = m92.b((long[])this.c, (long)l10, (boolean)false);
        if (n10 != -1 && (wu3 = this.b[n10]) != wu.s) {
            return Collections.singletonList(wu3);
        }
        return Collections.emptyList();
    }
}

