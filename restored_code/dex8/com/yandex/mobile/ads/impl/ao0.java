/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ad2
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.id2
 *  com.yandex.mobile.ads.impl.kc2
 *  com.yandex.mobile.ads.impl.pn0$a
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ad2;
import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.id2;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.pn0;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;

public final class ao0
implements ad2<co0>,
pn0.a {
    @NotNull
    private final ad2<co0> a;
    @NotNull
    private final AtomicInteger b;

    public ao0(@NotNull ad2<co0> ad22) {
        this.a = ad22;
        this.b = new AtomicInteger(2);
    }

    private final void m(kc2<co0> kc22) {
        if (this.b.decrementAndGet() == 0) {
            this.a.f(kc22);
        }
    }

    public final void a() {
        this.b.set(2);
    }

    public final void a(@NotNull kc2<co0> kc22) {
        this.a.a(kc22);
    }

    public final void a(@NotNull kc2<co0> kc22, float f10) {
        this.a.a(kc22, f10);
    }

    public final void a(@NotNull kc2<co0> kc22, @NotNull id2 id22) {
        this.a.a(kc22, id22);
    }

    public final void b(@NotNull kc2<co0> kc22) {
        this.a.b(kc22);
    }

    public final void c(@NotNull kc2<co0> kc22) {
        this.m(kc22);
    }

    public final void d(@NotNull kc2<co0> kc22) {
        this.a.d(kc22);
    }

    public final void e(@NotNull kc2<co0> kc22) {
        this.a.e(kc22);
    }

    public final void f(@NotNull kc2<co0> kc22) {
        this.m(kc22);
    }

    public final void g(@NotNull kc2<co0> kc22) {
        this.a.g(kc22);
    }

    public final void h(@NotNull kc2<co0> kc22) {
        this.a.h(kc22);
    }

    public final void i(@NotNull kc2<co0> kc22) {
        this.a.i(kc22);
    }

    public final void j(@NotNull kc2<co0> kc22) {
        this.a.j(kc22);
    }

    public final void k(@NotNull kc2<co0> kc22) {
        this.a.k(kc22);
    }

    public final void l(@NotNull kc2<co0> kc22) {
        this.a.l(kc22);
    }
}

