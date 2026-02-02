/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.a71
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.hr1
 *  com.yandex.mobile.ads.impl.i41
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
import com.yandex.mobile.ads.impl.i41;
import com.yandex.mobile.ads.impl.j81;
import com.yandex.mobile.ads.impl.p7;
import com.yandex.mobile.ads.impl.tp1;
import com.yandex.mobile.ads.impl.up1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xq;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class dz1
implements j81 {
    @NotNull
    private final i41 a;
    @NotNull
    private final hr1 b;
    @NotNull
    private final p7 c;
    @NotNull
    private final xq d;

    @JvmOverloads
    public dz1(@NotNull i41 i412, @NotNull hr1 hr12, @NotNull p7 p73, @NotNull xq xq3) {
        this.a = i412;
        this.b = hr12;
        this.c = p73;
        this.d = xq3;
    }

    @NotNull
    public final tp1 a(@Nullable b8 b82, @NotNull x2 x22, @Nullable a71 a712) {
        b82 = this.b.a(b82, a712, x22, this.a);
        a712 = this.c.a(x22.a());
        tp1 tp12 = this.d.a(x22);
        tp1 tp13 = new tp1(new LinkedHashMap(), 2);
        tp13.b((Object)x22.t(), "image_loading_automatically");
        x22 = up1.a((tp1)tp12, (tp1)tp13);
        return up1.a((tp1)up1.a((tp1)b82, (tp1)a712), (tp1)x22);
    }
}

