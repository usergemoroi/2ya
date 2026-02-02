/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.Yi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class cn
extends Yi {
    public cn(@NotNull Context context, @NotNull String string2) {
        super(context, string2, "array");
    }

    @Override
    public final Object a(int n10) {
        return this.a.getResources().getStringArray(n10);
    }

    @Nullable
    public final String[] b(int n10) {
        return this.a.getResources().getStringArray(n10);
    }
}

