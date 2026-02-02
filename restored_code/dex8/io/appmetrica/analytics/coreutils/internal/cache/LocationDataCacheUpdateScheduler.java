/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.cache.a;
import io.appmetrica.analytics.coreutils.internal.cache.b;
import io.appmetrica.analytics.locationapi.internal.ILastKnownUpdater;
import java.util.concurrent.TimeUnit;

public class LocationDataCacheUpdateScheduler
implements CacheUpdateScheduler {
    private final ICommonExecutor a;
    private final ILastKnownUpdater b;
    private final UpdateConditionsChecker c;
    private final a d = new a(this);
    private final b e = new b(this);

    public LocationDataCacheUpdateScheduler(@NonNull ICommonExecutor iCommonExecutor, @NonNull ILastKnownUpdater iLastKnownUpdater, @NonNull UpdateConditionsChecker updateConditionsChecker, @NonNull String string2) {
        this.a = iCommonExecutor;
        this.b = iLastKnownUpdater;
        this.c = updateConditionsChecker;
        String.format("[LocationDataCacheUpdateScheduler-%s]", string2);
    }

    static /* synthetic */ ILastKnownUpdater a(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        return locationDataCacheUpdateScheduler.b;
    }

    static /* synthetic */ UpdateConditionsChecker b(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        return locationDataCacheUpdateScheduler.c;
    }

    static /* synthetic */ a c(LocationDataCacheUpdateScheduler locationDataCacheUpdateScheduler) {
        return locationDataCacheUpdateScheduler.d;
    }

    @Override
    public void onStateUpdated() {
        this.a.remove(this.d);
        this.a.executeDelayed(this.d, 90L, TimeUnit.SECONDS);
    }

    @Override
    public void scheduleUpdateIfNeededNow() {
        this.a.execute(this.e);
    }

    public void startUpdates() {
        this.onStateUpdated();
    }

    public void stopUpdates() {
        this.a.remove(this.d);
        this.a.remove(this.e);
    }
}

