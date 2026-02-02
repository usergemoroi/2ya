/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.impl.r1;

public final class i1
implements Runnable {
    public final ExternalAttribution a;
    public final r1 b;

    public i1(r1 r14, ExternalAttribution externalAttribution) {
        this.b = r14;
        this.a = externalAttribution;
    }

    @Override
    public final void run() {
        r1.a(this.b).a(this.a);
    }
}

