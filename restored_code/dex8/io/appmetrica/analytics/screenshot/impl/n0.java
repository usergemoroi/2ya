/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Activity$ScreenCaptureCallback
 */
package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import java.util.concurrent.Executor;

public final class n0 {
    public static /* bridge */ /* synthetic */ void a(Activity activity, Executor executor, Activity.ScreenCaptureCallback screenCaptureCallback) {
        activity.registerScreenCaptureCallback(executor, screenCaptureCallback);
    }
}

