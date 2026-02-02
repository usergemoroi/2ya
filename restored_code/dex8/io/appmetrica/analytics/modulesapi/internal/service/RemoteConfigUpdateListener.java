/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0003H&\u00a2\u0006\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigUpdateListener;", "", "T", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;", "config", "Lkotlin/k0;", "onRemoteConfigUpdated", "(Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", "modules-api_release"}, k=1, mv={1, 6, 0})
public interface RemoteConfigUpdateListener<T> {
    public void onRemoteConfigUpdated(@NotNull ModuleRemoteConfig<T> var1);
}

