/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ba2
 *  com.yandex.mobile.ads.impl.dc2
 *  com.yandex.mobile.ads.impl.ga2
 *  com.yandex.mobile.ads.impl.hq1
 *  com.yandex.mobile.ads.impl.je2
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.qa2
 *  com.yandex.mobile.ads.impl.ra2
 *  com.yandex.mobile.ads.impl.zg1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ba2;
import com.yandex.mobile.ads.impl.dc2;
import com.yandex.mobile.ads.impl.ga2;
import com.yandex.mobile.ads.impl.hq1;
import com.yandex.mobile.ads.impl.je2;
import com.yandex.mobile.ads.impl.na2;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.qa2;
import com.yandex.mobile.ads.impl.ra2;
import com.yandex.mobile.ads.impl.xb2;
import com.yandex.mobile.ads.impl.zg1;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class ha2
implements hq1<ga2> {
    @NotNull
    private final qa2 a;
    @NotNull
    private final p4 b;
    @NotNull
    private final hq1<ga2> c;
    @NotNull
    private final je2 d;

    public ha2(@NotNull qa2 qa22, @NotNull ra2 ra22, @NotNull p4 p42, @NotNull hq1 hq12, @NotNull je2 je22) {
        this.a = qa22;
        this.b = p42;
        this.c = hq12;
        this.d = je22;
    }

    public static final void a(ha2 ha22) {
        ha22.getClass();
        na2 na22 = new na2("success", null);
        ha22.b.a(o4.t, (zg1)na22, ha22.a);
    }

    public static final void a(ha2 ha22, dc2 object) {
        ha22.getClass();
        object = new na2("error", (dc2)object);
        ha22.b.a(o4.t, (zg1)object, ha22.a);
    }

    public final void a(@NotNull dc2 dc22) {
        na2 na22 = new na2("error", dc22);
        this.b.a(o4.t, (zg1)na22, this.a);
        this.c.a(dc22);
    }

    public final void a(Object object) {
        Object object2 = (ga2)object;
        object = object2.b().b();
        object2 = new a(this, (ga2)object2, this.c);
        this.d.a((List)object, (hq1)object2);
    }

    public final class a
    implements hq1<List<? extends xb2>> {
        @NotNull
        private final ga2 a;
        @NotNull
        private final hq1<ga2> b;
        final ha2 c;

        public a(ha2 ha22, @NotNull ga2 ga22, @NotNull hq1<ga2> hq12) {
            this.c = ha22;
            this.a = ga22;
            this.b = hq12;
        }

        public final void a(@NotNull dc2 dc22) {
            ha2.a(this.c, dc22);
            this.b.a(dc22);
        }

        public final void a(Object object) {
            object = (List)object;
            ha2.a(this.c);
            object = new ga2(new ba2(this.a.b().a(), (List)object), this.a.a());
            this.b.a(object);
        }
    }
}

