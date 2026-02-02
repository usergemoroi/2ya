/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cr1
 *  com.yandex.mobile.ads.impl.ho1
 *  com.yandex.mobile.ads.impl.ip0
 *  com.yandex.mobile.ads.impl.n92
 *  com.yandex.mobile.ads.impl.om$a
 *  com.yandex.mobile.ads.impl.q50
 *  com.yandex.mobile.ads.impl.qm1
 *  com.yandex.mobile.ads.impl.rm
 *  com.yandex.mobile.ads.impl.rm$a
 *  com.yandex.mobile.ads.impl.yq1
 *  com.yandex.mobile.ads.impl.yq1$a
 *  com.yandex.mobile.ads.impl.zp1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cr1;
import com.yandex.mobile.ads.impl.do1;
import com.yandex.mobile.ads.impl.ho1;
import com.yandex.mobile.ads.impl.ip0;
import com.yandex.mobile.ads.impl.kf0;
import com.yandex.mobile.ads.impl.n92;
import com.yandex.mobile.ads.impl.om;
import com.yandex.mobile.ads.impl.q50;
import com.yandex.mobile.ads.impl.qm1;
import com.yandex.mobile.ads.impl.rm;
import com.yandex.mobile.ads.impl.yq1;
import com.yandex.mobile.ads.impl.zp1;
import java.io.Closeable;
import java.io.IOException;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

/*
 * Exception performing whole class analysis ignored.
 */
public final class om
implements ip0 {
    @NotNull
    public final yq1 a(@NotNull ho1 ho12) throws IOException {
        yq1 yq12;
        zp1 zp12;
        Object object;
        block13: {
            block12: {
                object = ho12.a();
                rm rm3 = new rm.a(System.currentTimeMillis(), ho12.i()).a();
                zp12 = rm3.b();
                yq12 = rm3.a();
                if (!(object instanceof do1)) {
                    object = null;
                }
                if (object == null) break block12;
                rm3 = ((do1)object).e();
                object = rm3;
                if (rm3 != null) break block13;
            }
            object = q50.a;
        }
        if (zp12 == null && yq12 == null) {
            ho12 = new yq1.a().a(ho12.i()).a(qm1.e).a(504).a("Unsatisfiable Request (only-if-cached)").a((cr1)n92.c).b(-1L).a(System.currentTimeMillis()).a();
            object.getClass();
            return ho12;
        }
        if (zp12 == null) {
            y.g(yq12);
            yq12.getClass();
            ho12 = new yq1.a(yq12).a(a.a((yq1)yq12)).a();
            object.getClass();
            return ho12;
        }
        if (yq12 != null) {
            object.getClass();
        }
        ho12 = ho12.a(zp12);
        if (yq12 != null) {
            if (ho12.c() != 304) {
                object = yq12.a();
                if (object != null) {
                    n92.a((Closeable)object);
                }
            } else {
                new yq1.a(yq12).a(a.a((kf0)yq12.f(), (kf0)ho12.f())).b(ho12.o()).a(ho12.m()).a(a.a((yq1)yq12)).b(a.a((yq1)ho12)).a();
                ho12 = ho12.a();
                y.g(ho12);
                n92.a((Closeable)ho12.c());
                y.g(null);
                throw null;
            }
        }
        y.g(ho12);
        return new yq1.a((yq1)ho12).a(a.a((yq1)yq12)).b(a.a((yq1)ho12)).a();
    }
}

