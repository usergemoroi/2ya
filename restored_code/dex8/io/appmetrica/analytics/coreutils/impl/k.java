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
import kotlin.k0;

public final class k
extends a0
implements a {
    public final Context a;
    public final ComponentName b;
    public final int c;
    public final int d;

    public k(Context context, ComponentName componentName, int n10, int n13) {
        this.a = context;
        this.b = componentName;
        this.c = n10;
        this.d = n13;
        super(0);
    }

    public final Object invoke() {
        this.a.getPackageManager().setComponentEnabledSetting(this.b, this.c, this.d);
        return k0.a;
    }
}

