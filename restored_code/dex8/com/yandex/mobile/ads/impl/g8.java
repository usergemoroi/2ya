/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  com.yandex.mobile.ads.impl.lo1
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.z2
 *  kotlin.jvm.internal.e0
 *  kotlin.jvm.internal.f0
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.z2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class g8
implements z2 {
    static final KProperty<Object>[] b = new KProperty[]{v0.f((e0)new f0(g8.class, "adEventsReceiver", "getAdEventsReceiver()Lcom/monetization/ads/base/AdEventsReceiver;", 0))};
    @NotNull
    private final ko1 a = lo1.a(null);

    public final void a(int n10, @Nullable Bundle bundle) {
        z2 z22 = (z2)this.a.getValue(this, b[0]);
        if (z22 != null) {
            z22.a(n10, bundle);
            n10 = op0.b;
        }
    }

    public final void a(@Nullable z2 z22) {
        this.a.setValue(this, b[0], z22);
    }
}

