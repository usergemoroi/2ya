/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.webkit.WebView
 *  com.yandex.mobile.ads.impl.t8
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.webkit.WebView;
import com.yandex.mobile.ads.impl.t8;

public final class to2
extends t8 {
    @SuppressLint(value={"SetJavaScriptEnabled"})
    public to2(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        this.a(webView);
    }
}

