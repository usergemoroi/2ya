/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.coreutils.internal.time;

import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u000e\u0010\u000fB\t\b\u0016\u00a2\u0006\u0004\b\u000e\u0010\u0010J\u0016\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0011"}, d2={"Lio/appmetrica/analytics/coreutils/internal/time/SystemTimeOffsetProvider;", "", "", "timestamp", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "elapsedRealtimeOffsetInSeconds", "timestampInUnit", "elapsedRealtimeOffset", "systemNanoTimeOffsetInNanos", "systemNanoTimeOffsetInSeconds", "offsetInSecondsIfNotZero", "Lio/appmetrica/analytics/coreutils/internal/time/SystemTimeProvider;", "mSystemTimeProvider", "<init>", "(Lio/appmetrica/analytics/coreutils/internal/time/SystemTimeProvider;)V", "()V", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class SystemTimeOffsetProvider {
    private final SystemTimeProvider a;

    public SystemTimeOffsetProvider() {
        this(new SystemTimeProvider());
    }

    @VisibleForTesting
    public SystemTimeOffsetProvider(@NotNull SystemTimeProvider systemTimeProvider) {
        this.a = systemTimeProvider;
    }

    public final long elapsedRealtimeOffset(long l10, @NotNull TimeUnit timeUnit) {
        l10 = timeUnit.toMillis(l10);
        return this.a.elapsedRealtime() - l10;
    }

    public final long elapsedRealtimeOffsetInSeconds(long l10, @NotNull TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.toSeconds(this.elapsedRealtimeOffset(l10, timeUnit));
    }

    public final long offsetInSecondsIfNotZero(long l10, @NotNull TimeUnit timeUnit) {
        long l11 = 0L;
        l10 = l10 == 0L ? l11 : this.a.currentTimeSeconds() - timeUnit.toSeconds(l10);
        return l10;
    }

    public final long systemNanoTimeOffsetInNanos(long l10, @NotNull TimeUnit timeUnit) {
        return this.a.systemNanoTime() - timeUnit.toNanos(l10);
    }

    public final long systemNanoTimeOffsetInSeconds(long l10, @NotNull TimeUnit timeUnit) {
        return TimeUnit.NANOSECONDS.toSeconds(this.systemNanoTimeOffsetInNanos(l10, timeUnit));
    }
}

