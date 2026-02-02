/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dc2
 *  com.yandex.mobile.ads.impl.hq1
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.vi2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dc2;
import com.yandex.mobile.ads.impl.hq1;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.vi2;
import org.jetbrains.annotations.NotNull;

public final class bj2
implements hq1<vi2> {
    @NotNull
    private final p4 a;
    @NotNull
    private final hq1<vi2> b;

    public bj2(@NotNull p4 p42, @NotNull hq1<vi2> hq12) {
        this.a = p42;
        this.b = hq12;
    }

    public final void a(@NotNull dc2 dc22) {
        this.a.a(o4.w);
        this.b.a(dc22);
    }

    public final void a(Object object) {
        object = (vi2)object;
        this.a.a(o4.w);
        this.b.a(object);
    }
}

