/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Hc;
import io.appmetrica.analytics.impl.J5;
import io.appmetrica.analytics.impl.K5;
import io.appmetrica.analytics.impl.cq;
import io.appmetrica.analytics.impl.dq;
import io.appmetrica.analytics.impl.eq;
import io.appmetrica.analytics.impl.fq;
import io.appmetrica.analytics.impl.l;
import io.appmetrica.analytics.impl.m;
import io.appmetrica.analytics.impl.n;
import io.appmetrica.analytics.impl.o;
import io.appmetrica.analytics.impl.p;

public final class gl {
    public final n a;
    public final K5 b;
    public final ActivityLifecycleListener c;
    public final ActivityLifecycleListener d;
    public final p e;
    public final l f;
    public boolean g = false;

    public gl(n n10, l l10) {
        this(n10, l10, new K5(), new p());
    }

    public gl(n n10, l l10, K5 k54, p p14) {
        this.a = n10;
        this.f = l10;
        this.b = k54;
        this.e = p14;
        this.c = new dq(this);
        this.d = new eq(this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final m a() {
        synchronized (this) {
            try {
                if (this.g) return this.a.b;
                this.a.registerListener(this.c, ActivityEvent.RESUMED);
                this.a.registerListener(this.d, ActivityEvent.PAUSED);
                this.g = true;
                return this.a.b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Activity object, ActivityEvent object2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (!this.g) break block3;
                        object2 = this.b;
                        fq fq2 = new fq(this, (Activity)object);
                        object2.getClass();
                        IHandlerExecutor iHandlerExecutor = A4.l().c.a();
                        object = new J5((K5)object2, fq2);
                        iHandlerExecutor.execute((Runnable)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void a(Activity activity, Hc hc3) {
        if (this.e.a(activity, o.a)) {
            hc3.a(activity);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Activity object, ActivityEvent object2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        if (!this.g) break block3;
                        object2 = this.b;
                        cq cq2 = new cq(this, (Activity)object);
                        object2.getClass();
                        object = A4.l().c.a();
                        J5 j52 = new J5((K5)object2, cq2);
                        object.execute(j52);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void b(Activity activity, Hc hc3) {
        if (this.e.a(activity, o.b)) {
            hc3.b(activity);
        }
    }
}

