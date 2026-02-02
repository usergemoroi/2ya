/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.impl.Ci;

public final class li
implements Runnable {
    public final AdRevenue a;
    public final Ci b;

    public li(Ci ci2, AdRevenue adRevenue) {
        this.b = ci2;
        this.a = adRevenue;
    }

    @Override
    public final void run() {
        Ci ci2 = this.b;
        Ci.a(ci2.a, ci2.d, ci2.e).reportAdRevenue(this.a);
    }
}

