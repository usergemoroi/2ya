/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ea0
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.ju
 *  com.yandex.mobile.ads.impl.n50
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.ux1
 *  com.yandex.mobile.ads.impl.ux1$a
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.bg0;
import com.yandex.mobile.ads.impl.ea0;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.ju;
import com.yandex.mobile.ads.impl.kj;
import com.yandex.mobile.ads.impl.lj;
import com.yandex.mobile.ads.impl.n50;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.q7;
import com.yandex.mobile.ads.impl.t80;
import com.yandex.mobile.ads.impl.ux1;
import com.yandex.mobile.ads.impl.x2;
import kotlinx.coroutines.q0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class w80
extends lj<String> {
    @Nullable
    private final ea0 v;

    public /* synthetic */ w80(Context context, x2 x22, p4 p42, ea0 ea02, gv1 gv12) {
        this(context, x22, p42, ea02, ju.a((n50)gv12.c()));
    }

    protected w80(@NotNull Context context, @NotNull x2 x22, @NotNull p4 p42, @Nullable ea0 ea02, @NotNull q0 q02) {
        super(context, p42, x22, q02);
        this.v = ea02;
    }

    @Override
    @NotNull
    protected final kj<String> a(@NotNull String string2, @NotNull String string3) {
        Context context = this.k();
        x2 x22 = this.e();
        ea0 ea02 = this.v;
        ux1.a.getClass();
        return new t80(context, x22, string2, string3, this, this, ea02, ux1.a.a((Context)context), new bg0(), new q7());
    }
}

