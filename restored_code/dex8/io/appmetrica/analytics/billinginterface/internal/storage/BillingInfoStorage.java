/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.billinginterface.internal.storage;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import java.util.List;

public interface BillingInfoStorage {
    @NonNull
    public List<BillingInfo> getBillingInfo();

    public boolean isFirstInappCheckOccurred();

    public void saveInfo(@NonNull List<BillingInfo> var1, boolean var2);
}

