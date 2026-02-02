/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  com.yandex.mobile.ads.impl.i1
 *  com.yandex.mobile.ads.impl.q0
 *  com.yandex.mobile.ads.impl.y0
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.impl.i1;
import com.yandex.mobile.ads.impl.q0;
import com.yandex.mobile.ads.impl.y0;
import org.jetbrains.annotations.NotNull;

public final class n1
implements i1 {
    @NotNull
    private final Activity a;
    @NotNull
    private final y0 b;
    @NotNull
    private final q0 c;

    public n1(@NotNull Activity activity, @NotNull y0 y04, @NotNull q0 q02) {
        this.a = activity;
        this.b = y04;
        this.c = q02;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
        this.c.a(this.a, this.b);
    }

    public final void d() {
    }

    public final boolean f() {
        return true;
    }

    public final void g() {
    }

    public final void onAdClosed() {
    }
}

