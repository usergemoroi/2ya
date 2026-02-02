/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.v0;
import io.appmetrica.analytics.impl.w0;

public final class qi
implements Runnable {
    public final ReporterConfig a;
    public final Ci b;

    public qi(Ci ci2, ReporterConfig reporterConfig) {
        this.b = ci2;
        this.a = reporterConfig;
    }

    @Override
    public final void run() {
        Ci ci2 = this.b;
        ReporterConfig reporterConfig = this.a;
        w0 w04 = ci2.a;
        ci2 = ci2.d;
        w04.getClass();
        v0.a((Context)ci2).f().a(reporterConfig);
    }
}

