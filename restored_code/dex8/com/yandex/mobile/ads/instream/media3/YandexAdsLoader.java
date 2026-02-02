/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup
 *  androidx.annotation.MainThread
 *  androidx.media3.common.AdViewProvider
 *  androidx.media3.common.Player
 *  androidx.media3.datasource.DataSpec
 *  androidx.media3.exoplayer.source.ads.AdsLoader$EventListener
 *  androidx.media3.exoplayer.source.ads.AdsMediaSource
 *  com.yandex.mobile.ads.impl.bn0
 *  com.yandex.mobile.ads.impl.en2
 *  com.yandex.mobile.ads.impl.ua
 *  com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration
 *  com.yandex.mobile.ads.instream.media3.YandexAdsLoader$a
 *  com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.instream.media3;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.Player;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import com.yandex.mobile.ads.impl.bn0;
import com.yandex.mobile.ads.impl.dn2;
import com.yandex.mobile.ads.impl.en2;
import com.yandex.mobile.ads.impl.ko2;
import com.yandex.mobile.ads.impl.nl1;
import com.yandex.mobile.ads.impl.ua;
import com.yandex.mobile.ads.impl.xn2;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import com.yandex.mobile.ads.instream.media3.YandexAdsLoader;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0017\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u00a2\u0006\u0004\b0\u00101J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u00042\n\u0010\u0013\u001a\u00020\u0011\"\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0014\u0010\u0015J7\u0010 \u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\b\"\u0010#J'\u0010&\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b&\u0010'J/\u0010*\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00122\u0006\u0010)\u001a\u00020(H\u0016\u00a2\u0006\u0004\b*\u0010+\u00a8\u00063"}, d2={"Lcom/yandex/mobile/ads/instream/media3/YandexAdsLoader;", "Lcom/yandex/mobile/ads/impl/nl1;", "Landroid/view/ViewGroup;", "adViewGroup", "Lkotlin/k0;", "requestAds", "(Landroid/view/ViewGroup;)V", "Lcom/yandex/mobile/ads/video/playback/VideoAdPlaybackListener;", "listener", "setVideoAdPlaybackListener", "(Lcom/yandex/mobile/ads/video/playback/VideoAdPlaybackListener;)V", "Landroidx/media3/common/Player;", "player", "setPlayer", "(Landroidx/media3/common/Player;)V", "release", "()V", "", "", "contentTypes", "setSupportedContentTypes", "([I)V", "Landroidx/media3/exoplayer/source/ads/AdsMediaSource;", "adsMediaSource", "Landroidx/media3/datasource/DataSpec;", "adTagDataSpec", "", "adPlaybackId", "Landroidx/media3/common/AdViewProvider;", "adViewProvider", "Landroidx/media3/exoplayer/source/ads/AdsLoader$EventListener;", "eventListener", "start", "(Landroidx/media3/exoplayer/source/ads/AdsMediaSource;Landroidx/media3/datasource/DataSpec;Ljava/lang/Object;Landroidx/media3/common/AdViewProvider;Landroidx/media3/exoplayer/source/ads/AdsLoader$EventListener;)V", "stop", "(Landroidx/media3/exoplayer/source/ads/AdsMediaSource;Landroidx/media3/exoplayer/source/ads/AdsLoader$EventListener;)V", "adGroupIndex", "adIndexInAdGroup", "handlePrepareComplete", "(Landroidx/media3/exoplayer/source/ads/AdsMediaSource;II)V", "Ljava/io/IOException;", "exception", "handlePrepareError", "(Landroidx/media3/exoplayer/source/ads/AdsMediaSource;IILjava/io/IOException;)V", "Landroid/content/Context;", "context", "Lcom/yandex/mobile/ads/instream/InstreamAdRequestConfiguration;", "requestConfiguration", "<init>", "(Landroid/content/Context;Lcom/yandex/mobile/ads/instream/InstreamAdRequestConfiguration;)V", "a", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
@MainThread
public final class YandexAdsLoader
extends nl1 {
    @NotNull
    public static final String AD_TAG_URI = "yandex://ad_tag";
    @NotNull
    public static final a a = new /* Unavailable Anonymous Inner Class!! */;
    @NotNull
    private final bn0 b;
    @NotNull
    private final en2 c;

    public YandexAdsLoader(@NotNull Context context, @NotNull InstreamAdRequestConfiguration object) {
        object = new dn2((InstreamAdRequestConfiguration)object);
        this.b = new ua(context, new xn2(context), (dn2)object).a();
        this.c = new en2();
    }

    public void handlePrepareComplete(@NotNull AdsMediaSource adsMediaSource, int n10, int n13) {
        this.b.a(n10, n13);
    }

    public void handlePrepareError(@NotNull AdsMediaSource adsMediaSource, int n10, int n13, @NotNull IOException iOException) {
        this.b.a(n10, n13, iOException);
    }

    public void release() {
        this.b.a();
    }

    public final void requestAds(@Nullable ViewGroup viewGroup) {
        this.b.a(viewGroup, t.m());
    }

    public void setPlayer(@Nullable Player player) {
        this.b.a(player);
    }

    public void setSupportedContentTypes(int ... nArray) {
    }

    public final void setVideoAdPlaybackListener(@Nullable VideoAdPlaybackListener object) {
        object = object != null ? new ko2((VideoAdPlaybackListener)object, this.c) : null;
        this.b.a((ko2)object);
    }

    public void start(@NotNull AdsMediaSource adsMediaSource, @NotNull DataSpec dataSpec, @NotNull Object object, @NotNull AdViewProvider adViewProvider, @NotNull AdsLoader.EventListener eventListener) {
        this.b.a(eventListener, adViewProvider, object);
    }

    public void stop(@NotNull AdsMediaSource adsMediaSource, @NotNull AdsLoader.EventListener eventListener) {
        this.b.b();
    }
}

