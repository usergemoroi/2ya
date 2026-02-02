/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  com.yandex.mobile.ads.impl.jt
 *  com.yandex.mobile.ads.nativeads.NativeAdImage
 */
package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.jt;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ln2
implements NativeAdImage {
    @NotNull
    private final jt a;

    public ln2(@NotNull jt jt2) {
        this.a = jt2;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ln2)) {
            return false;
        }
        object = (ln2)object;
        return y.e(this.a, ((ln2)object).a);
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.a.a();
    }

    public final int getHeight() {
        return this.a.b();
    }

    public final int getWidth() {
        return this.a.d();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        jt jt2 = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("YandexNativeAdImageAdapter(image=");
        stringBuilder.append(jt2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

