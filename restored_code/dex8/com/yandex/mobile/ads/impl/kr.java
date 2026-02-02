/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.ex1$a
 *  com.yandex.mobile.ads.impl.gx1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.gx1;

public class kr
implements ex1 {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;
    private final boolean g;

    public kr(int n10, int n13, long l10, long l11, boolean bl2) {
        this.a = l10;
        this.b = l11;
        int n14 = n13;
        if (n13 == -1) {
            n14 = 1;
        }
        this.c = n14;
        this.e = n10;
        this.g = bl2;
        if (l10 == -1L) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            this.d = l10 - l11;
            this.f = kr.a(n10, l10, l11);
        }
    }

    private static long a(int n10, long l10, long l11) {
        return Math.max(0L, l10 - l11) * 8000000L / (long)n10;
    }

    public long a(long l10) {
        return this.c(l10);
    }

    public final ex1.a b(long l10) {
        long l11;
        long l13 = this.d;
        long l14 = l13 - -1L;
        long l15 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (l15 == false && !this.g) {
            gx1 gx12 = new gx1(0L, this.b);
            return new ex1.a(gx12, gx12);
        }
        long l16 = (long)this.e * l10 / 8000000L;
        long l17 = this.c;
        l16 = l11 = l16 / l17 * l17;
        if (l15 != false) {
            l16 = Math.min(l11, l13 - l17);
        }
        l16 = Math.max(l16, 0L);
        l11 = this.b;
        l16 += l11;
        l11 = kr.a(this.e, l16, l11);
        gx1 gx13 = new gx1(l11, l16);
        if (this.d != -1L && l11 < l10 && (l10 = l16 + (long)this.c) < this.a) {
            l16 = this.b;
            return new ex1.a(gx13, new gx1(kr.a(this.e, l10, l16), l10));
        }
        return new ex1.a(gx13, gx13);
    }

    public final boolean b() {
        boolean bl2 = this.d != -1L || this.g;
        return bl2;
    }

    public final long c() {
        return this.f;
    }

    public final long c(long l10) {
        long l11 = this.b;
        return kr.a(this.e, l10, l11);
    }
}

