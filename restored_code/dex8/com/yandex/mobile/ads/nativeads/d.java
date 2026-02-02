/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ut
 *  com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
 */
package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.ut;
import com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener;
import org.jetbrains.annotations.NotNull;

public final class d
implements CustomClickHandlerEventListener {
    @NotNull
    private final ut a;

    public d(@NotNull ut ut2) {
        this.a = ut2;
    }

    public final void onLeftApplication() {
        this.a.onLeftApplication();
    }

    public final void onReturnedToApplication() {
        this.a.onReturnedToApplication();
    }
}

