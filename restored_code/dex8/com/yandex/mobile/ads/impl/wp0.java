/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  com.yandex.mobile.ads.impl.a6
 *  com.yandex.mobile.ads.impl.ct
 *  com.yandex.mobile.ads.impl.ct0
 *  com.yandex.mobile.ads.impl.gt0
 *  com.yandex.mobile.ads.impl.hs
 *  com.yandex.mobile.ads.impl.j73
 *  com.yandex.mobile.ads.impl.z5
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.impl.a6;
import com.yandex.mobile.ads.impl.ct;
import com.yandex.mobile.ads.impl.ct0;
import com.yandex.mobile.ads.impl.gn2;
import com.yandex.mobile.ads.impl.gt0;
import com.yandex.mobile.ads.impl.hs;
import com.yandex.mobile.ads.impl.j73;
import com.yandex.mobile.ads.impl.qp0;
import com.yandex.mobile.ads.impl.vm1;
import com.yandex.mobile.ads.impl.z5;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class wp0
implements ct {
    @NotNull
    private final qp0 a;
    @NotNull
    private final vm1 b;
    @NotNull
    private final gt0 c;
    @NotNull
    private final ct0 d;
    @NotNull
    private final AtomicBoolean e;

    public wp0(@NotNull qp0 qp02, @NotNull vm1 vm12, @NotNull gt0 gt02, @NotNull ct0 ct02) {
        this.a = qp02;
        this.b = vm12;
        this.c = gt02;
        this.d = ct02;
        this.e = new AtomicBoolean(false);
        qp02.a(vm12);
    }

    private static final void a(wp0 wp02, Activity object) {
        if (!wp02.e.getAndSet(true)) {
            if ((object = u.e(wp02.a.a((Activity)object))) != null) {
                wp02.b.a(new z5(String.valueOf(((Throwable)object).getMessage())));
            }
        } else {
            wp02.b.a(a6.b());
        }
    }

    public static /* synthetic */ void b(wp0 wp02, Activity activity) {
        wp0.a(wp02, activity);
    }

    public final void a(@Nullable gn2 gn22) {
        this.c.a();
        this.b.a(gn22);
    }

    @NotNull
    public final hs getInfo() {
        return this.a.n();
    }

    public final void show(@NotNull Activity activity) {
        this.c.a();
        this.d.a((Runnable)new j73(this, activity));
    }
}

