/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.os.SystemClock
 *  android.util.Pair
 *  androidx.annotation.CheckResult
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.bf0
 *  com.yandex.mobile.ads.impl.dp1
 *  com.yandex.mobile.ads.impl.ep1
 *  com.yandex.mobile.ads.impl.fg1
 *  com.yandex.mobile.ads.impl.fi
 *  com.yandex.mobile.ads.impl.fx1
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.k01$b
 *  com.yandex.mobile.ads.impl.k72
 *  com.yandex.mobile.ads.impl.ky1
 *  com.yandex.mobile.ads.impl.l62
 *  com.yandex.mobile.ads.impl.l62$a
 *  com.yandex.mobile.ads.impl.lw0
 *  com.yandex.mobile.ads.impl.m62
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mi1
 *  com.yandex.mobile.ads.impl.mv
 *  com.yandex.mobile.ads.impl.mx1
 *  com.yandex.mobile.ads.impl.n60$a
 *  com.yandex.mobile.ads.impl.n60$b
 *  com.yandex.mobile.ads.impl.n60$c
 *  com.yandex.mobile.ads.impl.n60$d
 *  com.yandex.mobile.ads.impl.n60$e
 *  com.yandex.mobile.ads.impl.n60$g
 *  com.yandex.mobile.ads.impl.ni1
 *  com.yandex.mobile.ads.impl.ni1$a
 *  com.yandex.mobile.ads.impl.nw0
 *  com.yandex.mobile.ads.impl.ow0
 *  com.yandex.mobile.ads.impl.pt1
 *  com.yandex.mobile.ads.impl.tw0
 *  com.yandex.mobile.ads.impl.tw0$d
 *  com.yandex.mobile.ads.impl.vc
 *  com.yandex.mobile.ads.impl.w32
 *  com.yandex.mobile.ads.impl.wr0
 *  com.yandex.mobile.ads.impl.wz$a
 *  com.yandex.mobile.ads.impl.x52
 *  com.yandex.mobile.ads.impl.xo
 *  com.yandex.mobile.ads.impl.xr0
 *  com.yandex.mobile.ads.impl.yx1
 *  com.yandex.mobile.ads.impl.z03
 *  com.yandex.mobile.ads.impl.z30$a
 *  com.yandex.mobile.ads.impl.zh1
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.b42;
import com.yandex.mobile.ads.impl.b70;
import com.yandex.mobile.ads.impl.bf0;
import com.yandex.mobile.ads.impl.bi1;
import com.yandex.mobile.ads.impl.c62;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.ck;
import com.yandex.mobile.ads.impl.cp1;
import com.yandex.mobile.ads.impl.dp1;
import com.yandex.mobile.ads.impl.ep1;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.fg1;
import com.yandex.mobile.ads.impl.fi;
import com.yandex.mobile.ads.impl.fx1;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.k72;
import com.yandex.mobile.ads.impl.kw0;
import com.yandex.mobile.ads.impl.ky1;
import com.yandex.mobile.ads.impl.l52;
import com.yandex.mobile.ads.impl.l62;
import com.yandex.mobile.ads.impl.lw0;
import com.yandex.mobile.ads.impl.m60;
import com.yandex.mobile.ads.impl.m62;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mi1;
import com.yandex.mobile.ads.impl.mv;
import com.yandex.mobile.ads.impl.mx1;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.ni1;
import com.yandex.mobile.ads.impl.nw0;
import com.yandex.mobile.ads.impl.ow0;
import com.yandex.mobile.ads.impl.p01;
import com.yandex.mobile.ads.impl.pt1;
import com.yandex.mobile.ads.impl.qw0;
import com.yandex.mobile.ads.impl.tw0;
import com.yandex.mobile.ads.impl.tz;
import com.yandex.mobile.ads.impl.vc;
import com.yandex.mobile.ads.impl.vj0;
import com.yandex.mobile.ads.impl.w32;
import com.yandex.mobile.ads.impl.wo;
import com.yandex.mobile.ads.impl.wr0;
import com.yandex.mobile.ads.impl.wz;
import com.yandex.mobile.ads.impl.x42;
import com.yandex.mobile.ads.impl.x52;
import com.yandex.mobile.ads.impl.xc;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.xo;
import com.yandex.mobile.ads.impl.xr0;
import com.yandex.mobile.ads.impl.y03;
import com.yandex.mobile.ads.impl.yx1;
import com.yandex.mobile.ads.impl.z03;
import com.yandex.mobile.ads.impl.z30;
import com.yandex.mobile.ads.impl.zh1;
import com.yandex.mobile.ads.impl.zs0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Exception performing whole class analysis ignored.
 */
