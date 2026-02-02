/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.viewpager2.widget.ViewPager2
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
import androidx.viewpager2.widget.ViewPager2;
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

public final class bw1
extends cx0 {
    @NotNull
    private final hh2<ViewPager2, List<jj0>> d;

    public bw1(@NotNull CustomizableMediaView customizableMediaView, @NotNull jx0 jx02, @NotNull hh2 hh22) {
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
    public final void a(@NotNull CustomizableMediaView object, @NotNull zw0 zw02) {
        super.a((CustomizableMediaView)object, zw02);
        object = zw02.a();
        if (object != null && object.isEmpty() ^ true) {
            this.d.b(object);
        }
    }

    public final void a(vf vf3, jh2 jh22, Object list) {
        list = (list = (zw0)list) != null ? list.a() : null;
        this.d.a(vf3, jh22, (Object)list);
    }

    @Override
    public final void a(@NotNull zw0 object) {
        if ((object = object.a()) != null && object.isEmpty() ^ true) {
            this.d.b(object);
        }
    }

    public final boolean a(View object, Object object2) {
        object = (CustomizableMediaView)object;
        object = ((zw0)object2).a();
        boolean bl2 = object != null && object.isEmpty() ^ true ? this.d.a(object) : false;
        return bl2;
    }

    @Override
    @NotNull
    public final cx0.a d() {
        return cx0.a.e;
    }
}

