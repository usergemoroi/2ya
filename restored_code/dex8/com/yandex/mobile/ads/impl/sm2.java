/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.impl.kt0
 *  com.yandex.mobile.ads.instream.InstreamAdBreakEventListener
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.impl.kt0;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import kotlin.jvm.functions.a;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class sm2
implements kt0 {
    @NotNull
    private final InstreamAdBreakEventListener a;

    public sm2(@NotNull InstreamAdBreakEventListener instreamAdBreakEventListener) {
        this.a = instreamAdBreakEventListener;
    }

    public final void onInstreamAdBreakCompleted() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final sm2 b;
            {
                this.b = sm22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onInstreamAdBreakCompleted();
                return k0.a;
            }
        });
    }

    public final void onInstreamAdBreakError(@NotNull String string2) {
        new CallbackStackTraceMarker((a)new a<k0>(this, string2){
            final sm2 b;
            final String c;
            {
                this.b = sm22;
                this.c = string2;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onInstreamAdBreakError(this.c);
                return k0.a;
            }
        });
    }

    public final void onInstreamAdBreakPrepared() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final sm2 b;
            {
                this.b = sm22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onInstreamAdBreakPrepared();
                return k0.a;
            }
        });
    }

    public final void onInstreamAdBreakStarted() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final sm2 b;
            {
                this.b = sm22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onInstreamAdBreakStarted();
                return k0.a;
            }
        });
    }
}

