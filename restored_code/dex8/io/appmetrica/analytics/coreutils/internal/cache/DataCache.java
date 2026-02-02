/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.cache.CacheUpdateScheduler;
import io.appmetrica.analytics.coreapi.internal.cache.UpdateConditionsChecker;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;

public abstract class DataCache<T>
implements UpdateConditionsChecker {
    private CacheUpdateScheduler a;
    @NonNull
    protected final CachedDataProvider.CachedData<T> mCachedData;

    public DataCache(long l10, long l11, @NonNull String string2) {
        String.format("[DataCache-%s]", string2);
        this.mCachedData = new CachedDataProvider.CachedData(l10, l11, string2);
    }

    @NonNull
    @VisibleForTesting
    public CachedDataProvider.CachedData<T> getCachedData() {
        return this.mCachedData;
    }

    @Nullable
    public T getData() {
        CacheUpdateScheduler cacheUpdateScheduler;
        if (this.shouldUpdate() && (cacheUpdateScheduler = this.a) != null) {
            cacheUpdateScheduler.scheduleUpdateIfNeededNow();
        }
        if (this.mCachedData.shouldClearData()) {
            this.mCachedData.setData(null);
        }
        return this.mCachedData.getData();
    }

    public void setUpdateScheduler(@NonNull CacheUpdateScheduler cacheUpdateScheduler) {
        this.a = cacheUpdateScheduler;
    }

    @Override
    public boolean shouldUpdate() {
        boolean bl2 = this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData();
        return bl2;
    }

    protected abstract boolean shouldUpdate(@NonNull T var1);

    public void updateCacheControl(long l10, long l11) {
        this.mCachedData.setExpirationPolicy(l10, l11);
    }

    public void updateData(@NonNull T object) {
        if (this.shouldUpdate(object)) {
            this.mCachedData.setData(object);
            object = this.a;
            if (object != null) {
                object.onStateUpdated();
            }
        }
    }
}

