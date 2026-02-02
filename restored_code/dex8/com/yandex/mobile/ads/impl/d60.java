/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.e9
 *  com.yandex.mobile.ads.impl.fm1
 *  com.yandex.mobile.ads.impl.k5
 *  com.yandex.mobile.ads.impl.m5
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.tm0
 *  com.yandex.mobile.ads.impl.vi1
 *  com.yandex.mobile.ads.impl.ys
 *  com.yandex.mobile.ads.impl.zi1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.e9;
import com.yandex.mobile.ads.impl.fm1;
import com.yandex.mobile.ads.impl.hm0;
import com.yandex.mobile.ads.impl.i5;
import com.yandex.mobile.ads.impl.k5;
import com.yandex.mobile.ads.impl.m5;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.tm0;
import com.yandex.mobile.ads.impl.vi1;
import com.yandex.mobile.ads.impl.wl1;
import com.yandex.mobile.ads.impl.ys;
import com.yandex.mobile.ads.impl.zi1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class d60
implements ys {
    @NotNull
    private final e9 a;
    @NotNull
    private final fm1 b;
    @NotNull
    private final m5 c;
    @NotNull
    private final k5 d;
    @NotNull
    private final i5 e;
    @NotNull
    private final vi1 f;
    @NotNull
    private final zi1 g;

    public d60(@NotNull e9 e92, @NotNull wl1 wl12, @NotNull m5 m52, @NotNull k5 k52, @NotNull i5 i54, @NotNull vi1 vi12, @NotNull zi1 zi12) {
        this.a = e92;
        this.b = wl12;
        this.c = m52;
        this.d = k52;
        this.e = i54;
        this.f = vi12;
        this.g = zi12;
    }

    public final long a(@NotNull co0 co02) {
        return this.b.a().b();
    }

    public final void a(@NotNull co0 co02, float f10) {
        this.g.a(f10);
        this.e.a(co02, f10);
    }

    public final void a(@Nullable hm0 hm02) {
        this.e.a(hm02);
    }

    public final long b(@NotNull co0 co02) {
        return this.b.a().c();
    }

    public final void c(@NotNull co0 co02) {
        try {
            this.d.b(co02);
        }
        catch (RuntimeException runtimeException) {
            int n10 = op0.b;
        }
    }

    public final void d(@NotNull co0 co02) {
        try {
            this.c.a(co02);
        }
        catch (RuntimeException runtimeException) {
            int n10 = op0.b;
        }
    }

    public final void e(@NotNull co0 co02) {
    }

    public final void f(@NotNull co0 co02) {
        try {
            this.d.a(co02);
        }
        catch (RuntimeException runtimeException) {
            int n10 = op0.b;
        }
    }

    public final void g(@NotNull co0 co02) {
        try {
            this.d.c(co02);
        }
        catch (RuntimeException runtimeException) {
            int n10 = op0.b;
        }
    }

    public final void h(@NotNull co0 co02) {
        try {
            this.d.d(co02);
        }
        catch (RuntimeException runtimeException) {
            int n10 = op0.b;
        }
    }

    public final void i(@NotNull co0 co02) {
        try {
            this.d.e(co02);
        }
        catch (RuntimeException runtimeException) {
            int n10 = op0.b;
        }
    }

    public final boolean j(@NotNull co0 co02) {
        boolean bl2 = this.a.a(co02) != tm0.b && this.f.c();
        return bl2;
    }

    public final float k(@NotNull co0 object) {
        object = this.g.a();
        float f10 = object != null ? ((Float)object).floatValue() : 0.0f;
        return f10;
    }
}

