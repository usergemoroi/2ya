/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.common.AdRequestError
 *  com.yandex.mobile.ads.feed.FeedAdLoadListener
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.qs
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.feed.FeedAdLoadListener;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.qs;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class x80
implements qs {
    @Nullable
    private final FeedAdLoadListener a;

    public x80(@Nullable FeedAdLoadListener feedAdLoadListener) {
        this.a = feedAdLoadListener;
    }

    public final void a(@NotNull f3 f34) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new AdRequestError(f34.b(), f34.d(), f34.a())){
            final x80 b;
            final AdRequestError c;
            {
                this.b = x802;
                this.c = adRequestError;
                super(0);
            }

            public final Object invoke() {
                FeedAdLoadListener feedAdLoadListener = this.b.a;
                if (feedAdLoadListener != null) {
                    feedAdLoadListener.onAdFailedToLoad(this.c);
                }
                return k0.a;
            }
        });
    }

    public final void onAdLoaded() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final x80 b;
            {
                this.b = x802;
                super(0);
            }

            public final Object invoke() {
                FeedAdLoadListener feedAdLoadListener = this.b.a;
                if (feedAdLoadListener != null) {
                    feedAdLoadListener.onAdLoaded();
                }
                return k0.a;
            }
        });
    }
}

