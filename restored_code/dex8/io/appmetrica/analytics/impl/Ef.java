/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.impl.I5;
import io.appmetrica.analytics.impl.M4;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.R9;
import io.appmetrica.analytics.impl.Tc;
import io.appmetrica.analytics.impl.Uc;
import io.appmetrica.analytics.impl.d9;
import io.appmetrica.analytics.impl.g8;
import io.appmetrica.analytics.impl.mh;
import io.appmetrica.analytics.impl.qf;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public final class ef
implements Uc,
ActivationBarrierCallback {
    public final R9 a;
    public final Tc b;
    public final Tc c;

    public ef(@NotNull R9 object, @NotNull mh mh3, @NotNull M4 m44, @NotNull qf qf3) {
        this.a = object;
        this.b = object = new Tc(mh3, m44, qf3);
        this.c = object;
        if (!((Tc)object).b()) {
            Na.j().a().subscribe(TimeUnit.SECONDS.toMillis(g8.a), Na.j().w().a(), this);
        }
    }

    @Override
    @NotNull
    public final d9 a() {
        return this.c;
    }

    @Override
    public final void onWaitFinished() {
        this.b.a();
        ((I5)this.a.a()).e();
    }
}

