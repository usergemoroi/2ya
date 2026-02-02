/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.monetization.ads.mediation.nativeads.MediatedNativeAdapter
 *  com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.m81
 *  com.yandex.mobile.ads.impl.mx0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;
import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.m81;
import com.yandex.mobile.ads.impl.mx0;
import com.yandex.mobile.ads.impl.u71;
import org.jetbrains.annotations.NotNull;

public final class sy0
implements m81 {
    @NotNull
    private final mx0<MediatedNativeAdapter, MediatedNativeAdapterListener> a;
    @NotNull
    private final u71 b;

    public sy0(@NotNull mx0 mx02, @NotNull u71 u712) {
        this.a = mx02;
        this.b = u712;
    }

    public final void a(@NotNull Context context, @NotNull b8<a71> b82) {
        this.a.a(context, (Object)this.b);
    }
}

