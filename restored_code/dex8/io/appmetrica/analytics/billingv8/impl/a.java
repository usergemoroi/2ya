/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.PurchasesResponseListener
 *  com.android.billingclient.api.QueryPurchasesParams
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv8.impl.b;
import io.appmetrica.analytics.billingv8.impl.d;
import io.appmetrica.analytics.billingv8.impl.i;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import kotlin.collections.t;

public final class a
extends SafeRunnable {
    public final b a;
    public final BillingResult b;

    public a(b b11, BillingResult billingResult) {
        this.a = b11;
        this.b = billingResult;
    }

    @Override
    public final void runSafety() {
        b b11 = this.a;
        BillingResult billingResult = this.b;
        b11.getClass();
        if (billingResult.getResponseCode() != 0) {
            b11.e.onUpdateFinished();
        } else if (!b11.b.isReady()) {
            b11.e.onUpdateFinished();
        } else {
            for (String string2 : t.p((Object[])new String[]{"inapp", "subs"})) {
                BillingConfig billingConfig = b11.a;
                BillingClient billingClient = b11.b;
                Object object = b11.c;
                d d14 = b11.d;
                object = new i(billingConfig, billingClient, (UtilsProvider)object, string2, d14, b11.e);
                d14.b.add(object);
                b11.b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(string2).build(), (PurchasesResponseListener)object);
            }
        }
    }
}

