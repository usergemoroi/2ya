/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.ValueCallback
 *  android.webkit.WebView
 */
package io.intercom.android.sdk.articles;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import io.intercom.android.sdk.articles.ArticleWebViewClient;

public final class a
implements ValueCallback {
    public final ArticleWebViewClient a;
    public final WebView b;

    public /* synthetic */ a(ArticleWebViewClient articleWebViewClient, WebView webView) {
        this.a = articleWebViewClient;
        this.b = webView;
    }

    public final void onReceiveValue(Object object) {
        ArticleWebViewClient.a(this.a, this.b, (String)object);
    }
}

