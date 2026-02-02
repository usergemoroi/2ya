/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.impl.A4;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientExecutorProvider;
import org.jetbrains.annotations.NotNull;

public final class qd
implements ModuleClientExecutorProvider {
    @Override
    @NotNull
    public final IHandlerExecutor getDefaultExecutor() {
        return A4.l().c.a();
    }
}

