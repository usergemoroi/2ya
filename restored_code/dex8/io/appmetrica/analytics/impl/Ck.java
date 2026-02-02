/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;

public final class ck
implements qb {
    public final AdRevenue a;
    public final boolean b;

    public ck(AdRevenue adRevenue, boolean bl2) {
        this.a = adRevenue;
        this.b = bl2;
    }

    @Override
    public final void a(rb rb2) {
        rb2.reportAdRevenue(this.a, this.b);
    }
}

