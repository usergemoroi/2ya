/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

public class BatteryInfo {
    @Nullable
    public final Integer batteryLevel;
    @NonNull
    public final ChargeType chargeType;

    public BatteryInfo(@Nullable Integer n10, @NonNull ChargeType chargeType) {
        this.batteryLevel = n10;
        this.chargeType = chargeType;
    }
}

