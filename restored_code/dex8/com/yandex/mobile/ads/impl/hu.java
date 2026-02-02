/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.op0
 *  kotlin.coroutines.g$b
 *  kotlin.jvm.functions.p
 *  kotlinx.coroutines.n0
 *  kotlinx.coroutines.n0$b
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.op0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class hu
implements n0 {
    @NotNull
    private final n0.b b = n0.B8;

    public final <R> R fold(R r12, @NotNull p<? super R, ? super g.b, ? extends R> p14) {
        return n0.a.a(this, r12, p14);
    }

    @Nullable
    public final <E extends g.b> E get(@NotNull g.c<E> c10) {
        return n0.a.b(this, c10);
    }

    @NotNull
    public final g.c<?> getKey() {
        return this.b;
    }

    public final void handleException(@NotNull g g10, @NotNull Throwable throwable) {
        throwable.getMessage();
        int n10 = op0.b;
    }

    @NotNull
    public final g minusKey(@NotNull g.c<?> c10) {
        return n0.a.c(this, c10);
    }

    @NotNull
    public final g plus(@NotNull g g10) {
        return n0.a.d(this, g10);
    }
}

