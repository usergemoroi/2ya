/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.K9;
import io.appmetrica.analytics.impl.Nk;
import io.appmetrica.analytics.impl.bl;
import io.appmetrica.analytics.impl.dl;
import io.appmetrica.analytics.impl.el;
import io.appmetrica.analytics.impl.fl;
import io.appmetrica.analytics.impl.k7;
import io.appmetrica.analytics.impl.nh;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.v5;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public final class yh
extends nh {
    public yh(@NotNull v5 v54) {
        super(v54);
    }

    @Override
    public final boolean a(@NotNull o6 o63) {
        long l10;
        long l11;
        Object object;
        Object object2;
        K9 k94 = this.a.n;
        Object object3 = k94.c;
        if (((bl)object3).g == 0) {
            object2 = ((bl)object3).d.b();
            object = ((bl)object3).e.b();
            l11 = -1L;
            l10 = object2 == null ? -1L : ((Nk)object2).d;
            if (object != null) {
                l11 = ((Nk)object).d;
            }
            if (l10 <= l11) {
                object2 = object;
            }
        } else {
            object2 = ((bl)object3).f;
        }
        if (object2 != null) {
            object = new dl();
            ((dl)object).a = ((Nk)object2).d;
            l10 = ((Nk)object2).f.getAndIncrement();
            object3 = ((Nk)object2).b;
            ((el)object3).a("SESSION_COUNTER_ID", ((Nk)object2).f.get());
            ((el)object3).b();
            ((dl)object).b = l10;
            ((dl)object).c = TimeUnit.MILLISECONDS.toSeconds(((Nk)object2).j);
            ((dl)object).d = ((Nk)object2).c.a;
            object2 = object;
        } else {
            l10 = o63.j;
            l11 = ((bl)object3).b.a();
            object2 = ((bl)object3).a.e;
            object = fl.c;
            ((k7)object2).a(l11, (fl)((Object)object), l10);
            object2 = new dl();
            ((dl)object2).a = l11;
            ((dl)object2).d = object;
            ((dl)object2).b = 0L;
            ((dl)object2).c = 0L;
        }
        k94.a(o63, (dl)object2);
        return false;
    }
}

