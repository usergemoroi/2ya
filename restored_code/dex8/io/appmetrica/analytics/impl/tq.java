/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.sc;

public final class tq
implements Runnable {
    public final sc c;
    public final boolean d;

    public /* synthetic */ tq(sc sc3, boolean bl2) {
        this.c = sc3;
        this.d = bl2;
    }

    @Override
    public final void run() {
        sc.a(this.c, this.d);
    }
}

