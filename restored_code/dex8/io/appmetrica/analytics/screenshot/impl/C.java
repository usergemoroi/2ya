/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  androidx.media3.common.util.f
 */
package io.appmetrica.analytics.screenshot.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import androidx.media3.common.util.f;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.screenshot.impl.b;
import io.appmetrica.analytics.screenshot.impl.d;
import io.appmetrica.analytics.screenshot.impl.i;
import io.appmetrica.analytics.screenshot.impl.m0;
import io.appmetrica.analytics.screenshot.impl.n0;
import org.jetbrains.annotations.NotNull;

public final class c
implements ActivityLifecycleListener {
    public final d a;

    public c(d d14) {
        this.a = d14;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @SuppressLint(value={"MissingPermission", "NewApi"})
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent object) {
        int n10 = b.a[((Enum)object).ordinal()];
        if (n10 != 1) {
            if (n10 != 2) {
                return;
            }
            try {
                m0.a(activity, d.d(this.a));
                return;
            }
            catch (Throwable throwable) {
                return;
            }
        }
        i i14 = this.a.c;
        if (i14 == null) return;
        if (!i14.a) return;
        {
            n0.a(activity, f.a((Context)this.a.a.getContext()), d.d(this.a));
            return;
        }
    }
}

