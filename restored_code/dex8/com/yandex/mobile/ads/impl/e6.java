/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.l6
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.internal.a0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.l6;
import java.util.Map;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;
import kotlin.k0;
import kotlinx.serialization.json.h;
import kotlinx.serialization.json.z;

final class e6
extends a0
implements l<z, k0> {
    final Map.Entry<String, l6> b;

    e6(Map.Entry<String, l6> entry) {
        this.b = entry;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (z)object;
        h.c((z)object, "usagePercent", this.b.getValue().b());
        h.b((z)object, "isDisabled", this.b.getValue().a());
        return k0.a;
    }
}

