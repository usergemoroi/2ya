/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.f8
 *  com.yandex.mobile.ads.impl.h4
 *  com.yandex.mobile.ads.impl.s1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.au1;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.f8;
import com.yandex.mobile.ads.impl.h4;
import com.yandex.mobile.ads.impl.s1;
import com.yandex.mobile.ads.impl.zt1;
import org.jetbrains.annotations.NotNull;

public final class yt1
implements h4 {
    @NotNull
    private final b8<?> a;

    public yt1(@NotNull b8<?> b82) {
        this.a = b82;
    }

    public final s1 a() {
        return new au1();
    }

    public final f8 b() {
        return new zt1(this.a);
    }
}

