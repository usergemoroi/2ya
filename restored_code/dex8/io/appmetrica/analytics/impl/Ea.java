/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Ib;
import io.appmetrica.analytics.impl.Ni;
import io.appmetrica.analytics.impl.nh;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class ea
extends Ib {
    public ea(@NotNull Ni ni3) {
        super(ni3);
    }

    @Override
    public final void a(@NotNull List<nh> list) {
        list.add(this.a.u);
        super.a(list);
    }
}

