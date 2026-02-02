/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.f41
 *  com.yandex.mobile.ads.impl.g41
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.l92
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.u40
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72$d
 *  com.yandex.mobile.ads.impl.we0$a
 */
package com.yandex.mobile.ads.impl;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.f41;
import com.yandex.mobile.ads.impl.g41;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.l92;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.u40;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;
import com.yandex.mobile.ads.impl.we0;
import java.util.Arrays;
import java.util.Collections;

/*
 * Exception performing whole class analysis ignored.
 */
public final class we0
implements u40 {
    private static final double[] q = new double[]{23.976023976023978, 24.0, 25.0, 29.97002997002997, 30.0, 50.0, 59.94005994005994, 60.0};
    private String a;
    private g62 b;
    @Nullable
    private final l92 c;
    @Nullable
    private final bg1 d;
    @Nullable
    private final f41 e;
    private final boolean[] f;
    private final a g;
    private long h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private long n;
    private boolean o;
    private boolean p;

    we0(@Nullable l92 l922) {
        this.c = l922;
        this.f = new boolean[4];
        this.g = new /* Unavailable Anonymous Inner Class!! */;
        if (l922 != null) {
            this.e = new f41(178);
            this.d = new bg1();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    public final void a() {
        g41.a((boolean[])this.f);
        a a14 = this.g;
        com.yandex.mobile.ads.impl.we0$a.b(a14, (boolean)false);
        a14.b = 0;
        a14.c = 0;
        a14 = this.e;
        if (a14 != null) {
            a14.b();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    public final void a(int n10, long l10) {
        this.l = l10;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(bg1 var1_1) {
        block22: {
            if (this.b == null) break block22;
            var9_2 = var1_1.d();
            var8_3 = var1_1.e();
            var19_4 = var1_1.c();
            this.h += (long)var1_1.a();
            this.b.a(var1_1.a(), var1_1);
            while (true) {
                block23: {
                    block26: {
                        block24: {
                            block21: {
                                block27: {
                                    block28: {
                                        block29: {
                                            block25: {
                                                if ((var12_11 = g41.a((byte[])var19_4, (int)var9_2, (int)var8_3, (boolean[])this.f)) == var8_3) {
                                                    if (!this.j) {
                                                        this.g.a(var19_4, var9_2, var8_3);
                                                    }
                                                    if ((var1_1 = this.e) != null) {
                                                        var1_1.a(var19_4, var9_2, var8_3);
                                                    }
                                                    return;
                                                }
                                                var20_17 /* !! */  = var1_1.c();
                                                var10_9 = var12_11 + 3;
                                                var11_10 = var20_17 /* !! */ [var10_9] & 255;
                                                var13_12 = var12_11 - var9_2;
                                                if (this.j) break block23;
                                                if (var13_12 > 0) {
                                                    this.g.a(var19_4, var9_2, var12_11);
                                                }
                                                var7_8 = var13_12 < 0 ? -var13_12 : 0;
                                                var21_18 = this.g;
                                                if (!com.yandex.mobile.ads.impl.we0$a.a(var21_18)) break block24;
                                                var21_18.b = var7_8 = var21_18.b - var7_8;
                                                if (var21_18.c != 0 || var11_10 != 181) break block25;
                                                var21_18.c = var7_8;
                                                break block26;
                                            }
                                            com.yandex.mobile.ads.impl.we0$a.b(var21_18, (boolean)false);
                                            var22_19 = this.a;
                                            var22_19.getClass();
                                            var20_17 /* !! */  = Arrays.copyOf(var21_18.d, var21_18.b);
                                            var14_13 = var20_17 /* !! */ [4];
                                            var15_14 = var20_17 /* !! */ [5];
                                            var7_8 = var20_17 /* !! */ [6];
                                            var14_13 = (var14_13 & 255) << 4 | (var15_14 & 255) >> 4;
                                            var15_14 = var7_8 & 255 | (var15_14 & 15) << 8;
                                            var7_8 = (var20_17 /* !! */ [7] & 240) >> 4;
                                            if (var7_8 == 2) break block27;
                                            if (var7_8 == 3) break block28;
                                            if (var7_8 == 4) break block29;
                                            var6_7 = 1.0f;
                                            break block21;
                                        }
                                        var6_7 = var15_14 * 121;
                                        var7_8 = var14_13 * 100;
lbl48:

                                        while (true) {
                                            var6_7 /= (float)var7_8;
                                            break block21;
                                            break;
                                        }
                                    }
                                    var6_7 = var15_14 * 16;
                                    var7_8 = var14_13 * 9;

                                }
                                var6_7 = var15_14 * 4;
                                var7_8 = var14_13 * 3;

                            }
                            var23_20 = new /* Unavailable Anonymous Inner Class!! */.b((String)var22_19).e("video/mpeg2").o(var14_13).f(var15_14).b(var6_7).a(Collections.singletonList(var20_17 /* !! */ )).a();
                            var7_8 = (var20_17 /* !! */ [7] & 15) - 1;
                            if (var7_8 < 0) ** GOTO lbl-1000
                            var22_19 = we0.q;
                            if (var7_8 < 8) {
                                var4_6 = var22_19[var7_8];
                                var14_13 = var20_17 /* !! */ [var21_18.c + 9];
                                var7_8 = (var14_13 & 96) >> 5;
                                var2_5 = var4_6;
                                if (var7_8 != (var14_13 &= 31)) {
                                    var2_5 = var4_6 * (((double)var7_8 + 1.0) / (double)(var14_13 + 1));
                                }
                                var16_15 = (long)(1000000.0 / var2_5);
                            } else // 2 sources

                            {
                                var16_15 = 0L;
                            }
                            var20_17 /* !! */  = (byte[])Pair.create((Object)var23_20, (Object)var16_15);
                            this.b.a((cc0)var20_17 /* !! */ .first);
                            this.k = (Long)var20_17 /* !! */ .second;
                            this.j = true;
                            break block23;
                        }
                        if (var11_10 == 179) {
                            com.yandex.mobile.ads.impl.we0$a.b(var21_18, (boolean)true);
                        }
                    }
                    var21_18.a(com.yandex.mobile.ads.impl.we0$a.c(), 0, 3);
                }
                if ((var20_17 /* !! */  = (byte[])this.e) != null) {
                    if (var13_12 > 0) {
                        var20_17 /* !! */ .a(var19_4, var9_2, var12_11);
                        var7_8 = 0;
                    } else {
                        var7_8 = -var13_12;
                    }
                    if (this.e.a(var7_8)) {
                        var21_18 = this.e;
                        var20_17 /* !! */  = var21_18.d;
                        var7_8 = g41.a((int)var21_18.e, (byte[])var20_17 /* !! */ );
                        var20_17 /* !! */  = (byte[])this.d;
                        var9_2 = m92.a;
                        var20_17 /* !! */ .a(var7_8, this.e.d);
                        this.c.a(this.n, this.d);
                    }
                    if (var11_10 == 178 && var1_1.c()[var12_11 + 2] == 1) {
                        this.e.b(var11_10);
                    }
                }
                if (var11_10 != 0 && var11_10 != 179) {
                    if (var11_10 == 184) {
                        this.o = true;
                    }
                } else {
                    var12_11 = var8_3 - var12_11;
                    if (this.p && this.j && (var16_15 = this.n) != -9223372036854775807L) {
                        var9_2 = (int)this.o;
                        var7_8 = (int)(this.h - this.m);
                        this.b.a(var16_15, var9_2, var7_8 - var12_11, var12_11, null);
                    }
                    if (!this.i || this.p) {
                        this.m = this.h - (long)var12_11;
                        var16_15 = this.l;
                        if (var16_15 == -9223372036854775807L) {
                            var16_15 = this.n;
                            var16_15 = var16_15 != -9223372036854775807L ? (var16_15 += this.k) : -9223372036854775807L;
                        }
                        this.n = var16_15;
                        this.o = false;
                        this.l = -9223372036854775807L;
                        this.i = true;
                    }
                    var18_16 = var11_10 == 0;
                    this.p = var18_16;
                }
                var9_2 = var10_9;
            }
        }
        throw new IllegalStateException();
    }

    public final void a(v70 v702, w72.d d14) {
        d14.a();
        this.a = d14.b();
        this.b = v702.a(d14.c(), 2);
        l92 l922 = this.c;
        if (l922 != null) {
            l922.a(v702, d14);
        }
    }

    public final void b() {
    }
}

