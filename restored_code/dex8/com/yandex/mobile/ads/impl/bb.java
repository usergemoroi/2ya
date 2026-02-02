/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.a
 *  com.yandex.mobile.ads.impl.a$a
 *  com.yandex.mobile.ads.impl.ag1
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.u40
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72$d
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a;
import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.k40;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.u40;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;
import com.yandex.mobile.ads.impl.zs0;
import java.util.Arrays;
import java.util.Collections;

public final class bb
implements u40 {
    private static final byte[] v = new byte[]{73, 68, 51};
    private final boolean a;
    private final ag1 b = new ag1(new byte[7]);
    private final bg1 c = new bg1(Arrays.copyOf(v, 10));
    @Nullable
    private final String d;
    private String e;
    private g62 f;
    private g62 g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private long q;
    private int r;
    private long s;
    private g62 t;
    private long u;

    public bb() {
        this(null, true);
    }

    public bb(@Nullable String string2, boolean bl2) {
        this.d();
        this.m = -1;
        this.n = -1;
        this.q = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.a = bl2;
        this.d = string2;
    }

    private void d() {
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }

    public final void a() {
        this.s = -9223372036854775807L;
        this.l = false;
        this.d();
    }

    public final void a(int n10, long l10) {
        if (l10 != -9223372036854775807L) {
            this.s = l10;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(bg1 bg12) throws fg1 {
        int n10 = -1;
        this.f.getClass();
        int n12 = m92.a;
        block0: while (bg12.a() > 0) {
            int n13;
            int n14;
            n12 = this.h;
            if (n12 != 0) {
                if (n12 != 1) {
                    if (n12 != 2) {
                        long l10;
                        if (n12 != 3) {
                            if (n12 != 4) {
                                throw new IllegalStateException();
                            }
                            n12 = Math.min(bg12.a(), this.r - this.i);
                            this.t.a(n12, bg12);
                            this.i = n12 = this.i + n12;
                            n14 = this.r;
                            if (n12 != n14) continue;
                            l10 = this.s;
                            if (l10 != -9223372036854775807L) {
                                this.t.a(l10, 1, n14, 0, null);
                                this.s += this.u;
                            }
                            this.d();
                            continue;
                        }
                        n12 = this.k ? 7 : 5;
                        byte[] byArray = this.b.a;
                        n14 = Math.min(bg12.a(), n12 - this.i);
                        bg12.a(byArray, this.i, n14);
                        this.i = n14 = this.i + n14;
                        if (n14 != n12) continue;
                        this.b.c(0);
                        if (!this.p) {
                            n12 = n14 = this.b.b(2) + 1;
                            if (n14 != 2) {
                                StringBuilder stringBuilder = new StringBuilder("Detected audio object type: ");
                                stringBuilder.append(n14);
                                stringBuilder.append(", but assuming AAC LC.");
                                zs0.d((String)"AdtsReader", (String)stringBuilder.toString());
                                n12 = 2;
                            }
                            this.b.d(5);
                            n14 = this.b.b(3);
                            n13 = this.n;
                            byte by = (byte)(n12 << 3 & 0xF8 | n13 >> 1 & 7);
                            byte by2 = (byte)(n14 << 3 & 0x78 | n13 << 7 & 0x80);
                            byte[] byArray2 = new byte[]{by, by2};
                            a.a a12 = com.yandex.mobile.ads.impl.a.a((ag1)new ag1(2, byArray2), (boolean)false);
                            cc0 cc02 = new /* Unavailable Anonymous Inner Class!! */.b(this.e).e("audio/mp4a-latm").a(a12.c).c(a12.b).l(a12.a).a(Collections.singletonList(byArray2)).d(this.d).a();
                            this.q = 1024000000L / (long)cc02.A;
                            this.f.a(cc02);
                            this.p = true;
                        } else {
                            this.b.d(10);
                        }
                        this.b.d(4);
                        n14 = this.b.b(13);
                        n12 = n14 - 7;
                        if (this.k) {
                            n12 = n14 - 9;
                        }
                        g62 g622 = this.f;
                        l10 = this.q;
                        this.h = 4;
                        this.i = 0;
                        this.t = g622;
                        this.u = l10;
                        this.r = n12;
                        continue;
                    }
                    byte[] byArray = this.c.c();
                    n12 = Math.min(bg12.a(), 10 - this.i);
                    bg12.a(byArray, this.i, n12);
                    this.i = n12 = this.i + n12;
                    if (n12 != 10) continue;
                    this.g.a(10, this.c);
                    this.c.e(6);
                    g62 g623 = this.g;
                    n12 = this.c.s();
                    this.h = 4;
                    this.i = 10;
                    this.t = g623;
                    this.u = 0L;
                    this.r = n12 + 10;
                    continue;
                }
                if (bg12.a() == 0) continue;
                this.b.a[0] = bg12.c()[bg12.d()];
                this.b.c(2);
                n14 = this.b.b(4);
                n12 = this.n;
                if (n12 != n10 && n14 != n12) {
                    this.l = false;
                    this.d();
                    continue;
                }
                if (!this.l) {
                    this.l = true;
                    this.m = this.o;
                    this.n = n14;
                }
                this.h = 3;
                this.i = 0;
                continue;
            }
            byte[] byArray = bg12.c();
            n12 = bg12.d();
            int n15 = bg12.e();
            while (n12 < n15) {
                block28: {
                    block42: {
                        int n16;
                        block29: {
                            byte by;
                            block30: {
                                byte[] byArray3;
                                int n17;
                                block41: {
                                    int n18;
                                    block40: {
                                        block39: {
                                            block38: {
                                                byte by3;
                                                block36: {
                                                    block37: {
                                                        block35: {
                                                            block32: {
                                                                block34: {
                                                                    block33: {
                                                                        block31: {
                                                                            n13 = n12 + 1;
                                                                            by = byArray[n12];
                                                                            n16 = by & 0xFF;
                                                                            if (this.j != 512 || (((byte)n16 & 0xFF | 0xFF00) & 0xFFF6) != 65520) break block29;
                                                                            if (this.l) break block30;
                                                                            bg12.e(n12);
                                                                            byte[] byArray4 = this.b.a;
                                                                            if (bg12.a() < 1) break block29;
                                                                            bg12.a(byArray4, 0, 1);
                                                                            this.b.c(4);
                                                                            n17 = this.b.b(1);
                                                                            n14 = this.m;
                                                                            if (n14 != n10 && n17 != n14) break block29;
                                                                            if (this.n == n10) break block31;
                                                                            byte[] byArray5 = this.b.a;
                                                                            if (bg12.a() < 1) break block32;
                                                                            bg12.a(byArray5, 0, 1);
                                                                            this.b.c(2);
                                                                            if (this.b.b(4) != this.n) break block33;
                                                                            bg12.e(n13);
                                                                        }
                                                                        byte[] byArray6 = this.b.a;
                                                                        if (bg12.a() < 4) break block32;
                                                                        bg12.a(byArray6, 0, 4);
                                                                        this.b.c(14);
                                                                        n14 = this.b.b(13);
                                                                        if (n14 >= 7) break block34;
                                                                    }
                                                                    n10 = -1;
                                                                    break block29;
                                                                }
                                                                byArray3 = bg12.c();
                                                                n18 = n12 - 1 + n14;
                                                                n10 = bg12.e();
                                                                if (n18 < n10) break block35;
                                                            }
                                                            n10 = -1;
                                                            break block30;
                                                        }
                                                        by3 = byArray3[n18];
                                                        n14 = -1;
                                                        if (by3 != -1) break block36;
                                                        if (++n18 != n10) break block37;
                                                        n10 = n14;
                                                        break block30;
                                                    }
                                                    n18 = byArray3[n18];
                                                    n10 = n14;
                                                    if (((n18 & 0xFF | 0xFF00) & 0xFFF6) != 65520) break block29;
                                                    n10 = n14;
                                                    if ((n18 & 8) >> 3 != n17) break block29;
                                                    n10 = n14;
                                                    break block30;
                                                }
                                                if (by3 == 73) break block38;
                                                n10 = n14;
                                                break block29;
                                            }
                                            n17 = n18 + 1;
                                            if (n17 != n10) break block39;
                                            n10 = n14;
                                            break block30;
                                        }
                                        if (byArray3[n17] == 68) break block40;
                                        n10 = n14;
                                        break block29;
                                    }
                                    n17 = n18 + 2;
                                    if (n17 != n10) break block41;
                                    n10 = n14;
                                    break block30;
                                }
                                n10 = n14;
                                if (byArray3[n17] != 51) break block29;
                                n10 = n14;
                            }
                            this.o = (by & 8) >> 3;
                            boolean bl2 = (by & 1) == 0;
                            this.k = bl2;
                            if (!this.l) {
                                this.h = 1;
                                this.i = 0;
                            } else {
                                this.h = 3;
                                this.i = 0;
                            }
                            bg12.e(n13);
                            continue block0;
                        }
                        n14 = this.j;
                        n16 = n14 | n16;
                        if (n16 == 329) break block42;
                        if (n16 != 511) {
                            if (n16 != 836) {
                                if (n16 != 1075) {
                                    if (n14 != 256) {
                                        this.j = 256;
                                        continue;
                                    }
                                    break block28;
                                } else {
                                    this.h = 2;
                                    this.i = 3;
                                    this.r = 0;
                                    this.c.e(0);
                                    bg12.e(n13);
                                    continue block0;
                                }
                            }
                            this.j = 1024;
                            break block28;
                        } else {
                            this.j = 512;
                        }
                        break block28;
                    }
                    this.j = 768;
                }
                n12 = n13;
            }
            bg12.e(n12);
        }
        return;
    }

    public final void a(v70 v702, w72.d d10) {
        g62 g622;
        d10.a();
        this.e = d10.b();
        this.f = g622 = v702.a(d10.c(), 1);
        this.t = g622;
        if (this.a) {
            d10.a();
            v702 = v702.a(d10.c(), 5);
            this.g = v702;
            v702.a(new /* Unavailable Anonymous Inner Class!! */.b(d10.b()).e("application/id3").a());
        } else {
            this.g = new k40();
        }
    }

    public final void b() {
    }

    public final long c() {
        return this.q;
    }
}

