/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.kf1
 *  com.yandex.mobile.ads.impl.si
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.kf1;
import com.yandex.mobile.ads.impl.si;
import org.jetbrains.annotations.NotNull;

public final class ez0
implements si {
    public final int a(@NotNull Context context, int n10, @NotNull kf1 kf12) {
        float f11 = gi2.a((Context)context, (kf1)kf12);
        n10 = n10 > 632 && 90.0f <= f11 * 0.15f ? 90 : 50;
        return n10;
    }
}

