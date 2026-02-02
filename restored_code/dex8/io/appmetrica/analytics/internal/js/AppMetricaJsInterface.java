/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.JavascriptInterface
 *  androidx.annotation.NonNull
 */
package io.appmetrica.analytics.internal.js;

import android.webkit.JavascriptInterface;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.r1;

public class AppMetricaJsInterface {
    private final r1 a;

    public AppMetricaJsInterface(@NonNull r1 r14) {
        this.a = r14;
    }

    @JavascriptInterface
    public void reportEvent(String string2, String string3) {
        this.a.d(string2, string3);
    }
}

