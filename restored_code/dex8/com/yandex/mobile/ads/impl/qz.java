/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.mobile.ads.impl.fe
 *  com.yandex.mobile.ads.impl.fh0
 *  com.yandex.mobile.ads.impl.lv$a
 *  com.yandex.mobile.ads.impl.m92
 *  com.yandex.mobile.ads.impl.mv
 *  com.yandex.mobile.ads.impl.pv
 *  com.yandex.mobile.ads.impl.sh0
 *  com.yandex.mobile.ads.impl.wj1
 *  com.yandex.mobile.ads.impl.xj1
 *  com.yandex.mobile.ads.impl.yj0
 *  com.yandex.mobile.ads.impl.yx1
 *  com.yandex.mobile.ads.impl.zs0
 */
package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.ch0;
import com.yandex.mobile.ads.impl.dh0;
import com.yandex.mobile.ads.impl.eh0;
import com.yandex.mobile.ads.impl.fc0;
import com.yandex.mobile.ads.impl.fe;
import com.yandex.mobile.ads.impl.fh0;
import com.yandex.mobile.ads.impl.lv;
import com.yandex.mobile.ads.impl.m92;
import com.yandex.mobile.ads.impl.mv;
import com.yandex.mobile.ads.impl.pv;
import com.yandex.mobile.ads.impl.s23;
import com.yandex.mobile.ads.impl.sh0;
import com.yandex.mobile.ads.impl.t23;
import com.yandex.mobile.ads.impl.tj;
import com.yandex.mobile.ads.impl.wj1;
import com.yandex.mobile.ads.impl.xj1;
import com.yandex.mobile.ads.impl.yj0;
import com.yandex.mobile.ads.impl.yx1;
import com.yandex.mobile.ads.impl.zs0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

