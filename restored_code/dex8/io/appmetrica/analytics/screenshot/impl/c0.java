/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.screenshot.impl.b0;
import io.appmetrica.analytics.screenshot.impl.d0;
import io.appmetrica.analytics.screenshot.impl.m;
import org.jetbrains.annotations.NotNull;

public final class c0
implements ActivityLifecycleListener {
    public final d0 a;

    public c0(d0 d03) {
        this.a = d03;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void onEvent(@NotNull Activity object, @NotNull ActivityEvent activityEvent) {
        void var2_5;
        int n10 = b0.a[var2_5.ordinal()];
        if (n10 != 1) {
            if (n10 != 2) {
                return;
            }
            try {
                this.a.d = true;
                return;
            }
            catch (Throwable throwable) {
                return;
            }
        }
        m m12 = this.a.e;
        if (m12 == null) return;
        if (!m12.a) return;
        {
            this.a.d = false;
            d0 d03 = this.a;
            d03.c.postDelayed((Runnable)d03.f, 0L);
            return;
        }
    }
}

