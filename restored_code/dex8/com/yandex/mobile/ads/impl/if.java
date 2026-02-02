/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.i7
 *  com.yandex.mobile.ads.impl.k4
 *  com.yandex.mobile.ads.impl.ls
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
import com.yandex.mobile.ads.impl.gf;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.hf;
import com.yandex.mobile.ads.impl.i7;
import com.yandex.mobile.ads.impl.k4;
import com.yandex.mobile.ads.impl.ls;
import com.yandex.mobile.ads.impl.m4;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.sm1;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.wc0;
import com.yandex.mobile.ads.impl.x2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class if
extends cd0<gf> {
    @NotNull
    private final sm1 E;

    public if(@NotNull Context context, @NotNull gv1 gv12, @NotNull k4 k43, @NotNull i7 i73, @NotNull p4 p42, @NotNull dg0 dg02, @NotNull hf hf3, @NotNull x2 x22, @NotNull sm1 sm12) {
        super(context, x22, gv12, sm12, p42, hf3, dg02);
        this.E = sm12;
        x22.a(i73);
        sm12.a(new a((k4<if>)k43, this));
        sm12.a(dg02);
        sm12.a(x22);
    }

    @Override
    @NotNull
    protected final vc0<gf> a(@NotNull wc0 wc02) {
        return wc02.c((cd0)this);
    }

    public final void a(@Nullable ls ls3) {
        this.E.a(ls3);
    }

    public static final class a
    implements m4 {
        @NotNull
        private final k4<if> a;
        @NotNull
        private final if b;

        public a(@NotNull k4<if> k43, @NotNull if if_) {
            this.a = k43;
            this.b = if_;
        }

        public final void a() {
            this.a.a((cd0)this.b);
        }
    }
}

