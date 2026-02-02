/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.bu1
 *  com.yandex.mobile.ads.impl.md0
 *  com.yandex.mobile.ads.impl.rs1
 *  com.yandex.mobile.ads.impl.vc0
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.bu1;
import com.yandex.mobile.ads.impl.dg0;
import com.yandex.mobile.ads.impl.es1;
import com.yandex.mobile.ads.impl.md0;
import com.yandex.mobile.ads.impl.oc0;
import com.yandex.mobile.ads.impl.rs1;
import com.yandex.mobile.ads.impl.sd0;
import com.yandex.mobile.ads.impl.vc0;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.ym1;
import org.jetbrains.annotations.NotNull;

public final class fs1
implements md0<es1> {
    @NotNull
    private final Context a;

    public fs1(@NotNull Context context) {
        this.a = context;
    }

    public final sd0 a(b8 b82, x2 x22, vc0 vc02) {
        Context context = this.a;
        ym1 ym12 = new ym1();
        return new es1(context, (b8<String>)b82, x22, (vc0<es1>)vc02, ym12, new rs1(ym12), new dg0(), new oc0(), new bu1(x22));
    }
}

