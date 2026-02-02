/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.billinginterface.internal.config;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;

public interface BillingConfigChangedListener {
    public void onBillingConfigChanged(@Nullable BillingConfig var1);
}

