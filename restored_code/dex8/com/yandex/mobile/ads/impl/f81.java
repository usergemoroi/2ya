/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.gf2
 *  com.yandex.mobile.ads.impl.ib1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.db1;
import com.yandex.mobile.ads.impl.gf2;
import com.yandex.mobile.ads.impl.ib1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class f81
implements ib1 {
    @NotNull
    private final db1 a;
    @Nullable
    private gf2 b;

    public f81(@NotNull db1 db12, @Nullable gf2 gf22) {
        this.a = db12;
        this.b = gf22;
    }

    public final void a() {
        this.a.b(this);
        this.b = null;
    }

    public final void a(long l10, long l11) {
    }

    public final void b() {
    }

    public final void c() {
        gf2 gf22 = this.b;
        if (gf22 != null) {
            gf22.onVideoComplete();
        }
    }

    public final void d() {
        this.a.a(this);
    }
}

