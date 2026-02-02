/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.yandex.mobile.ads.impl.ga
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.ia
 *  com.yandex.mobile.ads.impl.jp0
 *  com.yandex.mobile.ads.impl.lo1
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.ga;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.ia;
import com.yandex.mobile.ads.impl.jp0;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.lo1;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public final class ha
implements ia {
    static final KProperty<Object>[] b = new KProperty[]{ga.a(ha.class, (String)"adViewReference", (String)"getAdViewReference()Lcom/monetization/ads/banner/InternalAdView;", (int)0)};
    @NotNull
    private final ko1 a;

    public ha(@NotNull jp0 jp02) {
        this.a = lo1.a((Object)jp02);
    }

    public final boolean a() {
        ko1 ko12 = this.a;
        jp0 jp02 = b;
        boolean bl2 = false;
        jp02 = (jp0)ko12.getValue(this, jp02[0]);
        boolean bl3 = bl2;
        if (jp02 != null) {
            bl3 = bl2;
            if (gi2.b((View)jp02) >= 1) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final boolean b() {
        ko1 ko12 = this.a;
        KProperty<Object>[] kPropertyArray = b;
        boolean bl2 = false;
        ko12 = (jp0)ko12.getValue(this, kPropertyArray[0]);
        boolean bl3 = bl2;
        if (ko12 != null) {
            bl3 = bl2;
            if (!gi2.e((View)ko12)) {
                bl3 = true;
            }
        }
        return bl3;
    }
}

