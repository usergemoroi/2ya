/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.webkit.ValueCallback
 *  android.webkit.WebResourceError
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 */
package io.intercom.android.sdk.articles;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.intercom.android.sdk.articles.ArticleWebViewListener;
import io.intercom.android.sdk.articles.a;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterUrlUtilsKt;
import java.util.Set;

public class ArticleWebViewClient
extends WebViewClient {
    private final String articleUrl;
    private final ArticleWebViewListener articleWebViewListener;
    private final Set<String> helpCenterUrls;
    private boolean isArticleNotFound = false;
    private boolean isLoadError;

    public ArticleWebViewClient(String string2, ArticleWebViewListener articleWebViewListener, Set<String> set) {
        this.articleUrl = string2;
        this.articleWebViewListener = articleWebViewListener;
        this.helpCenterUrls = set;
    }

    public static /* synthetic */ void a(ArticleWebViewClient articleWebViewClient, WebView webView, String string2) {
        articleWebViewClient.lambda$scrollToAnchorIfNeeded$0(webView, string2);
    }

    private float getDensityIndependentPixels(int n10, Context context) {
        return TypedValue.applyDimension((int)1, (float)n10, (DisplayMetrics)context.getResources().getDisplayMetrics());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ void lambda$scrollToAnchorIfNeeded$0(WebView webView, String string2) {
        try {
            int n10 = (int)this.getDensityIndependentPixels(Integer.parseInt(string2), webView.getContext());
            this.articleWebViewListener.scrollArticleViewTo(n10);
            return;
        }
        catch (NumberFormatException numberFormatException) {
            return;
        }
    }

    private void scrollToAnchorIfNeeded(WebView webView, String charSequence) {
        String string2 = Uri.parse((String)charSequence).getFragment();
        if (string2 != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("document.getElementById('");
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append("').offsetTop");
            webView.evaluateJavascript(((StringBuilder)charSequence).toString(), (ValueCallback)new a(this, webView));
        }
    }

    public void onPageFinished(WebView webView, String string2) {
        super.onPageFinished(webView, string2);
        if (!this.isLoadError && !this.isArticleNotFound) {
            this.scrollToAnchorIfNeeded(webView, string2);
            this.articleWebViewListener.onArticleFinishedLoading();
        }
    }

    public void onPageStarted(WebView webView, String string2, Bitmap bitmap) {
        super.onPageStarted(webView, string2, bitmap);
        if (!this.isArticleNotFound) {
            this.isLoadError = false;
            this.articleWebViewListener.onArticleStartedLoading();
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        this.isLoadError = true;
        this.articleWebViewListener.onArticleLoadingError();
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceResponse.getStatusCode() == 404 || webResourceResponse.getStatusCode() == 401) {
            this.isLoadError = true;
            this.isArticleNotFound = true;
            this.articleWebViewListener.articleNotFound();
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return this.shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String string2) {
        Uri uri = Uri.parse((String)string2);
        Object object = Uri.parse((String)this.articleUrl);
        String string3 = uri.getLastPathSegment();
        object = object.getLastPathSegment();
        webView = webView.getContext();
        if (!TextUtils.isEmpty((CharSequence)string3) && !TextUtils.isEmpty((CharSequence)object) && string3.contains((CharSequence)object)) {
            return false;
        }
        if (HelpCenterUrlUtilsKt.isHelpCenterArticleUrl(string2, this.helpCenterUrls)) {
            HelpCenterUrlUtilsKt.openArticle((Context)webView, HelpCenterUrlUtilsKt.extractIdFromLastSegment(string3), "article");
        } else if (HelpCenterUrlUtilsKt.isHelpCenterCollectionUrl(string2, this.helpCenterUrls)) {
            HelpCenterUrlUtilsKt.openCollection((Context)webView, HelpCenterUrlUtilsKt.extractIdFromLastSegment(string3), "article");
        } else {
            webView.startActivity(new Intent("android.intent.action.VIEW", uri));
        }
        return true;
    }
}

