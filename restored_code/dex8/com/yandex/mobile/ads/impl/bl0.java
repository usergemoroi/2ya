/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.jx
 *  kotlin.jvm.functions.l
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ak;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.jx;
import kotlin.jvm.functions.l;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class bl0
implements ak.a<jx> {
    final l<jx, k0> a;
    final l<dj2, k0> b;

    bl0(l<? super jx, k0> l10, l<? super dj2, k0> l11) {
        this.a = l10;
        this.b = l11;
    }

    public final void a(@NotNull dj2 dj22) {
        this.b.invoke((Object)dj22);
    }

    public final void a(Object object) {
        object = (jx)object;
        this.a.invoke(object);
    }
}

