/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.Wn;

public final class ui
implements Runnable {
    public final Wn a;
    public final Ci b;

    public ui(Ci ci2, Wn wn3) {
        this.b = ci2;
        this.a = wn3;
    }

    @Override
    public final void run() {
        Ci ci2 = this.b;
        Ci.a(ci2.a, ci2.d, ci2.e).a(this.a);
    }
}

