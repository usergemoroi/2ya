/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.lifecycle.LifecycleOwner
 *  com.monetization.ads.nativeads.ExtendedNativeAdView
 *  com.yandex.div.core.DivConfiguration
 *  com.yandex.div2.ca
 *  com.yandex.mobile.ads.R$layout
 *  com.yandex.mobile.ads.impl.ar0
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.d20
 *  com.yandex.mobile.ads.impl.eo
 *  com.yandex.mobile.ads.impl.f1
 *  com.yandex.mobile.ads.impl.ht
 *  com.yandex.mobile.ads.impl.n20
 *  com.yandex.mobile.ads.impl.nr
 *  com.yandex.mobile.ads.impl.o10
 *  com.yandex.mobile.ads.impl.sg
 *  com.yandex.mobile.ads.impl.t00
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.u00
 *  com.yandex.mobile.ads.impl.u61
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xd0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div2.ca;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.ar0;
import com.yandex.mobile.ads.impl.b02;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.c02;
import com.yandex.mobile.ads.impl.c20;
import com.yandex.mobile.ads.impl.d20;
import com.yandex.mobile.ads.impl.eo;
import com.yandex.mobile.ads.impl.f1;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.m20;
import com.yandex.mobile.ads.impl.n20;
import com.yandex.mobile.ads.impl.n41;
import com.yandex.mobile.ads.impl.nr;
import com.yandex.mobile.ads.impl.o10;
import com.yandex.mobile.ads.impl.oq;
import com.yandex.mobile.ads.impl.p51;
import com.yandex.mobile.ads.impl.sg;
import com.yandex.mobile.ads.impl.sq1;
import com.yandex.mobile.ads.impl.t00;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.td0;
import com.yandex.mobile.ads.impl.u00;
import com.yandex.mobile.ads.impl.u61;
import com.yandex.mobile.ads.impl.w20;
import com.yandex.mobile.ads.impl.wp1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xd0;
import java.util.Collection;
import org.jetbrains.annotations.NotNull;

public final class x20
implements xd0 {
    @NotNull
    private final ca a;
    @NotNull
    private final x2 b;
    @NotNull
    private final t00<ExtendedNativeAdView> c;
    @NotNull
    private final f1 d;
    @NotNull
    private final d20 e;
    private final int f;
    @NotNull
    private final o10 g;

    public /* synthetic */ x20(ca ca3, x2 x22, oq oq3, f1 f12, d20 d202, int n10) {
        this(ca3, x22, oq3, f12, d202, n10, new o10((wp1)x22.p().c()));
    }

    public x20(@NotNull ca ca3, @NotNull x2 x22, @NotNull oq oq3, @NotNull f1 f12, @NotNull d20 d202, int n10, @NotNull o10 o102) {
        this.a = ca3;
        this.b = x22;
        this.c = oq3;
        this.d = f12;
        this.e = d202;
        this.f = n10;
        this.g = o102;
    }

    @NotNull
    public final ar0 a(@NotNull Context object, @NotNull b8 object2, @NotNull t61 t612, @NotNull nr nr2, @NotNull ht ht3) {
        eo eo3 = new eo();
        Object object3 = new n20(eo3);
        Object object4 = this.g.a(object, this.a, t612, object3);
        Object object5 = new c20((Context)object, this.b, (b8)object2, nr2, this.e, (n20)object3);
        object3 = this.b.p().c();
        ca ca3 = this.a;
        object = object instanceof LifecycleOwner ? (LifecycleOwner)object : null;
        object4 = new m20(ca3, (c20)((Object)object5), (DivConfiguration)object4, (wp1)object3, null, (LifecycleOwner)object, 208);
        object5 = new sq1(this.d, this.f);
        if (t612 instanceof c02) {
            object = (c02)t612;
            object = new b02((c02)object, nr2, ht3, eo3, (wp1)object3, new n41(), new sg((Collection)u61.b((t61)object)));
        } else {
            object = new p51(t612, nr2, ht3, eo3, (wp1)object3, new n41(), new sg((Collection)u61.a((t61)t612)));
        }
        object = new oq(new t00[]{object5, object4, new td0((t00)object), this.c});
        object2 = new w20((b8<?>)object2);
        return new ar0(R.layout.monetization_ads_internal_divkit, (oq)object, (u00)object2);
    }
}

