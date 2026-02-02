/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.p
 *  kotlin.jvm.internal.y
 *  okhttp3.a0
 *  okhttp3.internal.platform.g$a
 *  okhttp3.internal.platform.h
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.openjsse.javax.net.ssl.SSLParameters
 *  org.openjsse.javax.net.ssl.SSLSocket
 *  org.openjsse.net.ssl.OpenJSSE
 */
package okhttp3.internal.platform;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.y;
import okhttp3.a0;
import okhttp3.internal.platform.g;
import okhttp3.internal.platform.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.openjsse.javax.net.ssl.SSLSocket;
import org.openjsse.net.ssl.OpenJSSE;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u001bB\t\b\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0011\u0010\u000f\u001a\r\u0012\t\u0012\u00070\r\u00a2\u0006\u0002\b\u000e0\fH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001c"}, d2={"Lokhttp3/internal/platform/g;", "Lokhttp3/internal/platform/h;", "Ljavax/net/ssl/SSLContext;", "n", "()Ljavax/net/ssl/SSLContext;", "Ljavax/net/ssl/X509TrustManager;", "p", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/a0;", "Lkotlin/jvm/JvmSuppressWildcards;", "protocols", "Lkotlin/k0;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/security/Provider;", "d", "Ljava/security/Provider;", "provider", "<init>", "()V", "a", "okhttp"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nOpenJSSEPlatform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenJSSEPlatform.kt\nokhttp3/internal/platform/OpenJSSEPlatform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,101:1\n37#2,2:102\n*S KotlinDebug\n*F\n+ 1 OpenJSSEPlatform.kt\nokhttp3/internal/platform/OpenJSSEPlatform\n*L\n68#1:102,2\n*E\n"})
public final class g
extends h {
    @NotNull
    public static final a e;
    private static final boolean f;
    @NotNull
    private final Provider d = (Provider)new OpenJSSE();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        a a4;
        e = a4 = new /* Unavailable Anonymous Inner Class!! */;
        boolean bl = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, a4.getClass().getClassLoader());
            bl = true;
        }
        catch (ClassNotFoundException classNotFoundException) {}
        f = bl;
    }

    private g() {
    }

    public /* synthetic */ g(p p4) {
        this();
    }

    public static final /* synthetic */ boolean q() {
        return f;
    }

    public void e(@NotNull javax.net.ssl.SSLSocket sSLSocket, @Nullable String object, @NotNull List<a0> list) {
        y.j((Object)sSLSocket, (String)"sslSocket");
        y.j(list, (String)"protocols");
        if (sSLSocket instanceof SSLSocket) {
            object = (sSLSocket = (SSLSocket)sSLSocket).getSSLParameters();
            if (object instanceof org.openjsse.javax.net.ssl.SSLParameters) {
                list = h.a.b(list);
                ((org.openjsse.javax.net.ssl.SSLParameters)object).setApplicationProtocols(((Collection)list).toArray(new String[0]));
                sSLSocket.setSSLParameters((SSLParameters)object);
            }
        } else {
            super.e(sSLSocket, (String)object, list);
        }
    }

    @Nullable
    public String h(@NotNull javax.net.ssl.SSLSocket object) {
        block4: {
            block2: {
                block3: {
                    y.j((Object)object, (String)"sslSocket");
                    if (!(object instanceof SSLSocket)) break block2;
                    String string = ((SSLSocket)object).getApplicationProtocol();
                    if (string == null) break block3;
                    object = string;
                    if (!y.e((Object)string, (Object)"")) break block4;
                }
                object = null;
                break block4;
            }
            object = super.h((javax.net.ssl.SSLSocket)object);
        }
        return object;
    }

    @NotNull
    public SSLContext n() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.d);
        y.i((Object)sSLContext, (String)"getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @NotNull
    public X509TrustManager p() {
        Object object;
        Object object2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.d);
        object2.init((KeyStore)null);
        object2 = object2.getTrustManagers();
        y.g((Object)object2);
        if (((TrustManager[])object2).length == 1 && (object = object2[0]) instanceof X509TrustManager) {
            y.h((Object)object, (String)"null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager)object;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Unexpected default trust managers: ");
        object2 = Arrays.toString(object2);
        y.i((Object)object2, (String)"toString(this)");
        ((StringBuilder)object).append((String)object2);
        throw new IllegalStateException(((StringBuilder)object).toString().toString());
    }
}

