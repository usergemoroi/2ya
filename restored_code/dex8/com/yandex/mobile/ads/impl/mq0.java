/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.applovin.shadow.okhttp3.internal.platform.a
 *  com.applovin.shadow.okhttp3.internal.platform.b
 *  com.yandex.mobile.ads.impl.qm1
 *  com.yandex.mobile.ads.impl.rh1
 *  kotlin.collections.t
 *  kotlin.text.p
 */
package com.yandex.mobile.ads.impl;

import com.applovin.shadow.okhttp3.internal.platform.a;
import com.applovin.shadow.okhttp3.internal.platform.b;
import com.yandex.mobile.ads.impl.qm1;
import com.yandex.mobile.ads.impl.rh1;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class mq0
extends rh1 {
    private static final boolean d;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        boolean bl2;
        block3: {
            block4: {
                block2: {
                    Object object = System.getProperty("java.specification.version");
                    object = object != null ? p.m((String)object) : null;
                    bl2 = false;
                    if (object == null) break block2;
                    if ((Integer)object < 9) break block3;
                    break block4;
                }
                try {
                    SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                }
                catch (NoSuchMethodException noSuchMethodException) {}
            }
            bl2 = true;
        }
        d = bl2;
    }

    public static final /* synthetic */ boolean d() {
        return d;
    }

    public final void a(@NotNull SSLSocket sSLSocket, @Nullable String object, @NotNull List<qm1> list2) {
        object = sSLSocket.getSSLParameters();
        Object object2 = new ArrayList();
        for (Object t13 : list2) {
            if ((qm1)t13 == qm1.d) continue;
            ((ArrayList)object2).add(t13);
        }
        ArrayList<String> arrayList = new ArrayList<String>(t.x(object2, (int)10));
        object2 = ((ArrayList)object2).iterator();
        while (object2.hasNext()) {
            arrayList.add(((qm1)object2.next()).toString());
        }
        b.a((SSLParameters)object, (String[])arrayList.toArray(new String[0]));
        sSLSocket.setSSLParameters((SSLParameters)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public final String b(@NotNull SSLSocket object) {
        Object var3_3;
        block3: {
            var3_3 = null;
            try {
                object = a.a((SSLSocket)object);
                if (object != null) break block3;
                return var3_3;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
                return var3_3;
            }
        }
        boolean bl2 = y.e(object, "");
        if (!bl2) return object;
        return var3_3;
    }
}

