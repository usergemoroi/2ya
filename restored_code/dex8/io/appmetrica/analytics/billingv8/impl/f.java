/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingClient
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.ProductDetailsResponseListener
 *  com.android.billingclient.api.QueryProductDetailsResult
 *  kotlin.jvm.functions.a
 */
package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import com.android.billingclient.api.QueryProductDetailsResult;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv8.impl.d;
import io.appmetrica.analytics.billingv8.impl.e;
import io.appmetrica.analytics.billingv8.impl.h;
import io.appmetrica.analytics.billingv8.impl.n;
import java.util.List;
import kotlin.jvm.functions.a;

public final class f
implements ProductDetailsResponseListener {
    public final String a;
    public final BillingClient b;
    public final UtilsProvider c;
    public final a d;
    public final List e;
    public final d f;
    public final n g;

    public f(String string2, BillingClient billingClient, UtilsProvider utilsProvider, h h14, List list, d d14, n n10) {
        this.a = string2;
        this.b = billingClient;
        this.c = utilsProvider;
        this.d = h14;
        this.e = list;
        this.f = d14;
        this.g = n10;
    }

    public final void onProductDetailsResponse(BillingResult billingResult, QueryProductDetailsResult queryProductDetailsResult) {
        this.c.getWorkerExecutor().execute(new e(this, billingResult, queryProductDetailsResult));
    }
}

