/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.common.BidderTokenLoadListener
 *  com.yandex.mobile.ads.impl.ps
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.impl.im2;
import com.yandex.mobile.ads.impl.ps;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class jm2
implements ps {
    @NotNull
    private final BidderTokenLoadListener a;

    public jm2(@NotNull BidderTokenLoadListener bidderTokenLoadListener) {
        this.a = bidderTokenLoadListener;
    }

    public final void a() {
        new CallbackStackTraceMarker((a)new im2(this));
    }

    public final void onBidderTokenLoaded(@NotNull String string2) {
        new CallbackStackTraceMarker((a)new a<k0>(this, string2){
            final jm2 b;
            final String c;
            {
                this.b = jm22;
                this.c = string2;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onBidderTokenLoaded(this.c);
                return k0.a;
            }
        });
    }
}

