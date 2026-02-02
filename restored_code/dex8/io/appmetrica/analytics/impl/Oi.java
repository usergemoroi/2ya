/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ci;

public final class oi
implements Runnable {
    public final boolean a;
    public final Ci b;

    public oi(Ci ci2, boolean bl2) {
        this.b = ci2;
        this.a = bl2;
    }

    @Override
    public final void run() {
        Ci ci2 = this.b;
        Ci.a(ci2.a, ci2.d, ci2.e).setDataSendingEnabled(this.a);
    }
}

