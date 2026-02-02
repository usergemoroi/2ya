/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.r1;
import io.appmetrica.analytics.impl.v0;

public final class f1
implements Runnable {
    public final r1 a;

    public f1(r1 r14) {
        this.a = r14;
    }

    @Override
    public final void run() {
        this.a.a.getClass();
        v0.c().clearAppEnvironment();
    }
}

