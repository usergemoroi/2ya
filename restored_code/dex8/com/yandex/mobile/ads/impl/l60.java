/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.media.AudioTrack
 *  android.media.MediaFormat
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Pair
 *  android.view.Surface
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 *  android.view.TextureView
 *  android.view.TextureView$SurfaceTextureListener
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.a70
 *  com.yandex.mobile.ads.impl.az2
 *  com.yandex.mobile.ads.impl.bf0
 *  com.yandex.mobile.ads.impl.d32
 *  com.yandex.mobile.ads.impl.d32$a
 *  com.yandex.mobile.ads.impl.df2
 *  com.yandex.mobile.ads.impl.ep1
 *  com.yandex.mobile.ads.impl.fh
 *  com.yandex.mobile.ads.impl.fh$b
 *  com.yandex.mobile.ads.impl.fi
 *  com.yandex.mobile.ads.impl.fp1
 *  com.yandex.mobile.ads.impl.fx1
 *  com.yandex.mobile.ads.impl.gg2
 *  com.yandex.mobile.ads.impl.h60$a
 *  com.yandex.mobile.ads.impl.h60$b
 *  com.yandex.mobile.ads.impl.hi1
 *  com.yandex.mobile.ads.impl.hi1$b
 *  com.yandex.mobile.ads.impl.hn
 *  com.yandex.mobile.ads.impl.hy
 *  com.yandex.mobile.ads.impl.ih
 *  com.yandex.mobile.ads.impl.ih$b
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.kh
 *  com.yandex.mobile.ads.impl.ky1
 *  com.yandex.mobile.ads.impl.l60$a
 *  com.yandex.mobile.ads.impl.l62
 *  com.yandex.mobile.ads.impl.ly
 *  com.yandex.mobile.ads.impl.m62
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mi1
 *  com.yandex.mobile.ads.impl.mw0
 *  com.yandex.mobile.ads.impl.n60$d
 *  com.yandex.mobile.ads.impl.ni1
 *  com.yandex.mobile.ads.impl.ni1$a
 *  com.yandex.mobile.ads.impl.ni1$b
 *  com.yandex.mobile.ads.impl.o01
 *  com.yandex.mobile.ads.impl.o60
 *  com.yandex.mobile.ads.impl.oi0
 *  com.yandex.mobile.ads.impl.qw0$a
 *  com.yandex.mobile.ads.impl.s12
 *  com.yandex.mobile.ads.impl.s12$b
 *  com.yandex.mobile.ads.impl.sw0
 *  com.yandex.mobile.ads.impl.tj2
 *  com.yandex.mobile.ads.impl.ub0
 *  com.yandex.mobile.ads.impl.uf
 *  com.yandex.mobile.ads.impl.uz2
 *  com.yandex.mobile.ads.impl.vk2
 *  com.yandex.mobile.ads.impl.vr0
 *  com.yandex.mobile.ads.impl.vr0$a
 *  com.yandex.mobile.ads.impl.vr0$b
 *  com.yandex.mobile.ads.impl.vz2
 *  com.yandex.mobile.ads.impl.w42
 *  com.yandex.mobile.ads.impl.wq
 *  com.yandex.mobile.ads.impl.xo
 *  com.yandex.mobile.ads.impl.xr0
 *  com.yandex.mobile.ads.impl.zh1
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.a10;
import com.yandex.mobile.ads.impl.a70;
import com.yandex.mobile.ads.impl.az2;
import com.yandex.mobile.ads.impl.b42;
import com.yandex.mobile.ads.impl.b70;
import com.yandex.mobile.ads.impl.bf0;
import com.yandex.mobile.ads.impl.bk;
import com.yandex.mobile.ads.impl.bz2;
import com.yandex.mobile.ads.impl.c62;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.cp1;
import com.yandex.mobile.ads.impl.cz2;
import com.yandex.mobile.ads.impl.d32;
import com.yandex.mobile.ads.impl.df2;
import com.yandex.mobile.ads.impl.dz2;
import com.yandex.mobile.ads.impl.eh;
import com.yandex.mobile.ads.impl.ep1;
import com.yandex.mobile.ads.impl.ew0;
import com.yandex.mobile.ads.impl.ez2;
import com.yandex.mobile.ads.impl.fh;
import com.yandex.mobile.ads.impl.fi;
import com.yandex.mobile.ads.impl.fp1;
import com.yandex.mobile.ads.impl.fx1;
import com.yandex.mobile.ads.impl.fz2;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.gg2;
import com.yandex.mobile.ads.impl.gz2;
import com.yandex.mobile.ads.impl.h60;
import com.yandex.mobile.ads.impl.hi1;
import com.yandex.mobile.ads.impl.hn;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.hy;
import com.yandex.mobile.ads.impl.hz2;
import com.yandex.mobile.ads.impl.i72;
import com.yandex.mobile.ads.impl.ih;
import com.yandex.mobile.ads.impl.ij1;
import com.yandex.mobile.ads.impl.iz2;
import com.yandex.mobile.ads.impl.jz2;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.kh;
import com.yandex.mobile.ads.impl.km1;
import com.yandex.mobile.ads.impl.ky1;
import com.yandex.mobile.ads.impl.kz2;
import com.yandex.mobile.ads.impl.l52;
import com.yandex.mobile.ads.impl.l60;
import com.yandex.mobile.ads.impl.l62;
import com.yandex.mobile.ads.impl.ly;
import com.yandex.mobile.ads.impl.lz2;
import com.yandex.mobile.ads.impl.m62;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mi1;
import com.yandex.mobile.ads.impl.mw0;
import com.yandex.mobile.ads.impl.mz2;
import com.yandex.mobile.ads.impl.n60;
import com.yandex.mobile.ads.impl.ng2;
import com.yandex.mobile.ads.impl.ni1;
import com.yandex.mobile.ads.impl.nz2;
import com.yandex.mobile.ads.impl.o01;
import com.yandex.mobile.ads.impl.o60;
import com.yandex.mobile.ads.impl.oi0;
import com.yandex.mobile.ads.impl.oz2;
import com.yandex.mobile.ads.impl.pz2;
import com.yandex.mobile.ads.impl.qw0;
import com.yandex.mobile.ads.impl.qy2;
import com.yandex.mobile.ads.impl.qz2;
import com.yandex.mobile.ads.impl.ry2;
import com.yandex.mobile.ads.impl.rz2;
import com.yandex.mobile.ads.impl.s12;
import com.yandex.mobile.ads.impl.sw0;
import com.yandex.mobile.ads.impl.sy2;
import com.yandex.mobile.ads.impl.sz2;
import com.yandex.mobile.ads.impl.tj2;
import com.yandex.mobile.ads.impl.tw0;
import com.yandex.mobile.ads.impl.ty2;
import com.yandex.mobile.ads.impl.tz2;
import com.yandex.mobile.ads.impl.ub0;
import com.yandex.mobile.ads.impl.uf;
import com.yandex.mobile.ads.impl.uy2;
import com.yandex.mobile.ads.impl.uz2;
import com.yandex.mobile.ads.impl.vk2;
import com.yandex.mobile.ads.impl.vr0;
import com.yandex.mobile.ads.impl.vy2;
import com.yandex.mobile.ads.impl.vz2;
import com.yandex.mobile.ads.impl.w42;
import com.yandex.mobile.ads.impl.wq;
import com.yandex.mobile.ads.impl.wu;
import com.yandex.mobile.ads.impl.wy2;
import com.yandex.mobile.ads.impl.xc;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.xo;
import com.yandex.mobile.ads.impl.xr0;
import com.yandex.mobile.ads.impl.xy2;
import com.yandex.mobile.ads.impl.yu;
import com.yandex.mobile.ads.impl.yy2;
import com.yandex.mobile.ads.impl.zh1;
import com.yandex.mobile.ads.impl.zs0;
import com.yandex.mobile.ads.impl.zy2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/*
 * Exception performing whole class analysis ignored.
 */
