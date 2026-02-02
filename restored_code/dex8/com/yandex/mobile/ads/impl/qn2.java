/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ot
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ot;
import com.yandex.mobile.ads.nativeads.video.b;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class qn2
implements b {
    @NotNull
    private final ot a;

    public qn2(@NotNull ot ot2) {
        this.a = ot2;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof qn2)) {
            return false;
        }
        object = (qn2)object;
        return y.e(this.a, ((qn2)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final void pauseAd() {
        this.a.a();
    }

    @Override
    public final void resumeAd() {
        this.a.b();
    }

    @NotNull
    public final String toString() {
        ot ot2 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("YandexNativeAdVideoControllerAdapter(nativeAdVideoController=");
        stringBuilder.append(ot2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

