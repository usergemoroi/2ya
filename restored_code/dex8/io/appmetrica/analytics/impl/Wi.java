/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.U;

public final class wi
implements Runnable {
    public final U a;
    public final Ci b;

    public wi(Ci ci2, U u11) {
        this.b = ci2;
        this.a = u11;
    }

    @Override
    public final void run() {
        Ci ci2 = this.b;
        Ci.a(ci2.a, ci2.d, ci2.e).a(this.a);
    }
}

