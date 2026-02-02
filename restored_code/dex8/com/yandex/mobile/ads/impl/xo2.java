/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.webkit.WebView
 *  com.yandex.mobile.ads.impl.bp2
 *  com.yandex.mobile.ads.impl.kp2
 *  com.yandex.mobile.ads.impl.pb2
 *  com.yandex.mobile.ads.impl.q8
 *  com.yandex.mobile.ads.impl.t8
 *  com.yandex.mobile.ads.impl.xo2$a
 *  org.json.JSONObject
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import com.yandex.mobile.ads.impl.bp2;
import com.yandex.mobile.ads.impl.kp2;
import com.yandex.mobile.ads.impl.oo2;
import com.yandex.mobile.ads.impl.pb2;
import com.yandex.mobile.ads.impl.q8;
import com.yandex.mobile.ads.impl.t8;
import com.yandex.mobile.ads.impl.xo2;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class xo2
extends t8 {
    private WebView f;
    private Long g = null;
    private final Map<String, pb2> h;
    private final String i;

    public xo2(String string2, Map map2) {
        this.h = map2;
        this.i = string2;
    }

    static /* synthetic */ WebView a(xo2 xo22) {
        return xo22.f;
    }

    public final void a() {
        StringBuilder stringBuilder;
        Object object = new WebView(kp2.a().b());
        this.f = object;
        object.getSettings().setJavaScriptEnabled(true);
        this.a(this.f);
        object = this.f;
        String string22 = this.i;
        if (object != null && !TextUtils.isEmpty((CharSequence)string22)) {
            stringBuilder = new StringBuilder("javascript: ");
            stringBuilder.append(string22);
            object.loadUrl(stringBuilder.toString());
        }
        for (String string22 : this.h.keySet()) {
            CharSequence charSequence = this.h.get(string22).a().toExternalForm();
            stringBuilder = this.f;
            if (charSequence == null || TextUtils.isEmpty((CharSequence)string22)) continue;
            string22 = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", charSequence).replace("%INJECTION_ID%", string22);
            if (stringBuilder == null || TextUtils.isEmpty((CharSequence)string22)) continue;
            charSequence = new StringBuilder("javascript: ");
            ((StringBuilder)charSequence).append(string22);
            stringBuilder.loadUrl(((StringBuilder)charSequence).toString());
        }
        this.g = System.nanoTime();
    }

    public final void a(oo2 oo22, q8 q84) {
        JSONObject jSONObject = new JSONObject();
        Map map2 = q84.d();
        for (String string2 : map2.keySet()) {
            bp2.a((JSONObject)jSONObject, (String)string2, (Object)((pb2)map2.get(string2)));
        }
        this.a(oo22, q84, jSONObject);
    }

    public final void b() {
        super.b();
        long l10 = this.g == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.g, TimeUnit.NANOSECONDS);
        l10 = Math.max(4000L - l10, 2000L);
        new Handler().postDelayed((Runnable)new a(this), l10);
        this.f = null;
    }
}

