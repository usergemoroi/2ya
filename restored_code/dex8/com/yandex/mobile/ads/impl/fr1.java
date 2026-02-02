/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.er1
 *  com.yandex.mobile.ads.impl.fj2
 *  com.yandex.mobile.ads.impl.lj2
 *  com.yandex.mobile.ads.impl.uc1
 *  com.yandex.mobile.ads.impl.zq1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.er1;
import com.yandex.mobile.ads.impl.fj2;
import com.yandex.mobile.ads.impl.lj2;
import com.yandex.mobile.ads.impl.uc1;
import com.yandex.mobile.ads.impl.zq1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class fr1<T>
implements er1<T> {
    @NotNull
    private final lj2<T> a;
    @NotNull
    private final fj2 b;

    public /* synthetic */ fr1(lj2 lj22) {
        this(lj22, new fj2());
    }

    public fr1(@NotNull lj2<T> lj22, @NotNull fj2 fj22) {
        this.a = lj22;
        this.b = fj22;
    }

    @Nullable
    public final T a(@NotNull zq1 zq12) {
        this.b.getClass();
        zq12 = new uc1(zq12.c(), zq12.a().a(), zq12.b(), true);
        return (T)this.a.a((uc1)zq12);
    }
}

