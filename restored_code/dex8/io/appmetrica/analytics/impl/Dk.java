/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;
import java.util.Map;

public final class dk
implements qb {
    public final Map a;

    public dk(Map map2) {
        this.a = map2;
    }

    @Override
    public final void a(rb rb2) {
        rb2.reportAnr(this.a);
    }
}

