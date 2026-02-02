/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingResult
 *  com.android.billingclient.api.PurchasesResponseListener
 *  com.android.billingclient.api.QueryPurchasesParams
 *  kotlin.jvm.functions.a
 */
package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.impl.d;
import io.appmetrica.analytics.billingv6.impl.f;
import io.appmetrica.analytics.billingv6.impl.k;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import kotlin.jvm.functions.a;

public final class e
extends SafeRunnable {
    public final f a;
    public final BillingResult b;
    public final List c;

    public e(f f11, BillingResult billingResult, List list) {
        this.a = f11;
        this.b = billingResult;
        this.c = list;
    }

    @Override
    public final void runSafety() {
        f f11 = this.a;
        Object object = this.b;
        Object object2 = this.c;
        f11.getClass();
        if (object.getResponseCode() == 0 && !object2.isEmpty()) {
            UtilsProvider utilsProvider = f11.c;
            a a14 = f11.d;
            List list = f11.e;
            object = f11.f;
            object2 = new k(utilsProvider, a14, list, (List)object2, (d)object, f11.g);
            object.b.add(object2);
            if (f11.b.isReady()) {
                f11.b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(f11.a).build(), (PurchasesResponseListener)object2);
            } else {
                f11.f.a(object2);
                f11.g.onUpdateFinished();
            }
        } else {
            f11.g.onUpdateFinished();
        }
        f11 = this.a;
        f11.f.a(f11);
    }
}

