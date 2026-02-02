/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter
 *  com.monetization.ads.mediation.appopenad.a
 *  com.monetization.ads.mediation.appopenad.b
 *  com.monetization.ads.mediation.appopenad.c
 *  com.monetization.ads.mediation.interstitial.c
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.dy0
 *  com.yandex.mobile.ads.impl.fz0
 *  com.yandex.mobile.ads.impl.jg1
 *  com.yandex.mobile.ads.impl.mx0
 *  com.yandex.mobile.ads.impl.nx0
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.tx0
 *  com.yandex.mobile.ads.impl.ux0
 *  com.yandex.mobile.ads.impl.vc0
 *  com.yandex.mobile.ads.impl.wc0
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import com.monetization.ads.mediation.appopenad.a;
import com.monetization.ads.mediation.appopenad.b;
import com.monetization.ads.mediation.appopenad.c;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.cd0;
import com.yandex.mobile.ads.impl.dy0;
import com.yandex.mobile.ads.impl.es1;
import com.yandex.mobile.ads.impl.ey0;
import com.yandex.mobile.ads.impl.fz0;
import com.yandex.mobile.ads.impl.gf;
import com.yandex.mobile.ads.impl.iy0;
import com.yandex.mobile.ads.impl.jg1;
import com.yandex.mobile.ads.impl.mx0;
import com.yandex.mobile.ads.impl.nx0;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.qp0;
import com.yandex.mobile.ads.impl.tx0;
import com.yandex.mobile.ads.impl.ux0;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.wc0;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xy0;
import org.jetbrains.annotations.NotNull;

public final class jy0
implements wc0 {
    @NotNull
    private final b8<String> a;
    @NotNull
    private final fz0 b;

    public jy0(@NotNull b8<String> b82, @NotNull fz0 fz02) {
        this.a = b82;
        this.b = fz02;
    }

    @NotNull
    public final vc0<qp0> a(@NotNull cd0<qp0> cd02) {
        return new com.monetization.ads.mediation.interstitial.c(cd02, this.a, this.b);
    }

    @NotNull
    public final vc0<es1> b(@NotNull cd0<es1> cd02) {
        return new xy0(cd02, this.a, this.b);
    }

    @NotNull
    public final vc0<gf> c(@NotNull cd0<gf> cd02) {
        dy0 dy02 = this.a;
        fz0 fz02 = this.b;
        x2 x22 = cd02.e();
        iy0 iy02 = new iy0(x22);
        dy02 = new dy0(x22, dy02);
        ey0 ey02 = new ey0((ux0<MediatedAppOpenAdAdapter>)new ux0(fz02.c(), iy02, dy02));
        iy02 = cd02.h();
        jg1 jg12 = new jg1(cd02, fz02);
        fz02 = new c();
        x22 = new mx0(x22, (p4)iy02, (tx0)fz02, dy02, (nx0)ey02, jg12);
        return new b((mx0)x22, (c)fz02, new a(cd02, (mx0)x22), dy02);
    }
}

