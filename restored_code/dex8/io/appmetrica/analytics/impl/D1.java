/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.r1;
import io.appmetrica.analytics.impl.v0;
import io.appmetrica.analytics.impl.w0;

public final class d1
implements Runnable {
    public final String a;
    public final String b;
    public final r1 c;

    public d1(r1 r14, String string2, String string3) {
        this.c = r14;
        this.a = string2;
        this.b = string3;
    }

    @Override
    public final void run() {
        w0 w04 = this.c.a;
        String string2 = this.a;
        String string3 = this.b;
        w04.getClass();
        v0.c().putAppEnvironmentValue(string2, string3);
    }
}

