/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.n50
 *  com.yandex.mobile.ads.impl.op0
 *  kotlin.coroutines.g$b
 *  kotlin.jvm.functions.p
 *  kotlinx.coroutines.n0
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n50;
import com.yandex.mobile.ads.impl.op0;
import kotlin.coroutines.g;
import kotlin.jvm.functions.p;
import kotlin.k0;
import kotlin.u;
import kotlin.v;
import kotlinx.coroutines.n0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class iu
implements n0 {
    @NotNull
    private final n50 b;

    public iu(@NotNull n50 n502) {
        this.b = n502;
    }

    public final <R> R fold(R r12, @NotNull p<? super R, ? super g.b, ? extends R> p14) {
        return n0.a.a(this, r12, p14);
    }

    @Nullable
    public final <E extends g.b> E get(@NotNull g.c<E> c10) {
        return n0.a.b(this, c10);
    }

    @NotNull
    public final g.c<?> getKey() {
        return n0.B8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void handleException(@NotNull g object, @NotNull Throwable throwable) {
        Throwable throwable22;
        block3: {
            block2: {
                try {
                    object = u.d;
                    String string2 = throwable.getMessage();
                    object = string2;
                    if (string2 != null) break block2;
                    object = "Unknown";
                }
                catch (Throwable throwable22) {
                    break block3;
                }
            }
            int n10 = op0.b;
            this.b.reportError((String)object, throwable);
            u.b(k0.a);
            return;
        }
        object = u.d;
        u.b(v.a(throwable22));
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

