/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.cr1
 *  com.yandex.mobile.ads.impl.xw0
 *  com.yandex.mobile.ads.impl.xw0$a
 *  okio.g
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cr1;
import com.yandex.mobile.ads.impl.xw0;
import okio.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class io1
extends cr1 {
    @Nullable
    private final String a;
    private final long b;
    @NotNull
    private final g c;

    public io1(@Nullable String string2, long l10, @NotNull g g10) {
        this.a = string2;
        this.b = l10;
        this.c = g10;
    }

    public final long a() {
        return this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public final xw0 b() {
        String string2 = this.a;
        if (string2 == null) return null;
        int n10 = xw0.d;
        try {
            return xw0.a.a((String)string2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    @NotNull
    public final g c() {
        return this.c;
    }
}

