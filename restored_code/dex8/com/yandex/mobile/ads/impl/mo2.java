/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cu
 *  com.yandex.mobile.ads.instream.player.content.VideoPlayer
 *  com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cu;
import com.yandex.mobile.ads.impl.no2;
import com.yandex.mobile.ads.impl.wf2;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class mo2
implements cu {
    @NotNull
    private final VideoPlayer a;

    public mo2(@NotNull VideoPlayer videoPlayer) {
        this.a = videoPlayer;
    }

    public final void a(@Nullable wf2 object) {
        object = object != null ? new no2((wf2)object) : null;
        this.a.setVideoPlayerListener((VideoPlayerListener)object);
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof mo2)) {
            return false;
        }
        object = (mo2)object;
        return y.e(this.a, ((mo2)object).a);
    }

    public final long getVideoDuration() {
        return this.a.getVideoDuration();
    }

    public final long getVideoPosition() {
        return this.a.getVideoPosition();
    }

    public final float getVolume() {
        return this.a.getVolume();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void pauseVideo() {
        this.a.pauseVideo();
    }

    public final void prepareVideo() {
        this.a.prepareVideo();
    }

    public final void resumeVideo() {
        this.a.resumeVideo();
    }

    @NotNull
    public final String toString() {
        VideoPlayer videoPlayer = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("YandexVideoPlayerAdapter(videoPlayer=");
        stringBuilder.append(videoPlayer);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

