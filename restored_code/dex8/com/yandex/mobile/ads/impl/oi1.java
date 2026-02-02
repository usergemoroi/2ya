/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.media3.common.Player
 *  androidx.media3.common.Timeline
 *  androidx.media3.common.Timeline$Period
 *  com.yandex.mobile.ads.impl.sj1
 *  com.yandex.mobile.ads.impl.ui1
 */
package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import com.yandex.mobile.ads.impl.sj1;
import com.yandex.mobile.ads.impl.ui1;
import org.jetbrains.annotations.NotNull;

public final class oi1
implements sj1 {
    @NotNull
    private final Player a;
    @NotNull
    private final ui1 b;

    public oi1(@NotNull Player player, @NotNull ui1 ui12) {
        this.a = player;
        this.b = ui12;
    }

    public final long a() {
        Timeline timeline = this.b.b();
        Timeline.Period period = this.b.a();
        long l10 = this.a.getContentPosition();
        long l11 = !timeline.isEmpty() ? timeline.getPeriod(0, period).getPositionInWindowMs() : 0L;
        return l10 - l11;
    }
}

