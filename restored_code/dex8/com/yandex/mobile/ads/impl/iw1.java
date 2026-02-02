/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.ni
 *  com.yandex.mobile.ads.impl.oi
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.hw1;
import com.yandex.mobile.ads.impl.ji;
import com.yandex.mobile.ads.impl.ni;
import com.yandex.mobile.ads.impl.oi;
import org.jetbrains.annotations.NotNull;

public final class iw1
implements oi {
    @NotNull
    private final gv1 a;

    public iw1(@NotNull gv1 gv12) {
        this.a = gv12;
    }

    @NotNull
    public final ni a(@NotNull ji ji3) {
        return new hw1(ji3, this.a);
    }
}

