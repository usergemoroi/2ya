/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.monetization.ads.nativeads.CustomizableMediaView
 *  com.yandex.mobile.ads.impl.cx0$a
 *  com.yandex.mobile.ads.impl.hh2
 *  com.yandex.mobile.ads.impl.jh2
 *  com.yandex.mobile.ads.impl.jx0
 *  com.yandex.mobile.ads.impl.su0
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.zw0
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.cx0;
import com.yandex.mobile.ads.impl.hh2;
import com.yandex.mobile.ads.impl.jh2;
import com.yandex.mobile.ads.impl.jx0;
import com.yandex.mobile.ads.impl.su0;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.x21;
import com.yandex.mobile.ads.impl.zw0;
import org.jetbrains.annotations.NotNull;

public final class aw1
extends cx0 {
    @NotNull
    private final hh2<x21, su0> d;

    public aw1(@NotNull CustomizableMediaView customizableMediaView, @NotNull jx0 jx02, @NotNull hh2 hh22) {
        super(customizableMediaView, jx02);
        this.d = hh22;
    }

    public final void a(View view) {
        view = (CustomizableMediaView)view;
        this.d.a();
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    @Override
    public final void a(@NotNull CustomizableMediaView customizableMediaView) {
        this.d.a();
    }

    @Override
    public final void a(@NotNull CustomizableMediaView customizableMediaView, @NotNull zw0 zw02) {
        super.a(customizableMediaView, zw02);
        customizableMediaView = zw02.b();
        if (customizableMediaView == null) {
            return;
        }
        this.d.b((Object)customizableMediaView);
    }

    public final void a(vf vf3, jh2 jh22, Object object) {
        object = (zw0)object;
        hh2<x21, su0> hh22 = this.d;
        object = object != null ? object.b() : null;
        hh22.a(vf3, jh22, object);
    }

    @Override
    public final void a(@NotNull zw0 zw02) {
    }

    public final boolean a(View view, Object object) {
        view = (CustomizableMediaView)view;
        view = ((zw0)object).b();
        boolean bl2 = view != null ? this.d.a((Object)view) : false;
        return bl2;
    }

    @Override
    @NotNull
    public final cx0.a d() {
        return cx0.a.c;
    }
}

