/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.jvm.functions.l
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.D0;
import io.appmetrica.analytics.impl.W;
import io.appmetrica.analytics.impl.be;
import io.appmetrica.analytics.impl.ee;
import io.appmetrica.analytics.impl.ie;
import io.appmetrica.analytics.impl.jl;
import io.appmetrica.analytics.impl.oh;
import io.appmetrica.analytics.impl.yp;
import io.appmetrica.analytics.impl.zp;
import kotlin.jvm.functions.l;
import kotlin.k0;

public final class de {
    public final l a;

    public de(ie ie2) {
        this.a = ie2;
    }

    public static final jl a(D0 d03) {
        return new be(d03.f.d);
    }

    public static final jl b(D0 d03) {
        return new W();
    }

    public final ee a(Context context, oh oh3) {
        return new ee(context, oh3, (l<? super String, k0>)this.a, new yp(), Bb.w, "actual");
    }

    public final ee b(Context context, oh oh3) {
        return new ee(context, oh3, (l<? super String, k0>)this.a, new zp(), Bb.x, "prev session");
    }
}

