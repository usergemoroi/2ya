/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.impl.In;
import io.appmetrica.analytics.impl.e0;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class d0
implements In {
    public final e0 a;

    public d0(e0 e03) {
        this.a = e03;
    }

    @Override
    @NotNull
    public final Thread a() {
        return this.a.b;
    }

    @Override
    @Nullable
    public final StackTraceElement[] b() {
        e0 e03 = this.a;
        return (StackTraceElement[])e03.a.get(e03.b);
    }

    @Override
    @NotNull
    public final Map<Thread, StackTraceElement[]> c() {
        return this.a.a;
    }
}

