/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
package io.appmetrica.analytics.modulesapi.internal.service;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2={"Lio/appmetrica/analytics/modulesapi/internal/service/LocationServiceExtension;", "", "()V", "locationConsumer", "Lio/appmetrica/analytics/coreapi/internal/backport/Consumer;", "Landroid/location/Location;", "getLocationConsumer", "()Lio/appmetrica/analytics/coreapi/internal/backport/Consumer;", "locationControllerAppStateToggle", "Lio/appmetrica/analytics/coreapi/internal/control/Toggle;", "getLocationControllerAppStateToggle", "()Lio/appmetrica/analytics/coreapi/internal/control/Toggle;", "locationSourcesController", "Lio/appmetrica/analytics/modulesapi/internal/service/ModuleLocationSourcesServiceController;", "getLocationSourcesController", "()Lio/appmetrica/analytics/modulesapi/internal/service/ModuleLocationSourcesServiceController;", "modules-api_release"}, k=1, mv={1, 6, 0}, xi=48)
public abstract class LocationServiceExtension {
    @Nullable
    public abstract Consumer<Location> getLocationConsumer();

    @Nullable
    public abstract Toggle getLocationControllerAppStateToggle();

    @Nullable
    public abstract ModuleLocationSourcesServiceController getLocationSourcesController();
}

