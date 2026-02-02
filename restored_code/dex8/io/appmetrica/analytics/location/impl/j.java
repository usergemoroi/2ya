/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.location.impl.i;
import io.appmetrica.analytics.location.impl.k;
import io.appmetrica.analytics.location.impl.p;
import io.appmetrica.analytics.locationapi.internal.CacheArguments;

public final class j
implements Runnable {
    public final i a;
    public final k b;

    public j(k k11, i i14) {
        this.b = k11;
        this.a = i14;
    }

    @Override
    public final void run() {
        p p14 = this.b.c;
        Object object = this.a;
        p14.a = object;
        object = ((i)object).b;
        p14.b.updateCacheControl(((CacheArguments)object).getRefreshPeriod(), ((CacheArguments)object).getOutdatedTimeInterval());
    }
}

