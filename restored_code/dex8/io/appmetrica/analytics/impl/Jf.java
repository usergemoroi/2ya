/*
 * Decompiled with CFR 0.152.
 */
package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class jf
implements IPluginReporter {
    @Override
    public final void reportError(@NotNull PluginErrorDetails pluginErrorDetails, @Nullable String string2) {
    }

    @Override
    public final void reportError(@NotNull String string2, @Nullable String string3, @Nullable PluginErrorDetails pluginErrorDetails) {
    }

    @Override
    public final void reportUnhandledException(@NotNull PluginErrorDetails pluginErrorDetails) {
    }
}

