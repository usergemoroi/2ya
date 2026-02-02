/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.gm0
 *  com.yandex.mobile.ads.impl.hd2
 *  com.yandex.mobile.ads.impl.id2
 *  com.yandex.mobile.ads.impl.jd2
 *  com.yandex.mobile.ads.impl.kc2
 *  com.yandex.mobile.ads.impl.zs
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.gm0;
import com.yandex.mobile.ads.impl.hd2;
import com.yandex.mobile.ads.impl.id2;
import com.yandex.mobile.ads.impl.jd2;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.zc2;
import com.yandex.mobile.ads.impl.zs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class yn0
implements hd2<co0> {
    @NotNull
    private final co0 a;
    @NotNull
    private final gm0 b;
    @Nullable
    private a c;

    public yn0(@NotNull co0 co02, @NotNull gm0 gm02) {
        this.a = co02;
        this.b = gm02;
    }

    public final void a() {
        this.b.k(this.a);
    }

    public final void a(float f11) {
        this.b.a(this.a, f11);
    }

    public final void a(@NotNull kc2<co0> co02) {
        co02 = (co0)co02.e();
        this.b.g(co02);
    }

    public final void a(@Nullable zc2 object) {
        a a14 = this.c;
        if (a14 != null) {
            this.b.b(this.a, (zs)a14);
            this.c = null;
        }
        if (object != null) {
            object = new a((zc2)object);
            this.b.a(this.a, (zs)object);
            this.c = object;
        }
    }

    public final long b() {
        return this.b.a(this.a);
    }

    public final void c() {
        this.b.f(this.a);
    }

    public final void d() {
        this.b.h(this.a);
    }

    public final void e() {
        this.b.j(this.a);
    }

    public final long getAdPosition() {
        return this.b.b(this.a);
    }

    public final float getVolume() {
        return this.b.c(this.a);
    }

    public final boolean isPlayingAd() {
        return this.b.d(this.a);
    }

    public final void pauseAd() {
        this.b.e(this.a);
    }

    public final void resumeAd() {
        this.b.i(this.a);
    }

    private static final class a
    implements zs {
        @NotNull
        private final jd2 a;

        public a(@NotNull zc2 zc22) {
            this.a = zc22;
        }

        public final void a(@NotNull co0 co02) {
            jd2 jd22 = this.a;
            co02.getClass();
            jd22.g();
        }

        public final void a(@NotNull co0 co02, float f11) {
            jd2 jd22 = this.a;
            co02.getClass();
            jd22.onVolumeChanged(f11);
        }

        public final void a(@NotNull co0 co02, @NotNull id2 id22) {
            jd2 jd22 = this.a;
            co02.getClass();
            jd22.a(id22);
        }

        public final void b(@NotNull co0 co02) {
            jd2 jd22 = this.a;
            co02.getClass();
            jd22.h();
        }

        public final void c(@NotNull co0 co02) {
            jd2 jd22 = this.a;
            co02.getClass();
            jd22.i();
        }

        public final void d(@NotNull co0 co02) {
            jd2 jd22 = this.a;
            co02.getClass();
            jd22.c();
        }

        public final void e(@NotNull co0 co02) {
            jd2 jd22 = this.a;
            co02.getClass();
            jd22.f();
        }

        public final void f(@NotNull co0 co02) {
            jd2 jd22 = this.a;
            co02.getClass();
            jd22.e();
        }

        public final void g(@NotNull co0 co02) {
            jd2 jd22 = this.a;
            co02.getClass();
            jd22.d();
        }

        public final void h(@NotNull co0 co02) {
            jd2 jd22 = this.a;
            co02.getClass();
            jd22.a();
        }

        public final void i(@NotNull co0 co02) {
            jd2 jd22 = this.a;
            co02.getClass();
            jd22.b();
        }
    }
}

