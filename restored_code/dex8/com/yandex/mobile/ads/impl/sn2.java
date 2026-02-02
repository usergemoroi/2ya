/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.common.AdRequestError
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.lt
 *  com.yandex.mobile.ads.impl.t61
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.lt;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.nativeads.a;
import com.yandex.mobile.ads.nativeads.e;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class sn2
implements lt {
    @NotNull
    private final a a;

    public sn2(@NotNull a a14) {
        this.a = a14;
    }

    public final void a(@NotNull f3 f34) {
        new CallbackStackTraceMarker((kotlin.jvm.functions.a)new kotlin.jvm.functions.a<k0>(this, new AdRequestError(f34.b(), f34.d(), f34.a())){
            final sn2 b;
            final AdRequestError c;
            {
                this.b = sn22;
                this.c = adRequestError;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdFailedToLoad(this.c);
                return k0.a;
            }
        });
    }

    public final void a(@NotNull t61 t612) {
        new CallbackStackTraceMarker((kotlin.jvm.functions.a)new kotlin.jvm.functions.a<k0>(this, new e(t612)){
            final sn2 b;
            final e c;
            {
                this.b = sn22;
                this.c = e11;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onAdLoaded(this.c);
                return k0.a;
            }
        });
    }

    public final void b(@NotNull t61 t612) {
        new CallbackStackTraceMarker((kotlin.jvm.functions.a)new kotlin.jvm.functions.a<k0>(this, new e(t612)){
            final sn2 b;
            {
                this.b = sn22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.a();
                return k0.a;
            }
        });
    }
}

