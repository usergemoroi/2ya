/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.cc0$a
 *  com.yandex.mobile.ads.impl.k01
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.tr2
 *  com.yandex.mobile.ads.impl.vl
 *  com.yandex.mobile.ads.impl.vl$a
 *  com.yandex.mobile.ads.impl.wl
 *  com.yandex.mobile.ads.impl.y30
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.cc0;
import com.yandex.mobile.ads.impl.fq;
import com.yandex.mobile.ads.impl.k01;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.rr2;
import com.yandex.mobile.ads.impl.tr2;
import com.yandex.mobile.ads.impl.vl;
import com.yandex.mobile.ads.impl.wl;
import com.yandex.mobile.ads.impl.y30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
public final class cc0
implements vl {
    private static final cc0 H = new cc0(new /* Unavailable Anonymous Inner Class!! */);
    public static final vl.a<cc0> I = new rr2();
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    private int G;
    @Nullable
    public final String b;
    @Nullable
    public final String c;
    @Nullable
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    @Nullable
    public final String j;
    @Nullable
    public final k01 k;
    @Nullable
    public final String l;
    @Nullable
    public final String m;
    public final int n;
    public final List<byte[]> o;
    @Nullable
    public final y30 p;
    public final long q;
    public final int r;
    public final int s;
    public final float t;
    public final int u;
    public final float v;
    @Nullable
    public final byte[] w;
    public final int x;
    @Nullable
    public final fq y;
    public final int z;

    private cc0(a a12) {
        float f10;
        y30 y302;
        int n10;
        int n12;
        this.b = a.e(a12);
        this.c = a.f(a12);
        this.d = m92.e((String)a.g(a12));
        this.e = a.h(a12);
        this.f = a.i(a12);
        this.g = n12 = a.j(a12);
        this.h = n10 = a.k(a12);
        if (n10 != -1) {
            n12 = n10;
        }
        this.i = n12;
        this.j = a.l(a12);
        this.k = a.m(a12);
        this.l = a.n(a12);
        this.m = a.o(a12);
        this.n = a.p(a12);
        y30 y303 = y302 = a.q(a12);
        if (y302 == null) {
            y303 = Collections.emptyList();
        }
        this.o = y303;
        this.p = y303 = a.r(a12);
        this.q = a.s(a12);
        this.r = a.t(a12);
        this.s = a.u(a12);
        this.t = a.v(a12);
        int n13 = a.w(a12);
        n10 = 0;
        n12 = n13;
        if (n13 == -1) {
            n12 = 0;
        }
        this.u = n12;
        float f11 = f10 = a.x(a12);
        if (f10 == -1.0f) {
            f11 = 1.0f;
        }
        this.v = f11;
        this.w = a.y(a12);
        this.x = a.z(a12);
        this.y = a.A(a12);
        this.z = a.B(a12);
        this.A = a.C(a12);
        this.B = a.D(a12);
        n12 = n13 = a.a(a12);
        if (n13 == -1) {
            n12 = 0;
        }
        this.C = n12;
        n12 = a.b(a12);
        if (n12 == -1) {
            n12 = n10;
        }
        this.D = n12;
        this.E = a.c(a12);
        n12 = a.d(a12);
        this.F = n12 == 0 && y303 != null ? 1 : n12;
    }

    /* synthetic */ cc0(a a12, tr2 tr22) {
        this(a12);
    }

    private static cc0 a(Bundle bundle) {
        int n10;
        Object object;
        a a12 = new /* Unavailable Anonymous Inner Class!! */;
        if (bundle != null) {
            object = wl.class.getClassLoader();
            n10 = m92.a;
            bundle.setClassLoader((ClassLoader)object);
        }
        n10 = 0;
        object = bundle.getString(Integer.toString(0, 36));
        cc0 cc02 = H;
        Object object2 = cc02.b;
        if (object == null) {
            object = object2;
        }
        a.I(a12, (String)object);
        object2 = bundle.getString(Integer.toString(1, 36));
        object = cc02.c;
        if (object2 != null) {
            object = object2;
        }
        a.J(a12, (String)object);
        object = bundle.getString(Integer.toString(2, 36));
        object2 = cc02.d;
        if (object == null) {
            object = object2;
        }
        a.K(a12, (String)object);
        a.L(a12, (int)bundle.getInt(Integer.toString(3, 36), cc02.e));
        a.M(a12, (int)bundle.getInt(Integer.toString(4, 36), cc02.f));
        a.N(a12, (int)bundle.getInt(Integer.toString(5, 36), cc02.g));
        a.O(a12, (int)bundle.getInt(Integer.toString(6, 36), cc02.h));
        object = bundle.getString(Integer.toString(7, 36));
        object2 = cc02.j;
        if (object == null) {
            object = object2;
        }
        a.P(a12, (String)object);
        object2 = (k01)bundle.getParcelable(Integer.toString(8, 36));
        object = cc02.k;
        if (object2 != null) {
            object = object2;
        }
        a.Q(a12, (k01)object);
        object2 = bundle.getString(Integer.toString(9, 36));
        object = cc02.l;
        if (object2 != null) {
            object = object2;
        }
        a.R(a12, (String)object);
        object = bundle.getString(Integer.toString(10, 36));
        object2 = cc02.m;
        if (object == null) {
            object = object2;
        }
        a.S(a12, (String)object);
        a.T(a12, (int)bundle.getInt(Integer.toString(11, 36), cc02.n));
        object = new ArrayList<Object>();
        while (true) {
            object2 = new StringBuilder();
            ((StringBuilder)object2).append(Integer.toString(12, 36));
            ((StringBuilder)object2).append("_");
            ((StringBuilder)object2).append(Integer.toString(n10, 36));
            object2 = bundle.getByteArray(((StringBuilder)object2).toString());
            if (object2 == null) {
                a.U(a12, object);
                a.V(a12, (y30)((y30)bundle.getParcelable(Integer.toString(13, 36))));
                object2 = Integer.toString(14, 36);
                object = H;
                a.W(a12, (long)bundle.getLong((String)object2, ((cc0)object).q));
                a.X(a12, (int)bundle.getInt(Integer.toString(15, 36), ((cc0)object).r));
                a.Y(a12, (int)bundle.getInt(Integer.toString(16, 36), ((cc0)object).s));
                a.Z(a12, (float)bundle.getFloat(Integer.toString(17, 36), ((cc0)object).t));
                a.a0(a12, (int)bundle.getInt(Integer.toString(18, 36), ((cc0)object).u));
                a.b0(a12, (float)bundle.getFloat(Integer.toString(19, 36), ((cc0)object).v));
                a.c0(a12, (byte[])bundle.getByteArray(Integer.toString(20, 36)));
                a.d0(a12, (int)bundle.getInt(Integer.toString(21, 36), ((cc0)object).x));
                object2 = bundle.getBundle(Integer.toString(22, 36));
                if (object2 != null) {
                    a.e0(a12, (fq)((fq)fq.g.fromBundle((Bundle)object2)));
                }
                a.f0(a12, (int)bundle.getInt(Integer.toString(23, 36), ((cc0)object).z));
                a.g0(a12, (int)bundle.getInt(Integer.toString(24, 36), ((cc0)object).A));
                a.h0(a12, (int)bundle.getInt(Integer.toString(25, 36), ((cc0)object).B));
                a.E(a12, (int)bundle.getInt(Integer.toString(26, 36), ((cc0)object).C));
                a.F(a12, (int)bundle.getInt(Integer.toString(27, 36), ((cc0)object).D));
                a.G(a12, (int)bundle.getInt(Integer.toString(28, 36), ((cc0)object).E));
                a.H(a12, (int)bundle.getInt(Integer.toString(29, 36), ((cc0)object).F));
                return new cc0(a12);
            }
            ((ArrayList)object).add(object2);
            ++n10;
        }
    }

    public static /* synthetic */ cc0 b(Bundle bundle) {
        return cc0.a(bundle);
    }

    public final a a() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public final cc0 a(int n10) {
        a a12 = new /* Unavailable Anonymous Inner Class!! */;
        a.H(a12, (int)n10);
        return new cc0(a12);
    }

    public final boolean a(cc0 cc02) {
        if (this.o.size() != cc02.o.size()) {
            return false;
        }
        for (int i14 = 0; i14 < this.o.size(); ++i14) {
            if (Arrays.equals(this.o.get(i14), cc02.o.get(i14))) continue;
            return false;
        }
        return true;
    }

    public final int b() {
        int n10;
        int n12 = this.r;
        int n13 = n10 = -1;
        if (n12 != -1) {
            n13 = this.s;
            n13 = n13 == -1 ? n10 : n12 * n13;
        }
        return n13;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && cc0.class == object.getClass()) {
            int n10;
            object = (cc0)object;
            int n12 = this.G;
            if (n12 != 0 && (n10 = ((cc0)object).G) != 0 && n12 != n10) {
                return false;
            }
            if (!(this.e == ((cc0)object).e && this.f == ((cc0)object).f && this.g == ((cc0)object).g && this.h == ((cc0)object).h && this.n == ((cc0)object).n && this.q == ((cc0)object).q && this.r == ((cc0)object).r && this.s == ((cc0)object).s && this.u == ((cc0)object).u && this.x == ((cc0)object).x && this.z == ((cc0)object).z && this.A == ((cc0)object).A && this.B == ((cc0)object).B && this.C == ((cc0)object).C && this.D == ((cc0)object).D && this.E == ((cc0)object).E && this.F == ((cc0)object).F && Float.compare(this.t, ((cc0)object).t) == 0 && Float.compare(this.v, ((cc0)object).v) == 0 && m92.a((Object)this.b, (Object)((cc0)object).b) && m92.a((Object)this.c, (Object)((cc0)object).c) && m92.a((Object)this.j, (Object)((cc0)object).j) && m92.a((Object)this.l, (Object)((cc0)object).l) && m92.a((Object)this.m, (Object)((cc0)object).m) && m92.a((Object)this.d, (Object)((cc0)object).d) && Arrays.equals(this.w, ((cc0)object).w) && m92.a((Object)this.k, (Object)((cc0)object).k) && m92.a((Object)this.y, (Object)((cc0)object).y) && m92.a((Object)this.p, (Object)((cc0)object).p) && this.a((cc0)object))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        if (this.G == 0) {
            String string2 = this.b;
            int n10 = 0;
            int n12 = string2 == null ? 0 : string2.hashCode();
            string2 = this.c;
            int n13 = string2 != null ? string2.hashCode() : 0;
            string2 = this.d;
            int n14 = string2 == null ? 0 : string2.hashCode();
            int n15 = this.e;
            int n16 = this.f;
            int n17 = this.g;
            int n18 = this.h;
            string2 = this.j;
            int n19 = string2 == null ? 0 : string2.hashCode();
            string2 = this.k;
            int n23 = string2 == null ? 0 : string2.hashCode();
            string2 = this.l;
            int n24 = string2 == null ? 0 : string2.hashCode();
            string2 = this.m;
            if (string2 != null) {
                n10 = string2.hashCode();
            }
            int n25 = this.n;
            int n26 = (int)this.q;
            int n27 = this.r;
            int n28 = this.s;
            int n29 = Float.floatToIntBits(this.t);
            int n31 = this.u;
            this.G = ((((((((Float.floatToIntBits(this.v) + ((n29 + (((((((((((((((n12 + 527) * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n23) * 31 + n24) * 31 + n10) * 31 + n25) * 31 + n26) * 31 + n27) * 31 + n28) * 31) * 31 + n31) * 31) * 31 + this.x) * 31 + this.z) * 31 + this.A) * 31 + this.B) * 31 + this.C) * 31 + this.D) * 31 + this.E) * 31 + this.F;
        }
        return this.G;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Format(");
        stringBuilder.append(this.b);
        stringBuilder.append(", ");
        stringBuilder.append(this.c);
        stringBuilder.append(", ");
        stringBuilder.append(this.l);
        stringBuilder.append(", ");
        stringBuilder.append(this.m);
        stringBuilder.append(", ");
        stringBuilder.append(this.j);
        stringBuilder.append(", ");
        stringBuilder.append(this.i);
        stringBuilder.append(", ");
        stringBuilder.append(this.d);
        stringBuilder.append(", [");
        stringBuilder.append(this.r);
        stringBuilder.append(", ");
        stringBuilder.append(this.s);
        stringBuilder.append(", ");
        stringBuilder.append(this.t);
        stringBuilder.append("], [");
        stringBuilder.append(this.z);
        stringBuilder.append(", ");
        stringBuilder.append(this.A);
        stringBuilder.append("])");
        return stringBuilder.toString();
    }
}

