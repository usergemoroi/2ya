/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebViewClient
 *  com.yandex.mobile.ads.impl.fk
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import com.yandex.mobile.ads.impl.fk;
import org.jetbrains.annotations.NotNull;

public final class q2
extends fk {
    public q2(@NotNull Context context) {
        super(context);
        this.a(context);
    }

    @SuppressLint(value={"SetJavaScriptEnabled"})
    protected final void a(@NotNull Context context) {
        this.setBackgroundColor(-1);
        this.setInitialScale(1);
        WebSettings webSettings = this.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setSupportZoom(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        this.setDisplayZoomControls(false);
        this.setScrollbarFadingEnabled(true);
        this.setDrawingCacheEnabled(true);
        this.setWebChromeClient((WebChromeClient)new /* Unavailable Anonymous Inner Class!! */);
        this.setWebViewClient((WebViewClient)new /* Unavailable Anonymous Inner Class!! */);
    }
}

