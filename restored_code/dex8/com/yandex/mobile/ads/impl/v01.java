/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.c2
 *  com.yandex.mobile.ads.impl.d2
 *  com.yandex.mobile.ads.impl.gj1
 *  com.yandex.mobile.ads.impl.gm0
 *  com.yandex.mobile.ads.impl.hj1
 *  com.yandex.mobile.ads.impl.ho0
 *  com.yandex.mobile.ads.impl.i2
 *  com.yandex.mobile.ads.impl.k8
 *  com.yandex.mobile.ads.impl.l8
 *  com.yandex.mobile.ads.impl.lm0
 *  com.yandex.mobile.ads.impl.pf2
 *  com.yandex.mobile.ads.impl.u01
 *  com.yandex.mobile.ads.impl.us
 *  com.yandex.mobile.ads.impl.vm0
 *  com.yandex.mobile.ads.impl.zm0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.c2;
import com.yandex.mobile.ads.impl.d2;
import com.yandex.mobile.ads.impl.fj1;
import com.yandex.mobile.ads.impl.gj1;
import com.yandex.mobile.ads.impl.gm0;
import com.yandex.mobile.ads.impl.hj1;
import com.yandex.mobile.ads.impl.ho0;
import com.yandex.mobile.ads.impl.i2;
import com.yandex.mobile.ads.impl.k8;
import com.yandex.mobile.ads.impl.l8;
import com.yandex.mobile.ads.impl.lm0;
import com.yandex.mobile.ads.impl.nf2;
import com.yandex.mobile.ads.impl.pf2;
import com.yandex.mobile.ads.impl.u01;
import com.yandex.mobile.ads.impl.us;
import com.yandex.mobile.ads.impl.vm0;
import com.yandex.mobile.ads.impl.yb2;
import com.yandex.mobile.ads.impl.zm0;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class v01
implements k8,
hj1,
d2 {
    @NotNull
    private final i2 a;
    @NotNull
    private final nf2 b;
    @NotNull
    private final yb2 c;
    @NotNull
    private final u01 d;
    @NotNull
    private final a e;
    @NotNull
    private final fj1 f;
    @Nullable
    private l8 g;
    @Nullable
    private c2 h;

    @JvmOverloads
    public v01(@NotNull Context context, @NotNull lm0 lm02, @NotNull i2 i23, @NotNull gm0 gm02, @NotNull vm0 vm02, @NotNull zm0 zm02, @NotNull nf2 nf22, @NotNull yb2 yb22, @NotNull gj1 gj12) {
        this.a = i23;
        this.b = nf22;
        this.c = yb22;
        this.d = new u01(context, i23, gm02, vm02, zm02, (ho0)yb22);
        this.e = new a(this);
        this.f = gj12.a(lm02, (hj1)this);
    }

    public static final void e(v01 v012) {
        c2 c24 = v012.h;
        if (c24 != null) {
            c24.a(null);
        }
        if ((v012 = v012.h) != null) {
            v012.e();
        }
    }

    public final void a() {
    }

    public final void a(@Nullable ho0 ho02) {
        this.c.a(ho02);
    }

    public final void a(@Nullable l8 l82) {
        this.g = l82;
    }

    public final void a(@NotNull us us3) {
        if (!y.e(us3 = this.d.a(us3), this.h)) {
            c2 c24 = this.h;
            if (c24 != null) {
                c24.a(null);
            }
            if ((c24 = this.h) != null) {
                c24.e();
            }
        }
        us3.a((d2)this);
        us3.g();
        this.h = us3;
    }

    public final void b() {
    }

    public final void b(@NotNull us us3) {
        if (!y.e(us3 = this.d.a(us3), this.h)) {
            c2 c24 = this.h;
            if (c24 != null) {
                c24.a(null);
            }
            if ((c24 = this.h) != null) {
                c24.e();
            }
        }
        us3.a((d2)this);
        us3.d();
        this.h = us3;
    }

    public final void c() {
        this.f.b();
        c2 c24 = this.h;
        if (c24 != null) {
            c24.b();
        }
    }

    public final void d() {
        this.b.c();
    }

    public final void e() {
        this.h = null;
        this.b.e();
    }

    public final void f() {
        this.f.b();
        c2 c24 = this.h;
        if (c24 != null) {
            c24.c();
        }
    }

    public final void g() {
        this.h = null;
        this.b.e();
    }

    public final void prepare() {
        l8 l82 = this.g;
        if (l82 != null) {
            l82.b();
        }
    }

    public final void resume() {
        Object object = this.h;
        if (object != null) {
            if (this.a.a()) {
                this.b.c();
                object.f();
            } else {
                this.b.e();
                object.d();
            }
            object = k0.a;
        } else {
            object = null;
        }
        if (object == null) {
            this.b.e();
        }
    }

    public final void start() {
        this.b.a(this.e);
        this.b.e();
    }

    private final class a
    implements pf2 {
        final v01 a;

        public a(v01 v012) {
            this.a = v012;
        }

        public final void a() {
            this.a.f.b();
            c2 c24 = this.a.h;
            if (c24 != null) {
                c24.c();
            }
        }

        public final void onVideoCompleted() {
            v01.e(this.a);
            this.a.f.b();
            this.a.b.a(null);
            l8 l82 = this.a.g;
            if (l82 != null) {
                l82.c();
            }
        }

        public final void onVideoError() {
            this.a.f.b();
            this.a.b.a(null);
            c2 c24 = this.a.h;
            if (c24 != null) {
                c24.c();
            }
            if ((c24 = this.a.g) != null) {
                c24.a();
            }
        }

        public final void onVideoPaused() {
            this.a.f.b();
        }

        public final void onVideoResumed() {
            this.a.f.a();
        }
    }
}

