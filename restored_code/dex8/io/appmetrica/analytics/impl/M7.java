/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.fh;
import org.jetbrains.annotations.NotNull;

public final class m7
implements fh {
    @Override
    @NotNull
    public final String a(@NotNull String string2) {
        StringBuilder stringBuilder = new StringBuilder("/appmetrica/analytics/db/");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

