/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Debug
 */
package io.appmetrica.analytics.impl;

import android.os.Debug;
import io.appmetrica.analytics.impl.c;
import io.appmetrica.analytics.impl.e;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d
extends Thread {
    public final AtomicBoolean a;
    public final e b;

    public d(e e11) {
        this.b = e11;
        this.a = new AtomicBoolean(true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        block4: while (!this.isInterrupted()) {
            int n10;
            if (!this.a.get()) return;
            this.b.e.set(false);
            Object object = this.b;
            ((e)object).c.postAtFrontOfQueue(((e)object).f);
            for (n10 = this.b.b.get(); n10 > 0; --n10) {
                try {
                    Thread.sleep(e.g);
                    if (this.b.e.get()) break;
                    continue;
                }
                catch (InterruptedException interruptedException) {
                    return;
                }
            }
            if (n10 == 0 && !Debug.isDebuggerConnected()) {
                object = this.b.a.iterator();
                while (object.hasNext()) {
                    ((c)object.next()).onAppNotResponding();
                }
            }
            while (true) {
                if (this.b.e.get()) continue block4;
                try {
                    Thread.sleep(e.g);
                }
                catch (InterruptedException interruptedException) {
                    return;
                }
            }
            break;
        }
        return;
    }
}

