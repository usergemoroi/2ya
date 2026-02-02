/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.dc2
 *  com.yandex.mobile.ads.impl.dt0
 *  com.yandex.mobile.ads.impl.hq1
 *  com.yandex.mobile.ads.impl.j3
 *  com.yandex.mobile.ads.impl.j43
 *  com.yandex.mobile.ads.impl.k43
 *  com.yandex.mobile.ads.impl.o4
 *  com.yandex.mobile.ads.impl.oq1
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.qm0
 *  com.yandex.mobile.ads.impl.r4
 *  com.yandex.mobile.ads.impl.us
 *  com.yandex.mobile.ads.impl.vs
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.dc2;
import com.yandex.mobile.ads.impl.dt0;
import com.yandex.mobile.ads.impl.fv;
import com.yandex.mobile.ads.impl.hq1;
import com.yandex.mobile.ads.impl.j3;
import com.yandex.mobile.ads.impl.j43;
import com.yandex.mobile.ads.impl.k43;
import com.yandex.mobile.ads.impl.o4;
import com.yandex.mobile.ads.impl.oq1;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.qm0;
import com.yandex.mobile.ads.impl.r4;
import com.yandex.mobile.ads.impl.us;
import com.yandex.mobile.ads.impl.vs;
import com.yandex.mobile.ads.impl.x2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class tl0
implements hq1<us> {
    @NotNull
    private final x2 a;
    @NotNull
    private final p4 b;
    @NotNull
    private final qm0 c;
    @NotNull
    private final dt0 d;
    @NotNull
    private final r4 e;
    @Nullable
    private vs f;

    public /* synthetic */ tl0(Context context, x2 x22, p4 p42, qm0 qm02) {
        this(x22, p42, qm02, new dt0(), new r4(context, x22, p42));
    }

    public tl0(@NotNull x2 x22, @NotNull p4 p42, @NotNull qm0 qm02, @NotNull dt0 dt02, @NotNull r4 r43) {
        this.a = x22;
        this.b = p42;
        this.c = qm02;
        this.d = dt02;
        this.e = r43;
    }

    private static final void a(tl0 tl02, dc2 dc22) {
        vs vs3 = tl02.f;
        if (vs3 != null) {
            vs3.a(dc22.a());
        }
        tl02.c.a();
    }

    private static final void a(tl0 tl02, us us3) {
        vs vs3 = tl02.f;
        if (vs3 != null) {
            vs3.a(us3);
        }
        tl02.c.a();
    }

    public static /* synthetic */ void b(tl0 tl02, us us3) {
        tl0.a(tl02, us3);
    }

    public static /* synthetic */ void c(tl0 tl02, dc2 dc22) {
        tl0.a(tl02, dc22);
    }

    public final void a() {
        fv fv3 = new fv();
        this.e.a((oq1)fv3);
    }

    public final void a(@NotNull dc2 dc22) {
        this.b.a(o4.e);
        this.e.a(dc22.a());
        this.d.a((Runnable)new k43(this, dc22));
    }

    public final void a(@NotNull us us3) {
        j3.a((String)this.a.b().b());
        this.b.a(o4.e);
        this.e.a();
        this.d.a((Runnable)new j43(this, us3));
    }

    public final void a(@Nullable vs vs3) {
        this.f = vs3;
        this.e.a(new Object[]{vs3});
    }
}

