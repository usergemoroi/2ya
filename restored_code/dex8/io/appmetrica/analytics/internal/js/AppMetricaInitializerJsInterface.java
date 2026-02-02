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

public class AppMetricaInitializerJsInterface {
    private final r1 a;

    public AppMetricaInitializerJsInterface(@NonNull r1 r14) {
        this.a = r14;
    }

    @JavascriptInterface
    public void init(String string2) {
        this.a.c(string2);
    }
}

