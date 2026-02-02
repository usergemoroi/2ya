/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.Gc;
import io.appmetrica.analytics.impl.Si;
import io.appmetrica.analytics.impl.Vf;
import io.appmetrica.analytics.impl.Y2;
import io.appmetrica.analytics.impl.hq;

public final class l2 {
    public final Gc a;
    public final ICommonExecutor b;
    public final long c;
    public boolean d;
    public final Runnable e;

    public l2(Gc gc2, IHandlerExecutor iHandlerExecutor, long l10) {
        this.a = gc2;
        this.b = iHandlerExecutor;
        this.c = l10;
        this.d = true;
        this.e = new hq(this);
    }

    public static final void a(l2 object) {
        Object object2 = ((l2)object).a.a;
        object = ((Y2)object2).h;
        object2 = ((Y2)object2).b.a;
        ((Si)object).c.a((Vf)object2);
    }
}

