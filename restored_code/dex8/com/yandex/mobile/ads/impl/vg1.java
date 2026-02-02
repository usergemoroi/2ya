/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ag1
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.s52
 *  com.yandex.mobile.ads.impl.sr0
 *  com.yandex.mobile.ads.impl.u40
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72
 *  com.yandex.mobile.ads.impl.w72$d
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.s52;
import com.yandex.mobile.ads.impl.sr0;
import com.yandex.mobile.ads.impl.u40;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;
import com.yandex.mobile.ads.impl.zs0;

public final class vg1
implements w72 {
    private final u40 a;
    private final ag1 b;
    private int c;
    private int d;
    private s52 e;
    private boolean f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private long l;

    public vg1(u40 u402) {
        this.a = u402;
        this.b = new ag1(new byte[10]);
        this.c = 0;
    }

    private boolean a(int n10, bg1 bg12, @Nullable byte[] byArray) {
        int n13 = Math.min(bg12.a(), n10 - this.d);
        boolean bl2 = true;
        if (n13 <= 0) {
            return true;
        }
        if (byArray == null) {
            bg12.f(n13);
        } else {
            bg12.a(byArray, this.d, n13);
        }
        this.d = n13 = this.d + n13;
        if (n13 != n10) {
            bl2 = false;
        }
        return bl2;
    }

    public final void a() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.a();
    }

    /*
     * Unable to fully structure code
     */
    public final void a(int var1_1, bg1 var2_2) throws fg1 {
        block22: {
            block23: {
                block24: {
                    if (this.e == null) break block22;
                    var4_3 = 2;
                    var5_4 = 3;
                    var3_5 = -1;
                    var7_6 = 0;
                    if ((var1_1 & 1) == 0) break block23;
                    var6_7 = this.c;
                    if (var6_7 == 0 || var6_7 == 1) break block24;
                    if (var6_7 == 2) ** GOTO lbl21
                    if (var6_7 == 3) {
                        if (this.j != -1) {
                            var23_8 = new StringBuilder("Unexpected start indicator: expected ");
                            var23_8.append(this.j);
                            var23_8.append(" more bytes");
                            zs0.d((String)"PesReader", (String)var23_8.toString());
                        }
                        this.a.b();
                    } else {
                        throw new IllegalStateException();
lbl21:

                        zs0.d((String)"PesReader", (String)"Unexpected start indicator reading extended header");
                    }
                }
                this.c = 1;
                this.d = 0;
            }
            var6_7 = var1_1;
            var1_1 = var7_6;
            while (var2_2.a() > 0) {
                block21: {
                    var7_6 = this.c;
                    if (var7_6 == 0) ** GOTO lbl134
                    if (var7_6 == 1) ** GOTO lbl96
                    if (var7_6 == var4_3) ** GOTO lbl55
                    if (var7_6 == var5_4) {
                        var9_10 = var2_2.a();
                        var7_6 = this.j;
                        var8_9 = var7_6 == var3_5 ? var1_1 : var9_10 - var7_6;
                        var7_6 = var9_10;
                        if (var8_9 > 0) {
                            var7_6 = var9_10 - var8_9;
                            var2_2.d(var2_2.d() + var7_6);
                        }
                        this.a.a(var2_2);
                        var8_9 = this.j;
                        if (var8_9 != var3_5) {
                            this.j = var7_6 = var8_9 - var7_6;
                            if (var7_6 == 0) {
                                this.a.b();
                                this.c = 1;
                                this.d = var1_1;
                            }
                        }
                        var7_6 = var4_3;
                        var4_3 = var1_1;
                        var1_1 = var3_5;
                        var3_5 = var7_6;
                    } else {
                        throw new IllegalStateException();
lbl55:

                        if (this.a(Math.min(10, this.i), var2_2, this.b.a) && this.a(this.i, var2_2, null)) {
                            this.b.c(var1_1);
                            this.l = -9223372036854775807L;
                            var22_17 = this.f;
                            var1_1 = 4;
                            if (var22_17) {
                                this.b.d(4);
                                var20_16 = this.b.b(var5_4);
                                this.b.d(1);
                                var18_15 = this.b.b(15) << 15;
                                this.b.d(1);
                                var16_14 = this.b.b(15);
                                this.b.d(1);
                                if (!this.h && this.g) {
                                    this.b.d(4);
                                    var10_11 = this.b.b(var5_4);
                                    this.b.d(1);
                                    var12_12 = this.b.b(15) << 15;
                                    this.b.d(1);
                                    var14_13 = this.b.b(15);
                                    this.b.d(1);
                                    this.e.b(var12_12 | var10_11 << 30 | var14_13);
                                    this.h = true;
                                }
                                this.l = this.e.b(var18_15 | var20_16 << 30 | var16_14);
                            }
                            if (!this.k) {
                                var1_1 = 0;
                            }
                            this.a.a(var6_7 |= var1_1, this.l);
                            this.c = 3;
                            this.d = 0;
                            var1_1 = 0;
                            var3_5 = -1;
                            var5_4 = 3;
                            var4_3 = 2;
                            continue;
                        }
lbl90:

                        while (true) {
                            var4_3 = var1_1;
                            var7_6 = 2;
                            var1_1 = var3_5;
                            var3_5 = var7_6;
                            break block21;
                            break;
                        }
lbl96:

                        if (this.a(9, var2_2, this.b.a)) {
                            this.b.c(var1_1);
                            var1_1 = this.b.b(24);
                            if (var1_1 != 1) {
                                sr0.a((String)"Unexpected start code prefix: ", (int)var1_1, (String)"PesReader");
                                this.j = -1;
                                var1_1 = 0;
                            } else {
                                this.b.d(8);
                                var3_5 = this.b.b(16);
                                this.b.d(5);
                                this.k = this.b.f();
                                this.b.d(2);
                                this.f = this.b.f();
                                this.g = this.b.f();
                                this.b.d(6);
                                this.i = var1_1 = this.b.b(8);
                                if (var3_5 == 0) {
                                    this.j = -1;
                                } else {
                                    this.j = var1_1 = var3_5 - 3 - var1_1;
                                    if (var1_1 < 0) {
                                        var23_8 = new StringBuilder("Found negative packet payload size: ");
                                        var23_8.append(this.j);
                                        zs0.d((String)"PesReader", (String)var23_8.toString());
                                        this.j = -1;
                                    }
                                }
                                var1_1 = 2;
                            }
                            var3_5 = 2;
                            var4_3 = -1;
                            this.c = var1_1;
                            var7_6 = 0;
                            this.d = 0;
                            var1_1 = var4_3;
                            var4_3 = var7_6;
                        } else {
                            var3_5 = -1;

lbl134:

                            var7_6 = var3_5;
                            var2_2.f(var2_2.a());
                            var3_5 = var4_3;
                            var4_3 = var1_1;
                            var1_1 = var7_6;
                        }
                    }
                }
                var7_6 = var4_3;
                var4_3 = var3_5;
                var3_5 = var1_1;
                var1_1 = var7_6;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(s52 s522, v70 v702, w72.d d14) {
        this.e = s522;
        this.a.a(v702, d14);
    }
}

