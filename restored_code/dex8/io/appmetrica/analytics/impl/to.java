/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.Zm;
import io.appmetrica.analytics.impl.an;
import io.appmetrica.analytics.impl.kb;
import io.appmetrica.analytics.impl.sm;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class to
implements kb {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @Nullable
    public final String a(@NotNull Context object) {
        an an3;
        try {
            an3 = Zm.a(sm.class);
            if (an3 == null) return null;
        }
        catch (Throwable throwable) {
            return null;
        }
        object = an3.a((Context)object, an3.c((Context)object));
        if (object == null) return null;
        object = (sm)object.read();
        if (object == null) return null;
        return ((sm)object).a;
    }
}

