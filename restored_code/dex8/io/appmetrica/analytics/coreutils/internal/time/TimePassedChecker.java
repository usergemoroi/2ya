/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.VisibleForTesting
 */
package io.appmetrica.analytics.coreutils.internal.time;

import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u000e\u0010\u000fB\t\b\u0016\u00a2\u0006\u0004\b\u000e\u0010\u0010J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005\u00a8\u0006\u0011"}, d2={"Lio/appmetrica/analytics/coreutils/internal/time/TimePassedChecker;", "", "", "lastTimeSeconds", "intervalSeconds", "", "tag", "", "didTimePassSeconds", "lastTimeMillis", "intervalMillis", "didTimePassMillis", "Lio/appmetrica/analytics/coreutils/internal/time/TimeProvider;", "mTimeProvider", "<init>", "(Lio/appmetrica/analytics/coreutils/internal/time/TimeProvider;)V", "()V", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class TimePassedChecker {
    private final TimeProvider a;

    public TimePassedChecker() {
        this(new SystemTimeProvider());
    }

    @VisibleForTesting
    public TimePassedChecker(@NotNull TimeProvider timeProvider) {
        this.a = timeProvider;
    }

    public final boolean didTimePassMillis(long l10, long l11, @NotNull String string2) {
        long l13 = this.a.currentTimeMillis();
        boolean bl2 = l13 < l10 || l13 - l10 >= l11;
        return bl2;
    }

    public final boolean didTimePassSeconds(long l10, long l11, @NotNull String string2) {
        long l13 = this.a.currentTimeSeconds();
        boolean bl2 = l13 < l10 || l13 - l10 >= l11;
        return bl2;
    }
}

