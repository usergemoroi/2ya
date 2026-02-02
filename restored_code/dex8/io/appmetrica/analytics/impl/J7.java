/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 */
package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.impl.I5;
import io.appmetrica.analytics.impl.k7;
import io.appmetrica.analytics.impl.q9;
import io.appmetrica.analytics.impl.v5;
import java.util.ArrayList;

public final class j7
extends InterruptionSafeThread {
    public final v5 a;
    public final k7 b;

    public j7(k7 k74, v5 v54) {
        this.b = k74;
        this.a = v54;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(ArrayList iterator) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                ArrayList<Object> arrayList;
                try {
                    arrayList = new ArrayList<Object>();
                    iterator = ((ArrayList)((Object)iterator)).iterator();
                    while (iterator.hasNext()) {
                        Object object = (ContentValues)iterator.next();
                        this.b.getClass();
                        object = object.getAsInteger("type");
                        ((Integer)object).intValue();
                        arrayList.add(object);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                iterator = this.b.j.iterator();
                while (true) {
                    if (!iterator.hasNext()) {
                        ((I5)this.a.p).e();
                        return;
                    }
                    ((q9)iterator.next()).a(arrayList);
                }
            }
            throw throwable2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        while (true) {
            block24: {
                block22: {
                    block21: {
                        block23: {
                            block20: {
                                if (!this.isRunning()) {
                                    return;
                                }
                                ** synchronized (this)

                                {
                                    block19: {
                                        try {
                                            if (!k7.a(this.b)) break block19;
                                            this.wait();
                                        }
                                        catch (Throwable var1_2) {
                                            break block20;
                                        }
                                    }
                                    break block23;
                                }
                            }
                            try {
                                throw var1_2;
                            }
                            catch (Throwable var1_3) {
                                this.stopRunning();
                            }
                        }
                        var1_1 = this.b.e;
                        synchronized (var1_1) {
                            var3_8 = new ArrayList<E>(this.b.f);
                            this.b.f.clear();
                        }
                        var4_9 = this.b;
                        var4_9.getClass();
                        if (var3_8.isEmpty()) break block24;
                        var4_9.b.lock();
                        var2_6 = null;
                        var1_1 = var4_9.c.getWritableDatabase();
                        if (var1_1 == null) break block21;
                        try {
                            var1_1.beginTransaction();
                            for (ContentValues var2_6 : var3_8) {
                                var1_1.insertOrThrow("events", null, var2_6);
                                var4_9.i.incrementAndGet();
                                var4_9.a(var2_6, "Event saved to db");
                            }
                            var1_1.setTransactionSuccessful();
                            var4_9.i.get();
                        }
                        catch (Throwable var2_7) {

                        }
                    }
                    if (var1_1 == null) break block22;
                    try {
                        var1_1.endTransaction();
                        break block22;
                        catch (Throwable var1_4) {
                            var1_1 = var2_6;
                        }
lbl55:

                        if (var1_1 != null) {
                            var1_1.endTransaction();
                        }
                    }
                    catch (Throwable var1_5) {}
                }
                var4_9.b.unlock();
            }
            this.a(var3_8);
        }
    }
}

