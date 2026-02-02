/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.i71
 *  com.yandex.mobile.ads.impl.jh2
 *  com.yandex.mobile.ads.impl.ko
 *  com.yandex.mobile.ads.impl.lo
 *  com.yandex.mobile.ads.impl.qr0
 *  com.yandex.mobile.ads.impl.vf
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.i71;
import com.yandex.mobile.ads.impl.jh2;
import com.yandex.mobile.ads.impl.ko;
import com.yandex.mobile.ads.impl.lo;
import com.yandex.mobile.ads.impl.qr0;
import com.yandex.mobile.ads.impl.vf;
import org.jetbrains.annotations.NotNull;

public final class w9
implements jh2 {
    @NotNull
    private final i71 a;
    @NotNull
    private final lo b;

    public w9(@NotNull i71 i712, @NotNull lo lo3) {
        this.a = i712;
        this.b = lo3;
    }

    public final void a(@NotNull View view, @NotNull vf vf3) {
    }

    public final void a(@NotNull vf<?> vf3, @NotNull ko ko3) {
        qr0 qr02 = vf3.a();
        this.b.a(vf3, qr02, this.a, ko3);
    }
}

