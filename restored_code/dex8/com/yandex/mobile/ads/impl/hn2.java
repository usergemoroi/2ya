/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.common.AdRequestError
 *  com.yandex.mobile.ads.impl.ct
 *  com.yandex.mobile.ads.impl.et
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.yl2
 *  com.yandex.mobile.ads.interstitial.InterstitialAd
 *  com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.ct;
import com.yandex.mobile.ads.impl.et;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.fn2;
import com.yandex.mobile.ads.impl.yl2;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class hn2
implements et {
    @Nullable
    private final InterstitialAdLoadListener a;

    public hn2(@Nullable InterstitialAdLoadListener interstitialAdLoadListener) {
        this.a = interstitialAdLoadListener;
    }

    public final void a(@NotNull ct ct3) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new fn2(ct3, new yl2())){
            final hn2 b;
            final fn2 c;
            {
                this.b = hn22;
                this.c = fn22;
                super(0);
            }

            public final Object invoke() {
                InterstitialAdLoadListener interstitialAdLoadListener = this.b.a;
                if (interstitialAdLoadListener != null) {
                    interstitialAdLoadListener.onAdLoaded((InterstitialAd)this.c);
                }
                return k0.a;
            }
        });
    }

    public final void a(@NotNull f3 f33) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new AdRequestError(f33.b(), f33.d(), f33.a())){
            final hn2 b;
            final AdRequestError c;
            {
                this.b = hn22;
                this.c = adRequestError;
                super(0);
            }

            public final Object invoke() {
                InterstitialAdLoadListener interstitialAdLoadListener = this.b.a;
                if (interstitialAdLoadListener != null) {
                    interstitialAdLoadListener.onAdFailedToLoad(this.c);
                }
                return k0.a;
            }
        });
    }
}

