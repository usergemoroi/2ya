/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.impl.Ud;
import io.appmetrica.analytics.impl.aq;
import io.appmetrica.analytics.impl.d;
import io.appmetrica.analytics.impl.dc;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class e {
    public static final long g = TimeUnit.SECONDS.toMillis(1L);
    public static final String h;
    public final CopyOnWriteArrayList a;
    public final AtomicInteger b;
    public final Handler c;
    public d d;
    public final AtomicBoolean e;
    public final Runnable f;

    static {
        StringBuilder stringBuilder = new StringBuilder("WatchDog-");
        stringBuilder.append(Ud.a.incrementAndGet());
        h = stringBuilder.toString();
    }

    public e(dc dc3) {
        CopyOnWriteArrayList<dc> copyOnWriteArrayList;
        this.a = copyOnWriteArrayList = new CopyOnWriteArrayList<dc>();
        this.b = new AtomicInteger();
        this.c = new Handler(Looper.getMainLooper());
        this.e = new AtomicBoolean();
        this.f = new aq(this);
        copyOnWriteArrayList.add(dc3);
    }

    public final /* synthetic */ void a() {
        this.e.set(true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n10) {
        synchronized (this) {
            block6: {
                try {
                    Object object = this.b;
                    int n13 = 5;
                    if (n10 >= 5) {
                        n13 = n10;
                    }
                    ((AtomicInteger)object).set(n13);
                    if (this.d != null) break block6;
                    this.d = object = new d(this);
                    try {
                        ((Thread)object).setName(h);
                    }
                    catch (SecurityException securityException) {}
                }
                catch (Throwable throwable) {}
                throw throwable;
                this.d.start();
                PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", n10);
            }
            return;
        }
    }

    public final void b() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    d d14;
                    try {
                        d14 = this.d;
                        if (d14 == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    d14.a.set(false);
                    this.d = null;
                    PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
                }
                return;
            }
            throw throwable2;
        }
    }
}

