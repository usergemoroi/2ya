/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.Rn;

public final class ln
implements Rn {
    public final Rn a;
    public final Object b;

    public ln(@NonNull Rn rn3, @Nullable Object object) {
        this.a = rn3;
        this.b = object;
    }

    @Override
    @Nullable
    public final Object a(@Nullable Object object) {
        Object object2 = object;
        if (object != this.a.a(object)) {
            object2 = this.b;
        }
        return object2;
    }
}

