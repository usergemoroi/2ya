/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.ar1$a
 *  com.yandex.mobile.ads.impl.ar1$b
 *  com.yandex.mobile.ads.impl.dj2
 *  com.yandex.mobile.ads.impl.gh0
 *  com.yandex.mobile.ads.impl.hf0
 *  com.yandex.mobile.ads.impl.iq1
 *  com.yandex.mobile.ads.impl.px1
 *  com.yandex.mobile.ads.impl.px1$a
 *  com.yandex.mobile.ads.impl.yp1
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ar1;
import com.yandex.mobile.ads.impl.dj2;
import com.yandex.mobile.ads.impl.e00;
import com.yandex.mobile.ads.impl.gh0;
import com.yandex.mobile.ads.impl.hf0;
import com.yandex.mobile.ads.impl.iq1;
import com.yandex.mobile.ads.impl.px1;
import com.yandex.mobile.ads.impl.yp1;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class ak<T>
extends yp1<T> {
    private static final int v = (int)TimeUnit.SECONDS.toMillis(10L);
    @NotNull
    private final Context s;
    @NotNull
    private final a<T> t;
    @Nullable
    private final iq1 u;

    public ak(@NotNull Context context, int n10, @NotNull String string2, @NotNull a<T> a12, @Nullable iq1 iq12) {
        super(n10, string2, a12);
        this.s = context;
        this.t = a12;
        this.u = iq12;
        this.q();
        this.a(new e00(1.0f, v, 0));
    }

    public /* synthetic */ ak(Context context, String string2, a a12) {
        this(context, 0, string2, a12, null);
    }

    protected final void a(T t11) {
        this.t.a(t11);
    }

    protected final void a(@NotNull Map<String, String> a12) {
        String string2 = hf0.c(a12, (gh0)gh0.b0);
        if (string2 != null) {
            a12 = px1.a;
            Context context = this.s;
            a12.getClass();
            px1.a.a((Context)context).a(string2);
        }
    }

    @NotNull
    protected dj2 b(@NotNull dj2 dj22) {
        return dj22;
    }

    public final void w() {
        iq1 iq12 = this.u;
        if (iq12 != null) {
            iq12.b();
        }
    }

    public static interface a<T>
    extends ar1.b<T>,
    ar1.a {
    }
}

