/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.an
 *  com.yandex.mobile.ads.impl.t00
 */
package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.an;
import com.yandex.mobile.ads.impl.m41;
import com.yandex.mobile.ads.impl.t00;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class bn<V extends ViewGroup>
implements t00<V> {
    @NotNull
    private final m41 a;
    @NotNull
    private final an b;

    @JvmOverloads
    public bn(@NotNull m41 m412, @NotNull an an3) {
        this.a = m412;
        this.b = an3;
    }

    public final void a(@NotNull V object) {
        this.a.getClass();
        object = (TextView)object.findViewById(R.id.call_to_action);
        if (object != null) {
            this.b.a(object);
        }
    }

    public final void c() {
        this.b.a();
    }
}

