/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ci;

public final class fi
implements Runnable {
    public final Throwable a;
    public final Ci b;

    public fi(Ci ci2, Throwable throwable) {
        this.b = ci2;
        this.a = throwable;
    }

    @Override
    public final void run() {
        Ci ci2 = this.b;
        Ci.a(ci2.a, ci2.d, ci2.e).reportUnhandledException(this.a);
    }
}

