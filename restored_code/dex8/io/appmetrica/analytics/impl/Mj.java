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
import io.appmetrica.analytics.impl.T9;
import io.appmetrica.analytics.impl.l9;
import io.appmetrica.analytics.impl.lg;

public final class mj
implements T9 {
    @Override
    @Nullable
    public final Integer a(@NonNull l9 object) {
        object = object.h;
        if (object == null) {
            object = lg.a;
            object = null;
        } else {
            object = (Integer)lg.c.get(object);
        }
        return object;
    }
}

