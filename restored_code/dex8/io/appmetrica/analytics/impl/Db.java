/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.rb;
import io.appmetrica.analytics.plugins.IPluginReporter;

public interface db
extends rb,
IPluginReporter {
    public void b(@NonNull String var1);

    public void b(@NonNull String var1, @Nullable String var2);

    public boolean b();
}

