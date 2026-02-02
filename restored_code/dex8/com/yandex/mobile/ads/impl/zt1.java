/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.f8
 *  com.yandex.mobile.ads.impl.tp1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.f8;
import com.yandex.mobile.ads.impl.tp1;
import org.jetbrains.annotations.NotNull;

public final class zt1
implements f8 {
    @NotNull
    private final b8<?> a;

    public zt1(@NotNull b8<?> b82) {
        this.a = b82;
    }

    @NotNull
    public final tp1 a() {
        tp1 tp12 = new tp1(null, 3);
        tp12.b((Object)this.a.l(), "ad_source");
        tp12.b((Object)this.a.n(), "ad_type_format");
        tp12.b((Object)this.a.o(), "block_id");
        tp12.b((Object)this.a.o(), "ad_unit_id");
        tp12.b((Object)this.a.I(), "product_type");
        tp12.a((Object)this.a.M(), "server_log_id");
        tp12.b((Object)this.a.N().a().a(), "size_type");
        tp12.b((Object)this.a.N().getWidth(), "width");
        tp12.b((Object)this.a.N().getHeight(), "height");
        tp12.a(this.a.a());
        return tp12;
    }
}

