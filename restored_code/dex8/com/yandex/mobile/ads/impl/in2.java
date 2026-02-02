/*
 * Decompiled with CFR 0.152.
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tn0;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class in2
implements MediaFile {
    @NotNull
    private final tn0 a;

    public in2(@NotNull tn0 tn02) {
        this.a = tn02;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof in2)) {
            return false;
        }
        object = (in2)object;
        return y.e(this.a, ((in2)object).a);
    }

    @Override
    public final int getAdHeight() {
        return this.a.getAdHeight();
    }

    @Override
    public final int getAdWidth() {
        return this.a.getAdWidth();
    }

    @Override
    @Nullable
    public final String getApiFramework() {
        return this.a.getApiFramework();
    }

    @Override
    @Nullable
    public final Integer getBitrate() {
        return this.a.getBitrate();
    }

    @Override
    @Nullable
    public final String getMediaType() {
        return this.a.getMediaType();
    }

    @Override
    @NotNull
    public final String getUrl() {
        return this.a.getUrl();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        tn0 tn02 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("YandexMediaFile(mediaFile=");
        stringBuilder.append(tn02);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

