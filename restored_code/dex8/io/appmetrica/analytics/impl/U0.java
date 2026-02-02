/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.t1;
import io.appmetrica.analytics.impl.v0;
import java.util.concurrent.TimeUnit;

public final class u0
implements Runnable {
    public final v0 a;

    public u0(v0 v04) {
        this.a = v04;
    }

    @Override
    public final void run() {
        Context context = this.a.a;
        A4.l().c.a().executeDelayed(new t1(context), TimeUnit.SECONDS.toMillis(5L));
    }
}

