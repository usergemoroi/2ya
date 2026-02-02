/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bu1
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.ni
 *  com.yandex.mobile.ads.impl.nv1
 *  com.yandex.mobile.ads.impl.oi
 *  com.yandex.mobile.ads.impl.ov1
 *  com.yandex.mobile.ads.impl.w8
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bu1;
import com.yandex.mobile.ads.impl.eu1;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.hu1;
import com.yandex.mobile.ads.impl.ji;
import com.yandex.mobile.ads.impl.li;
import com.yandex.mobile.ads.impl.ni;
import com.yandex.mobile.ads.impl.nv1;
import com.yandex.mobile.ads.impl.oi;
import com.yandex.mobile.ads.impl.ov1;
import com.yandex.mobile.ads.impl.w8;
import com.yandex.mobile.ads.impl.x2;
import org.jetbrains.annotations.NotNull;

public final class fu1
implements oi {
    @NotNull
    private final gv1 a;

    public fu1(@NotNull gv1 gv12) {
        this.a = gv12;
    }

    @NotNull
    public final ni a(@NotNull ji ji3) {
        gv1 gv12 = this.a;
        x2 x22 = ji3.e();
        return new eu1(ji3, gv12, new ov1(x22, (w8)new li(), (nv1)new hu1(gv12, x22, ji3)), new bu1(x22));
    }
}

