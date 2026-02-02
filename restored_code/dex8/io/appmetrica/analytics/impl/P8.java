/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.dd;
import io.appmetrica.analytics.impl.q8;
import org.jetbrains.annotations.NotNull;

public abstract class p8 {
    public final dd a;

    public p8() {
        Integer n10 = 0;
        dd dd3 = new dd(n10);
        dd3.a((Object)q8.b, n10);
        dd3.a((Object)q8.c, 1);
        dd3.a((Object)q8.d, 2);
        dd3.a((Object)q8.e, 3);
        this.a = dd3;
    }

    @NotNull
    public final dd a() {
        return this.a;
    }

    public abstract boolean a(Object var1, Object var2);
}

