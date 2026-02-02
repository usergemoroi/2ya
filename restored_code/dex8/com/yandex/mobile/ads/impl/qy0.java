/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.monetization.ads.mediation.base.a
 *  com.monetization.ads.mediation.nativeads.MediatedNativeAdapter
 *  com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener
 *  com.yandex.mobile.ads.impl.tx0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.a;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;
import com.yandex.mobile.ads.impl.tx0;
import java.util.Map;

public final class qy0
implements tx0<MediatedNativeAdapter, MediatedNativeAdapterListener> {
    public final void a(Context context, a a14, Object object, Map map2, Map map3) {
        ((MediatedNativeAdapter)a14).loadAd(context, (MediatedNativeAdapterListener)object, map2, map3);
    }
}

