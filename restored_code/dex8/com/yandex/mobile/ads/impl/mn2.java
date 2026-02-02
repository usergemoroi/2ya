/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.impl.kt
 *  com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.impl.kt;
import com.yandex.mobile.ads.nativeads.NativeAdImageLoadingListener;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class mn2
implements kt {
    @NotNull
    private final NativeAdImageLoadingListener a;

    public mn2(@NotNull NativeAdImageLoadingListener nativeAdImageLoadingListener) {
        this.a = nativeAdImageLoadingListener;
    }

    public final boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof mn2)) {
            return false;
        }
        object = (mn2)object;
        return y.e(this.a, ((mn2)object).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void onFinishLoadingImages() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final mn2 b;
            {
                this.b = mn22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onFinishLoadingImages();
                return k0.a;
            }
        });
    }

    @NotNull
    public final String toString() {
        NativeAdImageLoadingListener nativeAdImageLoadingListener = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("YandexNativeAdImageLoadingListenerAdapter(imageLoadingListener=");
        stringBuilder.append(nativeAdImageLoadingListener);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

