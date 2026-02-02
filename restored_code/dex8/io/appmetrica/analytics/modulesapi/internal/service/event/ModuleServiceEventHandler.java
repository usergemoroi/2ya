/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.modulesapi.internal.service.event;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerContext;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleServiceEventHandler;", "", "handle", "", "context", "Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerContext;", "reportApi", "Lio/appmetrica/analytics/coreapi/internal/event/CounterReportApi;", "modules-api_release"}, k=1, mv={1, 6, 0}, xi=48)
public interface ModuleServiceEventHandler {
    public boolean handle(@NotNull ModuleEventServiceHandlerContext var1, @NotNull CounterReportApi var2);
}

