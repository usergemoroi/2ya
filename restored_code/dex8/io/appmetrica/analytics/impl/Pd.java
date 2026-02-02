/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 */
package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.control.Toggle;
import io.appmetrica.analytics.impl.Kd;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleLocationSourcesServiceController;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServicesDatabase;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface pd
extends Kd {
    @NotNull
    public List<ModuleServicesDatabase> b();

    @NotNull
    public /* synthetic */ Map c();

    @NotNull
    public /* synthetic */ Map d();

    @NotNull
    public List<Consumer<Location>> e();

    @Nullable
    public ModuleLocationSourcesServiceController f();

    @Nullable
    public Toggle g();

    @NotNull
    public /* synthetic */ List h();
}

