/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.ej0
 *  com.yandex.mobile.ads.impl.kc2
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.pn0
 *  com.yandex.mobile.ads.impl.pn0$a
 *  com.yandex.mobile.ads.impl.sj0
 *  com.yandex.mobile.ads.impl.vf
 */
package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.ao0;
import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.pn0;
import com.yandex.mobile.ads.impl.sj0;
import com.yandex.mobile.ads.impl.vf;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public final class qn0
implements sj0 {
    final pn0 a;
    final List<vf<?>> b;
    final ej0 c;
    final pn0.a d;
    final kc2<co0> e;

    qn0(pn0 pn02, List list, ej0 ej02, ao0 ao02, kc2 kc22) {
        this.a = pn02;
        this.b = list;
        this.c = ej02;
        this.d = ao02;
        this.e = kc22;
    }

    public final void a(@NotNull String string2, @NotNull Bitmap bitmap) {
    }

    public final void a(@NotNull Map<String, Bitmap> map2) {
        pn0.a((pn0)this.a).a(o4.o);
        ArrayList arrayList = pn0.b((pn0)this.a).a(this.b, map2);
        pn0.c((pn0)this.a).a((List)arrayList, map2);
        this.c.a(map2);
        this.d.c(this.e);
    }
}

