/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.os.Build$VERSION
 *  android.security.NetworkSecurityPolicy
 *  androidx.media3.common.util.l
 *  com.yandex.mobile.ads.impl.id$a
 *  com.yandex.mobile.ads.impl.jd$a
 *  com.yandex.mobile.ads.impl.n12
 *  com.yandex.mobile.ads.impl.pn
 *  com.yandex.mobile.ads.impl.qd$a
 *  com.yandex.mobile.ads.impl.qm1
 *  com.yandex.mobile.ads.impl.rh1
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import androidx.media3.common.util.l;
import com.yandex.mobile.ads.impl.gk;
import com.yandex.mobile.ads.impl.id;
import com.yandex.mobile.ads.impl.jd;
import com.yandex.mobile.ads.impl.n12;
import com.yandex.mobile.ads.impl.p00;
import com.yandex.mobile.ads.impl.pn;
import com.yandex.mobile.ads.impl.qd;
import com.yandex.mobile.ads.impl.qm1;
import com.yandex.mobile.ads.impl.rh1;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class hd
extends rh1 {
    private static final boolean e;
    @NotNull
    private final ArrayList d;

    static {
        boolean bl2 = y.e("Dalvik", System.getProperty("java.vm.name")) && Build.VERSION.SDK_INT >= 29;
        e = bl2;
    }

    public hd() {
        List<Object> list2 = t.r((Object[])new n12[]{id.a.a(), new p00(qd.a.a())});
        ArrayList<List> arrayList = new ArrayList<List>();
        for (List<Object> list2 : list2) {
            if (!((n12)list2).a()) continue;
            arrayList.add(list2);
        }
        this.d = arrayList;
    }

    public static final /* synthetic */ boolean d() {
        return e;
    }

    @NotNull
    public final pn a(@NotNull X509TrustManager object) {
        jd jd3 = jd.a.a((X509TrustManager)object);
        object = jd3 != null ? jd3 : new gk(this.b((X509TrustManager)object));
        return object;
    }

    public final void a(@NotNull SSLSocket sSLSocket, @Nullable String string2, @NotNull List<? extends qm1> list) {
        n12 n1222;
        block2: {
            for (n12 n1222 : this.d) {
                if (!((n12)n1222).a(sSLSocket)) continue;
                break block2;
            }
            n1222 = null;
        }
        n1222 = n1222;
        if (n1222 != null) {
            n1222.a(sSLSocket, string2, list);
        }
    }

    @SuppressLint(value={"NewApi"})
    public final boolean a(@NotNull String string2) {
        return l.a((NetworkSecurityPolicy)NetworkSecurityPolicy.getInstance(), (String)string2);
    }

    @Nullable
    public final String b(@NotNull SSLSocket sSLSocket) {
        String string2;
        String string3;
        n12 n122;
        block3: {
            block2: {
                n122 = this.d.iterator();
                do {
                    boolean bl2 = n122.hasNext();
                    string2 = null;
                    if (!bl2) break block2;
                } while (!((n12)(string3 = (String)n122.next())).a(sSLSocket));
                break block3;
            }
            string3 = null;
        }
        n122 = (n12)string3;
        string3 = string2;
        if (n122 != null) {
            string3 = n122.b(sSLSocket);
        }
        return string3;
    }
}

