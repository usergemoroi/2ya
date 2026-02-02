/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.sc;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;

public final class uq
implements Runnable {
    public final sc c;
    public final LocationControllerObserver d;
    public final boolean e;

    public /* synthetic */ uq(sc sc3, LocationControllerObserver locationControllerObserver, boolean bl2) {
        this.c = sc3;
        this.d = locationControllerObserver;
        this.e = bl2;
    }

    @Override
    public final void run() {
        sc.a(this.c, this.d, this.e);
    }
}

