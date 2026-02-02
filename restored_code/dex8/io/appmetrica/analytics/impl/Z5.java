/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.qf;
import io.appmetrica.analytics.impl.y7;

public final class z5 {
    public final o5 a;
    public final y7 b;

    public z5(Context context, o5 o54) {
        this(o54, y7.a(context));
    }

    public z5(o5 o54, y7 y74) {
        this.a = o54;
        this.b = y74;
    }

    public final qf a() {
        return new qf(this.b.b(this.a));
    }
}

