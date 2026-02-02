/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.n12
 *  com.yandex.mobile.ads.impl.qm1
 *  com.yandex.mobile.ads.impl.rh1
 *  com.yandex.mobile.ads.impl.rh1$a
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.md;
import com.yandex.mobile.ads.impl.n12;
import com.yandex.mobile.ads.impl.pd;
import com.yandex.mobile.ads.impl.qm1;
import com.yandex.mobile.ads.impl.rh1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class qd
implements n12 {
    @NotNull
    private static final pd f = new pd();
    @NotNull
    private final Class<? super SSLSocket> a;
    @NotNull
    private final Method b;
    private final Method c;
    private final Method d;
    private final Method e;

    public qd(@NotNull Class<? super SSLSocket> clazz) {
        this.a = clazz;
        this.b = clazz.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        this.c = clazz.getMethod("setHostname", String.class);
        this.d = clazz.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.e = clazz.getMethod("setAlpnProtocols", byte[].class);
    }

    public static final /* synthetic */ pd b() {
        return f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(@NotNull SSLSocket sSLSocket, @Nullable String object, @NotNull List<? extends qm1> list) {
        if (!this.a.isInstance(sSLSocket)) return;
        try {
            this.b.invoke((Object)sSLSocket, Boolean.TRUE);
            if (object != null) {
                this.c.invoke((Object)sSLSocket, object);
            }
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new AssertionError((Object)invocationTargetException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new AssertionError((Object)illegalAccessException);
        }
        object = this.e;
        int n10 = rh1.c;
        ((Method)object).invoke((Object)sSLSocket, new Object[]{rh1.a.a(list)});
    }

    public final boolean a() {
        return md.d();
    }

    public final boolean a(@NotNull SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Nullable
    public final String b(@NotNull SSLSocket object) {
        NullPointerException nullPointerException2;
        block13: {
            block9: {
                Object var3_6;
                block12: {
                    IllegalAccessException illegalAccessException2;
                    block11: {
                        boolean bl2 = this.a.isInstance(object);
                        var3_6 = null;
                        if (!bl2) {
                            return null;
                        }
                        byte[] byArray = (byte[])this.d.invoke(object, new Object[0]);
                        object = var3_6;
                        if (byArray == null) break block9;
                        try {
                            object = new String(byArray, StandardCharsets.UTF_8);
                            break block9;
                        }
                        catch (InvocationTargetException invocationTargetException) {
                        }
                        catch (IllegalAccessException illegalAccessException2) {
                            break block11;
                        }
                        catch (NullPointerException nullPointerException2) {
                            break block12;
                        }
                        throw new AssertionError((Object)invocationTargetException);
                    }
                    throw new AssertionError((Object)illegalAccessException2);
                }
                if (!y.e(((Throwable)nullPointerException2).getMessage(), "ssl == null")) break block13;
                object = var3_6;
            }
            return object;
        }
        throw nullPointerException2;
    }
}

