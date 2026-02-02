/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.hq1
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.vi2
 *  com.yandex.mobile.ads.impl.wc2
 *  com.yandex.mobile.ads.impl.zi2
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bj2;
import com.yandex.mobile.ads.impl.hq1;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.pm0;
import com.yandex.mobile.ads.impl.vi2;
import com.yandex.mobile.ads.impl.wc2;
import com.yandex.mobile.ads.impl.zi2;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;
import kotlin.k0;

final class uc2
extends a0
implements a<k0> {
    final wc2 b;
    final hq1<vi2> c;
    final zi2 d;
    final Object e;

    uc2(wc2 wc22, pm0 pm02, zi2 zi22, Object object) {
        this.b = wc22;
        this.c = pm02;
        this.d = zi22;
        this.e = object;
        super(0);
    }

    public final Object invoke() {
        bj2 bj22 = new bj2(wc2.b((wc2)this.b), this.c);
        wc2.b((wc2)this.b).a(o4.w, null);
        wc2.h((wc2)this.b).a(wc2.c((wc2)this.b), wc2.a((wc2)this.b), this.d, this.e, bj22);
        return k0.a;
    }
}

