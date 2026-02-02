/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.database.ContentObserver
 *  android.provider.MediaStore$Images$Media
 */
package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.database.ContentObserver;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.screenshot.impl.j;
import io.appmetrica.analytics.screenshot.impl.s;
import io.appmetrica.analytics.screenshot.impl.u;
import org.jetbrains.annotations.NotNull;

public final class t
implements ActivityLifecycleListener {
    public final u a;

    public t(u u11) {
        this.a = u11;
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
        void var2_4;
        int n10 = s.a[var2_4.ordinal()];
        if (n10 != 1) {
            if (n10 != 2) {
                return;
            }
            try {
                this.a.a.getContext().getContentResolver().unregisterContentObserver((ContentObserver)this.a.d);
                return;
            }
            catch (Throwable throwable) {
                return;
            }
        }
        j j10 = this.a.c;
        if (j10 == null) return;
        if (!j10.a) return;
        {
            this.a.a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, (ContentObserver)this.a.d);
            return;
        }
    }
}

