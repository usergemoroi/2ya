/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  com.monetization.ads.nativeads.ExtendedNativeAdView
 *  com.yandex.mobile.ads.impl.f1
 *  com.yandex.mobile.ads.impl.t00
 */
package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.impl.f1;
import com.yandex.mobile.ads.impl.t00;
import org.jetbrains.annotations.NotNull;

public final class sq1
implements t00<ExtendedNativeAdView> {
    @NotNull
    private final f1 a;
    private final int b;

    public sq1(@NotNull f1 f12, int n10) {
        this.a = f12;
        this.b = n10;
    }

    public final void a(ViewGroup viewGroup) {
        viewGroup = (ExtendedNativeAdView)viewGroup;
        if (this.b == 1) {
            this.a.a(7);
        } else {
            this.a.a(6);
        }
    }

    public final void c() {
    }
}

