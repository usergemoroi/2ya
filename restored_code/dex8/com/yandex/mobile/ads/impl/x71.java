/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.hr1
 *  com.yandex.mobile.ads.impl.j81
 *  com.yandex.mobile.ads.impl.p7
 *  com.yandex.mobile.ads.impl.tp1
 *  com.yandex.mobile.ads.impl.up1
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xq
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.a71;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.hr1;
import com.yandex.mobile.ads.impl.j81;
import com.yandex.mobile.ads.impl.p7;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.up1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xq;
import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class x71
implements j81 {
    @NotNull
    private final hr1 a;
    @NotNull
    private final p7 b;
    @NotNull
    private final xq c;

    public /* synthetic */ x71() {
        this(new hr1(), new p7(), new xq());
    }

    public x71(@NotNull hr1 hr12, @NotNull p7 p73, @NotNull xq xq3) {
        this.a = hr12;
        this.b = p73;
        this.c = xq3;
    }

    @NotNull
    public final tp1 a(@Nullable b8 b82, @NotNull x2 x22, @Nullable a71 a712) {
        b82 = this.a.a(b82, x22, a712);
        a712 = this.b.a(x22.a());
        tp1 tp12 = this.c.a(x22);
        tp1 tp13 = new tp1(new LinkedHashMap(), 2);
        tp13.b((Object)x22.t(), "image_loading_automatically");
        x22 = up1.a((tp1)tp12, (tp1)tp13);
        return up1.a((tp1)up1.a((tp1)b82, (tp1)a712), (tp1)x22);
    }
}

