/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.af1
 *  com.yandex.mobile.ads.impl.h92
 *  com.yandex.mobile.ads.impl.lo1
 *  com.yandex.mobile.ads.impl.nr
 *  kotlin.jvm.internal.e0
 *  kotlin.jvm.internal.f0
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.af1;
import com.yandex.mobile.ads.impl.h92;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.tc0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class qc0
implements af1 {
    static final KProperty<Object>[] c = new KProperty[]{v0.f((e0)new f0(qc0.class, "contentCloseListener", "getContentCloseListener()Lcom/monetization/ads/fullscreen/content/ContentCloseListener;", 0))};
    @Nullable
    private h92 a;
    @NotNull
    private final ko1 b = lo1.a();

    public final void a(@Nullable nr nr2) {
        this.b.setValue(this, c[0], nr2);
    }

    public final void a(@NotNull tc0 tc02) {
        this.a = tc02;
    }

    public final void a(boolean bl2) {
        h92 h922 = this.a;
        if (h922 != null) {
            h922.a(bl2);
        }
    }

    public final void c() {
        nr nr2 = (nr)this.b.getValue(this, c[0]);
        if (nr2 != null) {
            nr2.e();
        }
    }
}

