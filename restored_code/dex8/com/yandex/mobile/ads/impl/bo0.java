/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.n7
 *  com.yandex.mobile.ads.impl.qa2
 *  com.yandex.mobile.ads.impl.ra2
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n7;
import com.yandex.mobile.ads.impl.qa2;
import com.yandex.mobile.ads.impl.ra2;
import java.util.Map;
import kotlin.collections.s0;
import org.jetbrains.annotations.NotNull;

public final class bo0
implements ra2 {
    @NotNull
    private final qa2 a;

    public bo0(@NotNull qa2 qa22) {
        this.a = qa22;
    }

    @NotNull
    public final Map<String, String> a() {
        n7 n73 = new n7(this.a.a());
        Map map2 = s0.d();
        Object object = this.a.b();
        if (object != null) {
            map2.putAll(object);
        }
        if ((object = n73.e()) != null) {
            map2.put("video-session-id", object);
        }
        return s0.c((Map)map2);
    }
}

