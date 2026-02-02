/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.applovin.shadow.okhttp3.internal.platform.a
 *  com.applovin.shadow.okhttp3.internal.platform.b
 *  kotlin.Metadata
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.jvm.internal.y
 *  okhttp3.a0
 *  okhttp3.internal.SuppressSignatureCheck
 *  okhttp3.internal.platform.f$a
 *  okhttp3.internal.platform.h
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.platform;

import com.applovin.shadow.okhttp3.internal.platform.b;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import okhttp3.a0;
import okhttp3.internal.SuppressSignatureCheck;
import okhttp3.internal.platform.f;
import okhttp3.internal.platform.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u0007\u00a2\u0006\u0002\b\b0\u0006H\u0017\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017\u00a2\u0006\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2={"Lokhttp3/internal/platform/f;", "Lokhttp3/internal/platform/h;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/a0;", "Lkotlin/jvm/JvmSuppressWildcards;", "protocols", "Lkotlin/k0;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "<init>", "()V", "d", "a", "okhttp"}, k=1, mv={1, 8, 0})
@SourceDebugExtension(value={"SMAP\nJdk9Platform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,89:1\n37#2,2:90\n*S KotlinDebug\n*F\n+ 1 Jdk9Platform.kt\nokhttp3/internal/platform/Jdk9Platform\n*L\n36#1:90,2\n*E\n"})
public class f
extends h {
    @NotNull
    public static final a d;
    private static final boolean e;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        boolean bl;
        block5: {
            block4: {
                block3: {
                    Integer n4 = null;
                    d = new /* Unavailable Anonymous Inner Class!! */;
                    String string = System.getProperty("java.specification.version");
                    if (string != null) {
                        n4 = p.m(string);
                    }
                    bl = true;
                    if (n4 == null) break block3;
                    if (n4 < 9) break block4;
                    break block5;
                }
                try {
                    SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                }
                catch (NoSuchMethodException noSuchMethodException) {}
            }
            bl = false;
        }
        e = bl;
    }

    public static final /* synthetic */ boolean q() {
        return e;
    }

    @SuppressSignatureCheck
    public void e(@NotNull SSLSocket sSLSocket, @Nullable String object, @NotNull List<a0> list) {
        y.j((Object)sSLSocket, (String)"sslSocket");
        y.j(list, (String)"protocols");
        object = sSLSocket.getSSLParameters();
        b.a((SSLParameters)object, (String[])((Collection)h.a.b(list)).toArray(new String[0]));
        sSLSocket.setSSLParameters((SSLParameters)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @SuppressSignatureCheck
    @Nullable
    public String h(@NotNull SSLSocket object) {
        Object var3_3;
        block3: {
            y.j((Object)object, (String)"sslSocket");
            var3_3 = null;
            try {
                object = com.applovin.shadow.okhttp3.internal.platform.a.a((SSLSocket)object);
                if (object != null) break block3;
                return var3_3;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                return var3_3;
            }
        }
        boolean bl = y.e((Object)object, (Object)"");
        if (!bl) return object;
        return var3_3;
    }
}

