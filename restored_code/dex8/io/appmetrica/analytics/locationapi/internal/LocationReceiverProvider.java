/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.LocationListener
 */
package io.appmetrica.analytics.locationapi.internal;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.Identifiable;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2={"Lio/appmetrica/analytics/locationapi/internal/LocationReceiverProvider;", "Lio/appmetrica/analytics/locationapi/internal/Identifiable;", "getLocationReceiver", "Lio/appmetrica/analytics/locationapi/internal/LocationReceiver;", "context", "Landroid/content/Context;", "permissionExtractor", "Lio/appmetrica/analytics/coreapi/internal/system/PermissionExtractor;", "executor", "Lio/appmetrica/analytics/coreapi/internal/executors/IHandlerExecutor;", "listener", "Landroid/location/LocationListener;", "location-api_release"}, k=1, mv={1, 6, 0}, xi=48)
public interface LocationReceiverProvider
extends Identifiable {
    @NotNull
    public LocationReceiver getLocationReceiver(@NotNull Context var1, @NotNull PermissionExtractor var2, @NotNull IHandlerExecutor var3, @NotNull LocationListener var4);
}

