/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.impl.g3;
import io.appmetrica.analytics.impl.h3;

public final class f3
extends SafeRunnable {
    public final BatteryInfo a;
    public final g3 b;

    public f3(g3 g32, BatteryInfo batteryInfo) {
        this.b = g32;
        this.a = batteryInfo;
    }

    @Override
    public final void runSafety() {
        h3 h33 = this.b.a;
        ChargeType chargeType = this.a.chargeType;
        Object object = h3.d;
        synchronized (h33) {
            Throwable throwable2;
            block4: {
                try {
                    object = h33.c.iterator();
                    while (object.hasNext()) {
                        ((ChargeTypeChangeListener)object.next()).onChargeTypeChanged(chargeType);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }
}

