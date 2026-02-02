/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.g0;
import io.appmetrica.analytics.impl.ql;
import io.appmetrica.analytics.impl.w0;
import io.appmetrica.analytics.impl.we;

public final class bc {
    public final we a = new we("Context");
    public final we b = new we("Config");
    public final ql c;
    public final we d;
    public final we e;
    public final we f;
    public final g0 g;

    public bc(w0 w04) {
        this.c = new ql(w04);
        this.d = new we("Sender");
        this.e = new we("Event");
        this.f = new we("Payload");
        this.g = new g0();
    }
}

