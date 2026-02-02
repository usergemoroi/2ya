/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  com.monetization.ads.nativeads.ExtendedNativeAdView
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.gt
 *  com.yandex.mobile.ads.impl.j41
 *  com.yandex.mobile.ads.impl.rq
 *  com.yandex.mobile.ads.impl.t00
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.gt;
import com.yandex.mobile.ads.impl.j41;
import com.yandex.mobile.ads.impl.rq;
import com.yandex.mobile.ads.impl.t00;
import org.jetbrains.annotations.NotNull;

public final class qq
implements t00<ExtendedNativeAdView> {
    @NotNull
    private final gt a;
    private final int b;

    public qq(@NotNull gt gt3, int n10) {
        this.a = gt3;
        this.b = n10;
    }

    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView)viewGroup;
        rq rq3 = new rq(this.a, this.b, new j41());
        viewGroup = rq3.a((View)extendedNativeAdView);
        extendedNativeAdView = rq3.b((View)extendedNativeAdView);
        if (viewGroup != null) {
            viewGroup.setId(R.id.favicon);
        }
        if (extendedNativeAdView != null) {
            extendedNativeAdView.setId(R.id.icon);
        }
    }

    public final void c() {
    }
}

