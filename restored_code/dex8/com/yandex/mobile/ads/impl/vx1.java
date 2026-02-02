/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ks0
 *  com.yandex.mobile.ads.impl.ux1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ks0;
import com.yandex.mobile.ads.impl.ux1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class vx1
implements ux1 {
    @NotNull
    private final ks0 b;

    public vx1(@NotNull ks0 ks02) {
        this.b = ks02;
    }

    @Nullable
    public final String a() {
        return this.b.d("SessionData");
    }

    public final void a(@Nullable String string2) {
        this.b.a("SessionData", string2);
    }
}

