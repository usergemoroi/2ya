/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.monetization.ads.nativeads.CustomizableMediaView
 *  com.monetization.ads.nativeads.CustomizableMediaView$a
 *  com.yandex.mobile.ads.impl.cx0$a
 *  com.yandex.mobile.ads.impl.hz1
 *  com.yandex.mobile.ads.impl.jh2
 *  com.yandex.mobile.ads.impl.jx0
 *  com.yandex.mobile.ads.impl.lo1
 *  com.yandex.mobile.ads.impl.vf
 *  com.yandex.mobile.ads.impl.zw0
 *  kotlin.jvm.internal.e0
 *  kotlin.jvm.internal.f0
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.impl.cw1;
import com.yandex.mobile.ads.impl.cx0;
import com.yandex.mobile.ads.impl.fw1;
import com.yandex.mobile.ads.impl.hz1;
import com.yandex.mobile.ads.impl.jh2;
import com.yandex.mobile.ads.impl.jx0;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.zw0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public final class dw1
extends cx0 {
    static final KProperty<Object>[] j = new KProperty[]{v0.f((e0)new f0(dw1.class, "weakMediaView", "getWeakMediaView()Lcom/monetization/ads/nativeads/CustomizableMediaView;", 0)), v0.f((e0)new f0(dw1.class, "weakMediaValue", "getWeakMediaValue()Lcom/monetization/ads/network/model/MediaValue;", 0)), v0.f((e0)new f0(dw1.class, "currentViewAdapter", "getCurrentViewAdapter()Lcom/monetization/ads/nativeads/assetadapter/viewadapter/MediaViewAdapter;", 0))};
    @NotNull
    private final cx0 d;
    @NotNull
    private final cx0 e;
    @NotNull
    private final hz1 f;
    @NotNull
    private final ko1 g;
    @NotNull
    private final ko1 h;
    @NotNull
    private final fw1 i;

    public dw1(@NotNull CustomizableMediaView customizableMediaView, @NotNull cw1 cw12, @NotNull cx0 object, @NotNull jx0 jx02, @NotNull hz1 hz12) {
        super(customizableMediaView, jx02);
        this.d = cw12;
        this.e = object;
        this.f = hz12;
        this.g = lo1.a(null);
        this.h = lo1.a(null);
        object = kotlin.properties.a.a;
        this.i = new fw1(cw12, this);
        customizableMediaView.setOnSizeChangedListener$mobileads_externalRelease((CustomizableMediaView.a)new a(new WeakReference<dw1>(this)));
    }

    public static final void a(dw1 dw12, cx0 cx02) {
        dw12.i.setValue((Object)dw12, j[2], (Object)cx02);
    }

    public static final zw0 c(dw1 dw12) {
        return (zw0)dw12.h.getValue((Object)dw12, j[1]);
    }

    public static final CustomizableMediaView d(dw1 dw12) {
        return (CustomizableMediaView)dw12.g.getValue((Object)dw12, j[0]);
    }

    public final void a() {
        ((cx0)((Object)this.i.getValue((Object)this, j[2]))).a();
    }

    public final void a(View view) {
        view = (CustomizableMediaView)view;
        this.d.a(view);
        this.e.a(view);
    }

    @Override
    public final void a(@NotNull CustomizableMediaView customizableMediaView) {
        this.d.a(customizableMediaView);
        this.e.a(customizableMediaView);
    }

    @Override
    public final void a(@NotNull CustomizableMediaView customizableMediaView, @NotNull zw0 zw02) {
        ko1 ko12 = this.g;
        KProperty<Object>[] kPropertyArray = j;
        ko12.setValue((Object)this, kPropertyArray[0], customizableMediaView);
        this.h.setValue((Object)this, kPropertyArray[1], zw02);
        ((cx0)((Object)this.i.getValue((Object)this, kPropertyArray[2]))).a(customizableMediaView, zw02);
    }

    public final void a(vf vf3, jh2 jh22, Object object) {
        object = (zw0)object;
        this.d.a(vf3, jh22, object);
        this.e.a(vf3, jh22, object);
    }

    @Override
    public final void a(@NotNull zw0 zw02) {
        ((cx0)((Object)this.i.getValue((Object)this, j[2]))).a(zw02);
    }

    public final boolean a(View view, Object object) {
        view = (CustomizableMediaView)view;
        object = (zw0)object;
        return ((cx0)((Object)this.i.getValue((Object)this, j[2]))).a(view, object);
    }

    @Override
    @NotNull
    public final cx0.a d() {
        return ((cx0)((Object)this.i.getValue((Object)this, j[2]))).d();
    }

    private static final class a
    implements CustomizableMediaView.a {
        @NotNull
        private final WeakReference<dw1> a;

        public a(@NotNull WeakReference<dw1> weakReference) {
            this.a = weakReference;
        }

        public final void a(int n10, int n12) {
            hz1 hz12;
            dw1 dw12 = (dw1)((Object)this.a.get());
            if (dw12 != null && (n10 < (hz12 = dw12.f).b() || n12 < hz12.a())) {
                dw1.a(dw12, dw12.e);
            }
        }
    }
}

