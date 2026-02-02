/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dc2
 *  com.yandex.mobile.ads.impl.hq1
 *  kotlin.jvm.functions.l
 *  kotlin.jvm.internal.k
 *  kotlin.jvm.internal.v
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dc2;
import com.yandex.mobile.ads.impl.hq1;
import com.yandex.mobile.ads.impl.pm0;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.v;
import kotlin.k0;

final class vc2
extends v
implements l<dc2, k0> {
    vc2(pm0 pm02) {
        super(1, (Object)pm02, hq1.class, "onFailure", "onFailure(Lcom/monetization/ads/video/VideoAdError;)V", 0);
    }

    public final Object invoke(Object object) {
        object = (dc2)object;
        ((hq1)((k)this).receiver).a((dc2)object);
        return k0.a;
    }
}

