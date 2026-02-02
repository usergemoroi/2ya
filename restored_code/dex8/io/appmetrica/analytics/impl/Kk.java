/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;
import java.util.Map;

public final class kk
implements qb {
    public final String a;
    public final Map b;

    public kk(String string2, Map map2) {
        this.a = string2;
        this.b = map2;
    }

    @Override
    public final void a(rb rb2) {
        rb2.reportEvent(this.a, this.b);
    }
}

