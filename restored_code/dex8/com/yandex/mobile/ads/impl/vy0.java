/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.monetization.ads.mediation.nativeads.MediatedNativeAd
 *  com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider
 *  com.yandex.mobile.ads.impl.ac1
 *  com.yandex.mobile.ads.impl.i71
 *  com.yandex.mobile.ads.impl.lo
 *  com.yandex.mobile.ads.impl.s71
 *  com.yandex.mobile.ads.impl.u6
 *  com.yandex.mobile.ads.impl.uy0
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdViewProvider;
import com.yandex.mobile.ads.impl.ac1;
import com.yandex.mobile.ads.impl.i71;
import com.yandex.mobile.ads.impl.lo;
import com.yandex.mobile.ads.impl.ry0;
import com.yandex.mobile.ads.impl.s71;
import com.yandex.mobile.ads.impl.u6;
import com.yandex.mobile.ads.impl.uy0;
import org.jetbrains.annotations.NotNull;

public final class vy0
implements ac1 {
    @NotNull
    private final ac1 a;
    @NotNull
    private final MediatedNativeAd b;
    @NotNull
    private final uy0 c;
    @NotNull
    private final u6 d;
    private boolean e;

    public vy0(@NotNull ac1 ac12, @NotNull MediatedNativeAd mediatedNativeAd, @NotNull uy0 uy02, @NotNull u6 u63) {
        this.a = ac12;
        this.b = mediatedNativeAd;
        this.c = uy02;
        this.d = u63;
    }

    public final void a() {
        this.a.a();
    }

    public final void a(@NotNull i71 object) {
        this.a.a(object);
        s71 s712 = object.h();
        object = object.f();
        if (object != null) {
            object = new ry0((View)object, s712);
            this.b.unbindNativeAd((MediatedNativeAdViewProvider)object);
        }
        if (this.e) {
            this.d.d();
        }
    }

    public final void a(@NotNull i71 i712, @NotNull lo object) {
        this.a.a(i712, object);
        s71 s712 = i712.h();
        object = i712.f();
        if (object != null) {
            object = new ry0((View)object, s712);
            this.b.bindNativeAd((MediatedNativeAdViewProvider)object);
        }
        this.d.c();
        if (i712.f() != null && !this.e) {
            this.e = true;
            this.c.a();
        }
    }
}

