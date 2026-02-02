/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.SparseArray
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.id;
import io.appmetrica.analytics.impl.jd;
import io.appmetrica.analytics.impl.pf;
import io.appmetrica.analytics.impl.y7;

public final class u4
extends jd {
    public final pf a;

    public u4(@NonNull Context context) {
        this(new pf(y7.a(context).b()));
    }

    public u4(pf pf3) {
        this.a = pf3;
    }

    @Override
    public final void a(int n10) {
        this.a.c(n10);
    }

    @Override
    public final int b() {
        return (int)this.a.a(-1L);
    }

    public final SparseArray<id> c() {
        return new SparseArray();
    }
}

