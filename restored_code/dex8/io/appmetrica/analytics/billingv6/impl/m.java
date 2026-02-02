/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.billingv6.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Map;
import kotlin.jvm.internal.y;

public final class m {
    public static void a(Map map2, Map map3, String string2, BillingInfoManager billingInfoManager) {
        long l10 = new SystemTimeProvider().currentTimeMillis();
        for (BillingInfo billingInfo : map2.values()) {
            if (map3.containsKey(billingInfo.productId)) {
                billingInfo.sendTime = l10;
                continue;
            }
            BillingInfo billingInfo2 = billingInfoManager.get(billingInfo.productId);
            if (billingInfo2 == null) continue;
            billingInfo.sendTime = billingInfo2.sendTime;
        }
        billingInfoManager.update(map2);
        if (!billingInfoManager.isFirstInappCheckOccurred() && y.e("inapp", string2)) {
            billingInfoManager.markFirstInappCheckOccurred();
        }
    }
}

