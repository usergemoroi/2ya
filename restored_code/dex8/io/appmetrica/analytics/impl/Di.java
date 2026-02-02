/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ci;

public final class di
implements Runnable {
    public final String a;
    public final Throwable b;
    public final Ci c;

    public di(Ci ci2, String string2, Throwable throwable) {
        this.c = ci2;
        this.a = string2;
        this.b = throwable;
    }

    @Override
    public final void run() {
        Ci ci2 = this.c;
        Ci.a(ci2.a, ci2.d, ci2.e).reportError(this.a, this.b);
    }
}

