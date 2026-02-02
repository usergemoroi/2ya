/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.coreutils.impl;

import android.content.Context;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.a0;

public final class e
extends a0
implements a {
    public final Context a;
    public final String b;
    public final int c;

    public e(Context context, String string2, int n10) {
        this.a = context;
        this.b = string2;
        this.c = n10;
        super(0);
    }

    public final Object invoke() {
        return this.a.getPackageManager().getPackageInfo(this.b, this.c);
    }
}

