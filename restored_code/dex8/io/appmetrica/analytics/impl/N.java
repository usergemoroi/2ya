/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.annotation.AnyThread
 *  androidx.annotation.MainThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import io.appmetrica.analytics.impl.Pa;
import io.appmetrica.analytics.impl.Z7;
import io.appmetrica.analytics.impl.m;
import java.util.ArrayList;
import java.util.Collection;

public final class n
extends Z7
implements ActivityLifecycleRegistry {
    public Application a;
    public volatile m b = m.d;
    public final Pa c = new Pa(true);

    @AnyThread
    @NonNull
    public final m a() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(Activity activity, ActivityEvent activityEvent) {
        // MONITORENTER : this
        Object object = (Collection)this.c.a.get((Object)activityEvent);
        // MONITOREXIT : this
        if (object == null) return;
        object = object.iterator();
        while (object.hasNext()) {
            ((ActivityLifecycleListener)object.next()).onEvent(activity, activityEvent);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @AnyThread
    public final void a(@NonNull Application application) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (this.a != null) break block3;
                        this.a = application;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.b();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @AnyThread
    public final void a(@NonNull Context context) {
        synchronized (this) {
            Application application = this.a;
            if (application == null) {
                try {
                    this.a = (Application)context.getApplicationContext();
                }
                catch (Throwable throwable) {}
            }
            this.b();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block6: {
                    m m12;
                    try {
                        m m14 = this.b;
                        m12 = m.b;
                        if (m14 == m12) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    if (!this.c.a.isEmpty()) {
                        if (this.a == null) {
                            this.b = m.c;
                            return;
                        }
                        this.b = m12;
                        this.a.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
                        return;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void c() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    Application application;
                    try {
                        if (this.b != m.b || !this.c.a.isEmpty()) break block4;
                        this.b = m.d;
                        application = this.a;
                        if (application == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    application.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)this);
                }
                return;
            }
            throw throwable2;
        }
    }

    @MainThread
    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        this.a(activity, ActivityEvent.CREATED);
    }

    public final void onActivityDestroyed(@NonNull Activity activity) {
        this.a(activity, ActivityEvent.DESTROYED);
    }

    @MainThread
    public final void onActivityPaused(@NonNull Activity activity) {
        this.a(activity, ActivityEvent.PAUSED);
    }

    @MainThread
    public final void onActivityResumed(@NonNull Activity activity) {
        this.a(activity, ActivityEvent.RESUMED);
    }

    public final void onActivityStarted(@NonNull Activity activity) {
        this.a(activity, ActivityEvent.STARTED);
    }

    public final void onActivityStopped(@NonNull Activity activity) {
        this.a(activity, ActivityEvent.STOPPED);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @AnyThread
    public final void registerListener(@NonNull ActivityLifecycleListener var1_1, ActivityEvent ... var2_3) {
        synchronized (this) {
            if (var2_3 /* !! */  == null) ** GOTO lbl6
            var5_4 = var2_3 /* !! */ ;
            try {
                block8: {
                    if (var2_3 /* !! */ .length != 0) break block8;
lbl6:

                    var5_4 = ActivityEvent.values();
                }
                var4_5 = var5_4.length;
            }
            catch (Throwable var1_2) {}
            throw var1_2;
            for (var3_6 = 0; var3_6 < var4_5; ++var3_6) {
                var2_3 /* !! */  = var5_4[var3_6];
                {
                    this.c.a(var2_3 /* !! */ , var1_1);
                    continue;
                }
            }
            this.b();
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @AnyThread
    public final void unregisterListener(@NonNull ActivityLifecycleListener var1_1, ActivityEvent ... var2_3) {
        synchronized (this) {
            if (var2_3 /* !! */  == null) ** GOTO lbl6
            var5_4 = var2_3 /* !! */ ;
            try {
                block10: {
                    if (var2_3 /* !! */ .length != 0) break block10;
lbl6:

                    var5_4 = ActivityEvent.values();
                }
                var4_5 = var5_4.length;
            }
            catch (Throwable var1_2) {}
            throw var1_2;
            for (var3_6 = 0; var3_6 < var4_5; ++var3_6) {
                var6_7 = var5_4[var3_6];
                {
                    var2_3 /* !! */  = this.c;
                    var7_8 = (Collection)var2_3 /* !! */ .a.get((Object)var6_7);
                    if (var7_8 == null || !var7_8.remove(var1_1)) continue;
                    if (var7_8.isEmpty() && var2_3 /* !! */ .b) {
                        var2_3 /* !! */ .a.remove((Object)var6_7);
                    }
                    new ArrayList<E>(var7_8);
                    continue;
                }
            }
            this.c();
            return;
        }
    }
}

