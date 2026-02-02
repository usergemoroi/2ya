/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bu1
 *  com.yandex.mobile.ads.impl.f4
 *  com.yandex.mobile.ads.impl.gd0
 *  com.yandex.mobile.ads.impl.qs1
 *  com.yandex.mobile.ads.impl.rs1
 *  com.yandex.mobile.ads.impl.vc0
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bu1;
import com.yandex.mobile.ads.impl.dg0;
import com.yandex.mobile.ads.impl.f4;
import com.yandex.mobile.ads.impl.gd0;
import com.yandex.mobile.ads.impl.oc0;
import com.yandex.mobile.ads.impl.qs1;
import com.yandex.mobile.ads.impl.rs1;
import com.yandex.mobile.ads.impl.sd0;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xm1;
import com.yandex.mobile.ads.impl.ym1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class es1
extends sd0<es1> {
    @NotNull
    private final ym1 t;
    @NotNull
    private final bu1 u;
    @Nullable
    private final qs1 v;

    public es1(@NotNull Context context, @NotNull b8<String> b82, @NotNull x2 x22, @NotNull vc0<es1> vc02, @NotNull ym1 ym12, @NotNull rs1 rs12, @NotNull dg0 dg02, @NotNull oc0 oc02, @NotNull bu1 bu12) {
        super(context, b82, x22, oc02, vc02, new f4());
        this.t = ym12;
        this.u = bu12;
        this.v = rs12.a(context, b82, x22);
        dg02.a(b82);
        dg02.a(x22);
    }

    @Override
    public final void a(int n10, @Nullable Bundle bundle) {
        if (n10 == 13) {
            this.r();
        } else {
            super.a(n10, bundle);
        }
    }

    public final void a(@NotNull xm1 xm12) {
        this.a((gd0)xm12);
        this.t.a(xm12);
    }

    @Override
    public final sd0 o() {
        return this;
    }

    public final void r() {
        this.u.b(this.e(), this.d());
        qs1 qs12 = this.v;
        if (qs12 != null) {
            qs12.a();
        }
    }
}

