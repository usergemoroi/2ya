/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.annotation.MainThread
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.j;
import io.appmetrica.analytics.impl.k;
import io.appmetrica.analytics.impl.n;
import io.appmetrica.analytics.impl.xj;
import java.util.HashSet;

public final class l
implements ActivityLifecycleListener {
    public final HashSet a = new HashSet();

    public l(@NonNull n n10) {
        n10.registerListener(this, new ActivityEvent[0]);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NonNull Activity activity) {
        Object object;
        synchronized (this) {
            object = new HashSet(this.a);
        }
        object = ((HashSet)object).iterator();
        while (object.hasNext()) {
            ((xj)((k)object.next())).a(activity);
        }
        return;
    }

    public final void a(@NonNull k k11) {
        synchronized (this) {
            this.a.add(k11);
            return;
        }
    }

    @Override
    @MainThread
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        A4.l().c.a().execute(new j(this, activity));
    }
}

