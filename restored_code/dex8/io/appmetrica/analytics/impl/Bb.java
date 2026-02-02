/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.impl.C4;
import io.appmetrica.analytics.impl.Kb;
import io.appmetrica.analytics.impl.a2;
import io.appmetrica.analytics.impl.tb;

public interface bb {
    public C4 a();

    public void a(AppMetricaConfig var1, tb var2);

    public Handler b();

    public a2 c();

    public Kb d();

    public ICommonExecutor getDefaultExecutor();
}

