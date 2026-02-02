/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  com.yandex.mobile.ads.impl.bs
 *  com.yandex.mobile.ads.impl.h82
 *  com.yandex.mobile.ads.impl.in0
 *  com.yandex.mobile.ads.impl.n70
 *  com.yandex.mobile.ads.impl.ug
 *  com.yandex.mobile.ads.impl.um0
 *  com.yandex.mobile.ads.impl.xm0
 *  com.yandex.mobile.ads.impl.zb2
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.bs;
import com.yandex.mobile.ads.impl.h82;
import com.yandex.mobile.ads.impl.in0;
import com.yandex.mobile.ads.impl.n70;
import com.yandex.mobile.ads.impl.ug;
import com.yandex.mobile.ads.impl.um0;
import com.yandex.mobile.ads.impl.xm0;
import com.yandex.mobile.ads.impl.zb2;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class as
implements h82 {
    @NotNull
    private final bs a;
    @NotNull
    private final ug b;
    @NotNull
    private final xm0 c;
    @NotNull
    private final um0 d;

    @JvmOverloads
    public as(@NotNull bs bs2, @NotNull ug ug3, @NotNull xm0 xm02, @NotNull um0 um02) {
        this.a = bs2;
        this.b = ug3;
        this.c = xm02;
        this.d = um02;
    }

    public final void a(@NotNull n70 n702) {
        this.c.getClass();
        zb2 zb22 = n702.getAdUiElements();
        if (zb22 != null) {
            n702.removeView((View)zb22.a());
        }
        this.c.getClass();
        n702.setAdUiElements(null);
    }

    public final void a(@NotNull n70 n702, @NotNull in0 in02) {
        zb2 zb22 = this.d.a(n702);
        if (zb22 != null) {
            this.a.a(zb22, in02);
            this.b.a(zb22);
            in02 = new ViewGroup.LayoutParams(-1, -1);
            n702.addView((View)zb22.a(), (ViewGroup.LayoutParams)in02);
        }
        this.c.getClass();
        n702.setAdUiElements(zb22);
    }
}

