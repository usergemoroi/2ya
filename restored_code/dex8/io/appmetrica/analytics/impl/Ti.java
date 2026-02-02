/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.impl.Ci;

public final class ti
implements Runnable {
    public final AdRevenue a;
    public final boolean b;
    public final Ci c;

    public ti(Ci ci2, AdRevenue adRevenue, boolean bl2) {
        this.c = ci2;
        this.a = adRevenue;
        this.b = bl2;
    }

    @Override
    public final void run() {
        Ci ci2 = this.c;
        Ci.a(ci2.a, ci2.d, ci2.e).reportAdRevenue(this.a, this.b);
    }
}

