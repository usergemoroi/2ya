/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.iz1
 *  com.yandex.mobile.ads.impl.x2
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.iy0;
import com.yandex.mobile.ads.impl.iz1;
import com.yandex.mobile.ads.impl.x2;
import java.util.Map;
import kotlin.collections.s0;
import org.jetbrains.annotations.NotNull;

public final class hy0
extends iy0 {
    public hy0(@NotNull x2 x22) {
        super(x22);
    }

    @Override
    @NotNull
    public final Map<String, Object> a(@NotNull Context context) {
        Map map2 = s0.C(super.a(context));
        iz1 iz12 = this.a().q();
        if (iz12 != null) {
            map2.put("width", iz12.c(context));
            map2.put("height", iz12.a(context));
        }
        return map2;
    }
}

