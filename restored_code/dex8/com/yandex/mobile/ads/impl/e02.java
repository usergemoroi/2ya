/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ac1
 *  com.yandex.mobile.ads.impl.i71
 *  com.yandex.mobile.ads.impl.jh2
 *  com.yandex.mobile.ads.impl.lo
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.wf
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ac1;
import com.yandex.mobile.ads.impl.i71;
import com.yandex.mobile.ads.impl.jh2;
import com.yandex.mobile.ads.impl.lo;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.w9;
import com.yandex.mobile.ads.impl.wf;
import java.util.List;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class e02
implements ac1 {
    @Nullable
    private final List<vf<?>> a;

    public e02(@Nullable List<? extends vf<?>> list) {
        this.a = list;
    }

    public final void a() {
    }

    public final void a(@NotNull i71 i712) {
    }

    public final void a(@NotNull i71 i712, @NotNull lo lo3) {
        List<vf<?>> list = this.a;
        if (list != null) {
            w9 w92 = new w9(i712, lo3);
            for (vf vf3 : list) {
                lo3 = i712.a(vf3);
                if (!(lo3 instanceof wf)) {
                    lo3 = null;
                }
                if (lo3 == null) continue;
                lo3.c(vf3.d());
                y.h(vf3, "null cannot be cast to non-null type com.monetization.ads.network.model.Asset<kotlin.Any?>");
                lo3.a(vf3, (jh2)w92);
            }
        }
    }
}

