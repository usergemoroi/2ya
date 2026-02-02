/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.security.NetworkSecurityPolicy
 *  androidx.media3.common.util.l
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okhttp3.a0
 *  okhttp3.internal.SuppressSignatureCheck
 *  okhttp3.internal.platform.android.h
 *  okhttp3.internal.platform.android.k
 *  okhttp3.internal.platform.android.l$a
 *  okhttp3.internal.platform.b$a
 *  okhttp3.internal.platform.h
 *  okhttp3.internal.tls.c
 *  okhttp3.internal.tls.e
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.platform;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.collections.t;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okhttp3.a0;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.android.f;
import okhttp3.internal.platform.android.g;
import okhttp3.internal.platform.android.i;
import okhttp3.internal.platform.android.j;
import okhttp3.internal.platform.android.k;
import okhttp3.internal.platform.android.l;
import okhttp3.internal.platform.b;
import okhttp3.internal.platform.h;
import okhttp3.internal.tls.c;
import okhttp3.internal.tls.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \t2\u00020\u0001:\u000223B\u0007\u00a2\u0006\u0004\b0\u00101J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ4\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0011\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0010\u00a2\u0006\u0002\b\u00110\u000fH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018H\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010+R\u0014\u0010/\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0013\u0010.\u00a8\u00064"}, d2={"Lokhttp3/internal/platform/b;", "Lokhttp3/internal/platform/h;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "Lkotlin/k0;", "f", "(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/a0;", "Lkotlin/jvm/JvmSuppressWildcards;", "protocols", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "closer", "", "i", "(Ljava/lang/String;)Ljava/lang/Object;", "message", "stackTrace", "m", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "j", "(Ljava/lang/String;)Z", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lokhttp3/internal/tls/c;", "c", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/c;", "Lokhttp3/internal/tls/e;", "d", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/e;", "Lokhttp3/internal/platform/android/k;", "Ljava/util/List;", "socketAdapters", "Lokhttp3/internal/platform/android/h;", "Lokhttp3/internal/platform/android/h;", "closeGuard", "<init>", "()V", "a", "b", "okhttp"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nAndroidPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n766#2:164\n857#2,2:165\n1#3:167\n*S KotlinDebug\n*F\n+ 1 AndroidPlatform.kt\nokhttp3/internal/platform/AndroidPlatform\n*L\n52#1:164\n52#1:165,2\n*E\n"})
@SuppressSignatureCheck
public final class b
extends h {
    @NotNull
    public static final a f = new /* Unavailable Anonymous Inner Class!! */;
    private static final boolean g;
    @NotNull
    private final List<k> d;
    @NotNull
    private final okhttp3.internal.platform.android.h e;

    static {
        boolean bl = h.a.h();
        boolean bl2 = false;
        if (bl && Build.VERSION.SDK_INT < 30) {
            bl2 = true;
        }
        g = bl2;
    }

    public b() {
        Iterable iterable2 = t.r(new k[]{l.a.b(l.j, null, (int)1, null), new j(okhttp3.internal.platform.android.f.f.d()), new j(i.a.a()), new j(okhttp3.internal.platform.android.g.a.a())});
        ArrayList<k> arrayList = new ArrayList<k>();
        for (Iterable iterable2 : iterable2) {
            if (!((k)iterable2).isSupported()) continue;
            arrayList.add((k)iterable2);
        }
        this.d = arrayList;
        this.e = okhttp3.internal.platform.android.h.d.a();
    }

    public static final /* synthetic */ boolean q() {
        return g;
    }

    @NotNull
    public c c(@NotNull X509TrustManager object) {
        y.j((Object)object, (String)"trustManager");
        okhttp3.internal.platform.android.b b4 = okhttp3.internal.platform.android.b.d.a(object);
        object = b4 != null ? b4 : super.c(object);
        return object;
    }

    @NotNull
    public e d(@NotNull X509TrustManager object) {
        y.j((Object)object, (String)"trustManager");
        try {
            Method method = object.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            ((AccessibleObject)method).setAccessible(true);
            y.i((Object)method, (String)"method");
            b b4 = new b((X509TrustManager)object, method);
            object = b4;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            object = super.d((X509TrustManager)object);
        }
        return object;
    }

    public void e(@NotNull SSLSocket sSLSocket, @Nullable String string, @NotNull List<a0> list) {
        k k42;
        block2: {
            y.j((Object)sSLSocket, (String)"sslSocket");
            y.j(list, (String)"protocols");
            for (k k42 : (Iterable)this.d) {
                if (!((k)k42).matchesSocket(sSLSocket)) continue;
                break block2;
            }
            k42 = null;
        }
        k42 = k42;
        if (k42 != null) {
            k42.configureTlsExtensions(sSLSocket, string, list);
        }
    }

    public void f(@NotNull Socket socket, @NotNull InetSocketAddress inetSocketAddress, int n4) throws IOException {
        y.j((Object)socket, (String)"socket");
        y.j((Object)inetSocketAddress, (String)"address");
        try {
            socket.connect(inetSocketAddress, n4);
            return;
        }
        catch (ClassCastException classCastException) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", classCastException);
            }
            throw classCastException;
        }
    }

    @Nullable
    public String h(@NotNull SSLSocket sSLSocket) {
        String string;
        String string2;
        k k4;
        block3: {
            block2: {
                y.j((Object)sSLSocket, (String)"sslSocket");
                k4 = ((Iterable)this.d).iterator();
                do {
                    boolean bl = k4.hasNext();
                    string = null;
                    if (!bl) break block2;
                } while (!((k)(string2 = (String)k4.next())).matchesSocket(sSLSocket));
                break block3;
            }
            string2 = null;
        }
        k4 = (k)string2;
        string2 = string;
        if (k4 != null) {
            string2 = k4.getSelectedProtocol(sSLSocket);
        }
        return string2;
    }

    @Nullable
    public Object i(@NotNull String string) {
        y.j((Object)string, (String)"closer");
        return this.e.a(string);
    }

    public boolean j(@NotNull String string) {
        y.j((Object)string, (String)"hostname");
        boolean bl = Build.VERSION.SDK_INT >= 24 ? androidx.media3.common.util.l.a((NetworkSecurityPolicy)NetworkSecurityPolicy.getInstance(), (String)string) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        return bl;
    }

    public void m(@NotNull String string, @Nullable Object object) {
        y.j((Object)string, (String)"message");
        if (!this.e.b(object)) {
            h.l((h)this, (String)string, (int)5, null, (int)4, null);
        }
    }

    @Metadata(d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u00d6\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u00d6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001b"}, d2={"Lokhttp3/internal/platform/b$b;", "Lokhttp3/internal/tls/e;", "Ljava/security/cert/X509Certificate;", "cert", "findByIssuerAndSignature", "(Ljava/security/cert/X509Certificate;)Ljava/security/cert/X509Certificate;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljavax/net/ssl/X509TrustManager;", "a", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "findByIssuerAndSignatureMethod", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "okhttp"}, k=1, mv={1, 8, 0})
    public static final class b
    implements e {
        @NotNull
        private final X509TrustManager a;
        @NotNull
        private final Method b;

        public b(@NotNull X509TrustManager x509TrustManager, @NotNull Method method) {
            y.j((Object)x509TrustManager, (String)"trustManager");
            y.j((Object)method, (String)"findByIssuerAndSignatureMethod");
            this.a = x509TrustManager;
            this.b = method;
        }

        public boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof b)) {
                return false;
            }
            object = (b)object;
            if (!y.e((Object)this.a, (Object)((b)object).a)) {
                return false;
            }
            return y.e((Object)this.b, (Object)((b)object).b);
        }

        @Nullable
        public X509Certificate findByIssuerAndSignature(@NotNull X509Certificate object) {
            IllegalAccessException illegalAccessException2;
            block3: {
                y.j((Object)object, (String)"cert");
                try {
                    object = this.b.invoke((Object)this.a, object);
                    y.h((Object)object, (String)"null cannot be cast to non-null type java.security.cert.TrustAnchor");
                    object = ((TrustAnchor)object).getTrustedCert();
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block3;
                }
                catch (InvocationTargetException invocationTargetException) {
                    object = null;
                }
                return object;
            }
            throw new AssertionError("unable to get issues and signature", illegalAccessException2);
        }

        public int hashCode() {
            return this.a.hashCode() * 31 + this.b.hashCode();
        }

        @NotNull
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CustomTrustRootIndex(trustManager=");
            stringBuilder.append(this.a);
            stringBuilder.append(", findByIssuerAndSignatureMethod=");
            stringBuilder.append(this.b);
            stringBuilder.append(')');
            return stringBuilder.toString();
        }
    }
}

