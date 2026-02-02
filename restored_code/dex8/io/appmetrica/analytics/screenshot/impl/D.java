/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity$ScreenCaptureCallback
 *  kotlin.jvm.functions.a
 *  kotlin.n
 */
package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.screenshot.impl.P;
import io.appmetrica.analytics.screenshot.impl.Q;
import io.appmetrica.analytics.screenshot.impl.a;
import io.appmetrica.analytics.screenshot.impl.c;
import io.appmetrica.analytics.screenshot.impl.i;
import io.appmetrica.analytics.screenshot.impl.l;
import io.appmetrica.analytics.screenshot.impl.o0;
import kotlin.m;
import kotlin.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class d
implements P {
    public final ClientContext a;
    public final Q b;
    public volatile i c;
    public final m d;

    public d(@NotNull ClientContext clientContext, @NotNull Q q12) {
        this.a = clientContext;
        this.b = q12;
        this.d = n.b((kotlin.jvm.functions.a)new a(this));
    }

    public static final /* synthetic */ i a(d d14) {
        return d14.c;
    }

    public static final /* synthetic */ Q b(d d14) {
        return d14.b;
    }

    public static final /* synthetic */ ClientContext c(d d14) {
        return d14.a;
    }

    public static final Activity.ScreenCaptureCallback d(d d14) {
        return o0.a(d14.d.getValue());
    }

    @Override
    public final void a() {
        if (!AndroidUtils.isApiAchieved(34)) {
            return;
        }
        this.a.getActivityLifecycleRegistry().registerListener(new c(this), ActivityEvent.STARTED, ActivityEvent.STOPPED);
    }

    @Override
    public final void a(@Nullable l object) {
        object = object != null ? ((l)object).a : null;
        this.c = object;
    }

    @NotNull
    public final String b() {
        return "AndroidApiScreenshotCaptor";
    }
}

