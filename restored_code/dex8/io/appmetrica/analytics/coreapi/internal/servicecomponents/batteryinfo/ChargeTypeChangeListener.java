/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

public interface ChargeTypeChangeListener {
    public void onChargeTypeChanged(@NonNull ChargeType var1);
}

