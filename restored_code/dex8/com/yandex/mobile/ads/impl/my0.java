/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter
 *  com.yandex.mobile.ads.impl.lx0
 *  com.yandex.mobile.ads.impl.nx0
 *  com.yandex.mobile.ads.impl.ux0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.interstitial.MediatedInterstitialAdapter;
import com.yandex.mobile.ads.impl.lx0;
import com.yandex.mobile.ads.impl.nx0;
import com.yandex.mobile.ads.impl.ux0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class my0
implements nx0<MediatedInterstitialAdapter> {
    @NotNull
    private final ux0<MediatedInterstitialAdapter> a;

    public my0(@NotNull ux0<MediatedInterstitialAdapter> ux02) {
        this.a = ux02;
    }

    @Nullable
    public final lx0<MediatedInterstitialAdapter> a(@NotNull Context context) {
        return this.a.a(context, MediatedInterstitialAdapter.class);
    }
}

