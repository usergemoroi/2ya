/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.bj1
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.d9
 *  com.yandex.mobile.ads.impl.di1
 *  com.yandex.mobile.ads.impl.em1
 *  com.yandex.mobile.ads.impl.sm0
 *  com.yandex.mobile.ads.impl.u60
 *  com.yandex.mobile.ads.impl.ui1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.bj1;
import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.d9;
import com.yandex.mobile.ads.impl.di1;
import com.yandex.mobile.ads.impl.em1;
import com.yandex.mobile.ads.impl.sm0;
import com.yandex.mobile.ads.impl.u60;
import com.yandex.mobile.ads.impl.ui1;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class b6
implements em1 {
    @NotNull
    private final d9 a;
    @NotNull
    private final ui1 b;
    @NotNull
    private final u60 c;

    @JvmOverloads
    public b6(@NotNull d9 d92, @NotNull ui1 ui12, @NotNull u60 u602) {
        this.a = d92;
        this.b = ui12;
        this.c = u602;
    }

    @NotNull
    public final di1 a() {
        bj1 bj12 = this.a.c();
        if (bj12 != null && (bj12 = bj12.d()) != null) {
            boolean bl2 = this.b.c();
            sm0 sm02 = this.a.a((co0)bj12);
            di1 di12 = di1.a();
            bj12 = di12;
            if (sm0.b != sm02) {
                bj12 = di12;
                if (bl2) {
                    sm02 = this.c.a();
                    bj12 = di12;
                    if (sm02 != null) {
                        bj12 = new di1(sm02.getCurrentPosition(), sm02.getDuration());
                    }
                }
            }
            return bj12;
        }
        return di1.a();
    }
}

