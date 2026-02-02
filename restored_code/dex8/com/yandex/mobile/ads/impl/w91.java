/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.j51
 *  com.yandex.mobile.ads.impl.j7
 *  com.yandex.mobile.ads.impl.op0
 *  kotlin.coroutines.g$b
 *  kotlin.jvm.functions.p
 *  kotlinx.coroutines.n0
 *  kotlinx.coroutines.n0$b
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.j51;
import com.yandex.mobile.ads.impl.j7;
import com.yandex.mobile.ads.impl.op0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class w91
implements n0 {
    @NotNull
    private final j51 b;
    @NotNull
    private final n0.b c;

    public w91(@NotNull j51 j512) {
        this.b = j512;
        this.c = n0.B8;
    }

    public final <R> R fold(R r14, @NotNull p<? super R, ? super g.b, ? extends R> p14) {
        return n0.a.a(this, r14, p14);
    }

    @Nullable
    public final <E extends g.b> E get(@NotNull g.c<E> c11) {
        return n0.a.b(this, c11);
    }

    @NotNull
    public final g.c<?> getKey() {
        return this.c;
    }

    public final void handleException(@NotNull g g11, @NotNull Throwable throwable) {
        throwable.getClass();
        int n10 = op0.b;
        this.b.a(j7.d());
    }

    @NotNull
    public final g minusKey(@NotNull g.c<?> c11) {
        return n0.a.c(this, c11);
    }

    @NotNull
    public final g plus(@NotNull g g11) {
        return n0.a.d(this, g11);
    }
}

