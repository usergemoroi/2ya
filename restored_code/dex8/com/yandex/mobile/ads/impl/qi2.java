/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.dh2
 *  com.yandex.mobile.ads.impl.ee2
 *  com.yandex.mobile.ads.impl.g31
 *  com.yandex.mobile.ads.impl.hd2
 *  com.yandex.mobile.ads.impl.nd2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dh2;
import com.yandex.mobile.ads.impl.ee2;
import com.yandex.mobile.ads.impl.g31;
import com.yandex.mobile.ads.impl.hd2;
import com.yandex.mobile.ads.impl.nd2;
import com.yandex.mobile.ads.impl.ua1;
import com.yandex.mobile.ads.impl.zb1;
import org.jetbrains.annotations.NotNull;

public final class qi2
implements nd2 {
    @NotNull
    private final hd2<?> a;
    @NotNull
    private final ee2 b;

    public qi2(@NotNull ua1 ua12, @NotNull ee2 ee22) {
        this.a = ua12;
        this.b = ee22;
    }

    public /* synthetic */ qi2(ua1 ua12, zb1 zb12) {
        this(ua12, g31.a((dh2)zb12));
    }

    public final void a(long l10, long l11) {
        if (this.b.a()) {
            if (!this.a.isPlayingAd()) {
                this.a.resumeAd();
            }
        } else if (this.a.isPlayingAd()) {
            this.a.pauseAd();
        }
    }
}

