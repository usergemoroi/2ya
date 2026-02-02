/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.at0
 *  com.yandex.mobile.ads.impl.b01
 *  com.yandex.mobile.ads.impl.fx
 *  com.yandex.mobile.ads.impl.he
 *  com.yandex.mobile.ads.impl.ir
 *  com.yandex.mobile.ads.impl.is0
 *  com.yandex.mobile.ads.impl.tv
 *  com.yandex.mobile.ads.impl.xv1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.at0;
import com.yandex.mobile.ads.impl.b01;
import com.yandex.mobile.ads.impl.fx;
import com.yandex.mobile.ads.impl.he;
import com.yandex.mobile.ads.impl.ir;
import com.yandex.mobile.ads.impl.is0;
import com.yandex.mobile.ads.impl.tv;
import com.yandex.mobile.ads.impl.xv1;
import org.jetbrains.annotations.NotNull;

public final class js0
implements is0 {
    @NotNull
    private final he a;
    @NotNull
    private final xv1 b;
    @NotNull
    private final b01 c;
    @NotNull
    private final ir d;
    @NotNull
    private final tv e;
    @NotNull
    private final at0 f;

    public js0(@NotNull he he2, @NotNull xv1 xv12, @NotNull b01 b012, @NotNull ir ir2, @NotNull tv tv3, @NotNull at0 at02) {
        this.a = he2;
        this.b = xv12;
        this.c = b012;
        this.d = ir2;
        this.e = tv3;
        this.f = at02;
    }

    @NotNull
    public final fx a() {
        return new fx(this.a.a(), this.b.a(), this.c.a(), this.d.a(), this.e.a(), this.f.a());
    }

    public final void a(boolean bl2) {
        this.e.a(bl2);
    }
}

