/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.f8
 *  com.yandex.mobile.ads.impl.h4
 *  com.yandex.mobile.ads.impl.lx0
 *  com.yandex.mobile.ads.impl.s1
 *  com.yandex.mobile.ads.impl.yx0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.by0;
import com.yandex.mobile.ads.impl.f8;
import com.yandex.mobile.ads.impl.h4;
import com.yandex.mobile.ads.impl.lx0;
import com.yandex.mobile.ads.impl.s1;
import com.yandex.mobile.ads.impl.wx0;
import com.yandex.mobile.ads.impl.yx0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class sx0
implements h4 {
    @NotNull
    private final b8<?> a;
    @Nullable
    private final lx0<?> b;

    public sx0(@NotNull b8<?> b82, @Nullable lx0<?> lx02) {
        this.a = b82;
        this.b = lx02;
    }

    public final s1 a() {
        return new by0(this.b, new yx0());
    }

    public final f8 b() {
        return new wx0(this.a);
    }
}

