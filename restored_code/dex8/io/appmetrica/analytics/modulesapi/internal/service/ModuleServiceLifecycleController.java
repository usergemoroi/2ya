/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceLifecycleObserver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceLifecycleController;", "", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceLifecycleObserver;", "observer", "Lkotlin/k0;", "registerObserver", "(Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceLifecycleObserver;)V", "modules-api_release"}, k=1, mv={1, 6, 0})
public interface ModuleServiceLifecycleController {
    public void registerObserver(@NotNull ModuleServiceLifecycleObserver var1);
}

