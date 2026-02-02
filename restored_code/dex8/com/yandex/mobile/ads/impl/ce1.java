/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.at1
 *  com.yandex.mobile.ads.impl.be1
 *  com.yandex.mobile.ads.impl.ce1$a
 *  com.yandex.mobile.ads.impl.dr
 *  com.yandex.mobile.ads.impl.es
 *  com.yandex.mobile.ads.impl.fr
 *  com.yandex.mobile.ads.impl.ip0
 *  com.yandex.mobile.ads.impl.j30
 *  com.yandex.mobile.ads.impl.k10
 *  com.yandex.mobile.ads.impl.n92
 *  com.yandex.mobile.ads.impl.pn
 *  com.yandex.mobile.ads.impl.pn$a
 *  com.yandex.mobile.ads.impl.q50$b
 *  com.yandex.mobile.ads.impl.qm1
 *  com.yandex.mobile.ads.impl.qn
 *  com.yandex.mobile.ads.impl.rh
 *  com.yandex.mobile.ads.impl.rh1
 *  com.yandex.mobile.ads.impl.rh1$a
 *  com.yandex.mobile.ads.impl.sd1
 *  com.yandex.mobile.ads.impl.ym$a
 *  com.yandex.mobile.ads.impl.zp1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.at1;
import com.yandex.mobile.ads.impl.be1;
import com.yandex.mobile.ads.impl.ce1;
import com.yandex.mobile.ads.impl.do1;
import com.yandex.mobile.ads.impl.dr;
import com.yandex.mobile.ads.impl.es;
import com.yandex.mobile.ads.impl.fr;
import com.yandex.mobile.ads.impl.ip0;
import com.yandex.mobile.ads.impl.j30;
import com.yandex.mobile.ads.impl.k10;
import com.yandex.mobile.ads.impl.n92;
import com.yandex.mobile.ads.impl.pn;
import com.yandex.mobile.ads.impl.q50;
import com.yandex.mobile.ads.impl.qm1;
import com.yandex.mobile.ads.impl.qn;
import com.yandex.mobile.ads.impl.rh;
import com.yandex.mobile.ads.impl.rh1;
import com.yandex.mobile.ads.impl.sd1;
import com.yandex.mobile.ads.impl.ym;
import com.yandex.mobile.ads.impl.zp1;
import java.net.ProxySelector;
import java.util.Collection;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ce1
implements Cloneable,
ym.a {
    @NotNull
    private static final List<fr> A;
    public static final int B = 0;
    @NotNull
    private static final List<qm1> z;
    @NotNull
    private final k10 a;
    @NotNull
    private final dr b;
    @NotNull
    private final List<ip0> c;
    @NotNull
    private final List<ip0> d;
    @NotNull
    private final q50.b e;
    private final boolean f;
    @NotNull
    private final rh g;
    private final boolean h;
    private final boolean i;
    @NotNull
    private final es j;
    @NotNull
    private final j30 k;
    @NotNull
    private final ProxySelector l;
    @NotNull
    private final rh m;
    @NotNull
    private final SocketFactory n;
    @Nullable
    private final SSLSocketFactory o;
    @Nullable
    private final X509TrustManager p;
    @NotNull
    private final List<fr> q;
    @NotNull
    private final List<qm1> r;
    @NotNull
    private final be1 s;
    @NotNull
    private final qn t;
    @Nullable
    private final pn u;
    private final int v;
    private final int w;
    private final int x;
    @NotNull
    private final at1 y;

    static {
        z = n92.a((Object[])new qm1[]{qm1.g, qm1.e});
        A = n92.a((Object[])new fr[]{fr.e, fr.f});
    }

    public ce1() {
        this(new /* Unavailable Anonymous Inner Class!! */);
    }

    public ce1(@NotNull a a12) {
        this.a = a12.i();
        this.b = a12.f();
        this.c = n92.b((List)a12.o());
        this.d = n92.b((List)a12.p());
        this.e = a12.k();
        this.f = a12.t();
        this.g = a12.b();
        this.h = a12.l();
        this.i = a12.m();
        this.j = a12.h();
        this.k = a12.j();
        Object object = ProxySelector.getDefault();
        pn pn3 = object;
        if (object == null) {
            pn3 = sd1.a;
        }
        this.l = pn3;
        this.m = a12.r();
        this.n = a12.u();
        pn3 = a12.g();
        this.q = pn3;
        this.r = a12.q();
        this.s = a12.n();
        this.v = a12.e();
        this.w = a12.s();
        this.x = a12.w();
        this.y = new at1();
        if (!(pn3 instanceof Collection) || !pn3.isEmpty()) {
            pn3 = pn3.iterator();
            while (pn3.hasNext()) {
                if (!((fr)pn3.next()).a()) continue;
                if (a12.v() != null) {
                    this.o = a12.v();
                    pn3 = a12.c();
                    kotlin.jvm.internal.y.g(pn3);
                    this.u = pn3;
                    object = a12.x();
                    kotlin.jvm.internal.y.g(object);
                    this.p = object;
                    a12 = a12.d();
                    kotlin.jvm.internal.y.g(pn3);
                    this.t = a12.a(pn3);
                } else {
                    int n10 = rh1.c;
                    rh1.a.a().getClass();
                    this.p = object = rh1.c();
                    pn3 = rh1.a.a();
                    kotlin.jvm.internal.y.g(object);
                    pn3.getClass();
                    this.o = rh1.c((X509TrustManager)object);
                    kotlin.jvm.internal.y.g(object);
                    this.u = pn3 = pn.a.a((X509TrustManager)object);
                    a12 = a12.d();
                    kotlin.jvm.internal.y.g(pn3);
                    this.t = a12.a(pn3);
                }
                break;
            }
        } else {
            this.o = null;
            this.u = null;
            this.p = null;
            this.t = qn.c;
        }
        this.y();
    }

    public static final /* synthetic */ List a() {
        return A;
    }

    public static final /* synthetic */ List b() {
        return z;
    }

    private final void y() {
        List<fr> list;
        block11: {
            block12: {
                block13: {
                    block14: {
                        block15: {
                            block16: {
                                block10: {
                                    list = this.c;
                                    kotlin.jvm.internal.y.h(list, "null cannot be cast to non-null type kotlin.collections.List<com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.Interceptor?>");
                                    if (!(list.contains(null) ^ true)) break block11;
                                    list = this.d;
                                    kotlin.jvm.internal.y.h(list, "null cannot be cast to non-null type kotlin.collections.List<com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.Interceptor?>");
                                    if (!(list.contains(null) ^ true)) break block12;
                                    list = this.q;
                                    if (!(list instanceof Collection) || !list.isEmpty()) {
                                        list = list.iterator();
                                        while (list.hasNext()) {
                                            if (!((fr)list.next()).a()) continue;
                                            if (this.o != null) {
                                                if (this.u != null) {
                                                    if (this.p == null) {
                                                        throw new IllegalStateException("x509TrustManager == null".toString());
                                                    }
                                                    break block10;
                                                }
                                                throw new IllegalStateException("certificateChainCleaner == null".toString());
                                            }
                                            throw new IllegalStateException("sslSocketFactory == null".toString());
                                        }
                                    }
                                    if (this.o != null) break block13;
                                    if (this.u != null) break block14;
                                    if (this.p != null) break block15;
                                    if (!kotlin.jvm.internal.y.e(this.t, qn.c)) break block16;
                                }
                                return;
                            }
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    throw new IllegalStateException("Check failed.".toString());
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            list = this.d;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Null network interceptor: ");
            stringBuilder.append(list);
            throw new IllegalStateException(stringBuilder.toString().toString());
        }
        list = this.c;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Null interceptor: ");
        stringBuilder.append(list);
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    @NotNull
    public final do1 a(@NotNull zp1 zp12) {
        return new do1(this, zp12, false);
    }

    @JvmName(name="authenticator")
    @NotNull
    public final rh c() {
        return this.g;
    }

    @NotNull
    public final Object clone() {
        return super.clone();
    }

    @JvmName(name="certificatePinner")
    @NotNull
    public final qn d() {
        return this.t;
    }

    @JvmName(name="connectTimeoutMillis")
    public final int e() {
        return this.v;
    }

    @JvmName(name="connectionPool")
    @NotNull
    public final dr f() {
        return this.b;
    }

    @JvmName(name="connectionSpecs")
    @NotNull
    public final List<fr> g() {
        return this.q;
    }

    @JvmName(name="cookieJar")
    @NotNull
    public final es h() {
        return this.j;
    }

    @JvmName(name="dispatcher")
    @NotNull
    public final k10 i() {
        return this.a;
    }

    @JvmName(name="dns")
    @NotNull
    public final j30 j() {
        return this.k;
    }

    @JvmName(name="eventListenerFactory")
    @NotNull
    public final q50.b k() {
        return this.e;
    }

    @JvmName(name="followRedirects")
    public final boolean l() {
        return this.h;
    }

    @JvmName(name="followSslRedirects")
    public final boolean m() {
        return this.i;
    }

    @NotNull
    public final at1 n() {
        return this.y;
    }

    @JvmName(name="hostnameVerifier")
    @NotNull
    public final be1 o() {
        return this.s;
    }

    @JvmName(name="interceptors")
    @NotNull
    public final List<ip0> p() {
        return this.c;
    }

    @JvmName(name="networkInterceptors")
    @NotNull
    public final List<ip0> q() {
        return this.d;
    }

    @JvmName(name="protocols")
    @NotNull
    public final List<qm1> r() {
        return this.r;
    }

    @JvmName(name="proxyAuthenticator")
    @NotNull
    public final rh s() {
        return this.m;
    }

    @JvmName(name="proxySelector")
    @NotNull
    public final ProxySelector t() {
        return this.l;
    }

    @JvmName(name="readTimeoutMillis")
    public final int u() {
        return this.w;
    }

    @JvmName(name="retryOnConnectionFailure")
    public final boolean v() {
        return this.f;
    }

    @JvmName(name="socketFactory")
    @NotNull
    public final SocketFactory w() {
        return this.n;
    }

    @JvmName(name="sslSocketFactory")
    @NotNull
    public final SSLSocketFactory x() {
        SSLSocketFactory sSLSocketFactory = this.o;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @JvmName(name="writeTimeoutMillis")
    public final int z() {
        return this.x;
    }
}

