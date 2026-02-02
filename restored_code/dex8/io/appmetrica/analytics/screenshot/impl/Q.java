/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.collections.l
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.screenshot.impl.L;
import io.appmetrica.analytics.screenshot.impl.o;
import kotlin.collections.l;
import org.jetbrains.annotations.NotNull;

public final class q
implements Converter {
    @NotNull
    public final L a(@NotNull o o11) {
        L l10 = new L();
        l10.a = o11.a;
        String[] stringArray = o11.b.toArray(new String[0]);
        if (stringArray != null) {
            l10.c = stringArray;
            l10.b = o11.c;
            return l10;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @NotNull
    public final o a(@NotNull L l10) {
        return new o(l10.a, l.i1((Object[])l10.c), l10.b);
    }
}

