/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  com.yandex.mobile.ads.impl.c4
 *  com.yandex.mobile.ads.impl.d53
 *  com.yandex.mobile.ads.impl.e53
 *  com.yandex.mobile.ads.impl.f53
 *  com.yandex.mobile.ads.impl.g53
 *  com.yandex.mobile.ads.impl.ht
 *  com.yandex.mobile.ads.impl.j0
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.c4;
import com.yandex.mobile.ads.impl.d53;
import com.yandex.mobile.ads.impl.e53;
import com.yandex.mobile.ads.impl.f53;
import com.yandex.mobile.ads.impl.g53;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class u51
implements j0 {
    @NotNull
    private final Handler a;
    @Nullable
    private ht b;

    public /* synthetic */ u51() {
        this(new Handler(Looper.getMainLooper()));
    }

    public u51(@NotNull Handler handler) {
        this.a = handler;
    }

    private static final void a(u51 u512) {
        u512 = u512.b;
        if (u512 != null) {
            u512.closeNativeAd();
        }
    }

    private static final void a(u51 u512, c4 c44) {
        u512 = u512.b;
        if (u512 != null) {
            u512.a(c44);
        }
    }

    private static final void b(u51 u512) {
        ht ht3 = u512.b;
        if (ht3 != null) {
            ht3.onAdClicked();
        }
        if ((u512 = u512.b) != null) {
            u512.onLeftApplication();
        }
    }

    public static /* synthetic */ void b(u51 u512, c4 c44) {
        u51.a(u512, c44);
    }

    private static final void c(u51 u512) {
        u512 = u512.b;
        if (u512 != null) {
            u512.onReturnedToApplication();
        }
    }

    public static /* synthetic */ void d(u51 u512) {
        u51.b(u512);
    }

    public static /* synthetic */ void e(u51 u512) {
        u51.c(u512);
    }

    public static /* synthetic */ void f(u51 u512) {
        u51.a(u512);
    }

    public final void a() {
        this.a.post((Runnable)new g53(this));
    }

    public final void a(@Nullable c4 c44) {
        this.a.post((Runnable)new f53(this, c44));
    }

    public final void a(@Nullable ht ht3) {
        this.b = ht3;
    }

    public final void onLeftApplication() {
        this.a.post((Runnable)new e53(this));
    }

    public final void onReturnedToApplication() {
        this.a.post((Runnable)new d53(this));
    }
}

