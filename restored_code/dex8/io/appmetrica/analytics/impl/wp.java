/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.impl.a0;

public final class wp
implements Runnable {
    public final a0 c;
    public final Context d;
    public final AppMetricaLibraryAdapterConfig e;

    public /* synthetic */ wp(a0 a04, Context context, AppMetricaLibraryAdapterConfig appMetricaLibraryAdapterConfig) {
        this.c = a04;
        this.d = context;
        this.e = appMetricaLibraryAdapterConfig;
    }

    @Override
    public final void run() {
        a0.a(this.c, this.d, this.e);
    }
}

