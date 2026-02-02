/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dc2
 *  com.yandex.mobile.ads.impl.fl2
 *  com.yandex.mobile.ads.impl.hq1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dc2;
import com.yandex.mobile.ads.impl.fl2;
import com.yandex.mobile.ads.impl.hq1;
import com.yandex.mobile.ads.impl.xb2;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class el2
implements hq1<List<? extends xb2>> {
    @NotNull
    private final hq1<List<xb2>> a;
    @NotNull
    private final fl2 b;

    public el2(@NotNull hq1 hq12, @NotNull fl2 fl22) {
        this.a = hq12;
        this.b = fl22;
    }

    public final void a(@NotNull dc2 dc22) {
        this.a.a(dc22);
    }

    public final void a(Object object) {
        object = (List)object;
        object = this.b.a((List)object);
        this.a.a(object);
    }
}

