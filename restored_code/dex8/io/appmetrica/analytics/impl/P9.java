/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.impl.n9;
import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.o9;
import io.appmetrica.analytics.impl.y7;

public final class p9 {
    public final n9 a;
    public final o9 b;
    public final IBinaryDataHelper c;

    public p9(Context context, o5 o54) {
        this(new o9(), new n9(), y7.a(context).a(o54));
    }

    public p9(o9 o92, n9 n94, IBinaryDataHelper iBinaryDataHelper) {
        this.b = o92;
        this.a = n94;
        this.c = iBinaryDataHelper;
    }
}

