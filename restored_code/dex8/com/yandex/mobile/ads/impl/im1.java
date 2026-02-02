/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Handler
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.a40$a
 *  com.yandex.mobile.ads.impl.b40
 *  com.yandex.mobile.ads.impl.bg1
 *  com.yandex.mobile.ads.impl.cs0
 *  com.yandex.mobile.ads.impl.cs0$a
 *  com.yandex.mobile.ads.impl.cs0$b
 *  com.yandex.mobile.ads.impl.cs0$d
 *  com.yandex.mobile.ads.impl.cs0$e
 *  com.yandex.mobile.ads.impl.cw2
 *  com.yandex.mobile.ads.impl.dc0
 *  com.yandex.mobile.ads.impl.dw2
 *  com.yandex.mobile.ads.impl.ew2
 *  com.yandex.mobile.ads.impl.ex1
 *  com.yandex.mobile.ads.impl.ex1$a
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.fw2
 *  com.yandex.mobile.ads.impl.fx1
 *  com.yandex.mobile.ads.impl.g62
 *  com.yandex.mobile.ads.impl.g62$a
 *  com.yandex.mobile.ads.impl.hm1
 *  com.yandex.mobile.ads.impl.im1$b
 *  com.yandex.mobile.ads.impl.im1$d
 *  com.yandex.mobile.ads.impl.im1$e
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.k01$b
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mx1
 *  com.yandex.mobile.ads.impl.ot1$c
 *  com.yandex.mobile.ads.impl.ov
 *  com.yandex.mobile.ads.impl.pt1
 *  com.yandex.mobile.ads.impl.pv
 *  com.yandex.mobile.ads.impl.pv$a
 *  com.yandex.mobile.ads.impl.qj1
 *  com.yandex.mobile.ads.impl.rw0$a
 *  com.yandex.mobile.ads.impl.v70
 *  com.yandex.mobile.ads.impl.vc
 *  com.yandex.mobile.ads.impl.w01
 *  com.yandex.mobile.ads.impl.wq
 *  com.yandex.mobile.ads.impl.yr0
 *  com.yandex.mobile.ads.impl.yr0$a
 *  com.yandex.mobile.ads.impl.zh0$a
 *  com.yandex.mobile.ads.impl.zr0
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a40;
import com.yandex.mobile.ads.impl.b40;
import com.yandex.mobile.ads.impl.b62;
import com.yandex.mobile.ads.impl.b70;
import com.yandex.mobile.ads.impl.bg1;
import com.yandex.mobile.ads.impl.bi0;
import com.yandex.mobile.ads.impl.c62;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.cs0;
import com.yandex.mobile.ads.impl.cw2;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.dw2;
import com.yandex.mobile.ads.impl.ew2;
import com.yandex.mobile.ads.impl.ex1;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.fw2;
import com.yandex.mobile.ads.impl.fx1;
import com.yandex.mobile.ads.impl.g62;
import com.yandex.mobile.ads.impl.hm1;
import com.yandex.mobile.ads.impl.im1;
import com.yandex.mobile.ads.impl.jy;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.km1;
import com.yandex.mobile.ads.impl.kw0;
import com.yandex.mobile.ads.impl.lv;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mx1;
import com.yandex.mobile.ads.impl.ot1;
import com.yandex.mobile.ads.impl.ov;
import com.yandex.mobile.ads.impl.pt1;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.qj1;
import com.yandex.mobile.ads.impl.rw0;
import com.yandex.mobile.ads.impl.v22;
import com.yandex.mobile.ads.impl.v70;
import com.yandex.mobile.ads.impl.vc;
import com.yandex.mobile.ads.impl.w01;
import com.yandex.mobile.ads.impl.wq;
import com.yandex.mobile.ads.impl.yl;
import com.yandex.mobile.ads.impl.yr0;
import com.yandex.mobile.ads.impl.zh0;
import com.yandex.mobile.ads.impl.zr0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

