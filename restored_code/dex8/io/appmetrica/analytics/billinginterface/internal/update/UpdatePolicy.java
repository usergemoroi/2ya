/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.billinginterface.internal.update;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import java.util.Map;

public interface UpdatePolicy {
    @NonNull
    public Map<String, BillingInfo> getBillingInfoToUpdate(@NonNull BillingConfig var1, @NonNull Map<String, BillingInfo> var2, @NonNull BillingInfoManager var3);
}

