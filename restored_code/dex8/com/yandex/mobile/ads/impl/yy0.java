/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter
 *  com.yandex.mobile.ads.impl.lx0
 *  com.yandex.mobile.ads.impl.nx0
 *  com.yandex.mobile.ads.impl.ux0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.yandex.mobile.ads.impl.lx0;
import com.yandex.mobile.ads.impl.nx0;
import com.yandex.mobile.ads.impl.ux0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class yy0
implements nx0<MediatedRewardedAdapter> {
    @NotNull
    private final ux0<MediatedRewardedAdapter> a;

    public yy0(@NotNull ux0<MediatedRewardedAdapter> ux02) {
        this.a = ux02;
    }

    @Nullable
    public final lx0<MediatedRewardedAdapter> a(@NotNull Context context) {
        return this.a.a(context, MediatedRewardedAdapter.class);
    }
}

