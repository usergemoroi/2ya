/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.xm;

public final class x2
implements ProtobufConverter {
    @NonNull
    public final BillingConfig a(@NonNull xm xm3) {
        return new BillingConfig(xm3.a, xm3.b);
    }

    @NonNull
    public final xm a(@NonNull BillingConfig billingConfig) {
        xm xm3 = new xm();
        xm3.a = billingConfig.sendFrequencySeconds;
        xm3.b = billingConfig.firstCollectingInappMaxAgeSeconds;
        return xm3;
    }

    @Override
    @NonNull
    public final Object toModel(@NonNull Object object) {
        object = (xm)object;
        return new BillingConfig(((xm)object).a, ((xm)object).b);
    }
}

