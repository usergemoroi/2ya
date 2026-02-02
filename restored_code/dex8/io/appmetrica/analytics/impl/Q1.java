/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.r1;

public final class q1
implements Runnable {
    public final Throwable a;
    public final r1 b;

    public q1(r1 r14, Throwable throwable) {
        this.b = r14;
        this.a = throwable;
    }

    @Override
    public final void run() {
        r1.a(this.b).reportUnhandledException(this.a);
    }
}

