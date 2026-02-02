/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.common.AdRequestError
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.wt
 *  com.yandex.mobile.ads.impl.yl2
 *  com.yandex.mobile.ads.impl.yt
 *  com.yandex.mobile.ads.rewarded.RewardedAd
 *  com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.un2;
import com.yandex.mobile.ads.impl.wt;
import com.yandex.mobile.ads.impl.yl2;
import com.yandex.mobile.ads.impl.yt;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class wn2
implements yt {
    @Nullable
    private final RewardedAdLoadListener a;

    public wn2(@Nullable RewardedAdLoadListener rewardedAdLoadListener) {
        this.a = rewardedAdLoadListener;
    }

    public final void a(@NotNull f3 f34) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new AdRequestError(f34.b(), f34.d(), f34.a())){
            final wn2 b;
            final AdRequestError c;
            {
                this.b = wn22;
                this.c = adRequestError;
                super(0);
            }

            public final Object invoke() {
                RewardedAdLoadListener rewardedAdLoadListener = this.b.a;
                if (rewardedAdLoadListener != null) {
                    rewardedAdLoadListener.onAdFailedToLoad(this.c);
                }
                return k0.a;
            }
        });
    }

    public final void a(@NotNull wt wt2) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new un2(wt2, new yl2())){
            final wn2 b;
            final un2 c;
            {
                this.b = wn22;
                this.c = un22;
                super(0);
            }

            public final Object invoke() {
                RewardedAdLoadListener rewardedAdLoadListener = this.b.a;
                if (rewardedAdLoadListener != null) {
                    rewardedAdLoadListener.onAdLoaded((RewardedAd)this.c);
                }
                return k0.a;
            }
        });
    }
}

