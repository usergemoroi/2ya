/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.cg1
 *  com.yandex.mobile.ads.impl.cq
 *  com.yandex.mobile.ads.impl.f41
 *  com.yandex.mobile.ads.impl.g41
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.jx1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.sr0
 *  com.yandex.mobile.ads.impl.u40
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72$d
 *  com.yandex.mobile.ads.impl.ze0$a
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cg1;
import com.yandex.mobile.ads.impl.cq;
import com.yandex.mobile.ads.impl.f41;
import com.yandex.mobile.ads.impl.g41;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.jx1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.sr0;
import com.yandex.mobile.ads.impl.u40;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;
import com.yandex.mobile.ads.impl.ze0;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/*
 * Exception performing whole class analysis ignored.
 */
public final class ze0
implements u40 {
    private final jx1 a;
    private String b;
    private g62 c;
    private a d;
    private boolean e;
    private final boolean[] f;
    private final f41 g;
    private final f41 h;
    private final f41 i;
    private final f41 j;
    private final f41 k;
    private long l;
    private long m;
    private final bg1 n;

    public ze0(jx1 jx12) {
        this.a = jx12;
        this.f = new boolean[3];
        this.g = new f41(32);
        this.h = new f41(33);
        this.i = new f41(34);
        this.j = new f41(39);
        this.k = new f41(40);
        this.m = -9223372036854775807L;
        this.n = new bg1();
    }

    @RequiresNonNull(value={"sampleReader"})
    private void a(byte[] byArray, int n10, int n13) {
        a a14 = this.d;
        if (com.yandex.mobile.ads.impl.ze0$a.f(a14)) {
            int n14 = com.yandex.mobile.ads.impl.ze0$a.d(a14);
            int n15 = n10 + 2 - n14;
            if (n15 < n13) {
                boolean bl2 = (byArray[n15] & 0x80) != 0;
                com.yandex.mobile.ads.impl.ze0$a.s(a14, (boolean)bl2);
                com.yandex.mobile.ads.impl.ze0$a.r(a14, (boolean)false);
            } else {
                com.yandex.mobile.ads.impl.ze0$a.p(a14, (int)(n13 - n10 + n14));
            }
        }
        if (!this.e) {
            this.g.a(byArray, n10, n13);
            this.h.a(byArray, n10, n13);
            this.i.a(byArray, n10, n13);
        }
        this.j.a(byArray, n10, n13);
        this.k.a(byArray, n10, n13);
    }

    public final void a() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        g41.a((boolean[])this.f);
        this.g.b();
        this.h.b();
        this.i.b();
        this.j.b();
        this.k.b();
        a a14 = this.d;
        if (a14 != null) {
            com.yandex.mobile.ads.impl.ze0$a.r(a14, (boolean)false);
            com.yandex.mobile.ads.impl.ze0$a.s(a14, (boolean)false);
            com.yandex.mobile.ads.impl.ze0$a.t(a14, (boolean)false);
            com.yandex.mobile.ads.impl.ze0$a.u(a14, (boolean)false);
            com.yandex.mobile.ads.impl.ze0$a.v(a14, (boolean)false);
        }
    }

    public final void a(int n10, long l10) {
        if (l10 != -9223372036854775807L) {
            this.m = l10;
        }
    }

    public final void a(bg1 bg12) {
        if (this.c != null) {
            int n10 = m92.a;
            while (bg12.a() > 0) {
                n10 = bg12.d();
                int n13 = bg12.e();
                byte[] byArray = bg12.c();
                this.l += (long)bg12.a();
                this.c.a(bg12.a(), bg12);
                while (n10 < n13) {
                    Object object;
                    int n14;
                    long l10;
                    int n15 = g41.a((byte[])byArray, (int)n10, (int)n13, (boolean[])this.f);
                    if (n15 == n13) {
                        this.a(byArray, n10, n13);
                        return;
                    }
                    int n16 = n15 + 3;
                    int n17 = (byArray[n16] & 0x7E) >> 1;
                    int n18 = n15 - n10;
                    if (n18 > 0) {
                        this.a(byArray, n10, n15);
                    }
                    int n19 = n13 - n15;
                    long l11 = this.l - (long)n19;
                    n15 = n18 < 0 ? -n18 : 0;
                    long l13 = this.m;
                    a a14 = this.d;
                    boolean bl2 = this.e;
                    if (com.yandex.mobile.ads.impl.ze0$a.j(a14) && com.yandex.mobile.ads.impl.ze0$a.g(a14)) {
                        com.yandex.mobile.ads.impl.ze0$a.y(a14, (boolean)com.yandex.mobile.ads.impl.ze0$a.c(a14));
                        com.yandex.mobile.ads.impl.ze0$a.v(a14, (boolean)false);
                    } else if (com.yandex.mobile.ads.impl.ze0$a.h(a14) || com.yandex.mobile.ads.impl.ze0$a.g(a14)) {
                        if (bl2 && com.yandex.mobile.ads.impl.ze0$a.i(a14)) {
                            l10 = com.yandex.mobile.ads.impl.ze0$a.b(a14);
                            n10 = (int)(l11 - l10);
                            long l14 = com.yandex.mobile.ads.impl.ze0$a.l(a14);
                            if (l14 != -9223372036854775807L) {
                                n14 = com.yandex.mobile.ads.impl.ze0$a.m(a14);
                                n18 = (int)(l10 - com.yandex.mobile.ads.impl.ze0$a.k(a14));
                                com.yandex.mobile.ads.impl.ze0$a.a(a14).a(l14, n14, n18, n19 + n10, null);
                            }
                        }
                        com.yandex.mobile.ads.impl.ze0$a.w(a14, (long)com.yandex.mobile.ads.impl.ze0$a.b(a14));
                        com.yandex.mobile.ads.impl.ze0$a.x(a14, (long)com.yandex.mobile.ads.impl.ze0$a.e(a14));
                        com.yandex.mobile.ads.impl.ze0$a.y(a14, (boolean)com.yandex.mobile.ads.impl.ze0$a.c(a14));
                        com.yandex.mobile.ads.impl.ze0$a.u(a14, (boolean)true);
                    }
                    if (!this.e) {
                        this.g.a(n15);
                        this.h.a(n15);
                        this.i.a(n15);
                        if (this.g.a() && this.h.a() && this.i.a()) {
                            float f11;
                            int n23;
                            int n24;
                            int n25;
                            a14 = this.c;
                            object = this.b;
                            Object object2 = this.g;
                            f41 f412 = this.h;
                            Object object3 = this.i;
                            n10 = object2.e;
                            byte[] byArray2 = new byte[f412.e + n10 + object3.e];
                            System.arraycopy(object2.d, 0, byArray2, 0, n10);
                            System.arraycopy(f412.d, 0, byArray2, object2.e, f412.e);
                            System.arraycopy(object3.d, 0, byArray2, object2.e + f412.e, object3.e);
                            f412 = new cg1(f412.d, 0, f412.e);
                            f412.d(44);
                            int n26 = f412.b(3);
                            f412.f();
                            int n27 = f412.b(2);
                            boolean bl3 = f412.c();
                            int n28 = f412.b(5);
                            n14 = 0;
                            for (n18 = 0; n18 < 32; ++n18) {
                                n10 = n14;
                                if (f412.c()) {
                                    n10 = n14 | 1 << n18;
                                }
                                n14 = n10;
                            }
                            object3 = new int[6];
                            for (n10 = 0; n10 < 6; ++n10) {
                                object3[n10] = (f41)f412.b(8);
                            }
                            int n29 = f412.b(8);
                            n18 = 0;
                            for (n25 = 0; n25 < n26; ++n25) {
                                n10 = n18;
                                if (f412.c()) {
                                    n10 = n18 + 89;
                                }
                                n18 = n10;
                                if (!f412.c()) continue;
                                n18 = n10 + 8;
                            }
                            f412.d(n18);
                            if (n26 > 0) {
                                f412.d((8 - n26) * 2);
                            }
                            f412.e();
                            n18 = f412.e();
                            if (n18 == 3) {
                                f412.f();
                            }
                            int n33 = f412.e();
                            int n34 = f412.e();
                            n25 = n33;
                            n10 = n34;
                            if (f412.c()) {
                                n25 = f412.e();
                                int n35 = f412.e();
                                n24 = f412.e();
                                n23 = f412.e();
                                n10 = n18 != 1 && n18 != 2 ? 1 : 2;
                                n18 = n18 == 1 ? 2 : 1;
                                n25 = n33 - (n25 + n35) * n10;
                                n10 = n34 - (n24 + n23) * n18;
                            }
                            f412.e();
                            f412.e();
                            n23 = f412.e();
                            for (n18 = f412.c() ? 0 : n26; n18 <= n26; ++n18) {
                                f412.e();
                                f412.e();
                                f412.e();
                            }
                            f412.e();
                            f412.e();
                            f412.e();
                            f412.e();
                            f412.e();
                            f412.e();
                            l10 = l11;
                            if (f412.c()) {
                                l10 = l11;
                                if (f412.c()) {
                                    n18 = 0;
                                    while (true) {
                                        l10 = l11;
                                        if (n18 >= 4) break;
                                        for (n26 = 0; n26 < 6; n26 += n34) {
                                            if (!f412.c()) {
                                                f412.e();
                                            } else {
                                                n33 = Math.min(64, 1 << (n18 << 1) + 4);
                                                if (n18 > 1) {
                                                    f412.d();
                                                }
                                                for (n34 = 0; n34 < n33; ++n34) {
                                                    f412.d();
                                                }
                                            }
                                            n34 = n18 == 3 ? 3 : 1;
                                        }
                                        ++n18;
                                    }
                                }
                            }
                            l11 = l10;
                            f412.d(2);
                            if (f412.c()) {
                                f412.d(8);
                                f412.e();
                                f412.e();
                                f412.f();
                            }
                            n26 = f412.e();
                            bl2 = false;
                            n34 = 0;
                            for (n18 = 0; n18 < n26; ++n18) {
                                if (n18 != 0) {
                                    bl2 = f412.c();
                                }
                                if (bl2) {
                                    f412.f();
                                    f412.e();
                                    for (n33 = 0; n33 <= n34; ++n33) {
                                        if (!f412.c()) continue;
                                        f412.f();
                                    }
                                    continue;
                                }
                                n24 = f412.e();
                                n33 = f412.e();
                                for (n34 = 0; n34 < n24; ++n34) {
                                    f412.e();
                                    f412.f();
                                }
                                for (n34 = 0; n34 < n33; ++n34) {
                                    f412.e();
                                    f412.f();
                                }
                                n34 = n24 + n33;
                            }
                            if (f412.c()) {
                                for (n18 = 0; n18 < f412.e(); ++n18) {
                                    f412.d(n23 + 5);
                                }
                            }
                            f412.d(2);
                            bl2 = f412.c();
                            float f12 = f11 = 1.0f;
                            n18 = n10;
                            if (bl2) {
                                float f13 = f11;
                                if (f412.c()) {
                                    n18 = f412.b(8);
                                    if (n18 == 255) {
                                        n18 = f412.b(16);
                                        n26 = f412.b(16);
                                        f13 = f11;
                                        if (n18 != 0) {
                                            f13 = f11;
                                            if (n26 != 0) {
                                                f13 = (float)n18 / (float)n26;
                                            }
                                        }
                                    } else {
                                        object2 = g41.b;
                                        if (n18 < 17) {
                                            f13 = (float)object2[n18];
                                        } else {
                                            sr0.a((String)"Unexpected aspect_ratio_idc value: ", (int)n18, (String)"H265Reader");
                                            f13 = f11;
                                        }
                                    }
                                }
                                if (f412.c()) {
                                    f412.f();
                                }
                                if (f412.c()) {
                                    f412.d(4);
                                    if (f412.c()) {
                                        f412.d(24);
                                    }
                                }
                                if (f412.c()) {
                                    f412.e();
                                    f412.e();
                                }
                                f412.f();
                                f12 = f13;
                                n18 = n10;
                                if (f412.c()) {
                                    n18 = n10 * 2;
                                    f12 = f13;
                                }
                            }
                            object3 = cq.a((int)n27, (boolean)bl3, (int)n28, (int)n14, (int[])object3, (int)n29);
                            a14.a(new /* Unavailable Anonymous Inner Class!! */.b((String)object).e("video/hevc").a((String)object3).o(n25).f(n18).b(f12).a(Collections.singletonList(byArray2)).a());
                            this.e = true;
                        }
                    }
                    if (this.j.a(n15)) {
                        a14 = this.j;
                        object = a14.d;
                        n10 = g41.a((int)a14.e, (byte[])object);
                        this.n.a(n10, this.j.d);
                        this.n.f(5);
                        this.a.a(l13, this.n);
                    }
                    if (this.k.a(n15)) {
                        a14 = this.k;
                        object = a14.d;
                        n10 = g41.a((int)a14.e, (byte[])object);
                        this.n.a(n10, this.k.d);
                        this.n.f(5);
                        this.a.a(l13, this.n);
                    }
                    l10 = this.m;
                    a14 = this.d;
                    bl2 = this.e;
                    com.yandex.mobile.ads.impl.ze0$a.s(a14, (boolean)false);
                    com.yandex.mobile.ads.impl.ze0$a.t(a14, (boolean)false);
                    com.yandex.mobile.ads.impl.ze0$a.q(a14, (long)l10);
                    com.yandex.mobile.ads.impl.ze0$a.p(a14, (int)0);
                    com.yandex.mobile.ads.impl.ze0$a.n(a14, (long)l11);
                    if (n17 >= 32 && n17 != 40) {
                        if (com.yandex.mobile.ads.impl.ze0$a.i(a14) && !com.yandex.mobile.ads.impl.ze0$a.j(a14)) {
                            if (bl2 && (l10 = com.yandex.mobile.ads.impl.ze0$a.l(a14)) != -9223372036854775807L) {
                                n10 = com.yandex.mobile.ads.impl.ze0$a.m(a14) ? 1 : 0;
                                n18 = (int)(l11 - com.yandex.mobile.ads.impl.ze0$a.k(a14));
                                com.yandex.mobile.ads.impl.ze0$a.a(a14).a(l10, n10, n18, n19, null);
                            }
                            com.yandex.mobile.ads.impl.ze0$a.u(a14, (boolean)false);
                        }
                        if (32 <= n17 && n17 <= 35 || n17 == 39) {
                            com.yandex.mobile.ads.impl.ze0$a.t(a14, (boolean)(com.yandex.mobile.ads.impl.ze0$a.j(a14) ^ true));
                            com.yandex.mobile.ads.impl.ze0$a.v(a14, (boolean)true);
                        }
                    }
                    bl2 = n17 >= 16 && n17 <= 21;
                    com.yandex.mobile.ads.impl.ze0$a.o(a14, (boolean)bl2);
                    bl2 = bl2 || n17 <= 9;
                    com.yandex.mobile.ads.impl.ze0$a.r(a14, (boolean)bl2);
                    if (!this.e) {
                        this.g.b(n17);
                        this.h.b(n17);
                        this.i.b(n17);
                    }
                    this.j.b(n17);
                    this.k.b(n17);
                    n10 = n16;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(v70 v702, w72.d d14) {
        g62 g622;
        d14.a();
        this.b = d14.b();
        this.c = g622 = v702.a(d14.c(), 2);
        this.d = new /* Unavailable Anonymous Inner Class!! */;
        this.a.a(v702, d14);
    }

    public final void b() {
    }
}

