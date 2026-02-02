/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Bk;
import io.appmetrica.analytics.impl.Ma;
import io.appmetrica.analytics.impl.e3;
import io.appmetrica.analytics.impl.o2;
import java.util.ArrayList;
import java.util.Iterator;

public final class fc {
    public final e3 a;
    public final o2 b;
    public final ArrayList c;

    public fc(e3 e34, o2 o23) {
        ArrayList<Bk> arrayList;
        this.c = arrayList = new ArrayList<Bk>();
        this.a = e34;
        arrayList.add(e34);
        this.b = o23;
        arrayList.add(o23);
    }

    public final void a() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    Iterator iterator = this.c.iterator();
                    while (iterator.hasNext()) {
                        ((Bk)iterator.next()).onCreate();
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void a(Ma ma2) {
        synchronized (this) {
            this.c.add(ma2);
            return;
        }
    }
}

