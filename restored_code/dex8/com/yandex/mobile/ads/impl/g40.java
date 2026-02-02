/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.h40
 *  com.yandex.mobile.ads.impl.u40
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72$d
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.h40;
import com.yandex.mobile.ads.impl.u40;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;

public final class g40
implements u40 {
    private final bg1 a = new bg1(new byte[18]);
    @Nullable
    private final String b;
    private String c;
    private g62 d;
    private int e = 0;
    private int f;
    private int g;
    private long h;
    private cc0 i;
    private int j;
    private long k = -9223372036854775807L;

    public g40(@Nullable String string2) {
        this.b = string2;
    }

    public final void a() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }

    public final void a(int n10, long l10) {
        if (l10 != -9223372036854775807L) {
            this.k = l10;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(bg1 bg12) {
        if (this.d == null) {
            throw new IllegalStateException();
        }
        block0: while (true) {
            int n10;
            block9: {
                int n12;
                block21: {
                    block19: {
                        byte[] byArray;
                        block16: {
                            block20: {
                                block17: {
                                    block18: {
                                        byte by;
                                        block15: {
                                            block13: {
                                                block10: {
                                                    block14: {
                                                        block11: {
                                                            block12: {
                                                                if (bg12.a() <= 0) {
                                                                    return;
                                                                }
                                                                n10 = this.e;
                                                                if (n10 == 0) break block9;
                                                                if (n10 != 1) {
                                                                    if (n10 != 2) {
                                                                        throw new IllegalStateException();
                                                                    }
                                                                    n10 = Math.min(bg12.a(), this.j - this.f);
                                                                    this.d.a(n10, bg12);
                                                                    this.f = n10 = this.f + n10;
                                                                    n12 = this.j;
                                                                    if (n10 != n12) continue;
                                                                    long l10 = this.k;
                                                                    if (l10 != -9223372036854775807L) {
                                                                        this.d.a(l10, 1, n12, 0, null);
                                                                        this.k += this.h;
                                                                    }
                                                                    this.e = 0;
                                                                    continue;
                                                                }
                                                                byte[] byArray2 = this.a.c();
                                                                n10 = Math.min(bg12.a(), 18 - this.f);
                                                                bg12.a(byArray2, this.f, n10);
                                                                this.f = n10 = this.f + n10;
                                                                if (n10 != 18) continue;
                                                                byArray = this.a.c();
                                                                if (this.i == null) {
                                                                    cc0 cc02;
                                                                    this.i = cc02 = h40.a((byte[])byArray, (String)this.c, (String)this.b);
                                                                    this.d.a(cc02);
                                                                }
                                                                if ((by = byArray[0]) == -2) break block10;
                                                                if (by == -1) break block11;
                                                                if (by == 31) break block12;
                                                                n12 = (byArray[5] & 3) << 12 | (byArray[6] & 0xFF) << 4;
                                                                n10 = byArray[7];
                                                                break block13;
                                                            }
                                                            n10 = byArray[6];
                                                            n12 = byArray[7];
                                                            n10 = (byArray[8] & 0x3C) >> 2 | ((n10 & 3) << 12 | (n12 & 0xFF) << 4);
                                                            break block14;
                                                        }
                                                        n10 = (byArray[7] & 3) << 12 | (byArray[6] & 0xFF) << 4 | (byArray[9] & 0x3C) >> 2;
                                                    }
                                                    n12 = 1;
                                                    break block15;
                                                }
                                                n12 = (byArray[4] & 3) << 12 | (byArray[7] & 0xFF) << 4;
                                                n10 = byArray[6];
                                            }
                                            n10 = (n12 | (n10 & 0xF0) >> 4) + 1;
                                            n12 = 0;
                                        }
                                        int n13 = ++n10;
                                        if (n12 != 0) {
                                            n13 = n10 * 16 / 14;
                                        }
                                        this.j = n13;
                                        if (by == -2) break block16;
                                        if (by == -1) break block17;
                                        if (by == 31) break block18;
                                        n10 = (byArray[4] & 1) << 6;
                                        n12 = byArray[5];
                                        break block19;
                                    }
                                    n10 = (byArray[5] & 7) << 4;
                                    n12 = byArray[6];
                                    break block20;
                                }
                                n10 = (byArray[4] & 7) << 4;
                                n12 = byArray[7];
                            }
                            n12 &= 0x3C;
                            break block21;
                        }
                        n10 = (byArray[5] & 1) << 6;
                        n12 = byArray[4];
                    }
                    n12 &= 0xFC;
                }
                this.h = (int)((long)(((n12 >> 2 | n10) + 1) * 32) * 1000000L / (long)this.i.A);
                this.a.e(0);
                this.d.a(18, this.a);
                this.e = 2;
                continue;
            }
            do {
                if (bg12.a() <= 0) continue block0;
                this.g = n10 = this.g << 8;
                this.g = n10 |= bg12.t();
            } while (n10 != 2147385345 && n10 != -25230976 && n10 != 536864768 && n10 != -14745368);
            byte[] byArray = this.a.c();
            n10 = this.g;
            byArray[0] = (byte)(n10 >> 24 & 0xFF);
            byArray[1] = (byte)(n10 >> 16 & 0xFF);
            byArray[2] = (byte)(n10 >> 8 & 0xFF);
            byArray[3] = (byte)(n10 & 0xFF);
            this.f = 4;
            this.g = 0;
            this.e = 1;
        }
    }

    public final void a(v70 v702, w72.d d10) {
        d10.a();
        this.c = d10.b();
        this.d = v702.a(d10.c(), 1);
    }

    public final void b() {
    }
}

