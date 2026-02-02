/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.ex1$a
 *  com.yandex.mobile.ads.impl.gx1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.xj2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.gx1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.xj2;

final class zj2
implements ex1 {
    private final xj2 a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    public zj2(xj2 xj22, int n10, long l10, long l11) {
        this.a = xj22;
        this.b = n10;
        this.c = l10;
        this.d = l10 = (l11 - l10) / (long)xj22.d;
        this.e = this.c(l10);
    }

    private long c(long l10) {
        return m92.a((long)(l10 * (long)this.b), (long)1000000L, (long)this.a.c);
    }

    public final ex1.a b(long l10) {
        long l11 = (long)this.a.c * l10 / ((long)this.b * 1000000L);
        long l13 = this.d;
        int n10 = m92.a;
        l13 = Math.max(0L, Math.min(l11, l13 - 1L));
        l11 = this.c;
        long l14 = this.a.d;
        long l15 = this.c(l13);
        gx1 gx12 = new gx1(l15, l14 * l13 + l11);
        if (l15 < l10 && l13 != this.d - 1L) {
            l10 = l13 + 1L;
            l11 = this.c;
            l13 = this.a.d;
            return new ex1.a(gx12, new gx1(this.c(l10), l13 * l10 + l11));
        }
        return new ex1.a(gx12, gx12);
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return this.e;
    }
}

