/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 */
package io.appmetrica.analytics.location.internal;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.location.impl.g;
import io.appmetrica.analytics.location.impl.i;
import io.appmetrica.analytics.location.impl.j;
import io.appmetrica.analytics.location.impl.k;
import io.appmetrica.analytics.location.impl.o;
import io.appmetrica.analytics.location.impl.p;
import io.appmetrica.analytics.location.impl.q;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b6\u0010#J=\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\bH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001eJ\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\b\u001b\u0010\u001eJ\u0019\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b$\u0010#R\u001a\u0010*\u001a\u00020%8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u00100\u001a\u00020+8\u0016X\u0096\u0004\u00a2\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0016\u00103\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b1\u00102R\u0016\u00105\u001a\u0004\u0018\u00010\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b4\u00102\u00a8\u00067"}, d2={"Lio/appmetrica/analytics/location/internal/LocationClientImpl;", "Lio/appmetrica/analytics/locationapi/internal/LocationClient;", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/coreapi/internal/system/PermissionExtractor;", "permissionExtractor", "Lio/appmetrica/analytics/coreapi/internal/executors/IHandlerExecutor;", "executor", "", "Lio/appmetrica/analytics/coreapi/internal/backport/Consumer;", "Landroid/location/Location;", "consumers", "Lkotlin/k0;", "init", "(Landroid/content/Context;Lio/appmetrica/analytics/coreapi/internal/system/PermissionExtractor;Lio/appmetrica/analytics/coreapi/internal/executors/IHandlerExecutor;Ljava/util/List;)V", "Lio/appmetrica/analytics/locationapi/internal/CacheArguments;", "cacheArguments", "updateCacheArguments", "(Lio/appmetrica/analytics/locationapi/internal/CacheArguments;)V", "Lio/appmetrica/analytics/locationapi/internal/LocationFilter;", "locationFilter", "updateLocationFilter", "(Lio/appmetrica/analytics/locationapi/internal/LocationFilter;)V", "Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractorProvider;", "lastKnownLocationExtractorProvider", "registerSystemLocationSource", "(Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractorProvider;)V", "unregisterSystemLocationSource", "Lio/appmetrica/analytics/locationapi/internal/LocationReceiverProvider;", "locationReceiverProvider", "(Lio/appmetrica/analytics/locationapi/internal/LocationReceiverProvider;)V", "location", "updateUserLocation", "(Landroid/location/Location;)V", "startLocationTracking", "()V", "stopLocationTracking", "Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractorProviderFactory;", "b", "Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractorProviderFactory;", "getLastKnownExtractorProviderFactory", "()Lio/appmetrica/analytics/locationapi/internal/LastKnownLocationExtractorProviderFactory;", "lastKnownExtractorProviderFactory", "Lio/appmetrica/analytics/locationapi/internal/LocationReceiverProviderFactory;", "c", "Lio/appmetrica/analytics/locationapi/internal/LocationReceiverProviderFactory;", "getLocationReceiverProviderFactory", "()Lio/appmetrica/analytics/locationapi/internal/LocationReceiverProviderFactory;", "locationReceiverProviderFactory", "getSystemLocation", "()Landroid/location/Location;", "systemLocation", "getUserLocation", "userLocation", "<init>", "location_release"}, k=1, mv={1, 6, 0})
public final class LocationClientImpl
implements LocationClient {
    private k a;
    private final g b;
    private final o c;
    private i d;

    public LocationClientImpl() {
        q q12 = new q();
        this.b = new g(q12);
        this.c = new o(q12);
        this.d = new i();
    }

    @Override
    @NotNull
    public LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.b;
    }

    @Override
    @NotNull
    public LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.c;
    }

    @Override
    @Nullable
    public Location getSystemLocation() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                k k11;
                block5: {
                    block4: {
                        try {
                            k11 = this.a;
                            if (k11 == null) break block4;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        k11 = k11.a();
                        break block5;
                    }
                    k11 = null;
                }
                return k11;
            }
            throw throwable2;
        }
    }

    @Override
    @Nullable
    public Location getUserLocation() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                k k11;
                block5: {
                    block4: {
                        try {
                            k11 = this.a;
                            if (k11 == null) break block4;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                        k11 = k11.b();
                        break block5;
                    }
                    k11 = null;
                }
                return k11;
            }
            throw throwable2;
        }
    }

    @Override
    public void init(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull List<? extends Consumer<Location>> list) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        k k11;
                        if (this.a != null) break block3;
                        p p14 = new p(list, this.d);
                        this.a = k11 = new k(context, permissionExtractor, iHandlerExecutor, p14);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public void registerSystemLocationSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    k k11;
                    try {
                        k11 = this.a;
                        if (k11 == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    k11.a(lastKnownLocationExtractorProvider);
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public void registerSystemLocationSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    k k11;
                    try {
                        k11 = this.a;
                        if (k11 == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    k11.a(locationReceiverProvider);
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public void startLocationTracking() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    k k11;
                    try {
                        k11 = this.a;
                        if (k11 == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    k11.startLocationTracking();
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public void stopLocationTracking() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    k k11;
                    try {
                        k11 = this.a;
                        if (k11 == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    k11.stopLocationTracking();
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public void unregisterSystemLocationSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    k k11;
                    try {
                        k11 = this.a;
                        if (k11 == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    k11.b(lastKnownLocationExtractorProvider);
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public void unregisterSystemLocationSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    k k11;
                    try {
                        k11 = this.a;
                        if (k11 == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    k11.b(locationReceiverProvider);
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public void updateCacheArguments(@NotNull CacheArguments object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    i i14;
                    Object object2;
                    try {
                        object2 = this.d;
                        this.d = i14 = new i(((i)object2).a, (CacheArguments)object);
                        object = this.a;
                        if (object == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    IHandlerExecutor iHandlerExecutor = ((k)object).d;
                    object2 = new j((k)object, i14);
                    iHandlerExecutor.execute((Runnable)object2);
                }
                return;
            }
            throw throwable2;
        }
    }

    @Override
    public void updateLocationFilter(@NotNull LocationFilter object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    k k11;
                    i i14;
                    Object object2;
                    try {
                        object2 = this.d;
                        this.d = i14 = new i((LocationFilter)object, ((i)object2).b);
                        k11 = this.a;
                        if (k11 == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    object = k11.d;
                    object2 = new j(k11, i14);
                    object.execute((Runnable)object2);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void updateUserLocation(@Nullable Location location) {
        synchronized (this) {
            k k11 = this.a;
            if (k11 != null) {
                k11.a(location);
            }
            return;
        }
    }
}

