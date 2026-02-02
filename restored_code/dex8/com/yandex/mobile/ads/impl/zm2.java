/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.impl.ss
 *  com.yandex.mobile.ads.impl.xs
 *  com.yandex.mobile.ads.instream.InstreamAd
 *  com.yandex.mobile.ads.instream.InstreamAdLoadListener
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.impl.qm2;
import com.yandex.mobile.ads.impl.ss;
import com.yandex.mobile.ads.impl.xs;
import com.yandex.mobile.ads.instream.InstreamAd;
import com.yandex.mobile.ads.instream.InstreamAdLoadListener;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class zm2
implements xs {
    @NotNull
    private final InstreamAdLoadListener a;

    public zm2(@NotNull InstreamAdLoadListener instreamAdLoadListener) {
        this.a = instreamAdLoadListener;
    }

    public final void a(@NotNull ss ss3) {
        new CallbackStackTraceMarker((a)new a<k0>(this, new qm2(ss3)){
            final zm2 b;
            final qm2 c;
            {
                this.b = zm22;
                this.c = qm22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onInstreamAdLoaded((InstreamAd)this.c);
                return k0.a;
            }
        });
    }

    public final void onInstreamAdFailedToLoad(@NotNull String string2) {
        new CallbackStackTraceMarker((a)new a<k0>(this, string2){
            final zm2 b;
            final String c;
            {
                this.b = zm22;
                this.c = string2;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onInstreamAdFailedToLoad(this.c);
                return k0.a;
            }
        });
    }
}

