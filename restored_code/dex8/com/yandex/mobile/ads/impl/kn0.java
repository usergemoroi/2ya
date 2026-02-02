/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.f92
 *  com.yandex.mobile.ads.impl.ff1
 *  com.yandex.mobile.ads.impl.rn0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.f92;
import com.yandex.mobile.ads.impl.ff1;
import com.yandex.mobile.ads.impl.rn0;
import org.jetbrains.annotations.NotNull;

public final class kn0
implements ff1 {
    @NotNull
    private final Context a;
    @NotNull
    private final rn0 b;
    @NotNull
    private final f92 c;

    public kn0(@NotNull Context context, @NotNull rn0 rn02, @NotNull f92 f922) {
        this.a = context;
        this.b = rn02;
        this.c = f922;
    }

    public final void a(@NotNull String string2) {
        if (this.c.a(this.a, string2)) {
            this.b.a();
        }
    }
}

