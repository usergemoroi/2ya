/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ActivationBarrier;", "", "", "delay", "Lio/appmetrica/analytics/coreapi/internal/executors/ICommonExecutor;", "executor", "Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ActivationBarrierCallback;", "callback", "Lkotlin/k0;", "subscribe", "(JLio/appmetrica/analytics/coreapi/internal/executors/ICommonExecutor;Lio/appmetrica/analytics/coreapi/internal/servicecomponents/ActivationBarrierCallback;)V", "core-api_release"}, k=1, mv={1, 6, 0})
public interface ActivationBarrier {
    public void subscribe(long var1, @NotNull ICommonExecutor var3, @NotNull ActivationBarrierCallback var4);
}

