/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0003H&J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0010H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0011"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/common/ExecutorProvider;", "", "moduleExecutor", "Lio/appmetrica/analytics/coreapi/internal/executors/IHandlerExecutor;", "getModuleExecutor", "()Lio/appmetrica/analytics/coreapi/internal/executors/IHandlerExecutor;", "getDefaultExecutor", "getInterruptionThread", "Lio/appmetrica/analytics/coreapi/internal/executors/InterruptionSafeThread;", "moduleIdentifier", "", "threadNamePostfix", "runnable", "Ljava/lang/Runnable;", "getSupportIOExecutor", "getUiExecutor", "Ljava/util/concurrent/Executor;", "modules-api_release"}, k=1, mv={1, 6, 0}, xi=48)
public interface ExecutorProvider {
    @NotNull
    public IHandlerExecutor getDefaultExecutor();

    @NotNull
    public InterruptionSafeThread getInterruptionThread(@NotNull String var1, @NotNull String var2, @NotNull Runnable var3);

    @NotNull
    public IHandlerExecutor getModuleExecutor();

    @NotNull
    public IHandlerExecutor getSupportIOExecutor();

    @NotNull
    public Executor getUiExecutor();
}

