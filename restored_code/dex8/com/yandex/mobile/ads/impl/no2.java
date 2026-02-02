/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.du
 *  com.yandex.mobile.ads.instream.player.content.VideoPlayerListener
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.du;
import com.yandex.mobile.ads.impl.wf2;
import com.yandex.mobile.ads.instream.player.content.VideoPlayerListener;
import org.jetbrains.annotations.NotNull;

public final class no2
implements VideoPlayerListener {
    @NotNull
    private final du a;

    public no2(@NotNull wf2 wf22) {
        this.a = wf22;
    }

    public final void onVideoCompleted() {
        this.a.onVideoCompleted();
    }

    public final void onVideoError() {
        this.a.onVideoError();
    }

    public final void onVideoPaused() {
        this.a.onVideoPaused();
    }

    public final void onVideoPrepared() {
        this.a.onVideoPrepared();
    }

    public final void onVideoResumed() {
        this.a.onVideoResumed();
    }
}

