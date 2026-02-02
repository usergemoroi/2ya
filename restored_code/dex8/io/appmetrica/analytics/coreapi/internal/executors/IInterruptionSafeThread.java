/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.executors;

public interface IInterruptionSafeThread {
    public boolean isRunning();

    public void stopRunning();
}

