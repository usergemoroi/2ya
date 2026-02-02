/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.gv1
 *  com.yandex.mobile.ads.impl.i42
 *  com.yandex.mobile.ads.impl.i50
 *  com.yandex.mobile.ads.impl.i50$a
 *  com.yandex.mobile.ads.impl.p1
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xp1
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.g8;
import com.yandex.mobile.ads.impl.gv1;
import com.yandex.mobile.ads.impl.i42;
import com.yandex.mobile.ads.impl.i50;
import com.yandex.mobile.ads.impl.p1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xp1;
import java.lang.ref.WeakReference;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class q1
implements i42 {
    @NotNull
    private final b8<String> a;
    @NotNull
    private final x2 b;
    @NotNull
    private final g8 c;
    @NotNull
    private final p1 d;
    @NotNull
    private final i50 e;
    @NotNull
    private final WeakReference<Context> f;

    public /* synthetic */ q1(Context context, b8 b82, g8 g84, gv1 gv12, x2 x22) {
        gv12 = new p1(gv12);
        int n10 = i50.e;
        this(context, (p1)gv12, b82, g84, i50.a.a((Context)context), x22);
    }

    @JvmOverloads
    public q1(@NotNull Context context, @NotNull p1 p14, @NotNull b8 b82, @NotNull g8 g84, @NotNull i50 i502, @NotNull x2 x22) {
        this.a = b82;
        this.b = x22;
        this.c = g84;
        this.d = p14;
        this.e = i502;
        this.f = new WeakReference<Context>(context);
    }

    public final void a(@NotNull xp1 xp12, @NotNull String string2) {
        this.e.c().getClass();
        boolean bl2 = y.e(null, Boolean.TRUE) || this.a.H();
        this.d.a((Context)this.f.get(), this.b, this.a, xp12, string2, this.c, bl2);
    }
}

