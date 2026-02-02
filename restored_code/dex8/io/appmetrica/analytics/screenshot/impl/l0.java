/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 */
package io.appmetrica.analytics.screenshot.impl;

import android.app.ActivityManager;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.screenshot.impl.a0;
import io.appmetrica.analytics.screenshot.impl.d0;
import io.appmetrica.analytics.screenshot.impl.m;

public final class l0
implements FunctionWithThrowable {
    public final d0 a;
    public final a0 b;
    public final m c;

    public /* synthetic */ l0(d0 d03, a0 a04, m m12) {
        this.a = d03;
        this.b = a04;
        this.c = m12;
    }

    public final Object apply(Object object) {
        return a0.a(this.a, this.b, this.c, (ActivityManager)object);
    }
}

