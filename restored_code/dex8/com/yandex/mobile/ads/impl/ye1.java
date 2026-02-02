/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.window.OnBackInvokedCallback
 *  android.window.OnBackInvokedDispatcher
 *  androidx.annotation.RequiresApi
 *  androidx.appcompat.app.m
 *  androidx.appcompat.app.n
 *  androidx.appcompat.app.o
 *  com.yandex.mobile.ads.impl.we1
 *  com.yandex.mobile.ads.impl.x0
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.m;
import androidx.appcompat.app.n;
import androidx.appcompat.app.o;
import com.yandex.mobile.ads.impl.ua3;
import com.yandex.mobile.ads.impl.we1;
import com.yandex.mobile.ads.impl.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ye1
implements we1 {
    @NotNull
    private final Activity a;
    @Nullable
    private final x0 b;
    @NotNull
    private final OnBackInvokedCallback c;

    public ye1(@NotNull Activity activity, @Nullable x0 x04) {
        this.a = activity;
        this.b = x04;
        this.c = new ua3(this);
    }

    private static final void a(ye1 ye12) {
        x0 x04 = ye12.b;
        if (x04 != null && x04.c()) {
            ye12.a.finish();
        }
    }

    public static /* synthetic */ void b(ye1 ye12) {
        ye1.a(ye12);
    }

    @RequiresApi(value=33)
    public final void a() {
        o.a((OnBackInvokedDispatcher)n.a((Activity)this.a), (int)0, (OnBackInvokedCallback)this.c);
    }

    @RequiresApi(value=33)
    public final void destroy() {
        m.a((OnBackInvokedDispatcher)n.a((Activity)this.a), (OnBackInvokedCallback)this.c);
    }
}

