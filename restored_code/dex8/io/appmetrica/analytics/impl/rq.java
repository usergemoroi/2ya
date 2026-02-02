/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.impl.r1;

public final class rq
implements Runnable {
    public final r1 c;
    public final Context d;
    public final AppMetricaConfig e;

    public /* synthetic */ rq(r1 r14, Context context, AppMetricaConfig appMetricaConfig) {
        this.c = r14;
        this.d = context;
        this.e = appMetricaConfig;
    }

    @Override
    public final void run() {
        this.c.b(this.d, this.e);
    }
}

