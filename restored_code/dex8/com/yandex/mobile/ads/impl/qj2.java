/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.b32
 *  com.yandex.mobile.ads.impl.b32$a
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.nj2
 *  com.yandex.mobile.ads.impl.qj2$a
 *  com.yandex.mobile.ads.impl.rj2
 *  com.yandex.mobile.ads.impl.rj2$a
 *  com.yandex.mobile.ads.impl.rj2$b
 *  com.yandex.mobile.ads.impl.rj2$c
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.b32;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.nj2;
import com.yandex.mobile.ads.impl.qj2;
import com.yandex.mobile.ads.impl.rj2;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.zs0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

final class qj2
extends b32 {
    @Nullable
    private a n;
    private int o;
    private boolean p;
    @Nullable
    private rj2.c q;
    @Nullable
    private rj2.a r;

    qj2() {
    }

    protected final long a(bg1 bg12) {
        Object object = bg12.c();
        int n10 = 0;
        if ((object[0] & 1) == 1) {
            return -1L;
        }
        int n13 = bg12.c()[0];
        object = this.n;
        if (object != null) {
            int n14 = object.e;
            n13 = !object.d[n13 >> 1 & 255 >>> 8 - n14].a ? object.a.e : object.a.f;
            if (this.p) {
                n10 = (this.o + n13) / 4;
            }
            long l10 = n10;
            if (bg12.b() < bg12.e() + 4) {
                bg12.a(Arrays.copyOf(bg12.c(), bg12.e() + 4));
            } else {
                bg12.d(bg12.e() + 4);
            }
            object = bg12.c();
            object[bg12.e() - 4] = (byte)(l10 & 0xFFL);
            object[bg12.e() - 3] = (byte)(l10 >>> 8 & 0xFFL);
            object[bg12.e() - 2] = (byte)(l10 >>> 16 & 0xFFL);
            object[bg12.e() - 1] = (byte)(l10 >>> 24 & 0xFFL);
            this.p = true;
            this.o = n13;
            return l10;
        }
        throw new IllegalStateException();
    }

    protected final void a(boolean bl2) {
        super.a(bl2);
        if (bl2) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @EnsuresNonNullIf(expression={"#3.format"}, result=false)
    protected final boolean a(bg1 var1_1, long var2_2, b32.a var4_3) throws IOException {
        block57: {
            block56: {
                if (this.n != null) {
                    var4_3.a.getClass();
                    return false;
                }
                var22_4 = this.q;
                if (var22_4 == null) {
                    this.q = rj2.a((bg1)var1_1);
lbl8:
                    // 2 sources

                    while (true) {
                        var1_1 = null;
                        break block56;
                        break;
                    }
                }
                var17_5 = this.r;
                if (var17_5 == null) {
                    this.r = rj2.a((bg1)var1_1, (boolean)true, (boolean)true);
                    ** continue;
                }
                var18_6 = new byte[var1_1.e()];
                System.arraycopy(var1_1.c(), 0, var18_6, 0, var1_1.e());
                var11_7 = var22_4.a;
                rj2.a((int)5, (bg1)var1_1, (boolean)false);
                var5_8 = var1_1.t() + 1;
                var19_9 = new nj2(var1_1.c());
                var19_9.b(var1_1.d() * 8);
                var1_1 = var19_9;
                for (var6_10 = 0; var6_10 < var5_8; ++var6_10) {
                    if (var1_1.a(24) == 5653314) {
                        var12_15 = var1_1.a(16);
                        var13_16 = var1_1.a(24);
                        var23_21 = new long[var13_16];
                        var14_17 = var1_1.b();
                        var2_2 = 0L;
                        if (!var14_17) {
                            var14_17 = var1_1.b();
                            block2: for (var7_11 = 0; var7_11 < var13_16; ++var7_11) {
                                if (var14_17) {
                                    if (var1_1.b()) {
                                        var23_21[var7_11] = var1_1.a(5) + 1;
lbl37:
                                        // 2 sources

                                        while (true) {
                                            var19_9 = var1_1;
                                            continue block2;
                                            break;
                                        }
                                    }
                                    var23_21[var7_11] = 0L;
                                    ** continue;
                                }
                                var19_9 = var1_1;
                                var23_21[var7_11] = var19_9.a(5) + 1;
                            }
                            var19_9 = var1_1;
                            var1_1 = var18_6;
                            var20_19 /* !! */  = var17_5;
                        } else {
                            var7_11 = var5_8;
                            var21_20 = var1_1;
                            var8_12 = var21_20.a(5) + 1;
                            var9_13 = 0;
                            while (true) {
                                var20_19 /* !! */  = var17_5;
                                var1_1 = var18_6;
                                var19_9 = var21_20;
                                var5_8 = var7_11;
                                if (var9_13 >= var13_16) break;
                                var5_8 = 0;
                                for (var10_14 = var13_16 - var9_13; var10_14 > 0; var10_14 >>>= 1) {
                                    ++var5_8;
                                }
                                var10_14 = var21_20.a(var5_8);
                                for (var5_8 = 0; var5_8 < var10_14 && var9_13 < var13_16; ++var9_13, ++var5_8) {
                                    var23_21[var9_13] = var8_12;
                                }
                                ++var8_12;
                            }
                        }
                        var7_11 = var19_9.a(4);
                        if (var7_11 <= 2) {
                            if (var7_11 == 1 || var7_11 == 2) {
                                var19_9.b(32);
                                var19_9.b(32);
                                var8_12 = var19_9.a(4);
                                var19_9.b(1);
                                if (var7_11 == 1) {
                                    if (var12_15 != 0) {
                                        var2_2 = var13_16;
                                        var15_18 = var12_15;
                                        var2_2 = (long)Math.floor(Math.pow(var2_2, 1.0 / (double)var15_18));
                                    }
                                } else {
                                    var2_2 = (long)var13_16 * (long)var12_15;
                                }
                                var19_9.b((int)((long)(var8_12 + 1) * var2_2));
                            }
                            var17_5 = var20_19 /* !! */ ;
                            var18_6 = var1_1;
                            var1_1 = var19_9;
                            continue;
                        }
                        var1_1 = new StringBuilder("lookup type greater than 2 not decodable: ");
                        var1_1.append(var7_11);
                        throw fg1.a((String)var1_1.toString(), null);
                    }
                    var4_3 = new StringBuilder("expected code book to start with [0x56, 0x43, 0x42] at ");
                    var4_3.append(var1_1.a());
                    throw fg1.a((String)var4_3.toString(), null);
                }
                var6_10 = var1_1.a(6);
                for (var5_8 = 0; var5_8 < var6_10 + 1; ++var5_8) {
                    if (var1_1.a(16) == 0) {
                        continue;
                    }
                    throw fg1.a((String)"placeholder of time domain transforms not zeroed out", null);
                }
                var10_14 = var1_1.a(6);
                for (var5_8 = 0; var5_8 < var10_14 + 1; ++var5_8) {
                    var6_10 = var1_1.a(16);
                    if (var6_10 != 0) {
                        if (var6_10 == 1) {
                            var12_15 = var1_1.a(5);
                            var19_9 = new int[var12_15];
                            var8_12 = -1;
                            for (var6_10 = 0; var6_10 < var12_15; ++var6_10) {
                                var9_13 = var1_1.a(4);
                                var19_9[var6_10] = (nj2)var9_13;
                                var7_11 = var8_12;
                                if (var9_13 > var8_12) {
                                    var7_11 = var9_13;
                                }
                                var8_12 = var7_11;
                            }
                            var20_19 /* !! */  = (rj2.a)new int[++var8_12];
                            for (var6_10 = 0; var6_10 < var8_12; ++var6_10) {
                                var20_19 /* !! */ [var6_10] = (rj2.a)(var1_1.a(3) + 1);
                                var9_13 = var1_1.a(2);
                                if (var9_13 > 0) {
                                    var1_1.b(8);
                                }
                                for (var7_11 = 0; var7_11 < 1 << var9_13; ++var7_11) {
                                    var1_1.b(8);
                                }
                            }
                            var1_1.b(2);
                            var9_13 = var1_1.a(4);
                            var8_12 = 0;
                            var7_11 = 0;
                            for (var6_10 = 0; var6_10 < var12_15; ++var6_10) {
                                var8_12 += var20_19 /* !! */ [var19_9[var6_10]];
                                while (var7_11 < var8_12) {
                                    var1_1.b(var9_13);
                                    ++var7_11;
                                }
                            }
                            continue;
                        }
                        var1_1 = new StringBuilder("floor type greater than 1 not decodable: ");
                        var1_1.append(var6_10);
                        throw fg1.a((String)var1_1.toString(), null);
                    }
                    var1_1.b(8);
                    var1_1.b(16);
                    var1_1.b(16);
                    var1_1.b(6);
                    var1_1.b(8);
                    var7_11 = var1_1.a(4);
                    for (var6_10 = 0; var6_10 < var7_11 + 1; ++var6_10) {
                        var1_1.b(8);
                    }
                }
                var8_12 = var1_1.a(6);
                for (var5_8 = 0; var5_8 < var8_12 + 1; ++var5_8) {
                    if (var1_1.a(16) <= 2) {
                        var1_1.b(24);
                        var1_1.b(24);
                        var1_1.b(24);
                        var9_13 = var1_1.a(6) + 1;
                        var1_1.b(8);
                        var19_9 = new int[var9_13];
                        for (var6_10 = 0; var6_10 < var9_13; ++var6_10) {
                            var10_14 = var1_1.a(3);
                            var7_11 = var1_1.b() != false ? var1_1.a(5) : 0;
                            var19_9[var6_10] = var7_11 * 8 + var10_14;
                        }
                        for (var6_10 = 0; var6_10 < var9_13; ++var6_10) {
                            for (var7_11 = 0; var7_11 < 8; ++var7_11) {
                                if ((var19_9[var6_10] & 1 << var7_11) == 0) continue;
                                var1_1.b(8);
                            }
                        }
                        continue;
                    }
                    throw fg1.a((String)"residueType greater than 2 is not decodable", null);
                }
                var12_15 = var1_1.a(6);
                for (var5_8 = 0; var5_8 < var12_15 + 1; ++var5_8) {
                    var6_10 = var1_1.a(16);
                    if (var6_10 != 0) {
                        var19_9 = new StringBuilder("mapping type other than 0 not supported: ");
                        var19_9.append(var6_10);
                        zs0.b((String)"VorbisUtil", (String)var19_9.toString());
                        continue;
                    }
                    var6_10 = var1_1.b() != false ? var1_1.a(4) + 1 : 1;
                    if (var1_1.b()) {
                        var13_16 = var1_1.a(8);
                        for (var7_11 = 0; var7_11 < var13_16 + 1; ++var7_11) {
                            var9_13 = 0;
                            for (var10_14 = var8_12 = var11_7 - 1; var10_14 > 0; var10_14 >>>= 1) {
                                ++var9_13;
                            }
                            var1_1.b(var9_13);
                            var9_13 = 0;
                            while (var8_12 > 0) {
                                ++var9_13;
                                var8_12 >>>= 1;
                            }
                            var1_1.b(var9_13);
                        }
                    }
                    if (var1_1.a(2) == 0) {
                        if (var6_10 > 1) {
                            for (var7_11 = 0; var7_11 < var11_7; ++var7_11) {
                                var1_1.b(4);
                            }
                        }
                        for (var7_11 = 0; var7_11 < var6_10; ++var7_11) {
                            var1_1.b(8);
                            var1_1.b(8);
                            var1_1.b(8);
                        }
                        continue;
                    }
                    throw fg1.a((String)"to reserved bits must be zero after mapping coupling steps", null);
                }
                var7_11 = var1_1.a(6);
                var6_10 = var7_11 + 1;
                var19_9 = new rj2.b[var6_10];
                for (var5_8 = 0; var5_8 < var6_10; ++var5_8) {
                    var14_17 = var1_1.b();
                    var1_1.a(16);
                    var1_1.a(16);
                    var1_1.a(8);
                    var19_9[var5_8] = new rj2.b(var14_17);
                }
                if (!var1_1.b()) break block57;
                var6_10 = 0;
                for (var5_8 = var7_11; var5_8 > 0; var5_8 >>>= 1) {
                    ++var6_10;
                }
                var1_1 = new /* Unavailable Anonymous Inner Class!! */;
            }
            this.n = var1_1;
            if (var1_1 == null) {
                return true;
            }
            var17_5 = var1_1.a;
            var18_6 = new ArrayList<E>();
            var18_6.add(var17_5.g);
            var18_6.add(var1_1.c);
            var1_1 = rj2.a(xj0.b(var1_1.b.a));
            var4_3.a = new /* Unavailable Anonymous Inner Class!! */.e("audio/vorbis").b(var17_5.d).j(var17_5.c).c(var17_5.a).l(var17_5.b).a((List)var18_6).a((k01)var1_1).a();
            return true;
        }
        throw fg1.a((String)"framing bit after modes not set as expected", null);
    }

    protected final void c(long l10) {
        super.c(l10);
        int n10 = 0;
        boolean bl2 = l10 != 0L;
        this.p = bl2;
        rj2.c c11 = this.q;
        if (c11 != null) {
            n10 = c11.e;
        }
        this.o = n10;
    }
}

