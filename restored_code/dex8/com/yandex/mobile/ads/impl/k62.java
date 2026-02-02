/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.Nullable
 *  com.yandex.mobile.ads.impl.k62$a
 *  com.yandex.mobile.ads.impl.vl
 *  com.yandex.mobile.ads.impl.yj0
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.b62;
import com.yandex.mobile.ads.impl.j62;
import com.yandex.mobile.ads.impl.k62;
import com.yandex.mobile.ads.impl.mx2;
import com.yandex.mobile.ads.impl.vl;
import com.yandex.mobile.ads.impl.xj0;
import com.yandex.mobile.ads.impl.yj0;
import com.yandex.mobile.ads.impl.zj0;
import java.util.HashMap;

/*
 * Exception performing whole class analysis ignored.
 */
public class k62
implements vl {
    public static final k62 B = new k62(new /* Unavailable Anonymous Inner Class!! */);
    public final zj0<Integer> A;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final xj0<String> m;
    public final int n;
    public final xj0<String> o;
    public final int p;
    public final int q;
    public final int r;
    public final xj0<String> s;
    public final xj0<String> t;
    public final int u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final yj0<b62, j62> z;

    static {
        new mx2();
    }

    protected k62(a a13) {
        this.b = a.a(a13);
        this.c = a.b(a13);
        this.d = a.c(a13);
        this.e = a.d(a13);
        this.f = a.e(a13);
        this.g = a.f(a13);
        this.h = a.g(a13);
        this.i = a.h(a13);
        this.j = a.i(a13);
        this.k = a.j(a13);
        this.l = a.k(a13);
        this.m = a.l(a13);
        this.n = a.m(a13);
        this.o = a.n(a13);
        this.p = a.o(a13);
        this.q = a.p(a13);
        this.r = a.q(a13);
        this.s = a.r(a13);
        this.t = a.s(a13);
        this.u = a.t(a13);
        this.v = a.u(a13);
        this.w = a.v(a13);
        this.x = a.w(a13);
        this.y = a.x(a13);
        this.z = yj0.a((HashMap)a.y(a13));
        this.A = zj0.a(a.z(a13));
    }

    public static k62 a(Bundle bundle) {
        return new k62(new /* Unavailable Anonymous Inner Class!! */);
    }

    protected static String a(int n10) {
        return Integer.toString(n10, 36);
    }

    public boolean equals(@Nullable Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (k62)object;
            if (!(this.b == ((k62)object).b && this.c == ((k62)object).c && this.d == ((k62)object).d && this.e == ((k62)object).e && this.f == ((k62)object).f && this.g == ((k62)object).g && this.h == ((k62)object).h && this.i == ((k62)object).i && this.l == ((k62)object).l && this.j == ((k62)object).j && this.k == ((k62)object).k && this.m.equals(((k62)object).m) && this.n == ((k62)object).n && this.o.equals(((k62)object).o) && this.p == ((k62)object).p && this.q == ((k62)object).q && this.r == ((k62)object).r && this.s.equals(((k62)object).s) && this.t.equals(((k62)object).t) && this.u == ((k62)object).u && this.v == ((k62)object).v && this.w == ((k62)object).w && this.x == ((k62)object).x && this.y == ((k62)object).y && this.z.equals(((k62)object).z) && this.A.equals(((k62)object).A))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public int hashCode() {
        int n10 = this.b;
        int n13 = this.c;
        int n14 = this.d;
        int n15 = this.e;
        int n16 = this.f;
        int n17 = this.g;
        int n18 = this.h;
        int n19 = this.i;
        int n23 = this.l;
        int n24 = this.j;
        int n25 = this.k;
        int n26 = this.m.hashCode();
        int n27 = this.n;
        int n28 = this.o.hashCode();
        int n29 = this.p;
        int n31 = this.q;
        int n33 = this.r;
        int n34 = this.s.hashCode();
        int n35 = this.t.hashCode();
        int n36 = this.u;
        int n37 = this.v;
        int n38 = this.w;
        int n39 = this.x;
        int n42 = this.y;
        int n43 = this.z.hashCode();
        return this.A.hashCode() + (n43 + ((((((n35 + (n34 + ((((n28 + ((n26 + (((((((((((n10 + 31) * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n23) * 31 + n24) * 31 + n25) * 31) * 31 + n27) * 31) * 31 + n29) * 31 + n31) * 31 + n33) * 31) * 31) * 31 + n36) * 31 + n37) * 31 + n38) * 31 + n39) * 31 + n42) * 31) * 31;
    }
}

