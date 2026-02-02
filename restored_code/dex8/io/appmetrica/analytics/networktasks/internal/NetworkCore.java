/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.d;
import io.appmetrica.analytics.networktasks.impl.f;
import io.appmetrica.analytics.networktasks.impl.g;
import io.appmetrica.analytics.networktasks.impl.h;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

public class NetworkCore
extends InterruptionSafeThread {
    private final LinkedBlockingQueue a = new LinkedBlockingQueue();
    private final Object b = new Object();
    private final Object c = new Object();
    private volatile d d;
    private final g e;
    private final IExecutionPolicy f;

    public NetworkCore(@NonNull IExecutionPolicy iExecutionPolicy) {
        this(iExecutionPolicy, new g());
    }

    NetworkCore(IExecutionPolicy iExecutionPolicy, g g11) {
        this.f = iExecutionPolicy;
        this.e = g11;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        Object object = null;
        while (this.isRunning()) {
            Object object2 = object;
            Object object3 = object;
            try {
                Object object4 = this.c;
                object2 = object;
                object3 = object;
                // MONITORENTER : object4
                // MONITOREXIT : object4
                object2 = object;
                object3 = object;
                this.d = (d)this.a.take();
                object2 = object;
                object3 = object;
                object2 = object = this.d.a;
                object3 = object;
                Executor executor = ((NetworkTask)object).getExecutor();
                object2 = object;
                object3 = object;
                this.e.getClass();
                object2 = object;
                object3 = object;
                object2 = object;
                object3 = object;
                object2 = object;
                object3 = object;
                object4 = new f();
                object2 = object;
                object3 = object;
                h h14 = new h((NetworkTask)object, this, (f)object4);
                object2 = object;
                object3 = object;
                executor.execute(h14);
                ((NetworkTask)object).onTaskFinished();
                object3 = this.c;
            }
        // Removed invalid catch block
                ((NetworkTask)object2).onTaskFinished();
                object = this.c;
                // MONITORENTER : object
                this.d = null;
                // MONITOREXIT : object
                ((NetworkTask)object2).onTaskRemoved();
                throw throwable;
            }
        // Removed invalid catch block
                if (object3 == null) continue;
                ((NetworkTask)object3).onTaskFinished();
                object = this.c;
                // MONITORENTER : object
                this.d = null;
                // MONITOREXIT : object
                object = object3;
            }
            // MONITORENTER : object3
            this.d = null;
            // MONITOREXIT : object3
            ((NetworkTask)object).onTaskRemoved();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void startTask(NetworkTask networkTask) {
        if (!this.f.canBeExecuted()) {
            return;
        }
        Object object = this.b;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        d d14 = new d(networkTask);
                        if (!this.isRunning() || this.a.contains(d14) || d14.equals(this.d) || !networkTask.onTaskAdded()) break block4;
                        this.a.offer(d14);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
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
    public void stopTasks() {
        Object object = this.c;
        synchronized (object) {
            try {
                Object object2 = new ArrayList(this.a.size());
                this.a.drainTo(object2);
                object2 = ((ArrayList)object2).iterator();
                while (true) {
                    if (!object2.hasNext()) {
                        return;
                    }
                    ((d)object2.next()).a.onTaskRemoved();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

