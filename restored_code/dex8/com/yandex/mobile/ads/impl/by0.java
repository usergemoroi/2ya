/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.kz0
 *  com.yandex.mobile.ads.impl.lx0
 *  com.yandex.mobile.ads.impl.ox0
 *  com.yandex.mobile.ads.impl.s1
 *  com.yandex.mobile.ads.impl.tp1
 *  com.yandex.mobile.ads.impl.yx0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.kz0;
import com.yandex.mobile.ads.impl.lx0;
import com.yandex.mobile.ads.impl.ox0;
import com.yandex.mobile.ads.impl.s1;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.yx0;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class by0
implements s1 {
    @Nullable
    private final lx0<?> a;
    @NotNull
    private final yx0 b;

    public by0(@Nullable lx0<?> lx02, @NotNull yx0 yx02) {
        this.a = lx02;
        this.b = yx02;
    }

    @NotNull
    public final Map<String, Object> a() {
        tp1 tp12 = new tp1(null, 3);
        kz0 kz02 = this.a;
        if (kz02 != null) {
            kz02 = kz02.c();
            ox0 ox02 = this.a.a();
            tp12.b((Object)kz02.e(), "adapter");
            tp12.b((Object)kz02.i(), "adapter_parameters");
            this.b.getClass();
            tp12.a(new HashMap(yx0.a((ox0)ox02)));
        }
        return tp12.b();
    }
}

