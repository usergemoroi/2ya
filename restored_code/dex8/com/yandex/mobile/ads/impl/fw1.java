/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.nativeads.CustomizableMediaView
 *  com.yandex.mobile.ads.impl.ew1
 *  com.yandex.mobile.ads.impl.zw0
 *  kotlin.properties.b
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.cw1;
import com.yandex.mobile.ads.impl.cx0;
import com.yandex.mobile.ads.impl.dw1;
import com.yandex.mobile.ads.impl.ew1;
import com.yandex.mobile.ads.impl.zw0;
import kotlin.jvm.internal.y;
import kotlin.properties.b;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public final class fw1
extends b<cx0> {
    final dw1 a;

    public fw1(cw1 cw12, dw1 dw12) {
        this.a = dw12;
        super((Object)cw12);
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    protected final void afterChange(@NotNull KProperty object, Object object2, Object object3) {
        zw0 zw02;
        y.j(object, "property");
        object = (cx0)((Object)object3);
        object2 = (cx0)((Object)object2);
        if (!y.e(object, object2) && (object3 = dw1.d(this.a)) != null && (zw02 = dw1.c(this.a)) != null) {
            ((cx0)((Object)object2)).a((CustomizableMediaView)object3);
            object3.post((Runnable)new ew1((cx0)((Object)object), (CustomizableMediaView)object3, zw02));
        }
    }
}

