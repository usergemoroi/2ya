/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.jo
 *  com.yandex.mobile.ads.impl.ko
 *  com.yandex.mobile.ads.impl.mo
 *  com.yandex.mobile.ads.impl.qr0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.i21;
import com.yandex.mobile.ads.impl.jo;
import com.yandex.mobile.ads.impl.ko;
import com.yandex.mobile.ads.impl.mo;
import com.yandex.mobile.ads.impl.qr0;
import com.yandex.mobile.ads.impl.x21;
import org.jetbrains.annotations.NotNull;

public final class j21
implements ko {
    @NotNull
    private final x21 a;

    public j21(@NotNull x21 x212) {
        this.a = x212;
    }

    public final void a(@NotNull qr0 object, @NotNull mo mo3) {
        object = new i21((qr0)object, mo3);
        this.a.setClickListener((jo)object);
    }
}

