/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  com.yandex.mobile.ads.impl.a63
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.dt
 *  com.yandex.mobile.ads.impl.fd0
 *  com.yandex.mobile.ads.impl.gd0
 *  com.yandex.mobile.ads.impl.my1
 *  com.yandex.mobile.ads.impl.w53
 *  com.yandex.mobile.ads.impl.x53
 *  com.yandex.mobile.ads.impl.y53
 *  com.yandex.mobile.ads.impl.z5
 *  com.yandex.mobile.ads.impl.z53
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.a63;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.dt;
import com.yandex.mobile.ads.impl.fd0;
import com.yandex.mobile.ads.impl.gd0;
import com.yandex.mobile.ads.impl.gn2;
import com.yandex.mobile.ads.impl.my1;
import com.yandex.mobile.ads.impl.w53;
import com.yandex.mobile.ads.impl.x53;
import com.yandex.mobile.ads.impl.y53;
import com.yandex.mobile.ads.impl.z5;
import com.yandex.mobile.ads.impl.z53;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class vm1
implements gd0 {
    @Nullable
    private final fd0 a;
    @NotNull
    private final Handler b;
    @Nullable
    private dt c;

    public /* synthetic */ vm1(fd0 fd02) {
        this(fd02, new Handler(Looper.getMainLooper()));
    }

    public vm1(@Nullable fd0 fd02, @NotNull Handler handler) {
        this.a = fd02;
        this.b = handler;
    }

    private static final void a(vm1 vm12) {
        vm12 = vm12.c;
        if (vm12 != null) {
            vm12.onAdClicked();
        }
    }

    private static final void a(vm1 vm12, c4 c44) {
        vm12 = vm12.c;
        if (vm12 != null) {
            vm12.a(c44);
        }
    }

    private static final void a(z5 z53, vm1 vm12) {
        z53 = new my1(z53.a());
        vm12 = vm12.c;
        if (vm12 != null) {
            vm12.a((my1)z53);
        }
    }

    private static final void b(vm1 vm12) {
        vm12 = vm12.c;
        if (vm12 != null) {
            vm12.onAdDismissed();
        }
    }

    private static final void c(vm1 vm12) {
        dt dt3 = vm12.c;
        if (dt3 != null) {
            dt3.onAdShown();
        }
        if ((vm12 = vm12.a) != null) {
            vm12.onAdShown();
        }
    }

    public static /* synthetic */ void d(vm1 vm12) {
        vm1.b(vm12);
    }

    public static /* synthetic */ void e(vm1 vm12, c4 c44) {
        vm1.a(vm12, c44);
    }

    public static /* synthetic */ void f(z5 z53, vm1 vm12) {
        vm1.a(z53, vm12);
    }

    public static /* synthetic */ void g(vm1 vm12) {
        vm1.c(vm12);
    }

    public static /* synthetic */ void h(vm1 vm12) {
        vm1.a(vm12);
    }

    public final void a(@Nullable c4 c44) {
        this.b.post((Runnable)new z53(this, c44));
    }

    public final void a(@Nullable gn2 gn22) {
        this.c = gn22;
    }

    public final void a(@NotNull z5 z54) {
        this.b.post((Runnable)new w53(z54, this));
    }

    public final void onAdClicked() {
        this.b.post((Runnable)new y53(this));
    }

    public final void onAdDismissed() {
        this.b.post((Runnable)new a63(this));
    }

    public final void onAdShown() {
        this.b.post((Runnable)new x53(this));
    }
}

