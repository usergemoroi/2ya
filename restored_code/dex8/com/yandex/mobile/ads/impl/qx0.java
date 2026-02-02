/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.qx0$a
 *  com.yandex.mobile.ads.impl.t51
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.qx0;
import com.yandex.mobile.ads.impl.s51;
import com.yandex.mobile.ads.impl.t51;
import com.yandex.mobile.ads.impl.x2;
import org.jetbrains.annotations.NotNull;

public final class qx0
implements t51 {
    @NotNull
    private final a a;

    public qx0(@NotNull a a14) {
        this.a = a14;
    }

    @NotNull
    public final s51 a(@NotNull Context object, @NotNull b8 b82, @NotNull x2 x22) {
        object = new s51((Context)object, x22, b82);
        this.a.a((s51)object);
        return object;
    }
}

