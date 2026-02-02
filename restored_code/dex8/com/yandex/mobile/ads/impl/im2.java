/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jm2;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;
import kotlin.k0;

final class im2
extends a0
implements a<k0> {
    final jm2 b;
    final String c;

    im2(jm2 jm22) {
        this.b = jm22;
        this.c = "Cannot load bidder token. Token generation failed";
        super(0);
    }

    public final Object invoke() {
        jm2.a(this.b).onBidderTokenFailedToLoad(this.c);
        return k0.a;
    }
}

