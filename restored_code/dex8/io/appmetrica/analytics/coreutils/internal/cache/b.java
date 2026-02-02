/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;

public final class b
implements Runnable {
    public final LocationDataCacheUpdateScheduler a;

    public b(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.a = locationDataCacheUpdateScheduler;
    }

    @Override
    public final void run() {
        if (LocationDataCacheUpdateScheduler.b(this.a).shouldUpdate()) {
            LocationDataCacheUpdateScheduler.a(LocationDataCacheUpdateScheduler.c((LocationDataCacheUpdateScheduler)this.a).a).updateLastKnown();
        }
    }
}

