/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.d91
 *  com.yandex.mobile.ads.impl.vi0$a
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.d91;
import com.yandex.mobile.ads.impl.vi0;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class e91
implements vi0.a {
    private final boolean a;

    public e91(@NotNull b8<?> b82) {
        boolean bl2 = y.e(b82.E(), d91.c.a()) || y.e(b82.E(), d91.d.a());
        this.a = bl2;
    }

    public final boolean a() {
        return this.a;
    }
}

