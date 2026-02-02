/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.ez
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.ez;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public final class bz1
implements ez {
    private static final long b = TimeUnit.SECONDS.toMillis(5L);
    @NotNull
    private final b8<?> a;

    public bz1(@NotNull b8<?> b82) {
        this.a = b82;
    }

    public final long a() {
        Long l10 = this.a.L();
        long l11 = l10 != null ? l10 : b;
        return l11;
    }
}

