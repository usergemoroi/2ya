/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  com.monetization.ads.fullscreen.template.view.CallToActionView
 *  com.yandex.mobile.ads.R$id
 *  com.yandex.mobile.ads.impl.jr1
 *  com.yandex.mobile.ads.impl.t00
 *  com.yandex.mobile.ads.impl.t61
 */
package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.monetization.ads.fullscreen.template.view.CallToActionView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.jr1;
import com.yandex.mobile.ads.impl.m41;
import com.yandex.mobile.ads.impl.t00;
import com.yandex.mobile.ads.impl.t61;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class dn<V extends ViewGroup>
implements t00<V> {
    @NotNull
    private final t61 a;
    @NotNull
    private final m41 b;

    public /* synthetic */ dn(t61 t612) {
        this(t612, new m41());
    }

    @JvmOverloads
    public dn(@NotNull t61 t612, @NotNull m41 m412) {
        this.a = t612;
        this.b = m412;
    }

    public final void a(@NotNull V object) {
        this.b.getClass();
        TextView textView = (TextView)object.findViewById(R.id.call_to_action);
        object = this.a.getAdType();
        if (textView instanceof CallToActionView && object != jr1.d) {
            ((CallToActionView)textView).a();
        }
    }

    public final void c() {
    }
}

