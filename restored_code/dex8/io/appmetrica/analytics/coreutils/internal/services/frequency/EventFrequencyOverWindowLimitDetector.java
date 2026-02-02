/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.coreutils.internal.services.frequency;

import io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2={"Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyOverWindowLimitDetector;", "", "", "key", "", "detect", "(Ljava/lang/String;)Z", "", "window", "", "limitPerWindow", "Lkotlin/k0;", "updateParameters", "(JI)V", "Lio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;", "storage", "<init>", "(JILio/appmetrica/analytics/coreutils/internal/services/frequency/EventFrequencyStorage;)V", "core-utils_release"}, k=1, mv={1, 6, 0})
public final class EventFrequencyOverWindowLimitDetector {
    private long a;
    private int b;
    private final EventFrequencyStorage c;
    private final SystemTimeProvider d;

    public EventFrequencyOverWindowLimitDetector(long l10, int n10, @NotNull EventFrequencyStorage eventFrequencyStorage) {
        this.a = l10;
        this.b = n10;
        this.c = eventFrequencyStorage;
        this.d = new SystemTimeProvider();
    }

    public final boolean detect(@NotNull String string2) {
        long l10;
        long l11 = this.d.uptimeMillis();
        Object object = this.c;
        Long l13 = object.getWindowStart(string2);
        if (l13 == null) {
            object.putWindowStart(string2, l11);
            l10 = l11;
        } else {
            l10 = l13;
        }
        l10 = l11 - l10;
        boolean bl2 = true;
        if (l10 >= 0L && l10 <= this.a) {
            object = this.c.getWindowOccurrencesCount(string2);
            int n10 = object != null ? (Integer)object : 0;
            this.c.putWindowOccurrencesCount(string2, ++n10);
            if (n10 <= this.b) {
                bl2 = false;
            }
            return bl2;
        }
        this.c.putWindowStart(string2, l11);
        this.c.putWindowOccurrencesCount(string2, 1);
        return false;
    }

    public final void updateParameters(long l10, int n10) {
        synchronized (this) {
            this.a = l10;
            this.b = n10;
            return;
        }
    }
}

