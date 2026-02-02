/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.PurchasesResponseListener
 *  kotlin.jvm.functions.a
 */
package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.impl.d;
import io.appmetrica.analytics.billingv6.impl.j;
import io.appmetrica.analytics.billingv6.impl.n;
import java.util.List;
import kotlin.jvm.functions.a;

public final class k
implements PurchasesResponseListener {
    public final UtilsProvider a;
    public final a b;
    public final List c;
    public final List d;
    public final d e;
    public final n f;

    public k(UtilsProvider utilsProvider, a a14, List list, List list2, d d14, n n10) {
        this.a = utilsProvider;
        this.b = a14;
        this.c = list;
        this.d = list2;
        this.e = d14;
        this.f = n10;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.a.getWorkerExecutor().execute(new j(this, billingResult, list));
    }
}

