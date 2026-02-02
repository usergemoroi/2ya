/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.impl.Ci;

public final class ki
implements Runnable {
    public final Revenue a;
    public final Ci b;

    public ki(Ci ci2, Revenue revenue) {
        this.b = ci2;
        this.a = revenue;
    }

    @Override
    public final void run() {
        Ci ci2 = this.b;
        Ci.a(ci2.a, ci2.d, ci2.e).reportRevenue(this.a);
    }
}

