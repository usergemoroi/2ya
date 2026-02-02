/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;

public final class ik
implements qb {
    public final String a;

    public ik(String string2) {
        this.a = string2;
    }

    @Override
    public final void a(rb rb2) {
        rb2.reportEvent(this.a);
    }
}

