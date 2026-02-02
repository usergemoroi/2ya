/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.BiConsumer;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.impl.e3;

public final class d3
implements BiConsumer {
    public final e3 a;

    public d3(e3 e34) {
        this.a = e34;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void consume(Object object, Object object2) {
        object = (Context)object;
        object2 = (Intent)object2;
        object = this.a;
        synchronized (object) {
            try {
                Object object3 = this.a;
                ((e3)object3).b = object2;
                object3 = ((e3)object3).a.iterator();
                while (true) {
                    if (!object3.hasNext()) {
                        return;
                    }
                    ((Consumer)object3.next()).consume(object2);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

