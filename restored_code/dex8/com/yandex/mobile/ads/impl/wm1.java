/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  com.yandex.mobile.ads.impl.dd0
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.h73
 *  com.yandex.mobile.ads.impl.i73
 *  com.yandex.mobile.ads.impl.ls1
 *  com.yandex.mobile.ads.impl.m4
 *  com.yandex.mobile.ads.impl.mr1
 *  com.yandex.mobile.ads.impl.oq1
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.r4
 *  com.yandex.mobile.ads.impl.wt
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.yt
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.dd0;
import com.yandex.mobile.ads.impl.dg0;
import com.yandex.mobile.ads.impl.es1;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.h73;
import com.yandex.mobile.ads.impl.i73;
import com.yandex.mobile.ads.impl.ks1;
import com.yandex.mobile.ads.impl.l7;
import com.yandex.mobile.ads.impl.ls1;
import com.yandex.mobile.ads.impl.m4;
import com.yandex.mobile.ads.impl.mr1;
import com.yandex.mobile.ads.impl.oq1;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.r4;
import com.yandex.mobile.ads.impl.wt;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.yt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class wm1
implements dd0<es1> {
    @NotNull
    private final ls1 a;
    @NotNull
    private final Handler b;
    @NotNull
    private final r4 c;
    @Nullable
    private String d;
    @Nullable
    private yt e;
    @Nullable
    private m4 f;

    public /* synthetic */ wm1(Context context, x2 x22, p4 p42, ls1 ls12) {
        this(ls12, new Handler(Looper.getMainLooper()), new r4(context, x22, p42));
    }

    public wm1(@NotNull ls1 ls12, @NotNull Handler handler, @NotNull r4 r44) {
        this.a = ls12;
        this.b = handler;
        this.c = r44;
    }

    private static final void a(f3 f34, wm1 wm12) {
        f3 f35 = new f3(f34.b(), f34.c(), f34.d(), wm12.d);
        f34 = wm12.e;
        if (f34 != null) {
            f34.a(f35);
        }
        if ((f34 = wm12.f) != null) {
            f34.a();
        }
    }

    private static final void a(wm1 wm12, ks1 ks12) {
        yt yt2 = wm12.e;
        if (yt2 != null) {
            yt2.a((wt)ks12);
        }
        if ((wm12 = wm12.f) != null) {
            wm12.a();
        }
    }

    public static /* synthetic */ void b(wm1 wm12, ks1 ks12) {
        wm1.a(wm12, ks12);
    }

    public static /* synthetic */ void c(f3 f34, wm1 wm12) {
        wm1.a(f34, wm12);
    }

    public final void a(@NotNull dg0 dg02) {
        this.c.a((mr1)dg02);
    }

    public final void a(@NotNull es1 object) {
        this.c.a();
        object = this.a.a((es1)object);
        this.b.post((Runnable)new i73(this, (ks1)object));
    }

    public final void a(@NotNull f3 f34) {
        String string2 = f34.c();
        this.c.a(string2);
        this.b.post((Runnable)new h73(f34, this));
    }

    public final void a(@NotNull m4 m44) {
        this.f = m44;
    }

    public final void a(@NotNull x2 object) {
        object = new l7((x2)object);
        this.c.a((oq1)object);
    }

    public final void a(@Nullable yt yt2) {
        this.e = yt2;
        this.c.a(new Object[]{yt2});
    }

    public final void a(@Nullable String string2) {
        this.d = string2;
    }
}

