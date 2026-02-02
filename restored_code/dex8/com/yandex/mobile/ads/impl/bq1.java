/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cq1
 *  com.yandex.mobile.ads.impl.xw0
 *  okio.f
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cq1;
import com.yandex.mobile.ads.impl.xw0;
import okio.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class bq1
extends cq1 {
    final xw0 a;
    final int b;
    final byte[] c;
    final int d;

    bq1(xw0 xw02, byte[] byArray, int n10, int n12) {
        this.a = xw02;
        this.b = n10;
        this.c = byArray;
        this.d = n12;
    }

    public final long a() {
        return this.b;
    }

    public final void a(@NotNull f f10) {
        f10.write(this.c, this.d, this.b);
    }

    @Nullable
    public final xw0 b() {
        return this.a;
    }
}

