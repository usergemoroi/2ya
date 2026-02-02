/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.Ci;

public final class ni
implements Runnable {
    public final ECommerceEvent a;
    public final Ci b;

    public ni(Ci ci2, ECommerceEvent eCommerceEvent) {
        this.b = ci2;
        this.a = eCommerceEvent;
    }

    @Override
    public final void run() {
        Ci ci2 = this.b;
        Ci.a(ci2.a, ci2.d, ci2.e).reportECommerce(this.a);
    }
}

