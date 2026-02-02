/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.monetization.ads.mediation.nativeads.MediatedNativeAdapter
 *  com.yandex.mobile.ads.impl.lx0
 *  com.yandex.mobile.ads.impl.nx0
 *  com.yandex.mobile.ads.impl.ux0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import com.yandex.mobile.ads.impl.lx0;
import com.yandex.mobile.ads.impl.nx0;
import com.yandex.mobile.ads.impl.ux0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class py0
implements nx0<MediatedNativeAdapter> {
    @NotNull
    private final ux0<MediatedNativeAdapter> a;

    public py0(@NotNull ux0<MediatedNativeAdapter> ux02) {
        this.a = ux02;
    }

    @Nullable
    public final lx0<MediatedNativeAdapter> a(@NotNull Context context) {
        return this.a.a(context, MediatedNativeAdapter.class);
    }
}

