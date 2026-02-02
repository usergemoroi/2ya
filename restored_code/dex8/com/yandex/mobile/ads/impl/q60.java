/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.android.exoplayer2.PlaybackException
 *  com.google.android.exoplayer2.Player
 *  com.google.android.exoplayer2.Player$d
 *  com.google.android.exoplayer2.Player$e
 *  com.google.android.exoplayer2.d3
 *  com.yandex.mobile.ads.impl.bl
 *  com.yandex.mobile.ads.impl.gi1
 *  com.yandex.mobile.ads.impl.li1
 *  com.yandex.mobile.ads.impl.n52
 *  com.yandex.mobile.ads.impl.ri1
 *  com.yandex.mobile.ads.impl.uh1
 *  com.yandex.mobile.ads.impl.v60
 */
package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.d3;
import com.yandex.mobile.ads.impl.bl;
import com.yandex.mobile.ads.impl.gi1;
import com.yandex.mobile.ads.impl.li1;
import com.yandex.mobile.ads.impl.n52;
import com.yandex.mobile.ads.impl.ri1;
import com.yandex.mobile.ads.impl.uh1;
import com.yandex.mobile.ads.impl.v60;
import org.jetbrains.annotations.NotNull;

public final class q60
implements Player.d {
    @NotNull
    private final bl a;
    @NotNull
    private final v60 b;
    @NotNull
    private final gi1 c;
    @NotNull
    private final ri1 d;
    @NotNull
    private final li1 e;
    @NotNull
    private final n52 f;
    @NotNull
    private final uh1 g;

    public q60(@NotNull bl bl2, @NotNull v60 v602, @NotNull gi1 gi12, @NotNull ri1 ri12, @NotNull li1 li12, @NotNull n52 n522, @NotNull uh1 uh12) {
        this.a = bl2;
        this.b = v602;
        this.c = gi12;
        this.d = ri12;
        this.e = li12;
        this.f = n522;
        this.g = uh12;
    }

    public final void onPlayWhenReadyChanged(boolean bl2, int n10) {
        Player player = this.b.a();
        if (this.a.b() && player != null) {
            this.d.a(bl2, player.getPlaybackState());
        }
    }

    public final void onPlaybackStateChanged(int n10) {
        Player player = this.b.a();
        if (this.a.b() && player != null) {
            this.c.a(n10, player);
        }
    }

    public final void onPlayerError(@NotNull PlaybackException playbackException) {
        this.e.a((Exception)playbackException);
    }

    public final void onPositionDiscontinuity(@NotNull Player.e e11, @NotNull Player.e e14, int n10) {
        this.g.a();
    }

    public final void onRenderedFirstFrame() {
        Player player = this.b.a();
        if (player != null) {
            this.onPlaybackStateChanged(player.getPlaybackState());
        }
    }

    public final void onTimelineChanged(@NotNull d3 d34, int n10) {
        this.f.a(d34);
    }
}

