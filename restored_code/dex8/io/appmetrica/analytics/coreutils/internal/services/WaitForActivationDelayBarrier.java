/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrier;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.coreutils.impl.m;
import io.appmetrica.analytics.coreutils.internal.services.a;
import io.appmetrica.analytics.coreutils.internal.services.b;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

public class WaitForActivationDelayBarrier
implements ActivationBarrier {
    private long a;
    private final SystemTimeProvider b;

    public WaitForActivationDelayBarrier() {
        this(new SystemTimeProvider());
    }

    WaitForActivationDelayBarrier(SystemTimeProvider systemTimeProvider) {
        this.b = systemTimeProvider;
    }

    public void activate() {
        this.a = this.b.currentTimeMillis();
    }

    @Override
    public void subscribe(long l10, @NonNull ICommonExecutor iCommonExecutor, @NonNull ActivationBarrierCallback activationBarrierCallback) {
        l10 = Math.max(l10 - (this.b.currentTimeMillis() - this.a), 0L);
        iCommonExecutor.executeDelayed(new m(activationBarrierCallback), l10);
    }

    public static class ActivationBarrierHelper {
        private boolean a = false;
        private final a b;
        private final WaitForActivationDelayBarrier c;

        public ActivationBarrierHelper(@NonNull Runnable runnable, @NonNull WaitForActivationDelayBarrier waitForActivationDelayBarrier) {
            this.b = new a(this, runnable);
            this.c = waitForActivationDelayBarrier;
        }

        static /* synthetic */ void a(ActivationBarrierHelper activationBarrierHelper) {
            activationBarrierHelper.a = true;
        }

        static /* synthetic */ a b(ActivationBarrierHelper activationBarrierHelper) {
            return activationBarrierHelper.b;
        }

        public void subscribeIfNeeded(long l10, @NonNull ICommonExecutor iCommonExecutor) {
            if (!this.a) {
                this.c.subscribe(l10, iCommonExecutor, this.b);
            } else {
                iCommonExecutor.execute(new b(this));
            }
        }
    }
}

