/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.monetization.ads.mediation.base.a
 *  com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter
 *  com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener
 *  com.yandex.mobile.ads.impl.tx0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.a;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapter;
import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import com.yandex.mobile.ads.impl.tx0;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

public final class zy0
implements tx0<MediatedRewardedAdapter, MediatedRewardedAdapterListener> {
    @Nullable
    private MediatedRewardedAdapter a;

    @Nullable
    public final MediatedRewardedAdapter a() {
        return this.a;
    }

    public final void a(Context context, a a14, Object object, Map map2, Map map3) {
        a14 = (MediatedRewardedAdapter)a14;
        object = (MediatedRewardedAdapterListener)object;
        this.a = a14;
        a14.loadRewardedAd(context, (MediatedRewardedAdapterListener)object, map2, map3);
    }

    public final void a(a a14) {
        ((MediatedRewardedAdapter)a14).onInvalidate();
    }
}

