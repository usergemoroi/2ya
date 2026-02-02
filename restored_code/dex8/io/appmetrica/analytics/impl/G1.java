/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.impl.r1;
import io.appmetrica.analytics.impl.v0;
import java.util.List;

public final class g1
implements Runnable {
    public final Context a;
    public final StartupParamsCallback b;
    public final List c;
    public final r1 d;

    public g1(r1 r14, Context context, StartupParamsCallback startupParamsCallback, List list) {
        this.d = r14;
        this.a = context;
        this.b = startupParamsCallback;
        this.c = list;
    }

    @Override
    public final void run() {
        Object object = this.d.a;
        Object object2 = this.a.getApplicationContext();
        object.getClass();
        object = v0.a(object2);
        StartupParamsCallback startupParamsCallback = this.b;
        object2 = this.c;
        ((v0)object).f().a(startupParamsCallback, (List<String>)object2);
    }
}

