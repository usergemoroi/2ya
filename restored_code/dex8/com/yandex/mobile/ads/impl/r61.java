/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.ij2
 *  com.yandex.mobile.ads.impl.lj2
 *  com.yandex.mobile.ads.impl.lq1
 *  com.yandex.mobile.ads.impl.tc1
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.zc1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.b71;
import com.yandex.mobile.ads.impl.ij2;
import com.yandex.mobile.ads.impl.lj2;
import com.yandex.mobile.ads.impl.lq1;
import com.yandex.mobile.ads.impl.tc1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.zc1;
import org.jetbrains.annotations.NotNull;

public final class r61
implements zc1<a71> {
    @NotNull
    private final lq1<a71> a;
    @NotNull
    private final lj2<a71> b;

    public /* synthetic */ r61(lq1 lq12) {
        this((lq1<a71>)lq12, new b71((lq1<a71>)lq12));
    }

    public r61(@NotNull lq1<a71> lq12, @NotNull lj2<a71> lj22) {
        this.a = lq12;
        this.b = lj22;
    }

    @NotNull
    public final ij2 a(@NotNull x2 x22) {
        return tc1.a((x2)x22, this.b);
    }
}

