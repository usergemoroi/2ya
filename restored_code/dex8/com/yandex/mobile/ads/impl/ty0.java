/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.mediation.nativeads.MediatedNativeAdapter
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.dy0
 *  com.yandex.mobile.ads.impl.fz0
 *  com.yandex.mobile.ads.impl.jg1
 *  com.yandex.mobile.ads.impl.m81
 *  com.yandex.mobile.ads.impl.mx0
 *  com.yandex.mobile.ads.impl.n81
 *  com.yandex.mobile.ads.impl.nx0
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.tx0
 *  com.yandex.mobile.ads.impl.ux0
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.dy0;
import com.yandex.mobile.ads.impl.fz0;
import com.yandex.mobile.ads.impl.iy0;
import com.yandex.mobile.ads.impl.j61;
import com.yandex.mobile.ads.impl.jg1;
import com.yandex.mobile.ads.impl.lj;
import com.yandex.mobile.ads.impl.m81;
import com.yandex.mobile.ads.impl.mx0;
import com.yandex.mobile.ads.impl.n81;
import com.yandex.mobile.ads.impl.nx0;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.py0;
import com.yandex.mobile.ads.impl.qy0;
import com.yandex.mobile.ads.impl.sy0;
import com.yandex.mobile.ads.impl.tx0;
import com.yandex.mobile.ads.impl.u71;
import com.yandex.mobile.ads.impl.ux0;
import com.yandex.mobile.ads.impl.x2;
import org.jetbrains.annotations.NotNull;

public final class ty0
implements n81 {
    @NotNull
    private final b8<a71> a;
    @NotNull
    private final fz0 b;

    public ty0(@NotNull b8<a71> b82, @NotNull fz0 fz02) {
        this.a = b82;
        this.b = fz02;
    }

    @NotNull
    public final m81 a(@NotNull j61 j612) {
        b8<a71> b82 = this.a;
        fz0 fz02 = this.b;
        x2 x22 = j612.e();
        iy0 iy02 = new iy0(x22);
        dy0 dy02 = new dy0(x22, b82);
        py0 py02 = new py0((ux0<MediatedNativeAdapter>)new ux0(fz02.c(), iy02, dy02));
        iy02 = j612.h();
        fz02 = new jg1((lj)j612, fz02);
        dy02 = new mx0(x22, (p4)iy02, (tx0)new qy0(), dy02, (nx0)py02, (jg1)fz02);
        return new sy0((mx0)dy02, new u71(b82, j612, (mx0)dy02));
    }
}