final class n60
implements Handler.Callback,
kw0.a,
l62.a,
tw0.d,
wz.a,
ni1.a {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private int K;
    @Nullable
    private g L;
    private long M;
    private int N;
    private boolean O;
    @Nullable
    private g60 P;
    private long Q;
    private final cp1[] b;
    private final Set<cp1> c;
    private final dp1[] d;
    private final l62 e;
    private final m62 f;
    private final xr0 g;
    private final fi h;
    private final bf0 i;
    private final HandlerThread j;
    private final Looper k;
    private final l52.d l;
    private final l52.b m;
    private final long n;
    private final boolean o;
    private final wz p;
    private final ArrayList<c> q;
    private final xo r;
    private final e s;
    private final ow0 t;
    private final tw0 u;
    private final wr0 v;
    private final long w;
    private fx1 x;
    private zh1 y;
    private d z;

    public n60(cp1[] handler, l62 l622, m62 m622, xr0 xr02, fi fi3, int n10, xc xc2, fx1 fx12, tz tz3, long l10, Looper looper, b42 b422, e e11, mi1 mi12) {
        this.s = e11;
        this.b = handler;
        this.e = l622;
        this.f = m622;
        this.g = xr02;
        this.h = fi3;
        this.F = n10;
        this.G = false;
        this.x = fx12;
        this.v = tz3;
        this.w = l10;
        this.B = false;
        this.r = b422;
        this.Q = -9223372036854775807L;
        this.n = xr02.e();
        this.o = xr02.a();
        m622 = zh1.a((m62)m622);
        this.y = m622;
        this.z = new /* Unavailable Anonymous Inner Class!! */;
        this.d = new dp1[((cp1[])handler).length];
        for (n10 = 0; n10 < ((cp1[])handler).length; ++n10) {
            handler[n10].a(n10, mi12);
            this.d[n10] = handler[n10].n();
        }
        this.p = new wz(this, b422);
        this.q = new ArrayList();
        this.c = yx1.a();
        this.l = new l52.d();
        this.m = new l52.b();
        l622.a((l62.a)this, fi3);
        this.O = true;
        handler = new Handler(looper);
        this.t = new ow0(xc2, handler);
        this.u = new tw0((tw0.d)this, xc2, handler, mi12);
        handler = new HandlerThread("ExoPlayer:Playback", -16);
        this.j = handler;
        handler.start();
        handler = handler.getLooper();
        this.k = handler;
        this.i = b422.a((Looper)handler, this);
    }

    private long a(long l10) {
        lw0 lw02 = this.t.d();
        if (lw02 == null) {
            return 0L;
        }
        return Math.max(0L, l10 - lw02.c(this.M));
    }

    private long a(l52 object, Object object2, long l10) {
        ((l52)object).a(((l52)object).a((Object)object2, (l52.b)this.m).d, this.l, 0L);
        object = this.l;
        if (((l52.d)object).g != -9223372036854775807L && ((l52.d)object).a()) {
            object = this.l;
            if (((l52.d)object).j) {
                long l11 = ((l52.d)object).h;
                int n10 = m92.a;
                l11 = l11 == -9223372036854775807L ? System.currentTimeMillis() : (l11 += SystemClock.elapsedRealtime());
                return m92.a((long)(l11 - this.l.g)) - (l10 + this.m.f);
            }
        }
        return -9223372036854775807L;
    }

    private long a(qw0.b nw02, long l10, boolean bl2, boolean bl3) throws g60 {
        lw0 lw02;
        lw0 lw03;
        this.q();
        this.D = false;
        if (bl3 || this.y.e == 3) {
            this.b(2);
        }
        for (lw03 = lw02 = this.t.e(); lw03 != null && !nw02.equals((Object)lw03.f.a); lw03 = lw03.b()) {
        }
        if (bl2 || lw02 != lw03 || lw03 != null && lw03.d(l10) < 0L) {
            nw02 = this.b;
            int n10 = ((cp1[])nw02).length;
            for (int i14 = 0; i14 < n10; ++i14) {
                this.a(nw02[i14]);
            }
            if (lw03 != null) {
                while (this.t.e() != lw03) {
                    this.t.a();
                }
                this.t.a(lw03);
                lw03.h();
                this.a(new boolean[this.b.length]);
            }
        }
        if (lw03 != null) {
            this.t.a(lw03);
            if (!lw03.d) {
                nw02 = lw03.f;
                if (l10 != nw02.b) {
                    nw02 = new nw0(nw02.a, l10, nw02.c, nw02.d, nw02.e, nw02.f, nw02.g, nw02.h, nw02.i);
                }
                lw03.f = nw02;
            } else if (lw03.e) {
                l10 = lw03.a.seekToUs(l10);
                lw03.a.discardBuffer(l10 - this.n, this.o);
            }
            this.b(l10);
            this.f();
        } else {
            this.t.c();
            this.b(l10);
        }
        this.a(false);
        this.i.a(2);
        return l10;
    }

    private Pair<qw0.b, Long> a(l52 l522) {
        boolean bl2 = l522.c();
        long l10 = 0L;
        if (bl2) {
            return Pair.create((Object)((Object)zh1.a()), (Object)0L);
        }
        int n10 = l522.a(this.G);
        Pair<Object, Long> pair = l522.a(this.l, this.m, n10, -9223372036854775807L);
        qw0.b b10 = this.t.a(l522, pair.first, 0L);
        long l11 = (Long)pair.second;
        if (b10.a()) {
            l522.a(b10.a, this.m);
            if (b10.c == this.m.d(b10.b)) {
                l10 = this.m.b();
            }
        } else {
            l10 = l11;
        }
        return Pair.create((Object)((Object)b10), (Object)l10);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    private static Pair<Object, Long> a(l52 l522, g object, boolean bl2, int n10, boolean bl3, l52.d d14, l52.b b10) {
        void var4_6;
        void var3_5;
        void var2_4;
        Pair<Object, Long> pair;
        void var6_8;
        void var5_7;
        l52 l523 = object.a;
        if (l522.c()) {
            return null;
        }
        if (l523.c()) {
            l523 = l522;
        }
        try {
            pair = l523.a((l52.d)var5_7, (l52.b)var6_8, object.b, object.c);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            return null;
        }
        if (l522.equals(l523)) {
            return pair;
        }
        if (l522.a(pair.first) != -1) {
            Pair<Object, Long> pair2 = pair;
            if (!l523.a((Object)pair.first, (l52.b)var6_8).g) return pair2;
            pair2 = pair;
            if (l523.a((int)var6_8.d, (l52.d)var5_7, (long)0L).p != l523.a(pair.first)) return pair2;
            return l522.a((l52.d)var5_7, (l52.b)var6_8, l522.a((Object)pair.first, (l52.b)var6_8).d, object.c);
        }
        if (var2_4 == false) return null;
        Object object2 = n60.a((l52.d)var5_7, (l52.b)var6_8, (int)var3_5, (boolean)var4_6, pair.first, l523, l522);
        if (object2 == null) return null;
        return l522.a((l52.d)var5_7, (l52.b)var6_8, l522.a((Object)object2, (l52.b)var6_8).d, -9223372036854775807L);
    }

    @CheckResult
    private zh1 a(qw0.b b10, long l10, long l11, long l13, boolean bl2, int n10) {
        Object object;
        boolean bl3 = this.O || l10 != this.y.r || !b10.equals((Object)this.y.b);
        this.O = bl3;
        this.n();
        Object object2 = this.y;
        c62 c622 = object2.h;
        m62 m622 = object2.i;
        object2 = object2.j;
        if (this.u.c()) {
            lw0 lw02 = this.t.e();
            c622 = lw02 == null ? c62.e : lw02.e();
            m622 = lw02 == null ? this.f : lw02.f();
            object2 = m622.c;
            object = new xj0.a();
            int n13 = ((b70[])object2).length;
            boolean bl4 = false;
            for (int i14 = 0; i14 < n13; ++i14) {
                b70 b702 = object2[i14];
                boolean bl5 = bl4;
                if (b702 != null) {
                    b702 = b702.a((int)0).k;
                    if (b702 == null) {
                        ((vj0.a)((Object)object)).b(new k01(new k01.b[0]));
                        bl5 = bl4;
                    } else {
                        ((vj0.a)((Object)object)).b(b702);
                        bl5 = true;
                    }
                }
                bl4 = bl5;
            }
            object2 = bl4 ? ((xj0.a)((Object)object)).a() : xj0.h();
            if (lw02 != null) {
                object = lw02.f;
                long l14 = ((nw0)object).c;
                if (l14 != l11) {
                    if (l11 != l14) {
                        object = new nw0(((nw0)object).a, ((nw0)object).b, l11, ((nw0)object).d, ((nw0)object).e, ((nw0)object).f, ((nw0)object).g, ((nw0)object).h, ((nw0)object).i);
                    }
                    lw02.f = object;
                }
            }
        } else if (!b10.equals((Object)this.y.b)) {
            c622 = c62.e;
            m622 = this.f;
            object2 = xj0.h();
        }
        if (bl2) {
            object = this.z;
            if (object.d && object.e != 5) {
                if (n10 != 5) {
                    throw new IllegalArgumentException();
                }
            } else {
                com.yandex.mobile.ads.impl.n60$d.b(object, (boolean)true);
                object.d = true;
                object.e = n10;
            }
        }
        object = this.y;
        return object.a(b10, l10, l11, l13, this.a(((zh1)object).p), c622, m622, (List)object2);
    }

    public static /* synthetic */ Boolean a(n60 n602) {
        return n602.e();
    }

    @Nullable
    static Object a(l52.d object, l52.b b10, int n10, boolean bl2, Object object2, l52 l522, l52 l523) {
        int n13 = l522.a(object2);
        int n14 = l522.a();
        int n15 = -1;
        for (int i14 = 0; i14 < n14 && n15 == -1 && (n13 = l522.a(n13, b10, (l52.d)object, n10, bl2)) != -1; ++i14) {
            n15 = l523.a(l522.a(n13));
        }
        object = n15 == -1 ? null : l523.a(n15);
        return object;
    }

    private void a(int n10) throws g60 {
        this.F = n10;
        if (!this.t.a(this.y.a, n10)) {
            this.b(true);
        }
        this.a(false);
    }

    private void a(int n10, int n13, ky1 ky12) throws g60 {
        this.z.a(1);
        this.a(this.u.a(n10, n13, ky12), false);
    }

    private void a(bi1 bi12, float f11, boolean bl2, boolean bl3) throws g60 {
        lw0 lw02;
        if (bl2) {
            if (bl3) {
                this.z.a(1);
            }
            lw02 = this.y;
            this.y = new zh1(lw02.a, lw02.b, lw02.c, lw02.d, lw02.e, lw02.f, lw02.g, lw02.h, lw02.i, lw02.j, lw02.k, lw02.l, lw02.m, bi12, lw02.p, lw02.q, lw02.r, lw02.o);
        }
        float f12 = bi12.b;
        lw02 = this.t.e();
        while (true) {
            int n10 = 0;
            if (lw02 == null) break;
            Object object = lw02.f().c;
            int n13 = ((b70[])object).length;
            for (int i14 = n10; i14 < n13; ++i14) {
                b70 b702 = object[i14];
                if (b702 == null) continue;
                b702.a(f12);
            }
            lw02 = lw02.b();
        }
        for (Object object : this.b) {
            if (object == null) continue;
            object.a(f11, bi12.b);
        }
    }

    private void a(cp1 cp12) throws g60 {
        if (!n60.b(cp12)) {
            return;
        }
        this.p.a(cp12);
        if (cp12.getState() == 2) {
            cp12.stop();
        }
        cp12.c();
        --this.K;
    }

    private void a(ky1 ky12) throws g60 {
        this.z.a(1);
        this.a(this.u.a(ky12), false);
    }

    private void a(l52 l522, l52 l523) {
        if (l522.c() && l523.c()) {
            return;
        }
        int n10 = this.q.size() - 1;
        if (n10 < 0) {
            Collections.sort(this.q);
            return;
        }
        this.q.get(n10).getClass();
        throw null;
    }

    private void a(l52 object, qw0.b object2, l52 l522, qw0.b b10, long l10) {
        if (!this.a((l52)object, (qw0.b)((Object)object2))) {
            object = object2.a() ? bi1.e : this.y.n;
            if (!this.p.getPlaybackParameters().equals(object)) {
                this.p.a((bi1)object);
            }
            return;
        }
        ((l52)object).a(((l52)object).a((Object)object2.a, (l52.b)this.m).d, this.l, 0L);
        wr0 wr02 = this.v;
        ew0.e e11 = this.l.l;
        int n10 = m92.a;
        ((tz)wr02).a(e11);
        if (l10 != -9223372036854775807L) {
            l522 = this.v;
            l10 = this.a((l52)object, object2.a, l10);
            ((tz)((Object)l522)).a(l10);
        } else {
            object2 = this.l.b;
            object = !l522.c() ? l522.a((int)l522.a((Object)b10.a, (l52.b)this.m).d, (l52.d)this.l, (long)0L).b : null;
            if (!m92.a((Object)object, (Object)object2)) {
                ((tz)this.v).a(-9223372036854775807L);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(l52 var1_1, boolean var2_2) throws g60 {
        block49: {
            block51: {
                block48: {
                    block50: {
                        block53: {
                            block59: {
                                block58: {
                                    block46: {
                                        block56: {
                                            block57: {
                                                block55: {
                                                    block54: {
                                                        block52: {
                                                            var24_3 = this.y;
                                                            var27_4 = this.L;
                                                            var23_5 /* !! */  = this.t;
                                                            var3_6 = this.F;
                                                            var6_7 = this.G;
                                                            var26_8 = this.l;
                                                            var25_9 = this.m;
                                                            var7_10 = var1_1.c();
                                                            var15_11 = -9223372036854775807L;
                                                            if (!var7_10) break block52;
                                                            var22_12 = new /* Unavailable Anonymous Inner Class!! */;
                                                            break block53;
                                                        }
                                                        var22_12 = var24_3.b;
                                                        var21_13 = var22_12.a;
                                                        var28_22 = var24_3.a;
                                                        var4_23 = !var28_22.c() && !var28_22.a((Object)var22_12.a, (l52.b)var25_9).g ? 0 : 1;
                                                        var9_24 = !var24_3.b.a() && var4_23 == 0 ? var24_3.r : var24_3.c;
                                                        if (var27_4 == null) break block54;
                                                        var28_22 = n60.a(var1_1, var27_4, true, var3_6, var6_7, (l52.d)var26_8, (l52.b)var25_9);
                                                        if (var28_22 == null) {
                                                            var3_6 = var1_1.a(var6_7);
                                                            var6_7 = true;
lbl24:

                                                            while (true) {
                                                                var11_25 = var9_24;
                                                                var7_10 = false;
                                                                var8_26 = false;
                                                                break block46;
                                                                break;
                                                            }
                                                        } else {
                                                            if (var27_4.c == -9223372036854775807L) {
                                                                var3_6 = var1_1.a((Object)var28_22.first, (l52.b)var25_9).d;
                                                                var11_25 = var9_24;
                                                                var6_7 = false;
                                                            } else {
                                                                var21_13 = var28_22.first;
                                                                var11_25 = (Long)var28_22.second;
                                                                var6_7 = true;
                                                                var3_6 = -1;
                                                            }
                                                            var5_27 = var24_3.e;
                                                            var8_26 = var6_7;
                                                            var7_10 = var5_27 == 4;
                                                            var6_7 = false;
                                                        }
                                                        break block46;
                                                    }
                                                    if (!var24_3.a.c()) break block55;
                                                    var3_6 = var1_1.a(var6_7);
lbl46:

                                                    while (true) {
                                                        var6_7 = false;

                                                        break;
                                                    }
                                                }
                                                if (var1_1.a(var21_13) != -1) break block56;
                                                var27_4 = n60.a((l52.d)var26_8, (l52.b)var25_9, var3_6, var6_7, var21_13, var24_3.a, var1_1);
                                                if (var27_4 != null) break block57;
                                                var3_6 = var1_1.a(var6_7);
                                                var6_7 = true;

                                            }
                                            var3_6 = var1_1.a((Object)var27_4, (l52.b)var25_9).d;
                                            var6_7 = false;

                                        }
                                        if (var9_24 == -9223372036854775807L) {
                                            var3_6 = var1_1.a((Object)var21_13, (l52.b)var25_9).d;

                                        }
                                        if (var4_23 != 0) {
                                            var27_4 = var24_3.a;
                                            var27_4.a(var22_12.a, (l52.b)var25_9);
                                            if (var24_3.a.a((int)var25_9.d, var26_8, (long)0L).p == var24_3.a.a(var22_12.a)) {
                                                var11_25 = var25_9.f;
                                                var27_4 = var1_1.a((l52.d)var26_8, (l52.b)var25_9, var1_1.a((Object)var21_13, (l52.b)var25_9).d, var9_24 + var11_25);
                                                var21_13 = var27_4.first;
                                                var11_25 = (Long)var27_4.second;
                                            } else {
                                                var11_25 = var9_24;
                                            }
                                            var3_6 = -1;
                                            var7_10 = false;
                                            var6_7 = false;
                                            var8_26 = true;
                                        } else {
                                            var3_6 = -1;
                                            var6_7 = false;

                                        }
                                    }
                                    if (var3_6 != -1) {
                                        var26_8 = var1_1.a((l52.d)var26_8, (l52.b)var25_9, var3_6, -9223372036854775807L);
                                        var21_13 = var26_8.first;
                                        var11_25 = (Long)var26_8.second;
                                        var13_28 = -9223372036854775807L;
                                    } else {
                                        var13_28 = var11_25;
                                    }
                                    var23_5 /* !! */  = var23_5 /* !! */ .a(var1_1, var21_13, var11_25);
                                    var3_6 = var23_5 /* !! */ .e;
                                    var3_6 = var3_6 != -1 && ((var5_27 = var22_12.e) == -1 || var3_6 < var5_27) ? 0 : 1;
                                    var3_6 = var22_12.a.equals(var21_13) != false && var22_12.a() == false && var23_5 /* !! */ .a() == false && var3_6 != 0 ? 1 : 0;
                                    var21_13 = var1_1.a(var21_13, (l52.b)var25_9);
                                    var4_23 = var4_23 == 0 && var9_24 == var13_28 && var22_12.a.equals(var23_5 /* !! */ .a) != false && (var22_12.a() != false && var21_13.f(var22_12.b) != false ? var21_13.b(var22_12.b, var22_12.c) != 4 && var21_13.b(var22_12.b, var22_12.c) != 2 : var23_5 /* !! */ .a() != false && var21_13.f(var23_5 /* !! */ .b) != false) ? 1 : 0;
                                    if (var3_6 != 0) break block58;
                                    var21_13 = var23_5 /* !! */ ;
                                    if (var4_23 == 0) break block59;
                                }
                                var21_13 = var22_12;
                            }
                            if (var21_13.a()) {
                                if (var21_13.equals(var22_12)) {
                                    var9_24 = var24_3.r;
                                } else {
                                    var1_1.a(var21_13.a, (l52.b)var25_9);
                                    var9_24 = var21_13.c == var25_9.d(var21_13.b) ? var25_9.b() : 0L;
                                }
                            } else {
                                var9_24 = var11_25;
                            }
                            var22_12 = new /* Unavailable Anonymous Inner Class!! */;
                        }
                        var23_5 /* !! */  = var22_12.a;
                        var17_29 = var22_12.c;
                        var7_10 = var22_12.d;
                        var11_25 = var22_12.b;
                        var3_6 = this.y.b.equals(var23_5 /* !! */ ) && var11_25 == this.y.r ? 0 : 1;
                        try {
                            var6_7 = var22_12.e;
                            if (!var6_7) break block48;
                        }
                        catch (Throwable var21_21) {
                            // empty catch block
                            break block49;
                        }
                        try {
                            var4_23 = this.y.e;
                            if (var4_23 == 1) break block50;
                        }
                        catch (Throwable var21_17) {
                            break block49;
                        }
                        try {
                            this.b(4);
                        }
                        catch (Throwable var21_14) {
                            break block49;
                        }
                    }
                    try {
                        this.a(false, false, false, true);
                    }
                    catch (Throwable var21_15) {
                        break block49;
                    }
                }
                if (var3_6 == 0) {
                    var21_13 = this.t;
                    {
                        catch (Throwable var21_20) {
                            break block49;
                        }
                        try {
                            var13_28 = this.M;
                            var19_30 = this.c();
                            var9_24 = var11_25;
                        }
                        catch (Throwable var21_19) {
                            break block49;
                        }
                        ** try [egrp 6[TRYBLOCK] [6 : 1125->1328)] { 
lbl159:

                        if (!var21_13.a(var1_1, var13_28, var19_30)) {
                            this.b(false);
                            var9_24 = var11_25;
                        }
                        break block51;
                    }
lbl163:

                    catch (Throwable var21_18) {
                        break block49;
                    }
                }
                var9_24 = var11_25;
                if (!var1_1.c()) {
                    for (var21_13 = this.t.e(); var21_13 != null; var21_13 = var21_13.b()) {
                        if (!var21_13.f.a.equals(var23_5 /* !! */ )) continue;
                        var24_3 = this.t.a(var1_1, var21_13.f);
                        var21_13.f = var24_3;
                        var25_9 = var21_13.a;
                        if (!(var25_9 instanceof wo)) continue;
                        var9_24 = var13_28 = var24_3.d;
                        if (var13_28 == -9223372036854775807L) {
                            var9_24 = -9223372036854775808L;
                        }
                        ((wo)var25_9).a(var9_24);
                    }
                    var6_7 = this.t.e() != this.t.f();
                    var9_24 = this.a((qw0.b)var23_5 /* !! */ , var11_25, var6_7, var7_10);
                }
            }
            var6_7 = true;
            var4_23 = 4;
            var24_3 = this.y;
            var21_13 = var24_3.a;
            var24_3 = var24_3.b;
            var11_25 = var22_12.f != false ? var9_24 : -9223372036854775807L;
            this.a(var1_1, (qw0.b)var23_5 /* !! */ , (l52)var21_13, (qw0.b)var24_3, var11_25);
            if (var3_6 != 0 || var17_29 != this.y.c) {
                var22_12 = this.y;
                var21_13 = var22_12.b.a;
                var22_12 = var22_12.a;
                var2_2 = var3_6 != 0 && var2_2 != false && var22_12.c() == false && var22_12.a((Object)var21_13, (l52.b)this.m).g == false ? var6_7 : false;
                var11_25 = this.y.d;
                var3_6 = var1_1.a(var21_13) == -1 ? var4_23 : 3;
                this.y = this.a((qw0.b)var23_5 /* !! */ , var9_24, var17_29, var11_25, var2_2, var3_6);
            }
            this.n();
            this.a(var1_1, this.y.a);
            this.y = this.y.a(var1_1);
            if (!var1_1.c()) {
                this.L = null;
            }
            this.a(false);
            return;
        }
        var6_7 = true;
        var4_23 = 4;
        var25_9 = this.y;
        var24_3 = var25_9.a;
        var25_9 = var25_9.b;
        var9_24 = var15_11;
        if (var22_12.f) {
            var9_24 = var11_25;
        }
        this.a(var1_1, (qw0.b)var23_5 /* !! */ , (l52)var24_3, (qw0.b)var25_9, var9_24);
        if (var3_6 != 0 || var17_29 != this.y.c) {
            var24_3 = this.y;
            var22_12 = var24_3.b.a;
            var24_3 = var24_3.a;
            var2_2 = var3_6 != 0 && var2_2 != false && var24_3.c() == false && var24_3.a((Object)var22_12, (l52.b)this.m).g == false ? var6_7 : false;
            var9_24 = this.y.d;
            var3_6 = var1_1.a(var22_12) == -1 ? var4_23 : 3;
            this.y = this.a((qw0.b)var23_5 /* !! */ , var11_25, var17_29, var9_24, var2_2, var3_6);
        }
        this.n();
        this.a(var1_1, this.y.a);
        this.y = this.y.a(var1_1);
        if (!var1_1.c()) {
            this.L = null;
        }
        this.a(false);
        throw var21_16;
    }

    private void a(a a13) throws g60 {
        this.z.a(1);
        if (a.c(a13) != -1) {
            this.L = new /* Unavailable Anonymous Inner Class!! */;
        }
        this.a(this.u.a(a.a(a13), a.b(a13)), false);
    }

    private void a(a a13, int n10) throws g60 {
        this.z.a(1);
        tw0 tw02 = this.u;
        int n13 = n10;
        if (n10 == -1) {
            n13 = tw02.b();
        }
        this.a(tw02.a(n13, a.a(a13), a.b(a13)), false);
    }

    private void a(b b10) throws g60 {
        this.z.a(1);
        tw0 tw02 = this.u;
        b10.getClass();
        this.a(tw02.d(), false);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(g var1_1) throws g60 {
        block18: {
            block17: {
                block16: {
                    block20: {
                        block21: {
                            block19: {
                                var13_5 /* !! */  = this.z;
                                var2_6 = true;
                                var13_5 /* !! */ .a(1);
                                var14_7 /* !! */  = n60.a(this.y.a, var1_1, true, this.F, this.G, this.l, this.m);
                                if (var14_7 /* !! */  != null) break block19;
                                var15_8 = this.a(this.y.a);
                                var13_5 /* !! */  = (qw0.b)var15_8.first;
                                var7_9 = (Long)var15_8.second;
                                var4_10 = this.y.a.c() ^ true;
                                var9_11 = -9223372036854775807L;
                                break block20;
                            }
                            var13_5 /* !! */  = var14_7 /* !! */ .first;
                            var9_11 = (Long)var14_7 /* !! */ .second;
                            var7_9 = var1_1.c == -9223372036854775807L ? -9223372036854775807L : var9_11;
                            if (!(var13_5 /* !! */  = this.t.a(this.y.a, (Object)var13_5 /* !! */ , var9_11)).a()) break block21;
                            this.y.a.a(var13_5 /* !! */ .a, this.m);
                            var9_11 = this.m.d(var13_5 /* !! */ .b) == var13_5 /* !! */ .c ? this.m.b() : 0L;

                        }
                        if (var1_1.c == -9223372036854775807L) // 2 sources

                        {
                            var11_12 = var9_11;
                            var4_10 = true;
                            var9_11 = var7_9;
                            var7_9 = var11_12;
                        } else {
                            var11_12 = var9_11;
                            var9_11 = var7_9;
                            var4_10 = false;
                            var7_9 = var11_12;
                        }
                    }
                    try {
                        if (!this.y.a.c()) break block16;
                        this.L = var1_1;
                        break block17;
                    }
                    catch (Throwable var1_2) {
                        break block18;
                    }
                }
                if (var14_7 /* !! */  == null) {
                    if (this.y.e != 1) {
                        this.b(4);
                    }
                    this.a(false, true, false, true);
                } else {
                    if (var13_5 /* !! */ .equals((Object)this.y.b)) {
                        var1_1 = this.t.e();
                        var11_12 = var1_1 != null && var1_1.d != false && var7_9 != 0L ? var1_1.a.a(var7_9, this.x) : var7_9;
                        if (m92.b((long)var11_12) == m92.b((long)this.y.r)) {
                            var1_1 = this.y;
                            var3_13 = var1_1.e;
                            if (var3_13 == 2 || var3_13 == 3) {
                                var11_12 = var1_1.r;
                                this.y = this.a((qw0.b)var13_5 /* !! */ , var11_12, var9_11, var11_12, var4_10, 2);
                                return;
                            }
                        }
                    } else {
                        var11_12 = var7_9;
                    }
                    var5_14 = this.y.e == 4;
                    var6_15 = this.t.e() != this.t.f();
                    if (var7_9 == (var11_12 = this.a((qw0.b)var13_5 /* !! */ , var11_12, var6_15, var5_14))) {
                        var2_6 = false;
                    }
                    var4_10 = var2_6 | var4_10;
                    var1_1 = this.y;
                    var14_7 /* !! */  = var1_1.a;
                    this.a((l52)var14_7 /* !! */ , (qw0.b)var13_5 /* !! */ , (l52)var14_7 /* !! */ , var1_1.b, var9_11);
                }
            }
            this.y = this.a((qw0.b)var13_5 /* !! */ , var7_9, var9_11, var7_9, var4_10, 2);
            return;
            finally {
                var7_9 = var11_12;
            }
        }
        this.y = this.a((qw0.b)var13_5 /* !! */ , var7_9, var9_11, var7_9, var4_10, 2);
        throw var1_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static void a(ni1 ni12) throws g60 {
        // MONITORENTER : ni12
        // MONITOREXIT : ni12
        try {
            ni12.c().a(ni12.d(), ni12.b());
            return;
        }
        finally {
            ni12.a(true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(w32<Boolean> w322, long l10) {
        synchronized (this) {
            boolean bl2;
            long l11;
            boolean bl3;
            long l13;
            try {
                l13 = this.r.b();
                bl3 = false;
                l11 = l10;
            }
            catch (Throwable throwable) {}
            throw throwable;
            while (!(bl2 = ((Boolean)w322.get()).booleanValue()) && l11 > 0L) {
                try {
                    this.r.getClass();
                    this.wait(l11);
                }
                catch (InterruptedException interruptedException) {
                    bl3 = true;
                }
                l11 = l13 + l10 - this.r.b();
            }
            if (bl3) {
                Thread.currentThread().interrupt();
            }
            return;
        }
    }

    private void a(IOException exception, int n10) {
        g60 g602 = g60.a(exception, n10);
        lw0 lw02 = this.t.e();
        exception = g602;
        if (lw02 != null) {
            exception = g602.a(lw02.f.a);
        }
        zs0.a((String)"ExoPlayerImplInternal", (String)"Playback error", (Throwable)exception);
        this.a(false, false);
        this.y = this.y.a((g60)exception);
    }

    private void a(boolean bl2) {
        long l10;
        lw0 lw02 = this.t.d();
        qw0.b b10 = lw02 == null ? this.y.b : lw02.f.a;
        boolean bl3 = this.y.k.equals((Object)b10) ^ true;
        if (bl3) {
            this.y = this.y.a(b10);
        }
        b10 = this.y;
        if (lw02 == null) {
            l10 = ((zh1)b10).r;
        } else if (!lw02.d) {
            l10 = lw02.f.b;
        } else {
            l10 = lw02.e ? lw02.a.getBufferedPositionUs() : Long.MIN_VALUE;
            if (l10 == Long.MIN_VALUE) {
                l10 = lw02.f.e;
            }
        }
        ((zh1)b10).p = l10;
        b10 = this.y;
        ((zh1)b10).q = this.a(((zh1)b10).p);
        if ((bl3 || bl2) && lw02 != null && lw02.d) {
            b10 = lw02.f();
            this.g.a(this.b, ((m62)b10).c);
        }
    }

    private void a(boolean bl2, int n10, boolean bl3, int n13) throws g60 {
        this.z.a(bl3 ? 1 : 0);
        cp1[] cp1Array = this.z;
        com.yandex.mobile.ads.impl.n60$d.b(cp1Array, (boolean)true);
        cp1Array.f = true;
        cp1Array.g = n13;
        cp1Array = this.y;
        this.y = new zh1(cp1Array.a, cp1Array.b, cp1Array.c, cp1Array.d, cp1Array.e, cp1Array.f, cp1Array.g, cp1Array.h, cp1Array.i, cp1Array.j, cp1Array.k, bl2, n10, cp1Array.n, cp1Array.p, cp1Array.q, cp1Array.r, cp1Array.o);
        bl3 = false;
        this.D = false;
        for (cp1Array = this.t.e(); cp1Array != null; cp1Array = cp1Array.b()) {
            for (b70 b702 : cp1Array.f().c) {
                if (b702 == null) continue;
                b702.a(bl2);
            }
        }
        if (!this.o()) {
            this.q();
            this.s();
        } else {
            n10 = this.y.e;
            if (n10 == 3) {
                this.D = false;
                this.p.a();
                cp1Array = this.b;
                n13 = cp1Array.length;
                for (n10 = (int)(bl3 ? 1 : 0); n10 < n13; ++n10) {
                    cp1 cp12 = cp1Array[n10];
                    if (!n60.b(cp12)) continue;
                    cp12.start();
                }
                this.i.a(2);
            } else if (n10 == 2) {
                this.i.a(2);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(boolean bl2, @Nullable AtomicBoolean atomicBoolean) {
        if (this.H != bl2) {
            this.H = bl2;
            if (!bl2) {
                for (cp1 cp12 : this.b) {
                    if (n60.b(cp12) || !this.c.remove(cp12)) continue;
                    cp12.b();
                }
            }
        }
        if (atomicBoolean == null) return;
        synchronized (this) {
            atomicBoolean.set(true);
            this.notifyAll();
            return;
        }
    }

    private void a(boolean bl2, boolean bl3) {
        bl2 = bl2 || !this.H;
        this.a(bl2, false, true, false);
        this.z.a(bl3 ? 1 : 0);
        this.g.d();
        this.b(1);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private void a(boolean var1_1, boolean var2_2, boolean var3_3, boolean var4_4) {
        this.i.c();
        var17_5 = null;
        this.P = null;
        this.D = false;
        this.p.b();
        this.M = 1000000000000L;
        for (zh1 var15_10 : this.b) {
            try {
                this.a((cp1)var15_10 /* !! */ );
                continue;
            }
            catch (RuntimeException var15_11) {
            }
            catch (g60 var15_12) {
                // empty catch block
            }
            zs0.a((String)"ExoPlayerImplInternal", (String)"Disable failed.", (Throwable)var15_10 /* !! */ );
        }
        if (var1_1) {
            for (zh1 var16_6 : this.b) {
                if (!this.c.remove(var16_6 /* !! */ )) continue;
                try {
                    var16_6 /* !! */ .b();
                }
                catch (RuntimeException var16_7) {
                    zs0.a((String)"ExoPlayerImplInternal", (String)"Reset failed.", (Throwable)var16_7);
                }
            }
        }
        this.K = 0;
        var16_6 /* !! */  = this.y;
        var15_10 /* !! */  = var16_6 /* !! */ .b;
        var7_13 = var16_6 /* !! */ .r;
        if (this.y.b.a()) ** GOTO lbl-1000
        var19_14 = this.y;
        var16_6 /* !! */  = this.m;
        var18_15 = var19_14.b;
        var19_14 = var19_14.a;
        if (!var19_14.c() && !var19_14.a((Object)var18_15.a, (l52.b)var16_6 /* !! */ ).g) {
            var9_16 = this.y.r;
        } else // 2 sources

        {
            var9_16 = this.y.c;
        }
        if (!var2_2) ** GOTO lbl-1000
        this.L = null;
        var15_10 /* !! */  = this.a(this.y.a);
        var16_6 /* !! */  = (qw0.b)var15_10 /* !! */ .first;
        var11_17 = (Long)var15_10 /* !! */ .second;
        var1_1 = var16_6 /* !! */ .equals((Object)this.y.b);
        var13_18 = -9223372036854775807L;
        var15_10 /* !! */  = var16_6 /* !! */ ;
        var7_13 = var11_17;
        var9_16 = var13_18;
        if (!var1_1) {
            var5_9 = 1;
            var9_16 = var13_18;
            var7_13 = var11_17;
            var15_10 /* !! */  = var16_6 /* !! */ ;
        } else // 2 sources

        {
            var5_9 = 0;
        }
        this.t.c();
        this.E = false;
        var19_14 = this.y;
        var20_19 = var19_14.a;
        var6_8 = var19_14.e;
        var16_6 /* !! */  = var4_4 ? var17_5 : var19_14.f;
        var17_5 = var5_9 != 0 ? c62.e : var19_14.h;
        var18_15 = var5_9 != 0 ? this.f : var19_14.i;
        var19_14 = var5_9 != 0 ? xj0.h() : var19_14.j;
        var21_20 = this.y;
        this.y = new zh1(var20_19, (qw0.b)var15_10 /* !! */ , var9_16, var7_13, var6_8, (g60)var16_6 /* !! */ , false, var17_5, (m62)var18_15, (List)var19_14, (qw0.b)var15_10 /* !! */ , var21_20.l, var21_20.m, var21_20.n, var7_13, 0L, var7_13, false);
        if (var3_3) {
            this.u.e();
        }
    }

    private void a(boolean[] blArray) throws g60 {
        int n10;
        lw0 lw02 = this.t.f();
        m62 m622 = lw02.f();
        for (n10 = 0; n10 < this.b.length; ++n10) {
            if (m622.a(n10) || !this.c.remove(this.b[n10])) continue;
            this.b[n10].b();
        }
        for (n10 = 0; n10 < this.b.length; ++n10) {
            if (!m622.a(n10)) continue;
            boolean bl2 = blArray[n10];
            cp1 cp12 = this.b[n10];
            if (n60.b(cp12)) continue;
            lw0 lw03 = this.t.f();
            boolean bl3 = lw03 == this.t.e();
            Object object = lw03.f();
            ep1 ep12 = object.b[n10];
            object = object.c[n10];
            int n13 = object != null ? object.b() : 0;
            cc0[] cc0Array = new cc0[n13];
            for (int i14 = 0; i14 < n13; ++i14) {
                cc0Array[i14] = object.a(i14);
            }
            n13 = this.o() && this.y.e == 3 ? 1 : 0;
            bl2 = !bl2 && n13 != 0;
            ++this.K;
            this.c.add(cp12);
            cp12.a(ep12, cc0Array, lw03.c[n10], this.M, bl2, bl3, lw03.d(), lw03.c());
            cp12.a(11, new m60(this));
            this.p.b(cp12);
            if (n13 == 0) continue;
            cp12.start();
        }
        lw02.g = true;
    }

    private boolean a(l52 object, qw0.b b10) {
        boolean bl2;
        boolean bl3 = b10.a();
        boolean bl4 = bl2 = false;
        if (!bl3) {
            if (object.c()) {
                bl4 = bl2;
            } else {
                object.a(object.a((Object)b10.a, (l52.b)this.m).d, this.l, 0L);
                bl4 = bl2;
                if (this.l.a()) {
                    object = this.l;
                    bl4 = bl2;
                    if (((l52.d)object).j) {
                        bl4 = bl2;
                        if (((l52.d)object).g != -9223372036854775807L) {
                            bl4 = true;
                        }
                    }
                }
            }
        }
        return bl4;
    }

    /*
     * Unable to fully structure code
     */
    private void b() throws g60, IOException {
        block61: {
            block63: {
                block68: {
                    block67: {
                        block64: {
                            block66: {
                                block65: {
                                    block62: {
                                        block60: {
                                            block59: {
                                                var9_1 = this.r.a();
                                                this.i.c();
                                                if (this.y.a.c() || !this.u.c()) break block60;
                                                this.t.a(this.M);
                                                if (this.t.h() && (var14_10 = this.t.a(this.M, this.y)) != null) {
                                                    var13_9 = this.t.a(this.d, this.e, (vc)this.g.c(), this.u, (nw0)var14_10, this.f);
                                                    var13_9.a.a(this, var14_10.b);
                                                    if (this.t.e() == var13_9) {
                                                        this.b(var14_10.b);
                                                    }
                                                    this.a(false);
                                                }
                                                if (this.E) {
                                                    var13_9 = this.t.d();
                                                    var11_7 = var13_9 != null && (var7_6 = var13_9.d == false ? 0L : var13_9.a.getNextLoadPositionUs()) != -9223372036854775808L;
                                                    this.E = var11_7;
                                                    this.r();
                                                } else {
                                                    this.f();
                                                }
                                                var13_9 = this.t.f();
                                                if (var13_9 != null) {
                                                    if (var13_9.b() != null && !this.C) {
                                                        var14_10 = this.t.f();
                                                        if (var14_10.d) {
                                                            for (var1_2 = 0; var1_2 < ((cp1[])(var15_11 = this.b)).length; ++var1_2) {
                                                                var15_11 = var15_11[var1_2];
                                                                var16_12 = var14_10.c[var1_2];
                                                                if (var15_11.g() != var16_12) break block59;
                                                                if (var16_12 == null || var15_11.e()) continue;
                                                                var16_12 = var14_10.b();
                                                                if (var14_10.f.f && var16_12.d && (var15_11 instanceof x42 || var15_11 instanceof p01 || var15_11.j() >= var16_12.d())) {
                                                                    continue;
                                                                }
                                                                break block59;
                                                            }
                                                            if (var13_9.b().d || this.M >= var13_9.b().d()) {
                                                                var15_11 = var13_9.f();
                                                                var14_10 = this.t.b();
                                                                var16_12 = var14_10.f();
                                                                var17_13 = this.y.a;
                                                                this.a((l52)var17_13, var14_10.f.a, (l52)var17_13, var13_9.f.a, -9223372036854775807L);
                                                                if (var14_10.d && var14_10.a.readDiscontinuity() != -9223372036854775807L) {
                                                                    var7_6 = var14_10.d();
                                                                    for (Object var13_9 : this.b) {
                                                                        if (var13_9.g() == null) continue;
                                                                        var13_9.h();
                                                                        if (!(var13_9 instanceof x42)) continue;
                                                                        ((x42)var13_9).c(var7_6);
                                                                    }
                                                                } else {
                                                                    for (var1_2 = 0; var1_2 < this.b.length; ++var1_2) {
                                                                        var11_7 = var15_11.a(var1_2);
                                                                        var12_8 = var16_12.a(var1_2);
                                                                        if (!var11_7 || this.b[var1_2].k()) continue;
                                                                        var2_3 = ((ck)this.d[var1_2]).m() == -2 ? 1 : 0;
                                                                        var17_13 = var15_11.b[var1_2];
                                                                        var13_9 = var16_12.b[var1_2];
                                                                        if (var12_8 && var13_9.equals(var17_13) && var2_3 == 0) continue;
                                                                        var13_9 = this.b[var1_2];
                                                                        var7_6 = var14_10.d();
                                                                        var13_9.h();
                                                                        if (!(var13_9 instanceof x42)) continue;
                                                                        ((x42)var13_9).c(var7_6);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else if (var13_9.f.i || this.C) {
                                                        for (var1_2 = 0; var1_2 < ((cp1[])(var14_10 = this.b)).length; ++var1_2) {
                                                            var15_11 = var14_10[var1_2];
                                                            var14_10 = var13_9.c[var1_2];
                                                            if (var14_10 == null || var15_11.g() != var14_10 || !var15_11.e()) continue;
                                                            var7_6 = var13_9.f.e;
                                                            var7_6 = var7_6 != -9223372036854775807L && var7_6 != -9223372036854775808L ? var13_9.c() + var13_9.f.e : -9223372036854775807L;
                                                            var15_11.h();
                                                            if (!(var15_11 instanceof x42)) continue;
                                                            ((x42)var15_11).c(var7_6);
                                                        }
                                                    }
                                                }
                                            }
                                            if ((var13_9 = this.t.f()) != null && this.t.e() != var13_9 && !var13_9.g) {
                                                var13_9 = this.t.f();
                                                var14_10 = var13_9.f();
                                                var2_3 = 0;
                                                for (var1_2 = 0; var1_2 < ((m62)(var15_11 = this.b)).length; ++var1_2) {
                                                    if (!n60.b((cp1)(var15_11 = var15_11[var1_2]))) continue;
                                                    var3_4 = var15_11.g() != var13_9.c[var1_2] ? 1 : 0;
                                                    if (var14_10.a(var1_2) && var3_4 == 0) continue;
                                                    if (!var15_11.k()) {
                                                        var17_13 = var14_10.c[var1_2];
                                                        var3_4 = var17_13 != null ? var17_13.b() : 0;
                                                        var16_12 = new cc0[var3_4];
                                                        for (var4_5 = 0; var4_5 < var3_4; ++var4_5) {
                                                            var16_12[var4_5] = var17_13.a(var4_5);
                                                        }
                                                        var15_11.a((cc0[])var16_12, var13_9.c[var1_2], var13_9.d(), var13_9.c());
                                                        continue;
                                                    }
                                                    if (var15_11.a()) {
                                                        this.a((cp1)var15_11);
                                                        continue;
                                                    }
                                                    var2_3 = 1;
                                                }
                                                if (var2_3 ^ true) {
                                                    this.a(new boolean[((m62)var15_11).length]);
                                                }
                                            }
                                            var1_2 = 0;
                                            while (this.o() && !this.C && (var13_9 = this.t.e()) != null && (var13_9 = var13_9.b()) != null && this.M >= var13_9.d() && var13_9.g) {
                                                if (var1_2 != 0) {
                                                    var13_9 = this.z;
                                                    var14_10 = this.y;
                                                    var11_7 = com.yandex.mobile.ads.impl.n60$d.a(var13_9);
                                                    var1_2 = var13_9.b != var14_10 ? 1 : 0;
                                                    com.yandex.mobile.ads.impl.n60$d.b(var13_9, (boolean)(var11_7 |= var1_2));
                                                    var13_9.b = var14_10;
                                                    if (var11_7) {
                                                        this.s.a(var13_9);
                                                        this.z = new /* Unavailable Anonymous Inner Class!! */;
                                                    }
                                                }
                                                var14_10 = this.t.a();
                                                var14_10.getClass();
                                                if (!this.y.b.a.equals(var14_10.f.a.a)) ** GOTO lbl-1000
                                                var13_9 = this.y.b;
                                                if (var13_9.b != -1) ** GOTO lbl-1000
                                                var15_11 = var14_10.f.a;
                                                if (var15_11.b == -1 && var13_9.e != var15_11.e) {
                                                    var1_2 = 1;
                                                } else // 3 sources

                                                {
                                                    var1_2 = 0;
                                                }
                                                var13_9 = var14_10.f;
                                                var14_10 = var13_9.a;
                                                var7_6 = var13_9.b;
                                                this.y = this.a((qw0.b)var14_10, var7_6, var13_9.c, var7_6, (boolean)(var1_2 ^ 1), 0);
                                                this.n();
                                                this.s();
                                                var1_2 = 1;
                                            }
                                        }
                                        var1_2 = this.y.e;
                                        if (var1_2 == 1 || var1_2 == 4) break block61;
                                        var14_10 = this.t.e();
                                        if (var14_10 == null) {
                                            this.i.a(var9_1 + 10L);
                                            return;
                                        }
                                        x52.a((String)"doSomeWork");
                                        this.s();
                                        if (var14_10.d) {
                                            var7_6 = SystemClock.elapsedRealtime();
                                            var14_10.a.discardBuffer(this.y.r - this.n, this.o);
                                            var2_3 = 1;
                                            var1_2 = 1;
                                            for (var3_4 = 0; var3_4 < ((zh1)(var13_9 = this.b)).length; ++var3_4) {
                                                if (!n60.b((cp1)(var13_9 = var13_9[var3_4]))) {
                                                    var5_14 = var2_3;
                                                    var6_15 = var1_2;
                                                } else {
                                                    var13_9.a(this.M, var7_6 * 1000L);
                                                    var2_3 = var2_3 != 0 && var13_9.a() != false ? 1 : 0;
                                                    var4_5 = var14_10.c[var3_4] != var13_9.g() ? 1 : 0;
                                                    var5_14 = var4_5 == 0 && var13_9.e() != false ? 1 : 0;
                                                    var4_5 = var4_5 == 0 && var5_14 == 0 && !var13_9.d() && !var13_9.a() ? 0 : 1;
                                                    var1_2 = var1_2 != 0 && var4_5 != 0 ? 1 : 0;
                                                    var5_14 = var2_3;
                                                    var6_15 = var1_2;
                                                    if (var4_5 == 0) {
                                                        var13_9.i();
                                                        var6_15 = var1_2;
                                                        var5_14 = var2_3;
                                                    }
                                                }
                                                var2_3 = var5_14;
                                                var1_2 = var6_15;
                                            }
                                        } else {
                                            var14_10.a.maybeThrowPrepareError();
                                            var1_2 = 1;
                                            var2_3 = 1;
                                        }
                                        var7_6 = var14_10.f.e;
                                        var2_3 = var2_3 != 0 && var14_10.d != false && (var7_6 == -9223372036854775807L || var7_6 <= this.y.r) ? 1 : 0;
                                        if (var2_3 != 0 && this.C) {
                                            this.C = false;
                                            this.a(false, this.y.m, false, 5);
                                        }
                                        if (var2_3 == 0 || !var14_10.f.i) break block62;
                                        this.b(4);
                                        this.q();
                                        break block63;
                                    }
                                    var13_9 = this.y;
                                    if (var13_9.e != 2) break block64;
                                    if (this.K != 0) break block65;
                                    var13_9 = this.t.e();
                                    var7_6 = var13_9.f.e;
                                    if (!var13_9.d || var7_6 != -9223372036854775807L && this.y.r >= var7_6 && this.o()) break block64;
                                    break block66;
                                }
                                if (var1_2 == 0) break block64;
                                if (!var13_9.g) break block66;
                                var7_6 = this.a(var13_9.a, this.t.e().f.a) != false ? ((tz)this.v).a() : -9223372036854775807L;
                                var13_9 = this.t.d();
                                var2_3 = var13_9.d != false && (var13_9.e == false || var13_9.a.getBufferedPositionUs() == -9223372036854775808L) && var13_9.f.i != false ? 1 : 0;
                                var3_4 = var13_9.f.a.a() != false && var13_9.d == false ? 1 : 0;
                                if (var2_3 == 0 && var3_4 == 0 && !this.g.a(this.a(this.y.p), this.p.getPlaybackParameters().b, this.D, var7_6)) break block64;
                            }
                            this.b(3);
                            this.P = null;
                            if (this.o()) {
                                this.D = false;
                                this.p.a();
                                var13_9 = this.b;
                                var2_3 = ((cp1[])var13_9).length;
                                for (var1_2 = 0; var1_2 < var2_3; ++var1_2) {
                                    var15_11 = var13_9[var1_2];
                                    if (!n60.b((cp1)var15_11)) continue;
                                    var15_11.start();
                                }
                            }
                            break block63;
                        }
                        if (this.y.e != 3) break block63;
                        if (this.K != 0) break block67;
                        var13_9 = this.t.e();
                        var7_6 = var13_9.f.e;
                        if (!var13_9.d || var7_6 != -9223372036854775807L && this.y.r >= var7_6 && this.o()) break block68;
                        break block63;
                    }
                    if (var1_2 != 0) break block63;
                }
                this.D = this.o();
                this.b(2);
                if (this.D) {
                    for (var13_9 = this.t.e(); var13_9 != null; var13_9 = var13_9.b()) {
                        var16_12 = var13_9.f().c;
                        var2_3 = var16_12.length;
                        for (var1_2 = 0; var1_2 < var2_3; ++var1_2) {
                            var15_11 = var16_12[var1_2];
                            if (var15_11 == null) continue;
                            var15_11.g();
                        }
                    }
                    ((tz)this.v).c();
                }
                this.q();
            }
            if (this.y.e != 2) ** GOTO lbl-1000
            for (var1_2 = 0; var1_2 < (var13_9 = this.b).length; ++var1_2) {
                if (!n60.b((cp1)var13_9[var1_2]) || this.b[var1_2].g() != var14_10.c[var1_2]) continue;
                this.b[var1_2].i();
            }
            var13_9 = this.y;
            if (!var13_9.g && var13_9.q < 500000L && (var13_9 = this.t.d()) != null && (var7_6 = var13_9.d == false ? 0L : var13_9.a.getNextLoadPositionUs()) != -9223372036854775808L) {
                if (this.Q == -9223372036854775807L) {
                    this.Q = this.r.b();
                } else if (this.r.b() - this.Q >= 4000L) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            } else // 2 sources

            {
                this.Q = -9223372036854775807L;
            }
            var1_2 = this.o() != false && this.y.e == 3 ? 1 : 0;
            var11_7 = this.J != false && this.I != false && var1_2 != 0;
            var13_9 = this.y;
            if (var13_9.o != var11_7) {
                this.y = new zh1(var13_9.a, var13_9.b, var13_9.c, var13_9.d, var13_9.e, var13_9.f, var13_9.g, var13_9.h, var13_9.i, var13_9.j, var13_9.k, var13_9.l, var13_9.m, var13_9.n, var13_9.p, var13_9.q, var13_9.r, var11_7);
            }
            this.I = false;
            if (!var11_7 && (var2_3 = this.y.e) != 4) {
                if (var1_2 == 0 && var2_3 != 2) {
                    if (var2_3 == 3 && this.K != 0) {
                        this.i.a(var9_1 + 1000L);
                    }
                } else {
                    this.i.a(var9_1 + 10L);
                }
                x52.a();
            }
        }
    }

    private void b(int n10) {
        zh1 zh12 = this.y;
        if (zh12.e != n10) {
            if (n10 != 2) {
                this.Q = -9223372036854775807L;
            }
            this.y = zh12.a(n10);
        }
    }

    private void b(long l10) throws g60 {
        lw0 lw02 = this.t.e();
        l10 = lw02 == null ? (l10 += 1000000000000L) : lw02.d(l10);
        this.M = l10;
        this.p.a(l10);
        lw02 = this.b;
        int n10 = ((cp1[])lw02).length;
        for (int i14 = 0; i14 < n10; ++i14) {
            b70[] b70Array = lw02[i14];
            if (!n60.b((cp1)b70Array)) continue;
            b70Array.a(this.M);
        }
        for (lw02 = this.t.e(); lw02 != null; lw02 = lw02.b()) {
            for (b70 b702 : lw02.f().c) {
                if (b702 == null) continue;
                b702.f();
            }
        }
    }

    private void b(bi1 bi12) throws g60 {
        this.p.a(bi12);
        bi12 = this.p.getPlaybackParameters();
        this.a(bi12, bi12.b, true, true);
    }

    private void b(kw0 kw02) {
        if (!this.t.a(kw02)) {
            return;
        }
        this.t.a(this.M);
        this.f();
    }

    public static /* synthetic */ void b(n60 n602, ni1 ni12) {
        n602.b(ni12);
    }

    private /* synthetic */ void b(ni1 ni12) {
        try {
            n60.a(ni12);
            return;
        }
        catch (g60 g602) {
            zs0.a((String)"ExoPlayerImplInternal", (String)"Unexpected error delivering message on external thread.", (Throwable)g602);
            throw new RuntimeException(g602);
        }
    }

    private void b(boolean bl2) throws g60 {
        qw0.b b10 = this.t.e().f.a;
        long l10 = this.a(b10, this.y.r, true, false);
        if (l10 != this.y.r) {
            zh1 zh12 = this.y;
            this.y = this.a(b10, l10, zh12.c, zh12.d, bl2, 5);
        }
    }

    private static boolean b(cp1 cp12) {
        boolean bl2 = cp12.getState() != 0;
        return bl2;
    }

    private long c() {
        cp1[] cp1Array;
        lw0 lw02 = this.t.f();
        if (lw02 == null) {
            return 0L;
        }
        long l10 = lw02.c();
        if (!lw02.d) {
            return l10;
        }
        for (int i14 = 0; i14 < (cp1Array = this.b).length; ++i14) {
            long l11 = l10;
            if (n60.b(cp1Array[i14])) {
                if (this.b[i14].g() != lw02.c[i14]) {
                    l11 = l10;
                } else {
                    l11 = this.b[i14].j();
                    if (l11 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    }
                    l11 = Math.max(l11, l10);
                }
            }
            l10 = l11;
        }
        return l10;
    }

    static /* bridge */ /* synthetic */ bf0 c(n60 n602) {
        return n602.i;
    }

    private void c(kw0 kw02) throws g60 {
        if (!this.t.a(kw02)) {
            return;
        }
        kw02 = this.t.d();
        kw02.a(this.p.getPlaybackParameters().b, this.y.a);
        Object object = kw02.f();
        this.g.a(this.b, object.c);
        if (kw02 == this.t.e()) {
            this.b(((lw0)kw02).f.b);
            this.a(new boolean[this.b.length]);
            zh1 zh12 = this.y;
            object = zh12.b;
            long l10 = ((lw0)kw02).f.b;
            this.y = this.a((qw0.b)((Object)object), l10, zh12.c, l10, false, 5);
        }
        this.f();
    }

    private void c(boolean bl2) {
        if (bl2 == this.J) {
            return;
        }
        this.J = bl2;
        if (!bl2 && this.y.o) {
            this.i.a(2);
        }
    }

    static /* bridge */ /* synthetic */ void d(n60 n602, boolean bl2) {
        n602.I = bl2;
    }

    private void d(ni1 ni12) {
        Looper looper = ni12.a();
        if (!looper.getThread().isAlive()) {
            zs0.d((String)"TAG", (String)"Trying to send message on a dead thread.");
            ni12.a(false);
            return;
        }
        this.r.a(looper, null).a((Runnable)new z03(this, ni12));
    }

    private void d(boolean bl2) throws g60 {
        this.B = bl2;
        this.n();
        if (this.C && this.t.f() != this.t.e()) {
            this.b(true);
            this.a(false);
        }
    }

    private /* synthetic */ Boolean e() {
        return this.A;
    }

    private void e(boolean bl2) throws g60 {
        this.G = bl2;
        if (!this.t.a(this.y.a, bl2)) {
            this.b(true);
        }
        this.a(false);
    }

    /*
     * Unable to fully structure code
     */
    private void f() {
        var6_1 = this.t.d();
        if (var6_1 == null) ** GOTO lbl-1000
        var5_2 = var6_1.d;
        var3_3 = 0L;
        var1_4 = var5_2 == false ? 0L : var6_1.a.getNextLoadPositionUs();
        if (var1_4 == -9223372036854775808L) // 2 sources

        {
            var5_2 = false;
        } else {
            var6_1 = this.t.d();
            var1_4 = var6_1.d == false ? var3_3 : var6_1.a.getNextLoadPositionUs();
            var1_4 = this.a(var1_4);
            if (var6_1 != this.t.e()) {
                var3_3 = var6_1.f.b;
            }
            var5_2 = this.g.a(var1_4, this.p.getPlaybackParameters().b);
        }
        this.E = var5_2;
        if (var5_2) {
            this.t.d().a(this.M);
        }
        this.r();
    }

    private void g() throws g60 {
        this.a(this.u.a(), true);
    }

    private void j() {
        this.z.a(1);
        this.a(false, false, false, true);
        this.g.f();
        int n10 = this.y.a.c() ? 4 : 2;
        this.b(n10);
        this.u.a((k72)this.h.a());
        this.i.a(2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void l() {
        this.a(true, false, true, false);
        this.g.b();
        this.b(1);
        this.j.quit();
        synchronized (this) {
            this.A = true;
            this.notifyAll();
            return;
        }
    }

    private void m() throws g60 {
        float f11 = this.p.getPlaybackParameters().b;
        lw0 lw02 = this.t.f();
        int n10 = 1;
        for (Object object = this.t.e(); object != null && object.d; object = object.b()) {
            pt1 pt12;
            Object object2;
            block10: {
                object2 = object.b(f11, this.y.a);
                pt12 = object.f();
                if (pt12 != null && pt12.c.length == object2.c.length) {
                    for (int i14 = 0; i14 < object2.c.length; ++i14) {
                        if (m92.a((Object)object2.b[i14], (Object)pt12.b[i14]) && m92.a((Object)object2.c[i14], (Object)pt12.c[i14])) {
                            continue;
                        }
                        break block10;
                    }
                    if (object != lw02) continue;
                    n10 = 0;
                    continue;
                }
            }
            if (n10 != 0) {
                lw02 = this.t.e();
                boolean bl2 = this.t.a(lw02);
                object = new boolean[this.b.length];
                long l10 = lw02.a(object2, this.y.r, bl2, (boolean[])object);
                object2 = this.y;
                bl2 = object2.e != 4 && l10 != object2.r;
                object2 = this.y;
                this.y = this.a(object2.b, l10, object2.c, object2.d, bl2, 5);
                if (bl2) {
                    this.b(l10);
                }
                object2 = new boolean[this.b.length];
                for (n10 = 0; n10 < ((cp1[])(pt12 = this.b)).length; ++n10) {
                    cp1 cp12 = pt12[n10];
                    bl2 = n60.b(cp12);
                    object2[n10] = (m62)bl2;
                    pt12 = lw02.c[n10];
                    if (!bl2) continue;
                    if (pt12 != cp12.g()) {
                        this.a(cp12);
                        continue;
                    }
                    if (object[n10] == false) continue;
                    cp12.a(this.M);
                }
                this.a((boolean[])object2);
            } else {
                this.t.a(object);
                if (object.d) {
                    object.a(object2, Math.max(object.f.b, object.c(this.M)));
                }
            }
            this.a(true);
            if (this.y.e == 4) break;
            this.f();
            this.s();
            this.i.a(2);
            break;
        }
    }

    private void n() {
        lw0 lw02 = this.t.e();
        boolean bl2 = lw02 != null && lw02.f.h && this.B;
        this.C = bl2;
    }

    private boolean o() {
        zh1 zh12 = this.y;
        boolean bl2 = zh12.l && zh12.m == 0;
        return bl2;
    }

    private void q() throws g60 {
        this.p.b();
        for (cp1 cp12 : this.b) {
            if (!n60.b(cp12) || cp12.getState() != 2) continue;
            cp12.stop();
        }
    }

    private void r() {
        lw0 lw02 = this.t.d();
        boolean bl2 = this.E || lw02 != null && lw02.a.isLoading();
        lw02 = this.y;
        if (bl2 != lw02.g) {
            this.y = new zh1(lw02.a, lw02.b, lw02.c, lw02.d, lw02.e, lw02.f, bl2, lw02.h, lw02.i, lw02.j, lw02.k, lw02.l, lw02.m, lw02.n, lw02.p, lw02.q, lw02.r, lw02.o);
        }
    }

    private void s() throws g60 {
        long l10;
        wz wz3;
        Object object = this.t.e();
        if (object == null) {
            return;
        }
        long l11 = object.d ? object.a.readDiscontinuity() : -9223372036854775807L;
        if (l11 != -9223372036854775807L) {
            this.b(l11);
            if (l11 != this.y.r) {
                object = this.y;
                this.y = this.a(object.b, l11, object.c, l11, true, 5);
            }
        } else {
            wz3 = this.p;
            boolean bl2 = object != this.t.f();
            this.M = l11 = wz3.a(bl2);
            long l13 = object.c(l11);
            l10 = this.y.r;
            if (!this.q.isEmpty() && !this.y.b.a()) {
                l11 = l10;
                if (this.O) {
                    l11 = l10 - 1L;
                    this.O = false;
                }
                object = this.y;
                int n10 = object.a.a(object.b.a);
                int n13 = Math.min(this.N, this.q.size());
                object = n13 > 0 ? this.q.get(n13 - 1) : null;
                while (object != null && (n10 < 0 || n10 == 0 && 0L > l11)) {
                    int n14 = n13 - 1;
                    object = n14 > 0 ? this.q.get(n13 - 2) : null;
                    n13 = n14;
                }
                if (n13 < this.q.size()) {
                    object = this.q.get(n13);
                }
                this.N = n13;
            }
            this.y.r = l13;
        }
        object = this.t.d();
        wz3 = this.y;
        if (!object.d) {
            l11 = object.f.b;
        } else {
            l11 = object.e ? object.a.getBufferedPositionUs() : Long.MIN_VALUE;
            if (l11 == Long.MIN_VALUE) {
                l11 = object.f.e;
            }
        }
        ((zh1)wz3).p = l11;
        object = this.y;
        object.q = this.a(object.p);
        object = this.y;
        if (object.l && object.e == 3 && this.a(object.a, object.b)) {
            float f11;
            wz3 = this.y;
            if (((zh1)wz3).n.b == 1.0f && this.p.getPlaybackParameters().b != (f11 = ((tz)(object = this.v)).a(l10 = this.a(((zh1)wz3).a, ((zh1)wz3).b.a, ((zh1)wz3).r), l11 = this.a(this.y.p)))) {
                this.p.a(new bi1(f11, this.y.n.c));
                this.a(this.y.n, this.p.getPlaybackParameters().b, false, false);
            }
        }
    }

    public final void a() {
        this.i.a(10);
    }

    public final void a(int n10, long l10, ky1 ky12, ArrayList arrayList) {
        this.i.a(17, (Object)new /* Unavailable Anonymous Inner Class!! */).a();
    }

    public final void a(bi1 bi12) {
        this.i.a(16, (Object)bi12).a();
    }

    @Override
    public final void a(kw0 kw02) {
        this.i.a(8, (Object)kw02).a();
    }

    public final void a(mx1 mx12) {
        mx12 = (kw0)mx12;
        this.i.a(9, (Object)mx12).a();
    }

    public final void a(boolean bl2, int n10) {
        this.i.a(bl2 ? 1 : 0, n10).a();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(ni1 ni12) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    if (!this.A && this.j.isAlive()) {
                        this.i.a(14, (Object)ni12).a();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                zs0.d((String)"ExoPlayerImplInternal", (String)"Ignoring messages sent after release.");
                ni12.a(false);
                return;
            }
            throw throwable2;
        }
    }

    public final Looper d() {
        return this.k;
    }

    public final void h() {
        this.i.a(22);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean handleMessage(Message object) {
        Object object2;
        boolean bl2;
        int n10;
        int n13;
        block47: {
            Object object3;
            n13 = 1000;
            n10 = 0;
            try {
                switch (((Message)object).what) {
                    default: {
                        return false;
                    }
                    case 25: {
                        this.b(true);
                        break;
                    }
                    case 24: {
                        bl2 = ((Message)object).arg1 == 1;
                        this.c(bl2);
                        break;
                    }
                    case 23: {
                        bl2 = ((Message)object).arg1 != 0;
                        this.d(bl2);
                        break;
                    }
                    case 22: {
                        this.g();
                        break;
                    }
                    case 21: {
                        this.a((ky1)((Message)object).obj);
                        break;
                    }
                    case 20: {
                        this.a(((Message)object).arg1, ((Message)object).arg2, (ky1)((Message)object).obj);
                        break;
                    }
                    case 19: {
                        this.a(((Message)object).obj);
                        break;
                    }
                    case 18: {
                        this.a(((Message)object).obj, ((Message)object).arg1);
                        break;
                    }
                    case 17: {
                        this.a(((Message)object).obj);
                        break;
                    }
                    case 16: {
                        object = (bi1)((Message)object).obj;
                        this.a((bi1)object, ((bi1)object).b, true, false);
                        break;
                    }
                    case 15: {
                        this.d((ni1)((Message)object).obj);
                        break;
                    }
                    case 14: {
                        object = (ni1)((Message)object).obj;
                        object.getClass();
                        if (object.a() == this.k) {
                            n60.a((ni1)object);
                            int n14 = this.y.e;
                            if (n14 != 3 && n14 != 2) break;
                            this.i.a(2);
                            break;
                        }
                        this.i.a(15, object).a();
                        break;
                    }
                    case 13: {
                        bl2 = ((Message)object).arg1 != 0;
                        this.a(bl2, (AtomicBoolean)((Message)object).obj);
                        break;
                    }
                    case 12: {
                        bl2 = ((Message)object).arg1 != 0;
                        this.e(bl2);
                        break;
                    }
                    case 11: {
                        this.a(((Message)object).arg1);
                        break;
                    }
                    case 10: {
                        this.m();
                        break;
                    }
                    case 9: {
                        this.b((kw0)((Message)object).obj);
                        break;
                    }
                    case 8: {
                        this.c((kw0)((Message)object).obj);
                        break;
                    }
                    case 7: {
                        this.l();
                        return true;
                    }
                    case 6: {
                        this.a(false, true);
                        break;
                    }
                    case 5: {
                        this.x = (fx1)((Message)object).obj;
                        break;
                    }
                    case 4: {
                        this.b((bi1)((Message)object).obj);
                        break;
                    }
                    case 3: {
                        this.a(((Message)object).obj);
                        break;
                    }
                    case 2: {
                        this.b();
                        break;
                    }
                    case 1: {
                        bl2 = ((Message)object).arg1 != 0;
                        this.a(bl2, ((Message)object).arg2, true, 1);
                        break;
                    }
                    case 0: {
                        this.j();
                        break;
                    }
                }
                break block47;
            }
        // Removed invalid catch block
            object = g60.a(runtimeException2, n13);
            zs0.a((String)"ExoPlayerImplInternal", (String)"Playback error", (Throwable)object);
            this.a(true, false);
            this.y = this.y.a((g60)object);
            break block47;
        // Removed invalid catch block
            break block47;
        // Removed invalid catch block
            break block47;
        // Removed invalid catch block
            if (n15 == 1) {
                n13 = fg122.b ? 3001 : 3003;
            } else if (n15 == 4) {
                n13 = fg122.b ? 3002 : 3004;
            }
            this.a((IOException)((Object)fg122), n13);
            break block47;
        // Removed invalid catch block
            break block47;
        // Removed invalid catch block
            if (g6022.d == 1) {
                object3 = this.t.f();
                object = g6022;
                if (object3 != null) {
                    object = g6022.a(((lw0)object3).f.a);
                }
            }
            if (((g60)object).j && this.P == null) {
                zs0.b((String)"ExoPlayerImplInternal", (String)"Recoverable renderer error", (Throwable)object);
                this.P = object;
                object2 = this.i;
                object2.a(object2.a(25, object));
            } else {
                object3 = this.P;
                object2 = object;
                if (object3 != null) {
                    ((Throwable)object3).addSuppressed((Throwable)object);
                    object2 = this.P;
                }
                zs0.a((String)"ExoPlayerImplInternal", (String)"Playback error", (Throwable)object2);
                this.a(true, false);
                this.y = this.y.a((g60)object2);
            }
        }
        object = this.z;
        object2 = this.y;
        bl2 = com.yandex.mobile.ads.impl.n60$d.a(object);
        n13 = n10;
        if (object.b != object2) {
            n13 = 1;
        }
        com.yandex.mobile.ads.impl.n60$d.b(object, (boolean)(bl2 |= n13));
        object.b = object2;
        if (bl2) {
            this.s.a(object);
            this.z = new /* Unavailable Anonymous Inner Class!! */;
        }
        return true;
    }

    public final void i() {
        this.i.b(0).a();
    }

    public final boolean k() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    if (!this.A && this.j.isAlive()) {
                        this.i.a(7);
                        y03 y032 = new y03(this);
                        this.a(y032, this.w);
                        boolean bl2 = this.A;
                        return bl2;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return true;
            }
            throw throwable2;
        }
    }

    public final void p() {
        this.i.b(6).a();
    }
}

