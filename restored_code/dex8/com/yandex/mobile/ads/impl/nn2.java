/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.common.AdRequestError
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.lt
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.nativeads.NativeAd
 *  com.yandex.mobile.ads.nativeads.NativeAdLoadListener
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.lt;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdLoadListener;
import com.yandex.mobile.ads.nativeads.e;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class nn2
implements lt {
    @NotNull
    private final NativeAdLoadListener a;

    public nn2(@NotNull NativeAdLoadListener nativeAdLoadListener) {
        this.a = nativeAdLoadListener;
    }

    public final void a(@NotNull f3 f33) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new AdRequestError(f33.b(), f33.d(), f33.a())){
            final nn2 b;
            final AdRequestError c;
            {
                this.b = nn22;
                this.c = adRequestError;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdFailedToLoad(this.c);
                return k0.a;
            }
        });
    }

    public final void a(@NotNull t61 t612) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new e(t612)){
            final nn2 b;
            final e c;
            {
                this.b = nn22;
                this.c = e11;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdLoaded((NativeAd)this.c);
                return k0.a;
            }
        });
    }

    public final void b(@NotNull t61 t612) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new e(t612)){
            final nn2 b;
            final e c;
            {
                this.b = nn22;
                this.c = e11;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdLoaded((NativeAd)this.c);
                return k0.a;
            }
        });
    }
}

