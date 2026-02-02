/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.screenshot.impl.P;
import io.appmetrica.analytics.screenshot.impl.Q;
import io.appmetrica.analytics.screenshot.impl.W;
import io.appmetrica.analytics.screenshot.impl.j;
import io.appmetrica.analytics.screenshot.impl.l;
import io.appmetrica.analytics.screenshot.impl.r;
import io.appmetrica.analytics.screenshot.impl.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class u
implements P {
    public final ClientContext a;
    public final Q b;
    public volatile j c;
    public final W d;

    public u(@NotNull ClientContext clientContext, @NotNull Q q12) {
        this.a = clientContext;
        this.b = q12;
        this.d = new W(clientContext, new r(this));
    }

    public static final /* synthetic */ Q a(u u11) {
        return u11.b;
    }

    public static final /* synthetic */ ClientContext b(u u11) {
        return u11.a;
    }

    public static final /* synthetic */ j c(u u11) {
        return u11.c;
    }

    public static final /* synthetic */ W d(u u11) {
        return u11.d;
    }

    @Override
    public final void a() {
        this.a.getActivityLifecycleRegistry().registerListener(new t(this), ActivityEvent.RESUMED, ActivityEvent.PAUSED);
    }

    @Override
    public final void a(@Nullable l object) {
        object = object != null ? ((l)object).c : null;
        this.c = object;
        this.d.c = this.c;
    }

    @NotNull
    public final String b() {
        return "ContentObserverScreenshotCaptor";
    }
}

