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

public final class ut1
implements si {
    public final int a(@NotNull Context context, int n10, @NotNull kf1 kf12) {
        n10 = gi2.a((Context)context, (kf1)kf12);
        float f11 = kf12 == kf1.c ? 90.0f : 100.0f;
        return a.d((float)j.d((float)j.h((float)f11, (float)((float)n10 * 0.15f)), (float)50.0f));
    }
}

