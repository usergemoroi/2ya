/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.impl.nc;
import io.appmetrica.analytics.modulesapi.internal.service.LocationServiceApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface kc
extends nc,
LocationServiceApi {
    @Override
    public /* synthetic */ void a(@Nullable Location var1);

    @Override
    public /* synthetic */ void a(@NotNull Object var1);

    @Override
    public /* synthetic */ void a(boolean var1);

    @Override
    public /* synthetic */ void b(@NotNull Object var1);

    @Override
    public /* synthetic */ void init();
}

