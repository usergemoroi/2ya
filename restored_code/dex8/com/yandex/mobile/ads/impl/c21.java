/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.be0
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.c21$a
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.ex1$a
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.g41
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.gx1
 *  com.yandex.mobile.ads.impl.h62
 *  com.yandex.mobile.ads.impl.iv
 *  com.yandex.mobile.ads.impl.ix1
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.k01$b
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.q01
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.s
 *  com.yandex.mobile.ads.impl.sr0
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.v02
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.vn
 *  com.yandex.mobile.ads.impl.y52
 *  com.yandex.mobile.ads.impl.yd0
 *  com.yandex.mobile.ads.impl.zg
 */
package com.yandex.mobile.ads.impl;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a21;
import com.yandex.mobile.ads.impl.be0;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.c21;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.g41;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.gx1;
import com.yandex.mobile.ads.impl.h62;
import com.yandex.mobile.ads.impl.iv;
import com.yandex.mobile.ads.impl.ix1;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.nu0;
import com.yandex.mobile.ads.impl.or2;
import com.yandex.mobile.ads.impl.pr2;
import com.yandex.mobile.ads.impl.q01;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.s;
import com.yandex.mobile.ads.impl.sr0;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.u02;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.v02;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.vn;
import com.yandex.mobile.ads.impl.y52;
import com.yandex.mobile.ads.impl.yd0;
import com.yandex.mobile.ads.impl.yg;
import com.yandex.mobile.ads.impl.zg;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public final class c21
implements t70,
ex1 {
    private final int a;
    private final bg1 b;
    private final bg1 c;
    private final bg1 d;
    private final bg1 e;
    private final ArrayDeque<yg.a> f;
    private final ix1 g = new ix1();
    private final ArrayList h = new ArrayList();
    private int i = 0;
    private int j;
    private long k;
    private int l;
    @Nullable
    private bg1 m;
    private int n = -1;
    private int o;
    private int p;
    private int q;
    private v70 r;
    private a[] s;
    private long[][] t;
    private int u;
    private long v;
    private int w;
    @Nullable
    private a21 x;

    static {
        new pr2();
    }

    public c21() {
        this(0);
    }

    public c21(int n10) {
        this.a = 0;
        this.e = new bg1(16);
        this.f = new ArrayDeque();
        this.b = new bg1(g41.a);
        this.c = new bg1(4);
        this.d = new bg1();
        this.r = v70.a;
        this.s = new a[0];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void a(yg.a var1_1) throws fg1 {
        var26_2 = new ArrayList<a>();
        var17_3 = this.w == 1;
        var25_4 = new be0();
        var19_5 /* !! */  = var1_1.c(1969517665);
        if (var19_5 /* !! */  != null) {
            var3_6 /* !! */  = zg.b;
            var22_7 = var19_5 /* !! */ .b;
            var22_7.e(8);
            var20_8 /* !! */  = null;
            var21_9 = null;
            while (var22_7.a() >= 8) {
                block46: {
                    var5_12 = var22_7.d();
                    var6_13 = var22_7.h();
                    var3_6 /* !! */  = var22_7.h();
                    if (var3_6 /* !! */  == 1835365473) {
                        var22_7.e(var5_12);
                        var22_7.f(8);
                        var4_11 = var22_7.d();
                        var22_7.f(4);
                        var3_6 /* !! */  = var4_11;
                        if (var22_7.h() != 1751411826) {
                            var3_6 /* !! */  = var4_11 + 4;
                        }
                        var22_7.e(var3_6 /* !! */ );
                        while (var22_7.d() < var5_12 + var6_13) {
                            var4_11 = var22_7.d();
                            var3_6 /* !! */  = var22_7.h();
                            if (var22_7.h() == 1768715124) {
                                var22_7.e(var4_11);
                                var22_7.f(8);
                                var21_9 = new ArrayList<E>();
                                while (var22_7.d() < var4_11 + var3_6 /* !! */ ) {
                                    var19_5 /* !! */  = q01.b((bg1)var22_7);
                                    if (var19_5 /* !! */  == null) continue;
                                    var21_9.add(var19_5 /* !! */ );
                                }
                                if (var21_9.isEmpty()) break;
                                var19_5 /* !! */  = new k01((List)var21_9);
                                break block46;
                            }
                            var22_7.e(var4_11 + var3_6 /* !! */ );
                        }
                        var19_5 /* !! */  = null;
                    } else {
                        var19_5 /* !! */  = var21_9;
                        if (var3_6 /* !! */  == 1936553057) {
                            var22_7.e(var5_12);
                            var22_7.f(12);
                            while (var22_7.d() < var5_12 + var6_13) {
                                var3_6 /* !! */  = var22_7.d();
                                var4_11 = var22_7.h();
                                if (var22_7.h() == 1935766900) {
                                    if (var4_11 < 14) break;
                                    var22_7.f(5);
                                    var3_6 /* !! */  = var22_7.t();
                                    if (var3_6 /* !! */  != 12 && var3_6 /* !! */  != 13) break;
                                    var2_10 = var3_6 /* !! */  == 12 ? 240.0f : 120.0f;
                                    var22_7.f(1);
                                    var20_8 /* !! */  = new k01(new k01.b[]{new u02(var22_7.t(), var2_10)});
                                    var19_5 /* !! */  = var21_9;
                                    break block46;
                                }
                                var22_7.e(var3_6 /* !! */  + var4_11);
                            }
                            var20_8 /* !! */  = null;
                            var19_5 /* !! */  = var21_9;
                        }
                    }
                }
                var22_7.e(var5_12 + var6_13);
                var21_9 = var19_5 /* !! */ ;
            }
            var20_8 /* !! */  = Pair.create(var21_9, var20_8 /* !! */ );
            var19_5 /* !! */  = (k01)var20_8 /* !! */ .first;
            var20_8 /* !! */  = (k01)var20_8 /* !! */ .second;
            if (var19_5 /* !! */  != null) {
                var25_4.a((k01)var19_5 /* !! */ );
            }
        } else {
            var20_8 /* !! */  = null;
            var19_5 /* !! */  = null;
        }
        var22_7 = var1_1.b(1835365473);
        if (var22_7 == null) ** GOTO lbl-1000
        var3_6 /* !! */  = zg.b;
        var23_14 /* !! */  = var22_7.c(1751411826);
        var21_9 = var22_7.c(1801812339);
        var22_7 = var22_7.c(1768715124);
        if (var23_14 /* !! */  == null || var21_9 == null || var22_7 == null) ** GOTO lbl-1000
        var23_14 /* !! */  = var23_14 /* !! */ .b;
        var23_14 /* !! */ .e(16);
        if (var23_14 /* !! */ .h() != 1835299937) ** GOTO lbl-1000
        var23_14 /* !! */  = var21_9.b;
        var23_14 /* !! */ .e(12);
        var4_11 = var23_14 /* !! */ .h();
        var21_9 = new String[var4_11];
        for (var3_6 /* !! */  = 0; var3_6 /* !! */  < var4_11; ++var3_6 /* !! */ ) {
            var5_12 = var23_14 /* !! */ .h();
            var23_14 /* !! */ .f(4);
            var21_9[var3_6 /* !! */ ] = var23_14 /* !! */ .a(var5_12 - 8, vn.c);
        }
        var23_14 /* !! */  = var22_7.b;
        var23_14 /* !! */ .e(8);
        var24_15 = new ArrayList<E>();
        var3_6 /* !! */  = var4_11;
        while (var23_14 /* !! */ .a() > 8) {
            var5_12 = var23_14 /* !! */ .d();
            var6_13 = var23_14 /* !! */ .h();
            var4_11 = var23_14 /* !! */ .h() - 1;
            if (var4_11 >= 0 && var4_11 < var3_6 /* !! */ ) {
                block47: {
                    var22_7 = var21_9[var4_11];
                    while ((var7_16 = var23_14 /* !! */ .d()) < var5_12 + var6_13) {
                        var4_11 = var23_14 /* !! */ .h();
                        if (var23_14 /* !! */ .h() == 1684108385) {
                            var8_17 = var23_14 /* !! */ .h();
                            var7_16 = var23_14 /* !! */ .h();
                            var27_18 /* !! */  = (y52)new byte[var4_11 -= 16];
                            var23_14 /* !! */ .a((byte[])var27_18 /* !! */ , 0, var4_11);
                            var22_7 = new nu0(var7_16, var8_17, (String)var22_7, (byte[])var27_18 /* !! */ );
                            break block47;
                        }
                        var23_14 /* !! */ .e(var7_16 + var4_11);
                    }
                    var22_7 = null;
                }
                var3_6 /* !! */  = var4_11 = var3_6 /* !! */ ;
                if (var22_7 != null) {
                    var24_15.add(var22_7);
                    var3_6 /* !! */  = var4_11;
                }
            } else {
                sr0.a((String)"Skipped metadata with unknown key index: ", (int)var4_11, (String)"AtomParsers");
            }
            var23_14 /* !! */ .e(var5_12 + var6_13);
        }
        if (!var24_15.isEmpty()) {
            var21_9 = new k01((List)var24_15);
        } else // 4 sources

        {
            var21_9 = null;
        }
        var18_19 = (this.a & 1) != 0;
        var22_7 = zg.a((yg.a)var1_1, (be0)var25_4, (long)-9223372036854775807L, null, (boolean)var18_19, (boolean)var17_3, (yd0)new or2());
        var5_12 = var22_7.size();
        var9_20 = -9223372036854775807L;
        var6_13 = 0;
        var3_6 /* !! */  = -1;
        while (true) {
            var11_21 = 0L;
            if (var6_13 >= var5_12) break;
            var1_1 = (h62)var22_7.get(var6_13);
            if (var1_1.b != 0) {
                var27_18 /* !! */  = var1_1.a;
                var11_21 = var27_18 /* !! */ .e;
                if (var11_21 == -9223372036854775807L) {
                    var11_21 = var1_1.h;
                }
                var9_20 = Math.max(var9_20, var11_21);
                var29_23 = new /* Unavailable Anonymous Inner Class!! */;
                var4_11 = "audio/true-hd".equals(var27_18 /* !! */ .f.m) != false ? var1_1.e * 16 : var1_1.e + 30;
                var28_22 = var27_18 /* !! */ .f.a();
                var28_22.h(var4_11);
                if (var27_18 /* !! */ .b == 2 && var11_21 > 0L && (var4_11 = var1_1.b) > 1) {
                    var28_22.a((float)var4_11 / ((float)var11_21 / 1000000.0f));
                }
                if (var27_18 /* !! */ .b == 1 && (var4_11 = var25_4.a) != -1 && var25_4.b != -1) {
                    var28_22.d(var4_11).e(var25_4.b);
                }
                var4_11 = var27_18 /* !! */ .b;
                var23_14 /* !! */  = this.h.isEmpty() != false ? null : new k01((List)this.h);
                var24_15 = new k01(new k01.b[0]);
                if (var4_11 == 1) {
                    var1_1 = var24_15;
                    if (var19_5 /* !! */  != null) {
                        var1_1 = var19_5 /* !! */ ;
                    }
                } else {
                    var1_1 = var24_15;
                    if (var4_11 == 2) {
                        var1_1 = var24_15;
                        if (var21_9 != null) {
                            var4_11 = 0;
                            while (true) {
                                var1_1 = var24_15;
                                if (var4_11 >= var21_9.c()) break;
                                var1_1 = var21_9.a(var4_11);
                                if (var1_1 instanceof nu0) {
                                    var1_1 = (nu0)var1_1;
                                    if ("com.android.capture.fps".equals(var1_1.b)) {
                                        var1_1 = new k01(new k01.b[]{var1_1});
                                        break;
                                    }
                                }
                                ++var4_11;
                            }
                        }
                    }
                }
                for (var4_11 = 0; var4_11 < 2; ++var4_11) {
                    var1_1 = var1_1.a((new k01[]{var20_8 /* !! */ , var23_14 /* !! */ })[var4_11]);
                }
                if (var1_1.c() > 0) {
                    var28_22.a((k01)var1_1);
                }
                var29_23.c.a(var28_22.a());
                if (var27_18 /* !! */ .b == 2) {
                    var4_11 = var3_6 /* !! */ ;
                    if (var3_6 /* !! */  == -1) {
                        var4_11 = var26_2.size();
                    }
                } else {
                    var4_11 = var3_6 /* !! */ ;
                }
                var26_2.add(var29_23);
                var3_6 /* !! */  = var4_11;
            }
            ++var6_13;
        }
        this.u = var3_6 /* !! */ ;
        this.v = var9_20;
        var1_1 = var26_2.toArray(new a[0]);
        this.s = var1_1;
        var20_8 /* !! */  = (Pair)new long[((a[])var1_1).length][];
        var21_9 = (k01)new int[((a[])var1_1).length];
        var19_5 /* !! */  = (yg.b)new long[((a[])var1_1).length];
        var24_15 = new boolean[((a[])var1_1).length];
        for (var3_6 /* !! */  = 0; var3_6 /* !! */  < ((a[])var1_1).length; ++var3_6 /* !! */ ) {
            var20_8 /* !! */ [var3_6 /* !! */ ] = (Pair)new long[var1_1[var3_6 /* !! */ ].b.b];
            var19_5 /* !! */ [var3_6 /* !! */ ] = (yg.b)var1_1[var3_6 /* !! */ ].b.f[0];
        }
        var4_11 = 0;
        var9_20 = var11_21;
        while (var4_11 < ((a[])var1_1).length) {
            var5_12 = -1;
            var11_21 = 0x7FFFFFFFFFFFFFFFL;
            for (var3_6 /* !! */  = 0; var3_6 /* !! */  < ((a[])var1_1).length; ++var3_6 /* !! */ ) {
                var6_13 = var5_12;
                var13_24 /* !! */  = var11_21;
                if (var24_15[var3_6 /* !! */ ] == false) {
                    var15_25 = var19_5 /* !! */ [var3_6 /* !! */ ];
                    var6_13 = var5_12;
                    var13_24 /* !! */  = var11_21;
                    if (var15_25 <= var11_21) {
                        var6_13 = var3_6 /* !! */ ;
                        var13_24 /* !! */  = (long)var15_25;
                    }
                }
                var5_12 = var6_13;
                var11_21 = var13_24 /* !! */ ;
            }
            var3_6 /* !! */  = (int)var21_9[var5_12];
            var23_14 /* !! */  = var20_8 /* !! */ [var5_12];
            var23_14 /* !! */ [var3_6 /* !! */ ] = (yg.b)var9_20;
            var22_7 = var1_1[var5_12].b;
            var9_20 += (long)var22_7.d[var3_6 /* !! */ ];
            var21_9[var5_12] = (k01)(++var3_6 /* !! */ );
            if (var3_6 /* !! */  < ((yg.b)var23_14 /* !! */ ).length) {
                var19_5 /* !! */ [var5_12] = (yg.b)var22_7.f[var3_6 /* !! */ ];
                continue;
            }
            var24_15[var5_12] = true;
            ++var4_11;
        }
        this.t = (long[][])var20_8 /* !! */ ;
        this.r.a();
        this.r.a((ex1)this);
    }

    private void c(long l10) throws fg1 {
        while (!this.f.isEmpty() && this.f.peek().b == l10) {
            yg.a a12 = this.f.pop();
            if (a12.a == 1836019574) {
                this.a(a12);
                this.f.clear();
                this.i = 2;
                continue;
            }
            if (this.f.isEmpty()) continue;
            this.f.peek().d.add(a12);
        }
        if (this.i != 2) {
            this.i = 0;
            this.l = 0;
        }
    }

    private static /* synthetic */ t70[] d() {
        return new t70[]{new c21()};
    }

    public static /* synthetic */ t70[] e() {
        return c21.d();
    }

    public static /* synthetic */ y52 f(y52 y522) {
        return y522;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int a(u70 object, qj1 object2) throws IOException {
        while (true) {
            long l10;
            long l11;
            int n10;
            block53: {
                block51: {
                    block43: {
                        bg1 bg12;
                        block50: {
                            h62 h622;
                            g62 g622;
                            a a12;
                            int n12;
                            int n13;
                            block42: {
                                int n14;
                                int n15;
                                long l13;
                                block46: {
                                    a[] aArray;
                                    long l14;
                                    long l15;
                                    int n16;
                                    block47: {
                                        block44: {
                                            block52: {
                                                block48: {
                                                    block49: {
                                                        block45: {
                                                            if ((n10 = this.i) == 0) break block44;
                                                            if (n10 == 1) break block45;
                                                            if (n10 != 2) {
                                                                if (n10 != 3) throw new IllegalStateException();
                                                                this.g.a((u70)object, object2, this.h);
                                                                if (object2.a != 0L) return 1;
                                                                this.i = 0;
                                                                this.l = 0;
                                                                return 1;
                                                            }
                                                            l13 = object.a();
                                                            if (this.n != -1) break block46;
                                                            n16 = n15 = 1;
                                                            n13 = -1;
                                                            n14 = -1;
                                                            l15 = Long.MAX_VALUE;
                                                            l11 = l14 = Long.MAX_VALUE;
                                                            break block47;
                                                        }
                                                        l10 = this.k - (long)this.l;
                                                        l11 = object.a();
                                                        bg12 = this.m;
                                                        if (bg12 == null) break block48;
                                                        object.b(bg12.c(), this.l, (int)l10);
                                                        if (this.j != 1718909296) break block49;
                                                        bg12.e(8);
                                                        n10 = bg12.h();
                                                        n10 = n10 != 1751476579 ? (n10 != 1903435808 ? 0 : 1) : 2;
                                                        if (n10 != 0) break block43;
                                                        bg12.f(4);
                                                        break block50;
                                                    }
                                                    if (!this.f.isEmpty()) {
                                                        yg.a a13 = this.f.peek();
                                                        yg.b b10 = new yg.b(this.j, bg12);
                                                        a13.c.add(b10);
                                                    }
                                                    break block51;
                                                }
                                                if (l10 >= 262144L) break block52;
                                                object.a((int)l10);
                                                break block51;
                                            }
                                            object2.a = object.a() + l10;
                                            n10 = 1;
                                            break block53;
                                        }
                                        if (this.l == 0) {
                                            if (!object.a(this.e.c(), 0, 8, true)) {
                                                if (this.w != 2) return -1;
                                                if ((this.a & 2) == 0) return -1;
                                                g62 g623 = this.r.a(0, 4);
                                                object = this.x;
                                                object = object == null ? null : new k01(new k01.b[]{object});
                                                g623.a(new /* Unavailable Anonymous Inner Class!! */.a((k01)object).a());
                                                this.r.a();
                                                this.r.a((ex1)new ex1.b(-9223372036854775807L, 0L));
                                                return -1;
                                            }
                                            this.l = 8;
                                            this.e.e(0);
                                            this.k = this.e.v();
                                            this.j = this.e.h();
                                        }
                                        if ((l10 = this.k) == 1L) {
                                            object.b(this.e.c(), 8, 8);
                                            this.l += 8;
                                            this.k = this.e.y();
                                        } else if (l10 == 0L) {
                                            l10 = l11 = object.b();
                                            if (l11 == -1L) {
                                                yg.a a14 = this.f.peek();
                                                l10 = l11;
                                                if (a14 != null) {
                                                    l10 = a14.b;
                                                }
                                            }
                                            if (l10 != -1L) {
                                                this.k = l10 - object.a() + (long)this.l;
                                            }
                                        }
                                        l10 = this.k;
                                        n10 = this.l;
                                        if (l10 < (long)n10) throw fg1.a((String)"Atom size less than header length (unsupported).");
                                        n14 = this.j;
                                        if (n14 != 1836019574 && n14 != 1953653099 && n14 != 1835297121 && n14 != 1835626086 && n14 != 1937007212 && n14 != 1701082227 && n14 != 1835365473) {
                                            if (n14 != 1835296868 && n14 != 1836476516 && n14 != 1751411826 && n14 != 1937011556 && n14 != 0x73747473 && n14 != 0x73747373 && n14 != 1668576371 && n14 != 1701606260 && n14 != 1937011555 && n14 != 1937011578 && n14 != 1937013298 && n14 != 1937007471 && n14 != 1668232756 && n14 != 1953196132 && n14 != 1718909296 && n14 != 1969517665 && n14 != 1801812339 && n14 != 1768715124) {
                                                l11 = object.a();
                                                l10 = this.l;
                                                l11 -= l10;
                                                if (this.j == 1836086884) {
                                                    this.x = new a21(0L, l11, -9223372036854775807L, l11 + l10, this.k - l10);
                                                }
                                                this.m = null;
                                                this.i = 1;
                                                continue;
                                            }
                                            if (n10 != 8) throw new IllegalStateException();
                                            if (l10 > Integer.MAX_VALUE) throw new IllegalStateException();
                                            bg1 bg13 = new bg1((int)l10);
                                            System.arraycopy(this.e.c(), 0, bg13.c(), 0, 8);
                                            this.m = bg13;
                                            this.i = 1;
                                            continue;
                                        }
                                        l14 = object.a();
                                        l11 = this.k;
                                        l10 = this.l;
                                        l14 = l14 + l11 - l10;
                                        if (l11 != l10 && this.j == 1835365473) {
                                            this.d.c(8);
                                            object.a(this.d.c(), 0, 8);
                                            bg1 bg14 = this.d;
                                            n10 = zg.b;
                                            n14 = bg14.d();
                                            bg14.f(4);
                                            n10 = n14;
                                            if (bg14.h() != 1751411826) {
                                                n10 = n14 + 4;
                                            }
                                            bg14.e(n10);
                                            object.a(this.d.d());
                                            object.c();
                                        }
                                        this.f.push(new yg.a(this.j, l14));
                                        if (this.k == (long)this.l) {
                                            this.c(l14);
                                            continue;
                                        }
                                        this.i = 0;
                                        this.l = 0;
                                        continue;
                                    }
                                    for (n10 = 0; n10 < (aArray = this.s).length; ++n10) {
                                        long l16;
                                        block55: {
                                            long l17;
                                            int n17;
                                            long l18;
                                            int n18;
                                            block57: {
                                                block56: {
                                                    h62 h623;
                                                    block54: {
                                                        a a15 = aArray[n10];
                                                        n18 = a15.e;
                                                        h623 = a15.b;
                                                        if (n18 != h623.b) break block54;
                                                        l16 = l15;
                                                        break block55;
                                                    }
                                                    l10 = h623.c[n18];
                                                    long[][] lArray = this.t;
                                                    n12 = m92.a;
                                                    l18 = lArray[n10][n18];
                                                    l16 = l10 - l13;
                                                    n12 = l16 >= 0L && l16 < 262144L ? 0 : 1;
                                                    if (n12 == 0 && n15 != 0) break block56;
                                                    n17 = n15;
                                                    l17 = l14;
                                                    n18 = n14;
                                                    l10 = l11;
                                                    if (n12 != n15) break block57;
                                                    n17 = n15;
                                                    l17 = l14;
                                                    n18 = n14;
                                                    l10 = l11;
                                                    if (l16 >= l11) break block57;
                                                }
                                                n17 = n12;
                                                n18 = n10;
                                                l10 = l16;
                                                l17 = l18;
                                            }
                                            n15 = n17;
                                            l16 = l15;
                                            l14 = l17;
                                            n14 = n18;
                                            l11 = l10;
                                            if (l18 < l15) {
                                                n13 = n10;
                                                l11 = l10;
                                                n14 = n18;
                                                l14 = l17;
                                                n16 = n12;
                                                l16 = l18;
                                                n15 = n17;
                                            }
                                        }
                                        l15 = l16;
                                    }
                                    n10 = l15 != Long.MAX_VALUE && n16 != 0 && l14 >= l15 + 0xA00000L ? n13 : n14;
                                    this.n = n10;
                                    if (n10 == -1) {
                                        return -1;
                                    }
                                }
                                a12 = this.s[this.n];
                                g622 = a12.c;
                                n13 = a12.e;
                                h622 = a12.b;
                                l10 = h622.c[n13];
                                n14 = h622.d[n13];
                                h622 = a12.d;
                                l11 = l10 - l13 + (long)this.o;
                                if (l11 >= 0L && l11 < 262144L) {
                                    l10 = l11;
                                    n10 = n14;
                                    if (a12.a.g == 1) {
                                        l10 = l11 + 8L;
                                        n10 = n14 - 8;
                                    }
                                    object.a((int)l10);
                                    y52 y522 = a12.a;
                                    if (y522.j == 0) {
                                        if ("audio/ac4".equals(y522.f.m)) {
                                            if (this.p == 0) {
                                                com.yandex.mobile.ads.impl.s.a((int)n10, (bg1)this.d);
                                                g622.a(7, this.d);
                                                this.p += 7;
                                            }
                                            n14 = n10 + 7;
                                        } else {
                                            n14 = n10;
                                            if (h622 != null) {
                                                h622.a((u70)object);
                                                n14 = n10;
                                            }
                                        }
                                        while (true) {
                                            n10 = this.p;
                                            n12 = n14;
                                            if (n10 < n14) {
                                                n10 = g622.b((iv)object, n14 - n10, false);
                                                this.o += n10;
                                                this.p += n10;
                                                this.q -= n10;
                                                continue;
                                            }
                                            break block42;
                                            break;
                                        }
                                    }
                                } else {
                                    object2.a = l10;
                                    return 1;
                                }
                                byte[] byArray = this.c.c();
                                byArray[0] = 0;
                                byArray[1] = 0;
                                byArray[2] = 0;
                                n15 = a12.a.j;
                                n14 = 4 - n15;
                                while (true) {
                                    n12 = n10;
                                    if (this.p >= n10) break;
                                    n12 = this.q;
                                    if (n12 == 0) {
                                        object.b(byArray, n14, n15);
                                        this.o += n15;
                                        this.c.e(0);
                                        n12 = this.c.h();
                                        if (n12 < 0) throw fg1.a((String)"Invalid NAL length", null);
                                        this.q = n12;
                                        this.b.e(0);
                                        g622.a(4, this.b);
                                        this.p += 4;
                                        n10 += n14;
                                        continue;
                                    }
                                    n12 = g622.b((iv)object, n12, false);
                                    this.o += n12;
                                    this.p += n12;
                                    this.q -= n12;
                                }
                            }
                            object = a12.b;
                            l10 = ((h62)object).f[n13];
                            n10 = ((h62)object).g[n13];
                            if (h622 != null) {
                                h622.a(g622, l10, n10, n12, 0, null);
                                if (n13 + 1 == a12.b.b) {
                                    h622.a(g622, null);
                                }
                            } else {
                                g622.a(l10, n10, n12, 0, null);
                            }
                            ++a12.e;
                            this.n = -1;
                            this.o = 0;
                            this.p = 0;
                            this.q = 0;
                            return 0;
                        }
                        while (bg12.a() > 0) {
                            n10 = bg12.h();
                            n10 = n10 != 1751476579 ? (n10 != 1903435808 ? 0 : 1) : 2;
                            if (n10 == 0) continue;
                            break block43;
                        }
                        n10 = 0;
                    }
                    this.w = n10;
                }
                n10 = 0;
            }
            this.c(l11 + l10);
            if (n10 != 0 && this.i != 2) break;
        }
        return 1;
    }

    public final void a(long l10, long l11) {
        this.f.clear();
        this.l = 0;
        this.n = -1;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        if (l10 == 0L) {
            if (this.i != 3) {
                this.i = 0;
                this.l = 0;
            } else {
                this.g.a();
                this.h.clear();
            }
        } else {
            for (a a12 : this.s) {
                int n10;
                h62 h622;
                block8: {
                    h622 = a12.b;
                    for (n10 = m92.b((long[])h622.f, (long)l11, (boolean)false); n10 >= 0; --n10) {
                        if ((h622.g[n10] & 1) == 0) {
                            continue;
                        }
                        break block8;
                    }
                    n10 = -1;
                }
                int n12 = n10;
                if (n10 == -1) {
                    n12 = h622.a(l11);
                }
                a12.e = n12;
                a12 = a12.d;
                if (a12 == null) continue;
                a12.a();
            }
        }
    }

    public final void a(v70 v702) {
        this.r = v702;
    }

    public final boolean a(u70 u702) throws IOException {
        boolean bl2 = (this.a & 2) != 0;
        return v02.a((u70)u702, (boolean)bl2);
    }

    public final ex1.a b(long l10) {
        Object object;
        block18: {
            long l11;
            long l13;
            int n10;
            boolean bl2;
            int n12;
            long l14;
            block21: {
                block19: {
                    block20: {
                        block14: {
                            block17: {
                                l14 = l10;
                                object = this.s;
                                if (((a[])object).length != 0) break block17;
                                object = gx1.c;
                                object = new ex1.a(object, object);
                                break block18;
                            }
                            n12 = this.u;
                            bl2 = false;
                            if (n12 == -1) break block19;
                            object = object[n12].b;
                            for (n12 = m92.b((long[])object.f, (long)l14, (boolean)false); n12 >= 0; --n12) {
                                if ((object.g[n12] & 1) == 0) {
                                    continue;
                                }
                                break block14;
                            }
                            n12 = -1;
                        }
                        n10 = n12;
                        if (n12 == -1) {
                            n10 = object.a(l14);
                        }
                        if (n10 != -1) break block20;
                        object = gx1.c;
                        object = new ex1.a(object, object);
                        break block18;
                    }
                    l13 = object.f[n10];
                    long l15 = object.c[n10];
                    if (l13 < l14 && n10 < object.b - 1 && (n12 = object.a(l14)) != -1 && n12 != n10) {
                        l10 = object.f[n12];
                        l11 = object.c[n12];
                    } else {
                        l11 = -1L;
                        l10 = -9223372036854775807L;
                    }
                    l14 = l13;
                    l13 = l10;
                    l10 = l15;
                    break block21;
                }
                l10 = Long.MAX_VALUE;
                l11 = -1L;
                l13 = -9223372036854775807L;
            }
            for (n10 = 0; n10 < ((a[])(object = this.s)).length; ++n10) {
                h62 h622;
                block15: {
                    if (n10 == this.u) continue;
                    h622 = object[n10].b;
                    for (n12 = m92.b((long[])h622.f, (long)l14, (boolean)bl2); n12 >= 0; --n12) {
                        if ((h622.g[n12] & 1) == 0) {
                            continue;
                        }
                        break block15;
                    }
                    n12 = -1;
                }
                int n13 = n12;
                if (n12 == -1) {
                    n13 = h622.a(l14);
                }
                if (n13 != -1) {
                    l10 = Math.min(h622.c[n13], l10);
                }
                if (l13 != -9223372036854775807L) {
                    block16: {
                        object = h622.f;
                        bl2 = false;
                        for (n12 = m92.b((long[])object, (long)l13, (boolean)false); n12 >= 0; --n12) {
                            if ((h622.g[n12] & 1) == 0) {
                                continue;
                            }
                            break block16;
                        }
                        n12 = -1;
                    }
                    n13 = n12;
                    if (n12 == -1) {
                        n13 = h622.a(l13);
                    }
                    if (n13 == -1) continue;
                    l11 = Math.min(h622.c[n13], l11);
                    continue;
                }
                bl2 = false;
            }
            object = new gx1(l14, l10);
            object = l13 == -9223372036854775807L ? new ex1.a(object, object) : new ex1.a(object, new gx1(l13, l11));
        }
        return object;
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return this.v;
    }

    public final void release() {
    }
}

