/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.impl.r1;

public final class h1
implements Runnable {
    public final AnrListener a;
    public final r1 b;

    public h1(r1 r14, AnrListener anrListener) {
        this.b = r14;
        this.a = anrListener;
    }

    @Override
    public final void run() {
        r1.a(this.b).a(this.a);
    }
}

