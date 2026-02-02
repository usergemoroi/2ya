/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.modulesapi.internal.service.event;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0003\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerReporter;", "", "Lio/appmetrica/analytics/coreapi/internal/event/CounterReportApi;", "report", "Lkotlin/k0;", "(Lio/appmetrica/analytics/coreapi/internal/event/CounterReportApi;)V", "", "isMain", "()Z", "modules-api_release"}, k=1, mv={1, 6, 0})
public interface ModuleEventServiceHandlerReporter {
    public boolean isMain();

    public void report(@NotNull CounterReportApi var1);
}

