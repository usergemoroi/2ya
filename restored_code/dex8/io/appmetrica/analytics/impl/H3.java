/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.impl.e3;
import io.appmetrica.analytics.impl.g3;
import java.util.ArrayList;

public final class h3
implements ChargeTypeProvider {
    public static final ChargeType d = ChargeType.UNKNOWN;
    public final ICommonExecutor a;
    public volatile BatteryInfo b;
    public final ArrayList c = new ArrayList();

    public h3(@NonNull ICommonExecutor iCommonExecutor, @NonNull e3 e34) {
        g3 g32 = new g3(this);
        this.a = iCommonExecutor;
        this.b = h3.a(e34.a(g32));
    }

    public static BatteryInfo a(Intent intent) {
        ChargeType chargeType = d;
        Integer n10 = null;
        Integer n13 = null;
        if (intent != null) {
            int n14 = intent.getIntExtra("level", -1);
            int n15 = intent.getIntExtra("scale", -1);
            n10 = n13;
            if (n14 > 0) {
                n10 = n13;
                if (n15 > 0) {
                    n10 = n14 * 100 / n15;
                }
            }
            n14 = intent.getIntExtra("plugged", -1);
            chargeType = ChargeType.NONE;
            if (n14 != 1) {
                if (n14 != 2) {
                    if (n14 == 4) {
                        chargeType = ChargeType.WIRELESS;
                    }
                } else {
                    chargeType = ChargeType.USB;
                }
            } else {
                chargeType = ChargeType.AC;
            }
        }
        return new BatteryInfo(n10, chargeType);
    }

    @Override
    @Nullable
    public final Integer getBatteryLevel() {
        Object object = this.b;
        object = object == null ? null : ((BatteryInfo)object).batteryLevel;
        return object;
    }

    @Override
    @NonNull
    public final ChargeType getChargeType() {
        Object object = this.b;
        object = object == null ? ChargeType.UNKNOWN : object.chargeType;
        return object;
    }

    @Override
    public final void registerChargeTypeListener(@NonNull ChargeTypeChangeListener chargeTypeChangeListener) {
        synchronized (this) {
            this.c.add(chargeTypeChangeListener);
            chargeTypeChangeListener.onChargeTypeChanged(this.getChargeType());
            return;
        }
    }
}

