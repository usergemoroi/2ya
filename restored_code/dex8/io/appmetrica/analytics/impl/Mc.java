/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.impl.Pe;
import io.appmetrica.analytics.impl.Ub;
import io.appmetrica.analytics.impl.kc;
import io.appmetrica.analytics.impl.wc;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class mc
implements kc {
    public final Pe a = new Pe();
    public final Ub b = new Ub();
    public final wc c = new wc();

    @Override
    public final void a(@Nullable Location location) {
    }

    @Override
    public final void a(@NotNull Object object) {
    }

    @Override
    public final void a(boolean bl2) {
    }

    @Override
    public final void b(@NotNull Object object) {
    }

    @Override
    @NotNull
    public final LastKnownLocationExtractorProviderFactory getLastKnownExtractorProviderFactory() {
        return this.b;
    }

    @Override
    @NotNull
    public final LocationReceiverProviderFactory getLocationReceiverProviderFactory() {
        return this.c;
    }

    @Override
    @NotNull
    public final PermissionExtractor getPermissionExtractor() {
        return this.a;
    }

    @Override
    @Nullable
    public final Location getSystemLocation() {
        return null;
    }

    @Override
    @Nullable
    public final Location getUserLocation() {
        return null;
    }

    @Override
    public final void init() {
    }

    @Override
    public final void registerControllerObserver(@NotNull LocationControllerObserver locationControllerObserver) {
    }

    @Override
    public final void registerSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override
    public final void registerSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
    }

    @Override
    public final void unregisterSource(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
    }

    @Override
    public final void unregisterSource(@NotNull LocationReceiverProvider locationReceiverProvider) {
    }

    @Override
    public final void updateLocationFilter(@NotNull LocationFilter locationFilter) {
    }
}

