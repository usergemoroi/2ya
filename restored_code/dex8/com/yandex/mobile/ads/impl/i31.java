/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.viewpager2.widget.ViewPager2
 *  com.yandex.mobile.ads.impl.ga
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.i31$a
 *  com.yandex.mobile.ads.impl.jn
 *  com.yandex.mobile.ads.impl.l31
 *  com.yandex.mobile.ads.impl.lo1
 *  com.yandex.mobile.ads.impl.s31
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.impl.ga;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.i31;
import com.yandex.mobile.ads.impl.jn;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.l31;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.s31;
import kotlin.k0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public final class i31
extends jn {
    static final KProperty<Object>[] g = new KProperty[]{ga.a(i31.class, (String)"viewPager", (String)"getViewPager()Landroidx/viewpager2/widget/ViewPager2;", (int)0)};
    @NotNull
    private final s31 c;
    @NotNull
    private final l31 d;
    @NotNull
    private final ko1 e;
    @NotNull
    private a f;

    public i31(@NotNull ViewPager2 viewPager2, @NotNull s31 s312, @NotNull l31 l312) {
        this.c = s312;
        this.d = l312;
        this.e = lo1.a((Object)viewPager2);
        this.f = a.b;
    }

    public final void run() {
        ko1 ko12 = this.e;
        Object object = g;
        int n10 = 0;
        if ((object = (ViewPager2)ko12.getValue((Object)this, object[0])) != null) {
            if (gi2.b((View)object) > 0) {
                ko12 = object.getAdapter();
                if (ko12 != null) {
                    n10 = ko12.getItemCount();
                }
                if (n10 != 0) {
                    int n13 = object.getCurrentItem();
                    if (n13 == 0) {
                        this.f = a.b;
                    } else if (n13 == n10 - 1) {
                        this.f = a.c;
                    }
                } else {
                    this.a();
                }
                n10 = this.f.ordinal();
                if (n10 != 0) {
                    if (n10 == 1) {
                        this.c.b();
                    }
                } else {
                    this.c.a();
                }
                this.d.a();
            }
            object = k0.a;
        } else {
            object = null;
        }
        if (object == null) {
            this.a();
        }
    }
}

