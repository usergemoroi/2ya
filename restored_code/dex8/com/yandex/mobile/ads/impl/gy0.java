/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.mediation.banner.c
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.fz0
 *  com.yandex.mobile.ads.impl.ni
 *  com.yandex.mobile.ads.impl.oi
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.mediation.banner.c;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.fz0;
import com.yandex.mobile.ads.impl.ji;
import com.yandex.mobile.ads.impl.ni;
import com.yandex.mobile.ads.impl.oi;
import org.jetbrains.annotations.NotNull;

public final class gy0
implements oi {
    @NotNull
    private final b8<String> a;
    @NotNull
    private final fz0 b;

    public gy0(@NotNull b8<String> b82, @NotNull fz0 fz02) {
        this.a = b82;
        this.b = fz02;
    }

    @NotNull
    public final ni a(@NotNull ji ji3) {
        return new c(ji3, this.a, this.b);
    }
}

