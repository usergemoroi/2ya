/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.instream.InstreamAdBreak
 *  com.yandex.mobile.ads.instream.InstreamAdBreakPosition
 *  com.yandex.mobile.ads.instream.newapi.adbreak.AdBreakData
 *  com.yandex.mobile.ads.instream.newapi.adbreak.AdBreakRequestData
 *  com.yandex.mobile.ads.video.playback.model.VideoAd
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.rm2;
import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.instream.newapi.adbreak.AdBreakData;
import com.yandex.mobile.ads.instream.newapi.adbreak.AdBreakRequestData;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import java.util.List;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;

public final class y1
implements AdBreakData {
    @NotNull
    private final InstreamAdBreak a;
    @NotNull
    private final AdBreakRequestData b;

    public y1(@NotNull InstreamAdBreak instreamAdBreak, @NotNull AdBreakRequestData adBreakRequestData) {
        this.a = instreamAdBreak;
        this.b = adBreakRequestData;
    }

    @NotNull
    public final InstreamAdBreakPosition getAdBreakPosition() {
        return this.a.getAdBreakPosition();
    }

    @NotNull
    public final AdBreakRequestData getRequestData() {
        return this.b;
    }

    @NotNull
    public final String getType() {
        return this.a.getType();
    }

    @NotNull
    public final List<VideoAd> getVideoAds() {
        Object object = this.a;
        object = object instanceof rm2 ? (rm2)object : null;
        object = object != null ? object.a() : t.m();
        return object;
    }
}

