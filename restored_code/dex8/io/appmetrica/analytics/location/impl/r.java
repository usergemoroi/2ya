/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.LocationListener
 *  android.location.LocationManager
 *  android.os.Looper
 */
package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.location.impl.u;
import io.appmetrica.analytics.location.impl.w;
import io.appmetrica.analytics.location.impl.x;
import io.appmetrica.analytics.locationapi.internal.LocationReceiver;
import java.util.concurrent.TimeUnit;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

public final class r
extends u
implements LocationReceiver {
    public final Looper e;
    public final long f;

    public r(@NotNull Context context, @NotNull Looper looper, @NotNull PermissionResolutionStrategy permissionResolutionStrategy, @NotNull LocationListener locationListener) {
        super(context, permissionResolutionStrategy, locationListener, "passive");
        this.e = looper;
        this.f = TimeUnit.SECONDS.toMillis(1L);
    }

    public static final k0 a(r r14, LocationManager locationManager) {
        locationManager.requestLocationUpdates(r14.d, r14.f, 0.0f, r14.c, r14.e);
        return k0.a;
    }

    public static final k0 b(r r14, LocationManager locationManager) {
        locationManager.removeUpdates(r14.c);
        return k0.a;
    }

    @Override
    public final void startLocationUpdates() {
        if (this.b.hasNecessaryPermissions(this.a)) {
            Context context = this.a;
            StringBuilder stringBuilder = new StringBuilder("request location updates for ");
            stringBuilder.append(this.d);
            stringBuilder.append(" provider");
            SystemServiceUtils.accessSystemServiceByNameSafely(context, "location", stringBuilder.toString(), "location manager", new x(this));
        }
    }

    @Override
    public final void stopLocationUpdates() {
        SystemServiceUtils.accessSystemServiceByNameSafely(this.a, "location", "stop location updates for passive provider", "location manager", new w(this));
    }
}

