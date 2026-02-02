/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.ex1$a
 *  com.yandex.mobile.ads.impl.gx1
 *  com.yandex.mobile.ads.impl.m92
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.gx1;
import com.yandex.mobile.ads.impl.m92;
import java.util.Arrays;

public final class wn
implements ex1 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public wn(int[] nArray, long[] lArray, long[] lArray2, long[] lArray3) {
        int n10;
        this.b = nArray;
        this.c = lArray;
        this.d = lArray2;
        this.e = lArray3;
        this.a = n10 = nArray.length;
        this.f = n10 > 0 ? lArray2[--n10] + lArray3[n10] : 0L;
    }

    public final ex1.a b(long l10) {
        int n10 = m92.b((long[])this.e, (long)l10, (boolean)true);
        long[] lArray = this.e;
        long l11 = lArray[n10];
        long[] lArray2 = this.c;
        gx1 gx12 = new gx1(l11, lArray2[n10]);
        if (l11 < l10 && n10 != this.a - 1) {
            return new ex1.a(gx12, new gx1(lArray[++n10], lArray2[n10]));
        }
        return new ex1.a(gx12, gx12);
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return this.f;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ChunkIndex(length=");
        stringBuilder.append(this.a);
        stringBuilder.append(", sizes=");
        stringBuilder.append(Arrays.toString(this.b));
        stringBuilder.append(", offsets=");
        stringBuilder.append(Arrays.toString(this.c));
        stringBuilder.append(", timeUs=");
        stringBuilder.append(Arrays.toString(this.e));
        stringBuilder.append(", durationsUs=");
        stringBuilder.append(Arrays.toString(this.d));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

