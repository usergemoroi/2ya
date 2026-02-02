/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.view.View
 *  android.widget.FrameLayout
 *  com.yandex.mobile.ads.impl.fp
 *  com.yandex.mobile.ads.impl.g92
 *  com.yandex.mobile.ads.impl.k21$a
 */
package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.impl.fp;
import com.yandex.mobile.ads.impl.g92;
import com.yandex.mobile.ads.impl.k21;
import org.jetbrains.annotations.NotNull;

public final class k21
implements fp {
    @NotNull
    private final View a;
    @NotNull
    private final g92 b;
    @NotNull
    private final Handler c;
    private boolean d;

    public k21(@NotNull FrameLayout frameLayout, @NotNull g92 g922, @NotNull Handler handler) {
        this.a = frameLayout;
        this.b = g922;
        this.c = handler;
        this.d().setVisibility(8);
    }

    public final void a() {
    }

    public final void a(boolean bl2) {
        this.d = true;
        this.c.removeCallbacksAndMessages(null);
        g92 g922 = this.b;
        View view = this.a;
        g922.getClass();
        int n10 = bl2 ? 8 : 0;
        view.setVisibility(n10);
    }

    public final void b() {
    }

    public final void c() {
        if (!this.d) {
            a a13 = new /* Unavailable Anonymous Inner Class!! */;
            this.c.postDelayed((Runnable)a13, 200L);
        }
    }

    @NotNull
    public final View d() {
        return this.a;
    }

    public final void invalidate() {
    }
}

