/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.google.android.gms.ads.AdValue
 *  com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
 */
package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.b;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.e;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

public final class i
extends e {
    public i(@NonNull b b11, @NonNull ClientContext clientContext) {
        super(b11, clientContext);
    }

    @Override
    public final boolean process(Object ... rewardedInterstitialAd) {
        if (!ReflectionUtils.isArgumentsOfClasses((Object[])rewardedInterstitialAd, AdValue.class, RewardedInterstitialAd.class)) {
            return false;
        }
        AdValue adValue = (AdValue)rewardedInterstitialAd[0];
        rewardedInterstitialAd = (RewardedInterstitialAd)rewardedInterstitialAd[1];
        this.a.getClass();
        this.a(io.appmetrica.analytics.adrevenue.admob.v23.impl.b.a(adValue, ModuleAdType.OTHER, "rewardedInterstitialAd", rewardedInterstitialAd.getResponseInfo(), rewardedInterstitialAd.getAdUnitId()));
        return true;
    }
}

