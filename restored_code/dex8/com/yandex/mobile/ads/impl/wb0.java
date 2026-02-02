/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.v70
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.mh;
import com.yandex.mobile.ads.impl.mk0;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.tg2;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w63;
import com.yandex.mobile.ads.impl.wt1;
import java.io.IOException;

public final class wb0
implements t70 {
    private final bg1 a = new bg1(4);
    private final bg1 b = new bg1(9);
    private final bg1 c = new bg1(11);
    private final bg1 d = new bg1();
    private final wt1 e = new wt1();
    private v70 f;
    private int g = 1;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private mh o;
    private tg2 p;

    static {
        new w63();
    }

    private bg1 a(oz oz3) throws IOException {
        if (this.l > this.d.b()) {
            bg1 bg12 = this.d;
            bg12.a(0, new byte[Math.max(bg12.b() * 2, this.l)]);
        } else {
            this.d.e(0);
        }
        this.d.d(this.l);
        oz3.a(this.d.c(), 0, this.l, false);
        return this.d;
    }

    private static /* synthetic */ t70[] a() {
        return new t70[]{new wb0()};
    }

    public static /* synthetic */ t70[] b() {
        return wb0.a();
    }

    /*
     * Unable to fully structure code
     */
    public final int a(u70 var1_1, qj1 var2_2) throws IOException {
        block15: {
            if (this.f == null) break block15;
            while (true) {
                block16: {
                    block17: {
                        block18: {
                            block19: {
                                block14: {
                                    block21: {
                                        block20: {
                                            var3_3 = this.g;
                                            var4_4 = false;
                                            if (var3_3 == 1) break block16;
                                            if (var3_3 == 2) break block17;
                                            if (var3_3 == 3) break block18;
                                            if (var3_3 != 4) break block19;
                                            var6_6 = this.h;
                                            var10_9 = 0L;
                                            var8_8 = var6_6 != false ? this.i + this.m : (this.e.a() == -9223372036854775807L ? 0L : this.m);
                                            var3_3 = this.k;
                                            if (var3_3 == 8 && this.o != null) {
                                                if (!this.n) {
                                                    this.f.a((ex1)new ex1.b(-9223372036854775807L, 0L));
                                                    this.n = true;
                                                }
                                                var2_2 = this.o;
                                                var12_10 = this.a((oz)var1_1);
                                                var2_2.a((bg1)var12_10);
                                                var6_6 = var2_2.a(var8_8, (bg1)var12_10);
lbl22:

                                                while (true) {
                                                    var7_7 = true;
                                                    break block14;
                                                    break;
                                                }
                                            }
                                            if (var3_3 != 9 || this.p == null) break block20;
                                            if (!this.n) {
                                                this.f.a((ex1)new ex1.b(-9223372036854775807L, 0L));
                                                this.n = true;
                                            }
                                            if ((var2_2 = this.p).a((bg1)(var12_10 = this.a((oz)var1_1))) && var2_2.a(var8_8, (bg1)var12_10)) {
                                                var6_6 = true;
lbl31:

                                                while (true) {
                                                    var7_7 = var6_6;
                                                    break block14;
                                                    break;
                                                }
                                            }
                                            var6_6 = false;

                                        }
                                        if (var3_3 != 18 || this.n) break block21;
                                        var12_10 = this.e;
                                        var2_2 = this.a((oz)var1_1);
                                        var12_10.getClass();
                                        var7_7 = var12_10.a(var8_8, (bg1)var2_2);
                                        var8_8 = this.e.a();
                                        var6_6 = var7_7;
                                        if (var8_8 == -9223372036854775807L) ** GOTO lbl22
                                        this.f.a((ex1)new mk0(var8_8, this.e.b(), this.e.c()));
                                        this.n = true;
                                        var6_6 = var7_7;

                                    }
                                    var3_3 = this.l;
                                    ((oz)var1_1).a(var3_3);
                                    var6_6 = false;

                                }
                                if (!this.h && var6_6) {
                                    this.h = true;
                                    var8_8 = var10_9;
                                    if (this.e.a() == -9223372036854775807L) {
                                        var8_8 = -this.m;
                                    }
                                    this.i = var8_8;
                                }
                                this.j = 4;
                                this.g = 2;
                                if (!var7_7) continue;
                                return 0;
                            }
                            throw new IllegalStateException();
                        }
                        var2_2 = this.c.c();
                        if (!((oz)var1_1).a((byte[])var2_2, 0, 11, true)) {
                            return -1;
                        }
                        this.c.e(0);
                        this.k = this.c.t();
                        this.l = this.c.w();
                        this.m = this.c.w();
                        this.m = ((long)(this.c.t() << 24) | this.m) * 1000L;
                        this.c.f(3);
                        this.g = 4;
                        continue;
                    }
                    var3_3 = this.j;
                    ((oz)var1_1).a(var3_3);
                    this.j = 0;
                    this.g = 3;
                    continue;
                }
                var2_2 = this.b.c();
                if (!((oz)var1_1).a((byte[])var2_2, 0, 9, true)) {
                    return -1;
                }
                this.b.e(0);
                this.b.f(4);
                var5_5 = this.b.t();
                var3_3 = (var5_5 & 4) != 0 ? 1 : 0;
                if ((var5_5 & 1) != 0) {
                    var4_4 = true;
                }
                if (var3_3 != 0 && this.o == null) {
                    this.o = new mh(this.f.a(8, 1));
                }
                if (var4_4 && this.p == null) {
                    this.p = new tg2(this.f.a(9, 2));
                }
                this.f.a();
                this.j = this.b.h() - 5;
                this.g = 2;
            }
        }
        throw new IllegalStateException();
    }

    public final void a(long l10, long l11) {
        if (l10 == 0L) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    public final void a(v70 v702) {
        this.f = v702;
    }

    public final boolean a(u70 u702) throws IOException {
        byte[] byArray = this.a.c();
        u702 = (oz)u702;
        boolean bl2 = false;
        ((oz)u702).b(byArray, 0, 3, false);
        this.a.e(0);
        if (this.a.w() != 4607062) {
            return false;
        }
        ((oz)u702).b(this.a.c(), 0, 2, false);
        this.a.e(0);
        if ((this.a.z() & 0xFA) != 0) {
            return false;
        }
        ((oz)u702).b(this.a.c(), 0, 4, false);
        this.a.e(0);
        int n10 = this.a.h();
        ((oz)u702).c();
        ((oz)u702).a(false, n10);
        ((oz)u702).b(this.a.c(), 0, 4, false);
        this.a.e(0);
        if (this.a.h() == 0) {
            bl2 = true;
        }
        return bl2;
    }

    public final void release() {
    }
}

