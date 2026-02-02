/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.media3.common.AudioAttributes
 *  androidx.media3.common.DeviceInfo
 *  androidx.media3.common.MediaItem
 *  androidx.media3.common.MediaMetadata
 *  androidx.media3.common.Metadata
 *  androidx.media3.common.PlaybackException
 *  androidx.media3.common.PlaybackParameters
 *  androidx.media3.common.Player
 *  androidx.media3.common.Player$Commands
 *  androidx.media3.common.Player$Events
 *  androidx.media3.common.Player$Listener
 *  androidx.media3.common.Player$PositionInfo
 *  androidx.media3.common.Timeline
 *  androidx.media3.common.TrackSelectionParameters
 *  androidx.media3.common.Tracks
 *  androidx.media3.common.VideoSize
 *  androidx.media3.common.e0
 *  androidx.media3.common.text.CueGroup
 *  com.yandex.mobile.ads.impl.al
 *  com.yandex.mobile.ads.impl.fi1
 *  com.yandex.mobile.ads.impl.ki1
 *  com.yandex.mobile.ads.impl.m52
 *  com.yandex.mobile.ads.impl.qi1
 *  com.yandex.mobile.ads.impl.th1
 *  com.yandex.mobile.ads.impl.u60
 */
package com.yandex.mobile.ads.impl;

import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.e0;
import androidx.media3.common.text.CueGroup;
import com.yandex.mobile.ads.impl.al;
import com.yandex.mobile.ads.impl.fi1;
import com.yandex.mobile.ads.impl.ki1;
import com.yandex.mobile.ads.impl.m52;
import com.yandex.mobile.ads.impl.qi1;
import com.yandex.mobile.ads.impl.th1;
import com.yandex.mobile.ads.impl.u60;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class p60
implements Player.Listener {
    @NotNull
    private final al a;
    @NotNull
    private final u60 b;
    @NotNull
    private final fi1 c;
    @NotNull
    private final qi1 d;
    @NotNull
    private final ki1 e;
    @NotNull
    private final m52 f;
    @NotNull
    private final th1 g;

    public p60(@NotNull al al2, @NotNull u60 u602, @NotNull fi1 fi12, @NotNull qi1 qi12, @NotNull ki1 ki12, @NotNull m52 m522, @NotNull th1 th12) {
        this.a = al2;
        this.b = u602;
        this.c = fi12;
        this.d = qi12;
        this.e = ki12;
        this.f = m522;
        this.g = th12;
    }

    public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        e0.a((Player.Listener)this, (AudioAttributes)audioAttributes);
    }

    public /* synthetic */ void onAudioSessionIdChanged(int n10) {
        e0.b((Player.Listener)this, (int)n10);
    }

    public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        e0.c((Player.Listener)this, (Player.Commands)commands);
    }

    public /* synthetic */ void onCues(CueGroup cueGroup) {
        e0.d((Player.Listener)this, (CueGroup)cueGroup);
    }

    public /* synthetic */ void onCues(List list) {
        e0.e((Player.Listener)this, (List)list);
    }

    public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        e0.f((Player.Listener)this, (DeviceInfo)deviceInfo);
    }

    public /* synthetic */ void onDeviceVolumeChanged(int n10, boolean bl2) {
        e0.g((Player.Listener)this, (int)n10, (boolean)bl2);
    }

    public /* synthetic */ void onEvents(Player player, Player.Events events) {
        e0.h((Player.Listener)this, (Player)player, (Player.Events)events);
    }

    public /* synthetic */ void onIsLoadingChanged(boolean bl2) {
        e0.i((Player.Listener)this, (boolean)bl2);
    }

    public /* synthetic */ void onIsPlayingChanged(boolean bl2) {
        e0.j((Player.Listener)this, (boolean)bl2);
    }

    public /* synthetic */ void onLoadingChanged(boolean bl2) {
        e0.k((Player.Listener)this, (boolean)bl2);
    }

    public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long l10) {
        e0.l((Player.Listener)this, (long)l10);
    }

    public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int n10) {
        e0.m((Player.Listener)this, (MediaItem)mediaItem, (int)n10);
    }

    public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        e0.n((Player.Listener)this, (MediaMetadata)mediaMetadata);
    }

    public /* synthetic */ void onMetadata(Metadata metadata) {
        e0.o((Player.Listener)this, (Metadata)metadata);
    }

    public final void onPlayWhenReadyChanged(boolean bl2, int n10) {
        Player player = this.b.a();
        if (this.a.b() && player != null) {
            this.d.a(bl2, player.getPlaybackState());
        }
    }

    public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        e0.q((Player.Listener)this, (PlaybackParameters)playbackParameters);
    }

    public final void onPlaybackStateChanged(int n10) {
        Player player = this.b.a();
        if (this.a.b() && player != null) {
            this.c.a(n10, player);
        }
    }

    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int n10) {
        e0.s((Player.Listener)this, (int)n10);
    }

    public final void onPlayerError(@NotNull PlaybackException playbackException) {
        this.e.a((Exception)playbackException);
    }

    public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        e0.u((Player.Listener)this, (PlaybackException)playbackException);
    }

    public /* synthetic */ void onPlayerStateChanged(boolean bl2, int n10) {
        e0.v((Player.Listener)this, (boolean)bl2, (int)n10);
    }

    public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        e0.w((Player.Listener)this, (MediaMetadata)mediaMetadata);
    }

    public /* synthetic */ void onPositionDiscontinuity(int n10) {
        e0.x((Player.Listener)this, (int)n10);
    }

    public final void onPositionDiscontinuity(@NotNull Player.PositionInfo positionInfo, @NotNull Player.PositionInfo positionInfo2, int n10) {
        this.g.a();
    }

    public final void onRenderedFirstFrame() {
        Player player = this.b.a();
        if (player != null) {
            this.onPlaybackStateChanged(player.getPlaybackState());
        }
    }

    public /* synthetic */ void onRepeatModeChanged(int n10) {
        e0.A((Player.Listener)this, (int)n10);
    }

    public /* synthetic */ void onSeekBackIncrementChanged(long l10) {
        e0.B((Player.Listener)this, (long)l10);
    }

    public /* synthetic */ void onSeekForwardIncrementChanged(long l10) {
        e0.C((Player.Listener)this, (long)l10);
    }

    public /* synthetic */ void onShuffleModeEnabledChanged(boolean bl2) {
        e0.D((Player.Listener)this, (boolean)bl2);
    }

    public /* synthetic */ void onSkipSilenceEnabledChanged(boolean bl2) {
        e0.E((Player.Listener)this, (boolean)bl2);
    }

    public /* synthetic */ void onSurfaceSizeChanged(int n10, int n13) {
        e0.F((Player.Listener)this, (int)n10, (int)n13);
    }

    public final void onTimelineChanged(@NotNull Timeline timeline, int n10) {
        this.f.a(timeline);
    }

    public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        e0.H((Player.Listener)this, (TrackSelectionParameters)trackSelectionParameters);
    }

    public /* synthetic */ void onTracksChanged(Tracks tracks) {
        e0.I((Player.Listener)this, (Tracks)tracks);
    }

    public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
        e0.J((Player.Listener)this, (VideoSize)videoSize);
    }

    public /* synthetic */ void onVolumeChanged(float f11) {
        e0.K((Player.Listener)this, (float)f11);
    }
}

