/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.ic2
 *  com.yandex.mobile.ads.impl.id2
 *  com.yandex.mobile.ads.impl.xg2
 *  com.yandex.mobile.ads.impl.xg2$a
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ic2;
import com.yandex.mobile.ads.impl.id2;
import com.yandex.mobile.ads.impl.uq;
import com.yandex.mobile.ads.impl.xg2;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class yg2
implements xg2 {
    @NotNull
    private final xg2 a;
    private boolean b;
    private boolean c;

    public yg2(@NotNull uq uq3) {
        this.a = uq3;
    }

    public final void a() {
        this.a.a();
    }

    public final void a(float f11) {
        this.a.a(f11);
    }

    public final void a(float f11, long l10) {
        this.a.a(f11, l10);
    }

    public final void a(@NotNull View view, @NotNull List<ic2> list) {
        this.a.a(view, list);
        this.b = false;
        this.c = false;
    }

    public final void a(@NotNull id2 id22) {
        this.a.a(id22);
        this.k();
    }

    public final void a(@NotNull xg2.a a14) {
        this.a.a(a14);
    }

    public final void a(@NotNull String string2) {
        this.a.a(string2);
        this.h();
        this.n();
    }

    public final void b() {
        this.a.b();
        this.k();
    }

    public final void c() {
        this.a.c();
    }

    public final void d() {
        this.a.d();
    }

    public final void e() {
        this.a.e();
        this.k();
    }

    public final void f() {
        this.a.f();
    }

    public final void g() {
        this.a.g();
        this.k();
    }

    public final void h() {
        if (!this.b) {
            this.b = true;
            this.a.h();
        }
    }

    public final void i() {
        this.a.i();
    }

    public final void j() {
        this.a.j();
    }

    public final void k() {
        this.a.k();
        this.b = false;
        this.c = false;
    }

    public final void l() {
        this.a.l();
    }

    public final void m() {
        this.a.m();
        this.h();
        this.n();
    }

    public final void n() {
        if (!this.c) {
            this.c = true;
            this.a.n();
        }
    }
}

