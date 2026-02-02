/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  okhttp3.a0
 *  okhttp3.internal.platform.android.j$a
 *  okhttp3.internal.platform.android.k
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.platform.android;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import okhttp3.a0;
import okhttp3.internal.platform.android.j;
import okhttp3.internal.platform.android.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0004B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001d"}, d2={"Lokhttp3/internal/platform/android/j;", "Lokhttp3/internal/platform/android/k;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "a", "(Ljavax/net/ssl/SSLSocket;)Lokhttp3/internal/platform/android/k;", "", "isSupported", "()Z", "matchesSocket", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "Lokhttp3/a0;", "protocols", "Lkotlin/k0;", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Lokhttp3/internal/platform/android/j$a;", "Lokhttp3/internal/platform/android/j$a;", "socketAdapterFactory", "b", "Lokhttp3/internal/platform/android/k;", "delegate", "<init>", "(Lokhttp3/internal/platform/android/j$a;)V", "okhttp"}, k=1, mv={1, 8, 0})
public final class j
implements k {
    @NotNull
    private final a a;
    @Nullable
    private k b;

    public j(@NotNull a a4) {
        y.j((Object)a4, (String)"socketAdapterFactory");
        this.a = a4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final k a(SSLSocket sSLSocket) {
        synchronized (this) {
            try {
                if (this.b != null) return this.b;
                if (!this.a.matchesSocket(sSLSocket)) return this.b;
                this.b = this.a.create(sSLSocket);
                return this.b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void configureTlsExtensions(@NotNull SSLSocket sSLSocket, @Nullable String string, @NotNull List<? extends a0> list) {
        y.j((Object)sSLSocket, (String)"sslSocket");
        y.j(list, (String)"protocols");
        k k4 = this.a(sSLSocket);
        if (k4 != null) {
            k4.configureTlsExtensions(sSLSocket, string, list);
        }
    }

    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket object) {
        y.j((Object)object, (String)"sslSocket");
        k k4 = this.a((SSLSocket)object);
        object = k4 != null ? k4.getSelectedProtocol((SSLSocket)object) : null;
        return object;
    }

    public boolean isSupported() {
        return true;
    }

    public boolean matchesSocket(@NotNull SSLSocket sSLSocket) {
        y.j((Object)sSLSocket, (String)"sslSocket");
        return this.a.matchesSocket(sSLSocket);
    }
}

