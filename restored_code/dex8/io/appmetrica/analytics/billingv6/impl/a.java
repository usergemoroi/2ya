/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.PurchaseHistoryResponseListener
 *  com.android.billingclient.api.QueryPurchaseHistoryParams
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.impl.b;
import io.appmetrica.analytics.billingv6.impl.d;
import io.appmetrica.analytics.billingv6.impl.i;
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
        Object object = this.b;
        b11.getClass();
        if (object.getResponseCode() != 0) {
            b11.e.onUpdateFinished();
        } else {
            for (String string2 : t.p((Object[])new String[]{"inapp", "subs"})) {
                Object object2 = b11.a;
                BillingClient billingClient = b11.b;
                UtilsProvider utilsProvider = b11.c;
                object = b11.d;
                object2 = new i((BillingConfig)object2, billingClient, utilsProvider, string2, (d)object, b11.e);
                object.b.add(object2);
                if (b11.b.isReady()) {
                    b11.b.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType(string2).build(), (PurchaseHistoryResponseListener)object2);
                    continue;
                }
                b11.d.a(object2);
                b11.e.onUpdateFinished();
            }
        }
    }
}

