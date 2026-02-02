/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2={"Lio/appmetrica/analytics/coreapi/internal/servicecomponents/FirstExecutionConditionService;", "", "createDelayedTask", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/FirstExecutionDelayedTask;", "tag", "", "executor", "Lio/appmetrica/analytics/coreapi/internal/executors/ICommonExecutor;", "runnable", "Ljava/lang/Runnable;", "core-api_release"}, k=1, mv={1, 6, 0}, xi=48)
public interface FirstExecutionConditionService {
    @NotNull
    public FirstExecutionDelayedTask createDelayedTask(@NotNull String var1, @NotNull ICommonExecutor var2, @NotNull Runnable var3);
}

