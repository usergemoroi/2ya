/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package io.appmetrica.analytics.screenshot.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.screenshot.impl.P;
import io.appmetrica.analytics.screenshot.impl.Q;
import io.appmetrica.analytics.screenshot.impl.a0;
import io.appmetrica.analytics.screenshot.impl.c0;
import io.appmetrica.analytics.screenshot.impl.l;
import io.appmetrica.analytics.screenshot.impl.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class d0
implements P {
    public final ClientContext a;
    public final Q b;
    public final Handler c;
    public volatile boolean d;
    public volatile m e;
    public final a0 f;

    public d0(@NotNull ClientContext clientContext, @NotNull Q q12) {
        this.a = clientContext;
        this.b = q12;
        this.c = clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler();
        this.f = new a0(this);
    }

    public static final /* synthetic */ Q a(d0 d03) {
        return d03.b;
    }

    public static final /* synthetic */ void a(d0 d03, boolean bl2) {
        d03.d = bl2;
    }

    public static final /* synthetic */ ClientContext b(d0 d03) {
        return d03.a;
    }

    public static final /* synthetic */ Handler c(d0 d03) {
        return d03.c;
    }

    public static final /* synthetic */ m d(d0 d03) {
        return d03.e;
    }

    public static final /* synthetic */ a0 e(d0 d03) {
        return d03.f;
    }

    public static final /* synthetic */ boolean f(d0 d03) {
        return d03.d;
    }

    @Override
    public final void a() {
        this.a.getActivityLifecycleRegistry().registerListener(new c0(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }

    @Override
    public final void a(@Nullable l object) {
        object = object != null ? ((l)object).b : null;
        this.e = object;
    }

    @NotNull
    public final String b() {
        return "ServiceScreenshotCaptor";
    }
}

