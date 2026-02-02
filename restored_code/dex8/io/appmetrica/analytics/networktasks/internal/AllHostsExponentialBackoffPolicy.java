/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffDataHolder;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016\u00a2\u0006\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2={"Lio/appmetrica/analytics/networktasks/internal/AllHostsExponentialBackoffPolicy;", "Lio/appmetrica/analytics/networktasks/internal/ExponentialBackoffPolicy;", "", "success", "Lkotlin/k0;", "onHostAttemptFinished", "(Z)V", "onAllHostsAttemptsFinished", "Lio/appmetrica/analytics/networktasks/internal/RetryPolicyConfig;", "retryPolicyConfig", "canBeExecuted", "(Lio/appmetrica/analytics/networktasks/internal/RetryPolicyConfig;)Z", "Lio/appmetrica/analytics/networktasks/internal/ExponentialBackoffDataHolder;", "exponentialBackoffDataHolder", "<init>", "(Lio/appmetrica/analytics/networktasks/internal/ExponentialBackoffDataHolder;)V", "network-tasks_release"}, k=1, mv={1, 6, 0})
public final class AllHostsExponentialBackoffPolicy
implements ExponentialBackoffPolicy {
    private final ExponentialBackoffDataHolder a;

    public AllHostsExponentialBackoffPolicy(@NotNull ExponentialBackoffDataHolder exponentialBackoffDataHolder) {
        this.a = exponentialBackoffDataHolder;
    }

    @Override
    public boolean canBeExecuted(@Nullable RetryPolicyConfig retryPolicyConfig) {
        return this.a.wasLastAttemptLongAgoEnough(retryPolicyConfig);
    }

    @Override
    public void onAllHostsAttemptsFinished(boolean bl2) {
        if (bl2) {
            this.a.reset();
        } else {
            this.a.updateLastAttemptInfo();
        }
    }

    @Override
    public void onHostAttemptFinished(boolean bl2) {
    }
}

