/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.PurchaseHistoryResponseListener
 */
package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.impl.d;
import io.appmetrica.analytics.billingv6.impl.g;
import io.appmetrica.analytics.billingv6.impl.n;
import java.util.List;

public final class i
implements PurchaseHistoryResponseListener {
    public final BillingConfig a;
    public final BillingClient b;
    public final UtilsProvider c;
    public final String d;
    public final d e;
    public final n f;

    public i(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String string2, d d14, n n10) {
        this.a = billingConfig;
        this.b = billingClient;
        this.c = utilsProvider;
        this.d = string2;
        this.e = d14;
        this.f = n10;
    }

    public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        this.c.getWorkerExecutor().execute(new g(this, billingResult, list));
    }
}

