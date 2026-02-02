/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal.cache;

import io.appmetrica.analytics.coreutils.internal.cache.LocationDataCacheUpdateScheduler;

public final class a
implements Runnable {
    public final LocationDataCacheUpdateScheduler a;

    public a(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        this.a = locationDataCacheUpdateScheduler;
    }

    @Override
    public final void run() {
        LocationDataCacheUpdateScheduler.a(this.a).updateLastKnown();
    }
}

