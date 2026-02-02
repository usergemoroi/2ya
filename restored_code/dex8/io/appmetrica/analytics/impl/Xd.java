/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Dl;
import io.appmetrica.analytics.impl.S2;
import org.jetbrains.annotations.NotNull;

public final class xd
extends S2 {
    public final String b;

    public xd(@NotNull String string2, @NotNull Dl dl2) {
        super(dl2);
        this.b = string2;
    }

    @Override
    @NotNull
    public final String a(@NotNull String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append('-');
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

