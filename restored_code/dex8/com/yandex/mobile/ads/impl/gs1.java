/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.as1
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.i7
 *  com.yandex.mobile.ads.impl.j7
 *  com.yandex.mobile.ads.impl.k4
 *  com.yandex.mobile.ads.impl.m4
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.vc0
 *  com.yandex.mobile.ads.impl.wc0
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xr1
 *  com.yandex.mobile.ads.impl.yt
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.cd0;
import com.yandex.mobile.ads.impl.dg0;
import com.yandex.mobile.ads.impl.es1;
import com.yandex.mobile.ads.impl.fs1;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.i7;
import com.yandex.mobile.ads.impl.j7;
import com.yandex.mobile.ads.impl.k4;
import com.yandex.mobile.ads.impl.m4;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.wc0;
import com.yandex.mobile.ads.impl.wm1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xr1;
import com.yandex.mobile.ads.impl.yt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class gs1
extends cd0<es1> {
    @NotNull
    private final wm1 E;
    @NotNull
    private final as1 F;

    public gs1(@NotNull Context context, @NotNull gv1 gv12, @NotNull k4 k43, @NotNull i7 i73, @NotNull p4 p42, @NotNull dg0 dg02, @NotNull fs1 fs12, @NotNull x2 x22, @NotNull wm1 wm12, @NotNull as1 as12) {
        super(context, x22, gv12, wm12, p42, fs12, dg02);
        this.E = wm12;
        this.F = as12;
        x22.a(i73);
        wm12.a(new a((k4<gs1>)k43, this));
        wm12.a(x22);
        wm12.a(dg02);
    }

    @Override
    @NotNull
    protected final vc0<es1> a(@NotNull wc0 wc02) {
        return wc02.b((cd0)this);
    }

    @Override
    public final void a(@NotNull b8<String> b82) {
        xr1 xr12 = b82.K();
        this.F.getClass();
        if (xr12 != null && (xr12.e() ? xr12.d() != null : xr12.c() != null)) {
            super.a(b82);
        } else {
            this.b(j7.k());
        }
    }

    public final void a(@Nullable yt yt2) {
        this.E.a(yt2);
    }

    @Override
    public final void a(@Nullable String string2) {
        super.a(string2);
        this.E.a(string2);
    }

    public static final class a
    implements m4 {
        @NotNull
        private final k4<gs1> a;
        @NotNull
        private final gs1 b;

        public a(@NotNull k4<gs1> k43, @NotNull gs1 gs12) {
            this.a = k43;
            this.b = gs12;
        }

        public final void a() {
            this.a.a((cd0)this.b);
        }
    }
}

