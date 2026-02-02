/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.coreapi.internal.identifiers;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;

public class AdvertisingIdsHolder {
    private final AdTrackingInfoResult a;
    private final AdTrackingInfoResult b;
    private final AdTrackingInfoResult c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    public AdvertisingIdsHolder(@NonNull AdTrackingInfoResult adTrackingInfoResult, @NonNull AdTrackingInfoResult adTrackingInfoResult2, @NonNull AdTrackingInfoResult adTrackingInfoResult3) {
        this.a = adTrackingInfoResult;
        this.b = adTrackingInfoResult2;
        this.c = adTrackingInfoResult3;
    }

    @NonNull
    public AdTrackingInfoResult getGoogle() {
        return this.a;
    }

    @NonNull
    public AdTrackingInfoResult getHuawei() {
        return this.b;
    }

    @NonNull
    public AdTrackingInfoResult getYandex() {
        return this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdvertisingIdsHolder{mGoogle=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mHuawei=");
        stringBuilder.append(this.b);
        stringBuilder.append(", yandex=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

