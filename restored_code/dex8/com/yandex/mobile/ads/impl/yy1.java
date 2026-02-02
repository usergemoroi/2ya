/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.c2
 *  com.yandex.mobile.ads.impl.d2
 *  com.yandex.mobile.ads.impl.ho0
 *  com.yandex.mobile.ads.impl.k8
 *  com.yandex.mobile.ads.impl.l8
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c2;
import com.yandex.mobile.ads.impl.d2;
import com.yandex.mobile.ads.impl.ho0;
import com.yandex.mobile.ads.impl.k8;
import com.yandex.mobile.ads.impl.l8;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class yy1
implements k8 {
    @NotNull
    private final c2 a;
    @Nullable
    private l8 b;

    @JvmOverloads
    public yy1(@NotNull c2 c24) {
        this.a = c24;
        c24.a((d2)new a(this));
    }

    public final void a(@Nullable ho0 ho02) {
        this.a.a(ho02);
    }

    public final void a(@Nullable l8 l82) {
        this.b = l82;
    }

    public final void c() {
        this.a.b();
    }

    public final void f() {
        this.a.c();
    }

    public final void prepare() {
        this.a.d();
    }

    public final void resume() {
        this.a.f();
    }

    public final void start() {
        this.a.g();
    }

    private final class a
    implements d2 {
        final yy1 a;

        public a(yy1 yy12) {
            this.a = yy12;
        }

        public final void a() {
            l8 l82 = this.a.b;
            if (l82 != null) {
                l82.b();
            }
        }

        public final void b() {
        }

        public final void d() {
        }

        public final void e() {
            l8 l82 = this.a.b;
            if (l82 != null) {
                l82.c();
            }
        }

        public final void g() {
            l8 l82 = this.a.b;
            if (l82 != null) {
                l82.a();
            }
        }
    }
}

