/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.impl.ss
 *  com.yandex.mobile.ads.impl.xs
 *  com.yandex.mobile.ads.impl.yr
 *  com.yandex.mobile.ads.instream.newapi.InstreamAd
 *  com.yandex.mobile.ads.instream.newapi.InstreamAdLoadListener
 *  com.yandex.mobile.ads.instream.newapi.InstreamAdRequestError
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.impl.pm2;
import com.yandex.mobile.ads.impl.ss;
import com.yandex.mobile.ads.impl.xs;
import com.yandex.mobile.ads.impl.yr;
import com.yandex.mobile.ads.instream.newapi.InstreamAd;
import com.yandex.mobile.ads.instream.newapi.InstreamAdLoadListener;
import com.yandex.mobile.ads.instream.newapi.InstreamAdRequestError;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class ym2
implements xs {
    @NotNull
    private final InstreamAdLoadListener a;
    @NotNull
    private final Context b;

    public ym2(@NotNull Context context, @NotNull InstreamAdLoadListener instreamAdLoadListener) {
        this.a = instreamAdLoadListener;
        this.b = yr.a((Context)context);
    }

    public final void a(@NotNull ss ss3) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new pm2(this.b, ss3)){
            final ym2 b;
            final pm2 c;
            {
                this.b = ym22;
                this.c = pm22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onInstreamAdLoaded((InstreamAd)this.c);
                return k0.a;
            }
        });
    }

    public final void onInstreamAdFailedToLoad(@NotNull String string2) {
        new CallbackStackTraceMarker((a)new a<k0>(string2, this){
            final String b;
            final ym2 c;
            {
                this.b = string2;
                this.c = ym22;
                super(0);
            }

            public final Object invoke() {
                InstreamAdRequestError instreamAdRequestError = new InstreamAdRequestError(this.b);
                this.c.a.onInstreamAdFailedToLoad(instreamAdRequestError);
                return k0.a;
            }
        });
    }
}

