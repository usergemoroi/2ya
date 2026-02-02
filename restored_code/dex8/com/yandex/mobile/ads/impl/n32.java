/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.ht
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.ht;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class n32
implements ht {
    @NotNull
    private final ht a;

    public n32(@NotNull ht ht3) {
        this.a = ht3;
    }

    public final void a(@Nullable c4 c43) {
    }

    public final void closeNativeAd() {
        this.a.closeNativeAd();
    }

    public final void onAdClicked() {
        this.a.onAdClicked();
    }

    public final void onLeftApplication() {
        this.a.onLeftApplication();
    }

    public final void onReturnedToApplication() {
        this.a.onReturnedToApplication();
    }
}

