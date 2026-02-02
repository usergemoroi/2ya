/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  com.monetization.ads.nativeads.CustomizableMediaView
 *  com.yandex.mobile.ads.impl.cx0$a
 *  com.yandex.mobile.ads.impl.hh2
 *  com.yandex.mobile.ads.impl.jh2
 *  com.yandex.mobile.ads.impl.jj0
 *  com.yandex.mobile.ads.impl.jx0
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.zw0
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.cx0;
import com.yandex.mobile.ads.impl.hh2;
import com.yandex.mobile.ads.impl.jh2;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.jx0;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.zw0;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class zv1
extends cx0 {
    @NotNull
    private final hh2<ImageView, jj0> d;

    public zv1(@NotNull CustomizableMediaView customizableMediaView, @NotNull jx0 jx02, @NotNull hh2 hh22) {
        super(customizableMediaView, jx02);
        this.d = hh22;
    }

    private static jj0 a(List list) {
        list = list != null && !list.isEmpty() ? (jj0)list.get(0) : null;
        return list;
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
        customizableMediaView = zv1.a(zw02.a());
        if (customizableMediaView == null) {
            return;
        }
        this.d.b((Object)customizableMediaView);
    }

    public final void a(vf vf3, jh2 jh22, Object list) {
        list = (list = (zw0)list) != null ? list.a() : null;
        list = zv1.a(list);
        this.d.a(vf3, jh22, (Object)list);
    }

    @Override
    public final void a(@NotNull zw0 zw02) {
        if ((zw02 = zv1.a(zw02.a())) == null) {
            return;
        }
        this.d.b((Object)zw02);
    }

    public final boolean a(View view, Object object) {
        view = (CustomizableMediaView)view;
        view = zv1.a(((zw0)object).a());
        boolean bl2 = view != null ? this.d.a((Object)view) : false;
        return bl2;
    }

    @Override
    @NotNull
    public final cx0.a d() {
        return cx0.a.f;
    }
}

