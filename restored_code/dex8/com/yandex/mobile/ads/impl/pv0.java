/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.graphics.Point
 *  android.media.MediaCrypto
 *  android.media.MediaFormat
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Message
 *  android.os.SystemClock
 *  android.util.Pair
 *  android.view.Surface
 *  androidx.annotation.CallSuper
 *  androidx.annotation.Nullable
 *  androidx.annotation.RequiresApi
 *  com.yandex.mobile.ads.impl.cv0
 *  com.yandex.mobile.ads.impl.cv0$a
 *  com.yandex.mobile.ads.impl.cv0$c
 *  com.yandex.mobile.ads.impl.dc0
 *  com.yandex.mobile.ads.impl.df2
 *  com.yandex.mobile.ads.impl.dw0
 *  com.yandex.mobile.ads.impl.ef2
 *  com.yandex.mobile.ads.impl.fe
 *  com.yandex.mobile.ads.impl.fs2
 *  com.yandex.mobile.ads.impl.gg2
 *  com.yandex.mobile.ads.impl.gg2$a
 *  com.yandex.mobile.ads.impl.gv0
 *  com.yandex.mobile.ads.impl.hy
 *  com.yandex.mobile.ads.impl.kv0
 *  com.yandex.mobile.ads.impl.ly
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mv0
 *  com.yandex.mobile.ads.impl.mv0$b
 *  com.yandex.mobile.ads.impl.oh1
 *  com.yandex.mobile.ads.impl.pv0$a
 *  com.yandex.mobile.ads.impl.qv0
 *  com.yandex.mobile.ads.impl.rm1
 *  com.yandex.mobile.ads.impl.w01
 *  com.yandex.mobile.ads.impl.x52
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.cv0;
import com.yandex.mobile.ads.impl.dc0;
import com.yandex.mobile.ads.impl.df2;
import com.yandex.mobile.ads.impl.dw0;
import com.yandex.mobile.ads.impl.ef2;
import com.yandex.mobile.ads.impl.fe;
import com.yandex.mobile.ads.impl.fq;
import com.yandex.mobile.ads.impl.fs2;
import com.yandex.mobile.ads.impl.fv0;
import com.yandex.mobile.ads.impl.g60;
import com.yandex.mobile.ads.impl.gg2;
import com.yandex.mobile.ads.impl.gv0;
import com.yandex.mobile.ads.impl.hy;
import com.yandex.mobile.ads.impl.iv0;
import com.yandex.mobile.ads.impl.jy;
import com.yandex.mobile.ads.impl.kv0;
import com.yandex.mobile.ads.impl.ly;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mv0;
import com.yandex.mobile.ads.impl.ng2;
import com.yandex.mobile.ads.impl.oh1;
import com.yandex.mobile.ads.impl.ov0;
import com.yandex.mobile.ads.impl.pv0;
import com.yandex.mobile.ads.impl.qv0;
import com.yandex.mobile.ads.impl.rm1;
import com.yandex.mobile.ads.impl.w01;
import com.yandex.mobile.ads.impl.x52;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.xz;
import com.yandex.mobile.ads.impl.zs0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class pv0
extends iv0 {
    private static final qv0 q1 = rm1.h();
    private static final int[] r1 = new int[]{1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean s1;
    private static boolean t1;
    private final Context H0;
    private final ef2 I0;
    private final gg2.a J0;
    private final long K0;
    private final int L0;
    private final boolean M0;
    private a N0;
    private boolean O0;
    private boolean P0;
    @Nullable
    private Surface Q0;
    @Nullable
    private oh1 R0;
    private boolean S0;
    private int T0;
    private boolean U0;
    private boolean V0;
    private boolean W0;
    private long X0;
    private long Y0;
    private long Z0;
    private int a1;
    private int b1;
    private int c1;
    private long d1;
    private long e1;
    private long f1;
    private int g1;
    private int h1;
    private int i1;
    private int j1;
    private float k1;
    @Nullable
    private ng2 l1;
    private boolean m1;
    private int n1;
    @Nullable
    b o1;
    @Nullable
    private df2 p1;

    public pv0(Context context, xz xz3, kv0 kv02, @Nullable Handler handler, @Nullable gg2 gg22) {
        super(2, xz3, kv02, 30.0f);
        this.K0 = 5000L;
        this.L0 = 50;
        this.H0 = context = context.getApplicationContext();
        this.I0 = new ef2(context);
        this.J0 = new gg2.a(handler, gg22);
        this.M0 = pv0.V();
        this.Y0 = -9223372036854775807L;
        this.h1 = -1;
        this.i1 = -1;
        this.k1 = -1.0f;
        this.T0 = 1;
        this.n1 = 0;
        this.U();
    }

    private void T() {
        cv0 cv02;
        this.U0 = false;
        if (m92.a >= 23 && this.m1 && (cv02 = this.E()) != null) {
            this.o1 = new b(this, cv02);
        }
    }

    private void U() {
        this.l1 = null;
    }

    private static boolean V() {
        return q1.Z0().equals(m92.c);
    }

    private static boolean W() {
        String string2;
        Object object;
        String string3;
        int n10 = m92.a;
        if (n10 <= 28 && ((string3 = (object = q1).r()).equals(string2 = m92.b) || object.I().equals(string2) || object.K().equals(string2) || object.J().equals(string2) || object.Q0().equals(string2) || object.P0().equals(string2) || object.d1().equals(string2) || object.e1().equals(string2))) {
            return true;
        }
        if (n10 <= 27 && q1.w0().equals(m92.b)) {
            return true;
        }
        return n10 <= 26 && (((String)(object = (string3 = q1).a())).equals(string2 = m92.b) || string3.b().equals(string2) || string3.c().equals(string2) || string3.d().equals(string2) || string3.e().equals(string2) || string3.f().equals(string2) || string3.g().equals(string2) || string3.h().equals(string2) || string3.i().equals(string2) || string3.j().equals(string2) || string3.k().equals(string2) || string3.l().equals(string2) || string3.m().equals(string2) || string3.s().equals(string2) || string3.t().equals(string2) || string3.u().equals(string2) || string3.v().equals(string2) || string3.w().equals(string2) || string3.y().equals(string2) || string3.z().equals(string2) || string3.A().equals(string2) || string3.B().equals(string2) || string3.C().equals(string2) || string3.D().equals(string2) || string3.E().equals(string2) || string3.F().equals(string2) || string3.G().equals(string2) || string3.H().equals(string2) || string3.L().equals(string2) || string3.M().equals(string2) || string3.N().equals(string2) || string3.O().equals(string2) || string3.P().equals(string2) || string3.Q().equals(string2) || string3.R().equals(string2) || string3.S().equals(string2) || string3.T().equals(string2) || string3.U().equals(string2) || string3.V().equals(string2) || string3.W().equals(string2) || string3.X().equals(string2) || string3.Y().equals(string2) || string3.Z().equals(string2) || string3.a0().equals(string2) || string3.b0().equals(string2) || string3.c0().equals(string2) || string3.d0().equals(string2) || string3.e0().equals(string2) || string3.f0().equals(string2) || string3.g0().equals(string2) || string3.h0().equals(string2) || string3.i0().equals(string2) || string3.j0().equals(string2) || string3.k0().equals(string2) || string3.l0().equals(string2) || string3.m0().equals(string2) || string3.n0().equals(string2) || string3.o0().equals(string2) || string3.p0().equals(string2) || string3.q0().equals(string2) || string3.r0().equals(string2) || string3.s0().equals(string2) || string3.t0().equals(string2) || string3.u0().equals(string2) || string3.v0().equals(string2) || string3.x0().equals(string2) || string3.y0().equals(string2) || string3.z0().equals(string2) || string3.A0().equals(string2) || string3.B0().equals(string2) || string3.C0().equals(string2) || string3.D0().equals(string2) || string3.E0().equals(string2) || string3.F0().equals(string2) || string3.H0().equals(string2) || string3.I0().equals(string2) || string3.K0().equals(string2) || string3.L0().equals(string2) || string3.M0().equals(string2) || string3.N0().equals(string2) || string3.O0().equals(string2) || string3.R0().equals(string2) || string3.S0().equals(string2) || string3.T0().equals(string2) || string3.U0().equals(string2) || string3.V0().equals(string2) || string3.W0().equals(string2) || string3.X0().equals(string2) || string3.Y0().equals(string2) || string3.a1().equals(string2) || string3.b1().equals(string2) || string3.f1().equals(string2) || string3.g1().equals(string2) || string3.h1().equals(string2) || string3.i1().equals(string2) || string3.j1().equals(string2) || string3.k1().equals(string2) || string3.l1().equals(string2) || string3.m1().equals(string2) || string3.n1().equals(string2) || string3.o1().equals(string2) || string3.p1().equals(string2) || string3.q1().equals(string2) || string3.r1().equals(string2) || string3.s1().equals(string2) || string3.t1().equals(string2) || string3.u1().equals(string2) || string3.v1().equals(string2) || string3.w1().equals(string2) || string3.x1().equals(string2) || string3.y1().equals(string2) || string3.z1().equals(string2) || string3.A1().equals(string2) || string3.B1().equals(string2) || string3.C1().equals(string2) || string3.D1().equals(string2) || string3.E1().equals(string2) || string3.G1().equals(string2) || string3.H1().equals(string2) || string3.I1().equals(string2) || string3.F1().equals(string2) || string3.J1().equals(string2) || string3.K1().equals(string2) || string3.L1().equals(string2) || string3.M1().equals(string2) || string3.N1().equals(string2) || string3.O1().equals(string2) || string3.P1().equals(string2) || string3.Q1().equals(string2) || string3.R1().equals(string2) || string3.S1().equals(string2) || string3.T1().equals(string2) || string3.U1().equals(string2) || string3.V1().equals(string2) || string3.W1().equals(string2) || string3.X1().equals(string2) || string3.Y1().equals(string2) || string3.Z1().equals(string2) || string3.a2().equals(string2) || string3.b2().equals(string2) || (string2 = string3.n()).equals(object = m92.d) || string3.o().equals(object) || string3.G0().equals(object));
    }

    private void X() {
        ng2 ng22;
        int n10 = this.h1;
        if (!(n10 == -1 && this.i1 == -1 || (ng22 = this.l1) != null && ng22.b == n10 && ng22.c == this.i1 && ng22.d == this.j1 && ng22.e == this.k1)) {
            this.l1 = ng22 = new ng2(this.h1, this.i1, this.j1, this.k1);
            this.J0.b(ng22);
        }
    }

    private void Y() {
        this.R();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int a(cc0 object, gv0 gv02) {
        int n10;
        int n13;
        String string2;
        int n14;
        int n15;
        block19: {
            block20: {
                n15 = ((cc0)object).r;
                n14 = ((cc0)object).s;
                if (n15 == -1) return -1;
                if (n14 == -1) {
                    return -1;
                }
                string2 = ((cc0)object).m;
                boolean bl2 = "video/dolby-vision".equals(string2);
                n13 = 1;
                if (bl2) {
                    string2 = (object = mv0.b((cc0)object)) != null && ((n10 = ((Integer)((Pair)object).first).intValue()) == 512 || n10 == 1 || n10 == 2) ? "video/avc" : "video/hevc";
                }
                string2.getClass();
                int n16 = string2.hashCode();
                n10 = 4;
                switch (n16) {
                    case 1599127257: {
                        if (!string2.equals("video/x-vnd.on2.vp9")) break;
                        n13 = 6;
                        break block19;
                    }
                    case 1599127256: {
                        if (!string2.equals("video/x-vnd.on2.vp8")) break;
                        n13 = 5;
                        break block19;
                    }
                    case 1331836730: {
                        if (!string2.equals("video/avc")) break;
                        n13 = 4;
                        break block19;
                    }
                    case 1187890754: {
                        if (!string2.equals("video/mp4v-es")) break;
                        n13 = 3;
                        break block19;
                    }
                    case -1662541442: {
                        if (!string2.equals("video/hevc")) break;
                        n13 = 2;
                        break block19;
                    }
                    case -1662735862: {
                        if (!string2.equals("video/av01")) {
                            break;
                        }
                        break block19;
                    }
                    case -1664118616: {
                        if (string2.equals("video/3gpp")) break block20;
                    }
                }
                n13 = -1;
                break block19;
            }
            n13 = 0;
        }
        switch (n13) {
            default: {
                return -1;
            }
            case 4: {
                string2 = q1;
                String string3 = string2.x();
                object = m92.d;
                if (string3.equals(object)) return -1;
                if (string2.q().equals(m92.c)) {
                    if (string2.J0().equals(object)) return -1;
                    if (string2.p().equals(object) && gv02.f) {
                        return -1;
                    }
                }
                n13 = (n15 + 15) / 16;
                n13 = (n14 + 15) / 16 * n13 * 256;
                break;
            }
            case 2: 
            case 6: {
                n13 = n14 * n15;
                return n13 * 3 / (n10 * 2);
            }
            case 0: 
            case 1: 
            case 3: 
            case 5: {
                n13 = n14 * n15;
            }
        }
        n10 = 2;
        return n13 * 3 / (n10 * 2);
    }

    private static xj0 a(kv0 object, cc0 object2, boolean bl2, boolean bl3) throws mv0.b {
        Object object3 = ((cc0)object2).m;
        if (object3 == null) {
            return xj0.h();
        }
        object3 = object.a((String)object3, bl2, bl3);
        if ((object2 = mv0.a((cc0)object2)) == null) {
            return xj0.a(object3);
        }
        object = object.a((String)object2, bl2, bl3);
        int n10 = xj0.d;
        return new xj0.a().b((List)object3).b((List)object).a();
    }

    private void a(long l10, long l11, cc0 cc02) {
        df2 df22 = this.p1;
        if (df22 != null) {
            df22.a(l10, l11, cc02, this.H());
        }
    }

    private void a(@Nullable Object object) throws g60 {
        Surface surface = object instanceof Surface ? (Surface)object : null;
        object = surface;
        if (surface == null && (object = this.R0) == null) {
            gv0 gv02 = this.F();
            object = surface;
            if (gv02 != null) {
                object = surface;
                if (this.b(gv02)) {
                    object = oh1.a((Context)this.H0, (boolean)gv02.f);
                    this.R0 = object;
                }
            }
        }
        if (this.Q0 != object) {
            this.Q0 = object;
            this.I0.a((Surface)object);
            this.S0 = false;
            int n10 = this.getState();
            surface = this.E();
            if (surface != null) {
                if (m92.a >= 23 && object != null && !this.O0) {
                    surface.a((Surface)object);
                } else {
                    this.N();
                    this.K();
                }
            }
            if (object != null && object != this.R0) {
                object = this.l1;
                if (object != null) {
                    this.J0.b((ng2)object);
                }
                this.T();
                if (n10 == 2) {
                    long l10 = this.K0 > 0L ? SystemClock.elapsedRealtime() + this.K0 : -9223372036854775807L;
                    this.Y0 = l10;
                }
            } else {
                this.l1 = null;
                this.T();
            }
        } else if (object != null && object != this.R0) {
            object = this.l1;
            if (object != null) {
                this.J0.b((ng2)object);
            }
            if (this.S0) {
                this.J0.a(this.Q0);
            }
        }
    }

    protected static int b(cc0 cc02, gv0 gv02) {
        if (cc02.n != -1) {
            int n10 = cc02.o.size();
            int n13 = 0;
            for (int i14 = 0; i14 < n10; ++i14) {
                n13 += cc02.o.get(i14).length;
            }
            return cc02.n + n13;
        }
        return pv0.a(cc02, gv02);
    }

    private boolean b(gv0 gv02) {
        boolean bl2 = m92.a >= 23 && !this.m1 && !pv0.b(gv02.a) && (!gv02.f || oh1.a((Context)this.H0));
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected static boolean b(String string2) {
        if (string2.startsWith(q1.c1())) {
            return false;
        }
        synchronized (pv0.class) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (s1) break block4;
                        t1 = pv0.W();
                        s1 = true;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return t1;
            }
            throw throwable2;
        }
    }

    @Override
    protected final boolean G() {
        boolean bl2 = this.m1 && m92.a < 23;
        return bl2;
    }

    @Override
    protected final void L() {
        this.T();
    }

    @Override
    @CallSuper
    protected final void P() {
        super.P();
        this.c1 = 0;
    }

    @Override
    protected final float a(float f11, cc0[] cc0Array) {
        int n10 = cc0Array.length;
        float f12 = -1.0f;
        float f13 = -1.0f;
        for (int i14 = 0; i14 < n10; ++i14) {
            float f14 = cc0Array[i14].t;
            float f15 = f13;
            if (f14 != -1.0f) {
                f15 = Math.max(f13, f14);
            }
            f13 = f15;
        }
        f11 = f13 == -1.0f ? f12 : f13 * f11;
        return f11;
    }

    @Override
    protected final int a(kv0 object, cc0 cc02) throws mv0.b {
        int n10;
        xj0 xj02;
        boolean bl2 = w01.f((String)cc02.m);
        int n13 = 0;
        if (!bl2) {
            return fs2.b((int)0, (int)0, (int)0);
        }
        bl2 = cc02.p != null;
        xj0 xj03 = xj02 = pv0.a((kv0)object, cc02, bl2, false);
        if (bl2) {
            xj03 = xj02;
            if (xj02.isEmpty()) {
                xj03 = pv0.a((kv0)object, cc02, false, false);
            }
        }
        if (xj03.isEmpty()) {
            return fs2.b((int)1, (int)0, (int)0);
        }
        int n14 = cc02.F;
        if (n14 != 0 && n14 != 2) {
            return fs2.b((int)2, (int)0, (int)0);
        }
        gv0 gv02 = (gv0)xj03.get(0);
        boolean bl3 = gv02.a(cc02);
        if (!bl3) {
            for (n14 = 1; n14 < xj03.size(); ++n14) {
                xj02 = (gv0)xj03.get(n14);
                if (!xj02.a(cc02)) continue;
                n10 = 0;
                bl3 = true;
                xj03 = xj02;
                break;
            }
        } else {
            n10 = 1;
            xj03 = gv02;
        }
        n14 = bl3 ? 4 : 3;
        int n15 = xj03.b(cc02) ? 16 : 8;
        int n16 = ((gv0)xj03).g ? 64 : 0;
        n10 = n10 != 0 ? 128 : 0;
        int n17 = n13;
        if (bl3) {
            object = pv0.a((kv0)object, cc02, bl2, true);
            n17 = n13;
            if (!object.isEmpty()) {
                object = (gv0)mv0.a((xj0)object, (cc0)cc02).get(0);
                n17 = n13;
                if (object.a(cc02)) {
                    n17 = n13;
                    if (object.b(cc02)) {
                        n17 = 32;
                    }
                }
            }
        }
        return n14 | n15 | n17 | n16 | n10;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @TargetApi(value=17)
    protected final cv0.a a(gv0 gv02, cc0 cc02, @Nullable MediaCrypto mediaCrypto, float f11) {
        Pair pair;
        void var20_27;
        float f12;
        Object object;
        int n10;
        int n13;
        Object object2 = this.R0;
        if (object2 != null && ((oh1)object2).b != gv02.f) {
            if (this.Q0 == object2) {
                this.Q0 = null;
            }
            object2.release();
            this.R0 = null;
        }
        object2 = gv02.c;
        cc0[] cc0Array = this.s();
        int n14 = cc02.r;
        int n15 = cc02.s;
        int n16 = pv0.b(cc02, gv02);
        if (cc0Array.length == 1) {
            n13 = n16;
            if (n16 != -1) {
                n10 = pv0.a(cc02, gv02);
                n13 = n16;
                if (n10 != -1) {
                    n13 = Math.min((int)((float)n16 * 1.5f), n10);
                }
            }
            object = new /* Unavailable Anonymous Inner Class!! */;
            Object object3 = object2;
            object2 = object;
        } else {
            int n17;
            int n18;
            int n19 = cc0Array.length;
            int n23 = 0;
            n13 = n15;
            for (n10 = 0; n10 < n19; ++n10) {
                void var20_14;
                Object object4 = object = cc0Array[n10];
                if (cc02.y != null) {
                    Object object5 = object;
                    if (((cc0)object).y == null) {
                        cc0 cc03 = ((cc0)object).a().a(cc02.y).a();
                    }
                }
                n18 = n14;
                int n24 = n13;
                n17 = n16;
                n15 = n23;
                if (gv02.a((cc0)cc02, (cc0)var20_14).d != 0) {
                    n17 = var20_14.r;
                    n15 = n17 != -1 && var20_14.s != -1 ? 0 : 1;
                    n15 = n23 | n15;
                    n18 = Math.max(n14, n17);
                    n24 = Math.max(n13, var20_14.s);
                    n17 = Math.max(n16, pv0.b((cc0)var20_14, gv02));
                }
                n14 = n18;
                n13 = n24;
                n16 = n17;
                n23 = n15;
            }
            if (n23 == 0) {
                n15 = n16;
                n23 = n13;
                n10 = n14;
            } else {
                void var20_24;
                block30: {
                    StringBuilder stringBuilder = new StringBuilder("Resolutions unknown. Codec max resolution: ");
                    stringBuilder.append(n14);
                    stringBuilder.append("x");
                    stringBuilder.append(n13);
                    zs0.d((String)"MediaCodecVideoRenderer", (String)stringBuilder.toString());
                    n10 = cc02.s;
                    n17 = cc02.r;
                    n23 = n10 > n17 ? 1 : 0;
                    n15 = n23 != 0 ? n10 : n17;
                    if (n23 != 0) {
                        n10 = n17;
                    }
                    f12 = (float)n10 / (float)n15;
                    for (int n25 : r1) {
                        n18 = (int)((float)n25 * f12);
                        if (n25 <= n15 || n18 <= n10) break;
                        if (m92.a >= 21) {
                            int n26 = n23 != 0 ? n18 : n25;
                            if (n23 != 0) {
                                n18 = n25;
                            }
                            object = gv02.a(n26, n18);
                            float f13 = cc02.t;
                            if (!gv02.a(((Point)object).x, ((Point)object).y, (double)f13)) continue;
                            Object object6 = object;
                            break block30;
                        }
                        try {
                            int n27;
                            n25 = (n25 + 15) / 16 * 16;
                            n18 = (n18 + 15) / 16 * 16;
                            if (n25 * n18 > mv0.a()) continue;
                            n10 = n23 != 0 ? n18 : n25;
                            if (n23 == 0) {
                                n27 = n18;
                            }
                            Point point = new Point(n10, n27);
                        }
                        catch (mv0.b b10) {}
                        break;
                    }
                    Object var20_23 = null;
                }
                object = object2;
                n10 = n14;
                n23 = n13;
                n15 = n16;
                object2 = object;
                if (var20_24 != null) {
                    n10 = Math.max(n14, var20_24.x);
                    n23 = Math.max(n13, var20_24.y);
                    n15 = Math.max(n16, pv0.a(cc02.a().o(n10).f(n23).a(), gv02));
                    object2 = new StringBuilder("Codec max resolution adjusted to: ");
                    ((StringBuilder)object2).append(n10);
                    ((StringBuilder)object2).append("x");
                    ((StringBuilder)object2).append(n23);
                    zs0.d((String)"MediaCodecVideoRenderer", (String)((StringBuilder)object2).toString());
                    object2 = object;
                }
            }
            object = new /* Unavailable Anonymous Inner Class!! */;
            Object object7 = object2;
            object2 = object;
        }
        this.N0 = object2;
        boolean bl2 = this.M0;
        n16 = this.m1 ? this.n1 : 0;
        object = new MediaFormat();
        object.setString("mime", (String)var20_27);
        object.setInteger("width", cc02.r);
        object.setInteger("height", cc02.s);
        List<byte[]> list = cc02.o;
        for (n13 = 0; n13 < list.size(); ++n13) {
            object.setByteBuffer(fe.a((String)"csd-", (int)n13), ByteBuffer.wrap(list.get(n13)));
        }
        f12 = cc02.t;
        if (f12 != -1.0f) {
            object.setFloat("frame-rate", f12);
        }
        dw0.a((MediaFormat)object, (String)"rotation-degrees", (int)cc02.u);
        fq fq2 = cc02.y;
        if (fq2 != null) {
            dw0.a((MediaFormat)object, (String)"color-transfer", (int)fq2.d);
            dw0.a((MediaFormat)object, (String)"color-standard", (int)fq2.b);
            dw0.a((MediaFormat)object, (String)"color-range", (int)fq2.c);
            byte[] byArray = fq2.e;
            if (byArray != null) {
                object.setByteBuffer("hdr-static-info", ByteBuffer.wrap(byArray));
            }
        }
        if ("video/dolby-vision".equals(cc02.m) && (pair = mv0.b((cc0)cc02)) != null) {
            dw0.a((MediaFormat)object, (String)"profile", (int)((Integer)pair.first));
        }
        object.setInteger("max-width", object2.a);
        object.setInteger("max-height", object2.b);
        dw0.a((MediaFormat)object, (String)"max-input-size", (int)object2.c);
        if (m92.a >= 23) {
            object.setInteger("priority", 0);
            if (f11 != -1.0f) {
                object.setFloat("operating-rate", f11);
            }
        }
        if (bl2) {
            object.setInteger("no-post-process", 1);
            object.setInteger("auto-frc", 0);
        }
        if (n16 != 0) {
            object.setFeatureEnabled("tunneled-playback", true);
            object.setInteger("audio-session-id", n16);
        }
        if (this.Q0 != null) return cv0.a.a((gv0)gv02, (MediaFormat)object, (cc0)cc02, (Surface)this.Q0, (MediaCrypto)mediaCrypto);
        if (!this.b(gv02)) throw new IllegalStateException();
        if (this.R0 == null) {
            this.R0 = oh1.a((Context)this.H0, (boolean)gv02.f);
        }
        this.Q0 = this.R0;
        return cv0.a.a((gv0)gv02, (MediaFormat)object, (cc0)cc02, (Surface)this.Q0, (MediaCrypto)mediaCrypto);
    }

    @Override
    protected final fv0 a(IllegalStateException illegalStateException, @Nullable gv0 gv02) {
        return new ov0(illegalStateException, gv02, this.Q0);
    }

    @Override
    @Nullable
    protected final ly a(dc0 dc02) throws g60 {
        ly ly3 = super.a(dc02);
        this.J0.a(dc02.b, ly3);
        return ly3;
    }

    @Override
    protected final ly a(gv0 object, cc0 cc02, cc0 cc03) {
        int n10;
        int n13;
        ly ly3;
        block5: {
            block4: {
                ly3 = object.a(cc02, cc03);
                n13 = ly3.e;
                n10 = cc03.r;
                a a14 = this.N0;
                if (n10 > a14.a) break block4;
                n10 = n13;
                if (cc03.s <= a14.b) break block5;
            }
            n10 = n13 | 0x100;
        }
        n13 = n10;
        if (pv0.b(cc03, object) > this.N0.c) {
            n13 = n10 | 0x40;
        }
        object = object.a;
        n10 = n13 != 0 ? 0 : ly3.d;
        return new ly((String)object, cc02, cc03, n10, n13);
    }

    @Override
    protected final ArrayList a(kv0 kv02, cc0 cc02, boolean bl2) throws mv0.b {
        return mv0.a((xj0)pv0.a(kv02, cc02, bl2, this.m1), (cc0)cc02);
    }

    @Override
    public final void a(float f11, float f12) throws g60 {
        super.a(f11, f12);
        this.I0.b(f11);
    }

    protected final void a(int n10, int n13) {
        hy hy3 = this.B0;
        hy3.h += n10;
        hy3.g += (n10 += n13);
        this.a1 += n10;
        this.b1 = n10 = this.b1 + n10;
        hy3.i = Math.max(n10, hy3.i);
        n13 = this.L0;
        if (n13 > 0 && (n10 = this.a1) >= n13 && n10 > 0) {
            long l10 = SystemClock.elapsedRealtime();
            long l11 = this.Z0;
            this.J0.a(this.a1, l10 - l11);
            this.a1 = 0;
            this.Z0 = l10;
        }
    }

    @Override
    public final void a(int n10, @Nullable Object object) throws g60 {
        if (n10 != 1) {
            if (n10 != 7) {
                if (n10 != 10) {
                    if (n10 != 4) {
                        if (n10 == 5) {
                            this.I0.a(((Integer)object).intValue());
                        }
                    } else {
                        this.T0 = (Integer)object;
                        object = this.E();
                        if (object != null) {
                            object.a(this.T0);
                        }
                    }
                } else {
                    n10 = (Integer)object;
                    if (this.n1 != n10) {
                        this.n1 = n10;
                        if (this.m1) {
                            this.N();
                        }
                    }
                }
            } else {
                this.p1 = (df2)object;
            }
        } else {
            this.a(object);
        }
    }

    @Override
    protected final void a(long l10, boolean bl2) throws g60 {
        super.a(l10, bl2);
        this.T();
        this.I0.a();
        l10 = -9223372036854775807L;
        this.d1 = -9223372036854775807L;
        this.X0 = -9223372036854775807L;
        this.b1 = 0;
        if (bl2) {
            if (this.K0 > 0L) {
                l10 = SystemClock.elapsedRealtime() + this.K0;
            }
            this.Y0 = l10;
        } else {
            this.Y0 = -9223372036854775807L;
        }
    }

    @Override
    protected final void a(cc0 cc02, @Nullable MediaFormat mediaFormat) {
        float f11;
        int n10;
        cv0 cv02 = this.E();
        if (cv02 != null) {
            cv02.a(this.T0);
        }
        if (this.m1) {
            this.h1 = cc02.r;
            this.i1 = cc02.s;
        } else {
            mediaFormat.getClass();
            n10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top") ? 1 : 0;
            int n13 = n10 != 0 ? mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left") + 1 : mediaFormat.getInteger("width");
            this.h1 = n13;
            n10 = n10 != 0 ? mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top") + 1 : mediaFormat.getInteger("height");
            this.i1 = n10;
        }
        this.k1 = f11 = cc02.v;
        if (m92.a >= 21) {
            n10 = cc02.u;
            if (n10 == 90 || n10 == 270) {
                n10 = this.h1;
                this.h1 = this.i1;
                this.i1 = n10;
                this.k1 = 1.0f / f11;
            }
        } else {
            this.j1 = cc02.u;
        }
        this.I0.a(cc02.t);
    }

    protected final void a(cv0 cv02, int n10) {
        this.X();
        x52.a((String)"releaseOutputBuffer");
        cv02.a(true, n10);
        x52.a();
        this.e1 = SystemClock.elapsedRealtime() * 1000L;
        cv02 = this.B0;
        ++cv02.e;
        this.b1 = 0;
        this.W0 = true;
        if (!this.U0) {
            this.U0 = true;
            this.J0.a(this.Q0);
            this.S0 = true;
        }
    }

    @RequiresApi(value=21)
    protected final void a(cv0 cv02, int n10, long l10) {
        this.X();
        x52.a((String)"releaseOutputBuffer");
        cv02.a(n10, l10);
        x52.a();
        this.e1 = SystemClock.elapsedRealtime() * 1000L;
        cv02 = this.B0;
        ++cv02.e;
        this.b1 = 0;
        this.W0 = true;
        if (!this.U0) {
            this.U0 = true;
            this.J0.a(this.Q0);
            this.S0 = true;
        }
    }

    @Override
    @TargetApi(value=29)
    protected final void a(jy object) throws g60 {
        if (!this.P0) {
            return;
        }
        ByteBuffer byteBuffer = object.g;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte by = byteBuffer.get();
            short s13 = byteBuffer.getShort();
            short s14 = byteBuffer.getShort();
            byte by3 = byteBuffer.get();
            byte by4 = byteBuffer.get();
            byteBuffer.position(0);
            if (by == -75 && s13 == 60 && s14 == 1 && by3 == 4 && by4 == 0) {
                object = new byte[byteBuffer.remaining()];
                byteBuffer.get((byte[])object);
                byteBuffer.position(0);
                byteBuffer = this.E();
                Bundle bundle = new Bundle();
                bundle.putByteArray("hdr10-plus-info", (byte[])object);
                byteBuffer.a(bundle);
            }
        }
    }

    @Override
    protected final void a(Exception exception) {
        zs0.a((String)"MediaCodecVideoRenderer", (String)"Video codec error", (Throwable)exception);
        this.J0.b(exception);
    }

    @Override
    protected final void a(String string2) {
        this.J0.a(string2);
    }

    @Override
    protected final void a(String string2, long l10, long l11) {
        this.J0.a(string2, l10, l11);
        this.O0 = pv0.b(string2);
        string2 = this.F();
        string2.getClass();
        this.P0 = string2.a();
        if (m92.a >= 23 && this.m1) {
            string2 = this.E();
            string2.getClass();
            this.o1 = new b(this, (cv0)string2);
        }
    }

    @Override
    protected final void a(boolean bl2, boolean bl3) throws g60 {
        super.a(bl2, bl3);
        bl2 = this.p().a;
        if (bl2 && this.n1 == 0) {
            throw new IllegalStateException();
        }
        if (this.m1 != bl2) {
            this.m1 = bl2;
            this.N();
        }
        this.J0.b(this.B0);
        this.V0 = bl3;
        this.W0 = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected final boolean a(long l10, long l11, @Nullable cv0 cv02, @Nullable ByteBuffer byteBuffer, int n10, int n13, int n14, long l13, boolean bl2, boolean bl3, cc0 cc02) throws g60 {
        long l14;
        cv02.getClass();
        if (this.X0 == -9223372036854775807L) {
            this.X0 = l10;
        }
        if (l13 != this.d1) {
            this.I0.b(l13);
            this.d1 = l13;
        }
        long l15 = this.I();
        long l16 = l13 - l15;
        if (bl2 && !bl3) {
            x52.a((String)"skipVideoBuffer");
            cv02.a(false, n10);
            x52.a();
            cv02 = this.B0;
            ++cv02.f;
            return true;
        }
        double d14 = this.J();
        n13 = this.getState() == 2 ? 1 : 0;
        long l17 = SystemClock.elapsedRealtime() * 1000L;
        l13 = l14 = (long)((double)(l13 - l10) / d14);
        if (n13 != 0) {
            l13 = l14 - (l17 - l11);
        }
        if (this.Q0 == this.R0) {
            if (l13 >= -30000L) return false;
            x52.a((String)"skipVideoBuffer");
            cv02.a(false, n10);
            x52.a();
            cv02 = this.B0;
            ++cv02.f;
            this.f(l13);
            return true;
        }
        l11 = this.e1;
        n14 = (!this.W0 ? n13 != 0 || this.V0 : !this.U0) ? 1 : 0;
        if (this.Y0 == -9223372036854775807L && l10 >= l15 && (n14 != 0 || n13 != 0 && l13 < -30000L && l17 - l11 > 100000L)) {
            l10 = System.nanoTime();
            this.a(l16, l10, cc02);
            if (m92.a >= 21) {
                this.a(cv02, n10, l10);
            } else {
                this.a(cv02, n10);
            }
            this.f(l13);
            return true;
        }
        if (n13 == 0) return false;
        if (l10 == this.X0) {
            return false;
        }
        l14 = System.nanoTime();
        l11 = this.I0.a(l13 * 1000L + l14);
        l13 = (l11 - l14) / 1000L;
        bl2 = this.Y0 != -9223372036854775807L;
        if (l13 < -500000L && !bl3 && this.b(l10, bl2)) {
            return false;
        }
        if (l13 < -30000L && !bl3) {
            if (bl2) {
                x52.a((String)"skipVideoBuffer");
                cv02.a(false, n10);
                x52.a();
                cv02 = this.B0;
                ++cv02.f;
            } else {
                x52.a((String)"dropVideoBuffer");
                cv02.a(false, n10);
                x52.a();
                this.a(0, 1);
            }
            this.f(l13);
            return true;
        }
        if (m92.a >= 21) {
            if (l13 >= 50000L) return false;
            this.a(l16, l11, cc02);
            this.a(cv02, n10, l11);
            this.f(l13);
            return true;
        }
        if (l13 >= 30000L) return false;
        if (l13 > 11000L) {
            try {
                Thread.sleep((l13 - 10000L) / 1000L);
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                return false;
            }
        }
        this.a(l16, l11, cc02);
        this.a(cv02, n10);
        this.f(l13);
        return true;
    }

    @Override
    protected final boolean a(gv0 gv02) {
        boolean bl2 = this.Q0 != null || this.b(gv02);
        return bl2;
    }

    @Override
    @CallSuper
    protected final void b(jy jy3) throws g60 {
        boolean bl2 = this.m1;
        if (!bl2) {
            ++this.c1;
        }
        if (m92.a < 23 && bl2) {
            this.e(jy3.f);
        }
    }

    protected final boolean b(long l10, boolean bl2) throws g60 {
        int n10 = this.b(l10);
        if (n10 == 0) {
            return false;
        }
        if (bl2) {
            hy hy3 = this.B0;
            hy3.d += n10;
            hy3.f += this.c1;
        } else {
            hy hy4 = this.B0;
            ++hy4.j;
            this.a(n10, this.c1);
        }
        this.C();
        return true;
    }

    @Override
    @CallSuper
    protected final void c(long l10) {
        super.c(l10);
        if (!this.m1) {
            --this.c1;
        }
    }

    @Override
    public final boolean d() {
        oh1 oh12;
        if (super.d() && (this.U0 || (oh12 = this.R0) != null && this.Q0 == oh12 || this.E() == null || this.m1)) {
            this.Y0 = -9223372036854775807L;
            return true;
        }
        if (this.Y0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.Y0) {
            return true;
        }
        this.Y0 = -9223372036854775807L;
        return false;
    }

    protected final void e(long l10) throws g60 {
        this.d(l10);
        this.X();
        hy hy3 = this.B0;
        ++hy3.e;
        this.W0 = true;
        if (!this.U0) {
            this.U0 = true;
            this.J0.a(this.Q0);
            this.S0 = true;
        }
        this.c(l10);
    }

    protected final void f(long l10) {
        hy hy3 = this.B0;
        hy3.k += l10;
        ++hy3.l;
        this.f1 += l10;
        ++this.g1;
    }

    @Override
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override
    protected final void u() {
        this.l1 = null;
        this.T();
        this.S0 = false;
        this.o1 = null;
        try {
            super.u();
            return;
        }
        finally {
            this.J0.a(this.B0);
        }
    }

    @Override
    @TargetApi(value=17)
    protected final void v() {
        block4: {
            oh1 oh12;
            block5: {
                try {
                    super.v();
                    oh12 = this.R0;
                    if (oh12 == null) break block4;
                    if (this.Q0 != oh12) break block5;
                    this.Q0 = null;
                }
                catch (Throwable throwable) {
                    if (this.R0 != null) {
                        Surface surface = this.Q0;
                        oh1 oh13 = this.R0;
                        if (surface == oh13) {
                            this.Q0 = null;
                        }
                        oh13.release();
                        this.R0 = null;
                    }
                    throw throwable;
                }
            }
            oh12.release();
            this.R0 = null;
        }
    }

    @Override
    protected final void w() {
        this.a1 = 0;
        this.Z0 = SystemClock.elapsedRealtime();
        this.e1 = SystemClock.elapsedRealtime() * 1000L;
        this.f1 = 0L;
        this.g1 = 0;
        this.I0.b();
    }

    @Override
    protected final void x() {
        int n10;
        this.Y0 = -9223372036854775807L;
        if (this.a1 > 0) {
            long l10 = SystemClock.elapsedRealtime();
            long l11 = this.Z0;
            this.J0.a(this.a1, l10 - l11);
            this.a1 = 0;
            this.Z0 = l10;
        }
        if ((n10 = this.g1) != 0) {
            this.J0.c(n10, this.f1);
            this.f1 = 0L;
            this.g1 = 0;
        }
        this.I0.c();
    }

    @RequiresApi(value=23)
    private final class b
    implements cv0.c,
    Handler.Callback {
        private final Handler b;
        final pv0 c;

        public b(pv0 pv02, cv0 cv02) {
            this.c = pv02;
            pv02 = m92.a((Handler.Callback)this);
            this.b = pv02;
            cv02.a((cv0.c)this, (Handler)pv02);
        }

        public final void a(long l10) {
            if (m92.a < 30) {
                Message message = Message.obtain((Handler)this.b, (int)0, (int)((int)(l10 >> 32)), (int)((int)l10));
                this.b.sendMessageAtFrontOfQueue(message);
            } else {
                pv0 pv02 = this.c;
                if (this == pv02.o1) {
                    if (l10 == Long.MAX_VALUE) {
                        pv02.Y();
                    } else {
                        try {
                            pv02.e(l10);
                        }
                        catch (g60 g602) {
                            this.c.a(g602);
                        }
                    }
                }
            }
        }

        public final boolean handleMessage(Message object) {
            if (((Message)object).what != 0) {
                return false;
            }
            int n10 = ((Message)object).arg1;
            int n13 = ((Message)object).arg2;
            int n14 = m92.a;
            long l10 = ((long)n10 & 0xFFFFFFFFL) << 32 | 0xFFFFFFFFL & (long)n13;
            object = this.c;
            if (this == ((pv0)object).o1) {
                if (l10 == Long.MAX_VALUE) {
                    ((pv0)object).Y();
                } else {
                    try {
                        ((pv0)object).e(l10);
                    }
                    catch (g60 g602) {
                        this.c.a(g602);
                    }
                }
            }
            return true;
        }
    }
}

