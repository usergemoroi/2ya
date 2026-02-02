/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.v1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.v1;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public final class xy1
implements v1 {
    private static final long b = TimeUnit.SECONDS.toMillis(5L);
    @NotNull
    private final b8<?> a;

    public xy1(@NotNull b8<?> b82) {
        this.a = b82;
    }

    public final long a() {
        Long l10 = this.a.L();
        long l11 = l10 != null ? l10 : b;
        return l11;
    }

    public final long a(long l10) {
        Long l11 = this.a.L();
        long l13 = l10;
        if (l11 != null) {
            l13 = Math.min(l10, l11);
        }
        return l13;
    }
}

