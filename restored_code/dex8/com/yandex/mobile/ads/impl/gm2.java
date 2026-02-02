/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.appopenad.AppOpenAd
 *  com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener
 *  com.yandex.mobile.ads.common.AdRequestError
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.js
 *  com.yandex.mobile.ads.impl.ls
 *  com.yandex.mobile.ads.impl.yl2
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.appopenad.AppOpenAd;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.em2;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.js;
import com.yandex.mobile.ads.impl.ls;
import com.yandex.mobile.ads.impl.yl2;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class gm2
implements ls {
    @Nullable
    private final AppOpenAdLoadListener a;

    public gm2(@Nullable AppOpenAdLoadListener appOpenAdLoadListener) {
        this.a = appOpenAdLoadListener;
    }

    public final void a(@NotNull f3 f33) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new AdRequestError(f33.b(), f33.d(), f33.a())){
            final gm2 b;
            final AdRequestError c;
            {
                this.b = gm22;
                this.c = adRequestError;
                super(0);
            }

            public final Object invoke() {
                AppOpenAdLoadListener appOpenAdLoadListener = this.b.a;
                if (appOpenAdLoadListener != null) {
                    appOpenAdLoadListener.onAdFailedToLoad(this.c);
                }
                return k0.a;
            }
        });
    }

    public final void a(@NotNull js js3) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new em2(js3, new yl2())){
            final gm2 b;
            final em2 c;
            {
                this.b = gm22;
                this.c = em22;
                super(0);
            }

            public final Object invoke() {
                AppOpenAdLoadListener appOpenAdLoadListener = this.b.a;
                if (appOpenAdLoadListener != null) {
                    appOpenAdLoadListener.onAdLoaded((AppOpenAd)this.c);
                }
                return k0.a;
            }
        });
    }
}

