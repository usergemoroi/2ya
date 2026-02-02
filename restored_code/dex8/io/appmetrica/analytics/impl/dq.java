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
import io.appmetrica.analytics.impl.gl;

public final class dq
implements ActivityLifecycleListener {
    public final gl a;

    public /* synthetic */ dq(gl gl2) {
        this.a = gl2;
    }

    @Override
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        this.a.a(activity, activityEvent);
    }
}