public class qz
extends tj {
    private final boolean e;
    private final int f;
    private final int g;
    @Nullable
    private final String h;
    @Nullable
    private final fh0 i;
    private final fh0 j;
    private final boolean k;
    @Nullable
    private xj1<String> l;
    @Nullable
    private HttpURLConnection m;
    @Nullable
    private InputStream n;
    private boolean o;
    private int p;
    private long q;
    private long r;

    public qz(@Nullable String string2, int n10, int n12, @Nullable fh0 fh02) {
        super(true);
        this.h = string2;
        this.f = n10;
        this.g = n12;
        this.e = false;
        this.i = fh02;
        this.l = null;
        this.j = new fh0();
        this.k = false;
    }

    private HttpURLConnection a(URL object, int n10, @Nullable byte[] byArray, long l10, long l11, boolean bl2, boolean bl3, Map<String, String> object22) throws IOException {
        HttpURLConnection httpURLConnection = this.a((URL)object);
        httpURLConnection.setConnectTimeout(this.f);
        httpURLConnection.setReadTimeout(this.g);
        object = new HashMap();
        fh0 fh02 = this.i;
        if (fh02 != null) {
            ((HashMap)object).putAll(fh02.a());
        }
        ((HashMap)object).putAll(this.j.a());
        ((HashMap)object).putAll(object22);
        for (Map.Entry entry : ((HashMap)object).entrySet()) {
            httpURLConnection.setRequestProperty((String)entry.getKey(), (String)entry.getValue());
        }
        int n12 = sh0.c;
        if (l10 == 0L && l11 == -1L) {
            object = null;
        } else {
            object = new StringBuilder("bytes=");
            ((StringBuilder)object).append(l10);
            ((StringBuilder)object).append("-");
            if (l11 != -1L) {
                ((StringBuilder)object).append(l10 + l11 - 1L);
            }
            object = ((StringBuilder)object).toString();
        }
        if (object != null) {
            httpURLConnection.setRequestProperty("Range", (String)object);
        }
        if ((object = this.h) != null) {
            httpURLConnection.setRequestProperty("User-Agent", (String)object);
        }
        object = bl2 ? "gzip" : "identity";
        httpURLConnection.setRequestProperty("Accept-Encoding", (String)object);
        httpURLConnection.setInstanceFollowRedirects(bl3);
        bl2 = byArray != null;
        httpURLConnection.setDoOutput(bl2);
        httpURLConnection.setRequestMethod(pv.a((int)n10));
        if (byArray != null) {
            httpURLConnection.setFixedLengthStreamingMode(byArray.length);
            httpURLConnection.connect();
            object = httpURLConnection.getOutputStream();
            ((OutputStream)object).write(byArray);
            ((OutputStream)object).close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    private URL a(URL serializable, @Nullable String string2) throws ch0 {
        if (string2 != null) {
            Serializable serializable2;
            block4: {
                try {
                    serializable2 = new URL((URL)serializable, string2);
                    string2 = ((URL)serializable2).getProtocol();
                    if ("https".equals(string2) || "http".equals(string2)) break block4;
                    serializable = new StringBuilder("Unsupported protocol redirect: ");
                    ((StringBuilder)serializable).append(string2);
                }
                catch (MalformedURLException malformedURLException) {
                    throw new ch0(malformedURLException, 2001, 1);
                }
                throw new ch0(((StringBuilder)serializable).toString(), 2001);
            }
            if (!this.e && !string2.equals(((URL)serializable).getProtocol())) {
                serializable2 = new StringBuilder("Disallowed cross-protocol redirect (");
                ((StringBuilder)serializable2).append(((URL)serializable).getProtocol());
                ((StringBuilder)serializable2).append(" to ");
                ((StringBuilder)serializable2).append(string2);
                ((StringBuilder)serializable2).append(")");
                throw new ch0(((StringBuilder)serializable2).toString(), 2001);
            }
            return serializable2;
        }
        throw new ch0("Null location redirect", 2001);
    }

    private void a(long l10) throws IOException {
        if (l10 == 0L) {
            return;
        }
        byte[] byArray = new byte[4096];
        while (l10 > 0L) {
            int n10 = (int)Math.min(l10, (long)4096);
            InputStream inputStream = this.n;
            int n12 = m92.a;
            n10 = inputStream.read(byArray, 0, n10);
            if (!Thread.currentThread().isInterrupted()) {
                if (n10 != -1) {
                    l10 -= (long)n10;
                    this.c(n10);
                    continue;
                }
                throw new ch0(2008);
            }
            throw new ch0(new InterruptedIOException(), 2000, 1);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(@Nullable HttpURLConnection object, long l10) {
        if (object == null) return;
        int n10 = m92.a;
        if (n10 < 19) return;
        if (n10 > 20) {
            return;
        }
        try {
            object = ((URLConnection)object).getInputStream();
            if (l10 == -1L ? ((InputStream)object).read() == -1 : l10 <= 2048L) {
                return;
            }
            Object object2 = object.getClass().getName();
            if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(object2)) {
                if (!"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(object2)) return;
            }
            object2 = object.getClass().getSuperclass();
            object2.getClass();
            object2 = ((Class)object2).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
            ((AccessibleObject)object2).setAccessible(true);
            ((Method)object2).invoke(object, new Object[0]);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private HttpURLConnection d(pv pv3) throws IOException {
        URL uRL = new URL(pv3.a.toString());
        int n10 = pv3.c;
        byte[] byArray = pv3.d;
        long l10 = pv3.f;
        long l11 = pv3.g;
        int n12 = pv3.i;
        int n13 = 0;
        boolean bl2 = (n12 & 1) == 1;
        if (!this.e && !this.k) {
            return this.a(uRL, n10, byArray, l10, l11, bl2, true, pv3.e);
        }
        while (true) {
            n12 = n13 + 1;
            if (n13 > 20) break;
            HttpURLConnection httpURLConnection = this.a(uRL, n10, byArray, l10, l11, bl2, false, pv3.e);
            n13 = httpURLConnection.getResponseCode();
            String string2 = httpURLConnection.getHeaderField("Location");
            if (n10 != 1 && n10 != 3 || n13 != 300 && n13 != 301 && n13 != 302 && n13 != 303 && n13 != 307 && n13 != 308) {
                if (n10 == 2 && (n13 == 300 || n13 == 301 || n13 == 302 || n13 == 303)) {
                    httpURLConnection.disconnect();
                    if (!this.k || n13 != 302) {
                        byArray = null;
                        n10 = 1;
                    }
                    uRL = this.a(uRL, string2);
                    n13 = n12;
                    continue;
                }
                return httpURLConnection;
            }
            httpURLConnection.disconnect();
            uRL = this.a(uRL, string2);
            n13 = n12;
        }
        throw new ch0(new NoRouteToHostException(fe.a((String)"Too many redirects: ", (int)n12)), 2001, 1);
    }

    private void f() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            }
            catch (Exception exception) {
                zs0.a((String)"DefaultHttpDataSource", (String)"Unexpected error while disconnecting", (Throwable)exception);
            }
            this.m = null;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final long a(pv var1_1) throws ch0 {
        block24: {
            block19: {
                block23: {
                    block22: {
                        block20: {
                            var5_6 = 0L;
                            this.r = 0L;
                            this.q = 0L;
                            this.b(var1_1 /* !! */ );
                            try {
                                var13_7 = this.d(var1_1 /* !! */ );
                                this.m = var13_7;
                                this.p = var13_7.getResponseCode();
                                var13_7.getResponseMessage();
                                var2_8 = this.p;
                                var7_9 = -1L;
                                if (var2_8 < 200 || var2_8 > 299) break block19;
                                var12_10 = var13_7.getContentType();
                                var14_12 = this.l;
                                if (var14_12 == null) break block20;
                            }
                            catch (IOException var1_5) {
                                this.f();
                                throw ch0.a(var1_5, 1);
                            }
                            if (!var14_12.apply(var12_10)) {
                                this.f();
                                throw new dh0((String)var12_10);
                            }
                        }
                        var3_14 = var5_6;
                        if (this.p == 200) {
                            var9_16 = var1_1 /* !! */ .f;
                            var3_14 = var5_6;
                            if (var9_16 != 0L) {
                                var3_14 = var9_16;
                            }
                        }
                        if (!(var11_17 = "gzip".equalsIgnoreCase(var13_7.getHeaderField("Content-Encoding")))) {
                            var5_6 = var1_1 /* !! */ .g;
                            if (var5_6 != -1L) {
                                this.q = var5_6;
                            } else {
                                var9_16 = sh0.a((String)var13_7.getHeaderField("Content-Length"), (String)var13_7.getHeaderField("Content-Range"));
                                var5_6 = var7_9;
                                if (var9_16 != -1L) {
                                    var5_6 = var9_16 - var3_14;
                                }
                                this.q = var5_6;
                            }
                        } else {
                            this.q = var1_1 /* !! */ .g;
                        }
                        try {
                            this.n = var13_7.getInputStream();
                            if (!var11_17) break block22;
                            this.n = var12_10 = new GZIPInputStream(this.n);
                        }
                        catch (IOException var1_2) {
                            break block23;
                        }
                    }
                    this.o = true;
                    this.c(var1_1 /* !! */ );
                    try {
                        this.a(var3_14);
                        return this.q;
                    }
                    catch (IOException var1_3) {
                        this.f();
                        if (var1_3 instanceof ch0 == false) throw new ch0(var1_3, 2000, 1);
                        throw (ch0)var1_3;
                    }
                }
                this.f();
                throw new ch0(var1_2, 2000, 1);
            }
            var12_11 = var13_7.getHeaderFields();
            if (this.p == 416 && var1_1 /* !! */ .f == (var3_15 = sh0.a((String)var13_7.getHeaderField("Content-Range")))) {
                this.o = true;
                this.c(var1_1 /* !! */ );
                var3_15 = var1_1 /* !! */ .g;
                if (var3_15 == -1L) return var5_6;
                return var3_15;
            }
            if ((var13_7 = var13_7.getErrorStream()) == null) ** GOTO lbl83
            try {
                var2_8 = m92.a;
                var1_1 /* !! */  = (pv)new byte[4096];
                var14_13 = new ByteArrayOutputStream();
                while ((var2_8 = var13_7.read((byte[])var1_1 /* !! */ )) != -1) {
                    var14_13.write((byte[])var1_1 /* !! */ , 0, var2_8);
                }
                var14_13.toByteArray();
                break block24;
lbl83:

                var2_8 = m92.a;
            }
            catch (IOException var1_4) {
                var2_8 = m92.a;
            }
        }
        this.f();
        if (this.p == 416) {
            var1_1 /* !! */  = new mv(2008);
            throw new eh0(this.p, (mv)var1_1 /* !! */ , var12_11);
        }
        var1_1 /* !! */  = null;
        throw new eh0(this.p, (mv)var1_1 /* !! */ , var12_11);
    }

    @VisibleForTesting
    public HttpURLConnection a(URL uRL) throws IOException {
        return (HttpURLConnection)uRL.openConnection();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void close() throws ch0 {
        Throwable throwable2;
        block8: {
            block7: {
                try {
                    InputStream inputStream = this.n;
                    if (inputStream == null) break block7;
                    long l10 = this.q;
                    long l11 = -1L;
                    if (l10 != -1L) {
                        l11 = l10 - this.r;
                    }
                    qz.a(this.m, l11);
                    try {
                        inputStream.close();
                    }
                    catch (IOException iOException) {
                        int n10 = m92.a;
                        ch0 ch02 = new ch0(iOException, 2000, 3);
                        throw ch02;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
            }
            this.n = null;
            this.f();
            if (this.o) {
                this.o = false;
                this.e();
            }
            return;
        }
        this.n = null;
        this.f();
        if (this.o) {
            this.o = false;
            this.e();
        }
        throw throwable2;
    }

    @Override
    public final Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection == null) {
            return yj0.g();
        }
        return new b(httpURLConnection.getHeaderFields());
    }

    @Override
    @Nullable
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.m;
        httpURLConnection = httpURLConnection == null ? null : Uri.parse((String)httpURLConnection.getURL().toString());
        return httpURLConnection;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int read(byte[] byArray, int n10, int n12) throws ch0 {
        IOException iOException2;
        block8: {
            block9: {
                block7: {
                    int n13;
                    block6: {
                        if (n12 == 0) {
                            return 0;
                        }
                        try {
                            long l10 = this.q;
                            n13 = n12;
                            if (l10 == -1L) break block6;
                            if ((l10 -= this.r) == 0L) break block7;
                            n13 = (int)Math.min((long)n12, l10);
                        }
                        catch (IOException iOException2) {
                            break block8;
                        }
                    }
                    InputStream inputStream = this.n;
                    n12 = m92.a;
                    if ((n10 = inputStream.read(byArray, n10, n13)) != -1) break block9;
                }
                return -1;
            }
            this.r += (long)n10;
            this.c(n10);
            return n10;
        }
        n10 = m92.a;
        throw ch0.a(iOException2, 2);
    }

    public static final class a
    implements lv.a {
        private final fh0 a = new fh0();
        @Nullable
        private String b;
        private int c = 8000;
        private int d = 8000;

        public final lv a() {
            return new qz(this.b, this.c, this.d, this.a);
        }

        public final a b() {
            this.b = null;
            return this;
        }
    }

    private static final class b
    extends fc0<String, List<String>> {
        private final Map<String, List<String>> b;

        public b(Map<String, List<String>> map2) {
            this.b = map2;
        }

        public static /* synthetic */ boolean d(Map.Entry entry) {
            return bl2 = entry.getKey() != null;
        }

        public static /* synthetic */ boolean e(String string2) {
            return bl2 = string2 != null;
        }

        protected final Map a() {
            return this.b;
        }

        @Override
        protected final Map<String, List<String>> b() {
            return this.b;
        }

        @Override
        public final boolean containsKey(@Nullable Object object) {
            boolean bl2 = object != null && super.containsKey(object);
            return bl2;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean containsValue(@Nullable Object object) {
            Iterator iterator = (Iterator)wj1.a(this.entrySet().iterator());
            if (object == null) {
                do {
                    if (!iterator.hasNext()) return false;
                } while (((Map.Entry)iterator.next()).getValue() != null);
                return true;
            } else {
                do {
                    if (!iterator.hasNext()) return false;
                } while (!object.equals(((Map.Entry)iterator.next()).getValue()));
            }
            return true;
        }

        @Override
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return yx1.a(super.entrySet(), (xj1)new s23());
        }

        @Override
        public final boolean equals(@Nullable Object object) {
            boolean bl2 = object != null && this.a(object);
            return bl2;
        }

        @Override
        @Nullable
        public final Object get(@Nullable Object object) {
            object = object == null ? null : (List)super.get(object);
            return object;
        }

        @Override
        public final int hashCode() {
            return this.c();
        }

        @Override
        public final boolean isEmpty() {
            boolean bl2;
            boolean bl3 = super.isEmpty();
            boolean bl4 = bl2 = true;
            if (!bl3) {
                bl4 = super.size() == 1 && super.containsKey(null) ? bl2 : false;
            }
            return bl4;
        }

        @Override
        public final Set<String> keySet() {
            return yx1.a(super.keySet(), (xj1)new t23());
        }

        @Override
        public final int size() {
            return super.size() - super.containsKey(null);
        }
    }
}

