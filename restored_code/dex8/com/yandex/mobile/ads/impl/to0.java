/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ae2
 *  com.yandex.mobile.ads.impl.be2
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.dh2
 *  com.yandex.mobile.ads.impl.g31
 *  com.yandex.mobile.ads.impl.hd2
 *  com.yandex.mobile.ads.impl.nd2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ae2;
import com.yandex.mobile.ads.impl.be2;
import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.dh2;
import com.yandex.mobile.ads.impl.fh2;
import com.yandex.mobile.ads.impl.g31;
import com.yandex.mobile.ads.impl.hd2;
import com.yandex.mobile.ads.impl.nd2;
import com.yandex.mobile.ads.impl.ro0;
import com.yandex.mobile.ads.impl.yn0;
import org.jetbrains.annotations.NotNull;

public final class to0
implements nd2 {
    @NotNull
    private final hd2<co0> a;
    @NotNull
    private final be2 b;
    @NotNull
    private final fh2 c;

    public /* synthetic */ to0(yn0 yn02, ro0 ro02, be2 be22) {
        this(yn02, ro02, be22, new g31());
    }

    public to0(@NotNull yn0 yn02, @NotNull ro0 ro02, @NotNull be2 be22, @NotNull g31 g312) {
        this.a = yn02;
        this.b = be22;
        g312.getClass();
        this.c = g31.a((dh2)ro02);
    }

    public final void a(long l10, long l11) {
        boolean bl2 = this.c.a();
        if (this.b.a() != ae2.i) {
            if (bl2) {
                if (!this.a.isPlayingAd()) {
                    this.a.resumeAd();
                }
            } else if (this.a.isPlayingAd()) {
                this.a.pauseAd();
            }
        }
    }
}

