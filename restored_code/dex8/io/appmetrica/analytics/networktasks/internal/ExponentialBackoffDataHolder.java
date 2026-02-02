/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;

public class ExponentialBackoffDataHolder {
    private final TimePassedChecker a;
    private final TimeProvider b;
    private final HostRetryInfoProvider c;
    private long d;
    private int e;
    private final String f;

    ExponentialBackoffDataHolder(HostRetryInfoProvider hostRetryInfoProvider, SystemTimeProvider systemTimeProvider, TimePassedChecker timePassedChecker, String string2) {
        this.c = hostRetryInfoProvider;
        this.b = systemTimeProvider;
        this.a = timePassedChecker;
        this.d = hostRetryInfoProvider.getLastAttemptTimeSeconds();
        this.e = hostRetryInfoProvider.getNextSendAttemptNumber();
        this.f = String.format("[ExponentialBackoffDataHolder-%s]", string2);
    }

    public ExponentialBackoffDataHolder(@NonNull HostRetryInfoProvider hostRetryInfoProvider, @NonNull String string2) {
        this(hostRetryInfoProvider, new SystemTimeProvider(), new TimePassedChecker(), string2);
    }

    public void reset() {
        this.e = 1;
        this.d = 0L;
        this.c.saveNextSendAttemptNumber(1);
        this.c.saveLastAttemptTimeSeconds(this.d);
    }

    public void updateLastAttemptInfo() {
        long l10;
        this.d = l10 = this.b.currentTimeSeconds();
        ++this.e;
        this.c.saveLastAttemptTimeSeconds(l10);
        this.c.saveNextSendAttemptNumber(this.e);
    }

    public boolean wasLastAttemptLongAgoEnough(@Nullable RetryPolicyConfig retryPolicyConfig) {
        long l10;
        if (retryPolicyConfig != null && (l10 = this.d) != 0L) {
            TimePassedChecker timePassedChecker = this.a;
            int n10 = retryPolicyConfig.exponentialMultiplier;
            int n13 = retryPolicyConfig.maxIntervalSeconds;
            if ((n10 = ((1 << this.e - 1) - 1) * n10) > n13) {
                n10 = n13;
            }
            return timePassedChecker.didTimePassSeconds(l10, n10, this.f);
        }
        return true;
    }
}

