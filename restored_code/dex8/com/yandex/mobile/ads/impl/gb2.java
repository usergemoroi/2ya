/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.ex1$a
 *  com.yandex.mobile.ads.impl.g21$a
 *  com.yandex.mobile.ads.impl.gx1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.g21;
import com.yandex.mobile.ads.impl.gx1;
import com.yandex.mobile.ads.impl.hx1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.zs0;

final class gb2
implements hx1 {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;

    private gb2(long[] lArray, long[] lArray2, long l10, long l11) {
        this.a = lArray;
        this.b = lArray2;
        this.c = l10;
        this.d = l11;
    }

    @Nullable
    public static gb2 a(long l10, long l11, g21.a object, bg1 object2) {
        object2.f(10);
        int n10 = object2.h();
        if (n10 <= 0) {
            return null;
        }
        int n12 = object.d;
        long l13 = n10;
        n10 = n12 >= 32000 ? 1152 : 576;
        long l14 = m92.a((long)l13, (long)((long)n10 * 1000000L), (long)n12);
        int n13 = object2.z();
        n12 = object2.z();
        int n14 = object2.z();
        object2.f(2);
        long l15 = l11 + (long)object.c;
        object = new long[n13];
        long[] lArray = new long[n13];
        l13 = l11;
        l11 = l15;
        for (int i14 = 0; i14 < n13; ++i14) {
            object[i14] = (g21.a)((long)i14 * l14 / (long)n13);
            lArray[i14] = Math.max(l13, l11);
            if (n14 != 1) {
                if (n14 != 2) {
                    if (n14 != 3) {
                        if (n14 != 4) {
                            return null;
                        }
                        n10 = object2.x();
                    } else {
                        n10 = object2.w();
                    }
                } else {
                    n10 = object2.z();
                }
            } else {
                n10 = object2.t();
            }
            l13 += (long)n10 * (long)n12;
        }
        if (l10 != -1L && l10 != l13) {
            object2 = new StringBuilder("VBRI data size mismatch: ");
            ((StringBuilder)object2).append(l10);
            ((StringBuilder)object2).append(", ");
            ((StringBuilder)object2).append(l13);
            zs0.d((String)"VbriSeeker", (String)((StringBuilder)object2).toString());
        }
        return new gb2((long[])object, lArray, l14, l13);
    }

    @Override
    public final long a() {
        return this.d;
    }

    @Override
    public final long a(long l10) {
        return this.a[m92.b((long[])this.b, (long)l10, (boolean)true)];
    }

    public final ex1.a b(long l10) {
        int n10 = m92.b((long[])this.a, (long)l10, (boolean)true);
        long[] lArray = this.a;
        long l11 = lArray[n10];
        long[] lArray2 = this.b;
        gx1 gx12 = new gx1(l11, lArray2[n10]);
        if (l11 < l10 && n10 != lArray.length - 1) {
            return new ex1.a(gx12, new gx1(lArray[++n10], lArray2[n10]));
        }
        return new ex1.a(gx12, gx12);
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return this.c;
    }
}

