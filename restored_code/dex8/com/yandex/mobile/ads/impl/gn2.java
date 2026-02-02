/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.common.AdError
 *  com.yandex.mobile.ads.common.ImpressionData
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.dt
 *  com.yandex.mobile.ads.impl.my1
 *  com.yandex.mobile.ads.interstitial.InterstitialAdEventListener
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.dt;
import com.yandex.mobile.ads.impl.my1;
import com.yandex.mobile.ads.impl.nm2;
import com.yandex.mobile.ads.impl.xl2;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class gn2
implements dt {
    @Nullable
    private final InterstitialAdEventListener a;

    public gn2(@Nullable InterstitialAdEventListener interstitialAdEventListener) {
        this.a = interstitialAdEventListener;
    }

    public final void a(@Nullable c4 object) {
        object = object != null ? new nm2((c4)object) : null;
        new CallbackStackTraceMarker((a)new a<k0>(this, (nm2)object){
            final gn2 b;
            final nm2 c;
            {
                this.b = gn22;
                this.c = nm22;
                super(0);
            }

            public final Object invoke() {
                InterstitialAdEventListener interstitialAdEventListener = this.b.a;
                if (interstitialAdEventListener != null) {
                    interstitialAdEventListener.onAdImpression((ImpressionData)this.c);
                }
                return k0.a;
            }
        });
    }

    public final void a(@NotNull my1 my12) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new xl2(my12.a())){
            final gn2 b;
            final xl2 c;
            {
                this.b = gn22;
                this.c = xl22;
                super(0);
            }

            public final Object invoke() {
                InterstitialAdEventListener interstitialAdEventListener = this.b.a;
                if (interstitialAdEventListener != null) {
                    interstitialAdEventListener.onAdFailedToShow((AdError)this.c);
                }
                return k0.a;
            }
        });
    }

    public final void onAdClicked() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final gn2 b;
            {
                this.b = gn22;
                super(0);
            }

            public final Object invoke() {
                InterstitialAdEventListener interstitialAdEventListener = this.b.a;
                if (interstitialAdEventListener != null) {
                    interstitialAdEventListener.onAdClicked();
                }
                return k0.a;
            }
        });
    }

    public final void onAdDismissed() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final gn2 b;
            {
                this.b = gn22;
                super(0);
            }

            public final Object invoke() {
                InterstitialAdEventListener interstitialAdEventListener = this.b.a;
                if (interstitialAdEventListener != null) {
                    interstitialAdEventListener.onAdDismissed();
                }
                return k0.a;
            }
        });
    }

    public final void onAdShown() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final gn2 b;
            {
                this.b = gn22;
                super(0);
            }

            public final Object invoke() {
                InterstitialAdEventListener interstitialAdEventListener = this.b.a;
                if (interstitialAdEventListener != null) {
                    interstitialAdEventListener.onAdShown();
                }
                return k0.a;
            }
        });
    }
}

