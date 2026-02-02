/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.en2
 *  com.yandex.mobile.ads.impl.ho0
 *  com.yandex.mobile.ads.impl.jt0
 *  com.yandex.mobile.ads.instream.InstreamAdBreak
 *  com.yandex.mobile.ads.instream.InstreamAdBreakEventListener
 *  com.yandex.mobile.ads.instream.inroll.Inroll
 *  com.yandex.mobile.ads.instream.pauseroll.Pauseroll
 *  com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
 *  com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.an2;
import com.yandex.mobile.ads.impl.en2;
import com.yandex.mobile.ads.impl.ho0;
import com.yandex.mobile.ads.impl.jt0;
import com.yandex.mobile.ads.impl.ko2;
import com.yandex.mobile.ads.impl.mt0;
import com.yandex.mobile.ads.impl.rm2;
import com.yandex.mobile.ads.impl.sm2;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.inroll.Inroll;
import com.yandex.mobile.ads.instream.pauseroll.Pauseroll;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class sn0
implements Inroll,
Pauseroll,
jt0 {
    @NotNull
    private final mt0 a;
    @NotNull
    private final en2 b;

    public /* synthetic */ sn0(mt0 mt02) {
        this(mt02, new en2());
    }

    public sn0(@NotNull mt0 mt02, @NotNull en2 en22) {
        mt02.getClass();
        this.a = mt02;
        this.b = en22;
    }

    @NotNull
    public final InstreamAdBreak getInstreamAdBreak() {
        return new rm2(this.a.a());
    }

    public final void invalidate() {
        this.a.b();
    }

    public final void pause() {
        this.a.c();
    }

    public final void play(@NotNull InstreamAdView instreamAdView) {
        this.a.a(instreamAdView);
    }

    public final void prepare(@NotNull InstreamAdPlayer object) {
        object = new an2((InstreamAdPlayer)object, this.b);
        this.a.a((an2)object);
    }

    public final void resume() {
        this.a.d();
    }

    public final void setListener(@Nullable InstreamAdBreakEventListener object) {
        object = object != null ? new sm2((InstreamAdBreakEventListener)object) : null;
        this.a.a((sm2)object);
    }

    public final void setVideoAdPlaybackListener(@Nullable VideoAdPlaybackListener object) {
        object = object != null ? new ko2((VideoAdPlaybackListener)object, this.b) : null;
        this.a.a((ho0)object);
    }
}

