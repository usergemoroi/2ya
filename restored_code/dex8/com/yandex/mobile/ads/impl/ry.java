/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.mobile.ads.impl.b8
 *  com.yandex.mobile.ads.impl.i42
 *  com.yandex.mobile.ads.impl.i50
 *  com.yandex.mobile.ads.impl.p1
 *  com.yandex.mobile.ads.impl.x2
 *  com.yandex.mobile.ads.impl.xp1
 */
package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.b8;
import com.yandex.mobile.ads.impl.g8;
import com.yandex.mobile.ads.impl.i42;
import com.yandex.mobile.ads.impl.i50;
import com.yandex.mobile.ads.impl.p1;
import com.yandex.mobile.ads.impl.x2;
import com.yandex.mobile.ads.impl.xp1;
import java.lang.ref.WeakReference;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.y;
import org.jetbrains.annotations.NotNull;

public final class ry
implements i42 {
    @NotNull
    private final x2 a;
    @NotNull
    private final b8<?> b;
    @NotNull
    private final g8 c;
    @NotNull
    private final p1 d;
    @NotNull
    private final i50 e;
    @NotNull
    private final WeakReference<Context> f;

    @JvmOverloads
    public ry(@NotNull Context context, @NotNull p1 p14, @NotNull b8 b82, @NotNull g8 g84, @NotNull i50 i502, @NotNull x2 x22) {
        this.a = x22;
        this.b = b82;
        this.c = g84;
        this.d = p14;
        this.e = i502;
        this.f = new WeakReference<Context>(context);
    }

    public final void a(@NotNull xp1 xp12, @NotNull String string2) {
        this.e.c().getClass();
        boolean bl2 = y.e(null, Boolean.TRUE) || this.b.H();
        this.d.a((Context)this.f.get(), this.a, this.b, xp12, string2, this.c, bl2);
    }
}

