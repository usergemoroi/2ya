/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.viewpager2.widget.ViewPager2
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.ej0
 *  com.yandex.mobile.ads.impl.gh2
 *  com.yandex.mobile.ads.impl.jj0
 */
package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.gh2;
import com.yandex.mobile.ads.impl.jj0;
import com.yandex.mobile.ads.impl.q31;
import com.yandex.mobile.ads.impl.wp1;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class t31
extends gh2<ViewPager2, List<? extends jj0>> {
    @NotNull
    private final ej0 c;
    @NotNull
    private final wp1 d;
    @NotNull
    private final b8<?> e;

    public t31(@NotNull ViewPager2 viewPager2, @NotNull ej0 ej02, @NotNull wp1 wp12, @NotNull b8<?> b82) {
        super((View)viewPager2);
        this.c = ej02;
        this.d = wp12;
        this.e = b82;
    }

    public final boolean a(View view, Object object) {
        view = (ViewPager2)view;
        object = (List)object;
        return view.getAdapter() instanceof q31;
    }

    public final void b(View object, Object object2) {
        object = (ViewPager2)object;
        List list = (List)object2;
        try {
            object2 = new q31(this.c, list, this.e);
            object.setAdapter((RecyclerView.Adapter)object2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            wp1 wp12 = this.d;
            object2 = illegalArgumentException.getMessage();
            object = object2;
            if (object2 == null) {
                object = "IllegalArgumentException: set adapter exception";
            }
            wp12.reportError((String)object, illegalArgumentException);
        }
    }
}

