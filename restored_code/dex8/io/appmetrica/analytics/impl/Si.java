/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ci;

public final class si
implements Runnable {
    public final String a;
    public final byte[] b;
    public final Ci c;

    public si(Ci ci2, String string2, byte[] byArray) {
        this.c = ci2;
        this.a = string2;
        this.b = byArray;
    }

    @Override
    public final void run() {
        Ci ci2 = this.c;
        Ci.a(ci2.a, ci2.d, ci2.e).setSessionExtra(this.a, this.b);
    }
}

