/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ad2
 *  com.yandex.mobile.ads.impl.dh2
 *  com.yandex.mobile.ads.impl.eh2
 *  com.yandex.mobile.ads.impl.kc2
 *  com.yandex.mobile.ads.impl.nd2
 *  com.yandex.mobile.ads.impl.xg2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ad2;
import com.yandex.mobile.ads.impl.dh2;
import com.yandex.mobile.ads.impl.eh2;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.nd2;
import com.yandex.mobile.ads.impl.xg2;
import com.yandex.mobile.ads.impl.yg2;
import org.jetbrains.annotations.NotNull;

public final class ka2<T>
implements nd2 {
    @NotNull
    private final kc2<T> a;
    @NotNull
    private final xg2 b;
    @NotNull
    private final ad2<T> c;
    @NotNull
    private final eh2 d;
    private boolean e;

    public /* synthetic */ ka2(kc2 kc22, dh2 dh22, yg2 yg22, ad2 ad22) {
        this(kc22, yg22, ad22, new eh2(dh22));
    }

    public ka2(@NotNull kc2 kc22, @NotNull yg2 yg22, @NotNull ad2 ad22, @NotNull eh2 eh22) {
        this.a = kc22;
        this.b = yg22;
        this.c = ad22;
        this.d = eh22;
    }

    public final void a(long l10, long l11) {
        if (!this.e && l11 > 0L && this.d.a()) {
            this.e = true;
            this.b.h();
            this.c.d(this.a);
        }
    }
}

