/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.Player
 *  com.google.android.exoplayer2.d3
 *  com.google.android.exoplayer2.d3$b
 *  com.yandex.mobile.ads.impl.tj1
 *  com.yandex.mobile.ads.impl.vi1
 */
package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.d3;
import com.yandex.mobile.ads.impl.tj1;
import com.yandex.mobile.ads.impl.vi1;
import org.jetbrains.annotations.NotNull;

public final class pi1
implements tj1 {
    @NotNull
    private final Player a;
    @NotNull
    private final vi1 b;

    public pi1(@NotNull Player player, @NotNull vi1 vi12) {
        this.a = player;
        this.b = vi12;
    }

    public final long a() {
        d3 d34 = this.b.b();
        d3.b b10 = this.b.a();
        long l10 = this.a.getContentPosition();
        long l11 = !d34.u() ? d34.j(0, b10).p() : 0L;
        return l10 - l11;
    }
}

