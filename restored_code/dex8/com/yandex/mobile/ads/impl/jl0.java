/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.jt0
 *  com.yandex.mobile.ads.instream.InstreamAdBreakEventListener
 *  com.yandex.mobile.ads.instream.newapi.adbreak.AdBreakData
 *  com.yandex.mobile.ads.instream.newapi.adbreak.AdBreakRequestData
 *  com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreak
 *  com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
 *  com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jt0;
import com.yandex.mobile.ads.impl.sn0;
import com.yandex.mobile.ads.impl.wl2;
import com.yandex.mobile.ads.impl.y1;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.newapi.adbreak.AdBreakData;
import com.yandex.mobile.ads.instream.newapi.adbreak.AdBreakRequestData;
import com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreak;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class jl0
implements InstreamAdBreak {
    @NotNull
    private final jt0 a;
    @NotNull
    private final AdBreakRequestData b;

    public jl0(@NotNull sn0 sn02, @NotNull wl2 wl22) {
        this.a = sn02;
        this.b = wl22;
    }

    @NotNull
    public final AdBreakData getAdBreakData() {
        return new y1(this.a.getInstreamAdBreak(), this.b);
    }

    public final void invalidate() {
        this.a.invalidate();
    }

    public final void pause() {
        this.a.pause();
    }

    public final void play(@NotNull InstreamAdView instreamAdView) {
        this.a.play(instreamAdView);
    }

    public final void prepare(@NotNull InstreamAdPlayer instreamAdPlayer) {
        this.a.prepare(instreamAdPlayer);
    }

    public final void resume() {
        this.a.resume();
    }

    public final void setListener(@Nullable InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.a.setListener(instreamAdBreakEventListener);
    }

    public final void setVideoAdPlaybackListener(@Nullable VideoAdPlaybackListener videoAdPlaybackListener) {
        this.a.setVideoAdPlaybackListener(videoAdPlaybackListener);
    }
}

