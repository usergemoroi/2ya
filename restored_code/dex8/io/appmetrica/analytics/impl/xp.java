/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.U;
import io.appmetrica.analytics.impl.dc;

public final class xp
implements Runnable {
    public final dc c;
    public final U d;

    public /* synthetic */ xp(dc dc3, U u11) {
        this.c = dc3;
        this.d = u11;
    }

    @Override
    public final void run() {
        dc.a(this.c, this.d);
    }
}

