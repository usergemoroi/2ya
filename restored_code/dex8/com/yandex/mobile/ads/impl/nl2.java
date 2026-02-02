/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.pq1
 *  com.yandex.mobile.ads.impl.sp1
 *  com.yandex.mobile.ads.impl.sp1$b
 *  com.yandex.mobile.ads.impl.sp1$c
 *  com.yandex.mobile.ads.impl.yd2
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.pq1;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.xb2;
import com.yandex.mobile.ads.impl.yd2;
import java.util.List;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class nl2
implements pq1<xb2, List<? extends xb2>> {
    @NotNull
    private final yd2 a;

    public nl2(@NotNull yd2 yd22) {
        this.a = yd22;
    }

    public final sp1 a(ar1 object, int n10, Object object2) {
        object2 = (xb2)object2;
        object = object != null ? (List)((ar1)object).a : null;
        object = 204 == n10 ? sp1.c.e : (object != null && n10 == 200 ? (object.isEmpty() ? sp1.c.e : sp1.c.c) : sp1.c.d);
        object = s0.q((Map)this.a.a(), (Map)s0.g(z.a("status", object.a())));
        return new sp1(sp1.b.p.a(), s0.C((Map)object), null);
    }

    public final sp1 a(Object object) {
        object = (xb2)object;
        object = this.a.a();
        return new sp1(sp1.b.o.a(), s0.C((Map)object), null);
    }
}