final class im1
implements kw0,
v70,
cs0.a<a>,
cs0.e,
ot1.c {
    private static final Map<String, String> N;
    private static final cc0 O;
    private long A;
    private boolean B;
    private int C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean G;
    private long H;
    private long I;
    private boolean J;
    private int K;
    private boolean L;
    private boolean M;
    private final Uri b;
    private final lv c;
    private final b40 d;
    private final yr0 e;
    private final rw0.a f;
    private final a40.a g;
    private final b h;
    private final vc i;
    @Nullable
    private final String j;
    private final long k;
    private final cs0 l;
    private final hm1 m;
    private final wq n;
    private final Runnable o;
    private final Runnable p;
    private final Handler q;
    @Nullable
    private kw0.a r;
    @Nullable
    private bi0 s;
    private ot1[] t;
    private d[] u;
    private boolean v;
    private boolean w;
    private boolean x;
    private e y;
    private ex1 z;

    static {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Icy-MetaData", "1");
        N = Collections.unmodifiableMap(hashMap);
        O = new /* Unavailable Anonymous Inner Class!! */.b("icy").e("application/x-icy").a();
    }

    public im1(Uri uri, lv lv2, hm1 hm12, b40 b402, a40.a a13, yr0 yr02, rw0.a a14, b b10, vc vc3, @Nullable String string2, int n10) {
        this.b = uri;
        this.c = lv2;
        this.d = b402;
        this.g = a13;
        this.e = yr02;
        this.f = a14;
        this.h = b10;
        this.i = vc3;
        this.j = string2;
        this.k = n10;
        this.l = new cs0("ProgressiveMediaPeriod");
        this.m = hm12;
        this.n = new wq();
        this.o = new cw2(this);
        this.p = new dw2(this);
        this.q = m92.a();
        this.u = new d[0];
        this.t = new ot1[0];
        this.I = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.C = 1;
    }

    static /* bridge */ /* synthetic */ cc0 A() {
        return O;
    }

    private long a(boolean bl2) {
        long l10 = Long.MIN_VALUE;
        for (int i14 = 0; i14 < this.t.length; ++i14) {
            long l11;
            block4: {
                block3: {
                    if (bl2) break block3;
                    e e11 = this.y;
                    e11.getClass();
                    l11 = l10;
                    if (!e11.c[i14]) break block4;
                }
                l11 = Math.max(l10, this.t[i14].b());
            }
            l10 = l11;
        }
        return l10;
    }

    private ot1 a(d ot1Array) {
        int n10;
        int n13 = this.t.length;
        for (n10 = 0; n10 < n13; ++n10) {
            if (!ot1Array.equals((Object)this.u[n10])) continue;
            return this.t[n10];
        }
        d[] dArray = this.i;
        b40 b402 = this.d;
        Object object = this.g;
        b402.getClass();
        object.getClass();
        object = new ot1((vc)dArray, b402, (a40.a)object);
        ((ot1)object).a(this);
        dArray = this.u;
        n10 = n13 + 1;
        dArray = Arrays.copyOf(dArray, n10);
        dArray[n13] = ot1Array;
        this.u = dArray;
        ot1Array = Arrays.copyOf(this.t, n10);
        ot1Array[n13] = object;
        this.t = ot1Array;
        return object;
    }

    private void a(int n10) {
        this.c();
        Object object = this.y.b;
        if (this.J && object[n10] && !this.t[n10].a(false)) {
            this.I = 0L;
            this.J = false;
            this.E = true;
            this.H = 0L;
            this.K = 0;
            object = this.t;
            int n13 = ((boolean[])object).length;
            for (n10 = 0; n10 < n13; ++n10) {
                object[n10].b(false);
            }
            object = this.r;
            object.getClass();
            object.a((mx1)this);
        }
    }

    public static /* synthetic */ void a(im1 im12, ex1 ex12) {
        im12.b(ex12);
    }

    private void b(ex1 ex12) {
        Object object = this.s == null ? ex12 : new ex1.b(-9223372036854775807L, 0L);
        this.z = object;
        this.A = ex12.c();
        boolean bl2 = this.G;
        int n10 = 1;
        bl2 = !bl2 && ex12.c() == -9223372036854775807L;
        this.B = bl2;
        if (bl2) {
            n10 = 7;
        }
        this.C = n10;
        object = this.h;
        long l10 = this.A;
        bl2 = ex12.b();
        boolean bl3 = this.B;
        ((km1)object).a(l10, bl2, bl3);
        if (!this.w) {
            this.f();
        }
    }

    public static /* synthetic */ void b(im1 im12) {
        im12.e();
    }

    @EnsuresNonNull(value={"trackState", "seekMap"})
    private void c() {
        if (this.w) {
            this.y.getClass();
            this.z.getClass();
            return;
        }
        throw new IllegalStateException();
    }

    public static /* synthetic */ void c(im1 im12) {
        im12.f();
    }

    private void d() {
        if (!this.M) {
            kw0.a a13 = this.r;
            a13.getClass();
            a13.a(this);
        }
    }

    public static /* synthetic */ void d(im1 im12) {
        im12.d();
    }

    private /* synthetic */ void e() {
        this.G = true;
    }

    private void f() {
        block9: {
            int n10;
            if (this.M || this.w || !this.v || this.z == null) break block9;
            Object object = this.t;
            int n13 = ((ot1[])object).length;
            for (n10 = 0; n10 < n13; ++n10) {
                if (object[n10].d() != null) continue;
                return;
            }
            this.n.c();
            n13 = this.t.length;
            b62[] b62Array = new b62[n13];
            boolean[] blArray = new boolean[n13];
            for (n10 = 0; n10 < n13; ++n10) {
                block10: {
                    cc0 cc02;
                    bi0 bi02;
                    boolean bl2;
                    block12: {
                        cc0 cc03;
                        block11: {
                            cc03 = this.t[n10].d();
                            cc03.getClass();
                            object = cc03.m;
                            bl2 = w01.d((String)object);
                            boolean bl3 = bl2 || w01.f((String)object);
                            blArray[n10] = bl3;
                            this.x = bl3 | this.x;
                            bi02 = this.s;
                            object = cc03;
                            if (bi02 == null) break block10;
                            if (bl2) break block11;
                            cc02 = cc03;
                            if (!this.u[n10].b) break block12;
                        }
                        object = (object = cc03.k) == null ? new k01(new k01.b[]{bi02}) : object.a(new k01.b[]{bi02});
                        cc02 = cc03.a().a((k01)object).a();
                    }
                    object = cc02;
                    if (bl2) {
                        object = cc02;
                        if (cc02.g == -1) {
                            object = cc02;
                            if (cc02.h == -1) {
                                object = cc02;
                                if (bi02.b != -1) {
                                    object = cc02.a().b(bi02.b).a();
                                }
                            }
                        }
                    }
                }
                object = ((cc0)object).a(this.d.a((cc0)object));
                b62Array[n10] = new b62(Integer.toString(n10), new cc0[]{object});
            }
            this.y = new /* Unavailable Anonymous Inner Class!! */;
            this.w = true;
            object = this.r;
            object.getClass();
            object.a(this);
        }
    }

    private void g() {
        this.q.post((Runnable)new ew2(this));
    }

    private void j() {
        int n10;
        int n13;
        ot1[] ot1Array;
        a a13 = new a(this, this.b, this.c, this.m, this, this.n);
        boolean bl2 = this.w;
        int n14 = 0;
        if (bl2) {
            long l10 = this.I;
            if (l10 != -9223372036854775807L) {
                long l11 = this.A;
                if (l11 != -9223372036854775807L && l10 > l11) {
                    this.L = true;
                    this.I = -9223372036854775807L;
                    return;
                }
                ot1Array = this.z;
                ot1Array.getClass();
                l11 = ot1Array.b((long)this.I).a.b;
                l10 = this.I;
                ((a)a13).f.a = l11;
                a13.i = l10;
                a13.h = true;
                a13.l = false;
                ot1Array = this.t;
                n13 = ot1Array.length;
                for (n10 = 0; n10 < n13; ++n10) {
                    ot1Array[n10].a(this.I);
                }
                this.I = -9223372036854775807L;
            } else {
                throw new IllegalStateException();
            }
        }
        ot1Array = this.t;
        n13 = ot1Array.length;
        n10 = 0;
        while (n14 < n13) {
            n10 += ot1Array[n14].e();
            ++n14;
        }
        this.K = n10;
        this.l.a((cs0.d)a13, (cs0.a)this, this.e.a(this.C));
        pv pv3 = a13.j;
        ot1Array = this.f;
        pv3 = pv3.a;
        Collections.emptyMap();
        ot1Array.b(new zr0(), null, a13.i, this.A);
    }

    static /* bridge */ /* synthetic */ long m(im1 im12) {
        return im12.k;
    }

    static /* bridge */ /* synthetic */ Runnable o(im1 im12) {
        return im12.p;
    }

    static /* bridge */ /* synthetic */ Handler p(im1 im12) {
        return im12.q;
    }

    static /* bridge */ /* synthetic */ bi0 q(im1 im12) {
        return im12.s;
    }

    static /* bridge */ /* synthetic */ void t(im1 im12, bi0 bi02) {
        im12.s = bi02;
    }

    static /* bridge */ /* synthetic */ ot1 v(im1 im12, d d10) {
        return im12.a(d10);
    }

    static /* bridge */ /* synthetic */ void y(im1 im12) {
        im12.g();
    }

    @Override
    public final long a(long l10, fx1 fx12) {
        block8: {
            long l11;
            block10: {
                boolean bl2;
                long l13;
                block12: {
                    long l14;
                    block11: {
                        int n10;
                        block9: {
                            long l15;
                            this.c();
                            if (!this.z.b()) {
                                return 0L;
                            }
                            ex1.a a13 = this.z.b(l10);
                            l14 = a13.a.a;
                            l11 = a13.b.a;
                            long l16 = fx12.a;
                            if (l16 == 0L && fx12.b == 0L) break block8;
                            n10 = m92.a;
                            l13 = l15 = l10 - l16;
                            if (((l16 ^ l10) & (l10 ^ l15)) < 0L) {
                                l13 = Long.MIN_VALUE;
                            }
                            long l17 = fx12.b;
                            l15 = l16 = l10 + l17;
                            if (((l17 ^ l16) & (l10 ^ l16)) < 0L) {
                                l15 = Long.MAX_VALUE;
                            }
                            boolean bl3 = false;
                            n10 = l13 <= l14 && l14 <= l15 ? 1 : 0;
                            bl2 = bl3;
                            if (l13 <= l11) {
                                bl2 = bl3;
                                if (l11 <= l15) {
                                    bl2 = true;
                                }
                            }
                            if (n10 == 0 || !bl2) break block9;
                            if (Math.abs(l14 - l10) > Math.abs(l11 - l10)) break block10;
                            break block11;
                        }
                        if (n10 == 0) break block12;
                    }
                    l10 = l14;
                    break block8;
                }
                l10 = l13;
                if (!bl2) break block8;
            }
            l10 = l11;
        }
        return l10;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final long a(b70[] objectArray, boolean[] object, pt1[] pt1Array, boolean[] blArray, long l10) {
        long l11;
        block17: {
            int n10;
            int n13;
            int n14;
            block18: {
                this.c();
                e e11 = this.y;
                c62 c622 = e11.a;
                boolean[] blArray2 = e11.c;
                int n15 = this.F;
                n14 = 0;
                int n16 = 0;
                for (n13 = 0; n13 < objectArray.length; ++n13) {
                    pt1 pt12 = pt1Array[n13];
                    if (pt12 == null || objectArray[n13] != null && object[n13] != false) continue;
                    n10 = ((c)pt12).a;
                    if (!blArray2[n10]) {
                        throw new IllegalStateException();
                    }
                    --this.F;
                    blArray2[n10] = false;
                    pt1Array[n13] = null;
                }
                n13 = (this.D ? n15 == 0 : l10 != 0L) ? 1 : 0;
                n10 = n13;
                for (n15 = 0; n15 < objectArray.length; ++n15) {
                    n13 = n10;
                    if (pt1Array[n15] == null) {
                        object = objectArray[n15];
                        n13 = n10;
                        if (object != null) {
                            if (object.b() != 1) {
                                throw new IllegalStateException();
                            }
                            if (object.b(0) != 0) {
                                throw new IllegalStateException();
                            }
                            int n17 = c622.a(object.a());
                            if (!(blArray2[n17] ^ true)) {
                                throw new IllegalStateException();
                            }
                            ++this.F;
                            blArray2[n17] = true;
                            pt1Array[n15] = new c(this, n17);
                            blArray[n15] = true;
                            n13 = n10;
                            if (n10 == 0) {
                                object = this.t[n17];
                                n13 = !((ot1)object).b(l10, true) && ((ot1)object).c() != 0 ? 1 : 0;
                            }
                        }
                    }
                    n10 = n13;
                }
                if (this.F != 0) break block18;
                this.J = false;
                this.E = false;
                if (this.l.d()) {
                    objectArray = this.t;
                    n15 = objectArray.length;
                    for (n13 = n16; n13 < n15; ++n13) {
                        ((ot1)objectArray[n13]).a();
                    }
                    this.l.a();
                    l11 = l10;
                    break block17;
                } else {
                    objectArray = this.t;
                    n15 = objectArray.length;
                    n13 = 0;
                    while (true) {
                        l11 = l10;
                        if (n13 < n15) {
                            ((ot1)objectArray[n13]).b(false);
                            ++n13;
                            continue;
                        }
                        break block17;
                        break;
                    }
                }
            }
            l11 = l10;
            if (n10 != 0) {
                l10 = this.seekToUs(l10);
                n13 = n14;
                while (true) {
                    l11 = l10;
                    if (n13 >= pt1Array.length) break;
                    if (pt1Array[n13] != null) {
                        blArray[n13] = true;
                    }
                    ++n13;
                }
            }
        }
        this.D = true;
        return l11;
    }

    public final cs0.b a(cs0.d b10, long l10, long l11, IOException iOException, int n10) {
        boolean bl2;
        zr0 zr02;
        a a13;
        block4: {
            block7: {
                block5: {
                    boolean bl3;
                    int n13;
                    block6: {
                        block3: {
                            a13 = (a)b10;
                            a13.b.getClass();
                            zr02 = new zr0();
                            m92.b((long)a13.i);
                            m92.b((long)this.A);
                            l10 = this.e.a(new yr0.a(iOException, n10));
                            if (l10 != -9223372036854775807L) break block3;
                            b10 = cs0.e;
                            break block4;
                        }
                        b10 = this.t;
                        int n14 = ((ot1[])b10).length;
                        n10 = 0;
                        for (n13 = 0; n13 < n14; ++n13) {
                            n10 += b10[n13].e();
                        }
                        bl2 = n10 > this.K;
                        if (this.G || (b10 = this.z) != null && b10.c() != -9223372036854775807L) break block5;
                        bl3 = this.w;
                        if (!bl3 || this.E || this.I != -9223372036854775807L) break block6;
                        this.J = true;
                        b10 = cs0.d;
                        break block4;
                    }
                    this.E = bl3;
                    this.H = 0L;
                    this.K = 0;
                    b10 = this.t;
                    n13 = ((cs0.b)b10).length;
                    for (n10 = 0; n10 < n13; ++n10) {
                        b10[n10].b(false);
                    }
                    ((a)a13).f.a = 0L;
                    a13.i = 0L;
                    a13.h = true;
                    a13.l = false;
                    break block7;
                }
                this.K = n10;
            }
            b10 = cs0.a((long)l10, (boolean)bl2);
        }
        bl2 = b10.a() ^ true;
        this.f.a(zr02, 1, null, a13.i, this.A, iOException, bl2);
        if (bl2) {
            this.e.getClass();
        }
        return b10;
    }

    public final g62 a(int n10, int n13) {
        return this.a(new /* Unavailable Anonymous Inner Class!! */);
    }

    public final void a() {
        this.v = true;
        this.q.post(this.o);
    }

    public final void a(cs0.d object, long l10, long l11) {
        ex1 ex12;
        object = (a)object;
        if (this.A == -9223372036854775807L && (ex12 = this.z) != null) {
            boolean bl2 = ex12.b();
            l10 = this.a(true);
            l10 = l10 == Long.MIN_VALUE ? 0L : (l10 += 10000L);
            this.A = l10;
            ex12 = this.h;
            boolean bl3 = this.B;
            ((km1)ex12).a(l10, bl2, bl3);
        }
        ((a)object).b.getClass();
        ex12 = new zr0();
        this.e.getClass();
        this.f.a((zr0)ex12, null, ((a)object).i, this.A);
        this.L = true;
        object = this.r;
        object.getClass();
        object.a((mx1)this);
    }

    public final void a(cs0.d object, long l10, long l11, boolean bl2) {
        object = (a)object;
        ((a)object).b.getClass();
        zr0 zr02 = new zr0();
        this.e.getClass();
        this.f.a(zr02, ((a)object).i, this.A);
        if (!bl2) {
            object = this.t;
            int n10 = ((ot1[])object).length;
            for (int i14 = 0; i14 < n10; ++i14) {
                object[i14].b(false);
            }
            if (this.F > 0) {
                object = this.r;
                object.getClass();
                object.a((mx1)this);
            }
        }
    }

    public final void a(ex1 ex12) {
        this.q.post((Runnable)new fw2(this, ex12));
    }

    @Override
    public final void a(kw0.a a13, long l10) {
        this.r = a13;
        this.n.e();
        this.j();
    }

    public final void b() {
        ot1[] ot1Array = this.t;
        int n10 = ot1Array.length;
        for (int i14 = 0; i14 < n10; ++i14) {
            ot1Array[i14].i();
        }
        ((yl)this.m).c();
    }

    public final boolean continueLoading(long l10) {
        if (!(this.L || this.l.c() || this.J || this.w && this.F == 0)) {
            boolean bl2 = this.n.e();
            if (!this.l.d()) {
                this.j();
                bl2 = true;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final void discardBuffer(long l10, boolean bl2) {
        this.c();
        if (this.I != -9223372036854775807L) {
            return;
        }
        boolean[] blArray = this.y.c;
        int n10 = this.t.length;
        for (int i14 = 0; i14 < n10; ++i14) {
            this.t[i14].a(l10, bl2, blArray[i14]);
        }
    }

    public final long getBufferedPositionUs() {
        this.c();
        if (!this.L && this.F != 0) {
            long l10;
            long l11 = this.I;
            if (l11 != -9223372036854775807L) {
                return l11;
            }
            if (this.x) {
                int n10 = this.t.length;
                int n13 = 0;
                l10 = Long.MAX_VALUE;
                while (true) {
                    l11 = l10;
                    if (n13 < n10) {
                        e e11 = this.y;
                        l11 = l10;
                        if (e11.b[n13]) {
                            l11 = l10;
                            if (e11.c[n13]) {
                                l11 = l10;
                                if (!this.t[n13].f()) {
                                    l11 = Math.min(l10, this.t[n13].b());
                                }
                            }
                        }
                        ++n13;
                        l10 = l11;
                        continue;
                    }
                    break;
                }
            } else {
                l11 = Long.MAX_VALUE;
            }
            l10 = l11;
            if (l11 == Long.MAX_VALUE) {
                l10 = this.a(false);
            }
            l11 = l10;
            if (l10 == Long.MIN_VALUE) {
                l11 = this.H;
            }
            return l11;
        }
        return Long.MIN_VALUE;
    }

    public final long getNextLoadPositionUs() {
        return this.getBufferedPositionUs();
    }

    @Override
    public final c62 getTrackGroups() {
        this.c();
        return this.y.a;
    }

    public final void h() {
        this.q.post(this.o);
    }

    public final void i() {
        if (this.w) {
            ot1[] ot1Array = this.t;
            int n10 = ot1Array.length;
            for (int i14 = 0; i14 < n10; ++i14) {
                ot1Array[i14].h();
            }
        }
        this.l.a((cs0.e)this);
        this.q.removeCallbacksAndMessages(null);
        this.r = null;
        this.M = true;
    }

    public final boolean isLoading() {
        boolean bl2 = this.l.d() && this.n.d();
        return bl2;
    }

    @Override
    public final void maybeThrowPrepareError() throws IOException {
        this.l.a(this.e.a(this.C));
        if (this.L && !this.w) {
            throw fg1.a((String)"Loading finished before preparation is complete.", null);
        }
    }

    @Override
    public final long readDiscontinuity() {
        block3: {
            block4: {
                if (!this.E) break block3;
                if (this.L) break block4;
                ot1[] ot1Array = this.t;
                int n10 = ot1Array.length;
                int n13 = 0;
                for (int i14 = 0; i14 < n10; ++i14) {
                    n13 += ot1Array[i14].e();
                }
                if (n13 <= this.K) break block3;
            }
            this.E = false;
            return this.H;
        }
        return -9223372036854775807L;
    }

    public final void reevaluateBuffer(long l10) {
    }

    @Override
    public final long seekToUs(long l10) {
        int n10;
        int n13;
        int n14;
        Object[] objectArray;
        block9: {
            this.c();
            objectArray = this.y.b;
            if (!this.z.b()) {
                l10 = 0L;
            }
            n14 = 0;
            this.E = false;
            this.H = l10;
            if (this.I != -9223372036854775807L) {
                this.I = l10;
                return l10;
            }
            if (this.C != 7) {
                n13 = this.t.length;
                for (n10 = 0; n10 < n13; ++n10) {
                    if (this.t[n10].b(l10, false) || !objectArray[n10] && this.x) {
                        continue;
                    }
                    break block9;
                }
                return l10;
            }
        }
        this.J = false;
        this.I = l10;
        this.L = false;
        if (this.l.d()) {
            objectArray = this.t;
            n13 = objectArray.length;
            for (n10 = n14; n10 < n13; ++n10) {
                objectArray[n10].a();
            }
            this.l.a();
        } else {
            this.l.b();
            objectArray = this.t;
            n14 = objectArray.length;
            for (n10 = 0; n10 < n14; ++n10) {
                objectArray[n10].b(false);
            }
        }
        return l10;
    }

    final class a
    implements cs0.d,
    zh0.a {
        private final Uri a;
        private final v22 b;
        private final hm1 c;
        private final v70 d;
        private final wq e;
        private final qj1 f;
        private volatile boolean g;
        private boolean h;
        private long i;
        private pv j;
        @Nullable
        private ot1 k;
        private boolean l;
        final im1 m;

        public a(im1 im12, Uri uri, lv lv2, hm1 hm12, v70 v702, wq wq3) {
            this.m = im12;
            this.a = uri;
            this.b = new v22(lv2);
            this.c = hm12;
            this.d = v702;
            this.e = wq3;
            this.f = new qj1();
            this.h = true;
            zr0.a();
            this.j = this.a(0L);
        }

        private pv a(long l10) {
            return new pv.a().a(this.a).b(l10).a(this.m.j).a(6).a(N).a();
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void a() throws IOException {
            var1_1 = 0;
            while (var1_1 == 0 && !this.g) {
                block16: {
                    block15: {
                        var2_2 = var1_1;
                        try {
                            var8_6 = this.f.a;
                            var2_2 = var1_1;
                            var11_8 /* !! */  = this.a(var8_6);
                            var2_2 = var1_1;
                            this.j = var11_8 /* !! */ ;
                            var2_2 = var1_1;
                            var4_4 = var6_5 = this.b.a(var11_8 /* !! */ );
                            if (var6_5 == -1L) break block15;
                            var4_4 = var6_5 + var8_6;
                            var2_2 = var1_1;
                            im1.y(this.m);
                        }
                        catch (Throwable var11_9) {
                            break block16;
                        }
                    }
                    var2_2 = var1_1;
                    im1.t(this.m, bi0.a(this.b.getResponseHeaders()));
                    var2_2 = var1_1;
                    var12_12 = this.b;
                    var2_2 = var1_1;
                    var11_8 /* !! */  = im1.q(this.m);
                    if (var11_8 /* !! */  == null) ** GOTO lbl-1000
                    var2_2 = var1_1;
                    var3_3 = var11_8 /* !! */ .g;
                    if (var3_3 != -1) {
                        var2_2 = var1_1;
                        var2_2 = var1_1;
                        var11_8 /* !! */  = new zh0((v22)var12_12, var3_3, this);
                        var2_2 = var1_1;
                        var13_13 = this.m;
                        var2_2 = var1_1;
                        var13_13.getClass();
                        var2_2 = var1_1;
                        var2_2 = var1_1;
                        var12_12 = new /* Unavailable Anonymous Inner Class!! */;
                        var2_2 = var1_1;
                        var12_12 = im1.v((im1)var13_13, var12_12);
                        var2_2 = var1_1;
                        this.k = var12_12;
                        var2_2 = var1_1;
                        var12_12.a(im1.A());
                    } else // 2 sources

                    {
                        var11_8 /* !! */  = var12_12;
                    }
                    var2_2 = var1_1;
                    var15_15 = this.c;
                    var2_2 = var1_1;
                    var14_14 = this.a;
                    var2_2 = var1_1;
                    var12_12 = this.b.getResponseHeaders();
                    var2_2 = var1_1;
                    var13_13 = this.d;
                    var2_2 = var1_1;
                    var15_15 = (yl)var15_15;
                    var6_5 = var8_6;
                    var2_2 = var1_1;
                    var15_15.a((lv)var11_8 /* !! */ , var14_14, (Map)var12_12, var8_6, var4_4, var13_13);
                    var2_2 = var1_1;
                    if (im1.q(this.m) != null) {
                        var2_2 = var1_1;
                        ((yl)this.c).a();
                    }
                    var2_2 = var1_1;
                    var3_3 = var1_1;
                    var4_4 = var6_5;
                    if (this.h) {
                        var2_2 = var1_1;
                        var11_8 /* !! */  = this.c;
                        var2_2 = var1_1;
                        var4_4 = this.i;
                        var2_2 = var1_1;
                        ((yl)var11_8 /* !! */ ).a(var6_5, var4_4);
                        var2_2 = var1_1;
                        this.h = false;
                        var4_4 = var6_5;
                        var3_3 = var1_1;
                    }
                    block5: while (true) {
                        var6_5 = var4_4;
                        var1_1 = var3_3;
                        while (var1_1 == 0) {
                            var2_2 = var1_1;
                            var10_7 = this.g;
                            if (var10_7) break block5;
                            var2_2 = var1_1;
                            try {
                                this.e.a();
                                var2_2 = var1_1;
                                var11_8 /* !! */  = this.c;
                                var2_2 = var1_1;
                                var12_12 = this.f;
                                var2_2 = var1_1;
                                var2_2 = var3_3 = ((yl)var11_8 /* !! */ ).a((qj1)var12_12);
                                var4_4 = ((yl)this.c).b();
                                var2_2 = var3_3;
                                var1_1 = var3_3;
                            }
                            catch (InterruptedException var11_10) {
                                var2_2 = var1_1;
                                var2_2 = var1_1;
                                var11_11 = new InterruptedIOException();
                                var2_2 = var1_1;
                                throw var11_11;
                            }
                            if (var4_4 <= im1.m(this.m) + var6_5) continue;
                            var2_2 = var3_3;
                            this.e.c();
                            var2_2 = var3_3;
                            var11_8 /* !! */  = this.m;
                            var2_2 = var3_3;
                            im1.p((im1)var11_8 /* !! */ ).post(im1.o((im1)var11_8 /* !! */ ));
                            continue block5;
                        }
                        break;
                    }
                    if (var1_1 == 1) {
                        var2_2 = 0;
                    } else {
                        var2_2 = var1_1;
                        if (((yl)this.c).b() != -1L) {
                            this.f.a = ((yl)this.c).b();
                            var2_2 = var1_1;
                        }
                    }
                    ov.a((lv)this.b);
                    var1_1 = var2_2;
                    continue;
                }
                if (var2_2 != 1 && ((yl)this.c).b() != -1L) {
                    this.f.a = ((yl)this.c).b();
                }
                ov.a((lv)this.b);
                throw var11_9;
            }
        }

        public final void a(bg1 bg12) {
            long l10 = !this.l ? this.i : Math.max(this.m.a(true), this.i);
            int n10 = bg12.a();
            ot1 ot12 = this.k;
            ot12.getClass();
            ot12.b(n10, bg12);
            ot12.a(l10, 1, n10, 0, (g62.a)null);
            this.l = true;
        }

        public final void b() {
            this.g = true;
        }
    }

    private final class c
    implements pt1 {
        private final int a;
        final im1 b;

        public c(im1 im12, int n10) {
            this.b = im12;
            this.a = n10;
        }

        public final int a(long l10) {
            int n10;
            im1 im12 = this.b;
            int n13 = this.a;
            boolean bl2 = im12.E;
            int n14 = n10 = 0;
            if (!bl2) {
                if (im12.I != -9223372036854775807L) {
                    n14 = n10;
                } else {
                    im12.c();
                    Object object = im12.y;
                    Object object2 = object.d;
                    if (!object2[n13]) {
                        object = object.a.a(n13).a(0);
                        im12.f.a(w01.c((String)object.m), (cc0)object, im12.H);
                        object2[n13] = true;
                    }
                    object2 = im12.t[n13];
                    n10 = ((ot1)object2).a(l10, im12.L);
                    ((ot1)object2).d(n10);
                    n14 = n10;
                    if (n10 == 0) {
                        im12.a(n13);
                        n14 = n10;
                    }
                }
            }
            return n14;
        }

        public final int a(dc0 dc02, jy jy2, int n10) {
            int n13;
            im1 im12 = this.b;
            int n14 = this.a;
            boolean bl2 = im12.E;
            int n15 = n13 = -3;
            if (!bl2) {
                if (im12.I != -9223372036854775807L) {
                    n15 = n13;
                } else {
                    im12.c();
                    Object object = im12.y;
                    boolean[] blArray = object.d;
                    if (!blArray[n14]) {
                        object = object.a.a(n14).a(0);
                        im12.f.a(w01.c((String)object.m), (cc0)object, im12.H);
                        blArray[n14] = true;
                    }
                    if ((n15 = im12.t[n14].a(dc02, jy2, n10, im12.L)) == -3) {
                        im12.a(n14);
                    }
                }
            }
            return n15;
        }

        public final void a() throws IOException {
            im1 im12 = this.b;
            int n10 = this.a;
            im12.t[n10].g();
            im12.l.a(im12.e.a(im12.C));
        }

        public final boolean d() {
            im1 im12 = this.b;
            int n10 = this.a;
            boolean bl2 = !im12.E && im12.I == -9223372036854775807L && im12.t[n10].a(im12.L);
            return bl2;
        }
    }
}

