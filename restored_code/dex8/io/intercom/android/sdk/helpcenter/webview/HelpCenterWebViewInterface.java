/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.JavascriptInterface
 *  android.webkit.WebView
 *  com.google.gson.Gson
 */
package io.intercom.android.sdk.helpcenter.webview;

import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.gson.Gson;
import io.intercom.android.sdk.api.Api;
import io.intercom.android.sdk.helpcenter.webview.HelpCenterWebViewAction;
import io.intercom.android.sdk.helpcenter.webview.a;
import io.intercom.android.sdk.helpcenter.webview.b;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.HashMap;
import java.util.Map;

public class HelpCenterWebViewInterface {
    public static final String METRIC_EVENT = "METRIC_EVENT";
    public static final String TRACK_REACTION = "TRACK_REACTION";
    private final Api api;
    private final Gson gson;
    private final boolean isFromSearchBrowse;
    private final MetricTracker metricTracker;
    private final WebView webView;

    public HelpCenterWebViewInterface(WebView webView, Gson gson, MetricTracker metricTracker, Api api, boolean bl2) {
        this.webView = webView;
        this.gson = gson;
        this.metricTracker = metricTracker;
        this.api = api;
        this.isFromSearchBrowse = bl2;
    }

    public static /* synthetic */ void a(HelpCenterWebViewInterface helpCenterWebViewInterface, Map map2) {
        helpCenterWebViewInterface.lambda$handleAction$1(map2);
    }

    public static /* synthetic */ void b(HelpCenterWebViewInterface helpCenterWebViewInterface, Map map2) {
        helpCenterWebViewInterface.lambda$handleAction$0(map2);
    }

    private /* synthetic */ void lambda$handleAction$0(Map map2) {
        String string2 = (String)map2.get("action");
        String string3 = (String)map2.get("object");
        String string4 = (String)map2.get("place");
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        if (map2.get("metadata") instanceof Map) {
            hashMap.putAll((Map)map2.get("metadata"));
        }
        if (this.isFromSearchBrowse) {
            hashMap.put("article_source", "search_browse");
        }
        this.metricTracker.educateWebviewMetric(string2, string3, string4, hashMap, "from_help_center_webview");
    }

    private /* synthetic */ void lambda$handleAction$1(Map object) {
        Double d14 = (Double)object.get("article_id");
        Double d15 = (Double)object.get("article_content_id");
        object = (Double)object.get("reaction_index");
        if (d14 != null && d15 != null && object != null) {
            this.api.reactToLink(String.valueOf(d14.intValue()), String.valueOf(d15.intValue()), ((Double)object).intValue(), true);
        }
    }

    @JavascriptInterface
    public void handleAction(String string2) {
        Object object = (HelpCenterWebViewAction)this.gson.fromJson(string2, HelpCenterWebViewAction.class);
        string2 = ((HelpCenterWebViewAction)object).getType();
        object = ((HelpCenterWebViewAction)object).getValue();
        if (string2 != null && object != null) {
            if (!string2.equals(TRACK_REACTION)) {
                if (string2.equals(METRIC_EVENT)) {
                    this.webView.post((Runnable)new a(this, (Map)object));
                }
            } else {
                this.webView.post((Runnable)new b(this, (Map)object));
            }
        }
    }
}

