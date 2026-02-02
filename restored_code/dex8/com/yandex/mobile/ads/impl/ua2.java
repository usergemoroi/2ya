/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ar1
 *  com.yandex.mobile.ads.impl.ga2
 *  com.yandex.mobile.ads.impl.is
 *  com.yandex.mobile.ads.impl.n7
 *  com.yandex.mobile.ads.impl.pq1
 *  com.yandex.mobile.ads.impl.qa2
 *  com.yandex.mobile.ads.impl.sp1
 *  com.yandex.mobile.ads.impl.sp1$b
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.ga2;
import com.yandex.mobile.ads.impl.is;
import com.yandex.mobile.ads.impl.n7;
import com.yandex.mobile.ads.impl.pq1;
import com.yandex.mobile.ads.impl.qa2;
import com.yandex.mobile.ads.impl.sp1;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class ua2
implements pq1<qa2, ga2> {
    @NotNull
    private final n7 a;

    public ua2(@NotNull n7 n73) {
        this.a = n73;
    }

    private final Map<String, Object> a() {
        String string2 = this.a.d();
        String string3 = "";
        String string4 = string2;
        if (string2 == null) {
            string4 = "";
        }
        int n10 = string4.length();
        string2 = "null";
        if (n10 == 0) {
            string4 = "null";
        }
        t<String, String> t13 = z.a("page_id", string4);
        string4 = this.a.c();
        if (string4 == null) {
            string4 = string3;
        }
        if (string4.length() == 0) {
            string4 = string2;
        }
        return s0.m((t[])new t[]{t13, z.a("imp_id", string4), z.a("ad_type", is.h.b())});
    }

    public final sp1 a(ar1 object, int n10, Object object2) {
        object = (qa2)object2;
        object = s0.C(this.a());
        if (n10 != -1) {
            object.put("code", n10);
        }
        return new sp1(sp1.b.n.a(), s0.C((Map)object), null);
    }

    public final sp1 a(Object map2) {
        map2 = (qa2)map2;
        map2 = this.a();
        return new sp1(sp1.b.m.a(), s0.C(map2), null);
    }
}

