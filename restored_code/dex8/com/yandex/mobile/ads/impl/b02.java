/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  com.monetization.ads.nativeads.ExtendedNativeAdView
 *  com.yandex.mobile.ads.impl.eo
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
import com.yandex.mobile.ads.impl.c02;
import com.yandex.mobile.ads.impl.eo;
import com.yandex.mobile.ads.impl.h61;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.l41;
import com.yandex.mobile.ads.impl.m71;
import com.yandex.mobile.ads.impl.n32;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.sg;
import com.yandex.mobile.ads.impl.t00;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.wp1;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public final class b02
implements t00<ExtendedNativeAdView> {
    @NotNull
    private final c02 a;
    @NotNull
    private final nr b;
    @NotNull
    private final ht c;
    @NotNull
    private final eo d;
    @NotNull
    private final wp1 e;
    @NotNull
    private final l41 f;
    @NotNull
    private final sg g;

    public b02(@NotNull c02 c022, @NotNull nr nr2, @NotNull ht ht2, @NotNull eo eo3, @NotNull wp1 wp12, @NotNull l41 l412, @NotNull sg sg2) {
        this.a = c022;
        this.b = nr2;
        this.c = ht2;
        this.d = eo3;
        this.e = wp12;
        this.f = l412;
        this.g = sg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(ViewGroup object) {
        object = (ExtendedNativeAdView)object;
        try {
            object = this.g.a((View)object, this.f);
            this.a.a((m71)object, this.d);
            object = new n32(this.c);
            Iterator iterator = this.a.e().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    this.a.b(this.c);
                    return;
                }
                ((t61)iterator.next()).a((ht)object);
            }
        }
        catch (h61 h612) {}
        this.b.e();
        this.e.reportError("Failed to bind DivKit Slider Ad", h612);
    }

    public final void c() {
        this.a.b(null);
        Iterator iterator = this.a.e().iterator();
        while (iterator.hasNext()) {
            ((t61)iterator.next()).a(null);
        }
    }
}