final class l60
extends bk
implements h60 {
    private int A;
    private int B;
    private boolean C;
    private int D;
    private ky1 E;
    private hi1.a F;
    private hw0 G;
    @Nullable
    private AudioTrack H;
    @Nullable
    private Object I;
    @Nullable
    private Surface J;
    @Nullable
    private TextureView K;
    private int L;
    private int M;
    private int N;
    private int O;
    private eh P;
    private float Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private a10 U;
    private hw0 V;
    private zh1 W;
    private int X;
    private long Y;
    final m62 b;
    final hi1.a c;
    private final wq d;
    private final hi1 e;
    private final cp1[] f;
    private final l62 g;
    private final bf0 h;
    private final n60 i;
    private final vr0<hi1.b> j;
    private final CopyOnWriteArraySet<h60.a> k;
    private final l52.b l;
    private final ArrayList m;
    private final boolean n;
    private final qw0.a o;
    private final xc p;
    private final Looper q;
    private final fi r;
    private final b42 s;
    private final b t;
    private final fh u;
    private final ih v;
    private final d32 w;
    private final tj2 x;
    private final vk2 y;
    private final long z;

    static {
        o60.a((String)"goog.exo.exoplayer");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"HandlerLeak"})
    public l60(h60.b b10) {
        Throwable throwable2;
        block2: {
            n60 n602;
            int n10;
            Object object;
            xy2 xy22;
            b42 b422;
            Looper looper;
            fx1 fx12;
            fi fi3;
            l62 l622;
            cp1[] cp1Array;
            Handler handler;
            c c11;
            b b11;
            eh eh3;
            xc xc2;
            Context context;
            Object object2;
            wq wq3;
            this.d = wq3 = new wq();
            try {
                object2 = new StringBuilder("Init ");
                ((StringBuilder)object2).append(Integer.toHexString(System.identityHashCode(this)));
                ((StringBuilder)object2).append(" [ExoPlayerLib/2.18.1] [");
                ((StringBuilder)object2).append(m92.e);
                ((StringBuilder)object2).append("]");
                zs0.c((String)"ExoPlayerImpl", (String)((StringBuilder)object2).toString());
                context = b10.a.getApplicationContext();
                this.p = xc2 = (xc)b10.h.apply((Object)b10.b);
                this.P = eh3 = b10.j;
                this.L = b10.k;
                this.R = false;
                this.z = b10.p;
                this.t = b11 = new b(this, null);
                c11 = new c(null);
                handler = new Handler(b10.i);
                cp1Array = ((fp1)b10.c.get()).a(handler, (gg2)b11, (kh)b11, (w42)b11, (o01)b11);
                this.f = cp1Array;
                boolean bl2 = cp1Array.length > 0;
                uf.b((boolean)bl2);
                this.g = l622 = (l62)b10.e.get();
                this.o = (qw0.a)b10.d.get();
                this.r = fi3 = (fi)b10.g.get();
                this.n = b10.l;
                fx12 = b10.m;
                this.q = looper = b10.i;
                this.s = b422 = b10.b;
                this.e = this;
                xy22 = new xy2(this);
                super(looper, (xo)b422, (vr0.b)xy22);
                this.j = object2;
                super();
                this.k = object2;
                super();
                this.m = object2;
                object2 = new ky1.a();
                this.E = object2;
                super(new ep1[cp1Array.length], new b70[cp1Array.length], i72.c, null);
                this.b = xy22;
                this.l = object2 = new l52.b();
                object2 = new /* Unavailable Anonymous Inner Class!! */;
                object = object2.a(new int[]{1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28}).a(l622.c(), 29).a();
                this.c = object;
                object2 = new /* Unavailable Anonymous Inner Class!! */;
                this.F = object2.a((hi1.a)object).a(4).a(10).a();
                this.h = b422.a(looper, null);
                object = new yy2(this);
                this.W = zh1.a((m62)xy22);
                xc2.a(this, looper);
                n10 = m92.a;
                object2 = n10 < 31 ? new mi1() : com.yandex.mobile.ads.impl.l60$a.a((Context)context, (l60)this, (boolean)b10.q);
            }
        // Removed invalid catch block
            }
            this.i = n602 = new n60(cp1Array, l622, (m62)xy22, (xr0)b10.f.get(), fi3, 0, xc2, fx12, b10.n, b10.o, looper, b422, object, (mi1)object2);
            this.Q = 1.0f;
            this.G = object2 = hw0.H;
            this.V = object2;
            this.X = -1;
            this.O = n10 < 21 ? this.f() : m92.a((Context)context);
            n10 = yu.b;
            this.S = true;
            this.b(xc2);
            object2 = new Handler(looper);
            fi3.a((Handler)object2, xc2);
            this.a(b11);
            object2 = new fh(b10.a, handler, (fh.b)b11);
            this.u = object2;
            object2.a();
            object2 = new ih(b10.a, handler, (ih.b)b11);
            this.v = object2;
            object2.d();
            object2 = new d32(b10.a, handler, (d32.a)b11);
            this.w = object2;
            object2.a(m92.c((int)eh3.d));
            super(b10.a);
            this.x = eh3;
            eh3.a();
            super(b10.a);
            this.y = eh3;
            eh3.a();
            this.U = l60.a((d32)object2);
            n10 = ng2.f;
            l622.a(this.P);
            this.a(1, 10, (Object)this.O);
            this.a(2, 10, (Object)this.O);
            this.a(1, 3, this.P);
            this.a(2, 4, (Object)this.L);
            this.a(2, 5, (Object)0);
            this.a(1, 9, (Object)this.R);
            this.a(2, 7, c11);
            this.a(6, 8, c11);
            wq3.e();
            return;
        }
        this.d.e();
        throw throwable2;
    }

    public static /* synthetic */ void A(zh1 zh12, int n10, hi1.b b10) {
        l60.b(zh12, n10, b10);
    }

    public static /* synthetic */ void B(l60 l602, n60.d d14) {
        l602.b(d14);
    }

    public static /* synthetic */ void C(zh1 zh12, hi1.b b10) {
        l60.d(zh12, b10);
    }

    public static /* synthetic */ void D(zh1 zh12, int n10, hi1.b b10) {
        l60.a(zh12, n10, b10);
    }

    private long a(zh1 zh12) {
        if (zh12.a.c()) {
            return m92.a((long)this.Y);
        }
        if (zh12.b.a()) {
            return zh12.r;
        }
        l52 l522 = zh12.a;
        qw0.b b10 = zh12.b;
        long l10 = zh12.r;
        l522.a(b10.a, this.l);
        return l10 + this.l.f;
    }

    @Nullable
    private Pair<Object, Long> a(l52 l522, int n10, long l10) {
        int n13;
        block3: {
            block2: {
                if (l522.c()) {
                    this.X = n10;
                    long l11 = l10;
                    if (l10 == -9223372036854775807L) {
                        l11 = 0L;
                    }
                    this.Y = l11;
                    return null;
                }
                if (n10 == -1) break block2;
                n13 = n10;
                if (n10 < l522.b()) break block3;
            }
            n13 = l522.a(false);
            l10 = m92.b((long)l522.a((int)n13, (l52.d)this.a, (long)0L).n);
        }
        return l522.a(this.a, this.l, n13, m92.a((long)l10));
    }

    private static a10 a(d32 d322) {
        return new a10(0, d322.b(), d322.a());
    }

    private zh1 a(zh1 object, l52 l522, @Nullable Pair<Object, Long> object2) {
        block15: {
            block13: {
                long l10;
                qw0.b b10;
                int n10;
                zh1 zh12;
                block10: {
                    block14: {
                        long l11;
                        long l13;
                        block11: {
                            block12: {
                                long l14;
                                if (!l522.c() && object2 == null) {
                                    throw new IllegalArgumentException();
                                }
                                l52 l523 = ((zh1)object).a;
                                zh12 = object.a(l522);
                                if (l522.c()) {
                                    object = zh1.a();
                                    long l15 = m92.a((long)this.Y);
                                    object = zh12.a((qw0.b)((Object)object), l15, l15, l15, 0L, c62.e, this.b, xj0.h()).a((qw0.b)((Object)object));
                                    ((zh1)object).p = ((zh1)object).r;
                                    return object;
                                }
                                object = zh12.b.a;
                                n10 = m92.a;
                                n10 = object.equals(object2.first) ^ 1;
                                b10 = n10 != 0 ? new qw0.b(object2.first) : zh12.b;
                                l10 = (Long)object2.second;
                                l11 = l13 = m92.a((long)this.getContentPosition());
                                if (!l523.c()) {
                                    l11 = l13 - l523.a((Object)object, (l52.b)this.l).f;
                                }
                                if (n10 != 0 || (l14 = l10 == l11 ? 0 : (l10 < l11 ? -1 : 1)) < 0) break block10;
                                if (l14 != false) break block11;
                                n10 = l522.a(zh12.k.a);
                                if (n10 == -1) break block12;
                                object = zh12;
                                if (l522.a((int)n10, (l52.b)this.l, (boolean)false).d == l522.a((Object)b10.a, (l52.b)this.l).d) break block13;
                            }
                            l522.a(b10.a, this.l);
                            l11 = b10.a() ? this.l.a(b10.b, b10.c) : this.l.e;
                            object = zh12.a(b10, zh12.r, zh12.r, zh12.d, l11 - zh12.r, zh12.h, zh12.i, zh12.j).a(b10);
                            ((zh1)object).p = l11;
                            break block13;
                        }
                        if (!(b10.a() ^ true)) break block14;
                        l13 = Math.max(0L, zh12.q - (l10 - l11));
                        l11 = zh12.p;
                        if (zh12.k.equals((Object)zh12.b)) {
                            l11 = l10 + l13;
                        }
                        object = zh12.a(b10, l10, l10, l10, l13, zh12.h, zh12.i, zh12.j);
                        ((zh1)object).p = l11;
                        break block13;
                    }
                    throw new IllegalStateException();
                }
                if (!(b10.a() ^ true)) break block15;
                object = n10 != 0 ? c62.e : zh12.h;
                l522 = n10 != 0 ? this.b : zh12.i;
                object2 = n10 != 0 ? xj0.h() : zh12.j;
                object = zh12.a(b10, l10, l10, l10, 0L, (c62)object, (m62)l522, object2).a(b10);
                ((zh1)object).p = l10;
            }
            return object;
        }
        throw new IllegalStateException();
    }

    private static /* synthetic */ void a(float f11, hi1.b b10) {
        b10.onVolumeChanged(f11);
    }

    private void a(int n10, int n13) {
        if (n10 != this.M || n13 != this.N) {
            this.M = n10;
            this.N = n13;
            vr0<hi1.b> vr02 = this.j;
            vr02.a(24, (vr0.a)new cz2(n10, n13));
            vr02.a();
        }
    }

    private static /* synthetic */ void a(int n10, int n13, hi1.b b10) {
        b10.onSurfaceSizeChanged(n10, n13);
    }

    private void a(int n10, int n13, @Nullable Object object) {
        for (cp1 cp12 : this.f) {
            if (cp12.m() != n10) continue;
            int n14 = this.c();
            n60 n602 = this.i;
            l52 l522 = this.W.a;
            if (n14 == -1) {
                n14 = 0;
            }
            new ni1((ni1.a)n602, (ni1.b)cp12, l522, n14, (xo)this.s, n602.d()).a(n13).a(object).e();
        }
    }

    private void a(int n10, int n13, boolean bl2) {
        int n14 = 0;
        bl2 = bl2 && n10 != -1;
        int n15 = n14;
        if (bl2) {
            n15 = n14;
            if (n10 != 1) {
                n15 = 1;
            }
        }
        zh1 zh12 = this.W;
        if (zh12.l == bl2 && zh12.m == n15) {
            return;
        }
        ++this.A;
        zh12 = new zh1(zh12.a, zh12.b, zh12.c, zh12.d, zh12.e, zh12.f, zh12.g, zh12.h, zh12.i, zh12.j, zh12.k, bl2, n15, zh12.n, zh12.p, zh12.q, zh12.r, zh12.o);
        this.i.a(bl2, n15);
        this.a(zh12, 0, n13, false, 5, -9223372036854775807L);
    }

    private static /* synthetic */ void a(int n10, hi1.c c11, hi1.c c13, hi1.b b10) {
        b10.getClass();
        b10.a(c11, c13, n10);
    }

    private void a(SurfaceTexture surfaceTexture) {
        surfaceTexture = new Surface(surfaceTexture);
        this.a((Surface)surfaceTexture);
        this.J = surfaceTexture;
    }

    private void a(@Nullable Surface surface) {
        Object object;
        int n10;
        int n13;
        Object object2 = new ArrayList();
        cp1[] cp1Array = this.f;
        int n14 = cp1Array.length;
        int n15 = 0;
        int n16 = 0;
        for (n13 = 0; n13 < n14; ++n13) {
            cp1 cp12 = cp1Array[n13];
            if (cp12.m() != 2) continue;
            n10 = this.c();
            object = this.i;
            l52 l522 = this.W.a;
            if (n10 == -1) {
                n10 = 0;
            }
            ((ArrayList)object2).add(new ni1((ni1.a)object, (ni1.b)cp12, l522, n10, (xo)this.s, ((n60)object).d()).a(1).a((Object)surface).e());
        }
        object = this.I;
        n10 = n15;
        if (object != null) {
            n10 = n15;
            if (object != surface) {
                block12: {
                    try {
                        object2 = ((ArrayList)object2).iterator();
                    }
                    catch (TimeoutException timeoutException) {
                        n13 = 1;
                        break block12;
                    }
                    catch (InterruptedException interruptedException) {
                        Thread.currentThread().interrupt();
                        n13 = n16;
                    }
                    while (true) {
                        n13 = n16;
                        if (object2.hasNext()) {
                            ((ni1)object2.next()).a(this.z);
                            continue;
                        }
                        break;
                    }
                }
                object = this.I;
                object2 = this.J;
                n10 = n13;
                if (object == object2) {
                    object2.release();
                    this.J = null;
                    n10 = n13;
                }
            }
        }
        this.I = surface;
        if (n10 != 0) {
            this.a(g60.a((RuntimeException)new a70(3), 1003));
        }
    }

    private static /* synthetic */ void a(ew0 ew02, int n10, hi1.b b10) {
        b10.a(ew02, n10);
    }

    private void a(@Nullable g60 g602) {
        zh1 zh12;
        zh1 zh13 = this.W;
        zh13 = zh13.a(zh13.b);
        zh13.p = zh13.r;
        zh13.q = 0L;
        boolean bl2 = true;
        zh13 = zh12 = zh13.a(1);
        if (g602 != null) {
            zh13 = zh12.a(g602);
        }
        ++this.A;
        this.i.p();
        if (!zh13.a.c() || this.W.a.c()) {
            bl2 = false;
        }
        this.a(zh13, 0, 1, bl2, 4, this.a(zh13));
    }

    private /* synthetic */ void a(hi1.b b10, ub0 ub02) {
        b10.getClass();
    }

    private static /* synthetic */ void a(hw0 hw02, hi1.b b10) {
        b10.a(hw02);
    }

    private void a(n60.d d14) {
        int n10;
        this.A = n10 = this.A - d14.c;
        boolean bl2 = d14.d;
        boolean bl3 = true;
        if (bl2) {
            this.B = d14.e;
            this.C = true;
        }
        if (d14.f) {
            this.D = d14.g;
        }
        if (n10 == 0) {
            Object object;
            l52 l522 = d14.b.a;
            if (!this.W.a.c() && l522.c()) {
                this.X = -1;
                this.Y = 0L;
            }
            if (!l522.c()) {
                object = ((ij1)l522).d();
                if (object.size() == this.m.size()) {
                    for (n10 = 0; n10 < object.size(); ++n10) {
                        com.yandex.mobile.ads.impl.l60$d.a((d)this.m.get(n10), object.get(n10));
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            bl2 = this.C;
            long l10 = -9223372036854775807L;
            if (bl2) {
                bl2 = bl3;
                if (d14.b.b.equals((Object)this.W.b)) {
                    bl2 = d14.b.d != this.W.r ? bl3 : false;
                }
                if (bl2) {
                    if (!l522.c() && !d14.b.b.a()) {
                        zh1 zh12 = d14.b;
                        object = zh12.b;
                        l10 = zh12.d;
                        l522.a(((mw0)object).a, this.l);
                        l10 += this.l.f;
                    } else {
                        l10 = d14.b.d;
                    }
                }
            } else {
                bl2 = false;
            }
            this.C = false;
            this.a(d14.b, 1, this.D, bl2, this.B, l10);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void a(zh1 var1_1, int var2_2, int var3_3, boolean var4_4, int var5_5, long var6_6) {
        block48: {
            block47: {
                block46: {
                    block42: {
                        block45: {
                            block44: {
                                block43: {
                                    block41: {
                                        var24_7 = this.W;
                                        this.W = var1_1;
                                        var18_8 = var24_7.a.equals(var1_1.a);
                                        var22_9 = var24_7.a;
                                        var20_10 = var1_1.a;
                                        var19_11 = var20_10.c();
                                        var21_12 = -1;
                                        if (!var19_11 || !var22_9.c()) break block41;
                                        var20_10 = new Pair((Object)Boolean.FALSE, var21_12);
                                        break block42;
                                    }
                                    if (var20_10.c() == var22_9.c()) break block43;
                                    var20_10 = new Pair((Object)Boolean.TRUE, (Object)3);
                                    break block42;
                                }
                                if (var22_9.a((int)var22_9.a((Object)var24_7.b.a, (l52.b)this.l).d, (l52.d)this.a, (long)0L).b.equals(var20_10.a((int)var20_10.a((Object)var1_1.b.a, (l52.b)this.l).d, (l52.d)this.a, (long)0L).b)) ** GOTO lbl30
                                if (!var4_4 || var5_5 != 0) break block44;
                                var8_13 = 1;

                            }
                            if (!var4_4 || var5_5 != 1) break block45;
                            var8_13 = 2;

                        }
                        if (var18_8 ^ true) {
                            var8_13 = 3;
lbl27:

                            var20_10 = new Pair((Object)Boolean.TRUE, (Object)var8_13);
                        } else {
                            throw new IllegalStateException();
lbl30:

                            var20_10 = var4_4 != false && var5_5 == 0 && var24_7.b.d < var1_1.b.d ? new Pair((Object)Boolean.TRUE, (Object)0) : new Pair((Object)Boolean.FALSE, var21_12);
                        }
                    }
                    var18_8 = (Boolean)var20_10.first;
                    var12_14 = (Integer)var20_10.second;
                    var22_9 = this.G;
                    if (var18_8) {
                        if (!var1_1.a.c()) {
                            var8_13 = var1_1.a.a((Object)var1_1.b.a, (l52.b)this.l).d;
                            var20_10 = var1_1.a.a((int)var8_13, (l52.d)this.a, (long)0L).d;
                        } else {
                            var20_10 = null;
                        }
                        this.V = hw0.H;
                        var21_12 = var20_10;
                    } else {
                        var21_12 = null;
                    }
                    if (var18_8) break block46;
                    var20_10 = var22_9;
                    if (var24_7.j.equals(var1_1.j)) break block47;
                }
                var22_9 = this.V.a();
                var20_10 = var1_1.j;
                for (var8_13 = 0; var8_13 < var20_10.size(); ++var8_13) {
                    var23_16 /* !! */  = (k01)var20_10.get(var8_13);
                    for (var9_15 = 0; var9_15 < var23_16 /* !! */ .c(); ++var9_15) {
                        var23_16 /* !! */ .a(var9_15).a(var22_9);
                    }
                }
                this.V = var22_9.a();
                this.j();
                var20_10 = this.W.a;
                if (var20_10.c()) {
                    var20_10 = this.V;
                } else {
                    var20_10 = var20_10.a((int)this.getCurrentMediaItemIndex(), (l52.d)this.a, (long)0L).d;
                    var20_10 = this.V.a().a(var20_10.e).a();
                }
            }
            var13_17 = var20_10.equals(this.G) ^ true;
            this.G = var20_10;
            var8_13 = var24_7.l != var1_1.l ? 1 : 0;
            var9_15 = var24_7.e != var1_1.e ? 1 : 0;
            if (var9_15 != 0 || var8_13 != 0) {
                this.i();
            }
            var10_18 = var24_7.g != var1_1.g;
            if (!var24_7.a.equals(var1_1.a)) {
                this.j.a(0, (vr0.a)new qy2((zh1)var1_1, var2_2));
            }
            if (!var4_4) break block48;
            var25_19 /* !! */  = new l52.b();
            if (!var24_7.a.c()) {
                var20_10 = var24_7.b.a;
                var24_7.a.a(var20_10, var25_19 /* !! */ );
                var11_20 = var25_19 /* !! */ .d;
                var2_2 = var24_7.a.a(var20_10);
                var22_9 = var24_7.a.a((int)var11_20, (l52.d)this.a, (long)0L).b;
                var23_16 /* !! */  = this.a.d;
            } else {
                var22_9 = null;
                var11_20 = -1;
                var23_16 /* !! */  = null;
                var20_10 = null;
                var2_2 = -1;
            }
            if (var5_5 != 0) ** GOTO lbl107
            if (var24_7.b.a()) {
                var26_21 = var24_7.b;
                var14_22 = var25_19 /* !! */ .a(var26_21.b, var26_21.c);
                var16_23 = l60.b(var24_7);
            } else if (var24_7.b.e != -1) {
                var14_22 = l60.b(this.W);
lbl99:

                while (true) {
                    var16_23 = var14_22;
                    break;
                }
            } else {
                var16_23 = var25_19 /* !! */ .f;
                var14_22 = var25_19 /* !! */ .e;
lbl104:

                while (true) {
                    var14_22 = var16_23 + var14_22;

                    break;
                }
lbl107:

                if (var24_7.b.a()) {
                    var14_22 = var24_7.r;
                    var16_23 = l60.b(var24_7);
                } else {
                    var16_23 = var25_19 /* !! */ .f;
                    var14_22 = var24_7.r;

                }
            }
            var14_22 = m92.b((long)var14_22);
            var16_23 = m92.b((long)var16_23);
            var25_19 /* !! */  = var24_7.b;
            var25_19 /* !! */  = new hi1.c(var22_9, var11_20, (ew0)var23_16 /* !! */ , var20_10, var2_2, var14_22, var16_23, var25_19 /* !! */ .b, var25_19 /* !! */ .c);
            var11_20 = this.getCurrentMediaItemIndex();
            if (!this.W.a.c()) {
                var20_10 = this.W;
                var23_16 /* !! */  = var20_10.b.a;
                var20_10.a.a(var23_16 /* !! */ , this.l);
                var2_2 = this.W.a.a(var23_16 /* !! */ );
                var22_9 = this.W.a.a((int)var11_20, (l52.d)this.a, (long)0L).b;
                var20_10 = this.a.d;
            } else {
                var22_9 = null;
                var20_10 = null;
                var23_16 /* !! */  = null;
                var2_2 = -1;
            }
            var14_22 = m92.b((long)var6_6);
            var6_6 = this.W.b.a() != false ? m92.b((long)l60.b(this.W)) : var14_22;
            var26_21 = this.W.b;
            var20_10 = new hi1.c(var22_9, var11_20, (ew0)var20_10, var23_16 /* !! */ , var2_2, var14_22, var6_6, var26_21.b, var26_21.c);
            this.j.a(11, (vr0.a)new gz2(var5_5, (hi1.c)var25_19 /* !! */ , (hi1.c)var20_10));
        }
        if (var18_8) {
            this.j.a(1, (vr0.a)new hz2((ew0)var21_12, var12_14));
        }
        if (var24_7.f != var1_1.f) {
            this.j.a(10, (vr0.a)new iz2((zh1)var1_1));
            if (var1_1.f != null) {
                this.j.a(10, (vr0.a)new jz2((zh1)var1_1));
            }
        }
        if ((var21_12 = var24_7.i) != (var20_10 = var1_1.i)) {
            this.g.a(var20_10.e);
            this.j.a(2, (vr0.a)new kz2((zh1)var1_1));
        }
        if (var13_17) {
            var20_10 = this.G;
            this.j.a(14, (vr0.a)new ry2((hw0)var20_10));
        }
        if (var10_18) {
            this.j.a(3, (vr0.a)new sy2((zh1)var1_1));
        }
        if (var9_15 != 0 || var8_13 != 0) {
            this.j.a(-1, (vr0.a)new ty2((zh1)var1_1));
        }
        if (var9_15 != 0) {
            this.j.a(4, (vr0.a)new uy2((zh1)var1_1));
        }
        if (var8_13 != 0) {
            this.j.a(5, (vr0.a)new bz2((zh1)var1_1, var3_3));
        }
        if (var24_7.m != var1_1.m) {
            this.j.a(6, (vr0.a)new dz2((zh1)var1_1));
        }
        if ((var2_2 = var24_7.e == 3 && var24_7.l != false && var24_7.m == 0 ? 1 : 0) != (var3_3 = var1_1.e == 3 && var1_1.l != false && var1_1.m == 0 ? 1 : 0)) {
            this.j.a(7, (vr0.a)new ez2((zh1)var1_1));
        }
        if (!var24_7.n.equals(var1_1.n)) {
            this.j.a(12, (vr0.a)new fz2((zh1)var1_1));
        }
        this.h();
        this.j.a();
        if (var24_7.o != var1_1.o) {
            var1_1 = this.k.iterator();
            while (var1_1.hasNext()) {
                (var1_1.next()).a();
            }
        }
    }

    private static /* synthetic */ void a(zh1 object, int n10, hi1.b b10) {
        object = object.a;
        b10.a(n10);
    }

    private static /* synthetic */ void a(zh1 zh12, hi1.b b10) {
        b10.a(zh12.f);
    }

    private static long b(zh1 zh12) {
        l52.d d14 = new l52.d();
        l52.b b10 = new l52.b();
        zh12.a.a(zh12.b.a, b10);
        long l10 = zh12.c;
        l10 = l10 == -9223372036854775807L ? zh12.a.a((int)b10.d, (l52.d)d14, (long)0L).n : b10.f + l10;
        return l10;
    }

    private /* synthetic */ void b(n60.d d14) {
        this.h.a((Runnable)new az2(this, d14));
    }

    private static /* synthetic */ void b(zh1 zh12, int n10, hi1.b b10) {
        b10.onPlayWhenReadyChanged(zh12.l, n10);
    }

    private static /* synthetic */ void b(zh1 zh12, hi1.b b10) {
        b10.b(zh12.f);
    }

    private int c() {
        if (this.W.a.c()) {
            return this.X;
        }
        zh1 zh12 = this.W;
        return zh12.a.a((Object)zh12.b.a, (l52.b)this.l).d;
    }

    private static /* synthetic */ void c(hi1.b b10) {
        b10.b(g60.a((RuntimeException)new a70(1), 1003));
    }

    private static /* synthetic */ void c(zh1 zh12, hi1.b b10) {
        b10.a(zh12.i.d);
    }

    private /* synthetic */ void d(hi1.b b10) {
        b10.a(this.F);
    }

    private static /* synthetic */ void d(zh1 zh12, hi1.b b10) {
        boolean bl2 = zh12.g;
        b10.getClass();
        b10.onIsLoadingChanged(zh12.g);
    }

    private static /* synthetic */ void e(zh1 zh12, hi1.b b10) {
        b10.onPlayerStateChanged(zh12.l, zh12.e);
    }

    private int f() {
        AudioTrack audioTrack = this.H;
        if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
            this.H.release();
            this.H = null;
        }
        if (this.H == null) {
            this.H = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
        }
        return this.H.getAudioSessionId();
    }

    private static /* synthetic */ void f(zh1 zh12, hi1.b b10) {
        b10.onPlaybackStateChanged(zh12.e);
    }

    private void g() {
        TextureView textureView = this.K;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.t) {
                zs0.d((String)"ExoPlayerImpl", (String)"SurfaceTextureListener already unset or replaced.");
            } else {
                this.K.setSurfaceTextureListener(null);
            }
            this.K = null;
        }
    }

    private static /* synthetic */ void g(zh1 zh12, hi1.b b10) {
        b10.onPlaybackSuppressionReasonChanged(zh12.m);
    }

    private void h() {
        hi1.a a13 = this.F;
        hi1 hi12 = this.e;
        hi1.a a14 = this.c;
        int n10 = m92.a;
        boolean bl2 = hi12.isPlayingAd();
        boolean bl3 = hi12.isCurrentMediaItemSeekable();
        boolean bl4 = hi12.hasPreviousMediaItem();
        boolean bl5 = hi12.hasNextMediaItem();
        boolean bl6 = hi12.isCurrentMediaItemLive();
        boolean bl7 = hi12.isCurrentMediaItemDynamic();
        boolean bl8 = hi12.getCurrentTimeline().c();
        a14 = new /* Unavailable Anonymous Inner Class!! */.a(a14);
        boolean bl9 = bl2 ^ true;
        a14 = a14.a(bl9, 4);
        boolean bl10 = false;
        boolean bl11 = bl3 && !bl2;
        a14 = a14.a(bl11, 5);
        bl11 = bl4 && !bl2;
        a14 = a14.a(bl11, 6);
        bl11 = !bl8 && (bl4 || !bl6 || bl3) && !bl2;
        a14 = a14.a(bl11, 7);
        bl11 = bl5 && !bl2;
        a14 = a14.a(bl11, 8);
        bl11 = !bl8 && (bl5 || bl6 && bl7) && !bl2;
        a14 = a14.a(bl11, 9).a(bl9, 10);
        bl11 = bl3 && !bl2;
        a14 = a14.a(bl11, 11);
        bl11 = bl10;
        if (bl3) {
            bl11 = bl10;
            if (!bl2) {
                bl11 = true;
            }
        }
        this.F = a14 = a14.a(bl11, 12).a();
        if (!a14.equals(a13)) {
            this.j.a(13, (vr0.a)new zy2(this));
        }
    }

    private static void h(zh1 zh12, hi1.b b10) {
        boolean bl2 = zh12.e == 3 && zh12.l && zh12.m == 0;
        b10.onIsPlayingChanged(bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void i() {
        this.j();
        int n10 = this.W.e;
        boolean bl2 = true;
        if (n10 != 1) {
            if (n10 != 2 && n10 != 3) {
                if (n10 != 4) throw new IllegalStateException();
            } else {
                this.j();
                boolean bl3 = this.W.o;
                tj2 tj22 = this.x;
                this.j();
                if (!this.W.l || bl3) {
                    bl2 = false;
                }
                tj22.a(bl2);
                tj22 = this.y;
                this.j();
                tj22.a(this.W.l);
                return;
            }
        }
        this.x.a(false);
        this.y.a(false);
    }

    private static /* synthetic */ void i(zh1 zh12, hi1.b b10) {
        b10.a(zh12.n);
    }

    private void j() {
        this.d.b();
        if (Thread.currentThread() != this.q.getThread()) {
            String string2 = Thread.currentThread().getName();
            Object object = this.q.getThread().getName();
            int n10 = m92.a;
            Serializable serializable = Locale.US;
            serializable = new StringBuilder("Player is accessed on the wrong thread.\nCurrent thread: '");
            ((StringBuilder)serializable).append(string2);
            ((StringBuilder)serializable).append("'\nExpected thread: '");
            ((StringBuilder)serializable).append((String)object);
            ((StringBuilder)serializable).append("'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            string2 = ((StringBuilder)serializable).toString();
            if (!this.S) {
                object = this.T ? null : new IllegalStateException();
                zs0.b((String)"ExoPlayerImpl", (String)string2, (Throwable)object);
                this.T = true;
            } else {
                throw new IllegalStateException(string2);
            }
        }
    }

    public static /* synthetic */ void j(zh1 zh12, hi1.b b10) {
        l60.e(zh12, b10);
    }

    public static /* synthetic */ void k(zh1 zh12, hi1.b b10) {
        l60.g(zh12, b10);
    }

    public static /* synthetic */ void l(int n10, hi1.c c11, hi1.c c13, hi1.b b10) {
        l60.a(n10, c11, c13, b10);
    }

    public static /* synthetic */ void m(hi1.b b10) {
        l60.c(b10);
    }

    public static /* synthetic */ void n(zh1 zh12, hi1.b b10) {
        l60.f(zh12, b10);
    }

    public static /* synthetic */ void o(zh1 zh12, hi1.b b10) {
        l60.b(zh12, b10);
    }

    public static /* synthetic */ void p(l60 l602, hi1.b b10) {
        l602.d(b10);
    }

    public static /* synthetic */ void q(zh1 zh12, hi1.b b10) {
        l60.a(zh12, b10);
    }

    public static /* synthetic */ void r(ew0 ew02, int n10, hi1.b b10) {
        l60.a(ew02, n10, b10);
    }

    public static /* synthetic */ void s(l60 l602, n60.d d14) {
        l602.a(d14);
    }

    public static /* synthetic */ void t(hw0 hw02, hi1.b b10) {
        l60.a(hw02, b10);
    }

    public static /* synthetic */ void u(int n10, int n13, hi1.b b10) {
        l60.a(n10, n13, b10);
    }

    public static /* synthetic */ void v(zh1 zh12, hi1.b b10) {
        l60.c(zh12, b10);
    }

    public static /* synthetic */ void w(l60 l602, hi1.b b10, ub0 ub02) {
        l602.a(b10, ub02);
    }

    public static /* synthetic */ void x(zh1 zh12, hi1.b b10) {
        l60.h(zh12, b10);
    }

    public static /* synthetic */ void y(float f11, hi1.b b10) {
        l60.a(f11, b10);
    }

    public static /* synthetic */ void z(zh1 zh12, hi1.b b10) {
        l60.i(zh12, b10);
    }

    @Nullable
    public final g60 a() {
        this.j();
        return this.W.f;
    }

    public final void a(h60.a a13) {
        this.k.add(a13);
    }

    public final void a(hi1.b b10) {
        b10.getClass();
        this.j.b((Object)b10);
    }

    @Override
    public final void a(km1 object) {
        Object object2;
        int n10;
        this.j();
        zh1 zh12 = Collections.singletonList(object);
        this.j();
        this.j();
        this.c();
        this.j();
        this.a(this.W);
        int n13 = m92.a;
        ++this.A;
        if (!this.m.isEmpty()) {
            n10 = this.m.size();
            for (n13 = n10 - 1; n13 >= 0; --n13) {
                this.m.remove(n13);
            }
            this.E = this.E.c(n10);
        }
        object = new ArrayList();
        for (n13 = 0; n13 < zh12.size(); ++n13) {
            tw0.c c11 = new tw0.c(zh12.get(n13), this.n);
            ((ArrayList)object).add(c11);
            ArrayList arrayList = this.m;
            object2 = c11.b;
            arrayList.add(n13, new d(c11.a.f(), object2));
        }
        this.E = this.E.b(((ArrayList)object).size());
        object2 = new ij1(this.m, this.E);
        if (!((l52)object2).c() && -1 >= ((ij1)object2).b()) {
            throw new oi0();
        }
        int n14 = ((com.yandex.mobile.ads.impl.d)object2).a(false);
        zh12 = this.a(this.W, (l52)object2, this.a((l52)object2, n14, -9223372036854775807L));
        n13 = n10 = zh12.e;
        if (n14 != -1) {
            n13 = n10;
            if (n10 != 1) {
                n13 = !((l52)object2).c() && n14 < ((ij1)object2).b() ? 2 : 4;
            }
        }
        zh12 = zh12.a(n13);
        this.i.a(n14, m92.a((long)-9223372036854775807L), this.E, (ArrayList)object);
        boolean bl2 = !this.W.b.a.equals(zh12.b.a) && !this.W.a.c();
        this.a(zh12, 0, 1, bl2, 4, this.a(zh12));
    }

    public final void b(hi1.b b10) {
        b10.getClass();
        this.j.a((Object)b10);
    }

    public final void d() {
        this.j();
    }

    public final void e() {
        this.j();
    }

    public final long getContentPosition() {
        this.j();
        this.j();
        if (this.W.b.a()) {
            zh1 zh12 = this.W;
            zh12.a.a(zh12.b.a, this.l);
            zh12 = this.W;
            long l10 = zh12.c == -9223372036854775807L ? m92.b((long)zh12.a.a((int)this.getCurrentMediaItemIndex(), (l52.d)this.a, (long)0L).n) : m92.b((long)this.l.f) + m92.b((long)this.W.c);
            return l10;
        }
        this.j();
        return m92.b((long)this.a(this.W));
    }

    public final int getCurrentAdGroupIndex() {
        this.j();
        this.j();
        int n10 = this.W.b.a() ? this.W.b.b : -1;
        return n10;
    }

    public final int getCurrentAdIndexInAdGroup() {
        this.j();
        this.j();
        int n10 = this.W.b.a() ? this.W.b.c : -1;
        return n10;
    }

    public final int getCurrentMediaItemIndex() {
        int n10;
        this.j();
        int n13 = n10 = this.c();
        if (n10 == -1) {
            n13 = 0;
        }
        return n13;
    }

    public final int getCurrentPeriodIndex() {
        this.j();
        if (this.W.a.c()) {
            return 0;
        }
        zh1 zh12 = this.W;
        return zh12.a.a(zh12.b.a);
    }

    public final long getCurrentPosition() {
        this.j();
        return m92.b((long)this.a(this.W));
    }

    public final l52 getCurrentTimeline() {
        this.j();
        return this.W.a;
    }

    public final i72 getCurrentTracks() {
        this.j();
        return this.W.i.d;
    }

    public final long getDuration() {
        this.j();
        this.j();
        if (this.W.b.a()) {
            zh1 zh12 = this.W;
            qw0.b b10 = zh12.b;
            zh12.a.a(b10.a, this.l);
            return m92.b((long)this.l.a(b10.b, b10.c));
        }
        this.j();
        l52 l522 = this.W.a;
        long l10 = l522.c() ? -9223372036854775807L : m92.b((long)l522.a((int)this.getCurrentMediaItemIndex(), (l52.d)this.a, (long)0L).o);
        return l10;
    }

    public final boolean getPlayWhenReady() {
        this.j();
        return this.W.l;
    }

    public final int getPlaybackState() {
        this.j();
        return this.W.e;
    }

    public final int getPlaybackSuppressionReason() {
        this.j();
        return this.W.m;
    }

    public final long getTotalBufferedDuration() {
        this.j();
        return m92.b((long)this.W.q);
    }

    public final float getVolume() {
        this.j();
        return this.Q;
    }

    public final boolean isPlayingAd() {
        this.j();
        return this.W.b.a();
    }

    public final void prepare() {
        this.j();
        this.j();
        boolean bl2 = this.W.l;
        ih ih3 = this.v;
        int n10 = 2;
        int n13 = ih3.a(bl2, 2);
        int n14 = bl2 && n13 != 1 ? 2 : 1;
        this.a(n13, n14, bl2);
        ih3 = this.W;
        if (ih3.e != 1) {
            return;
        }
        ih3 = ih3.a(null);
        n14 = n10;
        if (ih3.a.c()) {
            n14 = 4;
        }
        ih3 = ih3.a(n14);
        ++this.A;
        this.i.i();
        this.a((zh1)ih3, 1, 1, false, 5, -9223372036854775807L);
    }

    public final void release() {
        zh1 zh12 = new StringBuilder("Release ");
        zh12.append(Integer.toHexString(System.identityHashCode(this)));
        zh12.append(" [ExoPlayerLib/2.18.1] [");
        zh12.append(m92.e);
        zh12.append("] [");
        zh12.append(o60.a());
        zh12.append("]");
        zs0.c((String)"ExoPlayerImpl", (String)zh12.toString());
        this.j();
        if (m92.a < 21 && (zh12 = this.H) != null) {
            zh12.release();
            this.H = null;
        }
        this.u.a();
        this.w.c();
        this.x.a(false);
        this.y.a(false);
        this.v.c();
        if (!this.i.k()) {
            zh12 = this.j;
            zh12.a(10, (vr0.a)new vy2());
            zh12.a();
        }
        this.j.b();
        this.h.a();
        this.r.a(this.p);
        this.W = zh12 = this.W.a(1);
        this.W = zh12 = zh12.a(zh12.b);
        zh12.p = zh12.r;
        this.W.q = 0L;
        this.p.release();
        this.g.d();
        this.g();
        zh12 = this.J;
        if (zh12 != null) {
            zh12.release();
            this.J = null;
        }
        int n10 = yu.b;
    }

    public final void setPlayWhenReady(boolean bl2) {
        int n10;
        this.j();
        ih ih3 = this.v;
        this.j();
        int n13 = ih3.a(bl2, this.W.e);
        int n14 = n10 = 1;
        if (bl2) {
            n14 = n10;
            if (n13 != 1) {
                n14 = 2;
            }
        }
        this.a(n13, n14, bl2);
    }

    public final void setVideoTextureView(@Nullable TextureView textureView) {
        this.j();
        if (textureView == null) {
            this.j();
            this.g();
            this.a((Surface)null);
            this.a(0, 0);
        } else {
            this.g();
            this.K = textureView;
            if (textureView.getSurfaceTextureListener() != null) {
                zs0.d((String)"ExoPlayerImpl", (String)"Replacing existing SurfaceTextureListener.");
            }
            textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener)this.t);
            SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
            if (surfaceTexture == null) {
                this.a((Surface)null);
                this.a(0, 0);
            } else {
                surfaceTexture = new Surface(surfaceTexture);
                this.a((Surface)surfaceTexture);
                this.J = surfaceTexture;
                this.a(textureView.getWidth(), textureView.getHeight());
            }
        }
    }

    public final void setVolume(float f11) {
        this.j();
        int n10 = m92.a;
        f11 = Math.max(0.0f, Math.min(f11, 1.0f));
        if (this.Q == f11) {
            return;
        }
        this.Q = f11;
        this.a(1, 2, Float.valueOf(this.v.b() * f11));
        vr0<hi1.b> vr02 = this.j;
        vr02.a(22, (vr0.a)new wy2(f11));
        vr02.a();
    }

    public final void stop() {
        this.j();
        this.j();
        ih ih3 = this.v;
        this.j();
        ih3.a(this.W.l, 1);
        this.a((g60)null);
        int n10 = yu.b;
    }

    private final class b
    implements gg2,
    kh,
    w42,
    o01,
    SurfaceHolder.Callback,
    TextureView.SurfaceTextureListener,
    s12.b,
    ih.b,
    fh.b,
    d32.a,
    h60.a {
        final l60 a;

        private b(l60 l602) {
            this.a = l602;
        }

        /* synthetic */ b(l60 l602, uz2 uz22) {
            this(l602);
        }

        private /* synthetic */ void a(hi1.b b10) {
            b10.a(this.a.G);
        }

        public static /* synthetic */ void b(boolean bl2, hi1.b b10) {
            b10.onSkipSilenceEnabledChanged(bl2);
        }

        public static /* synthetic */ void c(b b10, hi1.b b11) {
            b10.a(b11);
        }

        public static /* synthetic */ void d(int n10, boolean bl2, hi1.b b10) {
            b10.a(bl2, n10);
        }

        public static /* synthetic */ void e(ng2 ng22, hi1.b b10) {
            b10.a(ng22);
        }

        public static /* synthetic */ void f(List list, hi1.b b10) {
            b10.onCues(list);
        }

        public static /* synthetic */ void g(yu yu3, hi1.b b10) {
            b10.a(yu3);
        }

        public static /* synthetic */ void h(k01 k012, hi1.b b10) {
            b10.a(k012);
        }

        public static /* synthetic */ void i(a10 a102, hi1.b b10) {
            b10.a(a102);
        }

        public final void a() {
            this.a.i();
        }

        public final void a(int n10) {
            int n13;
            l60 l602 = this.a;
            l602.j();
            boolean bl2 = ((l60)l602).W.l;
            l602 = this.a;
            int n14 = n13 = 1;
            if (bl2) {
                n14 = n13;
                if (n10 != 1) {
                    n14 = 2;
                }
            }
            l602.a(n10, n14, bl2);
        }

        public final void a(int n10, long l10) {
            this.a.p.a(n10, l10);
        }

        public final void a(int n10, long l10, long l11) {
            this.a.p.a(n10, l10, l11);
        }

        public final void a(long l10) {
            this.a.p.a(l10);
        }

        public final void a(Surface surface) {
            this.a.a(surface);
        }

        public final void a(cc0 cc02, @Nullable ly ly3) {
            this.a.getClass();
            this.a.p.a(cc02, ly3);
        }

        public final void a(hy hy3) {
            this.a.p.a(hy3);
            this.a.getClass();
            this.a.getClass();
        }

        public final void a(k01 k012) {
            Object object = this.a;
            Object object2 = ((l60)object).V.a();
            for (int i14 = 0; i14 < k012.c(); ++i14) {
                k012.a(i14).a(object2);
            }
            ((l60)object).V = object2.a();
            object2 = this.a;
            ((l60)object2).j();
            object = ((l60)object2).W.a;
            if (((l52)object).c()) {
                object2 = ((l60)object2).V;
            } else {
                object = ((l52)object).a((int)((l60)object2).getCurrentMediaItemIndex(), (l52.d)((bk)object2).a, (long)0L).d;
                object2 = ((l60)object2).V.a().a(((ew0)object).e).a();
            }
            if (!((hw0)object2).equals(this.a.G)) {
                object = this.a;
                ((l60)object).G = (hw0)object2;
                ((l60)object).j.a(14, (vr0.a)new oz2(this));
            }
            this.a.j.a(28, (vr0.a)new pz2(k012));
            this.a.j.a();
        }

        public final void a(ng2 ng22) {
            this.a.getClass();
            vr0 vr02 = this.a.j;
            vr02.a(25, (vr0.a)new sz2(ng22));
            vr02.a();
        }

        public final void a(yu yu3) {
            this.a.getClass();
            vr0 vr02 = this.a.j;
            vr02.a(27, (vr0.a)new mz2(yu3));
            vr02.a();
        }

        public final void a(Exception exception) {
            this.a.p.a(exception);
        }

        public final void a(Object object, long l10) {
            this.a.p.a(object, l10);
            l60 l602 = this.a;
            if (l602.I == object) {
                object = l602.j;
                object.a(26, (vr0.a)new rz2());
                object.a();
            }
        }

        public final void a(String string2) {
            this.a.p.a(string2);
        }

        public final void a(String string2, long l10, long l11) {
            this.a.p.a(string2, l10, l11);
        }

        public final void a(boolean bl2, int n10) {
            vr0 vr02 = this.a.j;
            vr02.a(30, (vr0.a)new nz2(n10, bl2));
            vr02.a();
        }

        public final void b() {
            this.a.a(null);
        }

        public final void b(int n10, long l10) {
            this.a.p.b(n10, l10);
        }

        public final void b(cc0 cc02, @Nullable ly ly3) {
            this.a.getClass();
            this.a.p.b(cc02, ly3);
        }

        public final void b(hy hy3) {
            this.a.getClass();
            this.a.p.b(hy3);
        }

        public final void b(Exception exception) {
            this.a.p.b(exception);
        }

        public final void b(String string2) {
            this.a.p.b(string2);
        }

        public final void b(String string2, long l10, long l11) {
            this.a.p.b(string2, l10, l11);
        }

        public final void c() {
            this.a.a(-1, 3, false);
        }

        public final void c(hy hy3) {
            this.a.p.c(hy3);
            this.a.getClass();
            this.a.getClass();
        }

        public final void c(Exception exception) {
            this.a.p.c(exception);
        }

        public final void d() {
            a10 a102 = l60.a(this.a.w);
            if (!a102.equals(this.a.U)) {
                l60 l602 = this.a;
                l602.U = a102;
                l602 = l602.j;
                l602.a(29, new tz2(a102));
                l602.a();
            }
        }

        public final void d(hy hy3) {
            this.a.getClass();
            this.a.p.d(hy3);
        }

        public final void e() {
            l60 l602 = this.a;
            l602.a(1, 2, Float.valueOf(l602.Q * l602.v.b()));
        }

        public final void onCues(List<wu> list) {
            vr0 vr02 = this.a.j;
            vr02.a(27, (vr0.a)new lz2(list));
            vr02.a();
        }

        public final void onSkipSilenceEnabledChanged(boolean bl2) {
            l60 l602 = this.a;
            if (l602.R == bl2) {
                return;
            }
            l602.R = bl2;
            l602 = l602.j;
            l602.a(23, new qz2(bl2));
            l602.a();
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int n10, int n13) {
            this.a.a(surfaceTexture);
            this.a.a(n10, n13);
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.a.a(null);
            this.a.a(0, 0);
            return true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int n10, int n13) {
            this.a.a(n10, n13);
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int n10, int n13, int n14) {
            this.a.a(n13, n14);
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.a.getClass();
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.a.getClass();
            this.a.a(0, 0);
        }
    }

    private static final class c
    implements df2,
    hn,
    ni1.b {
        @Nullable
        private df2 b;
        @Nullable
        private hn c;
        @Nullable
        private df2 d;
        @Nullable
        private hn e;

        private c() {
        }

        /* synthetic */ c(vz2 vz22) {
            this();
        }

        public final void a(int n10, @Nullable Object object) {
            if (n10 != 7) {
                if (n10 != 8) {
                    if (n10 == 10000) {
                        if ((object = (s12)object) == null) {
                            this.d = null;
                            this.e = null;
                        } else {
                            this.d = object.b();
                            this.e = object.a();
                        }
                    }
                } else {
                    this.c = (hn)object;
                }
            } else {
                this.b = (df2)object;
            }
        }

        public final void a(long l10, long l11, cc0 cc02, @Nullable MediaFormat mediaFormat) {
            df2 df22 = this.d;
            if (df22 != null) {
                df22.a(l10, l11, cc02, mediaFormat);
            }
            if ((df22 = this.b) != null) {
                df22.a(l10, l11, cc02, mediaFormat);
            }
        }

        public final void a(long l10, float[] fArray) {
            hn hn3 = this.e;
            if (hn3 != null) {
                hn3.a(l10, fArray);
            }
            if ((hn3 = this.c) != null) {
                hn3.a(l10, fArray);
            }
        }

        public final void f() {
            hn hn3 = this.e;
            if (hn3 != null) {
                hn3.f();
            }
            if ((hn3 = this.c) != null) {
                hn3.f();
            }
        }
    }

    private static final class d
    implements sw0 {
        private final Object a;
        private l52 b;

        public d(l52 l522, Object object) {
            this.a = object;
            this.b = l522;
        }

        static /* bridge */ /* synthetic */ void a(d d14, l52 l522) {
            d14.b = l522;
        }

        public final Object a() {
            return this.a;
        }

        public final l52 b() {
            return this.b;
        }
    }
}

