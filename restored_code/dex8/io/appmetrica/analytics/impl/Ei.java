/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ci;

public final class ei
implements Runnable {
    public final String a;
    public final String b;
    public final Throwable c;
    public final Ci d;

    public ei(Ci ci2, String string2, String string3, Throwable throwable) {
        this.d = ci2;
        this.a = string2;
        this.b = string3;
        this.c = throwable;
    }

    @Override
    public final void run() {
        Ci ci2 = this.d;
        Ci.a(ci2.a, ci2.d, ci2.e).reportError(this.a, this.b, this.c);
    }
}

