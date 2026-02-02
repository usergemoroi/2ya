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

final class pl2
implements hx1 {
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    @Nullable
    private final long[] f;

    private pl2(long l10, int n10, long l11, long l13, @Nullable long[] lArray) {
        this.a = l10;
        this.b = n10;
        this.c = l11;
        this.f = lArray;
        this.d = l13;
        l11 = -1L;
        l10 = l13 == -1L ? l11 : (l10 += l13);
        this.e = l10;
    }

    @Nullable
    public static pl2 a(long l10, long l11, g21.a a14, bg1 object) {
        int n10;
        int n13 = a14.g;
        int n14 = a14.d;
        int n15 = object.h();
        if ((n15 & 1) == 1 && (n10 = object.x()) != 0) {
            long l13;
            long l14 = m92.a((long)n10, (long)((long)n13 * 1000000L), (long)n14);
            if ((n15 & 6) != 6) {
                return new pl2(l11, a14.c, l14, -1L, null);
            }
            long l15 = object.v();
            long[] lArray = new long[100];
            for (n14 = 0; n14 < 100; ++n14) {
                lArray[n14] = object.t();
            }
            if (l10 != -1L && l10 != (l13 = l11 + l15)) {
                object = new StringBuilder("XING data size mismatch: ");
                ((StringBuilder)object).append(l10);
                ((StringBuilder)object).append(", ");
                ((StringBuilder)object).append(l13);
                zs0.d((String)"XingSeeker", (String)((StringBuilder)object).toString());
            }
            return new pl2(l11, a14.c, l14, l15, lArray);
        }
        return null;
    }

    @Override
    public final long a() {
        return this.e;
    }

    @Override
    public final long a(long l10) {
        if (this.b() && (l10 -= this.a) > (long)this.b) {
            long[] lArray = this.f;
            if (lArray != null) {
                double d14 = (double)l10 * 256.0 / (double)this.d;
                int n10 = m92.b((long[])lArray, (long)((long)d14), (boolean)true);
                l10 = this.c;
                long l11 = (long)n10 * l10 / 100L;
                long l13 = lArray[n10];
                int n13 = n10 + 1;
                long l14 = l10 * (long)n13 / 100L;
                l10 = n10 == 99 ? 256L : lArray[n13];
                d14 = l13 == l10 ? 0.0 : (d14 - (double)l13) / (double)(l10 - l13);
                return Math.round(d14 * (double)(l14 - l11)) + l11;
            }
            throw new IllegalStateException();
        }
        return 0L;
    }

    public final ex1.a b(long l10) {
        block6: {
            Object object;
            double d14;
            long l11;
            block4: {
                double d15;
                int n10;
                block5: {
                    if (!this.b()) {
                        gx1 gx12 = new gx1(0L, this.a + (long)this.b);
                        return new ex1.a(gx12, gx12);
                    }
                    l11 = this.c;
                    n10 = m92.a;
                    l10 = Math.max(0L, Math.min(l10, l11));
                    d15 = (double)l10 * 100.0 / (double)this.c;
                    d14 = 0.0;
                    if (d15 <= 0.0) break block4;
                    if (!(d15 >= 100.0)) break block5;
                    d14 = 256.0;
                    break block4;
                }
                n10 = (int)d15;
                object = this.f;
                if (object == null) break block6;
                double d16 = object[n10];
                d14 = n10 == 99 ? 256.0 : (double)object[n10 + 1];
                d14 = d16 + (d14 - d16) * (d15 - (double)n10);
            }
            l11 = Math.round(d14 / 256.0 * (double)this.d);
            l11 = Math.max((long)this.b, Math.min(l11, this.d - 1L));
            object = new gx1(l10, this.a + l11);
            return new ex1.a((gx1)object, (gx1)object);
        }
        throw new IllegalStateException();
    }

    public final boolean b() {
        boolean bl2 = this.f != null;
        return bl2;
    }

    public final long c() {
        return this.c;
    }
}

