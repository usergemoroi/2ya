/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.modulesapi.internal.service.ClientConfigProvider;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceExtension;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007\u00a2\u0006\u0004\b'\u0010(J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0016\u00a2\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010#\u001a\u0004\u0018\u00010\"8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\u00a8\u0006)"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServiceEntryPoint;", "", "T", "Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;", "serviceContext", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;", "initialConfig", "Lkotlin/k0;", "initServiceSide", "(Lio/appmetrica/analytics/modulesapi/internal/service/ServiceContext;Lio/appmetrica/analytics/modulesapi/internal/service/ModuleRemoteConfig;)V", "", "getIdentifier", "()Ljava/lang/String;", "identifier", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "remoteConfigExtensionConfiguration", "Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "getRemoteConfigExtensionConfiguration", "()Lio/appmetrica/analytics/modulesapi/internal/service/RemoteConfigExtensionConfiguration;", "Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerFactory;", "moduleEventServiceHandlerFactory", "Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerFactory;", "getModuleEventServiceHandlerFactory", "()Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerFactory;", "Lio/appmetrica/analytics/modulesapi/internal/service/LocationServiceExtension;", "locationServiceExtension", "Lio/appmetrica/analytics/modulesapi/internal/service/LocationServiceExtension;", "getLocationServiceExtension", "()Lio/appmetrica/analytics/modulesapi/internal/service/LocationServiceExtension;", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServicesDatabase;", "moduleServicesDatabase", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServicesDatabase;", "getModuleServicesDatabase", "()Lio/appmetrica/analytics/modulesapi/internal/service/ModuleServicesDatabase;", "Lio/appmetrica/analytics/modulesapi/internal/service/ClientConfigProvider;", "clientConfigProvider", "Lio/appmetrica/analytics/modulesapi/internal/service/ClientConfigProvider;", "getClientConfigProvider", "()Lio/appmetrica/analytics/modulesapi/internal/service/ClientConfigProvider;", "<init>", "()V", "modules-api_release"}, k=1, mv={1, 6, 0})
public abstract class ModuleServiceEntryPoint<T> {
    @Nullable
    public ClientConfigProvider getClientConfigProvider() {
        return null;
    }

    @NotNull
    public abstract String getIdentifier();

    @Nullable
    public LocationServiceExtension getLocationServiceExtension() {
        return null;
    }

    @Nullable
    public ModuleEventServiceHandlerFactory getModuleEventServiceHandlerFactory() {
        return null;
    }

    @Nullable
    public ModuleServicesDatabase getModuleServicesDatabase() {
        return null;
    }

    @Nullable
    public RemoteConfigExtensionConfiguration<T> getRemoteConfigExtensionConfiguration() {
        return null;
    }

    public void initServiceSide(@NotNull ServiceContext serviceContext, @NotNull ModuleRemoteConfig<T> moduleRemoteConfig) {
    }
}

