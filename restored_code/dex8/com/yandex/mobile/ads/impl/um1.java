/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  com.yandex.mobile.ads.impl.ct
 *  com.yandex.mobile.ads.impl.dd0
 *  com.yandex.mobile.ads.impl.et
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.m4
 *  com.yandex.mobile.ads.impl.mr1
 *  com.yandex.mobile.ads.impl.n53
 *  com.yandex.mobile.ads.impl.o53
 *  com.yandex.mobile.ads.impl.oq1
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.r4
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xp0
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.ct;
import com.yandex.mobile.ads.impl.dd0;
import com.yandex.mobile.ads.impl.dg0;
import com.yandex.mobile.ads.impl.et;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.l7;
import com.yandex.mobile.ads.impl.m4;
import com.yandex.mobile.ads.impl.mr1;
import com.yandex.mobile.ads.impl.n53;
import com.yandex.mobile.ads.impl.o53;
import com.yandex.mobile.ads.impl.oq1;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.qp0;
import com.yandex.mobile.ads.impl.r4;
import com.yandex.mobile.ads.impl.wp0;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xp0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class um1
implements dd0<qp0> {
    @NotNull
    private final xp0 a;
    @NotNull
    private final Handler b;
    @NotNull
    private final r4 c;
    @Nullable
    private et d;
    @Nullable
    private m4 e;
    @Nullable
    private String f;

    public /* synthetic */ um1(Context context, x2 x22, p4 p42, xp0 xp02) {
        this(xp02, new Handler(Looper.getMainLooper()), new r4(context, x22, p42));
    }

    public um1(@NotNull xp0 xp02, @NotNull Handler handler, @NotNull r4 r44) {
        this.a = xp02;
        this.b = handler;
        this.c = r44;
    }

    private static final void a(um1 um12, f3 f34) {
        et et3 = um12.d;
        if (et3 != null) {
            et3.a(f34);
        }
        if ((um12 = um12.e) != null) {
            um12.a();
        }
    }

    private static final void a(um1 um12, wp0 wp02) {
        et et3 = um12.d;
        if (et3 != null) {
            et3.a((ct)wp02);
        }
        if ((um12 = um12.e) != null) {
            um12.a();
        }
    }

    public static /* synthetic */ void b(um1 um12, f3 f34) {
        um1.a(um12, f34);
    }

    public static /* synthetic */ void c(um1 um12, wp0 wp02) {
        um1.a(um12, wp02);
    }

    public final void a(@NotNull dg0 dg02) {
        this.c.a((mr1)dg02);
    }

    public final void a(@Nullable et et3) {
        this.d = et3;
        this.c.a(new Object[]{et3});
    }

    public final void a(@NotNull f3 f34) {
        String string2 = f34.c();
        this.c.a(string2);
        f34 = new f3(f34.b(), f34.c(), f34.d(), this.f);
        this.b.post((Runnable)new n53(this, f34));
    }

    public final void a(@NotNull m4 m44) {
        this.e = m44;
    }

    public final void a(@NotNull qp0 object) {
        this.c.a();
        object = this.a.a((qp0)object);
        this.b.post((Runnable)new o53(this, (wp0)object));
    }

    public final void a(@NotNull x2 object) {
        object = new l7((x2)object);
        this.c.a((oq1)object);
    }

    public final void a(@Nullable String string2) {
        this.f = string2;
    }
}

