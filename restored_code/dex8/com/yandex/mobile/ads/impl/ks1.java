/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  com.yandex.mobile.ads.impl.a6
 *  com.yandex.mobile.ads.impl.ct0
 *  com.yandex.mobile.ads.impl.dy2
 *  com.yandex.mobile.ads.impl.gt0
 *  com.yandex.mobile.ads.impl.hs
 *  com.yandex.mobile.ads.impl.wt
 *  com.yandex.mobile.ads.impl.z5
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.impl.a6;
import com.yandex.mobile.ads.impl.ct0;
import com.yandex.mobile.ads.impl.dy2;
import com.yandex.mobile.ads.impl.es1;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.hs;
import com.yandex.mobile.ads.impl.vn2;
import com.yandex.mobile.ads.impl.wt;
import com.yandex.mobile.ads.impl.xm1;
import com.yandex.mobile.ads.impl.z5;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ks1
implements wt {
    @NotNull
    private final es1 a;
    @NotNull
    private final xm1 b;
    @NotNull
    private final gt0 c;
    @NotNull
    private final ct0 d;
    @NotNull
    private final AtomicBoolean e;
    @NotNull
    private final hs f;

    public ks1(@NotNull es1 es12, @NotNull xm1 xm12, @NotNull gt0 gt02, @NotNull ct0 ct02) {
        this.a = es12;
        this.b = xm12;
        this.c = gt02;
        this.d = ct02;
        this.e = new AtomicBoolean(false);
        this.f = es12.n();
        es12.a(xm12);
    }

    private static final void a(ks1 ks12, Activity object) {
        if (!ks12.e.getAndSet(true)) {
            if ((object = u.e(ks12.a.a((Activity)object))) != null) {
                ks12.b.a(new z5(String.valueOf(((Throwable)object).getMessage())));
            }
        } else {
            ks12.b.a(a6.b());
        }
    }

    public static /* synthetic */ void b(ks1 ks12, Activity activity) {
        ks1.a(ks12, activity);
    }

    public final void a(@Nullable vn2 vn22) {
        this.c.a();
        this.b.a(vn22);
    }

    @NotNull
    public final hs getInfo() {
        return this.f;
    }

    public final void show(@NotNull Activity activity) {
        this.c.a();
        this.d.a((Runnable)new dy2(this, activity));
    }
}

