/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.h92
 *  com.yandex.mobile.ads.impl.sc0
 *  com.yandex.mobile.ads.impl.ur
 *  com.yandex.mobile.ads.impl.z62
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.h92;
import com.yandex.mobile.ads.impl.sc0;
import com.yandex.mobile.ads.impl.ur;
import com.yandex.mobile.ads.impl.z62;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class tc0
implements z62,
h92 {
    @NotNull
    private final ur a;
    @Nullable
    private Map<String, String> b;
    private boolean c;

    public tc0(@NotNull ur ur2) {
        this.a = ur2;
    }

    @NotNull
    public final sc0 a() {
        return new sc0(this.c, this.b);
    }

    public final void a(@Nullable Map<String, String> map2) {
        this.b = map2;
    }

    public final void a(boolean bl2) {
        this.c = bl2;
        this.a.a(bl2);
    }
}

