/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.impl.re;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;
import org.jetbrains.annotations.NotNull;

public final class a8
implements AskForPermissionStrategyModuleProvider {
    public final re a = new re();

    @Override
    @NotNull
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.a;
    }
}

