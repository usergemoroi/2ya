/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity$ScreenCaptureCallback
 *  kotlin.jvm.functions.a
 *  kotlin.jvm.internal.a0
 */
package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.d;
import io.appmetrica.analytics.screenshot.impl.k0;
import io.appmetrica.analytics.screenshot.impl.v;
import kotlin.jvm.internal.a0;

public final class a
extends a0
implements kotlin.jvm.functions.a {
    public final d a;

    public a(d d14) {
        this.a = d14;
        super(0);
    }

    public static final void a(d d14) {
        ((v)d14.b).a("AndroidApiScreenshotCaptor");
    }

    public final Activity.ScreenCaptureCallback a() {
        return new k0(this.a);
    }
}

