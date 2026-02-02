/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ej0
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.h51
 *  com.yandex.mobile.ads.impl.i41
 *  com.yandex.mobile.ads.impl.j51
 *  com.yandex.mobile.ads.impl.j7
 *  com.yandex.mobile.ads.impl.t61
 *  com.yandex.mobile.ads.impl.u41
 *  com.yandex.mobile.ads.impl.v41
 *  com.yandex.mobile.ads.impl.v51
 *  com.yandex.mobile.ads.impl.w41
 *  com.yandex.mobile.ads.impl.w51
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ej0;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.h51;
import com.yandex.mobile.ads.impl.i41;
import com.yandex.mobile.ads.impl.j51;
import com.yandex.mobile.ads.impl.j7;
import com.yandex.mobile.ads.impl.t61;
import com.yandex.mobile.ads.impl.u41;
import com.yandex.mobile.ads.impl.v41;
import com.yandex.mobile.ads.impl.v51;
import com.yandex.mobile.ads.impl.w41;
import com.yandex.mobile.ads.impl.w51;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class w81
implements w41 {
    @NotNull
    private final w51 a;

    public /* synthetic */ w81(gv1 gv12) {
        this(new w51(gv12));
    }

    public w81(@NotNull w51 w512) {
        this.a = w512;
    }

    public final void a(@NotNull Context object, @NotNull v41 v412, @NotNull ej0 ej02, @NotNull u41 u412, @NotNull v51 v512, @NotNull h51 h512, @NotNull j51 j512) {
        List list = v412.c().e();
        if (list != null && !list.isEmpty()) {
            if (list.size() > 1) {
                object = u412.a(object, v412, ej02, v512, h512);
            } else {
                list = (i41)list.get(0);
                object = this.a.a(object, v412, ej02, u412, v512, h512, (i41)list);
            }
        } else {
            object = null;
        }
        if (object != null) {
            j512.a((t61)object);
        } else {
            j512.a(j7.x());
        }
    }
}

