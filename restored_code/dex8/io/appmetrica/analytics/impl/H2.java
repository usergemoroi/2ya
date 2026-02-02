/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.MainThread
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.MainThread;
import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import io.appmetrica.analytics.impl.i2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class h2
implements AppSetIdListener {
    public final i2 a;

    public h2(i2 i23) {
        this.a = i23;
    }

    @Override
    @MainThread
    public final void onAppSetIdRetrieved(@Nullable String string2, @NotNull AppSetIdScope appSetIdScope) {
        this.a.c = new AppSetId(string2, appSetIdScope);
        this.a.d.countDown();
    }

    @Override
    @MainThread
    public final void onFailure(@Nullable Throwable throwable) {
        this.a.d.countDown();
    }
}

