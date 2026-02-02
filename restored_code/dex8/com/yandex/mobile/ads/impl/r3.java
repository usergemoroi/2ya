/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ad2
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.ho0
 *  com.yandex.mobile.ads.impl.id2
 *  com.yandex.mobile.ads.impl.k3
 *  com.yandex.mobile.ads.impl.kc2
 *  com.yandex.mobile.ads.impl.zu
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ad2;
import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.ho0;
import com.yandex.mobile.ads.impl.id2;
import com.yandex.mobile.ads.impl.k3;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.yb2;
import com.yandex.mobile.ads.impl.zu;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class r3
implements ad2<co0> {
    @NotNull
    private final ho0 a;
    @NotNull
    private final zu b;
    @Nullable
    private k3 c;

    public r3(@NotNull yb2 yb22, @NotNull zu zu3) {
        this.a = yb22;
        this.b = zu3;
    }

    private final boolean c(kc2<co0> kc22) {
        Object object = this.c;
        object = object != null ? object.c() : null;
        return y.e(object, kc22);
    }

    public final void a(@Nullable k3 k32) {
        this.c = k32;
    }

    public final void a(@NotNull kc2<co0> kc22) {
        this.a.a((co0)kc22.e());
        if (this.c(kc22)) {
            this.b.g();
        }
    }

    public final void a(@NotNull kc2<co0> kc22, float f11) {
        this.a.a((co0)kc22.e(), f11);
    }

    public final void a(@NotNull kc2<co0> kc22, @NotNull id2 id22) {
        this.a.h((co0)kc22.e());
        this.b.a(kc22);
    }

    public final void b(@NotNull kc2<co0> kc22) {
        this.a.c((co0)kc22.e());
        if (this.c(kc22)) {
            this.b.e();
        }
    }

    public final void d(@NotNull kc2<co0> kc22) {
        this.a.j((co0)kc22.e());
    }

    public final void e(@NotNull kc2<co0> kc22) {
        this.a.d((co0)kc22.e());
        if (this.c(kc22)) {
            this.b.c();
        }
    }

    public final void f(@NotNull kc2<co0> kc22) {
        this.a.b((co0)kc22.e());
        if (this.c(kc22)) {
            this.b.d();
        }
    }

    public final void g(@NotNull kc2<co0> kc22) {
        this.a.f((co0)kc22.e());
        if (this.c(kc22)) {
            this.b.f();
        }
    }

    public final void h(@NotNull kc2<co0> t33) {
        k3 k32 = this.c;
        if (k32 != null && (t33 = k32.a(t33)) != null && (t33 = t33.a()) != null) {
            t33.e();
        }
    }

    public final void i(@NotNull kc2<co0> kc22) {
        this.a.e((co0)kc22.e());
        if (this.c(kc22)) {
            this.b.h();
        }
    }

    public final void j(@NotNull kc2<co0> kc22) {
        this.a.g((co0)kc22.e());
        if (this.c(kc22)) {
            this.b.a();
        }
    }

    public final void k(@NotNull kc2<co0> kc22) {
    }

    public final void l(@NotNull kc2<co0> kc22) {
    }
}

