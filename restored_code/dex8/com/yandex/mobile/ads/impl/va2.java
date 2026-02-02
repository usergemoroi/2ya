/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dh2
 *  com.yandex.mobile.ads.impl.eh2
 *  com.yandex.mobile.ads.impl.hd2
 *  com.yandex.mobile.ads.impl.nd2
 *  com.yandex.mobile.ads.impl.xg2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dh2;
import com.yandex.mobile.ads.impl.eh2;
import com.yandex.mobile.ads.impl.hd2;
import com.yandex.mobile.ads.impl.nd2;
import com.yandex.mobile.ads.impl.xg2;
import com.yandex.mobile.ads.impl.yg2;
import org.jetbrains.annotations.NotNull;

public final class va2<T>
implements nd2 {
    @NotNull
    private final xg2 a;
    @NotNull
    private final hd2<T> b;
    @NotNull
    private final eh2 c;
    private boolean d;

    public /* synthetic */ va2(dh2 dh22, yg2 yg22, hd2 hd22) {
        this(yg22, hd22, new eh2(dh22));
    }

    public va2(@NotNull yg2 yg22, @NotNull hd2 hd22, @NotNull eh2 eh22) {
        this.a = yg22;
        this.b = hd22;
        this.c = eh22;
    }

    public final void a(long l10, long l11) {
        if (!this.d && l11 > 0L && this.c.a()) {
            this.d = true;
            this.a.a(this.b.getVolume(), l10);
        }
    }
}

