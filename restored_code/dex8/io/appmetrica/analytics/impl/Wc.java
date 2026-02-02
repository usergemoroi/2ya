/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.xc;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProvider;
import io.appmetrica.analytics.locationapi.internal.LocationReceiverProviderFactory;
import org.jetbrains.annotations.NotNull;

public final class wc
implements LocationReceiverProviderFactory {
    public final xc a = new xc();

    @Override
    @NotNull
    public final LocationReceiverProvider getPassiveLocationReceiverProvider() {
        return this.a;
    }
}

