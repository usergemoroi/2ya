/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal.executors;

import java.util.concurrent.Executor;

public class BlockingExecutor
implements Executor {
    @Override
    public void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}

