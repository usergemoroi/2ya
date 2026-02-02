/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  com.applovin.shadow.okhttp3.internal.platform.a
 *  com.applovin.shadow.okhttp3.internal.platform.android.a
 *  com.applovin.shadow.okhttp3.internal.platform.android.b
 *  com.applovin.shadow.okhttp3.internal.platform.b
 *  com.yandex.mobile.ads.impl.id$a
 *  com.yandex.mobile.ads.impl.n12
 *  com.yandex.mobile.ads.impl.qm1
 *  com.yandex.mobile.ads.impl.rh1
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import com.applovin.shadow.okhttp3.internal.platform.android.b;
import com.yandex.mobile.ads.impl.id;
import com.yandex.mobile.ads.impl.n12;
import com.yandex.mobile.ads.impl.qm1;
import com.yandex.mobile.ads.impl.rh1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Exception performing whole class analysis ignored.
 */
@SuppressLint(value={"NewApi"})
public final class id
implements n12 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"NewApi"})
    public final void a(@NotNull SSLSocket sSLSocket, @Nullable String object, @NotNull List<? extends qm1> arrayList2) {
        Object object2;
        try {
            com.applovin.shadow.okhttp3.internal.platform.android.a.a((SSLSocket)sSLSocket, (boolean)true);
            object = sSLSocket.getSSLParameters();
            int n10 = rh1.c;
            object2 = new ArrayList();
            for (ArrayList<Object> arrayList2 : arrayList2) {
                if ((qm1)arrayList2 == qm1.d) continue;
                ((ArrayList)object2).add(arrayList2);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException("Android internal error", illegalArgumentException);
        }
        arrayList2 = new ArrayList<Object>(t.x(object2, (int)10));
        object2 = ((ArrayList)object2).iterator();
        while (true) {
            if (!object2.hasNext()) {
                com.applovin.shadow.okhttp3.internal.platform.b.a((SSLParameters)object, (String[])arrayList2.toArray(new String[0]));
                sSLSocket.setSSLParameters((SSLParameters)object);
                return;
            }
            arrayList2.add(((qm1)object2.next()).toString());
        }
    }

    public final boolean a() {
        return a.b();
    }

    public final boolean a(@NotNull SSLSocket sSLSocket) {
        return b.a((SSLSocket)sSLSocket);
    }

    @SuppressLint(value={"NewApi"})
    @Nullable
    public final String b(@NotNull SSLSocket object) {
        block3: {
            block2: {
                String string2 = com.applovin.shadow.okhttp3.internal.platform.a.a((SSLSocket)object);
                if (string2 == null) break block2;
                object = string2;
                if (!y.e(string2, "")) break block3;
            }
            object = null;
        }
        return object;
    }
}

