/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;

public interface ExponentialBackoffPolicy {
    public boolean canBeExecuted(@Nullable RetryPolicyConfig var1);

    public void onAllHostsAttemptsFinished(boolean var1);

    public void onHostAttemptFinished(boolean var1);
}

