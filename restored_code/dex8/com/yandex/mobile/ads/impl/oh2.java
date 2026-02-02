/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.rh2
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.internal.a0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rh2;
import com.yandex.mobile.ads.impl.ux;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;
import kotlin.k0;

final class oh2
extends a0
implements l<String, k0> {
    final rh2 b;

    oh2(rh2 rh22) {
        this.b = rh22;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (String)object;
        rh2.a((rh2)this.b).invoke((Object)new ux.h((String)object));
        return k0.a;
    }
}

