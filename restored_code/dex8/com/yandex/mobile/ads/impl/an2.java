/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bn2
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.en2
 *  com.yandex.mobile.ads.impl.ys
 *  com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
 *  com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
 *  com.yandex.mobile.ads.video.playback.model.VideoAd
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bn2;
import com.yandex.mobile.ads.impl.cn2;
import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.en2;
import com.yandex.mobile.ads.impl.hm0;
import com.yandex.mobile.ads.impl.ys;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class an2
implements ys {
    @NotNull
    private final InstreamAdPlayer a;
    @NotNull
    private final en2 b;

    public an2(@NotNull InstreamAdPlayer instreamAdPlayer, @NotNull en2 en22) {
        this.a = instreamAdPlayer;
        this.b = en22;
    }

    public final long a(@NotNull co0 co02) {
        return this.b.a(co02).getDuration();
    }

    public final void a(@NotNull co0 co02, float f10) {
        co02 = this.b.a(co02);
        this.a.setVolume((VideoAd)co02, f10);
    }

    public final void a(@Nullable hm0 object) {
        object = object != null ? new cn2((hm0)object, this.b, new bn2()) : null;
        this.a.setInstreamAdPlayerListener((InstreamAdPlayerListener)object);
    }

    public final long b(@NotNull co0 co02) {
        co02 = this.b.a(co02);
        return this.a.getAdPosition((VideoAd)co02);
    }

    public final void c(@NotNull co0 co02) {
        co02 = this.b.a(co02);
        this.a.playAd((VideoAd)co02);
    }

    public final void d(@NotNull co0 co02) {
        co02 = this.b.a(co02);
        this.a.prepareAd((VideoAd)co02);
    }

    public final void e(@NotNull co0 co02) {
        VideoAd videoAd = this.b.a(co02);
        this.a.releaseAd(videoAd);
        this.b.b(co02);
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof an2 && y.e(((an2)object).a, this.a);
        return bl2;
    }

    public final void f(@NotNull co0 co02) {
        co02 = this.b.a(co02);
        this.a.pauseAd((VideoAd)co02);
    }

    public final void g(@NotNull co0 co02) {
        co02 = this.b.a(co02);
        this.a.resumeAd((VideoAd)co02);
    }

    public final void h(@NotNull co0 co02) {
        co02 = this.b.a(co02);
        this.a.skipAd((VideoAd)co02);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(@NotNull co0 co02) {
        co02 = this.b.a(co02);
        this.a.stopAd((VideoAd)co02);
    }

    public final boolean j(@NotNull co0 co02) {
        co02 = this.b.a(co02);
        return this.a.isPlayingAd((VideoAd)co02);
    }

    public final float k(@NotNull co0 co02) {
        co02 = this.b.a(co02);
        return this.a.getVolume((VideoAd)co02);
    }
}

