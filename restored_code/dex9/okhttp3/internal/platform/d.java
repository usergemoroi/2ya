/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  okhttp3.a0
 *  okhttp3.internal.platform.d$a
 *  okhttp3.internal.platform.d$b
 *  okhttp3.internal.platform.h
 *  org.conscrypt.Conscrypt
 *  org.conscrypt.ConscryptHostnameVerifier
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.platform;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import okhttp3.a0;
import okhttp3.internal.platform.d;
import okhttp3.internal.platform.h;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u001f B\t\b\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0011\u0010\u000f\u001a\r\u0012\t\u0012\u00070\r\u00a2\u0006\u0002\b\u000e0\fH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u00a8\u0006!"}, d2={"Lokhttp3/internal/platform/d;", "Lokhttp3/internal/platform/h;", "Ljavax/net/ssl/SSLContext;", "n", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "p", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/a0;", "Lkotlin/jvm/JvmSuppressWildcards;", "protocols", "Lkotlin/k0;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "trustManager", "Ljavax/net/ssl/SSLSocketFactory;", "o", "(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "Ljava/security/Provider;", "d", "Ljava/security/Provider;", "provider", "<init>", "()V", "a", "b", "okhttp"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nConscryptPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConscryptPlatform.kt\nokhttp3/internal/platform/ConscryptPlatform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,141:1\n37#2,2:142\n*S KotlinDebug\n*F\n+ 1 ConscryptPlatform.kt\nokhttp3/internal/platform/ConscryptPlatform\n*L\n89#1:142,2\n*E\n"})
public final class d
extends h {
    @NotNull
    public static final a e;
    private static final boolean f;
    @NotNull
    private final Provider d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        boolean bl;
        block3: {
            a a4;
            e = a4 = new /* Unavailable Anonymous Inner Class!! */;
            boolean bl2 = false;
            try {
                Class.forName("org.conscrypt.Conscrypt$Version", false, a4.getClass().getClassLoader());
                bl = bl2;
                if (!Conscrypt.isAvailable()) break block3;
                boolean bl3 = a4.a(2, 1, 0);
                bl = bl2;
                if (bl3) {
                    bl = true;
                }
            }
            catch (ClassNotFoundException | NoClassDefFoundError throwable) {
                bl = bl2;
            }
        }
        f = bl;
    }

    private d() {
        Provider provider = Conscrypt.newProvider();
        y.i((Object)provider, (String)"newProvider()");
        this.d = provider;
    }

    public /* synthetic */ d(p p4) {
        this();
    }

    public static final /* synthetic */ boolean q() {
        return f;
    }

    public void e(@NotNull SSLSocket sSLSocket, @Nullable String string, @NotNull List<a0> list) {
        y.j((Object)sSLSocket, (String)"sslSocket");
        y.j(list, (String)"protocols");
        if (Conscrypt.isConscrypt((SSLSocket)sSLSocket)) {
            Conscrypt.setUseSessionTickets((SSLSocket)sSLSocket, (boolean)true);
            Conscrypt.setApplicationProtocols((SSLSocket)sSLSocket, (String[])((Collection)h.a.b(list)).toArray(new String[0]));
        } else {
            super.e(sSLSocket, string, list);
        }
    }

    @Nullable
    public String h(@NotNull SSLSocket object) {
        y.j((Object)object, (String)"sslSocket");
        object = Conscrypt.isConscrypt((SSLSocket)object) ? Conscrypt.getApplicationProtocol((SSLSocket)object) : super.h((SSLSocket)object);
        return object;
    }

    @NotNull
    public SSLContext n() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.d);
        y.i((Object)sSLContext, (String)"getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @NotNull
    public SSLSocketFactory o(@NotNull X509TrustManager object) {
        y.j((Object)object, (String)"trustManager");
        SSLContext sSLContext = this.n();
        sSLContext.init(null, new TrustManager[]{object}, null);
        object = sSLContext.getSocketFactory();
        y.i((Object)object, (String)"newSSLContext().apply {\n\u2026null)\n    }.socketFactory");
        return object;
    }

    @NotNull
    public X509TrustManager p() {
        Object object;
        Object object2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        object2.init((KeyStore)null);
        object2 = object2.getTrustManagers();
        y.g((Object)object2);
        if (((TrustManager[])object2).length == 1 && (object = object2[0]) instanceof X509TrustManager) {
            y.h((Object)object, (String)"null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            object2 = (X509TrustManager)object;
            Conscrypt.setHostnameVerifier((TrustManager)object2, (ConscryptHostnameVerifier)((ConscryptHostnameVerifier)b.a));
            return object2;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unexpected default trust managers: ");
        object2 = Arrays.toString(object2);
        y.i((Object)object2, (String)"toString(this)");
        ((StringBuilder)object).append((String)object2);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }
}

