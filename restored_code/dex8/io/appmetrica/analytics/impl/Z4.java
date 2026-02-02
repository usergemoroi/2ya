/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.B5;
import io.appmetrica.analytics.impl.D4;
import io.appmetrica.analytics.impl.G4;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Pa;
import io.appmetrica.analytics.impl.o4;
import io.appmetrica.analytics.impl.ro;
import io.appmetrica.analytics.impl.y4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public final class z4 {
    public final Object a = new Object();
    public final B5 b;
    public final HashMap c = new HashMap();
    public final Pa d = new Pa();
    public final Context e;
    public final G4 f;

    public z4(Context context, B5 b54) {
        this(context, b54, new G4());
    }

    public z4(Context context, B5 b54, G4 g44) {
        this.e = context.getApplicationContext();
        this.b = b54;
        this.f = g44;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final D4 a(o4 o44, N4 object) {
        Object object2 = this.a;
        synchronized (object2) {
            Throwable throwable2;
            block4: {
                D4 d44;
                block3: {
                    try {
                        Object object3 = (D4)this.c.get(o44);
                        d44 = object3;
                        if (object3 != null) break block3;
                        this.f.getClass();
                        d44 = G4.a(o44).a(this.e, this.b, o44, (N4)object);
                        this.c.put(o44, d44);
                        object3 = this.d;
                        object = new y4(o44.b, o44.c, o44.d);
                        ((Pa)object3).a(object, o44);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return d44;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String object, Integer object2, String object3) {
        Object object4 = this.a;
        synchronized (object4) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        Pa pa4 = this.d;
                        y4 y44 = new y4((String)object, (Integer)object2, (String)object3);
                        object2 = (Collection)pa4.a.remove(y44);
                        if (ro.a((Collection)object2)) break block5;
                        object2.size();
                        object = new ArrayList(object2.size());
                        object3 = object2.iterator();
                        while (object3.hasNext()) {
                            object2 = (o4)object3.next();
                            ((ArrayList)object).add((D4)this.c.remove(object2));
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    object = ((ArrayList)object).iterator();
                    while (object.hasNext()) {
                        ((D4)object.next()).a();
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

