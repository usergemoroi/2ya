/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  com.yandex.mobile.ads.impl.ex1$a
 *  com.yandex.mobile.ads.impl.gx1
 *  com.yandex.mobile.ads.impl.m92
 */
package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.gx1;
import com.yandex.mobile.ads.impl.hx1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.y01;

final class z01
implements hx1 {
    private final long[] a;
    private final long[] b;
    private final long c;

    private z01(long l10, long[] lArray, long[] lArray2) {
        this.a = lArray;
        this.b = lArray2;
        if (l10 == -9223372036854775807L) {
            l10 = m92.a((long)lArray2[lArray2.length - 1]);
        }
        this.c = l10;
    }

    private static Pair<Long, Long> a(long l10, long[] lArray, long[] lArray2) {
        int n10 = m92.b((long[])lArray, (long)l10, (boolean)true);
        long l11 = lArray[n10];
        long l13 = lArray2[n10];
        if (++n10 == lArray.length) {
            return Pair.create((Object)l11, (Object)l13);
        }
        long l14 = lArray[n10];
        long l15 = lArray2[n10];
        double d14 = l14 == l11 ? 0.0 : ((double)l10 - (double)l11) / (double)(l14 - l11);
        return Pair.create((Object)l10, (Object)((long)(d14 * (double)(l15 - l13)) + l13));
    }

    public static z01 a(long l10, y01 y012, long l11) {
        int n10 = y012.f.length;
        int n13 = n10 + 1;
        long[] lArray = new long[n13];
        long[] lArray2 = new long[n13];
        lArray[0] = l10;
        long l13 = 0L;
        lArray2[0] = 0L;
        for (n13 = 1; n13 <= n10; ++n13) {
            int n14 = y012.d;
            int[] nArray = y012.f;
            int n15 = n13 - 1;
            lArray[n13] = l10 += (long)(n14 + nArray[n15]);
            lArray2[n13] = l13 += (long)(y012.e + y012.g[n15]);
        }
        return new z01(l11, lArray, lArray2);
    }

    @Override
    public final long a() {
        return -1L;
    }

    @Override
    public final long a(long l10) {
        return m92.a((long)((Long)z01.a((long)l10, (long[])this.a, (long[])this.b).second));
    }

    public final ex1.a b(long l10) {
        long l11 = this.c;
        int n10 = m92.a;
        gx1 gx12 = z01.a(m92.b((long)Math.max(0L, Math.min(l10, l11))), this.b, this.a);
        gx12 = new gx1(m92.a((long)((Long)gx12.first)), ((Long)gx12.second).longValue());
        return new ex1.a(gx12, gx12);
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return this.c;
    }
}

