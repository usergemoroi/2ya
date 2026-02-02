/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.PurchasesResponseListener
 */
package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv8.impl.d;
import io.appmetrica.analytics.billingv8.impl.g;
import io.appmetrica.analytics.billingv8.impl.n;
import java.util.List;

public final class i
implements PurchasesResponseListener {
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

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.c.getWorkerExecutor().execute(new g(this, billingResult, list));
    }
}

