/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.mh2$a
 *  com.yandex.mobile.ads.impl.rh2
 *  com.yandex.mobile.ads.impl.zx$h$a
 *  kotlin.jvm.functions.p
 *  kotlin.jvm.internal.a0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mh2;
import com.yandex.mobile.ads.impl.rh2;
import com.yandex.mobile.ads.impl.ux;
import com.yandex.mobile.ads.impl.zx;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.a0;
import kotlin.k0;

final class mh2
extends a0
implements p<zx.h.a, Boolean, k0> {
    final rh2 b;

    mh2(rh2 rh22) {
        this.b = rh22;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = object;
        boolean bl2 = (Boolean)object2;
        if (a.a[((Enum)object).ordinal()] == 1) {
            rh2.a((rh2)this.b).invoke((Object)new ux.e(bl2));
        }
        return k0.a;
    }
}

