/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Eg;
import io.appmetrica.analytics.impl.Og;

public final class gp
implements Runnable {
    public final Og c;
    public final Throwable d;

    public /* synthetic */ gp(Og og2, Throwable throwable) {
        this.c = og2;
        this.d = throwable;
    }

    @Override
    public final void run() {
        Eg.b(this.c, this.d);
    }
}

