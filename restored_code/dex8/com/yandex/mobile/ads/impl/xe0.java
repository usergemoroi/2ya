/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ag1
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.f41
 *  com.yandex.mobile.ads.impl.g41
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.l92
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.u40
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72$d
 *  com.yandex.mobile.ads.impl.xe0$a
 *  com.yandex.mobile.ads.impl.xe0$b
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.f41;
import com.yandex.mobile.ads.impl.g41;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.l92;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.u40;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;
import com.yandex.mobile.ads.impl.xe0;
import com.yandex.mobile.ads.impl.zs0;
import java.util.Arrays;
import java.util.Collections;

/*
 * Exception performing whole class analysis ignored.
 */
public final class xe0
implements u40 {
    private static final float[] l = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    @Nullable
    private final l92 a;
    @Nullable
    private final bg1 b;
    private final boolean[] c;
    private final a d;
    @Nullable
    private final f41 e;
    private b f;
    private long g;
    private String h;
    private g62 i;
    private boolean j;
    private long k;

    xe0(@Nullable l92 l922) {
        this.a = l922;
        this.c = new boolean[4];
        this.d = new /* Unavailable Anonymous Inner Class!! */;
        this.k = -9223372036854775807L;
        this.e = new f41(178);
        this.b = new bg1();
    }

    public final void a() {
        g41.a((boolean[])this.c);
        a a14 = this.d;
        com.yandex.mobile.ads.impl.xe0$a.b(a14, (boolean)false);
        a14.c = 0;
        com.yandex.mobile.ads.impl.xe0$a.c(a14, (int)0);
        a14 = this.f;
        if (a14 != null) {
            com.yandex.mobile.ads.impl.xe0$b.i(a14, (boolean)false);
            com.yandex.mobile.ads.impl.xe0$b.j(a14, (boolean)false);
            com.yandex.mobile.ads.impl.xe0$b.k(a14, (boolean)false);
            com.yandex.mobile.ads.impl.xe0$b.l(a14, (int)-1);
        }
        if ((a14 = this.e) != null) {
            a14.b();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    public final void a(int n10, long l10) {
        if (l10 != -9223372036854775807L) {
            this.k = l10;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void a(bg1 var1_1) {
        block41: {
            block42: {
                if (this.f == null) break block41;
                if (this.i == null) break block42;
                var3_2 = var1_1.d();
                var7_3 = var1_1.e();
                var18_4 = var1_1.c();
                this.g += (long)var1_1.a();
                this.i.a(var1_1.a(), var1_1);
                while (true) {
                    block43: {
                        block49: {
                            block44: {
                                block45: {
                                    block46: {
                                        block47: {
                                            block48: {
                                                var9_10 = g41.a((byte[])var18_4, (int)var3_2, (int)var7_3, (boolean[])this.c);
                                                var12_13 = true;
                                                if (var9_10 == var7_3) {
                                                    if (!this.j) {
                                                        this.d.a(var18_4, var3_2, var7_3);
                                                    }
                                                    if (com.yandex.mobile.ads.impl.xe0$b.c(var1_1 = this.f)) {
                                                        var4_6 = com.yandex.mobile.ads.impl.xe0$b.f(var1_1);
                                                        var5_7 = var3_2 + 1 - var4_6;
                                                        if (var5_7 < var7_3) {
                                                            if ((var18_4[var5_7] & 192) >> 6 != 0) {
                                                                var12_13 = false;
                                                            }
                                                            com.yandex.mobile.ads.impl.xe0$b.k(var1_1, (boolean)var12_13);
                                                            com.yandex.mobile.ads.impl.xe0$b.j(var1_1, (boolean)false);
                                                        } else {
                                                            com.yandex.mobile.ads.impl.xe0$b.m(var1_1, (int)(var7_3 - var3_2 + var4_6));
                                                        }
                                                    }
                                                    if ((var1_1 = this.e) != null) {
                                                        var1_1.a(var18_4, var3_2, var7_3);
                                                    }
                                                    return;
                                                }
                                                var19_17 /* !! */  = var1_1.c();
                                                var6_8 = var9_10 + 3;
                                                var5_7 = var19_17 /* !! */ [var6_8];
                                                var8_9 = var5_7 & 255;
                                                var10_11 = var9_10 - var3_2;
                                                if (this.j) break block43;
                                                if (var10_11 > 0) {
                                                    this.d.a(var18_4, var3_2, var9_10);
                                                }
                                                var4_6 = var10_11 < 0 ? -var10_11 : 0;
                                                var21_19 /* !! */  = this.d;
                                                var11_12 = com.yandex.mobile.ads.impl.xe0$a.a(var21_19 /* !! */ );
                                                if (var11_12 == 0) break block44;
                                                if (var11_12 == 1) break block45;
                                                if (var11_12 == 2) break block46;
                                                if (var11_12 == 3) break block47;
                                                if (var11_12 != 4) break block48;
                                                if (var8_9 != 179 && var8_9 != 181) break block49;
                                                var21_19 /* !! */ .c -= var4_6;
                                                com.yandex.mobile.ads.impl.xe0$a.b(var21_19 /* !! */ , (boolean)false);
                                                var19_17 /* !! */  = (byte[])this.i;
                                                var4_6 = var21_19 /* !! */ .d;
                                                var20_18 = this.h;
                                                var20_18.getClass();
                                                var21_19 /* !! */  = Arrays.copyOf(var21_19 /* !! */ .e, var21_19 /* !! */ .c);
                                                var22_20 = new ag1((var21_19 /* !! */ ).length, (byte[])var21_19 /* !! */ );
                                                var22_20.e(var4_6);
                                                var22_20.e(4);
                                                var22_20.h();
                                                var22_20.d(8);
                                                if (var22_20.f()) {
                                                    var22_20.d(4);
                                                    var22_20.d(3);
                                                }
                                                if ((var4_6 = var22_20.b(4)) == 15) {
                                                    var4_6 = var22_20.b(8);
                                                    var5_7 = var22_20.b(8);
                                                    if (var5_7 == 0) {
                                                        zs0.d((String)"H263Reader", (String)"Invalid aspect ratio");
lbl65:

                                                        while (true) {
                                                            var2_5 = 1.0f;
                                                            break;
                                                        }
                                                    } else {
                                                        var2_5 = (float)var4_6 / (float)var5_7;
                                                    }
                                                } else {
                                                    var23_21 = xe0.l;
                                                    if (var4_6 < 7) {
                                                        var2_5 = var23_21[var4_6];
                                                    } else {
                                                        zs0.d((String)"H263Reader", (String)"Invalid aspect ratio");

                                                    }
                                                }
                                                if (var22_20.f()) {
                                                    var22_20.d(2);
                                                    var22_20.d(1);
                                                    if (var22_20.f()) {
                                                        var22_20.d(15);
                                                        var22_20.h();
                                                        var22_20.d(15);
                                                        var22_20.h();
                                                        var22_20.d(15);
                                                        var22_20.h();
                                                        var22_20.d(3);
                                                        var22_20.d(11);
                                                        var22_20.h();
                                                        var22_20.d(15);
                                                        var22_20.h();
                                                    }
                                                }
                                                if (var22_20.b(2) != 0) {
                                                    zs0.d((String)"H263Reader", (String)"Unhandled video object layer shape");
                                                }
                                                var22_20.h();
                                                var4_6 = var22_20.b(16);
                                                var22_20.h();
                                                if (var22_20.f()) {
                                                    if (var4_6 == 0) {
                                                        zs0.d((String)"H263Reader", (String)"Invalid vop_increment_time_resolution");
                                                    } else {
                                                        --var4_6;
                                                        var5_7 = 0;
                                                        while (var4_6 > 0) {
                                                            ++var5_7;
                                                            var4_6 >>= 1;
                                                        }
                                                        var22_20.d(var5_7);
                                                    }
                                                }
                                                var22_20.h();
                                                var4_6 = var22_20.b(13);
                                                var22_20.h();
                                                var5_7 = var22_20.b(13);
                                                var22_20.h();
                                                var22_20.h();
                                                var19_17 /* !! */ .a(new /* Unavailable Anonymous Inner Class!! */.b((String)var20_18).e("video/mp4v-es").o(var4_6).f(var5_7).b(var2_5).a(Collections.singletonList(var21_19 /* !! */ )).a());
                                                this.j = true;
                                                break block43;
                                            }
                                            throw new IllegalStateException();
                                        }
                                        if ((var5_7 & 240) != 32) {
                                            zs0.d((String)"H263Reader", (String)"Unexpected start code value");
                                            com.yandex.mobile.ads.impl.xe0$a.b(var21_19 /* !! */ , (boolean)false);
                                            var21_19 /* !! */ .c = 0;
                                            com.yandex.mobile.ads.impl.xe0$a.c(var21_19 /* !! */ , (int)0);
                                        } else {
                                            var21_19 /* !! */ .d = var21_19 /* !! */ .c;
                                            com.yandex.mobile.ads.impl.xe0$a.c(var21_19 /* !! */ , (int)4);
                                        }
                                        break block49;
                                    }
                                    if (var8_9 > 31) {
                                        zs0.d((String)"H263Reader", (String)"Unexpected start code value");
                                        com.yandex.mobile.ads.impl.xe0$a.b(var21_19 /* !! */ , (boolean)false);
                                        var21_19 /* !! */ .c = 0;
                                        com.yandex.mobile.ads.impl.xe0$a.c(var21_19 /* !! */ , (int)0);
                                    } else {
                                        com.yandex.mobile.ads.impl.xe0$a.c(var21_19 /* !! */ , (int)3);
                                    }
                                    break block49;
                                }
                                if (var8_9 != 181) {
                                    zs0.d((String)"H263Reader", (String)"Unexpected start code value");
                                    com.yandex.mobile.ads.impl.xe0$a.b(var21_19 /* !! */ , (boolean)false);
                                    var21_19 /* !! */ .c = 0;
                                    com.yandex.mobile.ads.impl.xe0$a.c(var21_19 /* !! */ , (int)0);
                                } else {
                                    com.yandex.mobile.ads.impl.xe0$a.c(var21_19 /* !! */ , (int)2);
                                }
                                break block49;
                            }
                            if (var8_9 == 176) {
                                com.yandex.mobile.ads.impl.xe0$a.c(var21_19 /* !! */ , (int)1);
                                com.yandex.mobile.ads.impl.xe0$a.b(var21_19 /* !! */ , (boolean)true);
                            }
                        }
                        var21_19 /* !! */ .a(com.yandex.mobile.ads.impl.xe0$a.d(), 0, 3);
                    }
                    if (com.yandex.mobile.ads.impl.xe0$b.c(var19_17 /* !! */  = (byte[])this.f)) {
                        var5_7 = com.yandex.mobile.ads.impl.xe0$b.f(var19_17 /* !! */ );
                        var4_6 = var3_2 + 1 - var5_7;
                        if (var4_6 < var9_10) {
                            var12_13 = (var18_4[var4_6] & 192) >> 6 == 0;
                            com.yandex.mobile.ads.impl.xe0$b.k(var19_17 /* !! */ , (boolean)var12_13);
                            com.yandex.mobile.ads.impl.xe0$b.j(var19_17 /* !! */ , (boolean)false);
                        } else {
                            com.yandex.mobile.ads.impl.xe0$b.m(var19_17 /* !! */ , (int)(var5_7 + var10_11));
                        }
                    }
                    if ((var19_17 /* !! */  = (byte[])this.e) != null) {
                        if (var10_11 > 0) {
                            var19_17 /* !! */ .a(var18_4, var3_2, var9_10);
                            var3_2 = 0;
                        } else {
                            var3_2 = -var10_11;
                        }
                        if (this.e.a(var3_2)) {
                            var20_18 = this.e;
                            var19_17 /* !! */  = var20_18.d;
                            var3_2 = g41.a((int)var20_18.e, (byte[])var19_17 /* !! */ );
                            var19_17 /* !! */  = (byte[])this.b;
                            var4_6 = m92.a;
                            var19_17 /* !! */ .a(var3_2, this.e.d);
                            this.a.a(this.k, this.b);
                        }
                        if (var8_9 == 178 && var1_1.c()[var9_10 + 2] == 1) {
                            this.e.b(var8_9);
                        }
                    }
                    var13_14 = true;
                    var4_6 = var7_3 - var9_10;
                    var14_15 = this.g - (long)var4_6;
                    var19_17 /* !! */  = (byte[])this.f;
                    var12_13 = this.j;
                    if (com.yandex.mobile.ads.impl.xe0$b.e(var19_17 /* !! */ ) == 182 && var12_13 && com.yandex.mobile.ads.impl.xe0$b.b(var19_17 /* !! */ ) && (var16_16 = com.yandex.mobile.ads.impl.xe0$b.h(var19_17 /* !! */ )) != -9223372036854775807L) {
                        var5_7 = (int)(var14_15 - com.yandex.mobile.ads.impl.xe0$b.g(var19_17 /* !! */ ));
                        var3_2 = (int)com.yandex.mobile.ads.impl.xe0$b.d(var19_17 /* !! */ );
                        com.yandex.mobile.ads.impl.xe0$b.a(var19_17 /* !! */ ).a(var16_16, var3_2, var5_7, var4_6, null);
                    }
                    if (com.yandex.mobile.ads.impl.xe0$b.e(var19_17 /* !! */ ) != 179) {
                        com.yandex.mobile.ads.impl.xe0$b.n(var19_17 /* !! */ , (long)var14_15);
                    }
                    var19_17 /* !! */  = (byte[])this.f;
                    var14_15 = this.k;
                    com.yandex.mobile.ads.impl.xe0$b.l(var19_17 /* !! */ , (int)var8_9);
                    com.yandex.mobile.ads.impl.xe0$b.k(var19_17 /* !! */ , (boolean)false);
                    var12_13 = var8_9 == 182 || var8_9 == 179;
                    com.yandex.mobile.ads.impl.xe0$b.i(var19_17 /* !! */ , (boolean)var12_13);
                    var12_13 = var8_9 == 182 ? var13_14 : false;
                    com.yandex.mobile.ads.impl.xe0$b.j(var19_17 /* !! */ , (boolean)var12_13);
                    com.yandex.mobile.ads.impl.xe0$b.m(var19_17 /* !! */ , (int)0);
                    com.yandex.mobile.ads.impl.xe0$b.o(var19_17 /* !! */ , (long)var14_15);
                    var3_2 = var6_8;
                }
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public final void a(v70 v702, w72.d d14) {
        g62 g622;
        d14.a();
        this.h = d14.b();
        this.i = g622 = v702.a(d14.c(), 2);
        this.f = new /* Unavailable Anonymous Inner Class!! */;
        g622 = this.a;
        if (g622 != null) {
            g622.a(v702, d14);
        }
    }

    public final void b() {
    }
}

