/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.X9;
import java.util.HashMap;
import kotlin.jvm.internal.v0;
import kotlin.jvm.internal.y;
import kotlin.k0;

public final class za {
    public static volatile za c;
    public final Context a;
    public final HashMap b;

    public za(Context context) {
        this.a = context;
        this.b = new HashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final za a(Context object) {
        za za4;
        block6: {
            if (c == null) {
                za4 = v0.b(za.class);
                synchronized (za4) {
                    Throwable throwable2;
                    block5: {
                        block4: {
                            try {
                                za za5;
                                if (c != null) break block4;
                                c = za5 = new za((Context)object);
                            }
                            catch (Throwable throwable2) {
                                break block5;
                            }
                        }
                        object = k0.a;
                        break block6;
                    }
                    throw throwable2;
                }
            }
        }
        za4 = c;
        object = za4;
        if (za4 != null) return object;
        y.B("INSTANCE");
        return null;
    }

    public final void a(String string2) {
        synchronized (this) {
            this.b.remove(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final X9 b(String object) {
        synchronized (this) {
            try {
                Object v14;
                HashMap hashMap = this.b;
                Object object2 = v14 = hashMap.get(object);
                if (v14 != null) return (X9)object2;
                object2 = new Object(this.a, (String)object);
                hashMap.put(object, object2);
                return (X9)object2;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

