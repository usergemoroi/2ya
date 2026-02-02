/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.impl.h6;

public final class gq
implements ActivationBarrierCallback {
    public final h6 a;

    public /* synthetic */ gq(h6 h63) {
        this.a = h63;
    }

    @Override
    public final void onWaitFinished() {
        h6.a(this.a);
    }
}

