/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ad2
 *  com.yandex.mobile.ads.impl.ae2
 *  com.yandex.mobile.ads.impl.be2
 *  com.yandex.mobile.ads.impl.gd2
 *  com.yandex.mobile.ads.impl.hd2
 *  com.yandex.mobile.ads.impl.id2
 *  com.yandex.mobile.ads.impl.jd2
 *  com.yandex.mobile.ads.impl.kc2
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.rd2
 *  com.yandex.mobile.ads.impl.xg2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ad2;
import com.yandex.mobile.ads.impl.ae2;
import com.yandex.mobile.ads.impl.be2;
import com.yandex.mobile.ads.impl.gd2;
import com.yandex.mobile.ads.impl.hd2;
import com.yandex.mobile.ads.impl.id2;
import com.yandex.mobile.ads.impl.jd2;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.rd2;
import com.yandex.mobile.ads.impl.ud2;
import com.yandex.mobile.ads.impl.xg2;
import com.yandex.mobile.ads.impl.yg2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zc2<T>
implements jd2 {
    @NotNull
    private final kc2<T> a;
    @NotNull
    private final hd2<T> b;
    @NotNull
    private final rd2 c;
    @NotNull
    private final ud2 d;
    @NotNull
    private final be2 e;
    @NotNull
    private final p4 f;
    @NotNull
    private final xg2 g;
    @NotNull
    private final ad2<T> h;
    @Nullable
    private gd2 i;
    private boolean j;

    public zc2(@NotNull kc2 kc22, @NotNull hd2 hd22, @NotNull rd2 rd22, @NotNull ud2 ud22, @NotNull be2 be22, @NotNull p4 p42, @NotNull yg2 yg22, @NotNull ad2 ad22) {
        this.a = kc22;
        this.b = hd22;
        this.c = rd22;
        this.d = ud22;
        this.e = be22;
        this.f = p42;
        this.g = yg22;
        this.h = ad22;
    }

    public final void a() {
        if (this.j) {
            this.e.b(ae2.e);
            this.g.j();
        }
    }

    public final void a(@NotNull id2 id22) {
        this.j = false;
        ae2 ae22 = this.e.a(ae2.d) ? ae2.j : ae2.k;
        this.e.b(ae22);
        this.c.b();
        this.d.a(id22);
        this.g.a(id22);
        this.h.a(this.a, id22);
        this.b.a(null);
        this.h.h(this.a);
    }

    public final void b() {
        if (this.j) {
            this.e.b(ae2.i);
            this.g.f();
        }
    }

    public final void c() {
        this.j = true;
        this.e.b(ae2.e);
        this.c.a();
        this.i = new gd2(this.b, this.g);
        this.h.e(this.a);
    }

    public final void d() {
        this.j = false;
        this.e.b(ae2.g);
        this.g.b();
        this.c.b();
        this.d.b();
        this.h.j(this.a);
        this.b.a(null);
        this.h.h(this.a);
    }

    public final void e() {
        this.g.g();
        this.j = false;
        this.e.b(ae2.f);
        this.c.b();
        this.d.c();
        this.h.g(this.a);
        this.b.a(null);
        this.h.h(this.a);
    }

    public final void f() {
        this.e.b(ae2.e);
        if (this.j) {
            this.g.c();
        }
        this.c.a();
        this.h.i(this.a);
    }

    public final void g() {
        this.g.e();
        this.j = false;
        this.e.b(ae2.f);
        this.c.b();
        this.d.c();
        this.h.a(this.a);
        this.b.a(null);
        this.h.h(this.a);
    }

    public final void h() {
        this.e.b(ae2.d);
        this.f.a(o4.v);
        this.h.f(this.a);
    }

    public final void i() {
        this.e.b(ae2.h);
        if (this.j) {
            this.g.d();
        }
        this.h.b(this.a);
    }

    public final void onVolumeChanged(float f11) {
        this.g.a(f11);
        gd2 gd22 = this.i;
        if (gd22 != null) {
            gd22.a(f11);
        }
        this.h.a(this.a, f11);
    }
}

