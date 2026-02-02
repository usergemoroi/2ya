/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.md0
 *  com.yandex.mobile.ads.impl.vc0
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.dg0;
import com.yandex.mobile.ads.impl.gf;
import com.yandex.mobile.ads.impl.md0;
import com.yandex.mobile.ads.impl.oc0;
import com.yandex.mobile.ads.impl.sd0;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.x2;
import org.jetbrains.annotations.NotNull;

public final class hf
implements md0<gf> {
    @NotNull
    private final Context a;

    public hf(@NotNull Context context) {
        this.a = context;
    }

    public final sd0 a(b8 b82, x2 x22, vc0 vc02) {
        return new gf(this.a, b82, x22, new oc0(), new dg0(), vc02);
    }
}

