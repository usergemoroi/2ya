/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b72$a
 *  com.yandex.mobile.ads.impl.c0
 *  com.yandex.mobile.ads.impl.ga
 *  com.yandex.mobile.ads.impl.lo1
 *  com.yandex.mobile.ads.impl.n0
 *  kotlin.reflect.KProperty
 */
package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import com.yandex.mobile.ads.impl.b72;
import com.yandex.mobile.ads.impl.b91;
import com.yandex.mobile.ads.impl.c0;
import com.yandex.mobile.ads.impl.ga;
import com.yandex.mobile.ads.impl.ko1;
import com.yandex.mobile.ads.impl.lo1;
import com.yandex.mobile.ads.impl.n0;
import kotlin.jvm.internal.y;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

public final class c72
implements n0 {
    static final KProperty<Object>[] d = new KProperty[]{ga.a(c72.class, (String)"contextReference", (String)"getContextReference()Landroid/content/Context;", (int)0)};
    @NotNull
    private final b72.a a;
    @NotNull
    private final c0 b;
    @NotNull
    private final ko1 c;

    public c72(@NotNull Activity activity, @NotNull b91 b912, @NotNull c0 c04) {
        this.a = b912;
        this.b = c04;
        this.c = lo1.a((Object)activity);
    }

    public final void a(@NotNull Activity activity) {
        Context context = (Context)this.c.getValue(this, d[0]);
        if (context != null && y.e(context, activity)) {
            this.a.b();
        }
    }

    public final void a(@NotNull Context context) {
        this.b.a(context, (n0)this);
    }

    public final void b(@NotNull Activity activity) {
        Context context = (Context)this.c.getValue(this, d[0]);
        if (context != null && y.e(context, activity)) {
            this.a.a();
        }
    }

    public final void c(@NotNull Activity activity) {
        this.b.b((Context)activity, (n0)this);
    }
}

