/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.WorkerThread
 */
package io.appmetrica.analytics.billingv8.impl;

import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.update.UpdatePolicy;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class o
implements UpdatePolicy {
    public final SystemTimeProvider a;

    public o() {
        this(null, 1, null);
    }

    public o(@NotNull SystemTimeProvider systemTimeProvider) {
        this.a = systemTimeProvider;
    }

    public /* synthetic */ o(SystemTimeProvider systemTimeProvider, int n10, p p14) {
        if ((n10 & 1) != 0) {
            systemTimeProvider = new SystemTimeProvider();
        }
        this(systemTimeProvider);
    }

    @WorkerThread
    @NotNull
    public final Map<String, BillingInfo> getBillingInfoToUpdate(@NotNull BillingConfig billingConfig, @NotNull Map<String, ? extends BillingInfo> object, @NotNull BillingInfoManager billingInfoManager) {
        LinkedHashMap<String, BillingInfo> linkedHashMap = new LinkedHashMap<String, BillingInfo>();
        for (Map.Entry entry : object.entrySet()) {
            BillingInfo billingInfo;
            BillingInfo billingInfo2 = (BillingInfo)entry.getValue();
            if (!(billingInfo2.type == ProductType.INAPP && !billingInfoManager.isFirstInappCheckOccurred() ? this.a.currentTimeMillis() - billingInfo2.purchaseTime <= TimeUnit.SECONDS.toMillis(billingConfig.firstCollectingInappMaxAgeSeconds) : ((billingInfo = billingInfoManager.get(billingInfo2.productId)) == null || !y.e(billingInfo.purchaseToken, billingInfo2.purchaseToken)) && (this.a.currentTimeMillis() - billingInfo2.purchaseTime <= TimeUnit.SECONDS.toMillis(billingConfig.firstCollectingInappMaxAgeSeconds) || billingInfo2.type == ProductType.SUBS) || billingInfo != null && billingInfo2.type == ProductType.SUBS && this.a.currentTimeMillis() - billingInfo.sendTime >= TimeUnit.SECONDS.toMillis(billingConfig.sendFrequencySeconds))) continue;
            ((AbstractMap)linkedHashMap).put((String)entry.getKey(), (BillingInfo)entry.getValue());
        }
        return linkedHashMap;
    }
}

