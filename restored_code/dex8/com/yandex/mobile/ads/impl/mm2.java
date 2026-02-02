/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.ht
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.nm2;
import com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class mm2
implements ht {
    @NotNull
    private final ClosableNativeAdEventListener a;

    public mm2(@NotNull ClosableNativeAdEventListener closableNativeAdEventListener) {
        this.a = closableNativeAdEventListener;
    }

    public final void a(@Nullable c4 object) {
        object = object != null ? new nm2((c4)object) : null;
        new CallbackStackTraceMarker((a)new a<k0>(this, (nm2)object){
            final mm2 b;
            final nm2 c;
            {
                this.b = mm22;
                this.c = nm22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onImpression(this.c);
                return k0.a;
            }
        });
    }

    public final void closeNativeAd() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final mm2 b;
            {
                this.b = mm22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.closeNativeAd();
                return k0.a;
            }
        });
    }

    public final void onAdClicked() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final mm2 b;
            {
                this.b = mm22;
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
            final mm2 b;
            {
                this.b = mm22;
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
            final mm2 b;
            {
                this.b = mm22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onReturnedToApplication();
                return k0.a;
            }
        });
    }
}

