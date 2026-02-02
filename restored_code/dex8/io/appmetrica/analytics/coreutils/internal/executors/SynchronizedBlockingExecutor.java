/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal.executors;

import io.appmetrica.analytics.coreutils.internal.executors.BlockingExecutor;

public class SynchronizedBlockingExecutor
extends BlockingExecutor {
    @Override
    public void execute(Runnable runnable) {
        synchronized (this) {
            super.execute(runnable);
            return;
        }
    }
}

