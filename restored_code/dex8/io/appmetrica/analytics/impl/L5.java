/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.t
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ne;
import io.appmetrica.analytics.impl.W5;
import io.appmetrica.analytics.impl.d9;
import io.appmetrica.analytics.impl.ed;
import io.appmetrica.analytics.impl.j5;
import io.appmetrica.analytics.impl.k5;
import io.appmetrica.analytics.impl.k7;
import io.appmetrica.analytics.impl.mh;
import java.util.List;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;

public final class l5 {
    public final W5 a;
    public final ed b;
    public final ed c;

    public l5(@NotNull k7 k74, @NotNull mh mh3) {
        Ne ne2 = new Ne(k74);
        this.a = new W5(k74);
        this.b = new ed(ne2, new k5(mh3));
        this.c = new ed(ne2, j5.a);
    }

    @NotNull
    public final List<d9> a() {
        return t.p((Object[])new d9[]{this.a, this.b});
    }

    @NotNull
    public final List<d9> b() {
        return t.e((Object)this.c);
    }
}

