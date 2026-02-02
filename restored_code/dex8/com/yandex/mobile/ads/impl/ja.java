/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.sp1$c
 *  com.yandex.mobile.ads.impl.tp1
 *  com.yandex.mobile.ads.impl.zg1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.zg1;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ja
implements zg1 {
    @NotNull
    private final sp1.c a;
    @Nullable
    private final String b;

    public ja(@NotNull sp1.c c10, @Nullable String string2) {
        this.a = c10;
        this.b = string2;
    }

    @NotNull
    public final Map<String, Object> a(long l10) {
        tp1 tp12 = new tp1(null, 3);
        tp12.b((Object)this.b, "adapter");
        tp12.b((Object)this.a.a(), "status");
        tp12.b((Object)l10, "duration");
        return tp12.b();
    }
}

