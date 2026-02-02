/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.locationapi.internal.LocationProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface nc
extends LocationProvider {
    public void a(@Nullable Location var1);

    public void a(@NotNull Object var1);

    public void a(boolean var1);

    public void b(@NotNull Object var1);

    public void init();
}

