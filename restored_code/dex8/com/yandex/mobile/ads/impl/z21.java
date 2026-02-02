/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.gh2
 *  com.yandex.mobile.ads.impl.jh2
 *  com.yandex.mobile.ads.impl.ko
 *  com.yandex.mobile.ads.impl.su0
 *  com.yandex.mobile.ads.impl.vf
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.gh2;
import com.yandex.mobile.ads.impl.j21;
import com.yandex.mobile.ads.impl.jh2;
import com.yandex.mobile.ads.impl.ko;
import com.yandex.mobile.ads.impl.su0;
import com.yandex.mobile.ads.impl.vf;
import com.yandex.mobile.ads.impl.x21;
import org.jetbrains.annotations.NotNull;

public final class z21
extends gh2<x21, su0> {
    public z21(@NotNull x21 x212) {
        super((View)x212);
    }

    public final void a(vf vf3, jh2 jh22, Object object) {
        object = (su0)object;
        object = (x21)this.b();
        if (object != null) {
            jh22.a((View)object, vf3);
            jh22.a(vf3, (ko)new j21((x21)((Object)object)));
        }
    }

    public final void b(View object, Object object2) {
        object = (x21)((Object)object);
        su0 su02 = (su0)object2;
        if ((object2 = su02.b()) != null && ((String)object2).length() > 0) {
            ((x21)((Object)object)).setAspectRatio(su02.a());
            ((x21)((Object)object)).a((String)object2, null);
        }
    }
}

