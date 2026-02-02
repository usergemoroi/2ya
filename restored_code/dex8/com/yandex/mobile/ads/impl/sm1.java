/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  com.yandex.mobile.ads.impl.a43
 *  com.yandex.mobile.ads.impl.b43
 *  com.yandex.mobile.ads.impl.dd0
 *  com.yandex.mobile.ads.impl.f3
 *  com.yandex.mobile.ads.impl.fd0
 *  com.yandex.mobile.ads.impl.js
 *  com.yandex.mobile.ads.impl.ls
 *  com.yandex.mobile.ads.impl.m4
 *  com.yandex.mobile.ads.impl.mr1
 *  com.yandex.mobile.ads.impl.of
 *  com.yandex.mobile.ads.impl.oq1
 *  com.yandex.mobile.ads.impl.p4
 *  com.yandex.mobile.ads.impl.r4
 *  com.yandex.mobile.ads.impl.x2
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.a43;
import com.yandex.mobile.ads.impl.b43;
import com.yandex.mobile.ads.impl.dd0;
import com.yandex.mobile.ads.impl.dg0;
import com.yandex.mobile.ads.impl.f3;
import com.yandex.mobile.ads.impl.fd0;
import com.yandex.mobile.ads.impl.gf;
import com.yandex.mobile.ads.impl.js;
import com.yandex.mobile.ads.impl.l7;
import com.yandex.mobile.ads.impl.ls;
import com.yandex.mobile.ads.impl.m4;
import com.yandex.mobile.ads.impl.mr1;
import com.yandex.mobile.ads.impl.nf;
import com.yandex.mobile.ads.impl.of;
import com.yandex.mobile.ads.impl.oq1;
import com.yandex.mobile.ads.impl.p4;
import com.yandex.mobile.ads.impl.r4;
import com.yandex.mobile.ads.impl.x2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class sm1
implements dd0<gf> {
    @NotNull
    private final Handler a;
    @NotNull
    private final r4 b;
    @NotNull
    private final of c;
    @Nullable
    private ls d;
    @Nullable
    private m4 e;

    public /* synthetic */ sm1(Context context, x2 x22, p4 p42, fd0 fd02) {
        this(new Handler(Looper.getMainLooper()), new r4(context, x22, p42), new of(context, fd02));
    }

    public sm1(@NotNull Handler handler, @NotNull r4 r43, @NotNull of of2) {
        this.a = handler;
        this.b = r43;
        this.c = of2;
    }

    private static final void a(sm1 sm12, f3 f34) {
        ls ls3 = sm12.d;
        if (ls3 != null) {
            ls3.a(f34);
        }
        if ((sm12 = sm12.e) != null) {
            sm12.a();
        }
    }

    private static final void a(sm1 sm12, nf nf3) {
        ls ls3 = sm12.d;
        if (ls3 != null) {
            ls3.a((js)nf3);
        }
        if ((sm12 = sm12.e) != null) {
            sm12.a();
        }
    }

    public static /* synthetic */ void b(sm1 sm12, nf nf3) {
        sm1.a(sm12, nf3);
    }

    public static /* synthetic */ void c(sm1 sm12, f3 f34) {
        sm1.a(sm12, f34);
    }

    public final void a(@NotNull dg0 dg02) {
        this.b.a((mr1)dg02);
    }

    public final void a(@NotNull f3 f34) {
        String string2 = f34.c();
        this.b.a(string2);
        this.a.post((Runnable)new b43(this, f34));
    }

    public final void a(@NotNull gf object) {
        this.b.a();
        object = this.c.a((gf)object);
        this.a.post((Runnable)new a43(this, (nf)object));
    }

    public final void a(@Nullable ls ls3) {
        this.d = ls3;
        this.b.a(new Object[]{ls3});
    }

    public final void a(@NotNull m4 m43) {
        this.e = m43;
    }

    public final void a(@NotNull x2 object) {
        object = new l7((x2)object);
        this.b.a((oq1)object);
    }
}

