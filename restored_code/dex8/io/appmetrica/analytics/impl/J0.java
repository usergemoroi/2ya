/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Al;
import io.appmetrica.analytics.impl.h0;
import io.appmetrica.analytics.impl.i0;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.qf;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

public final class j0 {
    public final HashMap a = new HashMap();

    public final i0 a(o5 o54, PublicLogger publicLogger, qf object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                i0 i04;
                block4: {
                    Object object2;
                    try {
                        object2 = (i0)this.a.get(o54.toString());
                        i04 = object2;
                        if (object2 != null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    object2 = ((qf)object).d();
                    object = ((h0)object2).a;
                    long l10 = ((h0)object2).b;
                    object2 = new Al(publicLogger, "[App Environment]");
                    i04 = new i0((String)object, l10, (Al)object2);
                    this.a.put(o54.toString(), i04);
                }
                return i04;
            }
            throw throwable2;
        }
    }

    public final void a(h0 h03, qf qf3) {
        synchronized (this) {
            qf3.a(h03).b();
            return;
        }
    }
}

