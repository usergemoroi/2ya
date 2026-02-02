/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.impl.Ic;
import io.appmetrica.analytics.impl.c;

public final class kp
implements c {
    public final AnrListener a;

    public /* synthetic */ kp(AnrListener anrListener) {
        this.a = anrListener;
    }

    @Override
    public final void onAppNotResponding() {
        Ic.b(this.a);
    }
}

