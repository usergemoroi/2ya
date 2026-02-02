/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.ex1$a
 *  com.yandex.mobile.ads.impl.gx1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.uf
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.gx1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.uf;

public final class mk0
implements ex1 {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final boolean d;

    public mk0(long l10, long[] lArray, long[] lArray2) {
        boolean bl2 = lArray.length == lArray2.length;
        uf.a((boolean)bl2);
        int n10 = lArray2.length;
        bl2 = n10 > 0;
        this.d = bl2;
        if (bl2 && lArray2[0] > 0L) {
            int n13 = n10 + 1;
            long[] lArray3 = new long[n13];
            this.a = lArray3;
            long[] lArray4 = new long[n13];
            this.b = lArray4;
            System.arraycopy(lArray, 0, lArray3, 1, n10);
            System.arraycopy(lArray2, 0, lArray4, 1, n10);
        } else {
            this.a = lArray;
            this.b = lArray2;
        }
        this.c = l10;
    }

    public final ex1.a b(long l10) {
        if (!this.d) {
            gx1 gx12 = gx1.c;
            return new ex1.a(gx12, gx12);
        }
        int n10 = m92.b((long[])this.b, (long)l10, (boolean)true);
        long[] lArray = this.b;
        long l11 = lArray[n10];
        long[] lArray2 = this.a;
        gx1 gx13 = new gx1(l11, lArray2[n10]);
        if (l11 != l10 && n10 != lArray.length - 1) {
            return new ex1.a(gx13, new gx1(lArray[++n10], lArray2[n10]));
        }
        return new ex1.a(gx13, gx13);
    }

    public final boolean b() {
        return this.d;
    }

    public final long c() {
        return this.c;
    }
}

