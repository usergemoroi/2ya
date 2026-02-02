/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.coreapi.internal.executors;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread;

public class InterruptionSafeThread
extends Thread
implements IInterruptionSafeThread {
    private volatile boolean a = true;

    public InterruptionSafeThread() {
    }

    @VisibleForTesting(otherwise=5)
    public InterruptionSafeThread(@NonNull Runnable runnable) {
        super(runnable);
    }

    public InterruptionSafeThread(@NonNull Runnable runnable, @NonNull String string2) {
        super(runnable, string2);
    }

    public InterruptionSafeThread(@NonNull String string2) {
        super(string2);
    }

    @Override
    public boolean isRunning() {
        synchronized (this) {
            boolean bl2 = this.a;
            return bl2;
        }
    }

    @Override
    public void stopRunning() {
        synchronized (this) {
            this.a = false;
            this.interrupt();
            return;
        }
    }
}

