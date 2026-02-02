/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  com.yandex.mobile.ads.impl.b63
 *  com.yandex.mobile.ads.impl.c63
 *  com.yandex.mobile.ads.impl.d63
 *  com.yandex.mobile.ads.impl.gl0
 *  com.yandex.mobile.ads.impl.oo0
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.b63;
import com.yandex.mobile.ads.impl.c63;
import com.yandex.mobile.ads.impl.d63;
import com.yandex.mobile.ads.impl.gl0;
import com.yandex.mobile.ads.impl.oo0;
import com.yandex.mobile.ads.impl.xm2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class vn0
implements oo0 {
    @NotNull
    private final Handler a;
    @Nullable
    private gl0 b;

    public /* synthetic */ vn0() {
        this(new Handler(Looper.getMainLooper()));
    }

    public vn0(@NotNull Handler handler) {
        this.a = handler;
    }

    private static final void a(vn0 vn02) {
        vn02 = vn02.b;
        if (vn02 != null) {
            vn02.onInstreamAdPrepared();
        }
    }

    private static final void a(vn0 vn02, String string2) {
        vn02 = vn02.b;
        if (vn02 != null) {
            vn02.onError(string2);
        }
    }

    private static final void b(vn0 vn02) {
        vn02 = vn02.b;
        if (vn02 != null) {
            vn02.onInstreamAdCompleted();
        }
    }

    public static /* synthetic */ void c(vn0 vn02) {
        vn0.a(vn02);
    }

    public static /* synthetic */ void d(vn0 vn02) {
        vn0.b(vn02);
    }

    public static /* synthetic */ void e(vn0 vn02, String string2) {
        vn0.a(vn02, string2);
    }

    public final void a() {
        this.a.post((Runnable)new d63(this));
    }

    public final void a(@Nullable xm2 xm22) {
        this.b = xm22;
    }

    public final void b() {
        this.a.post((Runnable)new c63(this, "Video player returned error"));
    }

    public final void onInstreamAdPrepared() {
        this.a.post((Runnable)new b63(this));
    }
}

