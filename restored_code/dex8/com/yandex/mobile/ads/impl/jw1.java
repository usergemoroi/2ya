/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bu1
 *  com.yandex.mobile.ads.impl.ga
 *  com.yandex.mobile.ads.impl.gw1
 *  com.yandex.mobile.ads.impl.lo1
 *  com.yandex.mobile.ads.impl.m81
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.v71
 *  com.yandex.mobile.ads.impl.w71
 *  com.yandex.mobile.ads.impl.x2
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bu1;
import com.yandex.mobile.ads.impl.ga;
import com.yandex.mobile.ads.impl.gw1;
import com.yandex.mobile.ads.impl.j61;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.m81;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.v71;
import com.yandex.mobile.ads.impl.w71;
import com.yandex.mobile.ads.impl.x2;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public final class jw1
implements m81 {
    static final KProperty<Object>[] f = new KProperty[]{ga.a(jw1.class, (String)"nativeAdLoadManager", (String)"getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", (int)0)};
    @NotNull
    private final x2 a;
    @NotNull
    private final gw1 b;
    @NotNull
    private final ko1 c;
    @NotNull
    private final bu1 d;
    @NotNull
    private final v71 e;

    public jw1(@NotNull j61 j612, @NotNull x2 x22, @NotNull gw1 gw12) {
        this.a = x22;
        this.b = gw12;
        this.c = lo1.a((Object)j612);
        this.d = new bu1(j612.e());
        this.e = new v71(j612.e());
    }

    public final void a(@NotNull Context context, @NotNull b8<a71> b82) {
        j61 j612 = (j61)this.c.getValue(this, f[0]);
        if (j612 != null) {
            j612.h().a(o4.c, null);
            w71 w712 = new w71(b82, (a71)b82.J(), this.a);
            this.d.a(context, b82, this.e);
            this.d.a(context, b82, w712);
            j612.a(b82, this.b.a(b82));
        }
    }
}

