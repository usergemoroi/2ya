/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.a
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ne;
import io.appmetrica.analytics.impl.Oe;
import io.appmetrica.analytics.impl.d9;
import kotlin.jvm.functions.a;
import org.jetbrains.annotations.NotNull;

public final class ed
implements d9 {
    public final Oe a;
    public final a b;

    public ed(@NotNull Oe oe2, @NotNull a<Integer> a14) {
        this.a = oe2;
        this.b = a14;
    }

    @Override
    public final boolean b() {
        boolean bl2 = ((Ne)this.a).b.get() >= (long)((Number)this.b.invoke()).intValue();
        return bl2;
    }
}

