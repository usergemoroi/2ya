/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.F;
import io.appmetrica.analytics.impl.T;
import io.appmetrica.analytics.impl.cj;
import java.util.concurrent.Callable;

public final class vp
implements Callable {
    public final boolean a;
    public final F b;
    public final T c;
    public final cj d;

    public /* synthetic */ vp(boolean bl2, F f11, T t13, cj cj3) {
        this.a = bl2;
        this.b = f11;
        this.c = t13;
        this.d = cj3;
    }

    public final Object call() {
        return T.a(this.a, this.b, this.c, this.d);
    }
}

