/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.uy
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.uy;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;

final class ty
extends a0
implements a<Long> {
    final uy b;

    ty(uy uy3) {
        this.b = uy3;
        super(0);
    }

    public final Object invoke() {
        return uy.b((uy)this.b).toMillis(uy.a((uy)this.b));
    }
}

