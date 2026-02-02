/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebView
 *  org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
 */
package org.chromium.support_lib_boundary;

import android.app.PendingIntent;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;

public interface WebViewClientBoundaryInterface
extends FeatureFlagHolderBoundaryInterface {
    public void onPageCommitVisible(WebView var1, String var2);

    public void onReceivedError(WebView var1, WebResourceRequest var2, InvocationHandler var3);

    public void onReceivedHttpError(WebView var1, WebResourceRequest var2, WebResourceResponse var3);

    public void onSafeBrowsingHit(WebView var1, WebResourceRequest var2, int var3, InvocationHandler var4);

    public boolean onWebAuthnIntent(WebView var1, PendingIntent var2, InvocationHandler var3);

    public boolean shouldOverrideUrlLoading(WebView var1, WebResourceRequest var2);
}

