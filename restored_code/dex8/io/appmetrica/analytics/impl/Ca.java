/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.impl.Am;
import io.appmetrica.analytics.impl.ba;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ca
implements ProtobufConverter {
    @NotNull
    public final Am a(@Nullable ba ba4) {
        Am am2 = new Am();
        if (ba4 != null) {
            am2.a = ba4.a;
        }
        return am2;
    }

    @NotNull
    public final ba a(@NotNull Am am2) {
        return new ba(am2.a);
    }

    @Override
    public final Object toModel(Object object) {
        return new ba(((Am)object).a);
    }
}

