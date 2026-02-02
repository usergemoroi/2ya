/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.gt
 *  com.yandex.mobile.ads.impl.q51
 *  com.yandex.mobile.ads.impl.t00
 */
package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.gt;
import com.yandex.mobile.ads.impl.q51;
import com.yandex.mobile.ads.impl.t00;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class rc<V extends ViewGroup>
implements t00<V> {
    @NotNull
    private final gt a;
    @NotNull
    private final q51 b;

    @JvmOverloads
    public rc(@NotNull gt gt3, @NotNull q51 q512) {
        this.a = gt3;
        this.b = q512;
    }

    public final void a(@NotNull V object) {
        this.b.getClass();
        object = object.findViewById(R.id.age_divider);
        if (object != null && this.a.a() == null) {
            object.setVisibility(8);
        }
    }

    public final void c() {
    }
}

