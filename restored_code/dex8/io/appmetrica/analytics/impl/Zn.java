/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.impl.bn;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zn
implements TempCacheStorage {
    public final TempCacheStorage a;

    public zn(@NotNull Context context, @NotNull bn bn3, @NotNull TempCacheStorage tempCacheStorage) {
        this.a = tempCacheStorage;
    }

    @Override
    @Nullable
    public final TempCacheStorage.Entry get(@NotNull String string2) {
        return this.a.get(string2);
    }

    @Override
    @NotNull
    public final Collection<TempCacheStorage.Entry> get(@NotNull String string2, int n10) {
        return this.a.get(string2, n10);
    }

    @Override
    public final long put(@NotNull String string2, long l10, @NotNull byte[] byArray) {
        return this.a.put(string2, l10, byArray);
    }

    @Override
    public final void remove(long l10) {
        this.a.remove(l10);
    }

    @Override
    public final void removeOlderThan(@NotNull String string2, long l10) {
        this.a.removeOlderThan(string2, l10);
    }
}

