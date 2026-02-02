/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.impl.b6;
import io.appmetrica.analytics.impl.d6;
import org.jetbrains.annotations.NotNull;

public final class c6
implements ActivityLifecycleListener {
    public final d6 a;

    public c6(d6 d64) {
        this.a = d64;
    }

    @Override
    public final void onEvent(@NotNull Activity activity, @NotNull ActivityEvent activityEvent) {
        int n10 = b6.a[activityEvent.ordinal()];
        if (n10 != 1) {
            if (n10 == 2) {
                this.a.b.pauseSession();
            }
        } else {
            this.a.b.resumeSession();
        }
    }
}

