/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.monetization.ads.nativeads.CustomizableMediaView
 *  com.yandex.mobile.ads.impl.cx0$a
 *  com.yandex.mobile.ads.impl.gh2
 *  com.yandex.mobile.ads.impl.jx0
 *  com.yandex.mobile.ads.impl.zw0
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.cx0;
import com.yandex.mobile.ads.impl.gh2;
import com.yandex.mobile.ads.impl.jx0;
import com.yandex.mobile.ads.impl.zw0;
import org.jetbrains.annotations.NotNull;

public abstract class cx0
extends gh2<CustomizableMediaView, zw0> {
    @NotNull
    private final jx0 c;

    public cx0(@NotNull CustomizableMediaView customizableMediaView, @NotNull jx0 jx02) {
        super((View)customizableMediaView);
        this.c = jx02;
    }

    public abstract void a(@NotNull CustomizableMediaView var1);

    public void a(@NotNull CustomizableMediaView customizableMediaView, @NotNull zw0 zw02) {
        this.c.a(customizableMediaView, this.d());
    }

    public abstract void a(@NotNull zw0 var1);

    @NotNull
    public abstract a d();
}

