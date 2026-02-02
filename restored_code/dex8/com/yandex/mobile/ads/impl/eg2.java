/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.af2
 *  com.yandex.mobile.ads.impl.ci1
 *  com.yandex.mobile.ads.impl.e9
 *  com.yandex.mobile.ads.impl.fm1
 *  com.yandex.mobile.ads.impl.tj1
 *  com.yandex.mobile.ads.impl.vi1
 *  com.yandex.mobile.ads.impl.vj1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.af2;
import com.yandex.mobile.ads.impl.ci1;
import com.yandex.mobile.ads.impl.e9;
import com.yandex.mobile.ads.impl.fm1;
import com.yandex.mobile.ads.impl.pi1;
import com.yandex.mobile.ads.impl.tj1;
import com.yandex.mobile.ads.impl.vi1;
import com.yandex.mobile.ads.impl.vj1;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class eg2
implements fm1 {
    @NotNull
    private final e9 a;
    @NotNull
    private final vj1 b;
    @NotNull
    private final af2 c;
    @NotNull
    private final vi1 d;

    @JvmOverloads
    public eg2(@NotNull e9 e92, @NotNull vj1 vj12, @NotNull af2 af22, @NotNull vi1 vi12) {
        this.a = e92;
        this.b = vj12;
        this.c = af22;
        this.d = vi12;
    }

    @NotNull
    public final ci1 a() {
        tj1 tj12 = this.b.a();
        pi1 pi12 = this.b.b();
        long l10 = -1L;
        long l11 = tj12 != null ? tj12.a() : (pi12 != null && !this.a.b() && !this.d.c() ? pi12.a() : -1L);
        if (this.c.a() != -9223372036854775807L) {
            l10 = this.c.a();
        }
        return new ci1(l11, l10);
    }
}

