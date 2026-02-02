/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.nativeads.ExtendedNativeAdView
 *  com.yandex.mobile.ads.impl.fr0
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.rd0
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.impl.fr0;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.rd0;
import org.jetbrains.annotations.NotNull;

public final class vd0
implements rd0 {
    @NotNull
    private final fr0<ExtendedNativeAdView> a;
    @NotNull
    private final nr b;

    public vd0(@NotNull fr0<ExtendedNativeAdView> fr02, @NotNull nr nr2) {
        this.a = fr02;
        this.b = nr2;
    }

    public final void c() {
        if (!this.a.a()) {
            this.b.e();
        }
    }

    public final void invalidate() {
        this.a.b();
    }
}

