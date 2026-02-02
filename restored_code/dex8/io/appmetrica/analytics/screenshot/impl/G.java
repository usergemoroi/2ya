/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.screenshot.impl.K;
import io.appmetrica.analytics.screenshot.impl.e;
import org.jetbrains.annotations.NotNull;

public final class g
implements Converter {
    @NotNull
    public final K a(@NotNull e e11) {
        K k11 = new K();
        k11.a = e11.a;
        return k11;
    }

    @NotNull
    public final e a(@NotNull K k11) {
        return new e(k11.a);
    }

    public final Object toModel(Object object) {
        return new e(((K)object).a);
    }
}

