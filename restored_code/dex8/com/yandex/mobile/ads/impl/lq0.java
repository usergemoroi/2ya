/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.qm1
 *  com.yandex.mobile.ads.impl.rh1
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qm1;
import com.yandex.mobile.ads.impl.rh1;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lq0
extends rh1 {
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

    public lq0(@NotNull Method method, @NotNull Method method2, @NotNull Method method3, @NotNull Class<?> clazz, @NotNull Class<?> clazz2) {
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = clazz;
        this.h = clazz2;
    }

    public final void a(@NotNull SSLSocket sSLSocket) {
        IllegalAccessException illegalAccessException2;
        block3: {
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

    public final void a(@NotNull SSLSocket sSLSocket, @Nullable String object2, @NotNull List<? extends qm1> a13) {
        InvocationTargetException invocationTargetException2;
        block5: {
            Serializable serializable = new ArrayList<Object>();
            for (Object object2 : a13) {
                if ((qm1)object2 == qm1.d) continue;
                serializable.add(object2);
            }
            object2 = new ArrayList(t.x(serializable, (int)10));
            a13 = serializable.iterator();
            while (a13.hasNext()) {
                ((ArrayList)object2).add(((qm1)a13.next()).toString());
            }
            try {
                ClassLoader classLoader = rh1.class.getClassLoader();
                Class<?> clazz = this.g;
                serializable = this.h;
                a13 = new /* Unavailable Anonymous Inner Class!! */;
                object2 = Proxy.newProxyInstance(classLoader, new Class[]{clazz, serializable}, (InvocationHandler)a13);
                this.d.invoke(null, sSLSocket, object2);
                return;
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (InvocationTargetException invocationTargetException2) {
                break block5;
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
    public final String b(@NotNull SSLSocket object) {
        Object var2_5;
        try {
            Method method = this.e;
            var2_5 = null;
            object = Proxy.getInvocationHandler(method.invoke(null, object));
            y.h(object, "null cannot be cast to non-null type com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            object = object;
            if (!object.b() && object.a() == null) {
                rh1.a((int)4, (String)"ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
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

