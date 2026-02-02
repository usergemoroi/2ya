/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.monetization.ads.nativeads.ExtendedNativeAdView
 *  com.yandex.mobile.ads.R$dimen
 *  com.yandex.mobile.ads.R$layout
 *  com.yandex.mobile.ads.impl.ar0
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.gt
 *  com.yandex.mobile.ads.impl.ht
 *  com.yandex.mobile.ads.impl.jq
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.t00
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.u00
 *  com.yandex.mobile.ads.impl.xd0
 *  com.yandex.mobile.ads.impl.xq1
 *  kotlin.math.a
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.ar0;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.dn;
import com.yandex.mobile.ads.impl.gt;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.jq;
import com.yandex.mobile.ads.impl.mf1;
import com.yandex.mobile.ads.impl.nh1;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.oq;
import com.yandex.mobile.ads.impl.qq;
import com.yandex.mobile.ads.impl.t00;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.tp;
import com.yandex.mobile.ads.impl.tu0;
import com.yandex.mobile.ads.impl.u00;
import com.yandex.mobile.ads.impl.uj2;
import com.yandex.mobile.ads.impl.wp1;
import com.yandex.mobile.ads.impl.xd0;
import com.yandex.mobile.ads.impl.xq1;
import kotlin.math.a;
import org.jetbrains.annotations.NotNull;

public final class wq0
implements xd0 {
    @NotNull
    private final t00<ExtendedNativeAdView> a;
    @NotNull
    private final wp1 b;
    @NotNull
    private final xq1 c;
    @NotNull
    private final jq d;

    public wq0(@NotNull tp tp3, @NotNull wp1 wp12, @NotNull xq1 xq12, @NotNull jq jq3) {
        this.a = tp3;
        this.b = wp12;
        this.c = xq12;
        this.d = jq3;
    }

    @NotNull
    public final ar0 a(@NotNull Context object, @NotNull b8 object2, @NotNull t61 t612, @NotNull nr nr2, @NotNull ht ht3) {
        object2 = t612.getAdAssets();
        Object object3 = this.c;
        int n10 = R.dimen.monetization_ads_internal_landscape_horizontal_icon_size;
        object3.getClass();
        object3 = new qq((gt)object2, kotlin.math.a.d((float)object.getResources().getDimension(n10)));
        object = this.d;
        t00<ExtendedNativeAdView> t002 = this.a;
        wp1 wp12 = this.b;
        object.getClass();
        object = new oq(new t00[]{object3, jq.a((t61)t612, (nr)nr2, (ht)ht3, t002, (wp1)wp12), new tu0((gt)object2), new nh1((gt)object2), new uj2(), new dn(t612)});
        object2 = new mf1(2);
        return new ar0(R.layout.monetization_ads_internal_native_interstitial_landscape_horizontal_media, (oq)object, (u00)object2);
    }
}

