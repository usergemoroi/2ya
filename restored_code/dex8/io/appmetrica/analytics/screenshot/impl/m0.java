/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Activity$ScreenCaptureCallback
 */
package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;

public final class m0 {
    public static /* bridge */ /* synthetic */ void a(Activity activity, Activity.ScreenCaptureCallback screenCaptureCallback) {
        activity.unregisterScreenCaptureCallback(screenCaptureCallback);
    }
}

