/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.fd0
 *  com.yandex.mobile.ads.impl.gd0
 *  com.yandex.mobile.ads.impl.my1
 *  com.yandex.mobile.ads.impl.na3
 *  com.yandex.mobile.ads.impl.oa3
 *  com.yandex.mobile.ads.impl.pa3
 *  com.yandex.mobile.ads.impl.qa3
 *  com.yandex.mobile.ads.impl.ra3
 *  com.yandex.mobile.ads.impl.sa3
 *  com.yandex.mobile.ads.impl.ss1
 *  com.yandex.mobile.ads.impl.xt
 *  com.yandex.mobile.ads.impl.yr1
 *  com.yandex.mobile.ads.impl.z5
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.fd0;
import com.yandex.mobile.ads.impl.gd0;
import com.yandex.mobile.ads.impl.my1;
import com.yandex.mobile.ads.impl.na3;
import com.yandex.mobile.ads.impl.oa3;
import com.yandex.mobile.ads.impl.ow1;
import com.yandex.mobile.ads.impl.pa3;
import com.yandex.mobile.ads.impl.qa3;
import com.yandex.mobile.ads.impl.ra3;
import com.yandex.mobile.ads.impl.sa3;
import com.yandex.mobile.ads.impl.ss1;
import com.yandex.mobile.ads.impl.vn2;
import com.yandex.mobile.ads.impl.xt;
import com.yandex.mobile.ads.impl.yr1;
import com.yandex.mobile.ads.impl.z5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class xm1
implements gd0,
ss1 {
    @Nullable
    private final fd0 a;
    @NotNull
    private final Handler b;
    @Nullable
    private xt c;

    public /* synthetic */ xm1(fd0 fd02) {
        this(fd02, new Handler(Looper.getMainLooper()));
    }

    public xm1(@Nullable fd0 fd02, @NotNull Handler handler) {
        this.a = fd02;
        this.b = handler;
    }

    private static final void a(xm1 xm12) {
        xm12 = xm12.c;
        if (xm12 != null) {
            xm12.onAdClicked();
        }
    }

    private static final void a(xm1 xm12, c4 c44) {
        xm12 = xm12.c;
        if (xm12 != null) {
            xm12.a(c44);
        }
    }

    private static final void a(xm1 xm12, yr1 yr12) {
        xm12 = xm12.c;
        if (xm12 != null) {
            xm12.a(yr12);
        }
    }

    private static final void a(z5 z54, xm1 xm12) {
        z54 = new my1(z54.a());
        xm12 = xm12.c;
        if (xm12 != null) {
            xm12.a((my1)z54);
        }
    }

    private static final void b(xm1 xm12) {
        xm12 = xm12.c;
        if (xm12 != null) {
            xm12.onAdDismissed();
        }
    }

    private static final void c(xm1 xm12) {
        xt xt2 = xm12.c;
        if (xt2 != null) {
            xt2.onAdShown();
        }
        if ((xm12 = xm12.a) != null) {
            xm12.onAdShown();
        }
    }

    public static /* synthetic */ void d(xm1 xm12) {
        xm1.b(xm12);
    }

    public static /* synthetic */ void e(xm1 xm12, c4 c44) {
        xm1.a(xm12, c44);
    }

    public static /* synthetic */ void f(xm1 xm12) {
        xm1.a(xm12);
    }

    public static /* synthetic */ void g(xm1 xm12) {
        xm1.c(xm12);
    }

    public static /* synthetic */ void h(xm1 xm12, yr1 yr12) {
        xm1.a(xm12, yr12);
    }

    public static /* synthetic */ void i(z5 z54, xm1 xm12) {
        xm1.a(z54, xm12);
    }

    public final void a(@Nullable c4 c44) {
        this.b.post((Runnable)new sa3(this, c44));
    }

    public final void a(@NotNull ow1 ow12) {
        this.b.post((Runnable)new qa3(this, (yr1)ow12));
    }

    public final void a(@Nullable vn2 vn22) {
        this.c = vn22;
    }

    public final void a(@NotNull z5 z54) {
        this.b.post((Runnable)new ra3(z54, this));
    }

    public final void onAdClicked() {
        this.b.post((Runnable)new oa3(this));
    }

    public final void onAdDismissed() {
        this.b.post((Runnable)new na3(this));
    }

    public final void onAdShown() {
        this.b.post((Runnable)new pa3(this));
    }
}

