/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.usage.UsageStatsManager
 */
package io.appmetrica.analytics.impl;

import android.app.usage.UsageStatsManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.J2;
import io.appmetrica.analytics.impl.k2;

public final class np
implements FunctionWithThrowable {
    public final k2 a;

    public /* synthetic */ np(k2 k24) {
        this.a = k24;
    }

    public final Object apply(Object object) {
        return J2.c(this.a, (UsageStatsManager)object);
    }
}

