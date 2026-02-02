/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ff1
 *  com.yandex.mobile.ads.impl.i42
 *  com.yandex.mobile.ads.impl.i9
 *  com.yandex.mobile.ads.impl.xp1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ff1;
import com.yandex.mobile.ads.impl.i42;
import com.yandex.mobile.ads.impl.i9;
import com.yandex.mobile.ads.impl.xp1;
import org.jetbrains.annotations.NotNull;

public final class q91
implements ff1 {
    @NotNull
    private final i9 a;
    @NotNull
    private final i42 b;
    @NotNull
    private final xp1 c;

    public q91(@NotNull i9 i94, @NotNull i42 i422, @NotNull xp1 xp12) {
        this.a = i94;
        this.b = i422;
        this.c = xp12;
    }

    public final void a(@NotNull String string2) {
        this.a.a(string2, this.b, this.c);
    }
}

