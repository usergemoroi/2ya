/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.lc2
 *  com.yandex.mobile.ads.impl.zd2
 *  com.yandex.mobile.ads.impl.zl0
 *  com.yandex.mobile.ads.video.playback.model.AdPodInfo
 *  com.yandex.mobile.ads.video.playback.model.SkipInfo
 *  com.yandex.mobile.ads.video.playback.model.VideoAd
 *  com.yandex.mobile.ads.video.playback.model.VideoAdExtensions
 *  com.yandex.mobile.ads.video.playback.model.VideoAdInfo
 *  kotlin.collections.t
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.in2;
import com.yandex.mobile.ads.impl.jo2;
import com.yandex.mobile.ads.impl.lc2;
import com.yandex.mobile.ads.impl.tn0;
import com.yandex.mobile.ads.impl.zd2;
import com.yandex.mobile.ads.impl.zl0;
import com.yandex.mobile.ads.impl.zl2;
import com.yandex.mobile.ads.impl.zn2;
import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import com.yandex.mobile.ads.video.playback.model.VideoAdExtensions;
import com.yandex.mobile.ads.video.playback.model.VideoAdInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class io2
implements VideoAd {
    @NotNull
    private final co0 a;
    @NotNull
    private final lc2 b;

    public /* synthetic */ io2(co0 co02) {
        this(co02, new lc2());
    }

    public io2(@NotNull co0 co02, @NotNull lc2 lc22) {
        this.a = co02;
        this.b = lc22;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof io2)) {
            return false;
        }
        object = (io2)object;
        if (!y.e(this.a, ((io2)object).a)) {
            return false;
        }
        return y.e(this.b, ((io2)object).b);
    }

    @NotNull
    public final VideoAdInfo getAdInfo() {
        lc2 lc22 = this.b;
        zl0 zl02 = this.a.a();
        lc22.getClass();
        return new VideoAdInfo(zl02.a(), zl02.e(), zl02.d(), zl02.f(), zl02.c(), zl02.b());
    }

    @NotNull
    public final AdPodInfo getAdPodInfo() {
        return new zl2(this.a.b());
    }

    public final long getDuration() {
        return this.a.c();
    }

    @NotNull
    public final VideoAdExtensions getExtensions() {
        return new jo2(this.a.d());
    }

    @Nullable
    public final String getInfo() {
        return this.a.a().f();
    }

    @NotNull
    public final MediaFile getMediaFile() {
        return new in2(this.a.g());
    }

    @NotNull
    public final List<MediaFile> getMediaFiles() {
        Object object = this.a.f();
        ArrayList<MediaFile> arrayList = new ArrayList<MediaFile>(t.x((Iterable)object, (int)10));
        object = object.iterator();
        while (object.hasNext()) {
            arrayList.add(new in2((tn0)object.next()));
        }
        return arrayList;
    }

    @Nullable
    public final SkipInfo getSkipInfo() {
        Object object = this.a.h();
        object = object != null ? new zn2((zd2)object) : null;
        return object;
    }

    public final int hashCode() {
        int n10 = this.a.hashCode();
        return this.b.hashCode() + n10 * 31;
    }

    @NotNull
    public final String toString() {
        co0 co02 = this.a;
        lc2 lc22 = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("YandexVideoAd(videoAd=");
        stringBuilder.append(co02);
        stringBuilder.append(", videoAdInfoConverter=");
        stringBuilder.append(lc22);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

