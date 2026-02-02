/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.C6;
import io.appmetrica.analytics.impl.Jb;
import io.appmetrica.analytics.impl.qh;

public final class pq
implements Consumer {
    public final Bb a;
    public final C6 b;
    public final qh c;

    public /* synthetic */ pq(Bb bb4, C6 c64, qh qh3) {
        this.a = bb4;
        this.b = c64;
        this.c = qh3;
    }

    public final void consume(Object object) {
        qh.a(this.a, this.b, this.c, (Jb)object);
    }
}

