/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;

public final class h
extends a0
implements a {
    public final Context a;
    public final Intent b;
    public final int c;

    public h(Context context, Intent intent, int n10) {
        this.a = context;
        this.b = intent;
        this.c = n10;
        super(0);
    }

    public final Object invoke() {
        return this.a.getPackageManager().resolveActivity(this.b, this.c);
    }
}

