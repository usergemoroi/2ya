/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.common.AdRequestError
 *  com.yandex.mobile.ads.impl.au
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.nativeads.SliderAd
 *  com.yandex.mobile.ads.nativeads.SliderAdLoadListener
 *  com.yandex.mobile.ads.nativeads.g
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.au;
import com.yandex.mobile.ads.impl.c02;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.nativeads.SliderAd;
import com.yandex.mobile.ads.nativeads.SliderAdLoadListener;
import com.yandex.mobile.ads.nativeads.g;
import com.yandex.mobile.ads.nativeads.h;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class ao2
implements au {
    @NotNull
    private final SliderAdLoadListener a;

    public ao2(@NotNull SliderAdLoadListener sliderAdLoadListener) {
        this.a = sliderAdLoadListener;
    }

    public final void a(@NotNull c02 c022) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new h(c022, new g())){
            final ao2 b;
            final h c;
            {
                this.b = ao22;
                this.c = h10;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onSliderAdLoaded((SliderAd)this.c);
                return k0.a;
            }
        });
    }

    public final void a(@NotNull f3 f33) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new AdRequestError(f33.b(), f33.d(), f33.a())){
            final ao2 b;
            final AdRequestError c;
            {
                this.b = ao22;
                this.c = adRequestError;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onSliderAdFailedToLoad(this.c);
                return k0.a;
            }
        });
    }
}

