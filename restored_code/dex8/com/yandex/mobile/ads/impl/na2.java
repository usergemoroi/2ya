/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dc2
 *  com.yandex.mobile.ads.impl.zg1
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dc2;
import com.yandex.mobile.ads.impl.zg1;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.t;
import kotlin.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class na2
implements zg1 {
    @NotNull
    private final String a;
    @Nullable
    private final dc2 b;

    public na2(@NotNull String string2, @Nullable dc2 dc22) {
        this.a = string2;
        this.b = dc22;
    }

    @NotNull
    public final Map<String, Object> a(long l10) {
        Map map2 = s0.o((t[])new t[]{z.a("duration", l10), z.a("status", this.a)});
        dc2 dc22 = this.b;
        if (dc22 != null) {
            map2.put("failure_reason", dc22.a());
        }
        return map2;
    }
}

