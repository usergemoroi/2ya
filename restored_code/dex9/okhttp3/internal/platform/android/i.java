/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okhttp3.a0
 *  okhttp3.internal.platform.android.i$b
 *  okhttp3.internal.platform.android.j$a
 *  okhttp3.internal.platform.android.k
 *  okhttp3.internal.platform.h
 *  org.conscrypt.Conscrypt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.platform.android;

import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import okhttp3.a0;
import okhttp3.internal.platform.android.i;
import okhttp3.internal.platform.android.j;
import okhttp3.internal.platform.android.k;
import okhttp3.internal.platform.d;
import okhttp3.internal.platform.h;
import org.conscrypt.Conscrypt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2={"Lokhttp3/internal/platform/android/i;", "Lokhttp3/internal/platform/android/k;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "matchesSocket", "(Ljavax/net/ssl/SSLSocket;)Z", "isSupported", "()Z", "", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "hostname", "", "Lokhttp3/a0;", "protocols", "Lkotlin/k0;", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "<init>", "()V", "a", "b", "okhttp"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nConscryptSocketAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConscryptSocketAdapter.kt\nokhttp3/internal/platform/android/ConscryptSocketAdapter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,64:1\n37#2,2:65\n*S KotlinDebug\n*F\n+ 1 ConscryptSocketAdapter.kt\nokhttp3/internal/platform/android/ConscryptSocketAdapter\n*L\n51#1:65,2\n*E\n"})
public final class i
implements k {
    @NotNull
    public static final b a = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private static final j.a b = new j.a(){

        @NotNull
        public k create(@NotNull SSLSocket sSLSocket) {
            y.j((Object)sSLSocket, (String)"sslSocket");
            return new i();
        }

        public boolean matchesSocket(@NotNull SSLSocket sSLSocket) {
            y.j((Object)sSLSocket, (String)"sslSocket");
            boolean bl = d.e.c() && Conscrypt.isConscrypt((SSLSocket)sSLSocket);
            return bl;
        }
    };

    public static final /* synthetic */ j.a a() {
        return b;
    }

    public void configureTlsExtensions(@NotNull SSLSocket sSLSocket, @Nullable String string, @NotNull List<? extends a0> list) {
        y.j((Object)sSLSocket, (String)"sslSocket");
        y.j(list, (String)"protocols");
        if (this.matchesSocket(sSLSocket)) {
            Conscrypt.setUseSessionTickets((SSLSocket)sSLSocket, (boolean)true);
            Conscrypt.setApplicationProtocols((SSLSocket)sSLSocket, (String[])((Collection)h.a.b(list)).toArray(new String[0]));
        }
    }

    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket object) {
        y.j((Object)object, (String)"sslSocket");
        object = this.matchesSocket((SSLSocket)object) ? Conscrypt.getApplicationProtocol((SSLSocket)object) : null;
        return object;
    }

    public boolean isSupported() {
        return d.e.c();
    }

    public boolean matchesSocket(@NotNull SSLSocket sSLSocket) {
        y.j((Object)sSLSocket, (String)"sslSocket");
        return Conscrypt.isConscrypt((SSLSocket)sSLSocket);
    }
}

