/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.ex1$a
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w01
 *  com.yandex.mobile.ads.impl.xh
 *  com.yandex.mobile.ads.impl.xn
 *  com.yandex.mobile.ads.impl.yh$b
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a32;
import com.yandex.mobile.ads.impl.ai;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.j40;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.tr0;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w01;
import com.yandex.mobile.ads.impl.xh;
import com.yandex.mobile.ads.impl.xn;
import com.yandex.mobile.ads.impl.y22;
import com.yandex.mobile.ads.impl.yh;
import com.yandex.mobile.ads.impl.zh;
import com.yandex.mobile.ads.impl.zs0;
import java.io.IOException;
import java.util.ArrayList;

public final class yh
implements t70 {
    private final bg1 a = new bg1(12);
    private final b b = new /* Unavailable Anonymous Inner Class!! */;
    private int c;
    private v70 d = new j40();
    private zh e;
    private long f = -9223372036854775807L;
    private xn[] g = new xn[0];
    private long h;
    @Nullable
    private xn i;
    private int j = -1;
    private long k = -1L;
    private long l = -1L;
    private int m;
    private boolean n;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int a(u70 var1_1, qj1 var2_2) throws IOException {
        var8_3 = this.h;
        var4_4 = 0;
        if (var8_3 == -1L) ** GOTO lbl12
        var10_6 = this.h;
        var12_5 = (oz)var1_1;
        var8_3 = var12_5.a();
        if (var10_6 < var8_3 || var10_6 > 262144L + var8_3) {
            var2_2.a = var10_6;
            var3_7 = 1;
        } else {
            var12_5.a((int)(var10_6 - var8_3));
lbl12:
            // 2 sources

            var3_7 = 0;
        }
        this.h = -1L;
        if (var3_7 != 0) {
            return 1;
        }
        var5_8 = this.c;
        var3_7 = 8;
        var2_2 = null;
        switch (var5_8) {
            default: {
                throw new AssertionError();
            }
            case 6: {
                var12_5 = (oz)var1_1;
                if (var12_5.a() >= this.l) {
                    var3_7 = -1;
                } else {
                    var1_1 = this.i;
                    if (var1_1 != null) {
                        var3_7 = var4_4;
                        if (var1_1.a((oz)var12_5)) {
                            this.i = null;
                            var3_7 = var4_4;
                        }
                    } else {
                        if ((var12_5.a() & 1L) == 1L) {
                            var12_5.a(1);
                        }
                        var12_5.b(this.a.c(), 0, 12, false);
                        this.a.e(0);
                        var5_8 = this.a.k();
                        if (var5_8 == 1414744396) {
                            this.a.e(8);
                            if (this.a.k() == 1769369453) {
                                var3_7 = 12;
                            }
                            var12_5.a(var3_7);
                            var12_5.c();
                            var3_7 = var4_4;
                        } else {
                            var7_9 = this.a.k();
                            if (var5_8 == 1263424842) {
                                this.h = var12_5.a() + (long)var7_9 + 8L;
                                var3_7 = var4_4;
                            } else {
                                var12_5.a(8);
                                var12_5.c();
                                var13_10 = this.g;
                                var6_12 = var13_10.length;
                                var3_7 = 0;
                                while (true) {
                                    var1_1 = var2_2;
                                    if (var3_7 >= var6_12 || (var1_1 = var13_10[var3_7]).a(var5_8)) break;
                                    ++var3_7;
                                }
                                if (var1_1 == null) {
                                    this.h = var12_5.a() + (long)var7_9;
                                    var3_7 = var4_4;
                                } else {
                                    var1_1.b(var7_9);
                                    this.i = var1_1;
                                    var3_7 = var4_4;
                                }
                            }
                        }
                    }
                }
                return var3_7;
            }
            case 5: {
                var2_2 = new bg1(this.m);
                var12_5 = var2_2.c();
                var3_7 = this.m;
                ((oz)var1_1).a((byte[])var12_5, 0, var3_7, false);
                if (var2_2.a() < 16) {
                    var8_3 = 0L;
                } else {
                    var3_7 = var2_2.d();
                    var2_2.f(8);
                    var8_3 = var2_2.k();
                    var10_6 = this.k;
                    var8_3 = var8_3 > var10_6 ? 0L : var10_6 + 8L;
                    var2_2.e(var3_7);
                }
                while (var2_2.a() >= 16) {
                    var6_13 = var2_2.k();
                    var4_4 = var2_2.k();
                    var10_6 = var2_2.k();
                    var2_2.k();
                    var12_5 = this.g;
                    var5_8 = ((xn[])var12_5).length;
                    for (var3_7 = 0; var3_7 < var5_8; ++var3_7) {
                        var1_1 = var12_5[var3_7];
                        if (!var1_1.a(var6_13)) {
                            continue;
                        }
                        ** GOTO lbl100
                    }
                    var1_1 = null;
lbl100:
                    // 2 sources

                    if (var1_1 == null) continue;
                    if ((var4_4 & 16) == 16) {
                        var1_1.a(var10_6 + var8_3);
                    }
                    var1_1.b();
                }
                var1_1 = this.g;
                var4_4 = ((xn[])var1_1).length;
                for (var3_7 = 0; var3_7 < var4_4; ++var3_7) {
                    var1_1[var3_7].a();
                }
                this.n = true;
                this.d.a((ex1)new a(this, this.f));
                this.c = 6;
                this.h = this.k;
                return 0;
            }
            case 4: {
                var2_2 = this.a.c();
                var1_1 = (oz)var1_1;
                var1_1.a((byte[])var2_2, 0, 8, false);
                this.a.e(0);
                var4_4 = this.a.k();
                var3_7 = this.a.k();
                if (var4_4 == 829973609) {
                    this.c = 5;
                    this.m = var3_7;
                } else {
                    this.h = var1_1.a() + (long)var3_7;
                }
                return 0;
            }
            case 3: {
                if (this.k != -1L && (var8_3 = ((oz)var1_1).a()) != (var10_6 = this.k)) {
                    this.h = var10_6;
                    return 0;
                }
                var2_2 = this.a.c();
                var1_1 = (oz)var1_1;
                var1_1.b((byte[])var2_2, 0, 12, false);
                var1_1.c();
                this.a.e(0);
                var12_5 = this.b;
                var2_2 = this.a;
                var12_5.getClass();
                var12_5.a = var2_2.k();
                var12_5.b = var2_2.k();
                var12_5.c = 0;
                var3_7 = this.a.k();
                var4_4 = this.b.a;
                if (var4_4 == 1179011410) {
                    var1_1.a(12);
                    return 0;
                }
                if (var4_4 == 1414744396 && var3_7 == 1769369453) {
                    this.k = var8_3 = var1_1.a();
                    this.l = var8_3 + (long)this.b.b + 8L;
                    if (!this.n) {
                        var2_2 = this.e;
                        var2_2.getClass();
                        if ((var2_2.b & 16) == 16) {
                            this.c = 4;
                            this.h = this.l;
                            return 0;
                        }
                        this.d.a((ex1)new ex1.b(this.f, 0L));
                        this.n = true;
                    }
                    this.h = var1_1.a() + 12L;
                    this.c = 6;
                    return 0;
                }
                this.h = var1_1.a() + (long)this.b.b + 8L;
                return 0;
            }
            case 2: {
                var3_7 = this.j - 4;
                var2_2 = new bg1(var3_7);
                var12_5 = var2_2.c();
                ((oz)var1_1).a((byte[])var12_5, 0, var3_7, false);
                var1_1 = tr0.a(1819436136, (bg1)var2_2);
                if (var1_1.getType() != 1819436136) ** GOTO lbl226
                var2_2 = var1_1.a(zh.class);
                if (var2_2 == null) ** GOTO lbl225
                this.e = var2_2;
                this.f = (long)var2_2.c * (long)var2_2.a;
                var2_2 = new ArrayList<E>();
                var12_5 = var1_1.a.a(0);
                var3_7 = 0;
                while (var12_5.hasNext()) {
                    var1_1 = (xh)var12_5.next();
                    if (var1_1.getType() != 1819440243) continue;
                    var14_14 /* !! */  = (tr0)var1_1;
                    var1_1 = var14_14 /* !! */ .a(ai.class);
                    var13_11 = var14_14 /* !! */ .a(y22.class);
                    if (var1_1 != null) ** GOTO lbl195
                    zs0.d((String)"AviExtractor", (String)"Missing Stream Header");
lbl192:
                    // 3 sources

                    while (true) {
                        var1_1 = null;
                        ** GOTO lbl216
                        break;
                    }
lbl195:
                    // 1 sources

                    if (var13_11 != null) ** GOTO lbl198
                    zs0.d((String)"AviExtractor", (String)"Missing Stream Format");
                    ** GOTO lbl192
lbl198:
                    // 1 sources

                    var8_3 = m92.a((long)var1_1.d, (long)((long)var1_1.b * 1000000L), (long)var1_1.c);
                    var15_15 = var13_11.a;
                    var13_11 = var15_15.a();
                    var13_11.g(var3_7);
                    var4_4 = var1_1.e;
                    if (var4_4 != 0) {
                        var13_11.h(var4_4);
                    }
                    if ((var14_14 /* !! */  = var14_14 /* !! */ .a(a32.class)) != null) {
                        var13_11.c(var14_14 /* !! */ .a);
                    }
                    if ((var4_4 = w01.c((String)var15_15.m)) == 1 || var4_4 == 2) ** break;
                    ** continue;
                    var14_14 /* !! */  = this.d.a(var3_7, var4_4);
                    var14_14 /* !! */ .a(var13_11.a());
                    var1_1 = new xn(var3_7, var4_4, var8_3, var1_1.d, (g62)var14_14 /* !! */ );
                    this.f = var8_3;
lbl216:
                    // 2 sources

                    if (var1_1 != null) {
                        var2_2.add(var1_1);
                    }
                    ++var3_7;
                }
                this.g = var2_2.toArray(new xn[0]);
                this.d.a();
                this.c = 3;
                return 0;
lbl225:
                // 1 sources

                throw fg1.a((String)"AviHeader not found", null);
lbl226:
                // 1 sources

                var2_2 = new StringBuilder("Unexpected header list type ");
                var2_2.append(var1_1.getType());
                throw fg1.a((String)var2_2.toString(), null);
            }
            case 1: {
                var2_2 = this.a.c();
                ((oz)var1_1).a((byte[])var2_2, 0, 12, false);
                this.a.e(0);
                var1_1 = this.b;
                var2_2 = this.a;
                var1_1.getClass();
                var1_1.a = var2_2.k();
                var1_1.b = var2_2.k();
                var1_1.c = 0;
                if (var1_1.a == 1414744396) {
                    var1_1.c = var2_2.k();
                    var1_1 = this.b;
                    if (var1_1.c == 1819436136) {
                        this.j = var1_1.b;
                        this.c = 2;
                        return 0;
                    }
                    var1_1 = new StringBuilder("hdrl expected, found: ");
                    var1_1.append(this.b.c);
                    throw fg1.a((String)var1_1.toString(), null);
                }
                var2_2 = new StringBuilder("LIST expected, found: ");
                var2_2.append(var1_1.a);
                throw fg1.a((String)var2_2.toString(), null);
            }
            case 0: 
        }
        if (this.a((u70)var1_1)) {
            ((oz)var1_1).a(12);
            this.c = 1;
            return 0;
        }
        throw fg1.a((String)"AVI Header List not found", null);
    }

    public final void a(long l10, long l11) {
        this.h = -1L;
        this.i = null;
        xn[] xnArray = this.g;
        int n10 = xnArray.length;
        for (int i14 = 0; i14 < n10; ++i14) {
            xnArray[i14].c(l10);
        }
        if (l10 == 0L) {
            this.c = this.g.length == 0 ? 0 : 3;
            return;
        }
        this.c = 6;
    }

    public final void a(v70 v702) {
        this.c = 0;
        this.d = v702;
        this.h = -1L;
    }

    public final boolean a(u70 u702) throws IOException {
        byte[] byArray = this.a.c();
        u702 = (oz)u702;
        boolean bl2 = false;
        ((oz)u702).b(byArray, 0, 12, false);
        this.a.e(0);
        if (this.a.k() != 1179011410) {
            return false;
        }
        this.a.f(4);
        if (this.a.k() == 541677121) {
            bl2 = true;
        }
        return bl2;
    }

    public final void release() {
    }

    private final class a
    implements ex1 {
        private final long a;
        final yh b;

        public a(yh yh2, long l10) {
            this.b = yh2;
            this.a = l10;
        }

        public final ex1.a b(long l10) {
            ex1.a a14;
            ex1.a a15 = this.b.g[0].b(l10);
            for (int i14 = 1; i14 < ((xn[])(a14 = this.b.g)).length; ++i14) {
                ex1.a a16 = a14[i14].b(l10);
                a14 = a15;
                if (a16.a.b < a15.a.b) {
                    a14 = a16;
                }
                a15 = a14;
            }
            return a15;
        }

        public final boolean b() {
            return true;
        }

        public final long c() {
            return this.a;
        }
    }
}

