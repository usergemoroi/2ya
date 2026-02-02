/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.google.android.gms.ads.AdValue
 *  com.google.android.gms.ads.nativead.NativeAd
 */
package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.nativead.NativeAd;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.b;
import io.appmetrica.analytics.adrevenue.admob.v23.impl.e;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

public final class g
extends e {
    public g(@NonNull b b11, @NonNull ClientContext clientContext) {
        super(b11, clientContext);
    }

    @Override
    public final boolean process(Object ... nativeAd) {
        if (!ReflectionUtils.isArgumentsOfClasses((Object[])nativeAd, AdValue.class, NativeAd.class)) {
            return false;
        }
        AdValue adValue = (AdValue)nativeAd[0];
        nativeAd = (NativeAd)nativeAd[1];
        this.a.getClass();
        this.a(io.appmetrica.analytics.adrevenue.admob.v23.impl.b.a(adValue, ModuleAdType.NATIVE, "nativeAd", nativeAd.getResponseInfo(), null));
        return true;
    }
}

