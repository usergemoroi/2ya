/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.impl.q3;

public final class p3
implements ApplicationStateObserver {
    public final q3 a;

    public p3(q3 q34) {
        this.a = q34;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void onApplicationStateChanged(ApplicationState object) {
        q3 q34 = this.a;
        q34.getClass();
        if (object != ApplicationState.VISIBLE) return;
        try {
            object = q34.a;
            if (object == null) return;
            object.onSessionResumed();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

