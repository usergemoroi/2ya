/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.LocationListener
 */
package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.location.impl.s;
import io.appmetrica.analytics.location.impl.u;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import org.jetbrains.annotations.NotNull;

public final class v
implements LastKnownLocationExtractorProvider {
    public final String a;
    public final s b;
    public final String c;

    public v(@NotNull String string2, @NotNull s s13, @NotNull String string3) {
        this.a = string2;
        this.b = s13;
        this.c = string3;
    }

    @NotNull
    public final u a(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return new u(context, this.b.a(permissionExtractor), locationListener, this.a);
    }

    @Override
    @NotNull
    public final String getIdentifier() {
        return this.c;
    }
}

