/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.Bk;
import io.appmetrica.analytics.impl.Na;
import io.appmetrica.analytics.impl.Tl;
import io.appmetrica.analytics.impl.V9;
import io.appmetrica.analytics.impl.eb;
import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

public class sn
implements Bk,
V9 {
    public final eb a;
    public final Tl b;
    public final AtomicBoolean c;

    public sn(@NotNull eb eb4, @NotNull Tl tl3) {
        this.a = eb4;
        this.b = tl3;
        this.c = new AtomicBoolean(false);
        Objects.toString(eb4.b());
    }

    public void a() {
    }

    public final void a(@NotNull NetworkTask networkTask) {
        Na.F.getClass();
        NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTask);
    }

    public final void b() {
        if (!this.c.get()) {
            this.g();
        }
    }

    public final void c() {
        if (!this.c.get()) {
            this.f();
            this.a();
        }
    }

    @NotNull
    public final eb d() {
        return this.a;
    }

    public final boolean e() {
        return this.c.get();
    }

    public void f() {
        this.b.a();
    }

    public void g() {
    }

    @Override
    public final void onCreate() {
        this.c.compareAndSet(true, false);
    }

    @Override
    public final void onDestroy() {
        if (this.c.compareAndSet(false, true)) {
            this.a();
        }
    }
}

