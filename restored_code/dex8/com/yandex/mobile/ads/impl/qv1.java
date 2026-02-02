/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.vc0
 *  com.yandex.mobile.ads.impl.wc0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cd0;
import com.yandex.mobile.ads.impl.es1;
import com.yandex.mobile.ads.impl.gf;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.kv1;
import com.yandex.mobile.ads.impl.qp0;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.wc0;
import org.jetbrains.annotations.NotNull;

public final class qv1
implements wc0 {
    @NotNull
    private final gv1 a;

    public qv1(@NotNull gv1 gv12) {
        this.a = gv12;
    }

    @NotNull
    public final vc0<qp0> a(@NotNull cd0<qp0> cd02) {
        return new kv1<qp0>(cd02, this.a);
    }

    @NotNull
    public final vc0<es1> b(@NotNull cd0<es1> cd02) {
        return new kv1<es1>(cd02, this.a);
    }

    @NotNull
    public final vc0<gf> c(@NotNull cd0<gf> cd02) {
        return new kv1<gf>(cd02, this.a);
    }
}

