/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.rd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.t;

public final class sd {
    public final LinkedHashSet a = new LinkedHashSet();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Set a() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object;
                ArrayList arrayList;
                try {
                    arrayList = this.a;
                    object = new ArrayList(t.x((Iterable)arrayList, (int)10));
                    arrayList = arrayList.iterator();
                    while (arrayList.hasNext()) {
                        object.add(((rd)arrayList.next()).a());
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                arrayList = new ArrayList();
                object = object.iterator();
                while (true) {
                    if (!object.hasNext()) {
                        return t.j1(arrayList);
                    }
                    Object e11 = object.next();
                    if (((String)e11).length() <= 0) continue;
                    arrayList.add(e11);
                }
            }
            throw throwable2;
        }
    }

    public final void a(rd ... rdArray) {
        synchronized (this) {
            t.G((Collection)this.a, (Object[])rdArray);
            return;
        }
    }
}

