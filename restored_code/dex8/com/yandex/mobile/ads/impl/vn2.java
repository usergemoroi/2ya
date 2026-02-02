/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.common.AdError
 *  com.yandex.mobile.ads.common.ImpressionData
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.my1
 *  com.yandex.mobile.ads.impl.xt
 *  com.yandex.mobile.ads.impl.yr1
 *  com.yandex.mobile.ads.rewarded.Reward
 *  com.yandex.mobile.ads.rewarded.RewardedAdEventListener
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.my1;
import com.yandex.mobile.ads.impl.nm2;
import com.yandex.mobile.ads.impl.tn2;
import com.yandex.mobile.ads.impl.xl2;
import com.yandex.mobile.ads.impl.xt;
import com.yandex.mobile.ads.impl.yr1;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class vn2
implements xt {
    @Nullable
    private final RewardedAdEventListener a;

    public vn2(@Nullable RewardedAdEventListener rewardedAdEventListener) {
        this.a = rewardedAdEventListener;
    }

    public final void a(@Nullable c4 object) {
        object = object != null ? new nm2((c4)object) : null;
        new CallbackStackTraceMarker((a)new a<k0>(this, (nm2)object){
            final vn2 b;
            final nm2 c;
            {
                this.b = vn22;
                this.c = nm22;
                super(0);
            }

            public final Object invoke() {
                RewardedAdEventListener rewardedAdEventListener = this.b.a;
                if (rewardedAdEventListener != null) {
                    rewardedAdEventListener.onAdImpression((ImpressionData)this.c);
                }
                return k0.a;
            }
        });
    }

    public final void a(@NotNull my1 my12) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new xl2(my12.a())){
            final vn2 b;
            final xl2 c;
            {
                this.b = vn22;
                this.c = xl22;
                super(0);
            }

            public final Object invoke() {
                RewardedAdEventListener rewardedAdEventListener = this.b.a;
                if (rewardedAdEventListener != null) {
                    rewardedAdEventListener.onAdFailedToShow((AdError)this.c);
                }
                return k0.a;
            }
        });
    }

    public final void a(@NotNull yr1 yr12) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new tn2(yr12)){
            final vn2 b;
            final tn2 c;
            {
                this.b = vn22;
                this.c = tn22;
                super(0);
            }

            public final Object invoke() {
                RewardedAdEventListener rewardedAdEventListener = this.b.a;
                if (rewardedAdEventListener != null) {
                    rewardedAdEventListener.onRewarded((Reward)this.c);
                }
                return k0.a;
            }
        });
    }

    public final void onAdClicked() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final vn2 b;
            {
                this.b = vn22;
                super(0);
            }

            public final Object invoke() {
                RewardedAdEventListener rewardedAdEventListener = this.b.a;
                if (rewardedAdEventListener != null) {
                    rewardedAdEventListener.onAdClicked();
                }
                return k0.a;
            }
        });
    }

    public final void onAdDismissed() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final vn2 b;
            {
                this.b = vn22;
                super(0);
            }

            public final Object invoke() {
                RewardedAdEventListener rewardedAdEventListener = this.b.a;
                if (rewardedAdEventListener != null) {
                    rewardedAdEventListener.onAdDismissed();
                }
                return k0.a;
            }
        });
    }

    public final void onAdShown() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final vn2 b;
            {
                this.b = vn22;
                super(0);
            }

            public final Object invoke() {
                RewardedAdEventListener rewardedAdEventListener = this.b.a;
                if (rewardedAdEventListener != null) {
                    rewardedAdEventListener.onAdShown();
                }
                return k0.a;
            }
        });
    }
}

