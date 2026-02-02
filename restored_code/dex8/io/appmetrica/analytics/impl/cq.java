/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.impl.Hc;
import io.appmetrica.analytics.impl.gl;
import io.appmetrica.analytics.impl.ve;

public final class cq
implements ve {
    public final gl a;
    public final Activity b;

    public /* synthetic */ cq(gl gl2, Activity activity) {
        this.a = gl2;
        this.b = activity;
    }

    @Override
    public final void consume(Object object) {
        this.a.b(this.b, (Hc)object);
    }
}

