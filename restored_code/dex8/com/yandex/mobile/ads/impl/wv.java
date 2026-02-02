/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b
 *  com.yandex.mobile.ads.impl.sp1
 *  com.yandex.mobile.ads.impl.sp1$b
 *  com.yandex.mobile.ads.impl.tp1
 *  com.yandex.mobile.ads.impl.uv
 *  com.yandex.mobile.ads.impl.vv
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b;
import com.yandex.mobile.ads.impl.s01;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.uv;
import com.yandex.mobile.ads.impl.vv;
import com.yandex.mobile.ads.impl.wp1;
import java.util.Map;
import kotlin.collections.s0;
import org.jetbrains.annotations.NotNull;

public final class wv
implements vv {
    @NotNull
    private final wp1 a;
    @NotNull
    private final tp1 b;

    public wv(@NotNull s01 s012, @NotNull tp1 tp12) {
        this.a = s012;
        this.b = tp12;
    }

    public final void a(@NotNull uv uv3) {
        this.b.b((Object)uv3.a(), "log_type");
        uv3 = sp1.b.V;
        Map map2 = this.b.b();
        b b11 = this.b.a();
        uv3 = new sp1(uv3.a(), s0.C((Map)map2), b11);
        this.a.a((sp1)uv3);
    }
}

