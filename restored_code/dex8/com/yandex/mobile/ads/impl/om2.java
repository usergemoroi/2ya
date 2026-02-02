/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.common.InitializationListener
 *  com.yandex.mobile.ads.impl.rs
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.impl.rs;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class om2
implements rs {
    @NotNull
    private final InitializationListener a;

    public om2(@NotNull InitializationListener initializationListener) {
        this.a = initializationListener;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof om2 && y.e(((om2)object).a, this.a);
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void onInitializationCompleted() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final om2 b;
            {
                this.b = om22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onInitializationCompleted();
                return k0.a;
            }
        });
    }
}

