/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.VisibleForTesting
 *  com.intercom.twig.Twig
 */
package io.intercom.android.sdk.api;

import androidx.annotation.VisibleForTesting;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.commons.TimeProvider;

class RateLimiter {
    private final AppConfig appConfig;
    private int limitedRequestCount;
    private long periodStartTimestamp;
    private final TimeProvider timeProvider;
    private final Twig twig = LumberMill.getLogger();

    RateLimiter(AppConfig appConfig) {
        this(appConfig, TimeProvider.SYSTEM);
    }

    @VisibleForTesting
    RateLimiter(AppConfig appConfig, TimeProvider timeProvider) {
        this.appConfig = appConfig;
        this.timeProvider = timeProvider;
    }

    private boolean hasReachedMaxCount() {
        boolean bl2 = this.limitedRequestCount >= this.appConfig.getRateLimitCount();
        return bl2;
    }

    private boolean isInsideCurrentTimePeriod() {
        boolean bl2 = this.timeProvider.currentTimeMillis() - this.periodStartTimestamp < this.appConfig.getRateLimitPeriodMs();
        return bl2;
    }

    boolean isLimited() {
        boolean bl2 = this.isInsideCurrentTimePeriod() && this.hasReachedMaxCount();
        return bl2;
    }

    void logError() {
        this.twig.e("Your app is being rate limited because you're performing too many requests per minute", new Object[0]);
    }

    void recordRequest() {
        if (!this.isInsideCurrentTimePeriod()) {
            this.periodStartTimestamp = this.timeProvider.currentTimeMillis();
            this.limitedRequestCount = 0;
        }
        ++this.limitedRequestCount;
    }
}

