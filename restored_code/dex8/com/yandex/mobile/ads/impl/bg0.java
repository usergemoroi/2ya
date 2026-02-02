/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ij2
 *  com.yandex.mobile.ads.impl.lj2
 *  com.yandex.mobile.ads.impl.tc1
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.zc1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.eg0;
import com.yandex.mobile.ads.impl.ij2;
import com.yandex.mobile.ads.impl.lj2;
import com.yandex.mobile.ads.impl.tc1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.zc1;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class bg0
implements zc1<String> {
    @NotNull
    private final lj2<String> a;

    public /* synthetic */ bg0() {
        this(new eg0());
    }

    @JvmOverloads
    public bg0(@NotNull lj2<String> lj22) {
        this.a = lj22;
    }

    @NotNull
    public final ij2 a(@NotNull x2 x22) {
        return tc1.a((x2)x22, this.a);
    }
}

