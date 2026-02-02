/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.monetization.ads.nativeads.ExtendedNativeAdView
 *  com.yandex.mobile.ads.R$layout
 *  com.yandex.mobile.ads.impl.an
 *  com.yandex.mobile.ads.impl.ar0
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.d51
 *  com.yandex.mobile.ads.impl.gt
 *  com.yandex.mobile.ads.impl.ht
 *  com.yandex.mobile.ads.impl.jq
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.t00
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.u00
 *  com.yandex.mobile.ads.impl.uu0
 *  com.yandex.mobile.ads.impl.xd0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.an;
import com.yandex.mobile.ads.impl.ar0;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bn;
import com.yandex.mobile.ads.impl.d51;
import com.yandex.mobile.ads.impl.dn;
import com.yandex.mobile.ads.impl.fw0;
import com.yandex.mobile.ads.impl.gt;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.jq;
import com.yandex.mobile.ads.impl.m41;
import com.yandex.mobile.ads.impl.mf1;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.oq;
import com.yandex.mobile.ads.impl.t00;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.tp;
import com.yandex.mobile.ads.impl.u00;
import com.yandex.mobile.ads.impl.uj2;
import com.yandex.mobile.ads.impl.uu0;
import com.yandex.mobile.ads.impl.wp1;
import com.yandex.mobile.ads.impl.xd0;
import org.jetbrains.annotations.NotNull;

public final class oj1
implements xd0 {
    @NotNull
    private final t00<ExtendedNativeAdView> a;
    @NotNull
    private final wp1 b;
    @NotNull
    private final jq c;

    public oj1(@NotNull tp tp3, @NotNull wp1 wp12, @NotNull jq jq3) {
        this.a = tp3;
        this.b = wp12;
        this.c = jq3;
    }

    @NotNull
    public final ar0 a(@NotNull Context object, @NotNull b8 object2, @NotNull t61 t612, @NotNull nr nr2, @NotNull ht ht3) {
        gt gt3 = t612.getAdAssets();
        jq jq3 = this.c;
        t00<ExtendedNativeAdView> t002 = this.a;
        object2 = this.b;
        jq3.getClass();
        object2 = new oq(jq.a((t61)t612, (nr)nr2, (ht)ht3, t002, (wp1)object2), new fw0(new d51(), new uu0(gt3)), new uj2(), new dn(t612), new bn(new m41(), new an(object)));
        object = new mf1(1);
        return new ar0(R.layout.monetization_ads_internal_native_interstitial_portrait, (oq)object2, (u00)object);
    }
}

