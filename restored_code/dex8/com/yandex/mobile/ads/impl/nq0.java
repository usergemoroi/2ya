/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.k01$b
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.ul2
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.z11$a
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a21;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.c21;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.r22;
import com.yandex.mobile.ads.impl.s22;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.ul2;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.z11;
import java.io.IOException;

public final class nq0
implements t70 {
    private final bg1 a = new bg1(6);
    private v70 b;
    private int c;
    private int d;
    private int e;
    private long f = -1L;
    @Nullable
    private a21 g;
    private u70 h;
    private r22 i;
    @Nullable
    private c21 j;

    private void a() {
        v70 v702 = this.b;
        v702.getClass();
        v702.a(1024, 4).a(new /* Unavailable Anonymous Inner Class!! */.b().a(new k01(new k01.b[0])).a());
        v702 = this.b;
        v702.getClass();
        v702.a();
        this.b.a((ex1)new ex1.b(-9223372036854775807L, 0L));
        this.c = 6;
    }

    /*
     * Unable to fully structure code
     */
    public final int a(u70 var1_1, qj1 var2_2) throws IOException {
        block26: {
            block25: {
                block21: {
                    block22: {
                        block24: {
                            block23: {
                                var3_3 = this.c;
                                if (var3_3 == 0) break block21;
                                if (var3_3 == 1) break block22;
                                if (var3_3 != 2) {
                                    if (var3_3 != 4) {
                                        if (var3_3 != 5) {
                                            if (var3_3 == 6) {
                                                return -1;
                                            }
                                            throw new IllegalStateException();
                                        }
                                        if (this.i == null || var1_1 != this.h) {
                                            this.h = var1_1;
                                            var5_4 = this.f;
                                            this.i = new r22((oz)var1_1, var5_4);
                                        }
                                        var1_1 = this.j;
                                        var1_1.getClass();
                                        var3_3 = var1_1.a(this.i, (qj1)var2_2);
                                        if (var3_3 == 1) {
                                            var2_2.a += this.f;
                                        }
                                        return var3_3;
                                    }
                                    var5_5 = (var1_1 = (oz)var1_1).a();
                                    if (var5_5 != (var7_7 = this.f)) {
                                        var2_2.a = var7_7;
                                        return 1;
                                    }
                                    if (!var1_1.b(this.a.c(), 0, 1, true)) {
                                        this.a();
                                    } else {
                                        var1_1.c();
                                        if (this.j == null) {
                                            this.j = new c21();
                                        }
                                        this.i = var1_1 = new r22((oz)var1_1, this.f);
                                        if (this.j.a((u70)var1_1)) {
                                            var2_2 = this.j;
                                            var5_5 = this.f;
                                            var1_1 = this.b;
                                            var1_1.getClass();
                                            var2_2.a(new s22(var5_5, (v70)var1_1));
                                            var1_1 = this.g;
                                            var1_1.getClass();
                                            var2_2 = this.b;
                                            var2_2.getClass();
                                            var2_2.a(1024, 4).a(new /* Unavailable Anonymous Inner Class!! */.b().a(new k01(new k01.b[]{var1_1})).a());
                                            this.c = 5;
                                        } else {
                                            this.a();
                                        }
                                    }
                                    return 0;
                                }
                                if (this.d != 65505) break block23;
                                var19_9 = new bg1(this.e);
                                var2_2 = var19_9.c();
                                var3_3 = this.e;
                                var1_1 = (oz)var1_1;
                                var1_1.a((byte[])var2_2, 0, var3_3, false);
                                if (this.g != null || !"http://ns.adobe.com/xap/1.0/".equals(var19_9.q()) || (var2_2 = var19_9.q()) == null) break block24;
                                var7_8 = var1_1.b();
                                if (var7_8 == -1L || (var1_1 = ul2.a((String)var2_2)) == null || var1_1.b.size() < 2) ** GOTO lbl-1000
                                var3_3 = 0;
                                var11_11 = -1L;
                                var15_13 = var5_6 = (var9_12 = -1L);
                                var13_14 = var5_6;
                                var5_6 = var7_8;
                                for (var4_10 = var1_1.b.size() - 1; var4_10 >= 0; --var4_10) {
                                    var2_2 = (z11.a)var1_1.b.get(var4_10);
                                    var3_3 = "video/mp4".equals(var2_2.a) | var3_3;
                                    if (var4_10 == 0) {
                                        var7_8 = var5_6 - var2_2.c;
                                        var5_6 = 0L;
                                    } else {
                                        var17_15 = var5_6 - var2_2.b;
                                        var7_8 = var5_6;
                                        var5_6 = var17_15;
                                    }
                                    if (var3_3 != 0 && var5_6 != var7_8) {
                                        var15_13 = var7_8 - var5_6;
                                        var13_14 = var5_6;
                                        var3_3 = 0;
                                    }
                                    if (var4_10 != 0) continue;
                                    var11_11 = var5_6;
                                    var9_12 = var7_8;
                                }
                                if (var13_14 != -1L && var15_13 != -1L && var11_11 != -1L && var9_12 != -1L) {
                                    var1_1 = new a21(var11_11, var9_12, var1_1.a, var13_14, var15_13);
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var1_1 = null;
                                }
                                this.g = var1_1;
                                if (var1_1 != null) {
                                    this.f = var1_1.e;
                                }
                                break block24;
                            }
                            var3_3 = this.e;
                            ((oz)var1_1).a(var3_3);
                        }
                        this.c = 0;
                        return 0;
                    }
                    this.a.c(2);
                    var2_2 = this.a.c();
                    ((oz)var1_1).a((byte[])var2_2, 0, 2, false);
                    this.e = this.a.z() - 2;
                    this.c = 2;
                    return 0;
                }
                this.a.c(2);
                var2_2 = this.a.c();
                ((oz)var1_1).a((byte[])var2_2, 0, 2, false);
                this.d = var3_3 = this.a.z();
                if (var3_3 != 65498) break block25;
                if (this.f != -1L) {
                    this.c = 4;
                } else {
                    this.a();
                }
                break block26;
            }
            if (var3_3 >= 65488 && var3_3 <= 65497 || var3_3 == 65281) break block26;
            this.c = 1;
        }
        return 0;
    }

    public final void a(long l10, long l11) {
        if (l10 == 0L) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            c21 c212 = this.j;
            c212.getClass();
            c212.a(l10, l11);
        }
    }

    public final void a(v70 v702) {
        this.b = v702;
    }

    public final boolean a(u70 object) throws IOException {
        int n10;
        oz oz3 = (oz)object;
        this.a.c(2);
        object = this.a.c();
        boolean bl2 = false;
        oz3.b((byte[])object, 0, 2, false);
        if (this.a.z() != 65496) {
            return false;
        }
        this.a.c(2);
        oz3.b(this.a.c(), 0, 2, false);
        this.d = n10 = this.a.z();
        if (n10 == 65504) {
            this.a.c(2);
            oz3.b(this.a.c(), 0, 2, false);
            oz3.a(false, this.a.z() - 2);
            this.a.c(2);
            oz3.b(this.a.c(), 0, 2, false);
            this.d = this.a.z();
        }
        if (this.d != 65505) {
            return false;
        }
        oz3.a(false, 2);
        this.a.c(6);
        oz3.b(this.a.c(), 0, 6, false);
        boolean bl3 = bl2;
        if (this.a.v() == 1165519206L) {
            bl3 = bl2;
            if (this.a.z() == 0) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final void release() {
    }
}

