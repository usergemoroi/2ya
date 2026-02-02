/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.os.Build$VERSION
 *  android.security.NetworkSecurityPolicy
 *  androidx.media3.common.util.l
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okhttp3.a0
 *  okhttp3.internal.SuppressSignatureCheck
 *  okhttp3.internal.platform.a$a
 *  okhttp3.internal.platform.android.k
 *  okhttp3.internal.platform.h
 *  okhttp3.internal.tls.c
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.platform;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import androidx.media3.common.util.l;
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
import okhttp3.internal.platform.a;
import okhttp3.internal.platform.android.b;
import okhttp3.internal.platform.android.f;
import okhttp3.internal.platform.android.g;
import okhttp3.internal.platform.android.i;
import okhttp3.internal.platform.android.j;
import okhttp3.internal.platform.android.k;
import okhttp3.internal.platform.h;
import okhttp3.internal.tls.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u001cB\u0007\u00a2\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001d"}, d2={"Lokhttp3/internal/platform/a;", "Lokhttp3/internal/platform/h;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/a0;", "protocols", "Lkotlin/k0;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "", "j", "(Ljava/lang/String;)Z", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lokhttp3/internal/tls/c;", "c", "(Ljavax/net/ssl/X509TrustManager;)Lokhttp3/internal/tls/c;", "Lokhttp3/internal/platform/android/k;", "d", "Ljava/util/List;", "socketAdapters", "<init>", "()V", "a", "okhttp"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nAndroid10Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Android10Platform.kt\nokhttp3/internal/platform/Android10Platform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n766#2:73\n857#2,2:74\n1#3:76\n*S KotlinDebug\n*F\n+ 1 Android10Platform.kt\nokhttp3/internal/platform/Android10Platform\n*L\n43#1:73\n43#1:74,2\n*E\n"})
@SuppressSignatureCheck
public final class a
extends h {
    @NotNull
    public static final a e = new /* Unavailable Anonymous Inner Class!! */;
    private static final boolean f;
    @NotNull
    private final List<k> d;

    static {
        boolean bl = h.a.h() && Build.VERSION.SDK_INT >= 29;
        f = bl;
    }

    public a() {
        Iterable iterable2 = t.r(new k[]{okhttp3.internal.platform.android.a.a.a(), new j(okhttp3.internal.platform.android.f.f.d()), new j(i.a.a()), new j(g.a.a())});
        ArrayList<k> arrayList = new ArrayList<k>();
        for (Iterable iterable2 : iterable2) {
            if (!((k)iterable2).isSupported()) continue;
            arrayList.add((k)iterable2);
        }
        this.d = arrayList;
    }

    public static final /* synthetic */ boolean q() {
        return f;
    }

    @NotNull
    public c c(@NotNull X509TrustManager object) {
        y.j((Object)object, (String)"trustManager");
        b b4 = b.d.a(object);
        object = b4 != null ? b4 : super.c(object);
        return object;
    }

    public void e(@NotNull SSLSocket sSLSocket, @Nullable String string, @NotNull List<? extends a0> list) {
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

    @SuppressLint(value={"NewApi"})
    public boolean j(@NotNull String string) {
        y.j((Object)string, (String)"hostname");
        return l.a((NetworkSecurityPolicy)NetworkSecurityPolicy.getInstance(), (String)string);
    }
}

