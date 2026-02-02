/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ci;

public final class hi
implements Runnable {
    public final Ci a;

    public hi(Ci ci2) {
        this.a = ci2;
    }

    @Override
    public final void run() {
        Ci ci2 = this.a;
        Ci.a(ci2.a, ci2.d, ci2.e).pauseSession();
    }
}

