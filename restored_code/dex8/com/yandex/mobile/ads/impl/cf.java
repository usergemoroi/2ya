/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.mobile.ads.impl.op0
 *  com.yandex.mobile.ads.impl.sp1
 */
package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.op0;
import com.yandex.mobile.ads.impl.sp1;
import com.yandex.mobile.ads.impl.wp1;
import io.appmetrica.analytics.IReporter;
import java.util.Map;
import kotlin.m;
import org.jetbrains.annotations.NotNull;

public final class cf
implements wp1 {
    @NotNull
    private final m a;

    public cf(@NotNull m<? extends IReporter> m11) {
        this.a = m11;
    }

    @Override
    public final void a(@NotNull sp1 sp12) {
        try {
            ((IReporter)this.a.getValue()).reportEvent(sp12.c(), sp12.b());
        }
        catch (Throwable throwable) {
            int n10 = op0.b;
        }
    }

    @Override
    public final void reportAnr(@NotNull Map<Thread, StackTraceElement[]> map2) {
        try {
            ((IReporter)this.a.getValue()).reportAnr(map2);
        }
        catch (Throwable throwable) {
            int n10 = op0.b;
        }
    }

    public final void reportError(@NotNull String string2, @NotNull Throwable throwable) {
        try {
            ((IReporter)this.a.getValue()).reportError(string2, throwable);
        }
        catch (Throwable throwable2) {
            int n10 = op0.b;
        }
    }

    @Override
    public final void reportUnhandledException(@NotNull Throwable throwable) {
        try {
            ((IReporter)this.a.getValue()).reportUnhandledException(throwable);
        }
        catch (Throwable throwable2) {
            int n10 = op0.b;
        }
    }
}

