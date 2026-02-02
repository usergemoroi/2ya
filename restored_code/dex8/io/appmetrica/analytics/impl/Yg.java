/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.WorkerThread
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.impl.Ag;
import io.appmetrica.analytics.impl.Jg;
import io.appmetrica.analytics.impl.Og;
import io.appmetrica.analytics.impl.sg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class yg
implements Og {
    public final Ag a;

    public yg(Ag ag2) {
        this.a = ag2;
    }

    @Override
    @WorkerThread
    public final void a(@Nullable Jg jg3) {
        Ag ag2 = this.a;
        Ag.a(ag2, jg3, (sg)ag2.e.getValue());
    }

    @Override
    @WorkerThread
    public final void a(@NotNull Throwable object) {
        object = this.a;
        Ag.a((Ag)object, null, (sg)((Ag)object).e.getValue());
    }
}

