/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.a
 *  kotlin.n
 */
package io.appmetrica.analytics.coreutils.internal.services;

import io.appmetrica.analytics.coreutils.impl.l;
import io.appmetrica.analytics.coreutils.internal.services.FirstExecutionConditionServiceImpl;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import kotlin.Metadata;
import kotlin.jvm.functions.a;
import kotlin.m;
import kotlin.n;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0015\u0010\u0004J\r\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u000e\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0016"}, d2={"Lio/appmetrica/analytics/coreutils/internal/services/UtilityServiceProvider;", "", "Lkotlin/k0;", "initAsync", "()V", "Lio/appmetrica/analytics/coreutils/internal/services/UtilityServiceConfiguration;", "configuration", "updateConfiguration", "(Lio/appmetrica/analytics/coreutils/internal/services/UtilityServiceConfiguration;)V", "Lio/appmetrica/analytics/coreutils/internal/services/FirstExecutionConditionServiceImpl;", "a", "Lkotlin/m;", "getFirstExecutionService", "()Lio/appmetrica/analytics/coreutils/internal/services/FirstExecutionConditionServiceImpl;", "firstExecutionService", "Lio/appmetrica/analytics/coreutils/internal/services/WaitForActivationDelayBarrier;", "b", "Lio/appmetrica/analytics/coreutils/internal/services/WaitForActivationDelayBarrier;", "getActivationBarrier", "()Lio/appmetrica/analytics/coreutils/internal/services/WaitForActivationDelayBarrier;", "activationBarrier", "<init>", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class UtilityServiceProvider {
    private final m a = n.b((a)new l(this));
    private final WaitForActivationDelayBarrier b = new WaitForActivationDelayBarrier();

    @NotNull
    public final WaitForActivationDelayBarrier getActivationBarrier() {
        return this.b;
    }

    @NotNull
    public final FirstExecutionConditionServiceImpl getFirstExecutionService() {
        return (FirstExecutionConditionServiceImpl)this.a.getValue();
    }

    public final void initAsync() {
        this.b.activate();
    }

    public final void updateConfiguration(@NotNull UtilityServiceConfiguration utilityServiceConfiguration) {
        this.getFirstExecutionService().updateConfig(utilityServiceConfiguration);
    }
}

