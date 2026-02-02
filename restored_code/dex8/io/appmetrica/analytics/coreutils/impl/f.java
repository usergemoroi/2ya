/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.coreutils.impl;

import android.content.ComponentName;
import android.content.Context;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;

public final class f
extends a0
implements a {
    public final Context a;
    public final ComponentName b;
    public final int c;

    public f(Context context, ComponentName componentName, int n10) {
        this.a = context;
        this.b = componentName;
        this.c = n10;
        super(0);
    }

    public final Object invoke() {
        return this.a.getPackageManager().getServiceInfo(this.b, this.c);
    }
}

