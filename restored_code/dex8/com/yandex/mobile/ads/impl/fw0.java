/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  com.monetization.ads.fullscreen.template.view.ExtendedViewContainer
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.d51
 *  com.yandex.mobile.ads.impl.ou0
 *  com.yandex.mobile.ads.impl.ou0$a
 *  com.yandex.mobile.ads.impl.t00
 *  com.yandex.mobile.ads.impl.uu0
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.d51;
import com.yandex.mobile.ads.impl.lu0;
import com.yandex.mobile.ads.impl.ou0;
import com.yandex.mobile.ads.impl.pm1;
import com.yandex.mobile.ads.impl.sq;
import com.yandex.mobile.ads.impl.t00;
import com.yandex.mobile.ads.impl.uu0;
import org.jetbrains.annotations.NotNull;

public final class fw0<V extends ViewGroup>
implements t00<V> {
    @NotNull
    private final d51 a;
    @NotNull
    private final uu0 b;

    public fw0(@NotNull d51 d512, @NotNull uu0 uu02) {
        this.a = d512;
        this.b = uu02;
    }

    public final void a(@NotNull V v14) {
        this.a.getClass();
        ExtendedViewContainer extendedViewContainer = (ExtendedViewContainer)v14.findViewById(R.id.media_container);
        Float f11 = this.b.a();
        if (extendedViewContainer != null && f11 != null) {
            extendedViewContainer.setMeasureSpecProvider((ou0)new sq(new pm1(Math.min(Math.max(f11.floatValue(), 1.0f), 1.7777778f), new ou0.a()), new lu0((View)v14, 0.5f, v14.getContext().getApplicationContext())));
        }
    }

    public final void c() {
    }
}

