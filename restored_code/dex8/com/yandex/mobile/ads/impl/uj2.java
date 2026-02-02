/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.t00
 */
package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.m41;
import com.yandex.mobile.ads.impl.t00;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class uj2<V extends ViewGroup>
implements t00<V> {
    @NotNull
    private final m41 a;

    public /* synthetic */ uj2() {
        this(new m41());
    }

    @JvmOverloads
    public uj2(@NotNull m41 m412) {
        this.a = m412;
    }

    public final void a(@NotNull V object) {
        this.a.getClass();
        object = (TextView)object.findViewById(R.id.warning);
        if (object != null) {
            object.setSelected(true);
        }
    }

    public final void c() {
    }
}

