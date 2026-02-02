/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.aj1
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.gm0
 *  com.yandex.mobile.ads.impl.us
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.aj1;
import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.gm0;
import com.yandex.mobile.ads.impl.us;
import java.util.List;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;

public final class vt0
implements aj1 {
    @NotNull
    private final gm0 a;
    @NotNull
    private final us b;

    public vt0(@NotNull gm0 gm02, @NotNull us us3) {
        this.a = gm02;
        this.b = us3;
    }

    public final float getVolume() {
        co0 co02 = (co0)t.t0((List)this.b.g());
        float f11 = co02 != null ? this.a.c(co02) : 0.0f;
        return f11;
    }
}

