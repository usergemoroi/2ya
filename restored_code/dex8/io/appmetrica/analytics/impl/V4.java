/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;
import org.jetbrains.annotations.NotNull;

public final class v4
implements ModuleServiceConfig {
    public final SdkIdentifiers a;
    public final Object b;

    public v4(@NotNull SdkIdentifiers sdkIdentifiers, Object object) {
        this.a = sdkIdentifiers;
        this.b = object;
    }

    public final Object getFeaturesConfig() {
        return this.b;
    }

    @Override
    @NotNull
    public final SdkIdentifiers getIdentifiers() {
        return this.a;
    }
}

