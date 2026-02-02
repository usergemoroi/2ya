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
import com.yandex.mobile.ads.impl.ji;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class c81
implements ht {
    @NotNull
    private final ji a;

    public c81(@NotNull ji ji3) {
        this.a = ji3;
    }

    public final void a(@Nullable c4 c43) {
        this.a.a(c43);
    }

    public final void closeNativeAd() {
        this.a.z();
    }

    public final void onAdClicked() {
    }

    public final void onLeftApplication() {
        this.a.onLeftApplication();
    }

    public final void onReturnedToApplication() {
        this.a.onReturnedToApplication();
    }
}

