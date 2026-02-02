/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.impl.ll0
 *  com.yandex.mobile.ads.impl.us
 *  com.yandex.mobile.ads.impl.vs
 *  com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreak
 *  com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreakLoadListener
 *  com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreakRequestError
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.impl.ll0;
import com.yandex.mobile.ads.impl.ml0;
import com.yandex.mobile.ads.impl.mt0;
import com.yandex.mobile.ads.impl.us;
import com.yandex.mobile.ads.impl.vs;
import com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreak;
import com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreakLoadListener;
import com.yandex.mobile.ads.instream.newapi.adbreak.InstreamAdBreakRequestError;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class tm2
implements vs {
    @NotNull
    private final InstreamAdBreakLoadListener a;
    @NotNull
    private final ll0 b;
    @NotNull
    private final ml0 c;

    public tm2(@NotNull InstreamAdBreakLoadListener instreamAdBreakLoadListener, @NotNull ll0 ll02, @NotNull ml0 ml02) {
        this.a = instreamAdBreakLoadListener;
        this.b = ll02;
        this.c = ml02;
    }

    public final void a(@NotNull us object) {
        object = this.b.a(object);
        new CallbackStackTraceMarker((a)new a<k0>(this, this.c.b((mt0)object)){
            final tm2 b;
            final InstreamAdBreak c;
            {
                this.b = tm22;
                this.c = jl02;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdLoaded(this.c);
                return k0.a;
            }
        });
    }

    public final void a(@NotNull String string2) {
        new CallbackStackTraceMarker((a)new a<k0>(string2, this){
            final String b;
            final tm2 c;
            {
                this.b = string2;
                this.c = tm22;
                super(0);
            }

            public final Object invoke() {
                InstreamAdBreakRequestError instreamAdBreakRequestError = new InstreamAdBreakRequestError(this.b);
                this.c.a.onAdFailedToLoad(instreamAdBreakRequestError);
                return k0.a;
            }
        });
    }
}

