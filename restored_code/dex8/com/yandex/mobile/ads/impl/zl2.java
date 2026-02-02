/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.kd2
 *  com.yandex.mobile.ads.video.playback.model.AdPodInfo
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.kd2;
import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zl2
implements AdPodInfo {
    @NotNull
    private final kd2 a;

    public zl2(@NotNull kd2 kd22) {
        this.a = kd22;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof zl2)) {
            return false;
        }
        object = (zl2)object;
        return y.e(this.a, ((zl2)object).a);
    }

    public final int getAdPosition() {
        return this.a.a();
    }

    public final int getAdsCount() {
        return this.a.b();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        kd2 kd22 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("YandexAdPodInfo(adPodInfo=");
        stringBuilder.append(kd22);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

