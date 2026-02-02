/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.mobile.ads.impl.ef0
 *  com.yandex.mobile.ads.impl.mh0
 *  com.yandex.mobile.ads.impl.xj
 *  com.yandex.mobile.ads.impl.yp1
 */
package com.yandex.mobile.ads.impl;

import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.ef0;
import com.yandex.mobile.ads.impl.mh0;
import com.yandex.mobile.ads.impl.ph;
import com.yandex.mobile.ads.impl.xj;
import com.yandex.mobile.ads.impl.yp1;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class uh0
extends xj {
    private final SSLSocketFactory a;

    public uh0(SSLSocketFactory sSLSocketFactory) {
        this.a = sSLSocketFactory;
    }

    private static InputStream a(HttpURLConnection object) {
        try {
            InputStream inputStream = ((URLConnection)object).getInputStream();
            object = inputStream;
        }
        catch (IOException iOException) {
            object = ((HttpURLConnection)object).getErrorStream();
        }
        return object;
    }

    @VisibleForTesting
    static ArrayList a(Map object) {
        ArrayList<ef0> arrayList = new ArrayList<ef0>(object.size());
        for (Map.Entry entry : object.entrySet()) {
            if (entry.getKey() == null) continue;
            for (String string2 : (List)entry.getValue()) {
                arrayList.add(new ef0((String)entry.getKey(), string2));
            }
        }
        return arrayList;
    }

    static void a(yp1 yp12, HttpURLConnection httpURLConnection) throws IOException, ph {
        switch (yp12.f()) {
            default: {
                throw new IllegalStateException("Unknown method type.");
            }
            case 7: {
                httpURLConnection.setRequestMethod("PATCH");
                byte[] byArray = yp12.b();
                if (byArray == null) break;
                uh0.a(httpURLConnection, yp12, byArray);
                break;
            }
            case 6: {
                httpURLConnection.setRequestMethod("TRACE");
                break;
            }
            case 5: {
                httpURLConnection.setRequestMethod("OPTIONS");
                break;
            }
            case 4: {
                httpURLConnection.setRequestMethod("HEAD");
                break;
            }
            case 3: {
                httpURLConnection.setRequestMethod("DELETE");
                break;
            }
            case 2: {
                httpURLConnection.setRequestMethod("PUT");
                byte[] byArray = yp12.b();
                if (byArray == null) break;
                uh0.a(httpURLConnection, yp12, byArray);
                break;
            }
            case 1: {
                httpURLConnection.setRequestMethod("POST");
                byte[] byArray = yp12.b();
                if (byArray == null) break;
                uh0.a(httpURLConnection, yp12, byArray);
                break;
            }
            case 0: {
                httpURLConnection.setRequestMethod("GET");
            }
            case -1: 
        }
    }

    private static void a(HttpURLConnection object, yp1 yp12, byte[] byArray) throws IOException {
        ((URLConnection)object).setDoOutput(true);
        if (!((URLConnection)object).getRequestProperties().containsKey("Content-Type")) {
            ((URLConnection)object).setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        }
        object = new DataOutputStream(((URLConnection)object).getOutputStream());
        ((OutputStream)object).write(byArray);
        ((OutputStream)object).close();
    }

    static /* bridge */ /* synthetic */ InputStream b(HttpURLConnection httpURLConnection) {
        return uh0.a(httpURLConnection);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final mh0 a(yp1<?> object, Map<String, String> object2) throws IOException, ph {
        void var1_4;
        int n10;
        block10: {
            block8: {
                int n13;
                block9: {
                    Iterator iterator = object.l();
                    Cloneable cloneable = new HashMap();
                    cloneable.putAll(object2);
                    cloneable.putAll(object.e());
                    iterator = new URL((String)((Object)iterator));
                    object2 = (HttpURLConnection)((URL)((Object)iterator)).openConnection();
                    ((HttpURLConnection)object2).setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
                    n10 = object.j();
                    ((URLConnection)object2).setConnectTimeout(n10);
                    ((URLConnection)object2).setReadTimeout(n10);
                    n10 = 0;
                    ((URLConnection)object2).setUseCaches(false);
                    ((URLConnection)object2).setDoInput(true);
                    if ("https".equals(((URL)((Object)iterator)).getProtocol()) && (iterator = this.a) != null) {
                        ((HttpsURLConnection)object2).setSSLSocketFactory((SSLSocketFactory)((Object)iterator));
                    }
                    try {
                        for (String string2 : cloneable.keySet()) {
                            ((URLConnection)object2).setRequestProperty(string2, (String)cloneable.get(string2));
                        }
                        uh0.a((yp1)object, (HttpURLConnection)object2);
                        n13 = ((HttpURLConnection)object2).getResponseCode();
                        if (n13 == -1) break block8;
                        int n14 = object.f();
                        if (n14 == 4 || 100 <= n13 && n13 < 200 || n13 == 204 || n13 == 304) break block9;
                    }
                    catch (Throwable throwable) {}
                    try {
                        cloneable = uh0.a(((URLConnection)object2).getHeaderFields());
                        n10 = ((URLConnection)object2).getContentLength();
                        object = new /* Unavailable Anonymous Inner Class!! */;
                        return new mh0(n13, cloneable, n10, (InputStream)object);
                    }
                    catch (Throwable throwable) {
                        n10 = 1;
                    }
                    break block10;
                }
                object = new mh0(n13, uh0.a(((URLConnection)object2).getHeaderFields()), -1, null);
                ((HttpURLConnection)object2).disconnect();
                return object;
            }
            object = new IOException("Could not retrieve response code from HttpUrlConnection.");
            throw object;
        }
        if (n10 != 0) throw var1_4;
        ((HttpURLConnection)object2).disconnect();
        throw var1_4;
    }
}

