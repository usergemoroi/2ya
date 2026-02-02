/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.impl.Ci;

public final class ri
implements Runnable {
    public final ModuleEvent a;
    public final Ci b;

    public ri(Ci ci2, ModuleEvent moduleEvent) {
        this.b = ci2;
        this.a = moduleEvent;
    }

    @Override
    public final void run() {
        Ci ci2 = this.b;
        Ci.a(ci2.a, ci2.d, ci2.e).reportEvent(this.a);
    }
}

