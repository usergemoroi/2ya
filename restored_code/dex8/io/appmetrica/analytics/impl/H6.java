/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.gq;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class h6
implements Runnable {
    public final List a;
    public final IHandlerExecutor b;
    public final WaitForActivationDelayBarrier c;

    public h6(List list) {
        this.a = list;
        this.b = Na.j().w().a();
        this.c = Na.j().a();
    }

    public static final void a(h6 object) {
        object = ((h6)object).a.iterator();
        while (object.hasNext()) {
            ((Runnable)object.next()).run();
        }
    }

    @Override
    public final void run() {
        this.c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.b, new gq(this));
    }
}

