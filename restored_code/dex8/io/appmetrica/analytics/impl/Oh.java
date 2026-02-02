/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.C6;
import io.appmetrica.analytics.impl.Hh;
import io.appmetrica.analytics.impl.N4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.o4;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.impl.z4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class oh
implements C6 {
    public final Context a;
    public final z4 b;
    public final IHandlerExecutor c;

    public oh(@NotNull Context context, @NotNull z4 z42) {
        this.a = context;
        this.b = z42;
        this.c = Na.j().w().e();
    }

    public final void a(@NotNull o4 o44, @NotNull o6 o63, @NotNull N4 n42) {
        this.b.a(o44, n42).a(o63, n42);
        this.b.a(o44.b, o44.c, o44.d);
    }

    public final void a(@NotNull o6 o63, @Nullable Bundle bundle) {
        if (!o63.m()) {
            this.c.execute(new Hh(this.a, o63, bundle, this.b));
        }
    }
}

