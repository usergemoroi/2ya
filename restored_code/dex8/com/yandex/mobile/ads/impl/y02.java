/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.af0
 *  com.yandex.mobile.ads.impl.g12
 *  com.yandex.mobile.ads.impl.jy1
 *  com.yandex.mobile.ads.impl.t
 *  com.yandex.mobile.ads.impl.v
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.af0;
import com.yandex.mobile.ads.impl.g12;
import com.yandex.mobile.ads.impl.jy1;
import com.yandex.mobile.ads.impl.t;
import com.yandex.mobile.ads.impl.v;
import com.yandex.mobile.ads.impl.x02;
import org.jetbrains.annotations.NotNull;

public final class y02
implements v<x02> {
    @NotNull
    private final jy1 a;
    @NotNull
    private final g12 b;

    public y02(@NotNull jy1 jy12, @NotNull g12 g122) {
        this.a = jy12;
        this.b = g122;
    }

    public final af0 a(View view, t t13) {
        t13 = (x02)t13;
        this.a.a(t13.c());
        this.b.a(view, (x02)t13);
        return new af0(false);
    }
}

