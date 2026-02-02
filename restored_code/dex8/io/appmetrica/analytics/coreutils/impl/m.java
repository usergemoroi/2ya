/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;

public final class m
implements Runnable {
    public final ActivationBarrierCallback a;

    public m(ActivationBarrierCallback activationBarrierCallback) {
        this.a = activationBarrierCallback;
    }

    @Override
    public final void run() {
        this.a.onWaitFinished();
    }
}

