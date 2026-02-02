/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.impl.Al;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.b9;
import io.appmetrica.analytics.impl.bi;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

public final class d5
extends bi {
    public d5(Vf vf3) {
        super(vf3, new CounterConfiguration(), new b9(new Al(LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment")));
        this.b().setReporterType(CounterConfigurationReporterType.COMMUTATION);
    }

    @Override
    public final boolean f() {
        return true;
    }
}

