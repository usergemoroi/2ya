/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.zd2
 *  com.yandex.mobile.ads.video.playback.model.SkipInfo
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.zd2;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class zn2
implements SkipInfo {
    @NotNull
    private final zd2 a;

    public zn2(@NotNull zd2 zd22) {
        this.a = zd22;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof zn2)) {
            return false;
        }
        object = (zn2)object;
        return y.e(this.a, ((zn2)object).a);
    }

    public final long getSkipOffset() {
        return this.a.a();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        zd2 zd22 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("YandexSkipInfo(skipInfo=");
        stringBuilder.append(zd22);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

