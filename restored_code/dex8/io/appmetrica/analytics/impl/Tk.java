/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.crypto.CryptoProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.impl.Ik;
import io.appmetrica.analytics.impl.Lk;
import io.appmetrica.analytics.impl.Mk;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.O6;
import io.appmetrica.analytics.impl.U1;
import io.appmetrica.analytics.impl.Y9;
import io.appmetrica.analytics.impl.h3;
import io.appmetrica.analytics.impl.ne;
import io.appmetrica.analytics.impl.y7;
import io.appmetrica.analytics.impl.zd;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleController;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import org.jetbrains.annotations.NotNull;

public final class tk
implements ServiceContext {
    public final ModuleServiceLifecycleController a;
    public final ne b;
    public final zd c;
    public final Mk d;
    public final Ik e;
    public final Y9 f;
    public final O6 g;

    public tk(@NotNull ModuleServiceLifecycleController moduleServiceLifecycleController) {
        this.a = moduleServiceLifecycleController;
        this.b = new ne(this.getContext());
        this.c = new zd();
        this.d = new Mk(this.getContext(), new Lk(new U1()));
        this.e = new Ik(this.getContext(), Na.j().x(), y7.a(this.getContext()).h());
        this.f = new Y9();
        this.g = new O6();
    }

    @NotNull
    public final ne a() {
        return this.b;
    }

    @NotNull
    public final zd b() {
        return this.c;
    }

    @NotNull
    public final Ik c() {
        return this.e;
    }

    @NotNull
    public final Mk d() {
        return this.d;
    }

    @Override
    @NotNull
    public final ActivationBarrier getActivationBarrier() {
        return Na.F.B.getActivationBarrier();
    }

    @Override
    @NotNull
    public final ApplicationStateProvider getApplicationStateProvider() {
        return Na.F.k().b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NotNull
    public final ChargeTypeProvider getChargeTypeProvider() {
        h3 h33;
        Na na4 = Na.F;
        h3 h34 = h33 = na4.e;
        if (h33 != null) return h34;
        synchronized (na4) {
            try {
                h34 = h33 = na4.e;
                if (h33 != null) return h34;
                na4.e = h34 = new h3(na4.d.a(), na4.k().a);
                return h34;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    @NotNull
    public final Context getContext() {
        return Na.F.a;
    }

    @Override
    @NotNull
    public final CryptoProvider getCryptoProvider() {
        return this.g;
    }

    @Override
    @NotNull
    public final DataSendingRestrictionController getDataSendingRestrictionController() {
        return Na.F.g();
    }

    @Override
    @NotNull
    public final ExecutorProvider getExecutorProvider() {
        return this.f;
    }

    @Override
    @NotNull
    public final FirstExecutionConditionService getFirstExecutionConditionService() {
        return Na.F.B.getFirstExecutionService();
    }

    @Override
    @NotNull
    public final LocationServiceApi getLocationServiceApi() {
        return Na.F.l();
    }

    @Override
    @NotNull
    public final ModuleServiceLifecycleController getModuleServiceLifecycleController() {
        return this.a;
    }

    @Override
    public final ServiceNetworkContext getNetworkContext() {
        return this.b;
    }

    @Override
    @NotNull
    public final PermissionExtractor getPermissionExtractor() {
        return Na.F.i();
    }

    @Override
    @NotNull
    public final PlatformIdentifiers getPlatformIdentifiers() {
        return Na.F.r();
    }

    @Override
    @NotNull
    public final SdkEnvironmentProvider getSdkEnvironmentProvider() {
        return Na.F.u();
    }

    @Override
    public final ModuleSelfReporter getSelfReporter() {
        return this.c;
    }

    @Override
    public final ServiceStorageProvider getServiceStorageProvider() {
        return this.e;
    }

    @Override
    public final ServiceWakeLock getServiceWakeLock() {
        return this.d;
    }
}

