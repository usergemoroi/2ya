/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ea0
 *  com.yandex.mobile.ads.impl.gh0
 *  com.yandex.mobile.ads.impl.ux1
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.zc1
 *  kotlin.collections.s0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ea0;
import com.yandex.mobile.ads.impl.gh0;
import com.yandex.mobile.ads.impl.kj;
import com.yandex.mobile.ads.impl.lj;
import com.yandex.mobile.ads.impl.q7;
import com.yandex.mobile.ads.impl.ux1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.zc1;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class t80
extends kj<String> {
    @Nullable
    private final ea0 K;

    @JvmOverloads
    public t80(@NotNull Context context, @NotNull x2 x22, @NotNull String string2, @NotNull String string3, @NotNull lj lj3, @NotNull lj lj4, @Nullable ea0 ea02, @NotNull ux1 ux12, @NotNull zc1 zc12, @NotNull q7 q72) {
        super(context, x22, string2, string3, zc12, lj3, lj4, q72, ux12, 3584);
        this.K = ea02;
    }

    @Override
    @NotNull
    public final Map<String, String> e() {
        Map<String, String> map2 = super.e();
        Map map3 = s0.d();
        if (this.K != null) {
            map3.put(gh0.L.a(), this.K.a());
        }
        map3.putAll(map2);
        return s0.c((Map)map3);
    }
}

