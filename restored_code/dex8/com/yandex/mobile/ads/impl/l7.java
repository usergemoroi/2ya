/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.oq1
 *  com.yandex.mobile.ads.impl.p7
 *  com.yandex.mobile.ads.impl.x2
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.oq1;
import com.yandex.mobile.ads.impl.p7;
import com.yandex.mobile.ads.impl.x2;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;

public final class l7
implements oq1 {
    @NotNull
    private final x2 a;
    @NotNull
    private final p7 b;

    public l7(@NotNull x2 x22) {
        this.a = x22;
        this.b = new p7();
    }

    @NotNull
    public final Map<String, Object> a() {
        Map map2 = s0.o((t[])new t[]{z.a("ad_type", this.a.b().b())});
        String string2 = this.a.c();
        if (string2 != null) {
            map2.put("block_id", string2);
            map2.put("ad_unit_id", string2);
        }
        map2.putAll(this.b.a(this.a.a()).b());
        return map2;
    }
}

