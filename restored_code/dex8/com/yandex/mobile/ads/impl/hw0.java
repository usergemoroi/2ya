/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.dv2
 *  com.yandex.mobile.ads.impl.hw0$a
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.vl
 *  com.yandex.mobile.ads.impl.vl$a
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.bv2;
import com.yandex.mobile.ads.impl.dv2;
import com.yandex.mobile.ads.impl.hw0;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.on1;
import com.yandex.mobile.ads.impl.vl;
import java.util.Arrays;

/*
 * Exception performing whole class analysis ignored.
 */
public final class hw0
implements vl {
    public static final hw0 H = new hw0(new /* Unavailable Anonymous Inner Class!! */);
    public static final vl.a<hw0> I = new bv2();
    @Nullable
    public final CharSequence A;
    @Nullable
    public final Integer B;
    @Nullable
    public final Integer C;
    @Nullable
    public final CharSequence D;
    @Nullable
    public final CharSequence E;
    @Nullable
    public final CharSequence F;
    @Nullable
    public final Bundle G;
    @Nullable
    public final CharSequence b;
    @Nullable
    public final CharSequence c;
    @Nullable
    public final CharSequence d;
    @Nullable
    public final CharSequence e;
    @Nullable
    public final CharSequence f;
    @Nullable
    public final CharSequence g;
    @Nullable
    public final CharSequence h;
    @Nullable
    public final on1 i;
    @Nullable
    public final on1 j;
    @Nullable
    public final byte[] k;
    @Nullable
    public final Integer l;
    @Nullable
    public final Uri m;
    @Nullable
    public final Integer n;
    @Nullable
    public final Integer o;
    @Nullable
    public final Integer p;
    @Nullable
    public final Boolean q;
    @Deprecated
    @Nullable
    public final Integer r;
    @Nullable
    public final Integer s;
    @Nullable
    public final Integer t;
    @Nullable
    public final Integer u;
    @Nullable
    public final Integer v;
    @Nullable
    public final Integer w;
    @Nullable
    public final Integer x;
    @Nullable
    public final CharSequence y;
    @Nullable
    public final CharSequence z;

    private hw0(a a13) {
        Integer n10;
        this.b = a.f(a13);
        this.c = a.g(a13);
        this.d = a.h(a13);
        this.e = a.i(a13);
        this.f = a.j(a13);
        this.g = a.k(a13);
        this.h = a.l(a13);
        this.i = a.m(a13);
        this.j = a.n(a13);
        this.k = a.o(a13);
        this.l = a.p(a13);
        this.m = a.q(a13);
        this.n = a.r(a13);
        this.o = a.s(a13);
        this.p = a.t(a13);
        this.q = a.u(a13);
        this.r = n10 = a.v(a13);
        this.s = n10;
        this.t = a.w(a13);
        this.u = a.x(a13);
        this.v = a.y(a13);
        this.w = a.z(a13);
        this.x = a.A(a13);
        this.y = a.B(a13);
        this.z = a.C(a13);
        this.A = a.D(a13);
        this.B = a.E(a13);
        this.C = a.a(a13);
        this.D = a.b(a13);
        this.E = a.c(a13);
        this.F = a.d(a13);
        this.G = a.e(a13);
    }

    /* synthetic */ hw0(a a13, dv2 dv22) {
        this(a13);
    }

    private static hw0 a(Bundle bundle) {
        a a13 = new /* Unavailable Anonymous Inner Class!! */;
        a.K(a13, (CharSequence)bundle.getCharSequence(Integer.toString(0, 36)));
        a.L(a13, (CharSequence)bundle.getCharSequence(Integer.toString(1, 36)));
        a.M(a13, (CharSequence)bundle.getCharSequence(Integer.toString(2, 36)));
        a.N(a13, (CharSequence)bundle.getCharSequence(Integer.toString(3, 36)));
        a.O(a13, (CharSequence)bundle.getCharSequence(Integer.toString(4, 36)));
        a.P(a13, (CharSequence)bundle.getCharSequence(Integer.toString(5, 36)));
        a.Q(a13, (CharSequence)bundle.getCharSequence(Integer.toString(6, 36)));
        byte[] byArray = bundle.getByteArray(Integer.toString(10, 36));
        boolean bl2 = bundle.containsKey(Integer.toString(29, 36));
        byte[] byArray2 = null;
        Integer n10 = bl2 ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
        if (byArray != null) {
            byArray2 = (byte[])byArray.clone();
        }
        a.T(a13, byArray2);
        a.U(a13, (Integer)n10);
        a.V(a13, (Uri)((Uri)bundle.getParcelable(Integer.toString(11, 36))));
        a.g0(a13, (CharSequence)bundle.getCharSequence(Integer.toString(22, 36)));
        a.h0(a13, (CharSequence)bundle.getCharSequence(Integer.toString(23, 36)));
        a.i0(a13, (CharSequence)bundle.getCharSequence(Integer.toString(24, 36)));
        a.G(a13, (CharSequence)bundle.getCharSequence(Integer.toString(27, 36)));
        a.H(a13, (CharSequence)bundle.getCharSequence(Integer.toString(28, 36)));
        a.I(a13, (CharSequence)bundle.getCharSequence(Integer.toString(30, 36)));
        a.J(a13, (Bundle)bundle.getBundle(Integer.toString(1000, 36)));
        if (bundle.containsKey(Integer.toString(8, 36)) && (n10 = bundle.getBundle(Integer.toString(8, 36))) != null) {
            a.R(a13, (on1)((on1)on1.b.fromBundle((Bundle)n10)));
        }
        if (bundle.containsKey(Integer.toString(9, 36)) && (n10 = bundle.getBundle(Integer.toString(9, 36))) != null) {
            a.S(a13, (on1)((on1)on1.b.fromBundle((Bundle)n10)));
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            a.W(a13, (Integer)bundle.getInt(Integer.toString(12, 36)));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            a.X(a13, (Integer)bundle.getInt(Integer.toString(13, 36)));
        }
        if (bundle.containsKey(Integer.toString(14, 36))) {
            a.Y(a13, (Integer)bundle.getInt(Integer.toString(14, 36)));
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            a.Z(a13, (Boolean)bundle.getBoolean(Integer.toString(15, 36)));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            a.a0(a13, (Integer)bundle.getInt(Integer.toString(16, 36)));
        }
        if (bundle.containsKey(Integer.toString(17, 36))) {
            a.b0(a13, (Integer)bundle.getInt(Integer.toString(17, 36)));
        }
        if (bundle.containsKey(Integer.toString(18, 36))) {
            a.c0(a13, (Integer)bundle.getInt(Integer.toString(18, 36)));
        }
        if (bundle.containsKey(Integer.toString(19, 36))) {
            a.d0(a13, (Integer)bundle.getInt(Integer.toString(19, 36)));
        }
        if (bundle.containsKey(Integer.toString(20, 36))) {
            a.e0(a13, (Integer)bundle.getInt(Integer.toString(20, 36)));
        }
        if (bundle.containsKey(Integer.toString(21, 36))) {
            a.f0(a13, (Integer)bundle.getInt(Integer.toString(21, 36)));
        }
        if (bundle.containsKey(Integer.toString(25, 36))) {
            a.j0(a13, (Integer)bundle.getInt(Integer.toString(25, 36)));
        }
        if (bundle.containsKey(Integer.toString(26, 36))) {
            a.F(a13, (Integer)bundle.getInt(Integer.toString(26, 36)));
        }
        return new hw0(a13);
    }

    public static /* synthetic */ hw0 b(Bundle bundle) {
        return hw0.a(bundle);
    }

    public final a a() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && hw0.class == object.getClass()) {
            object = (hw0)object;
            if (!(m92.a((Object)this.b, (Object)((hw0)object).b) && m92.a((Object)this.c, (Object)((hw0)object).c) && m92.a((Object)this.d, (Object)((hw0)object).d) && m92.a((Object)this.e, (Object)((hw0)object).e) && m92.a((Object)this.f, (Object)((hw0)object).f) && m92.a((Object)this.g, (Object)((hw0)object).g) && m92.a((Object)this.h, (Object)((hw0)object).h) && m92.a((Object)this.i, (Object)((hw0)object).i) && m92.a((Object)this.j, (Object)((hw0)object).j) && Arrays.equals(this.k, ((hw0)object).k) && m92.a((Object)this.l, (Object)((hw0)object).l) && m92.a((Object)this.m, (Object)((hw0)object).m) && m92.a((Object)this.n, (Object)((hw0)object).n) && m92.a((Object)this.o, (Object)((hw0)object).o) && m92.a((Object)this.p, (Object)((hw0)object).p) && m92.a((Object)this.q, (Object)((hw0)object).q) && m92.a((Object)this.s, (Object)((hw0)object).s) && m92.a((Object)this.t, (Object)((hw0)object).t) && m92.a((Object)this.u, (Object)((hw0)object).u) && m92.a((Object)this.v, (Object)((hw0)object).v) && m92.a((Object)this.w, (Object)((hw0)object).w) && m92.a((Object)this.x, (Object)((hw0)object).x) && m92.a((Object)this.y, (Object)((hw0)object).y) && m92.a((Object)this.z, (Object)((hw0)object).z) && m92.a((Object)this.A, (Object)((hw0)object).A) && m92.a((Object)this.B, (Object)((hw0)object).B) && m92.a((Object)this.C, (Object)((hw0)object).C) && m92.a((Object)this.D, (Object)((hw0)object).D) && m92.a((Object)this.E, (Object)((hw0)object).E) && m92.a((Object)this.F, (Object)((hw0)object).F))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Arrays.hashCode(this.k), this.l, this.m, this.n, this.o, this.p, this.q, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F});
    }
}

