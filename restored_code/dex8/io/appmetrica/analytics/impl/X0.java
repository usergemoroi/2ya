/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.impl.Fi;
import io.appmetrica.analytics.impl.Hc;
import io.appmetrica.analytics.impl.Wc;
import io.appmetrica.analytics.impl.d8;
import io.appmetrica.analytics.impl.hd;
import io.appmetrica.analytics.impl.k0;
import io.appmetrica.analytics.impl.z0;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.jetbrains.annotations.NotNull;

public final class x0
implements Wc {
    public final z0 a;
    public final AppMetricaConfig b;
    public final PublicLogger c;

    public x0(z0 z02, AppMetricaConfig appMetricaConfig, PublicLogger publicLogger) {
        this.a = z02;
        this.b = appMetricaConfig;
        this.c = publicLogger;
    }

    @Override
    @NotNull
    public final Hc a() {
        hd hd3 = this.a;
        Fi fi3 = hd3.g;
        AppMetricaConfig appMetricaConfig = this.b;
        PublicLogger publicLogger = this.c;
        hd3 = hd3.i;
        return fi3.d(appMetricaConfig, publicLogger, new k0(((d8)hd3).i, ((d8)hd3).g));
    }
}

