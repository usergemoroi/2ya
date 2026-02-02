/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ac0
 *  com.yandex.mobile.ads.impl.lo1
 *  kotlin.jvm.internal.e0
 *  kotlin.jvm.internal.f0
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ac0;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.lo1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public final class zb0
implements ac0 {
    static final KProperty<Object>[] b = new KProperty[]{v0.f((e0)new f0(zb0.class, "forceImpressionTrackingListenerReference", "getForceImpressionTrackingListenerReference()Lcom/monetization/ads/base/impression/ForceImpressionTrackingListener;", 0))};
    @NotNull
    private final ko1 a = lo1.a();

    public final void a() {
        ac0 ac02 = (ac0)this.a.getValue(this, b[0]);
        if (ac02 != null) {
            ac02.a();
        }
    }

    public final void a(@NotNull ac0 ac02) {
        this.a.setValue(this, b[0], ac02);
    }
}

