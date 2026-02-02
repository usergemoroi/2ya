/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.billinginterface.internal.storage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import java.util.Map;

public interface BillingInfoManager {
    @Nullable
    public BillingInfo get(@NonNull String var1);

    public boolean isFirstInappCheckOccurred();

    public void markFirstInappCheckOccurred();

    public void update(@NonNull Map<String, BillingInfo> var1);
}

