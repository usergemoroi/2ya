/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.impl.qb;
import io.appmetrica.analytics.impl.rb;

public final class ak
implements qb {
    public final ModuleEvent a;

    public ak(ModuleEvent moduleEvent) {
        this.a = moduleEvent;
    }

    @Override
    public final void a(rb rb2) {
        rb2.reportEvent(this.a);
    }
}

