/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.kf1
 *  com.yandex.mobile.ads.impl.si
 *  kotlin.math.a
 *  kotlin.ranges.j
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.kf1;
import com.yandex.mobile.ads.impl.si;
import kotlin.math.a;
import kotlin.ranges.j;
import org.jetbrains.annotations.NotNull;

public final class jr
implements si {
    public final int a(@NotNull Context context, int n10, @NotNull kf1 kf12) {
        float f11 = j.h((float)100.0f, (float)((float)gi2.a((Context)context, (kf1)kf12) * 0.15f));
        n10 = n10 > 655 ? a.c((double)((double)n10 / 728.0 * 90.0)) : (n10 > 632 ? 81 : (n10 > 526 ? a.c((double)((double)n10 / 468.0 * 60.0)) : (n10 > 432 ? 68 : a.c((double)((double)n10 / 320.0 * 50.0)))));
        return j.e((int)j.i((int)n10, (int)((int)f11)), (int)50);
    }
}

