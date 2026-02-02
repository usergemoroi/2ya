/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.ci1
 *  com.yandex.mobile.ads.impl.cj1
 *  com.yandex.mobile.ads.impl.co0
 *  com.yandex.mobile.ads.impl.e9
 *  com.yandex.mobile.ads.impl.fm1
 *  com.yandex.mobile.ads.impl.tm0
 *  com.yandex.mobile.ads.impl.v60
 *  com.yandex.mobile.ads.impl.vi1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ci1;
import com.yandex.mobile.ads.impl.cj1;
import com.yandex.mobile.ads.impl.co0;
import com.yandex.mobile.ads.impl.e9;
import com.yandex.mobile.ads.impl.fm1;
import com.yandex.mobile.ads.impl.tm0;
import com.yandex.mobile.ads.impl.v60;
import com.yandex.mobile.ads.impl.vi1;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class c6
implements fm1 {
    @NotNull
    private final e9 a;
    @NotNull
    private final vi1 b;
    @NotNull
    private final v60 c;

    @JvmOverloads
    public c6(@NotNull e9 e92, @NotNull vi1 vi12, @NotNull v60 v602) {
        this.a = e92;
        this.b = vi12;
        this.c = v602;
    }

    @NotNull
    public final ci1 a() {
        cj1 cj12 = this.a.c();
        if (cj12 != null && (cj12 = cj12.d()) != null) {
            boolean bl2 = this.b.c();
            tm0 tm02 = this.a.a((co0)cj12);
            ci1 ci12 = ci1.a();
            cj12 = ci12;
            if (tm0.b != tm02) {
                cj12 = ci12;
                if (bl2) {
                    tm02 = this.c.a();
                    cj12 = ci12;
                    if (tm02 != null) {
                        cj12 = new ci1(tm02.getCurrentPosition(), tm02.getDuration());
                    }
                }
            }
            return cj12;
        }
        return ci1.a();
    }
}

