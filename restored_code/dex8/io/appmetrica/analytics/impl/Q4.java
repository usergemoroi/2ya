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
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.Cb;
import io.appmetrica.analytics.impl.Z9;
import io.appmetrica.analytics.impl.p4;

public final class q4 {
    public final p4 a;
    public volatile Z9 b;
    public volatile Z9 c;

    public q4() {
        this(new p4());
    }

    public q4(p4 p42) {
        this.a = p42;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IHandlerExecutor a() {
        if (this.b != null) return this.b;
        synchronized (this) {
            try {
                Z9 z94;
                if (this.b != null) return this.b;
                this.a.getClass();
                Cb cb2 = Z9.a("IAA-CDE");
                Looper looper = cb2.getLooper();
                Handler handler = new Handler(cb2.getLooper());
                this.b = z94 = new Z9(cb2, looper, handler);
                return this.b;
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
    public final ICommonExecutor b() {
        if (this.c != null) return this.c;
        synchronized (this) {
            try {
                Z9 z94;
                if (this.c != null) return this.c;
                this.a.getClass();
                Cb cb2 = Z9.a("IAA-CRS");
                Looper looper = cb2.getLooper();
                Handler handler = new Handler(cb2.getLooper());
                this.c = z94 = new Z9(cb2, looper, handler);
                return this.c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

