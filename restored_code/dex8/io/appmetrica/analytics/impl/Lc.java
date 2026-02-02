/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.impl.C3;
import io.appmetrica.analytics.impl.Cl;
import io.appmetrica.analytics.impl.H5;
import io.appmetrica.analytics.impl.Hk;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.kc;
import io.appmetrica.analytics.impl.oc;
import io.appmetrica.analytics.impl.om;
import io.appmetrica.analytics.impl.pc;
import io.appmetrica.analytics.impl.sc;
import io.appmetrica.analytics.impl.tm;
import io.appmetrica.analytics.impl.uc;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationClient;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lc
implements kc,
tm,
LocationProvider {
    public final Context a;
    public final pc b;
    public final LocationClient c;
    public final Cl d;
    public final Hk e;
    public final LastKnownLocationExtractorProviderFactory f;
    public final LocationReceiverProviderFactory g;

    public lc(@NotNull Context object, @NotNull pc pc3, @NotNull LocationClient locationClient) {
        this.a = object;
        this.b = pc3;
        this.c = locationClient;
        object = new uc();
        this.d = new Cl(new H5(new PermissionStrategy[]{object, Na.j().o().getAskForPermissionStrategy()}));
        this.e = Na.j().o();
        oc.a(pc3, (LocationControllerObserver)object);
        oc.a(pc3, locationClient);
        this.f = locationClient.getLastKnownExtractorProviderFactory();
        this.g = locationClient.getLocationReceiverProviderFactory();
    }

    @Override
    public final void a(@Nullable Location location) {
        this.c.updateUserLocation(location);
    }

    @Override
    public final void a(@NotNull om object) {
        object = ((om)object).y;
        if (object != null) {
            long l10 = ((C3)object).a;
            this.c.updateCacheArguments(new CacheArguments(l10, (long)2 * l10));
        }
    }

    @Override
    public final void a(@NotNull Object object) {
        ((sc)this.b).b(object);
    }

    @Override
    public final void a(boolean bl2) {
        ((sc)this.b).a(bl2);
    }

    @NotNull
    public final Cl b() {
        return this.d;
    }

    @Override
    public final void b(@NotNull Object object) {
        ((sc)this.b).a(object);
    }

    @Override
    @NotNull
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.f;
    }

    @Override
    @NotNull
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.g;
    }

    @Override
    public final PermissionExtractor getPermissionExtractor() {
        return this.d;
    }

    @Override
    @Nullable
    public final Location getSystemLocation() {
        return this.c.getSystemLocation();
    }

    @Override
    @Nullable
    public final Location getUserLocation() {
        return this.c.getUserLocation();
    }

    @Override
    public final void init() {
        this.c.init(this.a, this.d, Na.F.d.c(), this.e.e());
        Object object = this.e.f();
        if (object != null) {
            object.init();
        } else {
            object = this.c;
            object.registerSystemLocationSource(object.getLastKnownExtractorProviderFactory().getGplLastKnownLocationExtractorProvider());
            object = this.c;
            object.registerSystemLocationSource(object.getLastKnownExtractorProviderFactory().getNetworkLastKnownLocationExtractorProvider());
        }
        object = this.b;
        Toggle toggle = this.e.g();
        ((sc)object).a(toggle);
        Na.F.u.a(this);
    }

    @Override
    public final void registerControllerObserver(@NotNull LocationControllerObserver locationControllerObserver) {
        ((sc)this.b).a(locationControllerObserver, true);
    }

    @Override
    public final void registerSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.c.registerSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override
    public final void registerSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        this.c.registerSystemLocationSource(locationReceiverProvider);
    }

    @Override
    public final void unregisterSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.c.unregisterSystemLocationSource(lastKnownLocationExtractorProvider);
    }

    @Override
    public final void unregisterSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
        this.c.unregisterSystemLocationSource(locationReceiverProvider);
    }

    @Override
    public final void updateLocationFilter(@NotNull LocationFilter locationFilter) {
        this.c.updateLocationFilter(locationFilter);
    }
}

