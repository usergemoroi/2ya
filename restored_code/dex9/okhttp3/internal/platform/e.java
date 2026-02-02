/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.y
 *  okhttp3.a0
 *  okhttp3.internal.platform.e$b
 *  okhttp3.internal.platform.h
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package okhttp3.internal.platform;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.y;
import okhttp3.a0;
import okhttp3.internal.platform.e;
import okhttp3.internal.platform.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\fB7\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0017\u0012\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0017\u00a2\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u0019\u00a8\u0006 "}, d2={"Lokhttp3/internal/platform/e;", "Lokhttp3/internal/platform/h;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/a0;", "protocols", "Lkotlin/k0;", "e", "(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V", "b", "(Ljavax/net/ssl/SSLSocket;)V", "h", "(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;", "Ljava/lang/reflect/Method;", "d", "Ljava/lang/reflect/Method;", "putMethod", "getMethod", "f", "removeMethod", "Ljava/lang/Class;", "g", "Ljava/lang/Class;", "clientProviderClass", "serverProviderClass", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "i", "a", "okhttp"}, k=1, mv={1, 8, 0})
public final class e
extends h {
    @NotNull
    public static final b i = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private final Method d;
    @NotNull
    private final Method e;
    @NotNull
    private final Method f;
    @NotNull
    private final Class<?> g;
    @NotNull
    private final Class<?> h;

    public e(@NotNull Method method, @NotNull Method method2, @NotNull Method method3, @NotNull Class<?> clazz, @NotNull Class<?> clazz2) {
        y.j((Object)method, (String)"putMethod");
        y.j((Object)method2, (String)"getMethod");
        y.j((Object)method3, (String)"removeMethod");
        y.j(clazz, (String)"clientProviderClass");
        y.j(clazz2, (String)"serverProviderClass");
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = clazz;
        this.h = clazz2;
    }

    public void b(@NotNull SSLSocket sSLSocket) {
        IllegalAccessException illegalAccessException2;
        block3: {
            y.j((Object)sSLSocket, (String)"sslSocket");
            try {
                this.f.invoke(null, sSLSocket);
                return;
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (IllegalAccessException illegalAccessException2) {
                break block3;
            }
            throw new AssertionError("failed to remove ALPN", invocationTargetException);
        }
        throw new AssertionError("failed to remove ALPN", illegalAccessException2);
    }

    public void e(@NotNull SSLSocket sSLSocket, @Nullable String object, @NotNull List<? extends a0> object2) {
        InvocationTargetException invocationTargetException2;
        block3: {
            y.j((Object)sSLSocket, (String)"sslSocket");
            y.j(object2, (String)"protocols");
            List list = okhttp3.internal.platform.h.a.b(object2);
            try {
                object2 = h.class.getClassLoader();
                Class<?> clazz = this.g;
                Class<?> clazz2 = this.h;
                object = new /* Unavailable Anonymous Inner Class!! */;
                object = Proxy.newProxyInstance((ClassLoader)object2, new Class[]{clazz, clazz2}, (InvocationHandler)object);
                this.d.invoke(null, sSLSocket, object);
                return;
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (InvocationTargetException invocationTargetException2) {
                break block3;
            }
            throw new AssertionError("failed to set ALPN", illegalAccessException);
        }
        throw new AssertionError("failed to set ALPN", invocationTargetException2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public String h(@NotNull SSLSocket object) {
        Object var2_5;
        y.j((Object)object, (String)"sslSocket");
        try {
            Method method = this.e;
            var2_5 = null;
            object = Proxy.getInvocationHandler(method.invoke(null, object));
            y.h((Object)object, (String)"null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            object = object;
            if (!object.b() && object.a() == null) {
                okhttp3.internal.platform.h.l((h)this, (String)"ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (int)0, null, (int)6, null);
                return null;
            }
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError("failed to get ALPN selected protocol", illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new AssertionError("failed to get ALPN selected protocol", invocationTargetException);
        }
        if (!object.b()) return object.a();
        return var2_5;
    }
}

