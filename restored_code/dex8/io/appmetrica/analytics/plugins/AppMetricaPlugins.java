/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

public interface AppMetricaPlugins {
    public void reportError(@NonNull PluginErrorDetails var1, @Nullable String var2);

    public void reportError(@NonNull String var1, @Nullable String var2, @Nullable PluginErrorDetails var3);

    public void reportUnhandledException(@NonNull PluginErrorDetails var1);
}

