/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.nt
 *  com.yandex.mobile.ads.nativeads.NativeAdMedia
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nt;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class on2
implements NativeAdMedia {
    @NotNull
    private final nt a;

    public on2(@NotNull nt nt2) {
        this.a = nt2;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof on2)) {
            return false;
        }
        object = (on2)object;
        return y.e(this.a, ((on2)object).a);
    }

    public final float getAspectRatio() {
        return this.a.a();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        nt nt2 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("YandexNativeAdMediaAdapter(media=");
        stringBuilder.append(nt2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

