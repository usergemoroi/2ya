/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.coreapi.internal.executors;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public interface ICommonExecutor
extends IInterruptionSafeThread,
Executor {
    @Override
    public void execute(@NonNull Runnable var1);

    public void executeDelayed(@NonNull Runnable var1, long var2);

    public void executeDelayed(@NonNull Runnable var1, long var2, @NonNull TimeUnit var4);

    public void remove(@NonNull Runnable var1);

    public void removeAll();

    public <T> Future<T> submit(Callable<T> var1);
}

