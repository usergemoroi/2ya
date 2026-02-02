/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.MainThread
 *  com.yandex.mobile.ads.impl.bt
 *  com.yandex.mobile.ads.impl.en2
 *  com.yandex.mobile.ads.impl.ho0
 *  com.yandex.mobile.ads.impl.kl1
 *  com.yandex.mobile.ads.impl.o82
 *  com.yandex.mobile.ads.impl.ys
 *  com.yandex.mobile.ads.instream.InstreamAd
 *  com.yandex.mobile.ads.instream.InstreamAdListener
 *  com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer
 *  com.yandex.mobile.ads.instream.player.content.VideoPlayer
 *  com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.instream;

import android.content.Context;
import androidx.annotation.MainThread;
import com.yandex.mobile.ads.impl.an2;
import com.yandex.mobile.ads.impl.bt;
import com.yandex.mobile.ads.impl.en2;
import com.yandex.mobile.ads.impl.ho0;
import com.yandex.mobile.ads.impl.kl1;
import com.yandex.mobile.ads.impl.ko2;
import com.yandex.mobile.ads.impl.mo2;
import com.yandex.mobile.ads.impl.o82;
import com.yandex.mobile.ads.impl.ts;
import com.yandex.mobile.ads.impl.xm2;
import com.yandex.mobile.ads.impl.xn2;
import com.yandex.mobile.ads.impl.ys;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdListener;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.instream.player.content.VideoPlayer;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import kotlin.Metadata;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000f\u0010\tJ\r\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0010\u0010\tJ\u0017\u0010\u0012\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2={"Lcom/yandex/mobile/ads/instream/InstreamAdBinder;", "Lcom/yandex/mobile/ads/impl/kl1;", "Lcom/yandex/mobile/ads/impl/o82;", "Lcom/yandex/mobile/ads/instream/player/ad/InstreamAdView;", "instreamAdView", "Lkotlin/k0;", "bind", "(Lcom/yandex/mobile/ads/instream/player/ad/InstreamAdView;)V", "invalidateVideoPlayer", "()V", "invalidateAdPlayer", "Lcom/yandex/mobile/ads/instream/InstreamAdListener;", "listener", "setInstreamAdListener", "(Lcom/yandex/mobile/ads/instream/InstreamAdListener;)V", "unbind", "prepareAd", "Lcom/yandex/mobile/ads/video/playback/VideoAdPlaybackListener;", "setVideoAdPlaybackListener", "(Lcom/yandex/mobile/ads/video/playback/VideoAdPlaybackListener;)V", "Landroid/content/Context;", "context", "Lcom/yandex/mobile/ads/instream/InstreamAd;", "instreamAd", "Lcom/yandex/mobile/ads/instream/player/ad/InstreamAdPlayer;", "instreamAdPlayer", "Lcom/yandex/mobile/ads/instream/player/content/VideoPlayer;", "videoPlayer", "<init>", "(Landroid/content/Context;Lcom/yandex/mobile/ads/instream/InstreamAd;Lcom/yandex/mobile/ads/instream/player/ad/InstreamAdPlayer;Lcom/yandex/mobile/ads/instream/player/content/VideoPlayer;)V", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
@MainThread
public final class InstreamAdBinder
extends kl1
implements o82 {
    @NotNull
    private final en2 a;
    @NotNull
    private final ts b;

    public InstreamAdBinder(@NotNull Context context, @NotNull InstreamAd instreamAd, @NotNull InstreamAdPlayer object, @NotNull VideoPlayer videoPlayer) {
        en2 en22;
        xn2 xn22 = new xn2(context);
        this.a = en22 = new en2();
        object = new an2((InstreamAdPlayer)object, en22);
        this.b = new ts(context, xn22, bt.a((InstreamAd)instreamAd), (ys)object, new mo2(videoPlayer));
    }

    public final void bind(@NotNull InstreamAdView instreamAdView) {
        this.b.a(instreamAdView, t.m());
    }

    public void invalidateAdPlayer() {
        this.b.invalidateAdPlayer();
    }

    public final void invalidateVideoPlayer() {
        this.b.a();
    }

    public final void prepareAd() {
        this.b.b();
    }

    public final void setInstreamAdListener(@Nullable InstreamAdListener object) {
        object = object != null ? new xm2((InstreamAdListener)object) : null;
        this.b.a((xm2)object);
    }

    public final void setVideoAdPlaybackListener(@Nullable VideoAdPlaybackListener object) {
        object = object != null ? new ko2((VideoAdPlaybackListener)object, this.a) : null;
        this.b.a((ho0)object);
    }

    public final void unbind() {
        this.b.e();
    }
}

