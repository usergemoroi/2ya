/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cd2
 */
package com.yandex.mobile.ads.video.playback.model;

import com.yandex.mobile.ads.impl.cd2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0004R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0004\u00a8\u0006\u0013"}, d2={"Lcom/yandex/mobile/ads/video/playback/model/MediaFile;", "Lcom/yandex/mobile/ads/impl/cd2;", "", "getUrl", "()Ljava/lang/String;", "url", "", "getAdWidth", "()I", "adWidth", "getAdHeight", "adHeight", "getMediaType", "mediaType", "getBitrate", "()Ljava/lang/Integer;", "bitrate", "getApiFramework", "apiFramework", "mobileads_externalRelease"}, k=1, mv={1, 9, 0})
public interface MediaFile
extends cd2 {
    public int getAdHeight();

    public int getAdWidth();

    @Nullable
    public String getApiFramework();

    @Nullable
    public Integer getBitrate();

    @Nullable
    public String getMediaType();

    @NotNull
    public String getUrl();
}

