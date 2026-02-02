/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ServiceConnection
 */
package io.appmetrica.analytics.impl;

import android.content.ServiceConnection;
import io.appmetrica.analytics.impl.o0;

public final class m0
implements Runnable {
    public final o0 a;

    public m0(o0 o02) {
        this.a = o02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        o0 o02 = this.a;
        synchronized (o02) {
            Throwable throwable2;
            block6: {
                try {
                    boolean bl2;
                    if (o02.a == null || !(bl2 = o02.a())) break block6;
                }
                catch (Throwable throwable2) {}
                try {
                    o02.d = null;
                    o02.a.unbindService((ServiceConnection)o02.i);
                }
                catch (Throwable throwable3) {}
            }
            o02.d = null;
            return;
            throw throwable2;
        }
    }
}

