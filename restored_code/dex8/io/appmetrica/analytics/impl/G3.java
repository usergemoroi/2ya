/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.impl.f3;
import io.appmetrica.analytics.impl.h3;

public final class g3
implements Consumer {
    public final h3 a;

    public g3(h3 h33) {
        this.a = h33;
    }

    public final void consume(Object object) {
        Object object2 = (Intent)object;
        object = this.a.b;
        object = object == null ? null : ((BatteryInfo)object).chargeType;
        this.a.getClass();
        object2 = h3.a(object2);
        this.a.b = object2;
        if (object != object2.chargeType) {
            this.a.a.execute(new f3(this, (BatteryInfo)object2));
        }
    }
}

