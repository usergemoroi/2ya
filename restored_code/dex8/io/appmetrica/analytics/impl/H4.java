/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.impl.Z;
import io.appmetrica.analytics.impl.a0;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientActivator;
import org.jetbrains.annotations.NotNull;

public final class h4
implements ModuleClientActivator {
    @Override
    public final void activate(@NotNull Context context) {
        a0 a04 = A4.l().b();
        a04.c.a().executeDelayed(new Z(a04, context), a04.d);
    }
}

