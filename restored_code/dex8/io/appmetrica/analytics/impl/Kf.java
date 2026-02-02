/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Kn;
import io.appmetrica.analytics.impl.i;
import io.appmetrica.analytics.impl.te;
import io.appmetrica.analytics.impl.ue;
import io.appmetrica.analytics.impl.w0;
import io.appmetrica.analytics.impl.we;

public final class kf {
    public final i a;
    public final Kn b;
    public final Kn c;
    public final te d;

    public kf(w0 w04) {
        this.a = new i(w04);
        this.b = new Kn(new we("Error details"));
        this.c = new Kn(new ue("Error identifier"));
        this.d = new te("Stacktrace");
    }
}

