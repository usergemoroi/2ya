/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dc2
 *  com.yandex.mobile.ads.impl.do0
 *  com.yandex.mobile.ads.impl.hq1
 *  com.yandex.mobile.ads.impl.us
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dc2;
import com.yandex.mobile.ads.impl.do0;
import com.yandex.mobile.ads.impl.hq1;
import com.yandex.mobile.ads.impl.us;
import com.yandex.mobile.ads.impl.w1;
import com.yandex.mobile.ads.impl.xb2;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class la2
implements hq1<List<? extends xb2>> {
    @NotNull
    private final w1 a;
    @NotNull
    private final hq1<us> b;
    @NotNull
    private final do0 c;

    public la2(@NotNull w1 w13, @NotNull hq1 hq12, @NotNull do0 do02) {
        this.a = w13;
        this.b = hq12;
        this.c = do02;
    }

    public final void a(@NotNull dc2 dc22) {
        this.b.a(dc22);
    }

    public final void a(Object object) {
        object = (List)object;
        if ((object = this.c.a(this.a, (List)object)) != null) {
            this.b.a(object);
        } else {
            object = new dc2(1, "Failed to parse ad break");
            this.b.a((dc2)object);
        }
    }
}

