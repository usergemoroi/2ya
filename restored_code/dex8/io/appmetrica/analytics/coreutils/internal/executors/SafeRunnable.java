/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal.executors;

public abstract class SafeRunnable
implements Runnable {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        try {
            this.runSafety();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public abstract void runSafety() throws Throwable;
}

