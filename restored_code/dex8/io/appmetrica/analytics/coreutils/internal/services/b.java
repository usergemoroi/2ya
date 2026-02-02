/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import io.appmetrica.analytics.coreutils.internal.services.a;

public final class b
implements Runnable {
    public final WaitForActivationDelayBarrier.ActivationBarrierHelper a;

    public b(WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper) {
        this.a = activationBarrierHelper;
    }

    @Override
    public final void run() {
        a a14 = WaitForActivationDelayBarrier.ActivationBarrierHelper.b(this.a);
        WaitForActivationDelayBarrier.ActivationBarrierHelper.a(a14.b);
        a14.a.run();
    }
}

