/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  com.monetization.ads.fullscreen.template.view.ExtendedViewContainer
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.d51
 *  com.yandex.mobile.ads.impl.gt
 *  com.yandex.mobile.ads.impl.ou0
 *  com.yandex.mobile.ads.impl.ou0$a
 *  com.yandex.mobile.ads.impl.t00
 *  com.yandex.mobile.ads.impl.uu0
 */
package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.monetization.ads.fullscreen.template.view.ExtendedViewContainer;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.d51;
import com.yandex.mobile.ads.impl.gt;
import com.yandex.mobile.ads.impl.ou0;
import com.yandex.mobile.ads.impl.pm1;
import com.yandex.mobile.ads.impl.t00;
import com.yandex.mobile.ads.impl.uu0;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class tu0<V extends ViewGroup>
implements t00<V> {
    @NotNull
    private final d51 a;
    @NotNull
    private final uu0 b;

    @JvmOverloads
    public tu0(@NotNull d51 d512, @NotNull uu0 uu02) {
        this.a = d512;
        this.b = uu02;
    }

    public /* synthetic */ tu0(gt gt3) {
        this(new d51(), new uu0(gt3));
    }

    public final void a(@NotNull V object) {
        this.a.getClass();
        object = (ExtendedViewContainer)object.findViewById(R.id.media_container);
        Float f11 = this.b.a();
        if (object != null && f11 != null) {
            object.setMeasureSpecProvider((ou0)new pm1(f11.floatValue(), new ou0.a()));
        }
    }

    public final void c() {
    }
}

