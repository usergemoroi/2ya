/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cr1
 *  com.yandex.mobile.ads.impl.cs
 *  com.yandex.mobile.ads.impl.es
 *  com.yandex.mobile.ads.impl.ho1
 *  com.yandex.mobile.ads.impl.ih0
 *  com.yandex.mobile.ads.impl.ip0
 *  com.yandex.mobile.ads.impl.n92
 *  com.yandex.mobile.ads.impl.rh0
 *  com.yandex.mobile.ads.impl.yq1
 *  com.yandex.mobile.ads.impl.yq1$a
 *  com.yandex.mobile.ads.impl.zp1
 *  com.yandex.mobile.ads.impl.zp1$a
 *  kotlin.collections.t
 *  kotlin.text.p
 *  okio.r
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cr1;
import com.yandex.mobile.ads.impl.cs;
import com.yandex.mobile.ads.impl.es;
import com.yandex.mobile.ads.impl.ho1;
import com.yandex.mobile.ads.impl.ih0;
import com.yandex.mobile.ads.impl.io1;
import com.yandex.mobile.ads.impl.ip0;
import com.yandex.mobile.ads.impl.kf0;
import com.yandex.mobile.ads.impl.n92;
import com.yandex.mobile.ads.impl.rh0;
import com.yandex.mobile.ads.impl.yq1;
import com.yandex.mobile.ads.impl.zp1;
import java.io.IOException;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import kotlin.text.p;
import okio.l0;
import okio.r;
import okio.x;
import org.jetbrains.annotations.NotNull;

public final class ol
implements ip0 {
    @NotNull
    private final es a;

    public ol(@NotNull es es2) {
        this.a = es2;
    }

    @NotNull
    public final yq1 a(@NotNull ho1 ho12) throws IOException {
        boolean bl2;
        Object object;
        zp1 zp12 = ho12.i();
        zp12.getClass();
        zp1.a a14 = new zp1.a(zp12);
        Object object2 = zp12.a();
        if (object2 != null) {
            long l10;
            object = object2.b();
            if (object != null) {
                a14.b("Content-Type", object.toString());
            }
            if ((l10 = object2.a()) != -1L) {
                a14.b("Content-Length", String.valueOf(l10));
                a14.a("Transfer-Encoding");
            } else {
                a14.b("Transfer-Encoding", "chunked");
                a14.a("Content-Length");
            }
        }
        object2 = zp12.a("Host");
        int n10 = 0;
        if (object2 == null) {
            a14.b("Host", n92.a((rh0)zp12.g(), (boolean)false));
        }
        if (zp12.a("Connection") == null) {
            a14.b("Connection", "Keep-Alive");
        }
        if (zp12.a("Accept-Encoding") == null && zp12.a("Range") == null) {
            a14.b("Accept-Encoding", "gzip");
            bl2 = true;
        } else {
            bl2 = false;
        }
        object = this.a.a();
        if (object.isEmpty() ^ true) {
            object2 = new StringBuilder();
            object = object.iterator();
            while (object.hasNext()) {
                Object object3 = object.next();
                if (n10 < 0) {
                    t.w();
                }
                object3 = (cs)object3;
                if (n10 > 0) {
                    ((StringBuilder)object2).append("; ");
                }
                ((StringBuilder)object2).append(object3.e());
                ((StringBuilder)object2).append('=');
                ((StringBuilder)object2).append(object3.f());
                ++n10;
            }
            object2 = ((StringBuilder)object2).toString();
            y.i(object2, "toString(...)");
            a14.b("Cookie", (String)object2);
        }
        if (zp12.a("User-Agent") == null) {
            a14.b("User-Agent", "okhttp/4.9.3");
        }
        ho12 = ho12.a(a14.a());
        ih0.a((es)this.a, (rh0)zp12.g(), (kf0)ho12.f());
        zp12 = new yq1.a((yq1)ho12).a(zp12);
        if (bl2 && p.z((String)"gzip", (String)yq1.a((yq1)ho12, (String)"Content-Encoding"), (boolean)true) && ih0.a((yq1)ho12) && (a14 = ho12.a()) != null) {
            a14 = new r((l0)a14.c());
            zp12.a(ho12.f().b().a("Content-Encoding").a("Content-Length").a());
            zp12.a((cr1)new io1(yq1.a((yq1)ho12, (String)"Content-Type"), -1L, x.d((l0)a14)));
        }
        return zp12.a();
    }
}

