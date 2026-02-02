/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.o5;
import io.appmetrica.analytics.impl.w7;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

public final class f5
implements w7 {
    public final String a;
    public final String b;

    public f5(@NotNull o5 o54) {
        CharSequence charSequence = o54.d() ? "main" : o54.b();
        this.a = String.format("component_%s.db", Arrays.copyOf(new Object[]{charSequence}, 1));
        charSequence = new StringBuilder("db_metrica_");
        ((StringBuilder)charSequence).append(o54);
        this.b = ((StringBuilder)charSequence).toString();
    }

    @Override
    @NotNull
    public final String a() {
        return this.b;
    }

    @Override
    @NotNull
    public final String b() {
        return this.a;
    }
}

