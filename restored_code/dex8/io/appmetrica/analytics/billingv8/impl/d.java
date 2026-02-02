/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.billingclient.api.BillingClient
 */
package io.appmetrica.analytics.billingv8.impl;

import com.android.billingclient.api.BillingClient;
import java.util.LinkedHashSet;

public final class d {
    public final BillingClient a;
    public final LinkedHashSet b;

    public d(BillingClient billingClient) {
        this.a = billingClient;
        this.b = new LinkedHashSet();
    }

    public final void a(Object object) {
        this.b.remove(object);
        if (this.b.size() == 0) {
            this.a.endConnection();
        }
    }
}

