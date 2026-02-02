/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningServiceInfo
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.screenshot.impl.d0;
import io.appmetrica.analytics.screenshot.impl.l0;
import io.appmetrica.analytics.screenshot.impl.m;
import io.appmetrica.analytics.screenshot.impl.v;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.collections.t;
import kotlin.jvm.internal.y;

public final class a0
implements Runnable {
    public final d0 a;

    public a0(d0 d03) {
        this.a = d03;
    }

    public static final Boolean a(d0 d03, a0 a04, m m12, ActivityManager object2) {
        block4: {
            Iterator iterator = object2.getRunningServices(200);
            object2 = iterator;
            if (iterator == null) {
                object2 = t.m();
            }
            for (ActivityManager.RunningServiceInfo runningServiceInfo : object2) {
            }
            for (Object object2 : object2) {
                if (!y.e(((ActivityManager.RunningServiceInfo)object2).process, "com.android.systemui:screenshot")) continue;
                break block4;
            }
            object2 = null;
        }
        if ((ActivityManager.RunningServiceInfo)object2 != null) {
            ((v)d03.b).a("ServiceScreenshotCaptor");
        }
        return d03.c.postDelayed((Runnable)a04, TimeUnit.SECONDS.toMillis(m12.b));
    }

    @Override
    public final void run() {
        m m12 = this.a.e;
        if (!this.a.d && m12 != null && m12.a) {
            SystemServiceUtils.accessSystemServiceByNameSafely(this.a.a.getContext(), "activity", "running service screenshot captor", "ActivityManager", new l0(this.a, this, m12));
        }
    }
}

