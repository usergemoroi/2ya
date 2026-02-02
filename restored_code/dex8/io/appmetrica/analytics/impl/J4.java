/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Ab;
import io.appmetrica.analytics.impl.B4;
import io.appmetrica.analytics.impl.G5;
import io.appmetrica.analytics.impl.g6;
import io.appmetrica.analytics.impl.h4;
import io.appmetrica.analytics.impl.i4;
import io.appmetrica.analytics.impl.i6;
import io.appmetrica.analytics.impl.j6;
import io.appmetrica.analytics.impl.n;
import io.appmetrica.analytics.impl.qd;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ProcessDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class j4
implements g6 {
    public final Context a;
    public final j6 b;
    public final B4 c;
    public final Ab d;
    public final n e;
    public final h4 f;
    public final qd g;
    public final i4 h;

    public j4(@NotNull Context context) {
        this.a = context;
        this.b = new j6(new G5());
        this.c = new B4(A4.l().b(this.getContext()));
        this.d = new Ab();
        this.e = A4.l().a();
        this.f = new h4();
        this.g = new qd();
        this.h = new i4();
    }

    @Override
    @NotNull
    public final ActivityLifecycleRegistry getActivityLifecycleRegistry() {
        return this.e;
    }

    @Override
    @NotNull
    public final ModuleClientActivator getClientActivator() {
        return this.f;
    }

    @Override
    @NotNull
    public final ModuleClientExecutorProvider getClientExecutorProvider() {
        return this.g;
    }

    @Override
    @NotNull
    public final ClientStorageProvider getClientStorageProvider() {
        return this.c;
    }

    @Override
    @NotNull
    public final Context getContext() {
        return this.a;
    }

    @Override
    @NotNull
    public final InternalClientModuleFacade getInternalClientModuleFacade() {
        return this.d;
    }

    @Override
    @NotNull
    public final i6 getModuleAdRevenueContext() {
        return this.b;
    }

    @Override
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.b;
    }

    @Override
    @NotNull
    public final ProcessDetector getProcessDetector() {
        return this.h;
    }
}

