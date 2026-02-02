/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.common.ImpressionData
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.ht
 *  com.yandex.mobile.ads.nativeads.NativeAdEventListener
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.nm2;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class kn2
implements ht {
    @NotNull
    private final NativeAdEventListener a;

    public kn2(@NotNull NativeAdEventListener nativeAdEventListener) {
        this.a = nativeAdEventListener;
    }

    public final void a(@Nullable c4 object) {
        object = object != null ? new nm2((c4)object) : null;
        new CallbackStackTraceMarker((a)new a<k0>(this, (nm2)object){
            final kn2 b;
            final nm2 c;
            {
                this.b = kn22;
                this.c = nm22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onImpression((ImpressionData)this.c);
                return k0.a;
            }
        });
    }

    public final void closeNativeAd() {
    }

    public final void onAdClicked() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final kn2 b;
            {
                this.b = kn22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdClicked();
                return k0.a;
            }
        });
    }

    public final void onLeftApplication() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final kn2 b;
            {
                this.b = kn22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onLeftApplication();
                return k0.a;
            }
        });
    }

    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final kn2 b;
            {
                this.b = kn22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onReturnedToApplication();
                return k0.a;
            }
        });
    }
}

