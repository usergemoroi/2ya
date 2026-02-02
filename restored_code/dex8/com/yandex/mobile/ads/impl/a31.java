/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebView
 *  com.yandex.mobile.ads.impl.lg0
 *  com.yandex.mobile.ads.impl.mg0
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.yandex.mobile.ads.impl.lg0;
import com.yandex.mobile.ads.impl.mg0;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.y;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class a31
extends lg0 {
    @Nullable
    private String c;

    public a31(@NotNull mg0 mg02) {
        super(mg02);
    }

    public final void a(@Nullable String string2) {
        this.c = string2;
    }

    @Nullable
    public final WebResourceResponse shouldInterceptRequest(@NotNull WebView object, @NotNull WebResourceRequest webResourceRequest) {
        Uri uri;
        String string2 = this.c;
        if (string2 != null && string2.length() > 0 && (uri = webResourceRequest.getUrl()) != null && y.e("mraid.js", uri.getLastPathSegment())) {
            object = string2.getBytes(d.b);
            y.i(object, "getBytes(...)");
            return new WebResourceResponse("text/javascript", "UTF-8", (InputStream)new ByteArrayInputStream((byte[])object));
        }
        return super.shouldInterceptRequest(object, webResourceRequest);
    }

    @Nullable
    public final WebResourceResponse shouldInterceptRequest(@NotNull WebView webView, @NotNull String string2) {
        return super.shouldInterceptRequest(webView, string2);
    }
}

