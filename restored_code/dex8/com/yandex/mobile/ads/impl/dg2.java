/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.d9
 *  com.yandex.mobile.ads.impl.di1
 *  com.yandex.mobile.ads.impl.em1
 *  com.yandex.mobile.ads.impl.sj1
 *  com.yandex.mobile.ads.impl.ui1
 *  com.yandex.mobile.ads.impl.uj1
 *  com.yandex.mobile.ads.impl.ze2
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.d9;
import com.yandex.mobile.ads.impl.di1;
import com.yandex.mobile.ads.impl.em1;
import com.yandex.mobile.ads.impl.oi1;
import com.yandex.mobile.ads.impl.sj1;
import com.yandex.mobile.ads.impl.ui1;
import com.yandex.mobile.ads.impl.uj1;
import com.yandex.mobile.ads.impl.ze2;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class dg2
implements em1 {
    @NotNull
    private final d9 a;
    @NotNull
    private final uj1 b;
    @NotNull
    private final ze2 c;
    @NotNull
    private final ui1 d;

    @JvmOverloads
    public dg2(@NotNull d9 d92, @NotNull uj1 uj12, @NotNull ze2 ze22, @NotNull ui1 ui12) {
        this.a = d92;
        this.b = uj12;
        this.c = ze22;
        this.d = ui12;
    }

    @NotNull
    public final di1 a() {
        sj1 sj12 = this.b.a();
        oi1 oi12 = this.b.b();
        long l10 = -1L;
        long l11 = sj12 != null ? sj12.a() : (oi12 != null && !this.a.b() && !this.d.c() ? oi12.a() : -1L);
        if (this.c.a() != -9223372036854775807L) {
            l10 = this.c.a();
        }
        return new di1(l11, l10);
    }
}

