/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.r1;

public final class o1
implements Runnable {
    public final String a;
    public final Throwable b;
    public final r1 c;

    public o1(r1 r14, String string2, Throwable throwable) {
        this.c = r14;
        this.a = string2;
        this.b = throwable;
    }

    @Override
    public final void run() {
        r1.a(this.c).reportError(this.a, this.b);
    }
}

