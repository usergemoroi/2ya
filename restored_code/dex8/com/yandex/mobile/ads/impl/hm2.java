/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.banner.BannerAdEventListener
 *  com.yandex.mobile.ads.common.AdRequestError
 *  com.yandex.mobile.ads.common.ImpressionData
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.ns
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.banner.BannerAdEventListener;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.nm2;
import com.yandex.mobile.ads.impl.ns;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class hm2
implements ns {
    @Nullable
    private final BannerAdEventListener a;

    public hm2(@Nullable BannerAdEventListener bannerAdEventListener) {
        this.a = bannerAdEventListener;
    }

    public final void a(@Nullable c4 object) {
        object = object != null ? new nm2((c4)object) : null;
        new CallbackStackTraceMarker((a)new a<k0>(this, (nm2)object){
            final hm2 b;
            final nm2 c;
            {
                this.b = hm22;
                this.c = nm22;
                super(0);
            }

            public final Object invoke() {
                BannerAdEventListener bannerAdEventListener = this.b.a;
                if (bannerAdEventListener != null) {
                    bannerAdEventListener.onImpression((ImpressionData)this.c);
                }
                return k0.a;
            }
        });
    }

    public final void a(@NotNull f3 f33) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new AdRequestError(f33.b(), f33.d(), f33.a())){
            final hm2 b;
            final AdRequestError c;
            {
                this.b = hm22;
                this.c = adRequestError;
                super(0);
            }

            public final Object invoke() {
                BannerAdEventListener bannerAdEventListener = this.b.a;
                if (bannerAdEventListener != null) {
                    bannerAdEventListener.onAdFailedToLoad(this.c);
                }
                return k0.a;
            }
        });
    }

    public final void closeBannerAd() {
    }

    public final void onAdClicked() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final hm2 b;
            {
                this.b = hm22;
                super(0);
            }

            public final Object invoke() {
                BannerAdEventListener bannerAdEventListener = this.b.a;
                if (bannerAdEventListener != null) {
                    bannerAdEventListener.onAdClicked();
                }
                return k0.a;
            }
        });
    }

    public final void onAdLoaded() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final hm2 b;
            {
                this.b = hm22;
                super(0);
            }

            public final Object invoke() {
                BannerAdEventListener bannerAdEventListener = this.b.a;
                if (bannerAdEventListener != null) {
                    bannerAdEventListener.onAdLoaded();
                }
                return k0.a;
            }
        });
    }

    public final void onLeftApplication() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final hm2 b;
            {
                this.b = hm22;
                super(0);
            }

            public final Object invoke() {
                BannerAdEventListener bannerAdEventListener = this.b.a;
                if (bannerAdEventListener != null) {
                    bannerAdEventListener.onLeftApplication();
                }
                return k0.a;
            }
        });
    }

    public final void onReturnedToApplication() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final hm2 b;
            {
                this.b = hm22;
                super(0);
            }

            public final Object invoke() {
                BannerAdEventListener bannerAdEventListener = this.b.a;
                if (bannerAdEventListener != null) {
                    bannerAdEventListener.onReturnedToApplication();
                }
                return k0.a;
            }
        });
    }
}

