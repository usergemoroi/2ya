/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.location.impl.q;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import org.jetbrains.annotations.NotNull;

public final class o
implements LocationReceiverProviderFactory {
    public final q a;

    public o(@NotNull q q12) {
        this.a = q12;
    }

    @NotNull
    public final q a() {
        return this.a;
    }

    @Override
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.a;
    }
}

