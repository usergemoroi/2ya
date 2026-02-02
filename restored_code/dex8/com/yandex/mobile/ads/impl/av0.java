/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.gi2
 *  com.yandex.mobile.ads.impl.u00
 *  com.yandex.mobile.ads.impl.uu0
 *  kotlin.math.a
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.gi2;
import com.yandex.mobile.ads.impl.u00;
import com.yandex.mobile.ads.impl.uu0;
import kotlin.jvm.JvmOverloads;
import kotlin.math.a;
import org.jetbrains.annotations.NotNull;

public final class av0
implements u00 {
    private final int a;
    @NotNull
    private final uu0 b;

    @JvmOverloads
    public av0(int n10, @NotNull uu0 uu02) {
        this.a = n10;
        this.b = uu02;
    }

    public final boolean a(@NotNull Context object) {
        int n10 = gi2.c((Context)object);
        int n12 = object.getResources().getDisplayMetrics().widthPixels;
        object = this.b.a();
        boolean bl2 = false;
        n10 = object != null ? kotlin.math.a.d((float)(((Float)object).floatValue() * (float)n10)) : 0;
        if (n12 - n10 >= this.a) {
            bl2 = true;
        }
        return bl2;
    }
}

