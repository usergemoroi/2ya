/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter
 *  com.yandex.mobile.ads.impl.lx0
 *  com.yandex.mobile.ads.impl.nx0
 *  com.yandex.mobile.ads.impl.ux0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import com.yandex.mobile.ads.impl.lx0;
import com.yandex.mobile.ads.impl.nx0;
import com.yandex.mobile.ads.impl.ux0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ey0
implements nx0<MediatedAppOpenAdAdapter> {
    @NotNull
    private final ux0<MediatedAppOpenAdAdapter> a;

    public ey0(@NotNull ux0<MediatedAppOpenAdAdapter> ux02) {
        this.a = ux02;
    }

    @Nullable
    public final lx0<MediatedAppOpenAdAdapter> a(@NotNull Context context) {
        return this.a.a(context, MediatedAppOpenAdAdapter.class);
    }
}

