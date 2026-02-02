/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.ag1
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.fi0
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.pb0
 *  com.yandex.mobile.ads.impl.pb0$a
 *  com.yandex.mobile.ads.impl.qb0
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.rj2
 *  com.yandex.mobile.ads.impl.t70
 *  com.yandex.mobile.ads.impl.tb0
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.vn
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ag1;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.di0;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.fi0;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.jh1;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.m13;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.nb0;
import com.yandex.mobile.ads.impl.oz;
import com.yandex.mobile.ads.impl.pb0;
import com.yandex.mobile.ads.impl.qb0;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.rj2;
import com.yandex.mobile.ads.impl.sb0;
import com.yandex.mobile.ads.impl.t70;
import com.yandex.mobile.ads.impl.tb0;
import com.yandex.mobile.ads.impl.u70;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.vn;
import com.yandex.mobile.ads.impl.xj0;
import java.io.IOException;
import java.util.Arrays;

public final class ob0
implements t70 {
    private final byte[] a = new byte[42];
    private final bg1 b = new bg1(0, new byte[32768]);
    private final boolean c;
    private final pb0.a d = new pb0.a();
    private v70 e;
    private g62 f;
    private int g = 0;
    @Nullable
    private k01 h;
    private tb0 i;
    private int j;
    private int k;
    private nb0 l;
    private int m;
    private long n;

    static {
        new m13();
    }

    public ob0() {
        this.c = false;
    }

    private static t70[] a() {
        return new t70[]{new ob0()};
    }

    public static /* synthetic */ t70[] b() {
        return ob0.a();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a(u70 object, qj1 object2) throws IOException {
        void var2_12;
        boolean bl2;
        int n10;
        int n13;
        int n14;
        int n15;
        Object object3;
        int n16;
        block41: {
            long l10;
            long l11;
            block39: {
                block45: {
                    long l13;
                    block38: {
                        int n17;
                        byte[] byArray;
                        tb0 tb02;
                        block44: {
                            block40: {
                                block42: {
                                    block43: {
                                        n16 = this.g;
                                        object3 = null;
                                        n15 = 1;
                                        n14 = 1;
                                        n13 = 0;
                                        if (n16 == 0) break block40;
                                        if (n16 == 1) {
                                            byte[] byArray2 = this.a;
                                            n15 = byArray2.length;
                                            object = (oz)object;
                                            ((oz)object).b(byArray2, 0, n15, false);
                                            ((oz)object).c();
                                            this.g = 2;
                                            return 0;
                                        }
                                        if (n16 == 2) {
                                            object3 = new bg1(4);
                                            byte[] byArray3 = object3.c();
                                            ((oz)object).a(byArray3, 0, 4, false);
                                            if (object3.v() != 1716281667L) throw fg1.a((String)"Failed to read FLAC stream marker.", null);
                                            this.g = 3;
                                            return 0;
                                        }
                                        n10 = 7;
                                        if (n16 == 3) break block41;
                                        l11 = 0L;
                                        if (n16 == 4) break block42;
                                        if (n16 != 5) throw new IllegalStateException();
                                        this.f.getClass();
                                        this.i.getClass();
                                        object3 = this.l;
                                        if (object3 != null && object3.b()) {
                                            return this.l.a((oz)object, (qj1)object2);
                                        }
                                        if (this.n != -1L) break block43;
                                        tb02 = this.i;
                                        object = (oz)object;
                                        ((oz)object).c();
                                        ((oz)object).a(false, 1);
                                        object3 = new byte[1];
                                        ((oz)object).b((byte[])object3, 0, 1, false);
                                        n15 = (object3[0] & 1) == 1 ? 1 : 0;
                                        ((oz)object).a(false, 2);
                                        if (n15 == 0) {
                                            n10 = 6;
                                        }
                                        object3 = new bg1(n10);
                                        byArray = object3.c();
                                        break block44;
                                    }
                                    n10 = this.b.e();
                                    if (n10 < 32768) {
                                        byte[] byArray4 = this.b.c();
                                        n16 = ((oz)object).read(byArray4, n10, 32768 - n10);
                                        if (n16 != -1) {
                                            n15 = 0;
                                        }
                                        if (n15 == 0) {
                                            this.b.d(n10 + n16);
                                            n10 = n15;
                                        } else {
                                            n10 = n15;
                                            if (this.b.a() == 0) {
                                                long l14 = this.n;
                                                object = this.i;
                                                n15 = m92.a;
                                                l14 = l14 * 1000000L / (long)((tb0)object).e;
                                                this.f.a(l14, 1, this.m, 0, null);
                                                return -1;
                                            }
                                        }
                                    } else {
                                        n10 = 0;
                                    }
                                    n16 = this.b.d();
                                    n15 = this.m;
                                    n14 = this.j;
                                    if (n15 < n14) {
                                        object = this.b;
                                        object.f(Math.min(n14 - n15, object.a()));
                                    }
                                    object = this.b;
                                    this.i.getClass();
                                    break block45;
                                }
                                object = (oz)object;
                                ((oz)object).c();
                                bg1 bg12 = new bg1(2);
                                ((oz)object).b(bg12.c(), 0, 2, false);
                                n15 = bg12.z();
                                if (n15 >> 2 != 16382) {
                                    ((oz)object).c();
                                    throw fg1.a((String)"First frame does not start with sync code.", null);
                                }
                                ((oz)object).c();
                                this.k = n15;
                                v70 v702 = this.e;
                                n15 = m92.a;
                                long l15 = ((oz)object).a();
                                l11 = ((oz)object).b();
                                this.i.getClass();
                                object = this.i;
                                if (((tb0)object).k != null) {
                                    object = new sb0((tb0)object, l15);
                                } else if (l11 != -1L && ((tb0)object).j > 0L) {
                                    object = new nb0((tb0)object, this.k, l15, l11);
                                    this.l = object;
                                    object = object.a();
                                } else {
                                    object = new ex1.b(object.b(), 0L);
                                }
                                v702.a((ex1)object);
                                this.g = 5;
                                return 0;
                            }
                            boolean bl3 = this.c;
                            oz oz3 = (oz)object;
                            oz3.c();
                            long l16 = oz3.d();
                            object = bl3 ^ true ? null : di0.b;
                            k01 k012 = new fi0().a(oz3, object);
                            object = object3;
                            if (k012 != null) {
                                object = k012.c() == 0 ? object3 : k012;
                            }
                            oz3.a((int)(oz3.d() - l16));
                            this.h = object;
                            this.g = 1;
                            return 0;
                        }
                        for (n16 = 0; n16 < n10 && (n17 = ((oz)object).c(byArray, n16, n10 - n16)) != -1; n16 += n17) {
                        }
                        object3.d(n16);
                        ((oz)object).c();
                        try {
                            l13 = object3.A();
                            if (n15 != 0) break block38;
                            l13 *= (long)tb02.b;
                        }
                        catch (NumberFormatException numberFormatException) {
                            n15 = 0;
                            l13 = l11;
                        }
                    }
                    n15 = n14;
                    if (n15 == 0) throw fg1.a(null, null);
                    this.n = l13;
                    return n13;
                }
                for (n15 = object.d(); n15 <= object.e() - 16; ++n15) {
                    object.e(n15);
                    if (!pb0.a((bg1)object, (tb0)this.i, (int)this.k, (pb0.a)this.d)) continue;
                    object.e(n15);
                    l10 = this.d.a;
                    break block39;
                }
                if (n10 == 0) {
                    object.e(n15);
                } else {
                    while (n15 <= object.e() - this.j) {
                        boolean bl4;
                        object.e(n15);
                        try {
                            bl4 = pb0.a((bg1)object, (tb0)this.i, (int)this.k, (pb0.a)this.d);
                        }
                        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                            bl4 = false;
                        }
                        if (object.d() <= object.e() && bl4) {
                            object.e(n15);
                            l10 = this.d.a;
                            break block39;
                        }
                        ++n15;
                    }
                    object.e(object.e());
                }
                l10 = -1L;
            }
            n15 = this.b.d() - n16;
            this.b.e(n16);
            this.f.a(n15, this.b);
            this.m = n10 = this.m + n15;
            if (l10 != -1L) {
                l11 = this.n;
                object = this.i;
                n15 = m92.a;
                l11 = l11 * 1000000L / (long)((tb0)object).e;
                this.f.a(l11, 1, n10, 0, null);
                this.m = 0;
                this.n = l10;
            }
            n15 = n13;
            if (this.b.a() >= 16) return n15;
            n15 = this.b.a();
            System.arraycopy(this.b.c(), this.b.d(), this.b.c(), 0, n15);
            this.b.e(0);
            this.b.d(n15);
            return n13;
        }
        tb0 tb03 = this.i;
        do {
            object3 = (oz)object;
            ((oz)object3).c();
            byte[] byArray = new byte[4];
            ag1 ag12 = new ag1(4, byArray);
            ((oz)object3).b(byArray, 0, 4, false);
            bl2 = ag12.f();
            n10 = ag12.b(7);
            n15 = ag12.b(24) + 4;
            if (n10 == 0) {
                byte[] byArray5 = new byte[38];
                ((oz)object3).a(byArray5, 0, 38, false);
                tb0 tb04 = new tb0(4, byArray5);
            } else {
                if (var2_12 == null) throw new IllegalArgumentException();
                if (n10 == 3) {
                    ag12 = new bg1(n15);
                    ((oz)object3).a(ag12.c(), 0, n15, false);
                    tb0 tb05 = var2_12.a(qb0.a((bg1)ag12));
                } else if (n10 == 4) {
                    ag12 = new bg1(n15);
                    ((oz)object3).a(ag12.c(), 0, n15, false);
                    ag12.f(4);
                    tb0 tb06 = var2_12.b(Arrays.asList(rj2.a((bg1)ag12, (boolean)false, (boolean)false).a));
                } else if (n10 == 6) {
                    ag12 = new bg1(n15);
                    ((oz)object3).a(ag12.c(), 0, n15, false);
                    ag12.f(4);
                    n14 = ag12.h();
                    object3 = ag12.a(ag12.h(), vn.a);
                    String string2 = ag12.a(ag12.h(), vn.c);
                    int n18 = ag12.h();
                    n13 = ag12.h();
                    n16 = ag12.h();
                    n15 = ag12.h();
                    n10 = ag12.h();
                    byArray = new byte[n10];
                    ag12.a(byArray, 0, n10);
                    tb0 tb07 = var2_12.a(xj0.a(new jh1(n14, (String)object3, string2, n18, n13, n16, n15, byArray)));
                } else {
                    ((oz)object3).a(n15);
                }
            }
            n15 = m92.a;
            this.i = var2_12;
        } while (!bl2);
        this.j = Math.max(var2_12.c, 6);
        this.f.a(this.i.a(this.a, this.h));
        this.g = 4;
        return 0;
    }

    public final void a(long l10, long l11) {
        long l13 = 0L;
        if (l10 == 0L) {
            this.g = 0;
        } else {
            nb0 nb02 = this.l;
            if (nb02 != null) {
                nb02.a(l11);
            }
        }
        l10 = l11 == 0L ? l13 : -1L;
        this.n = l10;
        this.m = 0;
        this.b.c(0);
    }

    public final void a(v70 v702) {
        this.e = v702;
        this.f = v702.a(0, 1);
        v702.a();
    }

    public final boolean a(u70 u702) throws IOException {
        u702 = (oz)u702;
        Object object = di0.b;
        if ((object = new fi0().a((oz)u702, object)) != null) {
            object.c();
        }
        bg1 bg12 = new bg1(4);
        object = bg12.c();
        boolean bl2 = false;
        ((oz)u702).b((byte[])object, 0, 4, false);
        if (bg12.v() == 1716281667L) {
            bl2 = true;
        }
        return bl2;
    }

    public final void release() {
    }
}

