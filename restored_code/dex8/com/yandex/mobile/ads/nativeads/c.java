/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.tt
 *  com.yandex.mobile.ads.impl.ut
 *  com.yandex.mobile.ads.nativeads.CustomClickHandler
 *  com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener
 */
package com.yandex.mobile.ads.nativeads;

import com.yandex.mobile.ads.impl.tt;
import com.yandex.mobile.ads.impl.ut;
import com.yandex.mobile.ads.nativeads.CustomClickHandler;
import com.yandex.mobile.ads.nativeads.CustomClickHandlerEventListener;
import com.yandex.mobile.ads.nativeads.d;
import org.jetbrains.annotations.NotNull;

public final class c
implements tt {
    @NotNull
    private final CustomClickHandler a;

    public c(@NotNull CustomClickHandler customClickHandler) {
        this.a = customClickHandler;
    }

    public final void a(@NotNull String string2, @NotNull ut object) {
        object = new d((ut)object);
        this.a.handleCustomClick(string2, (CustomClickHandlerEventListener)object);
    }
}

