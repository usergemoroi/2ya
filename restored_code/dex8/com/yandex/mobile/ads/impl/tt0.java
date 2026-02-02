/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  com.yandex.mobile.ads.impl.kt0
 *  com.yandex.mobile.ads.impl.t43
 *  com.yandex.mobile.ads.impl.u43
 *  com.yandex.mobile.ads.impl.v43
 *  com.yandex.mobile.ads.impl.w43
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.kt0;
import com.yandex.mobile.ads.impl.sm2;
import com.yandex.mobile.ads.impl.t43;
import com.yandex.mobile.ads.impl.u43;
import com.yandex.mobile.ads.impl.v43;
import com.yandex.mobile.ads.impl.w43;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class tt0
implements kt0 {
    @NotNull
    private final Handler a;
    @Nullable
    private kt0 b;

    public /* synthetic */ tt0() {
        this(new Handler(Looper.getMainLooper()));
    }

    public tt0(@NotNull Handler handler) {
        this.a = handler;
    }

    private static final void a(tt0 tt02) {
        tt02 = tt02.b;
        if (tt02 != null) {
            tt02.onInstreamAdBreakCompleted();
        }
    }

    private static final void a(tt0 tt02, String string2) {
        tt02 = tt02.b;
        if (tt02 != null) {
            tt02.onInstreamAdBreakError(string2);
        }
    }

    private static final void b(tt0 tt02) {
        tt02 = tt02.b;
        if (tt02 != null) {
            tt02.onInstreamAdBreakPrepared();
        }
    }

    private static final void c(tt0 tt02) {
        tt02 = tt02.b;
        if (tt02 != null) {
            tt02.onInstreamAdBreakStarted();
        }
    }

    public static /* synthetic */ void d(tt0 tt02) {
        tt0.c(tt02);
    }

    public static /* synthetic */ void e(tt0 tt02, String string2) {
        tt0.a(tt02, string2);
    }

    public static /* synthetic */ void f(tt0 tt02) {
        tt0.a(tt02);
    }

    public static /* synthetic */ void g(tt0 tt02) {
        tt0.b(tt02);
    }

    public final void a(@Nullable sm2 sm22) {
        this.b = sm22;
    }

    public final void onInstreamAdBreakCompleted() {
        this.a.post((Runnable)new w43(this));
    }

    public final void onInstreamAdBreakError(@NotNull String string2) {
        this.a.post((Runnable)new t43(this, string2));
    }

    public final void onInstreamAdBreakPrepared() {
        this.a.post((Runnable)new u43(this));
    }

    public final void onInstreamAdBreakStarted() {
        this.a.post((Runnable)new v43(this));
    }
}

