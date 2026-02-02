/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.impl.b;
import javax.net.ssl.SSLSocketFactory;

public final class a {
    public static Response a(String object, String object2, SSLSocketFactory sSLSocketFactory) {
        object2 = new Request.Builder((String)object2).withMethod("GET");
        if (!TextUtils.isEmpty((CharSequence)object)) {
            ((Request.Builder)object2).addHeader("If-None-Match", (String)object);
        }
        object = new NetworkClient.Builder().withInstanceFollowRedirects(true).withSslSocketFactory(sSLSocketFactory);
        int n10 = b.a;
        return ((NetworkClient.Builder)object).withConnectTimeout(n10).withReadTimeout(n10).build().newCall(((Request.Builder)object2).build()).execute();
    }
}

