/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.Resources$NotFoundException
 *  android.net.Uri
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.WebSettings$LayoutAlgorithm
 *  android.widget.FrameLayout$LayoutParams
 *  androidx.annotation.ColorInt
 *  com.google.gson.Gson
 */
package io.intercom.android.sdk.blocks.messengercard;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import com.google.gson.Gson;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.messengercard.CardWebView;
import io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewClient;
import io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewInterface;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.File;

public class MessengerCardWebViewPresenter {
    private final File cache;
    private final Context context;
    private final String conversationId;
    private final String fallbackUrl;
    private final Gson gson;
    private final boolean isHomeScreen;
    private final View loadingView;
    private final MetricTracker metricTracker;
    @ColorInt
    private final int primaryColor;
    private final CardWebView webView;

    public MessengerCardWebViewPresenter(CardWebView cardWebView, View view, String string2, @ColorInt int n10, Gson gson, MetricTracker metricTracker, File file, String string3, boolean bl2, Context context) {
        this.webView = cardWebView;
        this.loadingView = view;
        this.fallbackUrl = string2;
        this.primaryColor = n10;
        this.gson = gson;
        this.metricTracker = metricTracker;
        this.conversationId = string3;
        this.cache = file;
        this.isHomeScreen = bl2;
        this.context = context;
    }

    public static CardWebView createCardWebView(Context object) {
        try {
            CardWebView cardWebView = new CardWebView((Context)object);
            object = cardWebView;
        }
        catch (Resources.NotFoundException notFoundException) {
            object = new CardWebView((Context)Injector.get().getApplication());
        }
        object.setAlpha(0.0f);
        object.setId(R.id.intercom_messenger_card_webview);
        object.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-2, -2));
        return object;
    }

    @SuppressLint(value={"SetJavaScriptEnabled"})
    public void setUpWebView() {
        this.webView.setUp();
        this.webView.setBackgroundColor(0);
        this.webView.setWebViewClient(new MessengerCardWebViewClient(Uri.parse((String)this.fallbackUrl).getHost()));
        Object object = this.webView.getSettings();
        object.setJavaScriptEnabled(true);
        object.setUseWideViewPort(true);
        object.setCacheMode(-1);
        object.setMixedContentMode(0);
        this.webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        object = new MessengerCardWebViewInterface(this.webView, this.loadingView, this.gson, this.primaryColor, this.metricTracker, this.conversationId, this.isHomeScreen, this.context);
        this.webView.addJavascriptInterface(object, "AndroidHost");
    }
}

