/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

public final class qo
implements NetworkTask.ShouldTryNextHostCondition {
    @Override
    public final boolean shouldTryNextHost(int n10) {
        n10 = n10 == 400 ? 1 : 0;
        return (n10 ^ 1) != 0;
    }
}

