/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  com.monetization.ads.nativeads.ExtendedNativeAdView
 *  com.yandex.mobile.ads.impl.h61
 *  com.yandex.mobile.ads.impl.ht
 *  com.yandex.mobile.ads.impl.l41
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.sg
 *  com.yandex.mobile.ads.impl.t00
 *  com.yandex.mobile.ads.impl.t61
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.impl.h61;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.l41;
import com.yandex.mobile.ads.impl.m41;
import com.yandex.mobile.ads.impl.m71;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.sg;
import com.yandex.mobile.ads.impl.t00;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.wp1;
import org.jetbrains.annotations.NotNull;

public final class ud0
implements t00<ExtendedNativeAdView> {
    @NotNull
    private final t61 a;
    @NotNull
    private final nr b;
    @NotNull
    private final ht c;
    @NotNull
    private final wp1 d;
    @NotNull
    private final sg e;
    @NotNull
    private final m41 f;

    public ud0(@NotNull t61 t612, @NotNull nr nr2, @NotNull ht ht3, @NotNull wp1 wp12, @NotNull sg sg2, @NotNull m41 m412) {
        this.a = t612;
        this.b = nr2;
        this.c = ht3;
        this.d = wp12;
        this.e = sg2;
        this.f = m412;
    }

    public final void a(ViewGroup object) {
        object = (ExtendedNativeAdView)object;
        object = this.e.a((View)object, (l41)this.f);
        try {
            this.a.b((m71)object);
            this.a.a(this.c);
        }
        catch (h61 h612) {
            this.b.e();
            this.d.reportError("Failed to bind DivKit Fullscreen Native Ad", h612);
        }
    }

    public final void c() {
        this.a.a(null);
    }
}

