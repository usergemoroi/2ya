/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&\u00a2\u0006\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/common/InternalClientModuleFacade;", "", "Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent;", "internalModuleEvent", "Lkotlin/k0;", "reportEvent", "(Lio/appmetrica/analytics/modulesapi/internal/common/InternalModuleEvent;)V", "Lio/appmetrica/analytics/modulesapi/internal/client/adrevenue/ModuleAdRevenue;", "moduleAdRevenue", "reportAdRevenue", "(Lio/appmetrica/analytics/modulesapi/internal/client/adrevenue/ModuleAdRevenue;)V", "modules-api_release"}, k=1, mv={1, 6, 0})
public interface InternalClientModuleFacade {
    public void reportAdRevenue(@NotNull ModuleAdRevenue var1);

    public void reportEvent(@NotNull InternalModuleEvent var1);
}

