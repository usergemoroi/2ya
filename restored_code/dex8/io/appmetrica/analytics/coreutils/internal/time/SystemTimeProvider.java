/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
package io.appmetrica.analytics.coreutils.internal.time;

import android.os.SystemClock;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import kotlin.Metadata;

@Metadata(d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016\u00a8\u0006\t"}, d2={"Lio/appmetrica/analytics/coreutils/internal/time/SystemTimeProvider;", "Lio/appmetrica/analytics/coreutils/internal/time/TimeProvider;", "()V", "currentTimeMillis", "", "currentTimeSeconds", "elapsedRealtime", "systemNanoTime", "uptimeMillis", "core-utils_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class SystemTimeProvider
implements TimeProvider {
    @Override
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override
    public long currentTimeSeconds() {
        return System.currentTimeMillis() / (long)1000;
    }

    @Override
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public long systemNanoTime() {
        return System.nanoTime();
    }

    @Override
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }
}

