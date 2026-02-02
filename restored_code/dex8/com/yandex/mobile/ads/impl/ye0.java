/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.cg1
 *  com.yandex.mobile.ads.impl.f41
 *  com.yandex.mobile.ads.impl.g41
 *  com.yandex.mobile.ads.impl.g41$b
 *  com.yandex.mobile.ads.impl.g41$c
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.jx1
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.u40
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.w72$d
 *  com.yandex.mobile.ads.impl.ye0$a
 *  com.yandex.mobile.ads.impl.ye0$a$a
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.cg1;
import com.yandex.mobile.ads.impl.f41;
import com.yandex.mobile.ads.impl.g41;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.jx1;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.u40;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.w72;
import com.yandex.mobile.ads.impl.ye0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
public final class ye0
implements u40 {
    private final jx1 a;
    private final boolean b;
    private final boolean c;
    private final f41 d;
    private final f41 e;
    private final f41 f;
    private long g;
    private final boolean[] h;
    private String i;
    private g62 j;
    private a k;
    private boolean l;
    private long m;
    private boolean n;
    private final bg1 o;

    public ye0(jx1 jx12, boolean bl2, boolean bl3) {
        this.a = jx12;
        this.b = bl2;
        this.c = bl3;
        this.h = new boolean[3];
        this.d = new f41(7);
        this.e = new f41(8);
        this.f = new f41(6);
        this.m = -9223372036854775807L;
        this.o = new bg1();
    }

    public final void a() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        g41.a((boolean[])this.h);
        this.d.b();
        this.e.b();
        this.f.b();
        a a14 = this.k;
        if (a14 != null) {
            a14.a();
        }
    }

    public final void a(int n10, long l10) {
        if (l10 != -9223372036854775807L) {
            this.m = l10;
        }
        int n13 = this.n;
        n10 = (n10 & 2) != 0 ? 1 : 0;
        this.n = n10 | n13;
    }

    public final void a(bg1 object) {
        block22: {
            int n10 = 3;
            if (this.j == null) break block22;
            int n13 = m92.a;
            int n14 = object.d();
            n13 = object.e();
            Object object2 = object.c();
            this.g += (long)object.a();
            this.j.a(object.a(), object);
            object = object2;
            while (true) {
                int n15;
                block28: {
                    f41 f412;
                    block27: {
                        boolean bl2;
                        int n16;
                        long l10;
                        long l11;
                        int n17;
                        block24: {
                            int n18;
                            int n19;
                            int n23;
                            block23: {
                                block25: {
                                    block26: {
                                        boolean bl3;
                                        g41.c c11;
                                        Object object3;
                                        if ((n23 = g41.a((byte[])object, (int)n14, (int)n13, (boolean[])this.h)) == n13) {
                                            if (!this.l || com.yandex.mobile.ads.impl.ye0$a.c(this.k)) {
                                                this.d.a((byte[])object, n14, n13);
                                                this.e.a((byte[])object, n14, n13);
                                            }
                                            this.f.a((byte[])object, n14, n13);
                                            this.k.a((byte[])object, n14, n13);
                                            return;
                                        }
                                        n15 = n23 + 3;
                                        n17 = object[n15] & 0x1F;
                                        n19 = n23 - n14;
                                        if (n19 > 0) {
                                            if (!this.l || com.yandex.mobile.ads.impl.ye0$a.c(this.k)) {
                                                this.d.a((byte[])object, n14, n23);
                                                this.e.a((byte[])object, n14, n23);
                                            }
                                            this.f.a((byte[])object, n14, n23);
                                            this.k.a((byte[])object, n14, n23);
                                        }
                                        n23 = n13 - n23;
                                        l11 = this.g - (long)n23;
                                        n14 = n19 < 0 ? -n19 : 0;
                                        l10 = this.m;
                                        if (!this.l || com.yandex.mobile.ads.impl.ye0$a.c(this.k)) {
                                            this.d.a(n14);
                                            this.e.a(n14);
                                            if (!this.l) {
                                                if (this.d.a() && this.e.a()) {
                                                    object2 = new ArrayList();
                                                    f412 = this.d;
                                                    ((ArrayList)object2).add(Arrays.copyOf(f412.d, f412.e));
                                                    f412 = this.e;
                                                    ((ArrayList)object2).add(Arrays.copyOf(f412.d, f412.e));
                                                    f412 = this.d;
                                                    f412 = g41.b((byte[])f412.d, (int)n10, (int)f412.e);
                                                    object3 = this.e;
                                                    object3 = new cg1(object3.d, 4, object3.e);
                                                    n10 = object3.e();
                                                    n19 = object3.e();
                                                    object3.f();
                                                    c11 = new g41.b(n10, n19, object3.c());
                                                    object3 = String.format("avc1.%02X%02X%02X", f412.a, f412.b, f412.c);
                                                    this.j.a(new /* Unavailable Anonymous Inner Class!! */.b(this.i).e("video/avc").a((String)object3).o(f412.e).f(f412.f).b(f412.g).a((List)object2).a());
                                                    this.l = true;
                                                    com.yandex.mobile.ads.impl.ye0$a.d(this.k).append(f412.d, (Object)f412);
                                                    com.yandex.mobile.ads.impl.ye0$a.e(this.k).append(n10, (Object)c11);
                                                    this.d.b();
                                                    this.e.b();
                                                    n10 = 3;
                                                }
                                            } else if (this.d.a()) {
                                                f412 = this.d;
                                                object2 = f412.d;
                                                n19 = f412.e;
                                                n10 = 3;
                                                object2 = g41.b((byte[])object2, (int)3, (int)n19);
                                                com.yandex.mobile.ads.impl.ye0$a.d(this.k).append(((g41.c)object2).d, object2);
                                                this.d.b();
                                            } else {
                                                n10 = n19 = 3;
                                                if (this.e.a()) {
                                                    object2 = this.e;
                                                    object2 = new cg1(((f41)object2).d, 4, ((f41)object2).e);
                                                    n18 = object2.e();
                                                    n10 = object2.e();
                                                    object2.f();
                                                    object2 = new g41.b(n18, n10, object2.c());
                                                    com.yandex.mobile.ads.impl.ye0$a.e(this.k).append(n18, object2);
                                                    this.e.b();
                                                    n10 = n19;
                                                }
                                            }
                                        }
                                        if (this.f.a(n14)) {
                                            f412 = this.f;
                                            object2 = f412.d;
                                            n14 = g41.a((int)f412.e, (byte[])object2);
                                            this.o.a(n14, this.f.d);
                                            this.o.e(4);
                                            this.a.a(l10, this.o);
                                        }
                                        object2 = this.k;
                                        n16 = this.l;
                                        bl2 = this.n;
                                        if (com.yandex.mobile.ads.impl.ye0$a.f(object2) == 9) break block23;
                                        if (!com.yandex.mobile.ads.impl.ye0$a.c(object2)) break block24;
                                        a a14 = com.yandex.mobile.ads.impl.ye0$a.j(object2);
                                        f412 = com.yandex.mobile.ads.impl.ye0$a.i(object2);
                                        if (!com.yandex.mobile.ads.impl.ye0$a$a.a((a)a14)) break block24;
                                        if (!com.yandex.mobile.ads.impl.ye0$a$a.a((a)f412)) break block23;
                                        object3 = com.yandex.mobile.ads.impl.ye0$a$a.c((a)a14);
                                        if (object3 == null) break block25;
                                        c11 = com.yandex.mobile.ads.impl.ye0$a$a.c((a)f412);
                                        if (c11 == null) break block26;
                                        if (com.yandex.mobile.ads.impl.ye0$a$a.f((a)a14) == com.yandex.mobile.ads.impl.ye0$a$a.f((a)f412) && com.yandex.mobile.ads.impl.ye0$a$a.g((a)a14) == com.yandex.mobile.ads.impl.ye0$a$a.g((a)f412) && com.yandex.mobile.ads.impl.ye0$a$a.h((a)a14) == com.yandex.mobile.ads.impl.ye0$a$a.h((a)f412) && (!com.yandex.mobile.ads.impl.ye0$a$a.i((a)a14) || !com.yandex.mobile.ads.impl.ye0$a$a.i((a)f412) || com.yandex.mobile.ads.impl.ye0$a$a.j((a)a14) == com.yandex.mobile.ads.impl.ye0$a$a.j((a)f412)) && ((n14 = com.yandex.mobile.ads.impl.ye0$a$a.d((a)a14)) == (n19 = com.yandex.mobile.ads.impl.ye0$a$a.d((a)f412)) || n14 != 0 && n19 != 0) && ((n14 = object3.k) != 0 || c11.k != 0 || com.yandex.mobile.ads.impl.ye0$a$a.m((a)a14) == com.yandex.mobile.ads.impl.ye0$a$a.m((a)f412) && com.yandex.mobile.ads.impl.ye0$a$a.n((a)a14) == com.yandex.mobile.ads.impl.ye0$a$a.n((a)f412)) && (n14 != 1 || c11.k != 1 || com.yandex.mobile.ads.impl.ye0$a$a.o((a)a14) == com.yandex.mobile.ads.impl.ye0$a$a.o((a)f412) && com.yandex.mobile.ads.impl.ye0$a$a.p((a)a14) == com.yandex.mobile.ads.impl.ye0$a$a.p((a)f412)) && (bl3 = com.yandex.mobile.ads.impl.ye0$a$a.k((a)a14)) == com.yandex.mobile.ads.impl.ye0$a$a.k((a)f412) && (!bl3 || com.yandex.mobile.ads.impl.ye0$a$a.l((a)a14) == com.yandex.mobile.ads.impl.ye0$a$a.l((a)f412))) break block24;
                                        break block23;
                                    }
                                    throw new IllegalStateException();
                                }
                                throw new IllegalStateException();
                            }
                            if (n16 != 0 && com.yandex.mobile.ads.impl.ye0$a.k(object2)) {
                                long l13 = com.yandex.mobile.ads.impl.ye0$a.g(object2);
                                n18 = (int)(l11 - l13);
                                l10 = com.yandex.mobile.ads.impl.ye0$a.m(object2);
                                if (l10 != -9223372036854775807L) {
                                    n14 = com.yandex.mobile.ads.impl.ye0$a.n(object2) ? 1 : 0;
                                    n19 = (int)(l13 - com.yandex.mobile.ads.impl.ye0$a.l(object2));
                                    com.yandex.mobile.ads.impl.ye0$a.a(object2).a(l10, n14, n19, n23 + n18, null);
                                }
                            }
                            com.yandex.mobile.ads.impl.ye0$a.w(object2, (long)com.yandex.mobile.ads.impl.ye0$a.g(object2));
                            com.yandex.mobile.ads.impl.ye0$a.x(object2, (long)com.yandex.mobile.ads.impl.ye0$a.h(object2));
                            com.yandex.mobile.ads.impl.ye0$a.y(object2, (boolean)false);
                            com.yandex.mobile.ads.impl.ye0$a.v(object2, (boolean)true);
                        }
                        if (com.yandex.mobile.ads.impl.ye0$a.b(object2)) {
                            f412 = com.yandex.mobile.ads.impl.ye0$a.j(object2);
                            bl2 = com.yandex.mobile.ads.impl.ye0$a$a.b((a)f412) && ((n14 = com.yandex.mobile.ads.impl.ye0$a$a.e((a)f412)) == 7 || n14 == 2);
                        }
                        n16 = com.yandex.mobile.ads.impl.ye0$a.n(object2);
                        n14 = com.yandex.mobile.ads.impl.ye0$a.f(object2);
                        n14 = !(n14 == 5 || bl2 && n14 == 1) ? 0 : 1;
                        bl2 = n16 | n14;
                        com.yandex.mobile.ads.impl.ye0$a.y(object2, (boolean)bl2);
                        if (bl2) {
                            this.n = false;
                        }
                        l10 = this.m;
                        if (!this.l || com.yandex.mobile.ads.impl.ye0$a.c(this.k)) {
                            object2 = this.d;
                            object2.b(n17);
                            this.e.b(n17);
                        }
                        this.f.b(n17);
                        f412 = this.k;
                        com.yandex.mobile.ads.impl.ye0$a.p(f412, (int)n17);
                        com.yandex.mobile.ads.impl.ye0$a.s(f412, (long)l10);
                        com.yandex.mobile.ads.impl.ye0$a.q(f412, (long)l11);
                        if (com.yandex.mobile.ads.impl.ye0$a.b(f412) && n17 == 1) break block27;
                        if (!com.yandex.mobile.ads.impl.ye0$a.c(f412) || n17 != 5 && n17 != 1 && n17 != 2) break block28;
                    }
                    object2 = com.yandex.mobile.ads.impl.ye0$a.i(f412);
                    com.yandex.mobile.ads.impl.ye0$a.t(f412, (a)com.yandex.mobile.ads.impl.ye0$a.j(f412));
                    com.yandex.mobile.ads.impl.ye0$a.u(f412, (a)object2);
                    com.yandex.mobile.ads.impl.ye0$a$a.r((a)object2, (boolean)false);
                    com.yandex.mobile.ads.impl.ye0$a$a.q((a)object2, (boolean)false);
                    com.yandex.mobile.ads.impl.ye0$a.o(f412, (int)0);
                    com.yandex.mobile.ads.impl.ye0$a.r(f412, (boolean)true);
                }
                n14 = n15;
            }
        }
        throw new IllegalStateException();
    }

    public final void a(v70 v702, w72.d d14) {
        g62 g622;
        d14.a();
        this.i = d14.b();
        this.j = g622 = v702.a(d14.c(), 2);
        this.k = new /* Unavailable Anonymous Inner Class!! */;
        this.a.a(v702, d14);
    }

    public final void b() {
    }
}

