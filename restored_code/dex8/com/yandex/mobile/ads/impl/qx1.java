/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ks0
 *  com.yandex.mobile.ads.impl.px1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ks0;
import com.yandex.mobile.ads.impl.px1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class qx1
implements px1 {
    @NotNull
    private final ks0 b;

    public qx1(@NotNull ks0 ks02) {
        this.b = ks02;
    }

    @Nullable
    public final String a() {
        return this.b.d("ServerSideClientIP");
    }

    public final void a(@Nullable String string2) {
        this.b.a("ServerSideClientIP", string2);
    }
}

