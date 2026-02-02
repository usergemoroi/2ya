/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.r1;

public final class p1
implements Runnable {
    public final String a;
    public final String b;
    public final Throwable c;
    public final r1 d;

    public p1(r1 r14, String string2, String string3, Throwable throwable) {
        this.d = r14;
        this.a = string2;
        this.b = string3;
        this.c = throwable;
    }

    @Override
    public final void run() {
        r1.a(this.d).reportError(this.a, this.b, this.c);
    }
}

