/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Dg;
import io.appmetrica.analytics.impl.Eg;
import io.appmetrica.analytics.impl.Og;

public final class ep
implements Runnable {
    public final Eg c;
    public final Og d;

    public /* synthetic */ ep(Eg eg3, Og og2) {
        this.c = eg3;
        this.d = og2;
    }

    @Override
    public final void run() {
        Dg.a(this.c, this.d);
    }
}

