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

public final class g
extends a0
implements a {
    public final Context a;
    public final String b;

    public g(Context context, String string2) {
        this.a = context;
        this.b = string2;
        super(0);
    }

    public final Object invoke() {
        return this.a.getPackageManager().hasSystemFeature(this.b);
    }
}

