/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bj
 *  com.yandex.mobile.ads.impl.ek2
 *  com.yandex.mobile.ads.impl.gu1
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.hi
 *  com.yandex.mobile.ads.impl.iz1
 *  com.yandex.mobile.ads.impl.jp0
 *  com.yandex.mobile.ads.impl.kg0
 *  com.yandex.mobile.ads.impl.m21
 *  com.yandex.mobile.ads.impl.nv1
 *  com.yandex.mobile.ads.impl.pv1
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bf2;
import com.yandex.mobile.ads.impl.bj;
import com.yandex.mobile.ads.impl.ek2;
import com.yandex.mobile.ads.impl.gu1;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.hi;
import com.yandex.mobile.ads.impl.iz1;
import com.yandex.mobile.ads.impl.ji;
import com.yandex.mobile.ads.impl.jp0;
import com.yandex.mobile.ads.impl.kg0;
import com.yandex.mobile.ads.impl.li;
import com.yandex.mobile.ads.impl.m21;
import com.yandex.mobile.ads.impl.nv1;
import com.yandex.mobile.ads.impl.pv1;
import com.yandex.mobile.ads.impl.x2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class hu1
implements nv1<gu1> {
    @NotNull
    private final gv1 a;
    @NotNull
    private final x2 b;
    @NotNull
    private final ji c;
    @Nullable
    private gu1 d;

    public hu1(@NotNull gv1 gv12, @NotNull x2 x22, @NotNull ji ji3) {
        this.a = gv12;
        this.b = x22;
        this.c = ji3;
    }

    public final void a() {
        gu1 gu12 = this.d;
        if (gu12 != null) {
            gu12.a();
        }
        this.d = null;
    }

    public final void a(@NotNull b8<String> gu12, @NotNull iz1 iz12, @NotNull String string2, @NotNull pv1<gu1> pv12) throws ek2 {
        Context context = this.c.k();
        jp0 jp02 = this.c.B();
        bf2 bf22 = this.c.D();
        gv1 gv12 = this.a;
        x2 x22 = this.b;
        this.d = gu12 = new gu1(context, gv12, x22, gu12, jp02, this.c, new li(), new m21(), new kg0(), new bj(context, x22), new hi());
        gu12.a(iz12, string2, bf22, pv12);
    }
}

