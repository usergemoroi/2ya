/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.AnyThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.coreutils.internal.cache;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.cache.DataCache;

public abstract class SynchronizedDataCache<T>
extends DataCache<T> {
    public SynchronizedDataCache(long l10, long l11, @NonNull String string2) {
        super(l10, l11, string2);
    }

    @Override
    @Nullable
    public T getData() {
        synchronized (this) {
            Object t13 = super.getData();
            return t13;
        }
    }

    @Override
    @AnyThread
    public boolean shouldUpdate() {
        synchronized (this) {
            boolean bl2 = super.shouldUpdate();
            return bl2;
        }
    }

    @Override
    public void updateData(@NonNull T t13) {
        synchronized (this) {
            super.updateData(t13);
            return;
        }
    }
}

