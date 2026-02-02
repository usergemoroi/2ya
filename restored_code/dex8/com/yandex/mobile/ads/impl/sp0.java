/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.et
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.i7
 *  com.yandex.mobile.ads.impl.k4
 *  com.yandex.mobile.ads.impl.m4
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.vc0
 *  com.yandex.mobile.ads.impl.wc0
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.cd0;
import com.yandex.mobile.ads.impl.dg0;
import com.yandex.mobile.ads.impl.et;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.i7;
import com.yandex.mobile.ads.impl.k4;
import com.yandex.mobile.ads.impl.m4;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.qp0;
import com.yandex.mobile.ads.impl.rp0;
import com.yandex.mobile.ads.impl.um1;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.wc0;
import com.yandex.mobile.ads.impl.x2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class sp0
extends cd0<qp0> {
    @NotNull
    private final um1 E;

    public sp0(@NotNull Context context, @NotNull gv1 gv12, @NotNull k4 k43, @NotNull i7 i73, @NotNull p4 p42, @NotNull dg0 dg02, @NotNull rp0 rp02, @NotNull x2 x22, @NotNull um1 um12) {
        super(context, x22, gv12, um12, p42, rp02, dg02);
        this.E = um12;
        x22.a(i73);
        um12.a(new a((k4<sp0>)k43, this));
        um12.a(x22);
        um12.a(dg02);
    }

    @Override
    @NotNull
    protected final vc0<qp0> a(@NotNull wc0 wc02) {
        return wc02.a((cd0)this);
    }

    public final void a(@Nullable et et3) {
        this.E.a(et3);
    }

    @Override
    public final void a(@Nullable String string2) {
        super.a(string2);
        this.E.a(string2);
    }

    public static final class a
    implements m4 {
        @NotNull
        private final k4<sp0> a;
        @NotNull
        private final sp0 b;

        public a(@NotNull k4<sp0> k43, @NotNull sp0 sp02) {
            this.a = k43;
            this.b = sp02;
        }

        public final void a() {
            this.a.a((cd0)this.b);
        }
    }
}

