/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package io.intercom.android.sdk.blocks.messengercard;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MessengerCardWebViewClient
extends WebViewClient {
    private static final int WEBVIEW_FADE_IN_TIME_MS = 150;
    private final String cardHost;

    public MessengerCardWebViewClient(String string2) {
        this.cardHost = string2;
    }

    public void onPageFinished(WebView webView, String string2) {
        webView.animate().alpha(1.0f).setStartDelay(150L).setDuration(150L).start();
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String string2) {
        Uri uri = Uri.parse((String)string2);
        String string3 = uri.getHost();
        if (!TextUtils.isEmpty((CharSequence)this.cardHost) && this.cardHost.equals(string3)) {
            webView.loadUrl(string2);
            return false;
        }
        webView.getContext().startActivity(new Intent("android.intent.action.VIEW", uri));
        return true;
    }
}

