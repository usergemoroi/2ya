/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.gw1
 *  com.yandex.mobile.ads.impl.m81
 *  com.yandex.mobile.ads.impl.n81
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.gw1;
import com.yandex.mobile.ads.impl.j61;
import com.yandex.mobile.ads.impl.jw1;
import com.yandex.mobile.ads.impl.m81;
import com.yandex.mobile.ads.impl.n81;
import com.yandex.mobile.ads.impl.x2;
import org.jetbrains.annotations.NotNull;

public final class kw1
implements n81 {
    @NotNull
    private final gv1 a;
    @NotNull
    private final x2 b;

    public kw1(@NotNull gv1 gv12, @NotNull x2 x22) {
        this.a = gv12;
        this.b = x22;
    }

    @NotNull
    public final m81 a(@NotNull j61 j612) {
        gv1 gv12 = this.a;
        return new jw1(j612, this.b, new gw1(gv12));
    }
}

