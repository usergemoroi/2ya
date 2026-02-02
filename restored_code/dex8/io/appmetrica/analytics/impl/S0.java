/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.C4;
import io.appmetrica.analytics.impl.Kb;
import io.appmetrica.analytics.impl.a2;
import io.appmetrica.analytics.impl.bb;
import io.appmetrica.analytics.impl.tb;

public final class s0
implements bb {
    public final Handler a;
    public final IHandlerExecutor b;
    public final C4 c;

    public s0() {
        IHandlerExecutor iHandlerExecutor;
        this.b = iHandlerExecutor = A4.l().g().a();
        this.a = iHandlerExecutor.getHandler();
        this.c = new C4();
    }

    @Override
    @NonNull
    public final C4 a() {
        return this.c;
    }

    @Override
    public final void a(@Nullable AppMetricaConfig appMetricaConfig, @NonNull tb tb3) {
    }

    @Override
    @NonNull
    public final Handler b() {
        return this.a;
    }

    @Override
    @NonNull
    public final a2 c() {
        return new a2();
    }

    @Override
    @NonNull
    public final Kb d() {
        return new Kb();
    }

    @Override
    @NonNull
    public final ICommonExecutor getDefaultExecutor() {
        return this.b;
    }
}

