/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.location.impl.c;
import io.appmetrica.analytics.location.impl.e;
import io.appmetrica.analytics.location.impl.f;
import io.appmetrica.analytics.location.impl.v;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProviderFactory;
import org.jetbrains.annotations.NotNull;

public final class g
implements LastKnownLocationExtractorProviderFactory {
    public final LastKnownLocationExtractorProvider a;
    public final c b;
    public final v c;
    public final v d;

    public g(@NotNull LastKnownLocationExtractorProvider lastKnownLocationExtractorProvider) {
        this.a = lastKnownLocationExtractorProvider;
        this.b = new c("location-module-gpl");
        this.c = new v("network", new f(), "location-module-network");
        this.d = new v("gps", new e(), "location-module-gps");
    }

    @Override
    @NotNull
    public final LastKnownLocationExtractorProvider getGplLastKnownLocationExtractorProvider() {
        return this.b;
    }

    @Override
    @NotNull
    public final LastKnownLocationExtractorProvider getGpsLastKnownLocationExtractorProvider() {
        return this.d;
    }

    @Override
    @NotNull
    public final LastKnownLocationExtractorProvider getNetworkLastKnownLocationExtractorProvider() {
        return this.c;
    }

    @Override
    @NotNull
    public final LastKnownLocationExtractorProvider getPassiveLastKnownLocationExtractorProvider() {
        return this.a;
    }
}

