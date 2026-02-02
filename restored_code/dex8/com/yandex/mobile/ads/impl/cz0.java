/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.monetization.ads.mediation.nativeads.MediatedNativeAd
 *  com.yandex.mobile.ads.impl.ac1
 *  com.yandex.mobile.ads.impl.bc1
 *  com.yandex.mobile.ads.impl.i41
 *  com.yandex.mobile.ads.impl.u6
 *  com.yandex.mobile.ads.impl.uy0
 */
package com.yandex.mobile.ads.impl;

import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import com.yandex.mobile.ads.impl.ac1;
import com.yandex.mobile.ads.impl.bc1;
import com.yandex.mobile.ads.impl.i41;
import com.yandex.mobile.ads.impl.u6;
import com.yandex.mobile.ads.impl.uy0;
import com.yandex.mobile.ads.impl.vy0;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;

public final class cz0
implements bc1 {
    @NotNull
    private final MediatedNativeAd a;
    @NotNull
    private final uy0 b;
    @NotNull
    private final u6 c;
    @NotNull
    private final bc1 d;

    @JvmOverloads
    public cz0(@NotNull MediatedNativeAd mediatedNativeAd, @NotNull uy0 uy02, @NotNull u6 u63, @NotNull bc1 bc12) {
        this.a = mediatedNativeAd;
        this.b = uy02;
        this.c = u63;
        this.d = bc12;
    }

    @NotNull
    public final ac1 a(@NotNull i41 i412) {
        return new vy0(this.d.a(i412), this.a, this.b, this.c);
    }
}

