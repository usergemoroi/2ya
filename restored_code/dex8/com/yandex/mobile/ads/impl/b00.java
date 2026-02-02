/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ae1
 *  com.yandex.mobile.ads.impl.b32
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.ex1$a
 *  com.yandex.mobile.ads.impl.gx1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.pq2
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.zd1
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ae1;
import com.yandex.mobile.ads.impl.b32;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.gx1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.pq2;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.zd1;
import java.io.EOFException;
import java.io.IOException;

final class b00
implements ae1 {
    private final zd1 a;
    private final long b;
    private final long c;
    private final b32 d;
    private int e;
    private long f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public b00(b32 b322, long l10, long l11, long l13, long l14, boolean bl2) {
        boolean bl3 = l10 >= 0L && l11 > l10;
        uf.a((boolean)bl3);
        this.d = b322;
        this.b = l10;
        this.c = l11;
        if (l13 != l11 - l10 && !bl2) {
            this.e = 0;
        } else {
            this.f = l14;
            this.e = 4;
        }
        this.a = new zd1();
    }

    /*
     * Unable to fully structure code
     */
    public final long a(oz var1_1) throws IOException {
        block21: {
            block20: {
                block23: {
                    block22: {
                        var2_3 = this.e;
                        if (var2_3 == 0) break block20;
                        if (var2_3 == 1) break block21;
                        if (var2_3 == 2) break block22;
                        if (var2_3 != 3) {
                            if (var2_3 == 4) {
                                return -1L;
                            }
                            throw new IllegalStateException();
                        }
                        break block23;
                    }
                    if (this.i == this.j) ** GOTO lbl-1000
                    var8_4 = var1_1.a();
                    if (!this.a.a(var1_1, this.j)) {
                        var4_5 = this.i;
                        if (var4_5 == var8_4) {
                            throw new IOException("No ogg page can be found.");
                        }
                    } else {
                        this.a.a(var1_1, false);
                        var1_1.c();
                        var6_7 = this.h;
                        var16_9 = this.a;
                        var4_5 = var16_9.b;
                        var3_11 = var16_9.d + var16_9.e;
                        if (0L <= (var6_7 -= var4_5) && var6_7 < 72000L) // 2 sources

                        {
                            var4_5 = -1L;
                        } else {
                            cfr_temp_0 = var6_7 - 0L;
                            var2_3 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                            if (var2_3 < 0) {
                                this.j = var8_4;
                                this.l = var4_5;
                            } else {
                                this.i = var1_1.a() + (long)var3_11;
                                this.k = this.a.b;
                            }
                            var8_4 = this.j;
                            var4_5 = this.i;
                            if (var8_4 - var4_5 < 100000L) {
                                this.j = var4_5;
                            } else {
                                var8_4 = var3_11;
                                var4_5 = var2_3 <= 0 ? 2L : 1L;
                                var12_14 = var1_1.a();
                                var10_13 = this.j;
                                var14_15 = this.i;
                                var6_7 = (var10_13 - var14_15) * var6_7 / (this.l - this.k);
                                var2_3 = m92.a;
                                var4_5 = Math.max(var14_15, Math.min(var12_14 - var8_4 * var4_5 + var6_7, var10_13 - 1L));
                            }
                        }
                    }
                    if (var4_5 != -1L) {
                        return var4_5;
                    }
                    this.e = 3;
                }
                while (true) {
                    this.a.a(var1_1, -1L);
                    this.a.a(var1_1, false);
                    var16_9 = this.a;
                    if (var16_9.b > this.h) {
                        var1_1.c();
                        this.e = 4;
                        return -(this.k + 2L);
                    }
                    var1_1.a(var16_9.d + var16_9.e);
                    this.i = var1_1.a();
                    this.k = this.a.b;
                }
            }
            this.g = var4_6 = var1_1.a();
            this.e = 1;
            var6_8 = this.c - 65307L;
            if (var6_8 > var4_6) {
                return var6_8;
            }
        }
        var16_10 = this.a;
        var16_10.a = 0;
        var16_10.b = 0L;
        var16_10.c = 0;
        var16_10.d = 0;
        var16_10.e = 0;
        if (var16_10.a(var1_1, -1L)) {
            this.a.a(var1_1, false);
            var16_10 = this.a;
            var1_1.a(var16_10.d + var16_10.e);
            var4_6 = this.a.b;
            while (true) {
                var16_10 = this.a;
                if ((var16_10.a & 4) == 4 || !var16_10.a(var1_1, -1L) || var1_1.a() >= this.c || !this.a.a(var1_1, true)) break;
                var16_10 = this.a;
                var3_12 = var16_10.d;
                var2_3 = var16_10.e;
                var1_1.a(var3_12 + var2_3);
                var4_6 = this.a.b;
                continue;
                break;
            }
lbl96:

            while (true) {
                this.f = var4_6;
                this.e = 4;
                return this.g;
            }
        }
        throw new EOFException();
        // Removed invalid catch block
        }
    }

    @Nullable
    public final ex1 a() {
        long l10 = this.f;
        a a12 = null;
        if (l10 != 0L) {
            a12 = new a(this, null);
        }
        return a12;
    }

    public final void a(long l10) {
        long l11 = this.f;
        int n10 = m92.a;
        this.h = Math.max(0L, Math.min(l10, l11 - 1L));
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }

    private final class a
    implements ex1 {
        final b00 a;

        private a(b00 b002) {
            this.a = b002;
        }

        /* synthetic */ a(b00 b002, pq2 pq22) {
            this(b002);
        }

        public final ex1.a b(long l10) {
            long l11 = this.a.d.b(l10);
            b00 b002 = this.a;
            long l13 = b002.b;
            long l14 = b002.c;
            l11 = (l14 - l13) * l11 / b002.f;
            int n10 = m92.a;
            b002 = new gx1(l10, Math.max(l13, Math.min(l11 + l13 - 30000L, l14 - 1L)));
            return new ex1.a((gx1)b002, (gx1)b002);
        }

        public final boolean b() {
            return true;
        }

        public final long c() {
            b00 b002 = this.a;
            return b002.d.a(b002.f);
        }
    }
}

