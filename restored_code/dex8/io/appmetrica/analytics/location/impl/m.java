/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.location.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.cache.SynchronizedDataCache;
import io.appmetrica.analytics.location.impl.l;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class m
extends SynchronizedDataCache {
    public static final long b = TimeUnit.SECONDS.toMillis(10L);
    public static final long c = TimeUnit.MINUTES.toMillis(2L);
    public static final long d = 200L;
    public static final long e = 50L;
    public static final List<String> f = Arrays.asList("gps", "network");
    public final l a;

    public m() {
        l l10 = new l(c);
        long l11 = b;
        this(l10, l11, 2L * l11);
    }

    public m(l l10, long l11, long l13) {
        super(l11, l13, "location");
        this.a = l10;
    }

    public static boolean a(@Nullable Location object, @Nullable Location object2, long l10, long l11) {
        if (object2 == null) {
            return true;
        }
        if (object == null) {
            return false;
        }
        long l13 = object.getTime() - object2.getTime();
        boolean bl2 = l13 > l10;
        boolean bl3 = l13 < -l10;
        boolean bl4 = l13 > 0L;
        if (bl2) {
            return true;
        }
        if (bl3) {
            return false;
        }
        int n10 = (int)(object.getAccuracy() - object2.getAccuracy());
        bl2 = n10 > 0;
        bl3 = n10 < 0;
        n10 = (long)n10 > l11 ? 1 : 0;
        object = object.getProvider();
        object2 = object2.getProvider();
        boolean bl5 = object == null ? object2 == null : ((String)object).equals(object2);
        if (bl3) {
            return true;
        }
        if (bl4 && !bl2) {
            return true;
        }
        return bl4 && n10 == 0 && bl5;
    }

    public final boolean a(@NonNull Location location) {
        boolean bl2 = f.contains(location.getProvider()) && (this.mCachedData.isEmpty() || this.mCachedData.shouldUpdateData() || m.a(location, (Location)this.mCachedData.getData(), this.a.a, 200L));
        return bl2;
    }
}

