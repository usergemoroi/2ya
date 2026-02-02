/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.google.android.gms.ads.AdValue
 *  com.google.android.gms.ads.appopen.AppOpenAd
 */
package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.appopen.AppOpenAd;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.b;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.e;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

public final class c
extends e {
    public c(@NonNull b b11, @NonNull ClientContext clientContext) {
        super(b11, clientContext);
    }

    @Override
    public final boolean process(Object ... appOpenAd) {
        if (!ReflectionUtils.isArgumentsOfClasses((Object[])appOpenAd, AdValue.class, AppOpenAd.class)) {
            return false;
        }
        AdValue adValue = (AdValue)appOpenAd[0];
        appOpenAd = (AppOpenAd)appOpenAd[1];
        this.a.getClass();
        this.a(io.appmetrica.analytics.adrevenue.admob.v23.impl.b.a(adValue, ModuleAdType.APP_OPEN, "appOpenAd", appOpenAd.getResponseInfo(), appOpenAd.getAdUnitId()));
        return true;
    }
}

