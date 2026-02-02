/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.impl.v0;
import io.appmetrica.analytics.impl.w0;

public final class mi
implements Provider {
    public final w0 a;
    public final Context b;
    public final ReporterConfig c;

    public mi(w0 w04, Context context, ReporterConfig reporterConfig) {
        this.a = w04;
        this.b = context;
        this.c = reporterConfig;
    }

    public final Object get() {
        w0 w04 = this.a;
        Context context = this.b;
        ReporterConfig reporterConfig = this.c;
        w04.getClass();
        return v0.a(context).f().c(reporterConfig);
    }
}

