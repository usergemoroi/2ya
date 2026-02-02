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

public final class en
extends Yi {
    public en(@NonNull Context context, @NonNull String string2) {
        super(context, string2, "string");
    }

    @Override
    @Nullable
    public final Object a(int n10) {
        return this.a.getString(n10);
    }

    @Nullable
    public final String b(int n10) {
        return this.a.getString(n10);
    }
}

