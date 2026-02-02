/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.JavascriptInterface
 *  android.webkit.WebView
 *  android.widget.FrameLayout$LayoutParams
 *  androidx.annotation.ColorInt
 *  com.google.gson.Gson
 */
package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import com.google.gson.Gson;
import io.intercom.android.sdk.activities.IntercomSheetActivity;
import io.intercom.android.sdk.blocks.messengercard.MessengerCardAlertDialogBuilder;
import io.intercom.android.sdk.blocks.messengercard.MessengerCardWebViewAction;
import io.intercom.android.sdk.helpcenter.articles.ArticleActivity;
import io.intercom.android.sdk.m5.navigation.IntercomRootActivityLauncher;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class MessengerCardWebViewInterface {
    private static final String HEIGHT_CHANGE_EVENT = "HEIGHT_CHANGE_EVENT";
    private static final String INPUT_TEXT = "INPUT_TEXT";
    private static final Double MESSENGER_APP_ID_ARTICLE_SEARCH = 27.0;
    private static final String METRIC_EVENT = "METRIC_EVENT";
    private static final String OPEN_SHEET = "OPEN_SHEET";
    private static final String OPEN_URL = "OPEN_URL";
    private final Context context;
    private final String conversationId;
    private final Gson gson;
    private final Boolean isHomescreen;
    private final View loadingView;
    private final MetricTracker metricTracker;
    private final int primaryColor;
    private final WebView webView;

    MessengerCardWebViewInterface(WebView webView, View view, Gson gson, @ColorInt int n10, MetricTracker metricTracker, String string2, boolean bl2, Context context) {
        this.webView = webView;
        this.loadingView = view;
        this.gson = gson;
        this.primaryColor = n10;
        this.metricTracker = metricTracker;
        this.conversationId = string2;
        this.isHomescreen = bl2;
        this.context = context;
    }

    private void displayArticle(String string2, Context context) {
        String string3 = this.isHomescreen != false ? "messenger_home_app" : "conversation";
        context.startActivity(ArticleActivity.buildIntent(context, new ArticleActivity.ArticleActivityArguments(string2, string3)));
    }

    private String getStringFromMap(Map<String, Object> object, String string2) {
        object = object.containsKey(string2) ? String.valueOf(object.get(string2)) : "";
        return object;
    }

    private void openSheet(Map<String, Object> map2, Context context) {
        String string2 = (String)map2.get("url");
        map2 = map2.containsKey("params") ? (Map<Object, Object>)map2.get("params") : new HashMap<String, Object>();
        String string3 = this.getStringFromMap((Map<String, Object>)map2, "uri");
        if (!TextUtils.isEmpty((CharSequence)string2) && !TextUtils.isEmpty((CharSequence)string3)) {
            String string4;
            if ("article-link".equals(this.getStringFromMap((Map<String, Object>)map2, "action_id")) && map2.containsKey("values") && !TextUtils.isEmpty((CharSequence)(string4 = this.getStringFromMap((Map)map2.get("values"), "article_id")))) {
                this.displayArticle(string4, context);
                return;
            }
            context.startActivity(IntercomSheetActivity.buildIntent(context, string2, (Map<String, Object>)map2, string3, this.conversationId));
        }
    }

    private void openUrl(Map<String, Object> map2, Context context) {
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)((String)map2.get("url")))));
    }

    private void showTextInputDialog(Map<String, Object> alertDialog, Context context) {
        alertDialog = new MessengerCardAlertDialogBuilder(context, (Map<String, Object>)alertDialog, this.primaryColor, this.webView).create();
        alertDialog.show();
        alertDialog.getWindow().setSoftInputMode(5);
        alertDialog.getButton(-2).setTextColor(this.primaryColor);
        alertDialog.getButton(-1).setTextColor(this.primaryColor);
    }

    @JavascriptInterface
    public void handleAction(String string2) {
        MessengerCardWebViewAction messengerCardWebViewAction = (MessengerCardWebViewAction)this.gson.fromJson(string2, MessengerCardWebViewAction.class);
        Map<String, Object> map2 = messengerCardWebViewAction.getPayload();
        string2 = messengerCardWebViewAction.getType();
        if (string2 != null && map2 != null) {
            int n10 = string2.hashCode();
            int n13 = -1;
            switch (n10) {
                default: {
                    break;
                }
                case 2092140298: {
                    if (!string2.equals(OPEN_SHEET)) break;
                    n13 = 4;
                    break;
                }
                case 1901318306: {
                    if (!string2.equals(INPUT_TEXT)) break;
                    n13 = 3;
                    break;
                }
                case 899662635: {
                    if (!string2.equals(METRIC_EVENT)) break;
                    n13 = 2;
                    break;
                }
                case 387980611: {
                    if (!string2.equals(HEIGHT_CHANGE_EVENT)) break;
                    n13 = 1;
                    break;
                }
                case 279273946: {
                    if (!string2.equals(OPEN_URL)) break;
                    n13 = 0;
                }
            }
            switch (n13) {
                default: {
                    break;
                }
                case 4: {
                    this.webView.post(new Runnable(){
                        final MessengerCardWebViewInterface this$0;
                        final Map val$payload;
                        {
                            this.this$0 = messengerCardWebViewInterface;
                            this.val$payload = map2;
                        }

                        @Override
                        public void run() {
                            MessengerCardWebViewInterface messengerCardWebViewInterface = this.this$0;
                            messengerCardWebViewInterface.openSheet(this.val$payload, messengerCardWebViewInterface.context);
                        }
                    });
                    break;
                }
                case 3: {
                    this.webView.post(new Runnable(){
                        final MessengerCardWebViewInterface this$0;
                        final Map val$payload;
                        {
                            this.this$0 = messengerCardWebViewInterface;
                            this.val$payload = map2;
                        }

                        @Override
                        public void run() {
                            Object object = (Double)this.val$payload.get("messengerAppId");
                            if (MESSENGER_APP_ID_ARTICLE_SEARCH.equals(object)) {
                                IntercomRootActivityLauncher.INSTANCE.startHelpCenterCollections(this.this$0.webView.getContext(), Collections.<String>emptyList(), "legacy_article_search_app");
                            } else {
                                object = this.this$0;
                                ((MessengerCardWebViewInterface)object).showTextInputDialog(this.val$payload, ((MessengerCardWebViewInterface)object).context);
                            }
                        }
                    });
                    break;
                }
                case 2: {
                    this.webView.post(new Runnable(){
                        final MessengerCardWebViewInterface this$0;
                        final MessengerCardWebViewAction val$action;
                        {
                            this.this$0 = messengerCardWebViewInterface;
                            this.val$action = messengerCardWebViewAction;
                        }

                        @Override
                        public void run() {
                            Map map2 = this.val$action.getPayload();
                            String string2 = (String)map2.get("action");
                            String string3 = (String)map2.get("object");
                            String string4 = (String)map2.get("place");
                            map2 = map2.get("metadata") instanceof Map ? (Map)map2.get("metadata") : null;
                            this.this$0.metricTracker.messengerCardWebViewEvent(string2, string3, string4, map2, this.this$0.isHomescreen);
                        }
                    });
                    break;
                }
                case 1: {
                    if (this.loadingView.getVisibility() != 0) break;
                    this.webView.post(new Runnable(this){
                        final MessengerCardWebViewInterface this$0;
                        {
                            this.this$0 = messengerCardWebViewInterface;
                        }

                        @Override
                        public void run() {
                            this.this$0.loadingView.setVisibility(8);
                            this.this$0.webView.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -2));
                        }
                    });
                    break;
                }
                case 0: {
                    this.webView.post(new Runnable(){
                        final MessengerCardWebViewInterface this$0;
                        final Map val$payload;
                        {
                            this.this$0 = messengerCardWebViewInterface;
                            this.val$payload = map2;
                        }

                        @Override
                        public void run() {
                            MessengerCardWebViewInterface messengerCardWebViewInterface = this.this$0;
                            messengerCardWebViewInterface.openUrl(this.val$payload, messengerCardWebViewInterface.context);
                        }
                    });
                }
            }
        }
    }
}

