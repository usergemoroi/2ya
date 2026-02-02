/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.iv
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.wj2$b
 *  com.yandex.mobile.ads.impl.xj2
 *  com.yandex.mobile.ads.impl.yj2
 *  com.yandex.mobile.ads.impl.yj2$a
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.e73;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.iv;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.wj2;
import com.yandex.mobile.ads.impl.xj2;
import com.yandex.mobile.ads.impl.yj2;
import com.yandex.mobile.ads.impl.zj2;
import com.yandex.mobile.ads.impl.zs0;
import java.io.IOException;

public final class wj2
implements t70 {
    private v70 a;
    private g62 b;
    private int c = 0;
    private long d = -1L;
    private b e;
    private int f = -1;
    private long g = -1L;

    static {
        new e73();
    }

    private static /* synthetic */ t70[] a() {
        return new t70[]{new wj2()};
    }

    public static /* synthetic */ t70[] b() {
        return wj2.a();
    }

    public final int a(u70 object, qj1 object2) throws IOException {
        block19: {
            block31: {
                block34: {
                    block33: {
                        block32: {
                            int n10;
                            block20: {
                                long l10;
                                block21: {
                                    block30: {
                                        block23: {
                                            block29: {
                                                int n13;
                                                block26: {
                                                    block28: {
                                                        block27: {
                                                            int n14;
                                                            block25: {
                                                                block24: {
                                                                    block22: {
                                                                        if (this.b == null) break block19;
                                                                        n10 = m92.a;
                                                                        n13 = this.c;
                                                                        n14 = -1;
                                                                        n10 = 4;
                                                                        if (n13 == 0) break block20;
                                                                        l10 = -1L;
                                                                        if (n13 == 1) break block21;
                                                                        if (n13 != 2) {
                                                                            if (n13 != 3) {
                                                                                if (n13 == 4) {
                                                                                    long l11 = this.g;
                                                                                    if (l11 != -1L) {
                                                                                        object = (oz)object;
                                                                                        l10 = ((oz)object).a();
                                                                                        object2 = this.e;
                                                                                        object2.getClass();
                                                                                        n10 = object2.a((oz)object, l11 - l10) ? n14 : 0;
                                                                                        return n10;
                                                                                    }
                                                                                    throw new IllegalStateException();
                                                                                }
                                                                                throw new IllegalStateException();
                                                                            }
                                                                            object2 = (oz)object;
                                                                            object = yj2.c((oz)object2);
                                                                            this.f = ((Long)((Pair)object).first).intValue();
                                                                            long l13 = (Long)((Pair)object).second;
                                                                            long l14 = this.d;
                                                                            l10 = l13;
                                                                            if (l14 != -1L) {
                                                                                l10 = l13;
                                                                                if (l13 == 0xFFFFFFFFL) {
                                                                                    l10 = l14;
                                                                                }
                                                                            }
                                                                            this.g = (long)this.f + l10;
                                                                            l10 = ((oz)object2).b();
                                                                            if (l10 != -1L && this.g > l10) {
                                                                                object = new StringBuilder("Data exceeds input length: ");
                                                                                ((StringBuilder)object).append(this.g);
                                                                                ((StringBuilder)object).append(", ");
                                                                                ((StringBuilder)object).append(l10);
                                                                                zs0.d((String)"WavExtractor", (String)((StringBuilder)object).toString());
                                                                                this.g = l10;
                                                                            }
                                                                            object = this.e;
                                                                            object.getClass();
                                                                            object.a(this.f, this.g);
                                                                            this.c = 4;
                                                                            return 0;
                                                                        }
                                                                        object = yj2.b((oz)((oz)object));
                                                                        n14 = ((xj2)object).a;
                                                                        if (n14 != 17) break block22;
                                                                        this.e = new a(this.a, this.b, (xj2)object);
                                                                        break block23;
                                                                    }
                                                                    if (n14 != 6) break block24;
                                                                    this.e = new c(this.a, this.b, (xj2)object, "audio/g711-alaw", -1);
                                                                    break block23;
                                                                }
                                                                if (n14 != 7) break block25;
                                                                this.e = new c(this.a, this.b, (xj2)object, "audio/g711-mlaw", -1);
                                                                break block23;
                                                            }
                                                            n13 = ((xj2)object).e;
                                                            if (n14 == 1) break block26;
                                                            if (n14 == 3) break block27;
                                                            if (n14 == 65534) break block26;
                                                            break block28;
                                                        }
                                                        if (n13 == 32) break block29;
                                                    }
                                                    n10 = 0;
                                                    break block29;
                                                }
                                                n10 = m92.b((int)n13);
                                            }
                                            if (n10 == 0) break block30;
                                            this.e = new c(this.a, this.b, (xj2)object, "audio/raw", n10);
                                        }
                                        this.c = 3;
                                        return 0;
                                    }
                                    object2 = new StringBuilder("Unsupported WAV format type: ");
                                    ((StringBuilder)object2).append(((xj2)object).a);
                                    throw fg1.a((String)((StringBuilder)object2).toString());
                                }
                                object2 = new bg1(8);
                                object = (oz)object;
                                yj2.a a14 = yj2.a.a((oz)object, (bg1)object2);
                                if (a14.a != 1685272116) {
                                    ((oz)object).c();
                                } else {
                                    ((oz)object).a(false, 8);
                                    object2.e(0);
                                    ((oz)object).b(object2.c(), 0, 8, false);
                                    l10 = object2.l();
                                    ((oz)object).a((int)a14.b + 8);
                                }
                                this.d = l10;
                                this.c = 2;
                                return 0;
                            }
                            if (((oz)(object = (oz)object)).a() != 0L) break block31;
                            n10 = this.f;
                            if (n10 == -1) break block32;
                            ((oz)object).a(n10);
                            this.c = 4;
                            break block33;
                        }
                        if (!yj2.a((oz)object)) break block34;
                        ((oz)object).a((int)(((oz)object).d() - ((oz)object).a()));
                        this.c = 1;
                    }
                    return 0;
                }
                throw fg1.a((String)"Unsupported or unrecognized wav file type.", null);
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public final void a(long l10, long l11) {
        int n10 = l10 == 0L ? 0 : 4;
        this.c = n10;
        b b11 = this.e;
        if (b11 != null) {
            b11.a(l11);
        }
    }

    public final void a(v70 v702) {
        this.a = v702;
        this.b = v702.a(0, 1);
        v702.a();
    }

    public final boolean a(u70 u702) throws IOException {
        return yj2.a((oz)((oz)u702));
    }

    public final void release() {
    }

    private static final class a
    implements b {
        private static final int[] m = new int[]{-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        private static final int[] n = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, Short.MAX_VALUE};
        private final v70 a;
        private final g62 b;
        private final xj2 c;
        private final int d;
        private final byte[] e;
        private final bg1 f;
        private final int g;
        private final cc0 h;
        private int i;
        private long j;
        private int k;
        private long l;

        public a(v70 object, g62 g622, xj2 xj22) throws fg1 {
            int n10;
            int n13;
            this.a = object;
            this.b = g622;
            this.c = xj22;
            this.g = n13 = Math.max(1, xj22.c / 10);
            object = new bg1(xj22.f);
            object.o();
            this.d = n10 = object.o();
            int n14 = xj22.b;
            int n15 = (xj22.d - n14 * 4) * 8 / (xj22.e * n14) + 1;
            if (n10 == n15) {
                n15 = m92.a((int)n13, (int)n10);
                this.e = new byte[xj22.d * n15];
                this.f = new bg1(n15 * com.yandex.mobile.ads.impl.wj2$a.a(n10, n14));
                n10 = xj22.c * xj22.d * 8 / n10;
                this.h = new /* Unavailable Anonymous Inner Class!! */.e("audio/raw").b(n10).j(n10).h(com.yandex.mobile.ads.impl.wj2$a.a(n13, n14)).c(xj22.b).l(xj22.c).i(2).a();
                return;
            }
            object = new StringBuilder("Expected frames per block: ");
            ((StringBuilder)object).append(n15);
            ((StringBuilder)object).append("; got: ");
            ((StringBuilder)object).append(n10);
            throw fg1.a((String)((StringBuilder)object).toString(), null);
        }

        private static int a(int n10, int n13) {
            return n10 * 2 * n13;
        }

        public final void a(int n10, long l10) {
            this.a.a((ex1)new zj2(this.c, this.d, n10, l10));
            this.b.a(this.h);
        }

        public final void a(long l10) {
            this.i = 0;
            this.j = l10;
            this.k = 0;
            this.l = 0L;
        }

        /*
         * Unable to fully structure code
         * Could not resolve type clashes
         */
        public final boolean a(oz var1_1, long var2_2) throws IOException {
            var4_3 = this.g;
            var5_4 = this.k;
            var21_5 = this.c;
            var7_6 = var5_4 / (var21_5.b * 2);
            var5_4 = this.d;
            var6_7 = m92.a;
            var18_8 = true;
            var4_3 = (var4_3 - var7_6 + var5_4 - 1) / var5_4 * var21_5.d;
            if (var2_2 == 0L) ** GOTO lbl14
            var17_9 = false;
            while (!var17_9 && (var5_4 = this.i) < var4_3) {
                block12: {
                    var5_4 = (int)Math.min((long)(var4_3 - var5_4), var2_2);
                    if ((var5_4 = var1_1.read(this.e, this.i, var5_4)) != -1) break block12;
lbl14:

                    var17_9 = true;
                    continue;
                }
                this.i += var5_4;
            }
            var13_10 = this.i / this.c.d;
            if (var13_10 > 0) {
                var1_1 = this.e;
                var21_5 = this.f;
                for (var4_3 = 0; var4_3 < var13_10; ++var4_3) {
                    for (var5_4 = 0; var5_4 < this.c.b; ++var5_4) {
                        var22_19 = var21_5.c();
                        var23_20 /* !! */  = this.c;
                        var6_7 = var23_20 /* !! */ .d;
                        var14_16 = var23_20 /* !! */ .b;
                        var15_17 = var5_4 * 4 + var4_3 * var6_7;
                        var16_18 = var6_7 / var14_16;
                        var9_12 = (var1_1[var15_17 + 1] & 255) << 8 | var1_1[var15_17] & 255;
                        var6_7 = Math.min(var1_1[var15_17 + 2] & 255, 88);
                        var10_13 /* !! */  = com.yandex.mobile.ads.impl.wj2$a.n[var6_7];
                        var8_11 = (this.d * var4_3 * var14_16 + var5_4) * 2;
                        var22_19[var8_11] = (byte)(var9_12 & 255);
                        var22_19[var8_11 + 1] = (byte)(var9_12 >> 8);
                        for (var7_6 = 0; var7_6 < (var16_18 - 4) * 2; ++var7_6) {
                            var11_14 = var1_1[var7_6 / 8 * var14_16 * 4 + (var14_16 * 4 + var15_17) + var7_6 / 2 % 4];
                            var11_14 = var7_6 % 2 == 0 ? (Object)(var11_14 & 15) : (Object)((var11_14 & 255) >> 4);
                            var10_13 /* !! */  = var12_15 = ((var11_14 & 7) * 2 + 1) * var10_13 /* !! */  >> 3;
                            if ((var11_14 & 8) != 0) {
                                var10_13 /* !! */  = -var12_15;
                            }
                            var12_15 = m92.a;
                            var9_12 = Math.max(-32768, Math.min(var9_12 + var10_13 /* !! */ , 32767));
                            var22_19[var8_11 += var14_16 * 2] = (byte)(var9_12 & 255);
                            var22_19[var8_11 + 1] = (byte)(var9_12 >> 8);
                            var10_13 /* !! */  = com.yandex.mobile.ads.impl.wj2$a.m[var11_14];
                            var23_20 /* !! */  = (xj2)com.yandex.mobile.ads.impl.wj2$a.n;
                            var6_7 = Math.max(0, Math.min(var6_7 + var10_13 /* !! */ , 88));
                            var10_13 /* !! */  = (int)var23_20 /* !! */ [var6_7];
                        }
                        var18_8 = true;
                    }
                }
                var4_3 = this.d;
                var5_4 = this.c.b;
                var21_5.e(0);
                var21_5.d(var4_3 * var13_10 * 2 * var5_4);
                this.i -= var13_10 * this.c.d;
                var4_3 = this.f.e();
                this.b.a(var4_3, this.f);
                this.k = var4_3 = this.k + var4_3;
                var1_1 = this.c;
                var5_4 = var4_3 / (var1_1.b * 2);
                var4_3 = this.g;
                if (var5_4 >= var4_3) {
                    var19_21 = this.j;
                    var2_2 = m92.a((long)this.l, (long)1000000L, (long)var1_1.c);
                    var5_4 = var4_3 * 2 * this.c.b;
                    var6_7 = this.k;
                    this.b.a(var19_21 + var2_2, 1, var5_4, var6_7 - var5_4, null);
                    this.l += (long)var4_3;
                    this.k -= var5_4;
                }
            }
            if (var17_9) {
                var4_3 = this.k;
                var1_1 = this.c;
                var6_7 = var4_3 / (var1_1.b * 2);
                if (var6_7 > 0) {
                    var19_21 = this.j;
                    var2_2 = m92.a((long)this.l, (long)1000000L, (long)var1_1.c);
                    var5_4 = var6_7 * 2 * this.c.b;
                    var4_3 = this.k;
                    this.b.a(var19_21 + var2_2, 1, var5_4, var4_3 - var5_4, null);
                    this.l += (long)var6_7;
                    this.k -= var5_4;
                }
            }
            return var17_9;
        }
    }

    private static final class c
    implements b {
        private final v70 a;
        private final g62 b;
        private final xj2 c;
        private final cc0 d;
        private final int e;
        private long f;
        private int g;
        private long h;

        public c(v70 object, g62 g622, xj2 xj22, String string2, int n10) throws fg1 {
            this.a = object;
            this.b = g622;
            this.c = xj22;
            int n13 = xj22.b * xj22.e / 8;
            if (xj22.d == n13) {
                int n14 = xj22.c * n13;
                int n15 = n14 * 8;
                this.e = n13 = Math.max(n13, n14 / 10);
                this.d = new /* Unavailable Anonymous Inner Class!! */.e(string2).b(n15).j(n15).h(n13).c(xj22.b).l(xj22.c).i(n10).a();
                return;
            }
            object = new StringBuilder("Expected block size: ");
            ((StringBuilder)object).append(n13);
            ((StringBuilder)object).append("; got: ");
            ((StringBuilder)object).append(xj22.d);
            throw fg1.a((String)((StringBuilder)object).toString(), null);
        }

        public final void a(int n10, long l10) {
            this.a.a((ex1)new zj2(this.c, 1, n10, l10));
            this.b.a(this.d);
        }

        public final void a(long l10) {
            this.f = l10;
            this.g = 0;
            this.h = 0L;
        }

        public final boolean a(oz oz3, long l10) throws IOException {
            int n10;
            int n13;
            boolean bl2;
            long l11;
            while (true) {
                long l13;
                l11 = (l13 = l10 - 0L) == 0L ? 0 : (l13 < 0L ? -1 : 1);
                bl2 = true;
                if (l11 <= 0 || (n13 = this.g) >= (n10 = this.e)) break;
                l11 = (int)Math.min((long)(n10 - n13), l10);
                if ((l11 = (long)this.b.b((iv)oz3, (int)l11, true)) == -1) {
                    l10 = 0L;
                    continue;
                }
                this.g += l11;
                l10 -= (long)l11;
            }
            oz3 = this.c;
            n10 = ((xj2)oz3).d;
            n13 = this.g / n10;
            if (n13 > 0) {
                long l14 = this.f;
                l10 = m92.a((long)this.h, (long)1000000L, (long)((xj2)oz3).c);
                int n14 = n13 * n10;
                n10 = this.g - n14;
                this.b.a(l14 + l10, 1, n14, n10, null);
                this.h += (long)n13;
                this.g = n10;
            }
            if (l11 > 0) {
                bl2 = false;
            }
            return bl2;
        }
    }
}

