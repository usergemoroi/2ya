/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;

public final class a
implements ActivationBarrierCallback {
    public final Runnable a;
    public final WaitForActivationDelayBarrier.ActivationBarrierHelper b;

    public a(WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, Runnable runnable) {
        this.b = activationBarrierHelper;
        this.a = runnable;
    }

    @Override
    public final void onWaitFinished() {
        WaitForActivationDelayBarrier.ActivationBarrierHelper.a(this.b);
        this.a.run();
    }
}

