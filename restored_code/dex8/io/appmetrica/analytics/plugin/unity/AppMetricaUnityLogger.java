/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package io.appmetrica.analytics.plugin.unity;

import android.util.Log;

final class AppMetricaUnityLogger {
    private AppMetricaUnityLogger() {
    }

    public static void e(String string2) {
        Log.e((String)"AppMetricaUnity", (String)string2);
    }

    public static void e(String string2, Throwable throwable) {
        Log.e((String)"AppMetricaUnity", (String)string2, (Throwable)throwable);
    }
}

