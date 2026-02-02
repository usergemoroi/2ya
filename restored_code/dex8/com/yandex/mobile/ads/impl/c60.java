/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.d9
 *  com.yandex.mobile.ads.impl.em1
 *  com.yandex.mobile.ads.impl.j5
 *  com.yandex.mobile.ads.impl.l5
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.sm0
 *  com.yandex.mobile.ads.impl.ui1
 *  com.yandex.mobile.ads.impl.yi1
 *  com.yandex.mobile.ads.impl.ys
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.d9;
import com.yandex.mobile.ads.impl.em1;
import com.yandex.mobile.ads.impl.h5;
import com.yandex.mobile.ads.impl.hm0;
import com.yandex.mobile.ads.impl.j5;
import com.yandex.mobile.ads.impl.l5;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.sm0;
import com.yandex.mobile.ads.impl.ui1;
import com.yandex.mobile.ads.impl.vl1;
import com.yandex.mobile.ads.impl.yi1;
import com.yandex.mobile.ads.impl.ys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class c60
implements ys {
    @NotNull
    private final d9 a;
    @NotNull
    private final em1 b;
    @NotNull
    private final l5 c;
    @NotNull
    private final j5 d;
    @NotNull
    private final h5 e;
    @NotNull
    private final ui1 f;
    @NotNull
    private final yi1 g;

    public c60(@NotNull d9 d92, @NotNull vl1 vl12, @NotNull l5 l53, @NotNull j5 j52, @NotNull h5 h54, @NotNull ui1 ui12, @NotNull yi1 yi12) {
        this.a = d92;
        this.b = vl12;
        this.c = l53;
        this.d = j52;
        this.e = h54;
        this.f = ui12;
        this.g = yi12;
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
        boolean bl2 = this.a.a(co02) != sm0.b && this.f.c();
        return bl2;
    }

    public final float k(@NotNull co0 object) {
        object = this.g.a();
        float f10 = object != null ? ((Float)object).floatValue() : 0.0f;
        return f10;
    }
}

