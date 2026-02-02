/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.io.SslSocketFactoryProvider;
import io.appmetrica.analytics.impl.Bl;
import io.appmetrica.analytics.impl.D5;
import io.appmetrica.analytics.impl.Li;
import io.appmetrica.analytics.impl.N5;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.io;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import org.jetbrains.annotations.NotNull;

public final class ne
implements ServiceNetworkContext {
    public final D5 a;
    public final String b;
    public final Bl c;

    public ne(@NotNull Context context) {
        this.a = new D5(new N5(context), new Li(Na.j().g()));
        this.b = new io().a();
        this.c = new Bl();
    }

    @Override
    @NotNull
    public final IExecutionPolicy getExecutionPolicy() {
        return this.a;
    }

    @Override
    @NotNull
    public final SimpleNetworkApi getNetworkApi() {
        return this.c;
    }

    @Override
    @NotNull
    public final SslSocketFactoryProvider getSslSocketFactoryProvider() {
        return Na.F.y();
    }

    @Override
    @NotNull
    public final String getUserAgent() {
        return this.b;
    }
}

