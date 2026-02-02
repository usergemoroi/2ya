/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  com.monetization.ads.nativeads.ExtendedNativeAdView
 *  com.yandex.mobile.ads.impl.t00
 */
package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.impl.t00;
import org.jetbrains.annotations.NotNull;

public final class td0
implements t00<ExtendedNativeAdView> {
    @NotNull
    private t00<ExtendedNativeAdView> a;

    public td0(@NotNull t00 t002) {
        this.a = t002;
    }

    public final void a(ViewGroup viewGroup) {
        viewGroup = (ExtendedNativeAdView)viewGroup;
        this.a.a(viewGroup);
    }

    public final void c() {
        this.a.c();
    }
}

