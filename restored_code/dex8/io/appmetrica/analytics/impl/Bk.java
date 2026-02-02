/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;

public final class bk
implements qb {
    public final String a;
    public final byte[] b;

    public bk(String string2, byte[] byArray) {
        this.a = string2;
        this.b = byArray;
    }

    @Override
    public final void a(rb rb2) {
        rb2.setSessionExtra(this.a, this.b);
    }
}

