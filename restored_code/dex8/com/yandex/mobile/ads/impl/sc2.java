/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ga2
 *  com.yandex.mobile.ads.impl.hq1
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.qa2
 *  com.yandex.mobile.ads.impl.ra2
 *  com.yandex.mobile.ads.impl.wc2
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bo0;
import com.yandex.mobile.ads.impl.ga2;
import com.yandex.mobile.ads.impl.ha2;
import com.yandex.mobile.ads.impl.hq1;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.qa2;
import com.yandex.mobile.ads.impl.ra2;
import com.yandex.mobile.ads.impl.ta2;
import com.yandex.mobile.ads.impl.wc2;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;
import kotlin.k0;

final class sc2
extends a0
implements a<k0> {
    final wc2 b;
    final qa2 c;
    final ra2 d;
    final hq1<ga2> e;
    final Object f;

    sc2(wc2 wc22, qa2 qa22, bo0 bo02, ta2 ta22, Object object) {
        this.b = wc22;
        this.c = qa22;
        this.d = bo02;
        this.e = ta22;
        this.f = object;
        super(0);
    }

    public final Object invoke() {
        ha2 ha22 = wc2.f((wc2)this.b).a(wc2.c((wc2)this.b), this.c, this.d, this.e);
        wc2.b((wc2)this.b).a(o4.t, this.c);
        wc2.h((wc2)this.b).a(wc2.c((wc2)this.b), wc2.a((wc2)this.b), this.c, this.d, this.f, ha22);
        return k0.a;
    }
}

