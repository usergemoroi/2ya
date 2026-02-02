/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.fd0
 *  com.yandex.mobile.ads.impl.gd0
 *  com.yandex.mobile.ads.impl.ks
 *  com.yandex.mobile.ads.impl.my1
 *  com.yandex.mobile.ads.impl.n43
 *  com.yandex.mobile.ads.impl.o43
 *  com.yandex.mobile.ads.impl.p43
 *  com.yandex.mobile.ads.impl.q43
 *  com.yandex.mobile.ads.impl.r43
 *  com.yandex.mobile.ads.impl.z5
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.fd0;
import com.yandex.mobile.ads.impl.fm2;
import com.yandex.mobile.ads.impl.gd0;
import com.yandex.mobile.ads.impl.ks;
import com.yandex.mobile.ads.impl.my1;
import com.yandex.mobile.ads.impl.n43;
import com.yandex.mobile.ads.impl.o43;
import com.yandex.mobile.ads.impl.p43;
import com.yandex.mobile.ads.impl.q43;
import com.yandex.mobile.ads.impl.r43;
import com.yandex.mobile.ads.impl.z5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class tm1
implements gd0 {
    @Nullable
    private final fd0 a;
    @NotNull
    private final Handler b;
    @Nullable
    private ks c;

    public /* synthetic */ tm1(fd0 fd02) {
        this(fd02, new Handler(Looper.getMainLooper()));
    }

    public tm1(@Nullable fd0 fd02, @NotNull Handler handler) {
        this.a = fd02;
        this.b = handler;
    }

    private static final void a(tm1 tm12) {
        tm12 = tm12.c;
        if (tm12 != null) {
            tm12.onAdClicked();
        }
    }

    private static final void a(tm1 tm12, c4 c44) {
        tm12 = tm12.c;
        if (tm12 != null) {
            tm12.a(c44);
        }
    }

    private static final void a(z5 z53, tm1 tm12) {
        z53 = new my1(z53.a());
        tm12 = tm12.c;
        if (tm12 != null) {
            tm12.a((my1)z53);
        }
    }

    private static final void b(tm1 tm12) {
        tm12 = tm12.c;
        if (tm12 != null) {
            tm12.onAdDismissed();
        }
    }

    private static final void c(tm1 tm12) {
        ks ks3 = tm12.c;
        if (ks3 != null) {
            ks3.onAdShown();
        }
        if ((tm12 = tm12.a) != null) {
            tm12.onAdShown();
        }
    }

    public static /* synthetic */ void d(tm1 tm12) {
        tm1.c(tm12);
    }

    public static /* synthetic */ void e(tm1 tm12) {
        tm1.b(tm12);
    }

    public static /* synthetic */ void f(z5 z53, tm1 tm12) {
        tm1.a(z53, tm12);
    }

    public static /* synthetic */ void g(tm1 tm12) {
        tm1.a(tm12);
    }

    public static /* synthetic */ void h(tm1 tm12, c4 c44) {
        tm1.a(tm12, c44);
    }

    public final void a(@Nullable c4 c44) {
        this.b.post((Runnable)new n43(this, c44));
    }

    public final void a(@Nullable fm2 fm22) {
        this.c = fm22;
    }

    public final void a(@NotNull z5 z53) {
        this.b.post((Runnable)new r43(z53, this));
    }

    public final void onAdClicked() {
        this.b.post((Runnable)new p43(this));
    }

    public final void onAdDismissed() {
        this.b.post((Runnable)new o43(this));
    }

    public final void onAdShown() {
        this.b.post((Runnable)new q43(this));
    }
}

