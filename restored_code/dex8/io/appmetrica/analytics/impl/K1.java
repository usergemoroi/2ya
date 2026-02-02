/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.impl.gl;
import io.appmetrica.analytics.impl.o;
import io.appmetrica.analytics.impl.r1;

public final class k1
implements Runnable {
    public final Activity a;
    public final r1 b;

    public k1(r1 r14, Activity activity) {
        this.b = r14;
        this.a = activity;
    }

    @Override
    public final void run() {
        Object object = this.b;
        gl gl2 = ((r1)object).h;
        Activity activity = this.a;
        object = ((r1)object).d().a;
        if (activity != null) {
            gl2.f.a(activity);
        }
        if (gl2.e.a(activity, o.b)) {
            object.b(activity);
        }
    }
}

