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
import kotlin.jvm.internal.a0;

public final class a
extends a0
implements kotlin.jvm.functions.a {
    public final Context a;
    public final ComponentName b;
    public final int c;

    public a(Context context, ComponentName componentName, int n10) {
        this.a = context;
        this.b = componentName;
        this.c = n10;
        super(0);
    }

    public final Object invoke() {
        return this.a.getPackageManager().getActivityInfo(this.b, this.c);
    }
}

