/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.is
 *  com.yandex.mobile.ads.impl.pq1
 *  com.yandex.mobile.ads.impl.sp1
 *  com.yandex.mobile.ads.impl.sp1$b
 *  com.yandex.mobile.ads.impl.vi2
 *  com.yandex.mobile.ads.impl.zi2
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.is;
import com.yandex.mobile.ads.impl.pq1;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.vi2;
import com.yandex.mobile.ads.impl.zi2;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.t;
import kotlin.z;

public final class cj2
implements pq1<zi2, vi2> {
    public final sp1 a(ar1 object, int n10, Object object2) {
        object = (zi2)object2;
        object = s0.C((Map)s0.m((t[])new t[]{z.a("page_id", object.getPageId()), z.a("category_id", object.a()), z.a("ad_type", is.h.b())}));
        if (n10 != -1) {
            object.put("code", n10);
        }
        return new sp1(sp1.b.u.a(), s0.C((Map)object), null);
    }

    public final sp1 a(Object object) {
        object = (zi2)object;
        object = s0.m((t[])new t[]{z.a("page_id", object.getPageId()), z.a("category_id", object.a()), z.a("ad_type", is.h.b())});
        return new sp1(sp1.b.t.a(), s0.C((Map)object), null);
    }
}

