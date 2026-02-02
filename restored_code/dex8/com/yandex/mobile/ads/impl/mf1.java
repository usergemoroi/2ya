/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.u00
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.u00;
import org.jetbrains.annotations.NotNull;

public final class mf1
implements u00 {
    private final int a;

    public mf1(int n10) {
        this.a = n10;
    }

    public final boolean a(@NotNull Context context) {
        int n10 = context.getResources().getConfiguration().orientation;
        boolean bl2 = this.a == n10;
        return bl2;
    }
}

