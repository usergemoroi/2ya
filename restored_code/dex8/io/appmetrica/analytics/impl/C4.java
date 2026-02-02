/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Q3;
import io.appmetrica.analytics.impl.R3;
import io.appmetrica.analytics.impl.Sm;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class c4
implements Sm {
    @NotNull
    public final R3 a(@NotNull Q3 q34, @NotNull List<Q3> list) {
        return new R3(q34, list);
    }

    @Override
    public final Object invoke(Object object, Object object2) {
        return new R3((Q3)object, (List)object2);
    }
}

