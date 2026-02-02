/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  com.yandex.mobile.ads.impl.ad2
 *  com.yandex.mobile.ads.impl.ae2
 *  com.yandex.mobile.ads.impl.be2
 *  com.yandex.mobile.ads.impl.dh2
 *  com.yandex.mobile.ads.impl.ee2
 *  com.yandex.mobile.ads.impl.kc2
 *  com.yandex.mobile.ads.impl.nd2
 *  com.yandex.mobile.ads.impl.pd2
 *  com.yandex.mobile.ads.impl.xg2
 */
package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import com.yandex.mobile.ads.impl.ad2;
import com.yandex.mobile.ads.impl.ae2;
import com.yandex.mobile.ads.impl.be2;
import com.yandex.mobile.ads.impl.dh2;
import com.yandex.mobile.ads.impl.ee2;
import com.yandex.mobile.ads.impl.fh2;
import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.nd2;
import com.yandex.mobile.ads.impl.pd2;
import com.yandex.mobile.ads.impl.xg2;
import com.yandex.mobile.ads.impl.yg2;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class li2<T>
implements nd2,
pd2 {
    @NotNull
    private final kc2<T> a;
    @NotNull
    private final be2 b;
    @NotNull
    private final xg2 c;
    @NotNull
    private final ad2<T> d;
    @NotNull
    private final ee2 e;
    @Nullable
    private Long f;
    private boolean g;

    public li2(@NotNull kc2 kc22, @NotNull be2 be22, @NotNull yg2 yg22, @NotNull ad2 ad22, @NotNull ee2 ee22) {
        this.a = kc22;
        this.b = be22;
        this.c = yg22;
        this.d = ad22;
        this.e = ee22;
    }

    public /* synthetic */ li2(kc2 kc22, dh2 dh22, be2 be22, yg2 yg22, ad2 ad22) {
        this(kc22, be22, yg22, ad22, new fh2(dh22));
    }

    public final void a() {
        this.f = null;
    }

    public final void a(long l10, long l11) {
        if (!this.g) {
            boolean bl2 = this.e.a();
            k0 k02 = null;
            if (bl2 && this.b.a() == ae2.e) {
                l10 = SystemClock.elapsedRealtime();
                Long l13 = this.f;
                if (l13 != null) {
                    if (l10 - l13 >= 2000L) {
                        this.g = true;
                        this.d.k(this.a);
                        this.c.n();
                    }
                    k02 = k0.a;
                }
                if (k02 == null) {
                    this.f = l10;
                    this.d.l(this.a);
                }
            } else {
                this.f = null;
            }
        }
    }

    public final void b() {
        this.f = null;
    }
}

