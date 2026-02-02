/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.y;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

public final class bf
implements Converter {
    @NotNull
    public final String a(@NotNull byte[] byArray) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final byte[] a(@NotNull String string2) {
        String string3 = string2;
        if (y.e("native", string2)) {
            string3 = "JVM";
        }
        return string3.getBytes(d.b);
    }

    public final Object toModel(Object object) {
        object = (byte[])object;
        throw new UnsupportedOperationException();
    }
}

