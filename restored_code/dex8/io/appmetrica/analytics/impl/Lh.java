/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Rh;
import io.appmetrica.analytics.impl.Th;
import io.appmetrica.analytics.impl.bi;
import io.appmetrica.analytics.impl.il;
import io.appmetrica.analytics.impl.o0;
import io.appmetrica.analytics.impl.o6;
import io.appmetrica.analytics.internal.IAppMetricaService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class lh
extends Th {
    public final Rh e;

    public lh(@NotNull o0 o02, @Nullable il il3, @NotNull Rh rh3) {
        super(o02, il3);
        this.e = rh3;
    }

    @Override
    public final void a(@NotNull IAppMetricaService iAppMetricaService) {
        Rh rh3 = this.e;
        o6 o63 = rh3.a;
        bi bi2 = rh3.e;
        iAppMetricaService.reportData(rh3.c, o63.d(bi2.c()));
    }

    @Override
    public final void a(@Nullable Throwable throwable) {
    }
}

