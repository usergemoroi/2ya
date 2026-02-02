/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  kotlin.text.d
 *  okhttp3.a0
 *  okhttp3.internal.platform.android.f$a
 *  okhttp3.internal.platform.android.j$a
 *  okhttp3.internal.platform.android.k
 *  okhttp3.internal.platform.h
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.platform.android;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import kotlin.text.d;
import okhttp3.a0;
import okhttp3.internal.platform.android.f;
import okhttp3.internal.platform.android.j;
import okhttp3.internal.platform.android.k;
import okhttp3.internal.platform.b;
import okhttp3.internal.platform.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 $2\u00020\u0001:\u0001\u0014B\u0017\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u0013\u00a2\u0006\u0004\b\"\u0010#J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00050\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001d\u001a\n \u001b*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001f\u001a\n \u001b*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010!\u001a\n \u001b*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010\u0019\u00a8\u0006%"}, d2={"Lokhttp3/internal/platform/android/f;", "Lokhttp3/internal/platform/android/k;", "", "isSupported", "()Z", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "matchesSocket", "(Ljavax/net/ssl/SSLSocket;)Z", "", "hostname", "", "Lokhttp3/a0;", "protocols", "Lkotlin/k0;", "configureTlsExtensions", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "getSelectedProtocol", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "sslSocketClass", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "setUseSessionTickets", "kotlin.jvm.PlatformType", "c", "setHostname", "d", "getAlpnSelectedProtocol", "e", "setAlpnProtocols", "<init>", "(Ljava/lang/Class;)V", "f", "okhttp"}, k=1, mv={1, 8, 0})
public class f
implements k {
    @NotNull
    public static final a f;
    @NotNull
    private static final j.a g;
    @NotNull
    private final Class<? super SSLSocket> a;
    @NotNull
    private final Method b;
    private final Method c;
    private final Method d;
    private final Method e;

    static {
        a a4;
        f = a4 = new /* Unavailable Anonymous Inner Class!! */;
        g = a4.c("com.google.android.gms.org.conscrypt");
    }

    public f(@NotNull Class<? super SSLSocket> clazz) {
        y.j(clazz, (String)"sslSocketClass");
        this.a = clazz;
        Method method = clazz.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        y.i((Object)method, (String)"sslSocketClass.getDeclar\u2026:class.javaPrimitiveType)");
        this.b = method;
        this.c = clazz.getMethod("setHostname", String.class);
        this.d = clazz.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.e = clazz.getMethod("setAlpnProtocols", byte[].class);
    }

    public static final /* synthetic */ j.a a() {
        return g;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void configureTlsExtensions(@NotNull SSLSocket sSLSocket, @Nullable String string, @NotNull List<? extends a0> list) {
        y.j((Object)sSLSocket, (String)"sslSocket");
        y.j(list, (String)"protocols");
        if (!this.matchesSocket(sSLSocket)) return;
        try {
            this.b.invoke((Object)sSLSocket, Boolean.TRUE);
            if (string != null) {
                this.c.invoke((Object)sSLSocket, string);
            }
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new AssertionError((Object)invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError((Object)illegalAccessException);
        }
        this.e.invoke((Object)sSLSocket, new Object[]{h.a.c(list)});
    }

    @Nullable
    public String getSelectedProtocol(@NotNull SSLSocket object) {
        IllegalAccessException illegalAccessException2;
        block10: {
            InvocationTargetException invocationTargetException2;
            block11: {
                block8: {
                    y.j((Object)object, (String)"sslSocket");
                    boolean bl = this.matchesSocket((SSLSocket)object);
                    Object var3_4 = null;
                    if (!bl) {
                        return null;
                    }
                    byte[] byArray = (byte[])this.d.invoke(object, new Object[0]);
                    object = var3_4;
                    if (byArray == null) break block8;
                    try {
                        object = new String(byArray, kotlin.text.d.b);
                        break block8;
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block10;
                    }
                    object = invocationTargetException2.getCause();
                    if (!(object instanceof NullPointerException) || !y.e((Object)((Throwable)((NullPointerException)object)).getMessage(), (Object)"ssl == null")) break block11;
                    object = var3_4;
                }
                return object;
            }
            throw new AssertionError((Object)invocationTargetException2);
        }
        throw new AssertionError((Object)illegalAccessException2);
    }

    public boolean isSupported() {
        return okhttp3.internal.platform.b.f.b();
    }

    public boolean matchesSocket(@NotNull SSLSocket sSLSocket) {
        y.j((Object)sSLSocket, (String)"sslSocket");
        return this.a.isInstance(sSLSocket);
    }
}

