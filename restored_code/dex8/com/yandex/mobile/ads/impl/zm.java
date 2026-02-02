/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cr1
 *  com.yandex.mobile.ads.impl.ho1
 *  com.yandex.mobile.ads.impl.ip0
 *  com.yandex.mobile.ads.impl.kh0
 *  com.yandex.mobile.ads.impl.n92
 *  com.yandex.mobile.ads.impl.v50
 *  com.yandex.mobile.ads.impl.yq1
 *  com.yandex.mobile.ads.impl.zp1
 *  kotlin.text.p
 *  okio.f
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cr1;
import com.yandex.mobile.ads.impl.ho1;
import com.yandex.mobile.ads.impl.ip0;
import com.yandex.mobile.ads.impl.kh0;
import com.yandex.mobile.ads.impl.n92;
import com.yandex.mobile.ads.impl.v50;
import com.yandex.mobile.ads.impl.yq1;
import com.yandex.mobile.ads.impl.zp1;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import okio.f;
import okio.x;
import org.jetbrains.annotations.NotNull;

public final class zm
implements ip0 {
    private final boolean a;

    public zm(boolean bl2) {
        this.a = bl2;
    }

    @NotNull
    public final yq1 a(@NotNull ho1 object) throws IOException {
        int n10;
        int n13;
        int n14;
        y.h(object, "null cannot be cast to non-null type com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttp3.internal.http.RealInterceptorChain");
        v50 v502 = object.d();
        y.g(v502);
        zp1 zp12 = object.f();
        Object object2 = zp12.a();
        long l10 = System.currentTimeMillis();
        v502.b(zp12);
        boolean bl2 = kh0.a((String)zp12.f());
        Object var9_7 = null;
        if (bl2 && object2 != null) {
            if (p.z((String)"100-continue", (String)zp12.a("Expect"), (boolean)true)) {
                v502.d();
                object = v502.a(true);
                v502.m();
                n14 = 0;
            } else {
                n14 = 1;
                object = null;
            }
            if (object == null) {
                f f11 = x.c(v502.a(zp12));
                object2.a(f11);
                f11.close();
                object2 = object;
                n13 = n14;
            } else {
                v502.k();
                object2 = object;
                n13 = n14;
                if (!v502.e().h()) {
                    v502.j();
                    object2 = object;
                    n13 = n14;
                }
            }
        } else {
            v502.k();
            n13 = 1;
            object2 = null;
        }
        v502.c();
        object = object2;
        n14 = n13;
        if (object2 == null) {
            object2 = v502.a(false);
            y.g(object2);
            object = object2;
            n14 = n13;
            if (n13 != 0) {
                v502.m();
                n14 = 0;
                object = object2;
            }
        }
        object = object.a(zp12).a(v502.e().f()).b(l10).a(System.currentTimeMillis()).a();
        n13 = n10 = object.c();
        if (n10 == 100) {
            object = v502.a(false);
            y.g(object);
            if (n14 != 0) {
                v502.m();
            }
            object = object.a(zp12).a(v502.e().f()).b(l10).a(System.currentTimeMillis()).a();
            n13 = object.c();
        }
        v502.l();
        object = this.a && n13 == 101 ? object.j().a((cr1)n92.c).a() : object.j().a((cr1)v502.a((yq1)object)).a();
        if (p.z((String)"close", (String)object.n().a("Connection"), (boolean)true) || p.z((String)"close", (String)yq1.a((yq1)object, (String)"Connection"), (boolean)true)) {
            v502.j();
        }
        if ((n13 == 204 || n13 == 205) && (l10 = (object2 = object.a()) != null ? object2.a() : -1L) > 0L) {
            object2 = object.a();
            object = var9_7;
            if (object2 != null) {
                object = object2.a();
            }
            object2 = new StringBuilder();
            ((StringBuilder)object2).append("HTTP ");
            ((StringBuilder)object2).append(n13);
            ((StringBuilder)object2).append(" had non-zero Content-Length: ");
            ((StringBuilder)object2).append(object);
            throw new ProtocolException(((StringBuilder)object2).toString());
        }
        return object;
    }
}

