/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;

public final class fk
implements qb {
    public final String a;
    public final String b;

    public fk(String string2, String string3) {
        this.a = string2;
        this.b = string3;
    }

    @Override
    public final void a(rb rb2) {
        rb2.putAppEnvironmentValue(this.a, this.b);
    }
}

