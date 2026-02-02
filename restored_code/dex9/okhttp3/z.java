/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.JvmName
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okhttp3.a0
 *  okhttp3.b
 *  okhttp3.b0
 *  okhttp3.c
 *  okhttp3.e
 *  okhttp3.e$a
 *  okhttp3.g
 *  okhttp3.h0
 *  okhttp3.i0
 *  okhttp3.internal.concurrent.e
 *  okhttp3.internal.connection.h
 *  okhttp3.internal.d
 *  okhttp3.internal.platform.h
 *  okhttp3.internal.proxy.a
 *  okhttp3.internal.tls.c
 *  okhttp3.k
 *  okhttp3.l
 *  okhttp3.n
 *  okhttp3.p
 *  okhttp3.q
 *  okhttp3.r$c
 *  okhttp3.w
 *  okhttp3.z$a
 *  okhttp3.z$b
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.c;
import okhttp3.e;
import okhttp3.g;
import okhttp3.h0;
import okhttp3.i0;
import okhttp3.internal.connection.e;
import okhttp3.internal.connection.h;
import okhttp3.internal.ws.d;
import okhttp3.k;
import okhttp3.l;
import okhttp3.n;
import okhttp3.p;
import okhttp3.q;
import okhttp3.r;
import okhttp3.w;
import okhttp3.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u00f0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u0000 32\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\n\u0094\u0001B\u0014\b\u0000\u0012\u0007\u0010\u0091\u0001\u001a\u00020\u0011\u00a2\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001B\n\b\u0016\u00a2\u0006\u0005\b\u0092\u0001\u0010\u0006J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00148G\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8G\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8G\u00a2\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020!0 8G\u00a2\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u0017\u0010/\u001a\u00020*8G\u00a2\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00105\u001a\u0002008G\u00a2\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010:\u001a\u0002068G\u00a2\u0006\f\n\u0004\b7\u00108\u001a\u0004\b\"\u00109R\u0017\u0010=\u001a\u0002008G\u00a2\u0006\f\n\u0004\b;\u00102\u001a\u0004\b<\u00104R\u0017\u0010@\u001a\u0002008G\u00a2\u0006\f\n\u0004\b>\u00102\u001a\u0004\b?\u00104R\u0017\u0010E\u001a\u00020A8G\u00a2\u0006\f\n\u0004\b\u001d\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010J\u001a\u0004\u0018\u00010F8G\u00a2\u0006\f\n\u0004\bG\u0010H\u001a\u0004\b'\u0010IR\u0017\u0010O\u001a\u00020K8G\u00a2\u0006\f\n\u0004\bC\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010T\u001a\u0004\u0018\u00010P8G\u00a2\u0006\f\n\u0004\b\u0017\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010Y\u001a\u00020U8G\u00a2\u0006\f\n\u0004\bM\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010[\u001a\u0002068G\u00a2\u0006\f\n\u0004\b-\u00108\u001a\u0004\bZ\u00109R\u0017\u0010`\u001a\u00020\\8G\u00a2\u0006\f\n\u0004\b<\u0010]\u001a\u0004\b^\u0010_R\u0016\u0010c\u001a\u0004\u0018\u00010a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b?\u0010bR\u0019\u0010i\u001a\u0004\u0018\u00010d8G\u00a2\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001d\u0010l\u001a\b\u0012\u0004\u0012\u00020j0 8G\u00a2\u0006\f\n\u0004\bk\u0010#\u001a\u0004\bG\u0010%R\u001d\u0010o\u001a\b\u0012\u0004\u0012\u00020m0 8G\u00a2\u0006\f\n\u0004\b$\u0010#\u001a\u0004\bn\u0010%R\u0017\u0010t\u001a\u00020p8G\u00a2\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bk\u0010sR\u0017\u0010x\u001a\u00020u8G\u00a2\u0006\f\n\u0004\b(\u0010v\u001a\u0004\b;\u0010wR\u0019\u0010|\u001a\u0004\u0018\u00010y8G\u00a2\u0006\f\n\u0004\b\u0012\u0010z\u001a\u0004\b7\u0010{R\u0018\u0010\u0080\u0001\u001a\u00020}8G\u00a2\u0006\f\n\u0004\b\u000f\u0010~\u001a\u0004\b+\u0010\u007fR\u0019\u0010\u0082\u0001\u001a\u00020}8G\u00a2\u0006\r\n\u0005\b\u0081\u0001\u0010~\u001a\u0004\b>\u0010\u007fR\u0019\u0010\u0084\u0001\u001a\u00020}8G\u00a2\u0006\r\n\u0004\bn\u0010~\u001a\u0005\b\u0083\u0001\u0010\u007fR\u0019\u0010\u0086\u0001\u001a\u00020}8G\u00a2\u0006\r\n\u0004\bR\u0010~\u001a\u0005\b\u0085\u0001\u0010\u007fR\u0019\u0010\u0087\u0001\u001a\u00020}8G\u00a2\u0006\r\n\u0004\bZ\u0010~\u001a\u0005\b\u0081\u0001\u0010\u007fR\u001a\u0010\u008a\u0001\u001a\u00030\u0088\u00018G\u00a2\u0006\r\n\u0004\bW\u0010\u0005\u001a\u0005\bq\u0010\u0089\u0001R\u001c\u0010\u008e\u0001\u001a\u00030\u008b\u00018\u0006\u00a2\u0006\u000f\n\u0006\b\u0083\u0001\u0010\u008c\u0001\u001a\u0005\be\u0010\u008d\u0001R\u0013\u0010\u0090\u0001\u001a\u00020a8G\u00a2\u0006\u0007\u001a\u0005\b~\u0010\u008f\u0001\u00a8\u0006\u0095\u0001"}, d2={"Lokhttp3/z;", "", "Lokhttp3/e$a;", "", "Lkotlin/k0;", "J", "()V", "Lokhttp3/b0;", "request", "Lokhttp3/e;", "a", "(Lokhttp3/b0;)Lokhttp3/e;", "Lokhttp3/i0;", "listener", "Lokhttp3/h0;", "z", "(Lokhttp3/b0;Lokhttp3/i0;)Lokhttp3/h0;", "Lokhttp3/z$a;", "y", "()Lokhttp3/z$a;", "Lokhttp3/p;", "c", "Lokhttp3/p;", "o", "()Lokhttp3/p;", "dispatcher", "Lokhttp3/k;", "d", "Lokhttp3/k;", "l", "()Lokhttp3/k;", "connectionPool", "", "Lokhttp3/w;", "e", "Ljava/util/List;", "v", "()Ljava/util/List;", "interceptors", "f", "x", "networkInterceptors", "Lokhttp3/r$c;", "g", "Lokhttp3/r$c;", "q", "()Lokhttp3/r$c;", "eventListenerFactory", "", "h", "Z", "G", "()Z", "retryOnConnectionFailure", "Lokhttp3/b;", "i", "Lokhttp3/b;", "()Lokhttp3/b;", "authenticator", "j", "r", "followRedirects", "k", "s", "followSslRedirects", "Lokhttp3/n;", "Lokhttp3/n;", "n", "()Lokhttp3/n;", "cookieJar", "Lokhttp3/c;", "m", "Lokhttp3/c;", "()Lokhttp3/c;", "cache", "Lokhttp3/q;", "Lokhttp3/q;", "p", "()Lokhttp3/q;", "dns", "Ljava/net/Proxy;", "Ljava/net/Proxy;", "C", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "Ljava/net/ProxySelector;", "E", "()Ljava/net/ProxySelector;", "proxySelector", "D", "proxyAuthenticator", "Ljavax/net/SocketFactory;", "Ljavax/net/SocketFactory;", "H", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactoryOrNull", "Ljavax/net/ssl/X509TrustManager;", "t", "Ljavax/net/ssl/X509TrustManager;", "L", "()Ljavax/net/ssl/X509TrustManager;", "x509TrustManager", "Lokhttp3/l;", "u", "connectionSpecs", "Lokhttp3/a0;", "B", "protocols", "Ljavax/net/ssl/HostnameVerifier;", "w", "Ljavax/net/ssl/HostnameVerifier;", "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lokhttp3/g;", "Lokhttp3/g;", "()Lokhttp3/g;", "certificatePinner", "Lokhttp3/internal/tls/c;", "Lokhttp3/internal/tls/c;", "()Lokhttp3/internal/tls/c;", "certificateChainCleaner", "", "I", "()I", "callTimeoutMillis", "A", "connectTimeoutMillis", "F", "readTimeoutMillis", "K", "writeTimeoutMillis", "pingIntervalMillis", "", "()J", "minWebSocketMessageToCompress", "Lokhttp3/internal/connection/h;", "Lokhttp3/internal/connection/h;", "()Lokhttp3/internal/connection/h;", "routeDatabase", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "builder", "<init>", "(Lokhttp3/z$a;)V", "b", "okhttp"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nOkHttpClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1079:1\n2624#2,3:1080\n2624#2,3:1083\n1#3:1086\n*S KotlinDebug\n*F\n+ 1 OkHttpClient.kt\nokhttp3/OkHttpClient\n*L\n225#1:1080,3\n255#1:1083,3\n*E\n"})
public class z
implements Cloneable,
e.a {
    @NotNull
    public static final b G = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final List<a0> H = okhttp3.internal.d.w((Object[])new a0[]{a0.h, a0.f});
    @NotNull
    private static final List<l> I = okhttp3.internal.d.w((Object[])new l[]{okhttp3.l.i, okhttp3.l.k});
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final long E;
    @NotNull
    private final h F;
    @NotNull
    private final p c;
    @NotNull
    private final k d;
    @NotNull
    private final List<w> e;
    @NotNull
    private final List<w> f;
    @NotNull
    private final r.c g;
    private final boolean h;
    @NotNull
    private final okhttp3.b i;
    private final boolean j;
    private final boolean k;
    @NotNull
    private final n l;
    @Nullable
    private final c m;
    @NotNull
    private final q n;
    @Nullable
    private final Proxy o;
    @NotNull
    private final ProxySelector p;
    @NotNull
    private final okhttp3.b q;
    @NotNull
    private final SocketFactory r;
    @Nullable
    private final SSLSocketFactory s;
    @Nullable
    private final X509TrustManager t;
    @NotNull
    private final List<l> u;
    @NotNull
    private final List<a0> v;
    @NotNull
    private final HostnameVerifier w;
    @NotNull
    private final g x;
    @Nullable
    private final okhttp3.internal.tls.c y;
    private final int z;

    public z() {
        this(new /* Unavailable Anonymous Inner Class!! */);
    }

    public z(@NotNull a a4) {
        List list;
        Object object;
        Object object2;
        kotlin.jvm.internal.y.j((Object)a4, (String)"builder");
        this.c = a4.s();
        this.d = a4.p();
        this.e = okhttp3.internal.d.W((List)a4.y());
        this.f = okhttp3.internal.d.W((List)a4.A());
        this.g = a4.u();
        this.h = a4.H();
        this.i = a4.j();
        this.j = a4.v();
        this.k = a4.w();
        this.l = a4.r();
        this.m = a4.k();
        this.n = a4.t();
        this.o = a4.D();
        if (a4.D() != null) {
            object2 = okhttp3.internal.proxy.a.a;
        } else {
            object2 = a4.F();
            object = object2;
            if (object2 == null) {
                object = ProxySelector.getDefault();
            }
            object2 = object;
            if (object == null) {
                object2 = okhttp3.internal.proxy.a.a;
            }
        }
        this.p = object2;
        this.q = a4.E();
        this.r = a4.J();
        this.u = list = a4.q();
        this.v = a4.C();
        this.w = a4.x();
        this.z = a4.l();
        this.A = a4.o();
        this.B = a4.G();
        this.C = a4.L();
        this.D = a4.B();
        this.E = a4.z();
        object2 = a4.I();
        object = object2;
        if (object2 == null) {
            object = new h();
        }
        this.F = object;
        object = list;
        if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
            object = object.iterator();
            while (object.hasNext()) {
                if (!((l)object.next()).f()) continue;
                if (a4.K() != null) {
                    this.s = a4.K();
                    object = a4.m();
                    kotlin.jvm.internal.y.g((Object)object);
                    this.y = object;
                    object2 = a4.M();
                    kotlin.jvm.internal.y.g((Object)object2);
                    this.t = object2;
                    a4 = a4.n();
                    kotlin.jvm.internal.y.g((Object)object);
                    this.x = a4.e((okhttp3.internal.tls.c)object);
                } else {
                    object2 = okhttp3.internal.platform.h.a;
                    this.t = object = object2.g().p();
                    object2 = object2.g();
                    kotlin.jvm.internal.y.g((Object)object);
                    this.s = object2.o((X509TrustManager)object);
                    object2 = okhttp3.internal.tls.c.a;
                    kotlin.jvm.internal.y.g((Object)object);
                    object = object2.a((X509TrustManager)object);
                    this.y = object;
                    a4 = a4.n();
                    kotlin.jvm.internal.y.g((Object)object);
                    this.x = a4.e((okhttp3.internal.tls.c)object);
                }
                break;
            }
        } else {
            this.s = null;
            this.y = null;
            this.t = null;
            this.x = okhttp3.g.d;
        }
        this.J();
    }

    private final void J() {
        Object object;
        block11: {
            block12: {
                block13: {
                    block14: {
                        block15: {
                            block16: {
                                block10: {
                                    object = this.e;
                                    kotlin.jvm.internal.y.h(object, (String)"null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                    if (!(object.contains(null) ^ true)) break block11;
                                    object = this.f;
                                    kotlin.jvm.internal.y.h(object, (String)"null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                    if (!(object.contains(null) ^ true)) break block12;
                                    object = this.u;
                                    if (!(object instanceof Collection) || !((Collection)object).isEmpty()) {
                                        object = object.iterator();
                                        while (object.hasNext()) {
                                            if (!((l)object.next()).f()) continue;
                                            if (this.s != null) {
                                                if (this.y != null) {
                                                    if (this.t == null) {
                                                        throw new IllegalStateException("x509TrustManager == null".toString());
                                                    }
                                                    break block10;
                                                }
                                                throw new IllegalStateException("certificateChainCleaner == null".toString());
                                            }
                                            throw new IllegalStateException("sslSocketFactory == null".toString());
                                        }
                                    }
                                    if (this.s != null) break block13;
                                    if (this.y != null) break block14;
                                    if (this.t != null) break block15;
                                    if (!kotlin.jvm.internal.y.e((Object)this.x, (Object)okhttp3.g.d)) break block16;
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
            object = new StringBuilder();
            ((StringBuilder)object).append("Null network interceptor: ");
            ((StringBuilder)object).append(this.f);
            throw new IllegalStateException(((StringBuilder)object).toString().toString());
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Null interceptor: ");
        ((StringBuilder)object).append(this.e);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }

    public static final /* synthetic */ List b() {
        return I;
    }

    public static final /* synthetic */ List c() {
        return H;
    }

    public static final /* synthetic */ SSLSocketFactory d(z z3) {
        return z3.s;
    }

    @JvmName(name="pingIntervalMillis")
    public final int A() {
        return this.D;
    }

    @JvmName(name="protocols")
    @NotNull
    public final List<a0> B() {
        return this.v;
    }

    @JvmName(name="proxy")
    @Nullable
    public final Proxy C() {
        return this.o;
    }

    @JvmName(name="proxyAuthenticator")
    @NotNull
    public final okhttp3.b D() {
        return this.q;
    }

    @JvmName(name="proxySelector")
    @NotNull
    public final ProxySelector E() {
        return this.p;
    }

    @JvmName(name="readTimeoutMillis")
    public final int F() {
        return this.B;
    }

    @JvmName(name="retryOnConnectionFailure")
    public final boolean G() {
        return this.h;
    }

    @JvmName(name="socketFactory")
    @NotNull
    public final SocketFactory H() {
        return this.r;
    }

    @JvmName(name="sslSocketFactory")
    @NotNull
    public final SSLSocketFactory I() {
        SSLSocketFactory sSLSocketFactory = this.s;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    @JvmName(name="writeTimeoutMillis")
    public final int K() {
        return this.C;
    }

    @JvmName(name="x509TrustManager")
    @Nullable
    public final X509TrustManager L() {
        return this.t;
    }

    @NotNull
    public okhttp3.e a(@NotNull b0 b02) {
        kotlin.jvm.internal.y.j((Object)b02, (String)"request");
        return new e(this, b02, false);
    }

    @NotNull
    public Object clone() {
        return super.clone();
    }

    @JvmName(name="authenticator")
    @NotNull
    public final okhttp3.b e() {
        return this.i;
    }

    @JvmName(name="cache")
    @Nullable
    public final c f() {
        return this.m;
    }

    @JvmName(name="callTimeoutMillis")
    public final int g() {
        return this.z;
    }

    @JvmName(name="certificateChainCleaner")
    @Nullable
    public final okhttp3.internal.tls.c i() {
        return this.y;
    }

    @JvmName(name="certificatePinner")
    @NotNull
    public final g j() {
        return this.x;
    }

    @JvmName(name="connectTimeoutMillis")
    public final int k() {
        return this.A;
    }

    @JvmName(name="connectionPool")
    @NotNull
    public final k l() {
        return this.d;
    }

    @JvmName(name="connectionSpecs")
    @NotNull
    public final List<l> m() {
        return this.u;
    }

    @JvmName(name="cookieJar")
    @NotNull
    public final n n() {
        return this.l;
    }

    @JvmName(name="dispatcher")
    @NotNull
    public final p o() {
        return this.c;
    }

    @JvmName(name="dns")
    @NotNull
    public final q p() {
        return this.n;
    }

    @JvmName(name="eventListenerFactory")
    @NotNull
    public final r.c q() {
        return this.g;
    }

    @JvmName(name="followRedirects")
    public final boolean r() {
        return this.j;
    }

    @JvmName(name="followSslRedirects")
    public final boolean s() {
        return this.k;
    }

    @NotNull
    public final h t() {
        return this.F;
    }

    @JvmName(name="hostnameVerifier")
    @NotNull
    public final HostnameVerifier u() {
        return this.w;
    }

    @JvmName(name="interceptors")
    @NotNull
    public final List<w> v() {
        return this.e;
    }

    @JvmName(name="minWebSocketMessageToCompress")
    public final long w() {
        return this.E;
    }

    @JvmName(name="networkInterceptors")
    @NotNull
    public final List<w> x() {
        return this.f;
    }

    @NotNull
    public a y() {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    @NotNull
    public h0 z(@NotNull b0 object, @NotNull i0 i02) {
        kotlin.jvm.internal.y.j((Object)object, (String)"request");
        kotlin.jvm.internal.y.j((Object)i02, (String)"listener");
        object = new d(okhttp3.internal.concurrent.e.i, (b0)object, i02, new Random(), this.D, null, this.E);
        ((d)object).k(this);
        return object;
    }
}

