/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.google.android.gms.ads.AdValue
 *  com.google.android.gms.ads.AdView
 */
package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.AdView;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.b;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.e;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

public final class d
extends e {
    public d(@NonNull b b11, @NonNull ClientContext clientContext) {
        super(b11, clientContext);
    }

    @Override
    public final boolean process(Object ... adView) {
        if (!ReflectionUtils.isArgumentsOfClasses((Object[])adView, AdValue.class, AdView.class)) {
            return false;
        }
        AdValue adValue = (AdValue)adView[0];
        adView = (AdView)adView[1];
        this.a.getClass();
        this.a(io.appmetrica.analytics.adrevenue.admob.v23.impl.b.a(adValue, ModuleAdType.BANNER, "bannerAd", adView.getResponseInfo(), adView.getAdUnitId()));
        return true;
    }
}

