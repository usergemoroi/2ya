/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity$ScreenCaptureCallback
 */
package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import io.appmetrica.analytics.screenshot.impl.a;
import io.appmetrica.analytics.screenshot.impl.d;

public final class k0
implements Activity.ScreenCaptureCallback {
    public final d a;

    public /* synthetic */ k0(d d14) {
        this.a = d14;
    }

    public final void onScreenCaptured() {
        io.appmetrica.analytics.screenshot.impl.a.a(this.a);
    }
}

