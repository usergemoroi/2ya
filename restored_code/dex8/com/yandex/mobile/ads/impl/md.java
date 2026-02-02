/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.security.NetworkSecurityPolicy
 *  androidx.media3.common.util.l
 *  com.yandex.mobile.ads.impl.jd$a
 *  com.yandex.mobile.ads.impl.lp
 *  com.yandex.mobile.ads.impl.lp$a
 *  com.yandex.mobile.ads.impl.n12
 *  com.yandex.mobile.ads.impl.o22$a
 *  com.yandex.mobile.ads.impl.pn
 *  com.yandex.mobile.ads.impl.qd$a
 *  com.yandex.mobile.ads.impl.qm1
 *  com.yandex.mobile.ads.impl.r72
 *  com.yandex.mobile.ads.impl.rh1
 *  com.yandex.mobile.ads.impl.rh1$a
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import androidx.media3.common.util.l;
import com.yandex.mobile.ads.impl.gk;
import com.yandex.mobile.ads.impl.jd;
import com.yandex.mobile.ads.impl.lp;
import com.yandex.mobile.ads.impl.n12;
import com.yandex.mobile.ads.impl.o22;
import com.yandex.mobile.ads.impl.p00;
import com.yandex.mobile.ads.impl.pn;
import com.yandex.mobile.ads.impl.qd;
import com.yandex.mobile.ads.impl.qm1;
import com.yandex.mobile.ads.impl.r72;
import com.yandex.mobile.ads.impl.rh1;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class md
extends rh1 {
    private static final boolean f;
    public static final int g = 0;
    @NotNull
    private final ArrayList d;
    @NotNull
    private final lp e;

    static {
        boolean bl2 = rh1.a.b() && Build.VERSION.SDK_INT < 30;
        f = bl2;
    }

    public md() {
        List<Object> list2 = t.r((Object[])new n12[]{o22.a.a(), new p00(qd.a.a())});
        ArrayList<List> arrayList = new ArrayList<List>();
        for (List<Object> list2 : list2) {
            if (!((n12)list2).a()) continue;
            arrayList.add(list2);
        }
        this.d = arrayList;
        this.e = lp.a.a();
    }

    public static final /* synthetic */ boolean d() {
        return f;
    }

    @NotNull
    public final pn a(@NotNull X509TrustManager object) {
        jd jd3 = jd.a.a((X509TrustManager)object);
        object = jd3 != null ? jd3 : new gk(this.b((X509TrustManager)object));
        return object;
    }

    public final void a(@Nullable Object object, @NotNull String string2) {
        if (!this.e.a(object)) {
            rh1.a((int)5, (String)string2, null);
        }
    }

    public final void a(@NotNull Socket socket, @NotNull InetSocketAddress inetSocketAddress, int n10) throws IOException {
        try {
            socket.connect(inetSocketAddress, n10);
            return;
        }
        catch (ClassCastException classCastException) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", classCastException);
            }
            throw classCastException;
        }
    }

    public final void a(@NotNull SSLSocket sSLSocket, @Nullable String string2, @NotNull List<qm1> list) {
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

    public final boolean a(@NotNull String string2) {
        boolean bl2 = Build.VERSION.SDK_INT >= 24 ? l.a((NetworkSecurityPolicy)NetworkSecurityPolicy.getInstance(), (String)string2) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
        return bl2;
    }

    @NotNull
    public final r72 b(@NotNull X509TrustManager object) {
        try {
            Method method = object.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            ((AccessibleObject)method).setAccessible(true);
            a a13 = new a((X509TrustManager)object, method);
            object = a13;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            object = super.b((X509TrustManager)object);
        }
        return object;
    }

    @Nullable
    public final Object b() {
        return this.e.a();
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

    public static final class a
    implements r72 {
        @NotNull
        private final X509TrustManager a;
        @NotNull
        private final Method b;

        public a(@NotNull X509TrustManager x509TrustManager, @NotNull Method method) {
            this.a = x509TrustManager;
            this.b = method;
        }

        @Nullable
        public final X509Certificate a(@NotNull X509Certificate object) {
            IllegalAccessException illegalAccessException2;
            block3: {
                try {
                    object = this.b.invoke((Object)this.a, object);
                    y.h(object, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                    object = ((TrustAnchor)object).getTrustedCert();
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block3;
                }
                catch (InvocationTargetException invocationTargetException) {
                    object = null;
                }
                return object;
            }
            throw new AssertionError("unable to get issues and signature", illegalAccessException2);
        }

        public final boolean equals(@Nullable Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof a)) {
                return false;
            }
            object = (a)object;
            if (!y.e(this.a, ((a)object).a)) {
                return false;
            }
            return y.e(this.b, ((a)object).b);
        }

        public final int hashCode() {
            int n10 = this.a.hashCode();
            return this.b.hashCode() + n10 * 31;
        }

        @NotNull
        public final String toString() {
            X509TrustManager x509TrustManager = this.a;
            Method method = this.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CustomTrustRootIndex(trustManager=");
            stringBuilder.append(x509TrustManager);
            stringBuilder.append(", findByIssuerAndSignatureMethod=");
            stringBuilder.append(method);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }
}

