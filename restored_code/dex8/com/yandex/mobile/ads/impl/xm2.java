/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.impl.gl0
 *  com.yandex.mobile.ads.instream.InstreamAdListener
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.impl.gl0;
import com.yandex.mobile.ads.instream.InstreamAdListener;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class xm2
implements gl0 {
    @NotNull
    private final InstreamAdListener a;

    public xm2(@NotNull InstreamAdListener instreamAdListener) {
        this.a = instreamAdListener;
    }

    public final void onError(@NotNull String string2) {
        new CallbackStackTraceMarker((a)new a<k0>(this, string2){
            final xm2 b;
            final String c;
            {
                this.b = xm22;
                this.c = string2;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onError(this.c);
                return k0.a;
            }
        });
    }

    public final void onInstreamAdCompleted() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final xm2 b;
            {
                this.b = xm22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onInstreamAdCompleted();
                return k0.a;
            }
        });
    }

    public final void onInstreamAdPrepared() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final xm2 b;
            {
                this.b = xm22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onInstreamAdPrepared();
                return k0.a;
            }
        });
    }
}

