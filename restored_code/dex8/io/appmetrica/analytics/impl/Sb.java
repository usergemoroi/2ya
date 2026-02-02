/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.WorkerThread
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.impl.ib;
import io.appmetrica.analytics.impl.k0;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.impl.tb;
import io.appmetrica.analytics.impl.ub;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

public interface sb
extends tb {
    @NonNull
    @WorkerThread
    public ib a(@NonNull AppMetricaConfig var1, @NonNull PublicLogger var2, @NonNull k0 var3);

    @Override
    @NonNull
    public /* synthetic */ sb a();

    @NonNull
    public ub a(@NonNull AppMetricaConfig var1);

    public void a(@NonNull ReporterConfig var1);

    @NonNull
    @WorkerThread
    public ib b(@NonNull AppMetricaConfig var1, @NonNull PublicLogger var2, @NonNull k0 var3);

    @NonNull
    public rb b(@NonNull ReporterConfig var1);
}

