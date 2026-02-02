/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  com.monetization.ads.fullscreen.template.view.ExtendedViewContainer
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.d51
 *  com.yandex.mobile.ads.impl.gt
 *  com.yandex.mobile.ads.impl.t00
 */
package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.d51;
import com.yandex.mobile.ads.impl.gt;
import com.yandex.mobile.ads.impl.t00;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class rv0<V extends ViewGroup>
implements t00<V> {
    @NotNull
    private final gt a;
    @NotNull
    private final d51 b;

    @JvmOverloads
    public rv0(@NotNull gt gt3, @NotNull d51 d512) {
        this.a = gt3;
        this.b = d512;
    }

    public final void a(@NotNull V object) {
        this.b.getClass();
        object = (ExtendedViewContainer)object.findViewById(R.id.media_container);
        if (object != null && this.a.h() == null && this.a.i() == null) {
            object.setVisibility(8);
        }
    }

    public final void c() {
    }
}

