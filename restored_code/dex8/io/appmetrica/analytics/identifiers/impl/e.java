/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
package io.appmetrica.analytics.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class e
implements ServiceConnection {
    public final Intent a;
    public IBinder b;
    public final Object c = new Object();

    public e(Intent intent, String string2) {
        this.a = intent;
        String.format("[AdvServiceConnection-%s]", string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Context context) {
        Object object = this.c;
        synchronized (object) {
            this.b = null;
            this.c.notifyAll();
        }
        context.unbindService((ServiceConnection)this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onBindingDied(ComponentName componentName) {
        Object object = this.c;
        synchronized (object) {
            this.b = null;
            this.c.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onNullBinding(ComponentName componentName) {
        Object object = this.c;
        synchronized (object) {
            this.c.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        object = this.c;
        synchronized (object) {
            this.b = iBinder;
            this.c.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onServiceDisconnected(ComponentName object) {
        object = this.c;
        synchronized (object) {
            this.b = null;
            this.c.notifyAll();
            return;
        }
    }
}

