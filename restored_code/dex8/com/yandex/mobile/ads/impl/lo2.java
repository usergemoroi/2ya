/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.core.utils.CallbackStackTraceMarker
 *  com.yandex.mobile.ads.common.VideoEventListener
 *  com.yandex.mobile.ads.impl.bu
 *  kotlin.jvm.functions.a
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.VideoEventListener;
import com.yandex.mobile.ads.impl.bu;
import kotlin.jvm.functions.a;
import kotlin.jvm.internal.y;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lo2
implements bu {
    @NotNull
    private final VideoEventListener a;

    public lo2(@NotNull VideoEventListener videoEventListener) {
        this.a = videoEventListener;
    }

    public final boolean equals(@Nullable Object object) {
        boolean bl2 = object instanceof lo2 && y.e(((lo2)object).a, this.a);
        return bl2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void onVideoComplete() {
        new CallbackStackTraceMarker((a)new a<k0>(this){
            final lo2 b;
            {
                this.b = lo22;
                super(0);
            }

            public final Object invoke() {
                this.b.a.onVideoComplete();
                return k0.a;
            }
        });
    }
}

