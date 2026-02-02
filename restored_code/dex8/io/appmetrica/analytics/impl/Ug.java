/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.WorkerThread
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.impl.Ag;
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Ud;
import io.appmetrica.analytics.impl.Ya;
import io.appmetrica.analytics.impl.Za;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.sg;
import io.appmetrica.analytics.impl.tg;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public final class ug
implements sg {
    public final Ag a;

    public ug(Ag ag2) {
        this.a = ag2;
    }

    @Override
    @WorkerThread
    public final void a() {
        Object object;
        Ag ag2 = this.a;
        Za za4 = ag2.b;
        tg tg3 = new tg(ag2);
        za4.getClass();
        try {
            Object object2 = new Ya(za4);
            object = new FutureTask(object2);
            Na.F.d.a.getClass();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("IAA-SHMSR");
            stringBuilder.append("-");
            stringBuilder.append(Ud.a.incrementAndGet());
            object2 = new InterruptionSafeThread((Runnable)object, stringBuilder.toString());
            ((Thread)object2).start();
            object = (Jg)((FutureTask)object).get(5L, TimeUnit.SECONDS);
        }
        catch (Throwable throwable) {
            tg3.a(throwable);
        }
        ro.a(za4.b);
        Ag.a(ag2, (Jg)object, Ag.a(ag2));
        return;
        {
            finally {
                ro.a(za4.b);
            }
        }
    }
}

