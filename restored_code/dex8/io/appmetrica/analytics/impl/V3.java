/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.Yi;

public final class v3
extends Yi {
    public v3(@NonNull Context context, @NonNull String string2) {
        super(context, string2, "bool");
    }

    @Override
    @Nullable
    public final Object a(int n10) {
        return this.a.getResources().getBoolean(n10);
    }

    @Nullable
    public final Boolean b(int n10) {
        return this.a.getResources().getBoolean(n10);
    }
}

