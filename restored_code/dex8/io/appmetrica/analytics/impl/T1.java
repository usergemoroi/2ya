/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.Ji;
import io.appmetrica.analytics.impl.Kj;
import io.appmetrica.analytics.impl.lk;
import io.appmetrica.analytics.impl.qb;

public final class t1
implements Runnable {
    public final Context a;

    public t1(Context context) {
        this.a = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        lk lk3 = Kj.a;
        Object object = this.a;
        synchronized (lk3) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (lk3.b != null) break block4;
                        lk3.b = Ji.a.a((Context)object, "20799a27-fa80-4b36-b2db-0f8141f24180");
                        object = lk3.a.iterator();
                        while (object.hasNext()) {
                            ((qb)object.next()).a(lk3.b);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    lk3.a.clear();
                }
                return;
            }
            throw throwable2;
        }
    }
}

