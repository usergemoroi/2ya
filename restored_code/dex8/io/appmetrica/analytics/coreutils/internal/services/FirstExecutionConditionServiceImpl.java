/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class FirstExecutionConditionServiceImpl
implements FirstExecutionConditionService {
    private final ArrayList a = new ArrayList();
    private UtilityServiceConfiguration b;
    final UtilityServiceProvider c;

    public FirstExecutionConditionServiceImpl(@NonNull UtilityServiceProvider utilityServiceProvider) {
        this.c = utilityServiceProvider;
    }

    final FirstExecutionHandler a(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
        synchronized (this) {
            FirstExecutionHandler firstExecutionHandler = new FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker, 0);
            this.a.add(firstExecutionHandler);
            return firstExecutionHandler;
        }
    }

    @Override
    @NonNull
    public FirstExecutionDelayedTask createDelayedTask(@NonNull String object, @NonNull ICommonExecutor iCommonExecutor, @NonNull Runnable object2) {
        synchronized (this) {
            WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper = new WaitForActivationDelayBarrier.ActivationBarrierHelper((Runnable)object2, this.c.getActivationBarrier());
            object2 = this.b;
            FirstExecutionDelayChecker firstExecutionDelayChecker = new FirstExecutionDelayChecker();
            FirstExecutionConditionChecker firstExecutionConditionChecker = new FirstExecutionConditionChecker((UtilityServiceConfiguration)object2, firstExecutionDelayChecker, (String)object);
            object = this.a(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
        Object object;
        synchronized (this) {
            this.b = utilityServiceConfiguration;
            object = new ArrayList(this.a);
        }
        object = ((ArrayList)object).iterator();
        while (object.hasNext()) {
            ((FirstExecutionHandler)object.next()).updateConfig(utilityServiceConfiguration);
        }
        return;
    }

    public static class FirstExecutionConditionChecker {
        private boolean a;
        private long b;
        private long c;
        private long d;
        private final FirstExecutionDelayChecker e;
        public final String tag;

        public FirstExecutionConditionChecker(@Nullable UtilityServiceConfiguration utilityServiceConfiguration, @NonNull FirstExecutionDelayChecker firstExecutionDelayChecker, @NonNull String string2) {
            this.e = firstExecutionDelayChecker;
            this.a = false;
            long l10 = 0L;
            long l11 = utilityServiceConfiguration == null ? 0L : utilityServiceConfiguration.getInitialConfigTime();
            this.c = l11;
            l11 = utilityServiceConfiguration == null ? l10 : utilityServiceConfiguration.getLastUpdateConfigTime();
            this.b = l11;
            this.d = Long.MAX_VALUE;
            this.tag = string2;
        }

        final void a() {
            this.a = true;
        }

        final void a(long l10) {
            this.d = TimeUnit.SECONDS.toMillis(l10);
        }

        final void a(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.c = utilityServiceConfiguration.getInitialConfigTime();
            this.b = utilityServiceConfiguration.getLastUpdateConfigTime();
        }

        final boolean b() {
            if (this.a) {
                return true;
            }
            return this.e.delaySinceFirstStartupWasPassed(this.c, this.b, this.d);
        }
    }

    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long l10, long l11, long l13) {
            boolean bl2 = l11 - l10 >= l13;
            return bl2;
        }
    }

    public static class FirstExecutionHandler
    implements FirstExecutionDelayedTask {
        private final FirstExecutionConditionChecker a;
        private final WaitForActivationDelayBarrier.ActivationBarrierHelper b;
        private final ICommonExecutor c;

        private FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.b = activationBarrierHelper;
            this.a = firstExecutionConditionChecker;
            this.c = iCommonExecutor;
        }

        /* synthetic */ FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker, int n10) {
            this(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        }

        public boolean canExecute() {
            boolean bl2 = this.a.b();
            if (bl2) {
                this.a.a();
            }
            return bl2;
        }

        @Override
        public void setInitialDelaySeconds(long l10) {
            this.a.a(l10);
        }

        @Override
        public boolean tryExecute(long l10) {
            if (this.a.b()) {
                this.b.subscribeIfNeeded(TimeUnit.SECONDS.toMillis(l10), this.c);
                this.a.a();
                return true;
            }
            return false;
        }

        public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
            this.a.a(utilityServiceConfiguration);
        }
    }
}

