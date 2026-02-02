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
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

public final class wx0
implements f8 {
    @NotNull
    private final b8<?> a;

    public wx0(@NotNull b8<?> b82) {
        this.a = b82;
    }

    @NotNull
    public final tp1 a() {
        tp1 tp12 = new tp1(new HashMap(), 2);
        tp12.b((Object)this.a.l(), "ad_source");
        tp12.b((Object)this.a.o(), "block_id");
        tp12.b((Object)this.a.o(), "ad_unit_id");
        tp12.a((Object)this.a.M(), "server_log_id");
        tp12.a(this.a.a());
        return tp12;
    }
}

